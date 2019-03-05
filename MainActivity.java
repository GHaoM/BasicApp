package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int likeOrDislike=0;
    /**
     *Set up the variable outside the main part.
     */
    
    public void lIke(View view) {
        likeOrDislike++;
        display(likeOrDislike);
    }
    public void disLike(View view){
        likeOrDislike--;
        display(likeOrDislike);
    }

    /**
     * This method displays the given value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}
