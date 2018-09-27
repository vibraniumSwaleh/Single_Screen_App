package com.example.android.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeOrder (View view) {
        /**
         * Displays the score in a toast.
         */
        Toast.makeText(this, "                      Thank you! \n" + "Your order will be processed shortly!" , Toast.LENGTH_LONG).show();
    }
}
