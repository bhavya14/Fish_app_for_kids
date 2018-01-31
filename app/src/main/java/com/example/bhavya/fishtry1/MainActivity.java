package com.example.bhavya.fishtry1;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import pl.droidsonroids.gif.GifTextView;


public class MainActivity extends AppCompatActivity {

    int count ;
    fragment1 fragment;
     GifTextView fish ;
     GifTextView fish2;
     GifTextView fish3;
  //  playagainfrag frag;
    Winningmessage frag;
    RelativeLayout relativeLayout;
    int test=0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        if(test==0)
        {super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);}
        count=0;
        frag= (Winningmessage) getSupportFragmentManager().findFragmentById(R.id.fragment);
        frag.getView().setVisibility(View.GONE);
        relativeLayout= (RelativeLayout) findViewById(R.id.content_main);
        frag.mainActivity=MainActivity.this;
        final TextView text = (TextView) findViewById(R.id.text);
        text.setText("score : " + count);
        fish = (GifTextView) findViewById(R.id.fish);
        fish2 = (GifTextView) findViewById(R.id.fish2);
        fish3 = (GifTextView) findViewById(R.id.fish3);
        final Handler handler = new Handler();
        final Handler handler2 = new Handler();
        final Runnable run = new Runnable(){
            @Override
            public void run() {

                fish.setTranslationX(-500f);fish.animate().alpha(1f);
                fish.animate().translationXBy(1800f).setDuration(5000);
                handler.postDelayed(this,5000);

            }
        };
        final Runnable run2 = new Runnable(){
            @Override
            public void run() {

                fish2.setTranslationX(-1400f);
                fish2.animate().alpha(1f);
                fish2.animate().translationXBy(2000f).setDuration(5000);
                handler.postDelayed(this,5000);

            }
        };
        final Runnable run3 = new Runnable(){
            @Override
            public void run() {

                fish3.setTranslationX(-550f);fish3.animate().alpha(1f);
                fish3.animate().translationXBy(2700f).setDuration(6000);
                handler.postDelayed(this,5000);

            }
        };


        {
             handler.post(run);
            handler.post(run2);
            handler.post(run3);
            fish.setOnClickListener(
                    new ImageView.OnClickListener() {
                        public void onClick(View v) {

                            handler.removeCallbacks(run);
                            fish.animate().alpha(0f);
                            fish.animate().translationYBy(100f);
                            count++;
                            calling();
                            handler2.post(run);
                            text.setText("score : " + count);
                          //  handler.postDelayed(run,5*1000);

                        }
                    }
            );

            fish2.setOnClickListener(
                    new ImageView.OnClickListener() {
                        public void onClick(View v) {

                            handler.removeCallbacks(run2);
                            fish2.animate().alpha(0f);
                            //fish2.animate().translationYBy(100f);
                            count++;
                            calling();
                            handler2.post(run2);
                            text.setText("score : " + count);

                        }
                    }
            );

            fish3.setOnClickListener(
                    new ImageView.OnClickListener() {
                        public void onClick(View v) {
                            handler.removeCallbacks(run3);
                            fish3.animate().alpha(0f);
                            //fish3.animate().translationYBy(100f);
                            count++;
                            calling();
                            handler2.post(run3);
                            text.setText("score : " + count);
                        }
                    }
            );



        }

    }

    public void calling() {
        if(count>=1) {

            relativeLayout.setBackgroundColor(Color.BLACK);
            frag.getView().setVisibility(View.VISIBLE);
        }
    }

    void play(){
        test++;
        onCreate(null);
        frag.getView().setVisibility(View.GONE);
        relativeLayout.setBackgroundResource(R.drawable.aq1);
    }

    void makingvisible()
    {
        frag.getView().setVisibility(View.VISIBLE);
    }

}

