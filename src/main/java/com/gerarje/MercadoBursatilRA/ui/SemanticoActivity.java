package com.gerarje.MercadoBursatilRA.ui;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gerarje.MercadoBursatilRA.R;

public class SemanticoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glosary_textview);


    }

    public void goToMenu(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }


}
