package com.example.minhafantasia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homemaranha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homemaranha);

        final Button voltar_homem = (Button) findViewById(R.id.button7);
        final Button comprar_homem = (Button) findViewById(R.id.button6);

        comprar_homem.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://megamundi.com.br/produto/fantasia-homem-aranha-para-criancas/?attribute_tamanho=P&variant=119978&utm_medium=cpc&utm_source=google&utm_campaign=Google%20Shopping&gclid=Cj0KCQjwjo2JBhCRARIsAFG667VR9Cr2o1m-dRR5TKSRJztRBibqGSPYX32QyLTHndrOp4Szbvbp4dUaAuSvEALw_wcB")));
            }
        });

        voltar_homem.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent it = new Intent(homemaranha.this, produtos.class);
                startActivity(it);
            }
        });
    }
}