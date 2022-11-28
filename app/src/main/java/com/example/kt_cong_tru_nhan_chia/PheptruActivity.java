package com.example.kt_cong_tru_nhan_chia;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PheptruActivity extends AppCompatActivity {

    Button tru;
    EditText so1,so2;
    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pheptru);

        tru = findViewById(R.id.pheptru);
        so1 = findViewById(R.id.tru1);
        so2 = findViewById(R.id.tru2);
        kq = findViewById(R.id.kq_tru);

        kq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s1 =  Integer.valueOf(so1.getText().toString());
                int s2=  Integer.valueOf(so2.getText().toString());
                int ketqua = s1-s2;
                kq.setText(String.valueOf(ketqua));
            }
        });
    }
}