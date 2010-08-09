#include <string.h>
#include <nullvm.h>

jobject* j_ldc_string_asciiz(char* s) {
    jclass* String = nvmGetClass("java/lang/String", "java_lang_String", NULL);
    jmethod* method = nvmGetMethod(String, "ldcAscii", "(Ljava/lang/Object;I)Ljava/lang/String;", NULL);
    jobject* (*f)(char* cptr, jint length) = method->impl;
    // TODO: Get length as argument
    return f(s, strlen(s));
}

jobject* j_ldc_string_utf8z(char* s) {
    return NULL;
}

//jobject* j_get_string_utf16z(char* s) {
//    return NULL;
//}

