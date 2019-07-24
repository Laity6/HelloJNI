//
// Created by xulin on 2019/7/24.
//

#include "com_example_hellojni_JniUtils.h"
JNIEXPORT jstring JNICALL Java_com_example_hellojni_JniUtils_getName
    (JNIEnv * env, jobject obj){
//如果是用C语言格式就用这种方式
//  return (*env)->NewStringUTF(env,"Kiss dream");
  //如果是用C语言格式就用这种方式
return env->NewStringUTF((char *)"Kiss dream");
}