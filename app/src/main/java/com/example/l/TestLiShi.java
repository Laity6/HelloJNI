package com.example.l;

import java.util.ArrayList;
import java.util.List;

/**
 * 里氏替换原则，OCP作为OO的高层原则，主张使用“抽象(Abstraction)”和“多态(Polymorphism)”
 * 将设计中的静态结构改为动态结构，维持设计的封闭性。
 * “抽象”是语言提供的功能。“多态”由继承语义实现
 */
public class TestLiShi {
    public static void main(String[] args) {
        String[] datas = {"1", "2", "3"};

        System.out.println(getDatas(datas).toString());

    }

    public static List<String> getDatas(String[] str) {
        //List 用来替换 ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String s : str) {
            arrayList.add(s);
        }
        return arrayList;
    }
}
