package com.example.Principle5.d;

public class FordCar implements ICar {
    public void Run() {
        System.out.println("福特开始启动了");
    }

    public void Turn() {
        System.out.println("福特开始转弯了");
    }

    public void Stop() {
        System.out.println("福特开始停车了");
    }
}