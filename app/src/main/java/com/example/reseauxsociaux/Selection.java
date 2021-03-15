package com.example.reseauxsociaux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        ImageButton btn_profil = findViewById(R.id.id_button_profil);
        Button btn_int = findViewById(R.id.id_button_interet);
        Button btn_cours = findViewById(R.id.id_button_cours);
        Button btn_club = findViewById(R.id.id_button_club);
        ImageButton amis = findViewById(R.id.selection_amis);

        btn_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goSearch(); }
        });

        btn_cours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goSearch(); }
        });

        btn_club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goSearch(); }
        });

        btn_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goProfil(); }
        });

        amis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goAmis(); }
        });
    }

    private void goSearch(){
        Intent intent = new Intent(this, Search.class);
        startActivityForResult(intent, 0);
    }

    private void goProfil(){
        Intent intent = new Intent(this, profil.class);
        startActivityForResult(intent, 0);
    }

    private void goAmis(){
        Intent intent = new Intent(this, amis.class);
        startActivityForResult(intent, 0);
    }
}