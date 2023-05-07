package com.example.pract2_3;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

/*
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        EditText text = (EditText)findViewById(R.id.login_text);

        TextView loadText = (TextView)findViewById(R.id.login_text);
        loadText.setText(R.string.hello_world);

        ImageView loadPicture = (ImageView)findViewById(R.id.imageview);
        loadPicture.setImageResource(R.drawable.apteka2);

        //Программный способ
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","Log by press");
            }
            //Декларативный способ
            public void onClickLog(View view)
            {
                Log.i("MainActivity", "Button work");
            }
        });
    }
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                intent.putExtra("id", "patient id");
                startActivity(intent);
            }
        });
    }
}