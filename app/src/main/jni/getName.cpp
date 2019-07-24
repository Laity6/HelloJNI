//
// Created by xulin on 2019/7/24.
//


//引入头文件

#include <cstdlib>
#include <cstring>
#include "com_example_hellojni_JniUtils.h"


char * cat(char * str1, char * str2)
{
    int len1, len2;
    char * p;

    len1 = strlen(str1);
    len2 = strlen(str2);
    char * str = (char *) malloc((len1+len2+1)*sizeof(*str));
    strcpy(str, str1);
    p = str + strlen(str1);
    strcpy(p, str2);
    return str;
}

JNIEXPORT jstring JNICALL Java_com_example_hellojni_JniUtils_getName
        (JNIEnv *env, jobject obj, jstring stra) {
//如果是用C语言格式就用这种方式
//  return (*env)->NewStringUTF(env,"Kiss dream");


    char* str;   str = const_cast<char *>(env->GetStringUTFChars(stra, JNI_FALSE));

    char *firstName = "Theo";
    char *lastName = "Tsao";
    char *name = (char *) malloc(strlen(firstName) + strlen(lastName));
    sprintf(name, "%s%s", firstName, lastName);
    printf("%s\n", name);
   // return 0;

   return env->NewStringUTF(cat("Hello_",str));
//return env->NewStringUTF((char *)"Kiss dream");



}