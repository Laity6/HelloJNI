package com.example.Principle5.i;

/**
 * 接口隔离原则
 * 一个接口代表一个角色，不应当将不同的角色都交给一个接口。
 */
public class TestJiekou implements OnClickListener,OnTouchListener{
    public static void main(String[] args) {


    }

    @Override
    public void onClick() {

    }

    @Override
    public void onTouch() {

    }
}

//接口隔离原则
//
interface OnClickListener {
    void onClick();

    //这个方法就要新建OnTouchListener
    // void onTouch();
}

//接口已隔离
interface OnTouchListener {
    void onTouch();
}