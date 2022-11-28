package com.example.kt_cong_tru_nhan_chia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhepNhanActivity extends AppCompatActivity {

    Button nhan;
    EditText so1,so2;
    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phep_cong);

        nhan = findViewById(R.id.phepnhan);
        so1 = findViewById(R.id.nhan1);
        so2 = findViewById(R.id.nhan2);
        kq = findViewById(R.id.kq_nhan);
        nhan.setOnClickListener(new View.OnClickListener() {
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