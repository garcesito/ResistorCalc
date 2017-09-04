package com.garcesito.resistorcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String franja1="0",franja2="",franja3="",franja4="0";
    private Button bRojo0,bRojo1,bRojo2,bRojo3;
    private Button bMarron0,bMarron1,bMarron2,bMarron3;
    private Button bNegro0,bNegro1,bNegro2;
    private Button bNaranja0,bNaranja1,bNaranja2;
    private Button bAmarillo0,bAmarillo1,bAmarillo2;
    private Button bVerde0,bVerde1,bVerde2;
    private Button bAzul0,bAzul1,bAzul2;
    private Button bPurpura0,bPurpura1,bPurpura2;
    private Button bGris0,bGris1,bGris2;
    private Button bBlanco0,bBlanco1;
    private Button bDorado3;
    private Button bPlateado3;
    private TextView tResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bRojo0=(Button)findViewById(R.id.bRojo0);
        bRojo1=(Button)findViewById(R.id.bRojo1);
        bRojo2=(Button)findViewById(R.id.bRojo2);
        bRojo3=(Button)findViewById(R.id.bRojo3);

        bMarron0=(Button)findViewById(R.id.bMarron0);
        bMarron1=(Button)findViewById(R.id.bMarron1);
        bMarron2=(Button)findViewById(R.id.bMarron2);
        bMarron3=(Button)findViewById(R.id.bMarron3);

        bNegro0=(Button)findViewById(R.id.bNegro0);
        bNegro1=(Button)findViewById(R.id.bNegro1);
        bNegro2=(Button)findViewById(R.id.bNegro2);

        bNaranja0=(Button)findViewById(R.id.bNaranja0);
        bNaranja1=(Button)findViewById(R.id.bNaranja1);
        bNaranja2=(Button)findViewById(R.id.bNaranja2);

        bAmarillo0=(Button)findViewById(R.id.bAmarillo0);
        bAmarillo1=(Button)findViewById(R.id.bAmarillo1);
        bAmarillo2=(Button)findViewById(R.id.bAmarillo2);

        bVerde0=(Button)findViewById(R.id.bVerde0);
        bVerde1=(Button)findViewById(R.id.bVerde1);
        bVerde2=(Button)findViewById(R.id.bVerde2);

        bAzul0=(Button)findViewById(R.id.bAzul0);
        bAzul1=(Button)findViewById(R.id.bAzul1);
        bAzul2=(Button)findViewById(R.id.bAzul2);

        bPurpura0=(Button)findViewById(R.id.bPurpura0);
        bPurpura1=(Button)findViewById(R.id.bPurpura1);
        bPurpura2=(Button)findViewById(R.id.bPurpura2);

        bGris0=(Button)findViewById(R.id.bGris0);
        bGris1=(Button)findViewById(R.id.bGris1);
        bGris2=(Button)findViewById(R.id.bGris2);

        bBlanco0=(Button)findViewById(R.id.bBlanco0);
        bBlanco1=(Button)findViewById(R.id.bBlanco1);

        bDorado3=(Button)findViewById(R.id.bDorado3);
        bPlateado3=(Button)findViewById(R.id.bPlateado3);

        tResultado=(TextView)findViewById(R.id.tResultado);

        bNegro0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                franja1="0";
                tResultado.setText(franja1+franja2+franja3+" Ω ± "+franja4+"%");
            }
        });
        bNegro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                franja2="0";
                tResultado.setText(franja1+franja2+franja3+" Ω ± "+franja4+"%");
            }
        });
        bNegro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                franja3="";
                tResultado.setText(franja1+franja2+franja3+" Ω ± "+franja4+"%");
            }
        });


        bMarron0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                franja1="1";
                tResultado.setText(franja1+franja2+franja3+" Ω ± "+franja4+"%");
            }
        });
        bMarron1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                franja2="1";
                tResultado.setText(franja1+franja2+franja3+" Ω ± "+franja4+"%");
            }
        });
        bMarron2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                franja3="0";
                tResultado.setText(franja1+franja2+franja3+" Ω ± "+franja4+"%");
            }
        });
        bMarron3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                franja4="1";
                tResultado.setText(franja1+franja2+franja3+" Ω ± "+franja4+"%");
            }
        });

        bRojo0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                franja1="2";
                tResultado.setText(franja1+franja2+franja3+" Ω ± "+franja4+"%");
            }
        });
        bRojo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                franja2="2";
                tResultado.setText(franja1+franja2+franja3+" Ω ± "+franja4+"%");
            }
        });
        bRojo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                franja3="00";
                tResultado.setText(franja1+franja2+franja3+" Ω ± "+franja4+"%");
            }
        });
        bRojo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                franja4="2";
                tResultado.setText(franja1+franja2+franja3+" Ω ± "+franja4+"%");
            }
        });



    }
}
