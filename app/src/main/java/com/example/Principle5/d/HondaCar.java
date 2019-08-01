package com.example.Principle5.d;

public class HondaCar implements ICar {
    public void Run() {
        System.out.println("本田开始启动了");
    }

    public void Turn() {
        System.out.println("本田开始转弯了");
    }

    public void Stop() {
        System.out.println("本田开始停车了");
    }
}