package com.example.aventus.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRadioButtonClicked(View v){
        boolean checked=((RadioButton)v).isChecked();
        switch(v.getId()){
            case R.id.radio_red:
                if(checked)
                    Toast.makeText(getApplicationContext(), ((RadioButton) v).getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.radio_blue:
                if(checked)
                    Toast.makeText(getApplicationContext(), ((RadioButton) v).getText(), Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
