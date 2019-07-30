package com.example.oc;

import java.util.ArrayList;

/**
 * 形象的开闭原则
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
