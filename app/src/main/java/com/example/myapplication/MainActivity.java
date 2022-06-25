package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int Counter = 0;
    public TextView txv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toastclick(View view) {

        String msg = "Hello Toast";
        Toast toast_show = Toast.makeText(this,msg,1000);
        toast_show.show();
        Counter=0;
        txv.setText(Integer.toString(Counter));


    }

    public void countclick(View view) {


        Counter++;
        txv = (TextView) findViewById(R.id.showcounter);
        txv.setText(Integer.toString(Counter));

    }
}