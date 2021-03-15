package com.example.reseauxsociaux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class login_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.login);

        Button btn_connect = findViewById(R.id.id_connect_login);
        TextView txt_create_acc = findViewById(R.id.id_create_account);
        TextView txt_pwd_forget = findViewById(R.id.id_pwd_forget);

        btn_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {goSelection();}
        });

        txt_create_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goCreateAccount();
            }
        });

        txt_pwd_forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPwdForgot();
            }
        });

    }

    private void goCreateAccount(){
        Intent intent = new Intent(this, create_account.class);
        startActivityForResult(intent, 0);
    }

    private void goPwdForgot(){
        Intent intent = new Intent(this, pwd_forgot.class);
        startActivityForResult(intent, 0);
    }

    private void goSelection(){
        Intent intent = new Intent(this, Selection.class);
        startActivityForResult(intent, 0);
    }
}