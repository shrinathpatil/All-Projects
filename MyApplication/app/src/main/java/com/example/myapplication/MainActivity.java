package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    TextView textview2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=findViewById(R.id.textView);
        textview2=findViewById(R.id.textView2);
        btn=findViewById(R.id.button);
        btn.setText("Show");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textview.getText()==""){
                    textview.setText("You Clicked this Button");
                    btn.setText("Hide");
                }
                else{
                    textview.setText("");
                    btn.setText("Show");
                }

                Toast.makeText(MainActivity.this, "Don't Click the Button", Toast.LENGTH_SHORT).show();

            }
        });


    }
}