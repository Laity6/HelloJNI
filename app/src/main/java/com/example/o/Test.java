package com.example.o;

import java.util.ArrayList;

/**
 * 开闭原则规定“软件中的对象（类，模块，函数等等）应该对于扩展是开放
 * 的，但是对于修改是封闭的”，这意味着一个实体是允许在不改变它的源代
 * 码的前提下变更它的行为。
 */
public class Test {

    public static void main(String []args){

        ArrayList<Shape> list=new ArrayList<Shape>();

        Shape circleShap= new Shape() {
            @Override
            public double getArea() {
                Circle circle=new Circle();
                circle.setRadius(2);
                circle.getArea();
                return circle.getArea();
            }
        };
        list.add(circleShap);

        Shape rectangleShap= new Shape() {
            @Override
            public double getArea() {
                Rectangle rectangle=new Rectangle();
                rectangle.setHeight(20);
                rectangle.setLength(15);
                return rectangle.getArea();
            }
        };

        list.add(rectangleShap);
        new AreaManager().calculateArea(list);

    }

    //扩展时不需要后期修改
    static class AreaManager{
        public  double calculateArea(ArrayList<Shape> shapes) {
            double area = 0;
            for (Shape shape : shapes) {
                System.out.println(""+shape.getArea());
                area += shape.getArea();

            }
            return area;
        }
    }

}
