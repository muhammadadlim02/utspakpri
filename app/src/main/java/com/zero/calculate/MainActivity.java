package com.zero.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button satu,dua,tiga,empat,lima,enam,tujuh,delapan,sembilan,nol,tambah,bagi,kali,kurang,samadgn,titik;
    TextView hasil;
    Boolean tambahh,kalii,bagii,kurangg;
    double var1,var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasil    = (TextView)findViewById(R.id.output);

        nol      =(Button)findViewById(R.id.btnNol);
        satu     =(Button)findViewById(R.id.btnSatu);
        dua      =(Button)findViewById(R.id.btnDua);
        tiga     =(Button)findViewById(R.id.btnTiga);
        empat    =(Button)findViewById(R.id.btnEmpat);
        lima     =(Button)findViewById(R.id.btnLima);
        enam     =(Button)findViewById(R.id.btnEnam);
        tujuh    =(Button)findViewById(R.id.btnTujuh);
        delapan  =(Button)findViewById(R.id.btnDelapan);
        sembilan =(Button)findViewById(R.id.btnSembilan);

        kali    =(Button)findViewById(R.id.btnKali);
        bagi    =(Button)findViewById(R.id.btnBagi);
        kurang  =(Button)findViewById(R.id.btnKurang);
        tambah  =(Button)findViewById(R.id.btnTambah);
        samadgn =(Button)findViewById(R.id.btnSamaDengan);
        titik   =(Button)findViewById(R.id.btnTitik);

        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText()+"0");
            }
        });

        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText()+"1");
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText()+"2");
            }
        });

        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText()+"3");
            }
        });

        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText()+"4");
            }
        });

        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText()+"5");
            }
        });

        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText()+"6");
            }
        });

        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText()+"7");
            }
        });

        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText()+"8");
            }
        });


        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText()+"9");
            }
        });

        titik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText()+".");
            }
        });



        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(hasil.getText()+"");
                tambahh=true;
                hasil.setText(null);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(hasil.getText()+"");
                kurangg=true;
                hasil.setText(null);
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(hasil.getText()+"");
                kalii=true;
                hasil.setText(null);
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(hasil.getText()+"");
                bagii=true;
                hasil.setText(null);
            }
        });




        samadgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(hasil.getText()+"");

                if (tambahh==true){
                    hasil.setText(var1+var2+"");
                    tambahh=false;
                }
                else if (kurangg==true){
                    hasil.setText(var1-var2+"");
                    kurangg=false;
                }
                else if (kalii==true){
                    hasil.setText(var1*var2+"");
                    kalii=false;
                }
                else if (bagii==true){
                    hasil.setText(var1/var2+"");
                    bagii=false;
                }
                else{}
            }
        });

    }
}
