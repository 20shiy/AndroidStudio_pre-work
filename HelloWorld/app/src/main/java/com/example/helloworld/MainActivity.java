package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //user can change the text color when clicking on the button
        findViewById(R.id.textColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.purple_500));
            }
        });
        //change background color by clicking on the respective button
        findViewById(R.id.backgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //#C5E99B light green
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightGreen));
            }
        });
        //change text content by clicking on the button
        findViewById(R.id.textButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        //change everything to default when clicking on the background
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text color back to original
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.darkGreen));
                //background color to original
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.whiteGreen));
                //text content to original
                ((TextView) findViewById(R.id.text)).setText("Hello from Shiying!");

            }
        });

        findViewById(R.id.customTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (userEnteredText.isEmpty()) {
                    ((TextView) findViewById(R.id.text)).setText("please enter your own text!");
                } else {
                    ((TextView) findViewById(R.id.text)).setText(userEnteredText);
                }

            }
        });
    }
}