package cute.uwu;

import java.util.Stack;

class LLVMGenerator{
   
    static String header_text = "";
    static String main_text = "";
    static int reg = 1;
    static int str = 1;
    static int br = 0;

    static Stack<Integer> brstack = new Stack<Integer>();

    static void icmp(String id, String value){
        main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
        reg++;
        main_text += "%"+reg+" = icmp eq i32 %"+(reg-1)+", "+value+"\n";
        reg++;
    }

    static void ifstart(){
        br++;
        main_text += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
        main_text += "true"+br+":\n";
        brstack.push(br);
    }

    static void ifend(){
        int b = brstack.pop();
        main_text += "br label %false"+b+"\n";
        main_text += "false"+b+":\n";
    }

    static void writef_i32(String id){ //done
       main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
       reg++;
       main_text += "%"+reg+" = call i32 (ptr, ...) @printf(ptr noundef getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
       reg++;
    }
 
    static void writef_double(String id){ //done
       main_text += "%"+reg+" = load double, double* %"+id+"\n";
       reg++;
       main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
       reg++;
    }

    static void writef_string(String id){ //done
        main_text += "%"+reg+" = load i8*, i8** %"+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %"+(reg-1)+")\n";
        reg++;
    }

    static void writef_bool(String id){
        main_text += "%" + reg + " = load i1, i1* %" + id + "\n";
        reg++;
        main_text += "%" + reg + " = zext i1 %" + (reg - 1) + " to i32\n";
        reg++;
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %" + (reg - 1) + ")\n";
        reg++;
    }
 
    static void declare_i32(String id){
       main_text += "%"+id+" = alloca i32\n";
    } //done
 
    static void declare_double(String id){
       main_text += "%"+id+" = alloca double\n";
    } //done

    static void declare_string(String id){
        main_text += "%"+id+" = alloca i8*\n";
    }

    static void declare_bool(String id){
        main_text += "%"+id+" = alloca i1\n";
    }

    static void allocate_string(String id, int l){
        main_text += "%"+id+" = alloca ["+(l+1)+" x i8]\n";
    }
 
    static void assign_i32(String id, String value){ //done
       main_text += "store i32 "+value+", i32* %"+id+"\n";
    }
 
    static void assign_double(String id, String value){ //done
       main_text += "store double "+value+", double* %"+id+"\n";
    } //done

    static void assign_string(String id){
        main_text += "store i8* %"+(reg-1)+", i8** %"+id+"\n";
    }

    static void assign_bool(String id, String value) {
        //String boolVal = value.equals("true") ? "1" : "0";
        main_text += "store i1 " + value + ", i1* %" + id + "\n";
    }
 
    static void load_i32(String id){
       main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
       reg++;
    }
 
    static void load_double(String id){
       main_text += "%"+reg+" = load double, double* %"+id+"\n";
       reg++;
    }

    static void load_string(String id){
        main_text += "%"+reg+" = load i8*, i8** %"+id+"\n";
        reg++;
    }

    static void load_bool(String id){
        main_text += "%"+reg+" = load i1, i1* %"+id+"\n";
        reg++;
    }

    static void sub_i32(String val1, String val2){ //done
        main_text += "%"+reg+" = sub i32 "+val2+", "+val1+"\n";
        reg++;
    }

    static void sub_double(String val1, String val2){ //done
        main_text += "%"+reg+" = fsub double "+val2+", "+val1+"\n";
        reg++;
    }
 
    static void add_i32(String val1, String val2){ //done
       main_text += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
       reg++;
    }
 
    static void add_double(String val1, String val2){ //done
       main_text += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
       reg++;
    }
 
    static void mult_i32(String val1, String val2){ //done
       main_text += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
       reg++;
    }
 
    static void mult_double(String val1, String val2){ //done
       main_text += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
       reg++;
    }

    static void div_i32(String val1, String val2){ //done
        main_text += "%"+reg+" = sdiv i32 "+val2+", "+val1+"\n";
        reg++;
    }

    static void div_double(String val1, String val2){ //done
        main_text += "%"+reg+" = fdiv double "+val2+", "+val1+"\n";
        reg++;
    }

    static void and_bool(String val1, String val2){ //done
        main_text += "%"+reg+" = and i1 "+val1+", "+val2+"\n";
        reg++;
    }

    static void or_bool(String val1, String val2){ //done
        main_text += "%"+reg+" = or i1 "+val1+", "+val2+"\n";
        reg++;
    }

    static void xor_bool(String val1, String val2){ //done
        main_text += "%"+reg+" = xor i1 "+val1+", "+val2+"\n";
        reg++;
    }

    static void neg_bool(String val){ //done
        main_text += "%"+reg+" = xor i1 1, "+val+"\n";
        reg++;
    }
 
    static void sitofp(String id){ //done
       main_text += "%"+reg+" = sitofp i32 "+id+" to double\n";
       reg++;
    }
 
    static void fptosi(String id){ //done
       main_text += "%"+reg+" = fptosi double "+id+" to i32\n";
       reg++;
    }

    static void scanf(String id, int l){
        allocate_string("str"+str, l);
        main_text += "%"+id+" = alloca i8*\n";
        main_text += "%"+reg+" = getelementptr inbounds ["+(l+1)+" x i8], ["+(l+1)+" x i8]* %str"+str+", i64 0, i64 0\n";
        reg++;
        main_text += "store i8* %"+(reg-1)+", i8** %"+id+"\n";
        str++;
        main_text += "%"+reg+" = call i32 (ptr, ...) @scanf(ptr noundef getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), ptr noundef %"+(reg-1)+")\n";
        reg++;
    }

    static void constant_string(String content){ //done
        int l = content.length()+1;
        header_text += "@str"+str+" = constant ["+l+" x i8] c\""+content+"\\00\"\n";
        String n = "str"+str;
        LLVMGenerator.allocate_string(n, (l-1));
//        main_text += "%"+reg+" = bitcast ["+l+" x i8]* %"+n+" to i8*\n";
//        main_text += "call void @llvm.memcpy.p0.p0.i64(ptr %"+reg+", ptr getelementptr inbounds (["+l+" x i8], ["+l+" x i8]* @"+n+", i32 0, i32 0), i64 "+l+", i1 false)\n";
//        reg++;
//        main_text += "%ptr"+n+" = alloca i8*\n";
        main_text += "%ptr"+n+" = bitcast ["+l+" x i8]* %"+n+" to i8*\n";
        main_text += "call void @llvm.memcpy.p0.p0.i64(ptr %ptr"+n+", ptr getelementptr inbounds (["+l+" x i8], ["+l+" x i8]* @"+n+", i32 0, i32 0), i64 "+l+", i1 false)\n";
        main_text += "%"+reg+" = getelementptr inbounds ["+l+" x i8], ["+l+" x i8]* %"+n+", i64 0, i64 0\n";
        reg++;
//        main_text += "store i8* %"+(reg-1)+", i8** %ptr"+n+"\n";
        str++;
    }

    static void cons_string(String id, String constant, int length){
        int l = length+1;

    }

    static void string_pointer(String id, int l){
        main_text += "%"+reg+" = getelementptr inbounds ["+(l+1)+" x i8], ["+(l+1)+" x i8]* %"+id+", i64 0, i64 0\n";
        reg++;
    }

    static void add_string(String id1, int l1, String id2, int l2){
        allocate_string("str"+str, l1+l2);
        main_text += "%ptrstr"+str+" = alloca i8*\n";
        main_text += "%"+reg+" = getelementptr inbounds ["+(l1+l2+1)+" x i8], ["+(l1+l2+1)+" x i8]* %str"+str+", i64 0, i64 0\n";
        reg++;
        main_text += "store i8* %"+(reg-1)+", i8** %ptrstr"+str+"\n";
        main_text += "%"+reg+" = load i8*, i8** %ptrstr"+str+"\n";
        reg++;
        main_text += "%"+reg+" = call i8* @strcpy(i8* %"+(reg-1)+", i8* %"+id2+")\n";
        reg++;
        main_text += "%"+reg+" = call i8* @strcat(i8* %"+(reg-2)+", i8* %"+id1+")\n";
        reg++;
        str++;
    }

    static void int_to_string(String in, int lout){
        allocate_string("str"+str, lout);
        main_text += "%ptrstr"+str+" = alloca i8*\n";
        main_text += "%"+reg+" = getelementptr inbounds ["+(lout+1)+" x i8], ["+(lout+1)+" x i8]* %str"+str+", i64 0, i64 0\n";
        reg++;
        main_text += "store i8* %"+(reg-1)+", i8** %ptrstr"+str+"\n";
        main_text += "%"+reg+" = load i8*, i8** %ptrstr"+str+"\n";
        reg++;
        str++;
        main_text += "%"+reg+" = call i32 (i8*, i8*, ...) @sprintf(i8* %"+(reg-1)+", i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 "+in+")\n";
        reg++;
    }


    static void string_to_int(String in){
        main_text += "%"+reg+" = call i32 @atoi(i8* "+in+")\n";
        reg++;
    }
 
 
    static String generate(){ //done
       String text = "";
       text += "declare i32 @printf(ptr noundef, ...)\n";
       text += "declare i32 @sprintf(i8*, i8*, ...)\n";
       text += "declare i8* @strcpy(i8*, i8*)\n";
       text += "declare i8* @strcat(i8*, i8*)\n";
       text += "declare i32 @atoi(i8*)\n";
       text += "declare i32 @scanf(ptr noundef, ...)\n";
       text += "declare void @llvm.memcpy.p0.p0.i64(ptr noalias nocapture writeonly, ptr noalias nocapture readonly, i64, i1 immarg)\n";
       text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
       text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
       text += "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n";
       text += "@strs = constant [3 x i8] c\"%s\\00\"\n";
//       text += "@strs2 = constant [8 x i8] c\"%s[^\\n]\\00\"\n";
       text += "@strspi = constant [3 x i8] c\"%d\\00\"\n";
       text += header_text;
       text += "define i32 @main() nounwind{\n";
       text += main_text;
       text += "ret i32 0 }\n";
       return text;
    }
 
 }