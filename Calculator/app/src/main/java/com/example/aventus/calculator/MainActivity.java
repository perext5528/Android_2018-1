package com.example.aventus.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {
    private EditText inpnum1;
    private EditText inpnum2;
    private EditText result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inpnum1 = (EditText)findViewById(R.id.inpnum1);
        inpnum2 = (EditText)findViewById(R.id.inpnum2);
        result = (EditText)findViewById(R.id.result);







        View.OnClickListener clickListener = new View.OnClickListener(){
            String num1 = inpnum1.getText().toString();
            String num2 = inpnum2.getText().toString();
            int resultnum;


/*
            public void add(View target){
                String num1 = inpnum1.getText().toString();
                String num2 = inpnum2.getText().toString();
                int resultnum = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(resultnum);
            }
            public void sub(View target){
                String num1 = inpnum1.getText().toString();
                String num2 = inpnum2.getText().toString();
                int resultnum = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(resultnum);
            }
            public void mul(View target){
                String num1 = inpnum1.getText().toString();
                String num2 = inpnum2.getText().toString();
                int resultnum = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText(resultnum);
            }
            public void div(View target){
                String num1 = inpnum1.getText().toString();
                String num2 = inpnum2.getText().toString();
                int resultnum = Integer.parseInt(num1) / Integer.parseInt(num2);
                result.setText(resultnum);
            }
*/
            @Override
            public void onClick(View v) {

                switch (v.getId()){
                    case R.id.button1:
                        resultnum = Integer.parseInt(num1) + Integer.parseInt(num2);
                        result.setText(resultnum);
                        break;
                    case R.id.button2:
                        resultnum = Integer.parseInt(num1) + Integer.parseInt(num2);
                        result.setText(resultnum);
                        break;
                    case R.id.button3:
                        resultnum = Integer.parseInt(num1) + Integer.parseInt(num2);
                        result.setText(resultnum);
                        break;
                    case R.id.button4:
                        resultnum = Integer.parseInt(num1) + Integer.parseInt(num2);
                        result.setText(resultnum);
                        break;
                }
            }
        };



    }

}
