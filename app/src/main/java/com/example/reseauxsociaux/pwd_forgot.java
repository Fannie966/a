package com.example.reseauxsociaux;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class pwd_forgot extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pwd_forgot);

        TextView txt_retour = findViewById(R.id.id_retour_pwd);
        Button btn_connecter = findViewById(R.id.id_btn_connect_pwd);

        txt_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_connecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageConnecter();
                finish();
            }
        });
    }

    private void messageConnecter() {
        Context contexte = getApplicationContext();
        String  mess = "Vous êtes connectés";
        Toast toast = Toast.makeText(contexte, mess, Toast.LENGTH_SHORT);
        toast.show();
    }
}
