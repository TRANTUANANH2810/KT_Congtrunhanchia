package com.example.kt_cong_tru_nhan_chia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Phepchia extends AppCompatActivity {

    Button chia;
    EditText so1,so2;
    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phep_cong);

        chia = findViewById(R.id.phepchia);
        so1 = findViewById(R.id.chia1);
        so2 = findViewById(R.id.chia2);
        kq = findViewById(R.id.kq_chia);
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s1 =  Integer.valueOf(so1.getText().toString());
                int s2=  Integer.valueOf(so2.getText().toString());
                int ketqua = s1*s2;
                kq.setText(String.valueOf(ketqua));
            }
        });
    }
}