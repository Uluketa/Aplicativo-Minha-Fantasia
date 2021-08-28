package com.example.minhafantasia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;

public class elsa extends AppCompatActivity{

    private int[] imagens  = {R.drawable.elsat3, R.drawable.elsat1, R.drawable.elsat2};

    public static class AdaptadorImagem extends BaseAdapter {
        private final Context ctx;
        private final int[] imagens;
        private final android.view.ViewGroup.LayoutParams params;

        public AdaptadorImagem(Context c, int[] imagens,
                               android.view.ViewGroup.LayoutParams params) {
            this.ctx = c;
            this.imagens = imagens;
            this.params = params;
        }

        @Override
        public int getCount() {
            return imagens.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView img = new ImageView(ctx);
            img.setImageResource(imagens[position]);
            img.setAdjustViewBounds(true);

            img.setLayoutParams(params);
            return img;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elsa);

        final Button btncelsa = (Button) findViewById(R.id.button6);
        final Button btnvelsa = (Button) findViewById(R.id.button7);

        Gallery g = (Gallery) findViewById(R.id.gallery1);
        g.setAdapter(new AdaptadorImagem(this, imagens, new LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)));

        btncelsa.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://produto.mercadolivre.com.br/MLB-1865231614-vestido-fantasia-tiara-tranca-coroa-luva-frozen-elsa-frozen-_JM?matt_tool=75669808&matt_word=&matt_source=google&matt_campaign_id=12368199099&matt_ad_group_id=118725565140&matt_match_type=&matt_network=g&matt_device=c&matt_creative=499457473829&matt_keyword=&matt_ad_position=&matt_ad_type=pla&matt_merchant_id=455570287&matt_product_id=MLB1865231614-82781463674&matt_product_partition_id=358100204805&matt_target_id=aud-930686866498:pla-358100204805&gclid=Cj0KCQjwsZKJBhC0ARIsAJ96n3VcH2A6SMJ4A6BVkip5OScV0v7IiR_YSd2Ec3TiVdMaB28Il5PErEYaArtbEALw_wcB")));
            }
        });
        btnvelsa.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent it = new Intent(elsa.this, produtos.class);
                startActivity(it);
            }
        });
    }
}