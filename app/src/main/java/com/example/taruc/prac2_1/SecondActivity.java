package com.example.taruc.prac2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = (TextView)findViewById(R.id.textViewMessage);

        Bundle extra = getIntent().getExtras();
        if(!extra.isEmpty()){
            String message = extra.getString("MESSAGE");
            textView.setText(message);
        }
    }
}
