package com.example.minhafantasia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quemsomos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quemsomos);

        final Button quemsomosvoltarbtn = (Button) findViewById(R.id.button9);

        quemsomosvoltarbtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it3 = new Intent(quemsomos.this, MainActivity.class);
                startActivity(it3);
            }
        });
    }
}