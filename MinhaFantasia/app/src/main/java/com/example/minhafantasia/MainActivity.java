package com.example.minhafantasia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button produtosbtn = (Button) findViewById(R.id.button2);
        final Button quemsomosbtn = (Button) findViewById(R.id.button);

        produtosbtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it3 = new Intent(MainActivity.this, produtos.class);
                startActivity(it3);
            }
        });

        quemsomosbtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, quemsomos.class);
                startActivity(it);
            }
        });
    }
}