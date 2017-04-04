    package com.example.threadex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

import java.util.logging.LogRecord;
import android.os.Handler;
import android.widget.Toast;

import static com.example.threadex.R.id.edittext;

    public class MainActivity extends AppCompatActivity {
        EditText editText;
        ImageView imageview2;
        ImageView imageview1;

        Handler handler = new Handler();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview1 =(ImageView) findViewById(R.id.img1);
         imageview2 =(ImageView) findViewById(R.id.img2);
         editText =(EditText) findViewById(edittext);

    }

    public void button1Clicked(View view){
        DogThread thread1 = new DogThread(0);
        thread1.start();

        DogThread thread2 = new DogThread(1);
        thread2.start();

    }

    public void button2Clicked(View view){
       Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        imageview1.startAnimation(anim);
        Toast.makeText(getApplicationContext(),"애니메이션 시작됨",Toast.LENGTH_LONG).show();
    }

    class DogThread extends Thread {
        int dogindex;
        int stateIndex;
        ArrayList<Integer> images = new ArrayList<Integer>();

        public DogThread(int index){
            dogindex = index;
            images.add(R.drawable.dog_standing);
            images.add(R.drawable.dog_running);
            images.add(R.drawable.dog_biting);

        }
        public void run(){
            stateIndex = 0;//


            for(int i =0  ; i<9; i++){//2
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        String mag = "Dog # " + dogindex + " State " + stateIndex;
                        editText.append(mag + "\n");


                        if(dogindex ==0){
                            imageview1.setImageResource(images.get(stateIndex));
                        } else if(dogindex == 1){
                            imageview2.setImageResource(images.get(stateIndex));
                        }

                    }
                });


                try {
                    int sleeptime = getRandomTime(500,3000);
                    Thread.sleep(1000);
                } catch (Exception e) {}

                stateIndex++;
                if(stateIndex >= images.size()){
                    stateIndex = 0;
                }

            }

        }
    }
    public int getRandomTime(int min, int max){
        return min+(int)(Math.random()*(max - min));
    }

}
