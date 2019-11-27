package com.gerarje.MercadoBursatilRA.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gerarje.MercadoBursatilRA.R;

public class CreditosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creditos_textview);


    }

    public void goToMenu(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
