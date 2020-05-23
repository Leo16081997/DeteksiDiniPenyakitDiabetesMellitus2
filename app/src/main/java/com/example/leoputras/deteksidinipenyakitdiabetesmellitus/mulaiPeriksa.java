package com.example.leoputras.deteksidinipenyakitdiabetesmellitus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

public class mulaiPeriksa extends AppCompatActivity {


    ArrayList<String> kumpulanP01 = new ArrayList<String>();
    ArrayList<String> kumpulanP02 = new ArrayList<String>();
    ArrayList<String> kumpulanP03 = new ArrayList<String>();
    ArrayList<String> kumpulanP04 = new ArrayList<String>();

    boolean b1;
    boolean b2;
    boolean b3;
    boolean b4;
    boolean b5;
    boolean b6;
    boolean b7;
    boolean b8;
    boolean b9;
    boolean b10;
    boolean b11;
    boolean b12;
    boolean b13;
    boolean b14;
    boolean b15;
    boolean b16;
    boolean b17;
    boolean b18;
    boolean b19;
    boolean b20;
    boolean b21;
    boolean b22;
    boolean b23;
    boolean b24;
    boolean b25;
    boolean b26;
    boolean b27;
    boolean b28;
    boolean b29;
    boolean b30;
    boolean b31;

    boolean b32;
    boolean b33;
    boolean b34;
    boolean b35;
    boolean b36;
    boolean b37;
    boolean b38;
    boolean b39;
    boolean b40;
    boolean b41;
    boolean b42;
    boolean b43;
    boolean b44;
    boolean b45;
    boolean b46;
    boolean b47;
    boolean b48;
    boolean b49;
    boolean b50;
    boolean b51;

    boolean b52;


    int K01 = 0;
    int K02 = 0;
    int K03 = 0;

    public void setK01() {
        this.K01 = K01 + 1;
    }

//    public int getK01() {
//        return this.K01;
//    }

    public void setK02() {
        this.K02 = K02 + 1;
    }

//    public int getK02() {
//        return this.K02;
//    }

