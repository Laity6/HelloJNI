package com.example.hellojni;

public class JniUtils {
    static {
        //名字注意，需要跟你的build.gradle ndk节点下面的名字一样
        System.loadLibrary("NameProvider");
    }
    native static String getName(String name);


}
