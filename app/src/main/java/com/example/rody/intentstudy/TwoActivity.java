package com.example.rody.intentstudy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ViewStubCompat;
import android.view.View;
import android.widget.Button;

public class TwoActivity extends AppCompatActivity {
    // 設定資料成員
    private Button toTwoActive_B;
    //連結 UI
    private void findViews(){
        toTwoActive_B=(Button)findViewById(R.id.toTwo_Button);

    }
    //設定傾聽物件
    private void setListeners(){
        toTwoActive_B.setOnClickListener(ToSecondActivity);
    }

    //實體
    private Button.OnClickListener ToSecondActivity = new Button.OnClickListener(){
        public void onClick(View v) {
            Intent intent_ToSecondActivity = new Intent(TwoActivity.this, SecondActivity.class);
            startActivity(intent_ToSecondActivity);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        findViews();
        setListeners();
    }

}