    public void setK03() {
        this.K03 = K03 + 1;
    }

//    public int getK03() {
//        return this.K03;
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai_periksa);
    }

    public void buttonHome(View view) {
        Intent intent1 = new Intent(this, activityHome.class);
        startActivity(intent1);
    }

    // knowledgebase
    public void buttonDeteksi(View view) {

        if (kumpulanP01.contains("G01") && !kumpulanP01.isEmpty()) {
            setK01();
        }
        if (kumpulanP01.contains("G02") && !kumpulanP01.isEmpty()) {
            setK01();
        }
        if (kumpulanP01.contains("G03") && !kumpulanP01.isEmpty()) {
            setK02();
        }
        if (kumpulanP01.contains("G04") && !kumpulanP01.isEmpty()) {
            setK01();
        }
        if (kumpulanP01.contains("G05") && !kumpulanP01.isEmpty()) {
            setK01();
        }
        if (kumpulanP02.contains("T01") && !kumpulanP02.isEmpty()) {
            setK02();
        }
        if (kumpulanP02.contains("T02") && !kumpulanP02.isEmpty()) {
            setK01();
        }
        if (kumpulanP02.contains("T03") && !kumpulanP02.isEmpty()) {
            setK01();
        }
        if (kumpulanP02.contains("T04") && !kumpulanP02.isEmpty()) {
            setK03();
        }
        if (kumpulanP02.contains("T05") && !kumpulanP02.isEmpty()) {
            setK02();
        }
        if (kumpulanP02.contains("T06") && !kumpulanP02.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G06") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G07") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G08") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G09") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G10") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G11") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G12") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G13") && !kumpulanP03.isEmpty()) {
            setK02();
        }
        if (kumpulanP03.contains("G14") && !kumpulanP03.isEmpty()) {
            setK02();
        }
        if (kumpulanP03.contains("G15") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G16") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G17") && !kumpulanP03.isEmpty()) {
            setK02();
        }
        if (kumpulanP04.contains("T08") && !kumpulanP04.isEmpty()) {
            setK01();
        }
        if (kumpulanP04.contains("T09") && !kumpulanP04.isEmpty()) {
            setK01();
        }
        if (kumpulanP04.contains("T10") && !kumpulanP04.isEmpty()) {
            setK02();
        }
        if (kumpulanP04.contains("T11") && !kumpulanP04.isEmpty()) {
            setK01();
        }
        if (kumpulanP04.contains("T12") && !kumpulanP04.isEmpty()) {
            setK01();
        }
        if (kumpulanP04.contains("T13") && !kumpulanP04.isEmpty()) {
            setK02();
        }
        if (kumpulanP04.contains("T14") && !kumpulanP04.isEmpty()) {
            setK02();
        }
        if (kumpulanP04.contains("T07") && !kumpulanP04.isEmpty()) {
            setK03();
        }


        if (kumpulanP04.contains("T15") && !kumpulanP04.isEmpty()) {
            setK01();
        }
        if (kumpulanP04.contains("T16") && !kumpulanP04.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G18") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G19") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP04.contains("T17") && !kumpulanP04.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G20") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G21") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP01.contains("G22") && !kumpulanP01.isEmpty()) {
            setK02();
        }
        if (kumpulanP02.contains("T18") && !kumpulanP02.isEmpty()) {
            setK02();
        }
        if (kumpulanP04.contains("T19") && !kumpulanP04.isEmpty()) {
            setK01();
        }
        if (kumpulanP01.contains("G23") && !kumpulanP01.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G24") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP02.contains("T20") && !kumpulanP02.isEmpty()) {
            setK02();
        }
        if (kumpulanP02.contains("T21") && !kumpulanP02.isEmpty()) {
            setK02();
        }
        if (kumpulanP03.contains("G25") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP03.contains("G26") && !kumpulanP03.isEmpty()) {
            setK01();
        }
        if (kumpulanP04.contains("T22") && !kumpulanP04.isEmpty()) {
            setK01();
        }
        if (kumpulanP02.contains("T23") && !kumpulanP02.isEmpty()) {
            setK02();
        }
        if (kumpulanP02.contains("T24") && !kumpulanP02.isEmpty()) {
            setK02();
        }
        if (kumpulanP03.contains("G27") && !kumpulanP03.isEmpty()) {
            setK01();
        }


        // Logika K01, K02, K03
        String hasil = "";

        if (K01 <= 0 && K02 <= 0 && K03 <= 0) {
            hasil = "";
        } else {

            if (K01 >= K02 && K01 >= K03) {
                hasil = "Anda terkena Diabetes Mellitus, silahkan periksa kesehatan anda di dokter spesialis penyakit dalam";
            } else if (K02 > K01 && K02 >= K03) {
                hasil = "Anda mengalami Pre-Diabetes Mellitus, jaga pola makan dan hidup sehat anda agar bisa mencegah penyakit Diabetes Mellitus";
            } else if (K03 > K02 && K03 > K01) {
                hasil =  "Anda tidak mengalami Diabetes Mellitus, jaga pola makan dan hidup sehat agar tidak terkena penyakit Diabetes Mellitus";
            } else {
                hasil = "";
            }

        }


        if (!hasil.isEmpty()) {

            Intent intent = new Intent(this, hasilDeteksi.class);
           // intent.putExtra("hasil",hasil);
            Bundle b = new Bundle( );
            b.putString( "hasil", hasil);
            b.putBoolean("b1", b1);
            b.putBoolean("b2", b2);
            b.putBoolean("b3", b3);
            b.putBoolean("b4", b4);
            b.putBoolean("b5", b5);
            b.putBoolean("b6", b6);
            b.putBoolean("b7", b7);
            b.putBoolean("b8", b8);
            b.putBoolean("b9", b9);
            b.putBoolean("b10", b10);
            b.putBoolean("b11", b11);
            b.putBoolean("b12", b12);
            b.putBoolean("b13", b13);
            b.putBoolean("b14", b14);
            b.putBoolean("b15", b15);
            b.putBoolean("b16", b16);
            b.putBoolean("b17", b17);
            b.putBoolean("b18", b18);
            b.putBoolean("b19", b19);
            b.putBoolean("b20", b20);
            b.putBoolean("b21", b21);
            b.putBoolean("b22", b22);
            b.putBoolean("b23", b23);
            b.putBoolean("b24", b24);
            b.putBoolean("b25", b25);
            b.putBoolean("b26", b26);
            b.putBoolean("b27", b27);
            b.putBoolean("b28", b28);
            b.putBoolean("b29", b29);
            b.putBoolean("b30", b30);
            b.putBoolean("b31", b31);


            b.putBoolean("b32", b32);
            b.putBoolean("b33", b33);
            b.putBoolean("b34", b34);
            b.putBoolean("b35", b35);
            b.putBoolean("b36", b36);
            b.putBoolean("b37", b37);
            b.putBoolean("b38", b38);
            b.putBoolean("b39", b39);
            b.putBoolean("b40", b40);
            b.putBoolean("b41", b41);
            b.putBoolean("b42", b42);
            b.putBoolean("b43", b43);
            b.putBoolean("b44", b44);
            b.putBoolean("b45", b45);
            b.putBoolean("b46", b46);
            b.putBoolean("b47", b47);
            b.putBoolean("b48", b48);
            b.putBoolean("b49", b49);
            b.putBoolean("b50", b50);
            b.putBoolean("b51", b51);

            b.putBoolean("b52", b52);


            intent.putExtras(b);
            setResult(Activity.RESULT_OK, intent);
            startActivity(intent);

        } else {
            setResult(Activity.RESULT_CANCELED);
        }

        finish();
    }


    // fungsi checkbox
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.G01:
                if (checked) {
                    kumpulanP01.add("G01");
                    b1 = true ;


                } else {
                    kumpulanP01.remove("G01");
                }
                break;
            case R.id.G02:
                if (checked) {
                    kumpulanP01.add("G02");
                    b2 = true ;


                } else {
                    kumpulanP01.remove("G02");
                }
                break;
            case R.id.G03:
                if (checked) {
                    kumpulanP01.add("G03");
                    b3 = true ;
                } else {
                    kumpulanP01.remove("G03");
                }
                break;
            case R.id.G04:
                if (checked) {
                    kumpulanP01.add("G04");
                    b4 = true ;

                } else {
                    kumpulanP01.remove("G04");
                }
                break;
            case R.id.G05:
                if (checked) {
                    kumpulanP01.add("G05");
                    b5 = true ;
                } else {
                    kumpulanP01.remove("G05");
                }
                break;
            case R.id.T01:
                if (checked) {
                    kumpulanP02.add("T01");
                    b6 = true ;
                } else {
                    kumpulanP02.remove("T01");
                }
                break;
            case R.id.T02:
                if (checked) {
                    kumpulanP02.add("T02");
                    b7 = true ;
                } else {
                    kumpulanP02.remove("T02");
                }
                break;
            case R.id.T03:
                if (checked) {
                    kumpulanP02.add("T03");
                    b8 = true ;
                } else {
                    kumpulanP02.remove("T03");
                }
                break;
            case R.id.T04:
                if (checked) {
                    kumpulanP02.add("T04");
                    b9 = true ;
                } else {
                    kumpulanP02.remove("T04");
                }
                break;
            case R.id.T05:
                if (checked) {
                    kumpulanP02.add("T05");
                    b10 = true ;
                } else {
                    kumpulanP02.remove("T05");
                }
                break;
            case R.id.T06:
                if (checked) {
                    kumpulanP02.add("T06");
                    b11 = true ;
                } else {
                    kumpulanP02.remove("T06");
                }
                break;
            case R.id.G06:
                if (checked) {
                    kumpulanP03.add("G06");
                    b12 = true ;
                } else {
                    kumpulanP03.remove("G06");
                }
                break;
            case R.id.G07:
                if (checked) {
                    kumpulanP03.add("G07");
                    b13 = true ;
                } else {
                    kumpulanP03.remove("G07");
                }
                break;
            case R.id.G08:
                if (checked) {
                    kumpulanP03.add("G08");
                    b14 = true ;
                } else {
                    kumpulanP03.remove("G08");
                }
                break;
            case R.id.G09:
                if (checked) {
                    kumpulanP03.add("G09");
                    b15 = true ;
                } else {
                    kumpulanP03.remove("G09");
                }
                break;
            case R.id.G10:
                if (checked) {
                    kumpulanP03.add("G10");
                    b16 = true ;
                } else {
                    kumpulanP03.remove("G10");
                }
                break;
            case R.id.G11:
                if (checked) {
                    kumpulanP02.add("G11");
                    b17 = true ;
                } else {
                    kumpulanP02.remove("G11");
                }
                break;
            case R.id.G12:
                if (checked) {
                    kumpulanP03.add("G12");
                    b18 = true ;
                } else {
                    kumpulanP03.remove("G12");
                }
                break;
            case R.id.G13:
                if (checked) {
                    kumpulanP03.add("G13");
                    b19 = true ;
                } else {
                    kumpulanP03.remove("G13");
                }
                break;
            case R.id.G14:
                if (checked) {
                    kumpulanP03.add("G14");
                    b20 = true ;
                } else {
                    kumpulanP03.remove("G14");
                }
                break;
            case R.id.G15:
                if (checked) {
                    kumpulanP03.add("G15");
                    b21 = true ;
                } else {
                    kumpulanP03.remove("G15");
                }
                break;
            case R.id.G16:
                if (checked) {
                    kumpulanP03.add("G16");
                    b22 = true ;
                } else {
                    kumpulanP03.remove("G16");
                }
                break;
            case R.id.G17:
                if (checked) {
                    kumpulanP03.add("G17");
                    b23 = true ;
                } else {
                    kumpulanP03.remove("G17");
                }
                break;
            case R.id.T08:
                if (checked) {
                    kumpulanP04.add("T08");
                    b24 = true ;
                } else {
                    kumpulanP04.remove("T08");
                }
                break;
            case R.id.T09:
                if (checked) {
                    kumpulanP04.add("T09");
                    b25 = true ;
                } else {
                    kumpulanP04.remove("T09");
                }
                break;
            case R.id.T10:
                if (checked) {
                    kumpulanP04.add("T10");
                    b26 = true ;
                } else {
                    kumpulanP04.remove("T10");
                }
                break;
            case R.id.T11:
                if (checked) {
                    kumpulanP04.add("T11");
                    b27 = true ;
                } else {
                    kumpulanP04.remove("T11");
                }
                break;
            case R.id.T12:
                if (checked) {
                    kumpulanP04.add("T12");
                    b28 = true ;
                } else {
                    kumpulanP04.remove("T12");
                }
                break;
            case R.id.T13:
                if (checked) {
                    kumpulanP04.add("T13");
                    b29 = true ;
                } else {
                    kumpulanP04.remove("T13");
                }
                break;
            case R.id.T14:
                if (checked) {
                    kumpulanP04.add("T14");
                    b30 = true ;
                } else {
                    kumpulanP04.remove("T14");
                }
                break;
            case R.id.T07:
                if (checked) {
                    kumpulanP04.add("T07");
                    b31 = true ;

                } else {
                    kumpulanP04.remove("T07");
                }
                break;


            case R.id.T15:
                if (checked) {
                    kumpulanP04.add("T15");
                    b32 = true ;
                } else {
                    kumpulanP04.remove("T15");
                }
                break;

            case R.id.T16:
                if (checked) {
                    kumpulanP04.add("T16");
                    b33 = true ;
                } else {
                    kumpulanP04.remove("T16");
                }
                break;

            case R.id.G18:
                if (checked) {
                    kumpulanP03.add("G18");
                    b34 = true ;
                } else {
                    kumpulanP03.remove("G18");
                }
                break;

            case R.id.G19:
                if (checked) {
                    kumpulanP03.add("G19");
                    b35 = true ;
                } else {
                    kumpulanP03.remove("G19");
                }
                break;

            case R.id.T17:
                if (checked) {
                    kumpulanP04.add("T17");
                    b36 = true ;
                } else {
                    kumpulanP04.remove("T17");
                }
                break;

            case R.id.G20:
                if (checked) {
                    kumpulanP03.add("G20");
                    b37 = true ;
                } else {
                    kumpulanP03.remove("G20");
                }
                break;

            case R.id.G21:
                if (checked) {
                    kumpulanP03.add("G21");
                    b38 = true ;
                } else {
                    kumpulanP03.remove("G21");
                }
                break;

            case R.id.G22:
                if (checked) {
                    kumpulanP01.add("G22");
                    b39 = true ;
                } else {
                    kumpulanP01.remove("G22");
                }
                break;

            case R.id.T18:
                if (checked) {
                    kumpulanP02.add("T18");
                    b40 = true ;
                } else {
                    kumpulanP02.remove("T18");
                }
                break;

            case R.id.T19:
                if (checked) {
                    kumpulanP04.add("T19");
                    b41 = true ;
                } else {
                    kumpulanP04.remove("T19");
                }
                break;

            case R.id.G23:
                if (checked) {
                    kumpulanP01.add("G23");
                    b42 = true ;
                } else {
                    kumpulanP01.remove("G23");
                }
                break;

            case R.id.G24:
                if (checked) {
                    kumpulanP03.add("G24");
                    b43 = true ;
                } else {
                    kumpulanP03.remove("G24");
                }
                break;

            case R.id.T20:
                if (checked) {
                    kumpulanP02.add("T20");
                    b44 = true ;
                } else {
                    kumpulanP02.remove("T20");
                }
                break;

            case R.id.T21:
                if (checked) {
                    kumpulanP02.add("T21");
                    b45 = true ;
                } else {
                    kumpulanP02.remove("T21");
                }
                break;

            case R.id.G25:
                if (checked) {
                    kumpulanP03.add("G25");
                    b46 = true ;
                } else {
                    kumpulanP03.remove("G25");
                }
                break;

            case R.id.G26:
                if (checked) {
                    kumpulanP03.add("G26");
                    b47 = true ;
                } else {
                    kumpulanP03.remove("G26");
                }
                break;

            case R.id.T22:
                if (checked) {
                    kumpulanP04.add("T22");
                    b48 = true ;
                } else {
                    kumpulanP04.remove("T22");
                }
                break;

            case R.id.T23:
                if (checked) {
                    kumpulanP02.add("T23");
                    b49 = true ;
                } else {
                    kumpulanP02.remove("T23");
                }
                break;

            case R.id.T24:
                if (checked) {
                    kumpulanP02.add("T24");
                    b50 = true ;
                } else {
                    kumpulanP02.remove("T24");
                }
                break;

            case R.id.G27:
                if (checked) {
                    kumpulanP03.add("G27");
                    b51 = true ;
                } else {
                    kumpulanP03.remove("G27");
                }
                break;

        }
    }

}
