package com.example.bhavya.fishtry1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Winningmessage extends Fragment  {


    Button b1,b2;
    MainActivity mainActivity;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.winning,container,false);
        b1= (Button) v.findViewById(R.id.PlayAgain);
        b2= (Button) v.findViewById(R.id.exit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Log.d("hey","-----------------------");
                mainActivity.play();
               
            }
        });


        return v;
    }
}
