package com.example.Principle5.d;

public class BmwCar implements ICar {
    public void Run() {
        System.out.println("宝马开始启动了");
    }

    public void Turn() {
        System.out.println("宝马开始转弯了");
    }

    public void Stop() {
        System.out.println("宝马开始停车了");
    }
}