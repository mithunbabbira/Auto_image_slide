package com.example.auto_image_slide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {


    ViewFlipper viewFlipper;
    int[] images={

            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper= findViewById(R.id.v_flipper);


        for(int i=0; i <images.length;i++){
            flip_image(images[i]);
        }


    }

    private void flip_image(int i) {
        ImageView view = new ImageView(this);
        view.setImageResource(i);
        viewFlipper.addView(view);
        viewFlipper.setFlipInterval(900);
        viewFlipper.setAutoStart(true);


        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setInAnimation(this,android.R.anim.slide_out_right);
    }
}
