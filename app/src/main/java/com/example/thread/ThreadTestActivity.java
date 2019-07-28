package com.example.thread;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.hellojni.R;

public class ThreadTestActivity extends AppCompatActivity {

    private static final String TAG = "ThreadTestActivity";

    private Button buttonStartThread;
    private Handler mainHandler=new Handler();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_thread_layout);

        buttonStartThread = findViewById(R.id.button_thread_start);
    }


    public void startThread(View view) {
        ExampleRunnable exampleRunnable=new ExampleRunnable(10);
        new Thread(exampleRunnable).start();



//        ///多少个class 多少个线程
//        ExampleThread thread = new ExampleThread(10);
//        thread.start();


        //多次点击则throw exception
//        //计数器到10
//        for(int i=1;i<=10;i++){
//            Log.d(TAG, "startThread: "+i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

    class ExampleThread extends Thread {
        int seconds;

        ExampleThread(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public void run() {
            for (int i = 1; i <= seconds; i++) {
                Log.d(TAG, "startThread: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class ExampleRunnable implements Runnable {

        int seconds;

        ExampleRunnable(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public void run() {
            for (int i = 1; i <= seconds; i++) {
                if(i==5){
                    //在主线程修改UI
                    Handler handler=new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            buttonStartThread.setText("Hello  Thread 10%");
                        }
                    });
                }

                if(i==8){
                    //在主线程修改UI
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            buttonStartThread.setText("Hello  Thread 20%");
                        }
                    });
                }

                Log.d(TAG, "startThread: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
