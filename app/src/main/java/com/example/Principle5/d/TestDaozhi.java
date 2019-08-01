package com.example.Principle5.d;

/**
 * 依赖倒置原则
 * 依赖倒置原则（Dependence Inversion Principle）是程序要依赖于抽象接口，不要依赖于具体实现。
 */
public class TestDaozhi {
    public static void main(String[] args) {
        ICar car = new FordCar();
        //这里就是通过抽象接口
        AutoSystem autoSystem = new AutoSystem(car);
        autoSystem.RunCar();
    }
}
