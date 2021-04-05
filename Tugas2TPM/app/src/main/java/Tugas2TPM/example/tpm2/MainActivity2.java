package Tugas2TPM.example.tpm2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.tugas2.R;

public class MainActivity2 extends AppCompatActivity {
    TextView tv_nama, tv_nim, tv_ipk;
    String nama2, nim2, ipk2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_nama = findViewById(R.id.nama2);
        tv_nim = findViewById(R.id.nim2);
        tv_ipk = findViewById(R.id.ipk2);

        if (getIntent().getStringExtra("name") != null) {
            nama2 = getIntent().getStringExtra("name");
            tv_nama.setText("Nama  = " + nama2);

        }
        if (getIntent().getStringExtra("nim") != null) {
            nim2 = getIntent().getStringExtra("nim");
            tv_nim.setText("Nim  = " + nim2);

        }
        if (getIntent().getStringExtra("ipk") != null) {
            ipk2 = getIntent().getStringExtra("ipk");
            tv_ipk.setText("Ipk  = " + ipk2);
        }
    }
}