package com.example.bhavya.fishtry1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import pl.droidsonroids.gif.GifTextView;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

public class fragment1 extends Fragment {

    GifTextView fireworks ;
       MainActivity act;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view =  inflater.inflate(R.layout.fragment_fragment1, container,false);
        fireworks = (GifTextView) view.findViewById(R.id.fireworks1);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 2000ms
                fireworks.animate().alpha(0f);
                calling();
            }
        }, 2000);
        return view;
    }

    public void calling()
    {
        act.makingvisible();

    }
}
