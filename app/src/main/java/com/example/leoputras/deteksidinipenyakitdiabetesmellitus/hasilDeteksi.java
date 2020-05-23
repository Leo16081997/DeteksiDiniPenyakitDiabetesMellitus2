package com.example.leoputras.deteksidinipenyakitdiabetesmellitus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hasilDeteksi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_deteksi);

        Intent intent = getIntent();
        Bundle b  = intent.getExtras();
        String hasil = b.getString("hasil");
        boolean b1 = b.getBoolean("b1");
        boolean b2 = b.getBoolean("b2");
        boolean b3 = b.getBoolean("b3");
        boolean b4 = b.getBoolean("b4");
        boolean b5 = b.getBoolean("b5");
        boolean b6 = b.getBoolean("b6");
        boolean b7 = b.getBoolean("b7");
        boolean b8 = b.getBoolean("b8");
        boolean b9 = b.getBoolean("b9");
        boolean b10 = b.getBoolean("b10");
        boolean b11 = b.getBoolean("b11");
        boolean b12 = b.getBoolean("b12");
        boolean b13 = b.getBoolean("b13");
        boolean b14 = b.getBoolean("b14");
        boolean b15 = b.getBoolean("b15");
        boolean b16 = b.getBoolean("b16");
        boolean b17 = b.getBoolean("b17");
        boolean b18 = b.getBoolean("b18");
        boolean b19 = b.getBoolean("b19");
        boolean b20 = b.getBoolean("b20");
        boolean b21 = b.getBoolean("b21");
        boolean b22 = b.getBoolean("b22");
        boolean b23 = b.getBoolean("b23");
        boolean b24 = b.getBoolean("b24");
        boolean b25 = b.getBoolean("b25");
        boolean b26 = b.getBoolean("b26");
        boolean b27 = b.getBoolean("b27");
        boolean b28 = b.getBoolean("b28");
        boolean b29 = b.getBoolean("b29");
        boolean b30 = b.getBoolean("b30");
        boolean b31 = b.getBoolean("b31");

        boolean b32 = b.getBoolean("b32");
        boolean b33 = b.getBoolean("b33");
        boolean b34 = b.getBoolean("b34");
        boolean b35 = b.getBoolean("b35");
        boolean b36 = b.getBoolean("b36");
        boolean b37 = b.getBoolean("b37");
        boolean b38 = b.getBoolean("b38");
        boolean b39 = b.getBoolean("b39");
        boolean b40 = b.getBoolean("b40");
        boolean b41 = b.getBoolean("b41");
        boolean b42 = b.getBoolean("b42");
        boolean b43 = b.getBoolean("b43");
        boolean b44 = b.getBoolean("b44");
        boolean b45 = b.getBoolean("b45");
        boolean b46 = b.getBoolean("b46");
        boolean b47 = b.getBoolean("b47");
        boolean b48 = b.getBoolean("b48");
        boolean b49 = b.getBoolean("b49");
        boolean b50 = b.getBoolean("b50");
        boolean b51 = b.getBoolean("b51");

        TextView textView = (TextView)findViewById(R.id.viewHasil);
        textView.setText(hasil);
        if (b1) {
            View v1 = findViewById(R.id.HG01);
            v1.setVisibility(View.VISIBLE);
        }
        if (b2) {
            View v2 = findViewById(R.id.HG02);
            v2.setVisibility(View.VISIBLE);
        }
        if (b3) {
            View v3 = findViewById(R.id.HG03);
            v3.setVisibility(View.VISIBLE);
        }
        if (b4) {
            View v4 = findViewById(R.id.HG04);
            v4.setVisibility(View.VISIBLE);
        }
        if (b5) {
            View v5 = findViewById(R.id.HG05);
            v5.setVisibility(View.VISIBLE);
        }
        if (b6) {
            View v6 = findViewById(R.id.HT01);
            v6.setVisibility(View.VISIBLE);
        }
        if (b7) {
            View v7 = findViewById(R.id.HT02);
            v7.setVisibility(View.VISIBLE);
        }
        if (b8) {
            View v8 = findViewById(R.id.HT03);
            v8.setVisibility(View.VISIBLE);
        }
        if (b9) {
            View v9 = findViewById(R.id.HT04);
            v9.setVisibility(View.VISIBLE);
        }
        if (b10) {
            View v10 = findViewById(R.id.HT05);
            v10.setVisibility(View.VISIBLE);
        }
        if (b11) {
            View v11 = findViewById(R.id.HT06);
            v11.setVisibility(View.VISIBLE);
        }
        if (b12) {
            View v12 = findViewById(R.id.HG06);
            v12.setVisibility(View.VISIBLE);
        }
        if (b13) {
            View v13 = findViewById(R.id.HG07);
            v13.setVisibility(View.VISIBLE);
        }
        if (b14) {
            View v14 = findViewById(R.id.HG08);
            v14.setVisibility(View.VISIBLE);
        }
        if (b15) {
            View v15 = findViewById(R.id.HG09);
            v15.setVisibility(View.VISIBLE);
        }
        if (b16) {
            View v16 = findViewById(R.id.HG10);
            v16.setVisibility(View.VISIBLE);
        }
        if (b17) {
            View v17 = findViewById(R.id.HG11);
            v17.setVisibility(View.VISIBLE);
        }
        if (b18) {
            View v18 = findViewById(R.id.HG12);
            v18.setVisibility(View.VISIBLE);
        }
        if (b19) {
            View v19 = findViewById(R.id.HG13);
            v19.setVisibility(View.VISIBLE);
        }
        if (b20) {
            View v20 = findViewById(R.id.HG14);
            v20.setVisibility(View.VISIBLE);
        }
        if (b21) {
            View v21 = findViewById(R.id.HG15);
            v21.setVisibility(View.VISIBLE);
        }
        if (b22) {
            View v22 = findViewById(R.id.HG16);
            v22.setVisibility(View.VISIBLE);
        }
        if (b23) {
            View v23 = findViewById(R.id.HG17);
            v23.setVisibility(View.VISIBLE);
        }
        if (b24) {
            View v24 = findViewById(R.id.HT08);
            v24.setVisibility(View.VISIBLE);
        }
        if (b25) {
            View v25 = findViewById(R.id.HT09);
            v25.setVisibility(View.VISIBLE);
        }
        if (b26) {
            View v26 = findViewById(R.id.HT10);
            v26.setVisibility(View.VISIBLE);
        }
        if (b27) {
            View v27 = findViewById(R.id.HT11);
            v27.setVisibility(View.VISIBLE);
        }
        if (b28) {
            View v28 = findViewById(R.id.HT12);
            v28.setVisibility(View.VISIBLE);
        }
        if (b29) {
            View v29 = findViewById(R.id.HT13);
            v29.setVisibility(View.VISIBLE);
        }
        if (b30) {
            View v30 = findViewById(R.id.HT14);
            v30.setVisibility(View.VISIBLE);
        }
        if (b31) {
            View v31 = findViewById(R.id.HT07);
            v31.setVisibility(View.VISIBLE);
        }


        if (b32) {
            View v32 = findViewById(R.id.HT15);
            v32.setVisibility(View.VISIBLE);
        }
        if (b33) {
            View v33 = findViewById(R.id.HT16);
            v33.setVisibility(View.VISIBLE);
        }
        if (b34) {
            View v34 = findViewById(R.id.HG18);
            v34.setVisibility(View.VISIBLE);
        }
        if (b35) {
            View v35 = findViewById(R.id.HG19);
            v35.setVisibility(View.VISIBLE);
        }
        if (b36) {
            View v36 = findViewById(R.id.HT17);
            v36.setVisibility(View.VISIBLE);
        }
        if (b37) {
            View v37 = findViewById(R.id.HG20);
            v37.setVisibility(View.VISIBLE);
        }
        if (b38) {
            View v38 = findViewById(R.id.HG21);
            v38.setVisibility(View.VISIBLE);
        }
        if (b39) {
            View v39 = findViewById(R.id.HG22);
            v39.setVisibility(View.VISIBLE);
        }
        if (b40) {
            View v40 = findViewById(R.id.HT18);
            v40.setVisibility(View.VISIBLE);
        }
        if (b41) {
            View v41 = findViewById(R.id.HT19);
            v41.setVisibility(View.VISIBLE);
        }
        if (b42) {
            View v42 = findViewById(R.id.HG23);
            v42.setVisibility(View.VISIBLE);
        }
        if (b43) {
            View v43 = findViewById(R.id.HG24);
            v43.setVisibility(View.VISIBLE);
        }
        if (b44) {
            View v44 = findViewById(R.id.HT20);
            v44.setVisibility(View.VISIBLE);
        }
        if (b45) {
            View v45 = findViewById(R.id.HT21);
            v45.setVisibility(View.VISIBLE);
        }
        if (b46) {
            View v46 = findViewById(R.id.HG25);
            v46.setVisibility(View.VISIBLE);
        }
        if (b47) {
            View v47 = findViewById(R.id.HG26);
            v47.setVisibility(View.VISIBLE);
        }
        if (b48) {
            View v48 = findViewById(R.id.HT22);
            v48.setVisibility(View.VISIBLE);
        }
        if (b49) {
            View v49 = findViewById(R.id.HT23);
            v49.setVisibility(View.VISIBLE);
        }
        if (b50) {
            View v50 = findViewById(R.id.HT24);
            v50.setVisibility(View.VISIBLE);
        }
        if (b51) {
            View v51 = findViewById(R.id.HG27);
            v51.setVisibility(View.VISIBLE);
        }

    }

    @Override
    protected void onStop() {

        View layoutHasil = findViewById(R.id.layoutHasil);
        layoutHasil.setVisibility(View.GONE);
        TextView textView = (TextView)findViewById(R.id.viewHasil);
        textView.setText("");

        super.onStop();
    }
}
