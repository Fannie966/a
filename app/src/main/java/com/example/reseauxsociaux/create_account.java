package com.example.reseauxsociaux;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class create_account extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);

        TextView txt_retour = findViewById(R.id.id_retour_acc);
        Button btn_sincrire = findViewById(R.id.id_btn_sincrire);


        txt_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_sincrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageSincrire();
                finish();
            }
        });
    }

    private void messageSincrire(){
        Context contexte = getApplicationContext();
        String  mess = "Merci de vous incrire!";
        Toast toast = Toast.makeText(contexte, mess, Toast.LENGTH_SHORT);
        toast.show();
    }
}
