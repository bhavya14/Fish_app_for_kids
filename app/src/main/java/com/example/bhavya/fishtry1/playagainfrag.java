package com.example.bhavya.fishtry1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class playagainfrag extends Fragment {


    public  MainActivity p;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            final Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_playagainfrag, container, false);

        Button playAgain = (Button) view.findViewById(R.id.button2);
        Button exit = (Button)view.findViewById(R.id.button3);
        playAgain.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {


                        p.count=0;
                    }
                }
        );
          exit.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        p.finish();
                    }
                }
        );
        return view;
    }
}
