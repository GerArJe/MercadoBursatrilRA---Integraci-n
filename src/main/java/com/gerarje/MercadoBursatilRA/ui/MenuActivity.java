package com.gerarje.MercadoBursatilRA.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gerarje.MercadoBursatilRA.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void goToAR(View view){
        Intent intent = new Intent(this, UnityPlayerActivity.class);
        startActivity(intent);
    }

    public void goToResources(View view) {
        Intent intent = new Intent(this, ResourcesActivity.class);
        startActivity(intent);
    }

    public void goToGlosary(View view) {
        Intent intent = new Intent(this, SemanticoActivity.class);
        startActivity(intent);

    }

    public void goToCreds(View view) {
        Intent intent = new Intent(this, CreditosActivity.class);
        startActivity(intent);

    }
}
