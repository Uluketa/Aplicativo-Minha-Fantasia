package com.example.minhafantasia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class produtos extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        final Button elsabtn = (Button) findViewById(R.id.button4);
        final Button homembtn = (Button) findViewById(R.id.button5);
        final Button voltarbtn = (Button) findViewById(R.id.button8);

        elsabtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(produtos.this, elsa.class);
                startActivity(it);
            }
        });

        voltarbtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(produtos.this, MainActivity.class);
                startActivity(it);
            }
        });

        homembtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent ite = new Intent(produtos.this, homemaranha.class);
                startActivity(ite);
            }
        });

    }
}