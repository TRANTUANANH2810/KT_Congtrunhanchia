package com.example.kt_cong_tru_nhan_chia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button phepcong, pheptru,phepnhan, phepchia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phepcong = findViewById(R.id.btn_cong);
        pheptru = findViewById(R.id.btn_tru);
        phepcong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent congIntent = new Intent(MainActivity.this,PhepCong.class);
                startActivity(congIntent);
            }
        });
        pheptru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,PheptruActivity.class);
                startActivity(Intent);
            }
        });

        phepnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,PhepNhanActivity.class);
                startActivity(Intent);
            }
        });

        phepchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,Phepchia.class);
                startActivity(Intent);
            }
        });


    }

}