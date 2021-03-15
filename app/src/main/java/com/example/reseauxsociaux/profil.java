package com.example.reseauxsociaux;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        ImageButton profil = findViewById(R.id.profil_modifier);
        ImageButton notifications = findViewById(R.id.profil_notifications);
        ImageButton amis = findViewById(R.id.profil_amis);
        ImageButton listes = findViewById(R.id.profil_listes);
        ImageButton parametres = findViewById(R.id.profil_parametres);
        ImageButton x = findViewById(R.id.profil_x);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goModifierProfil(); }
        });

        amis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goAmis(); }
        });


        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { finish(); }
        });
                                // TODO
       /* notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goNotifications(); }
        });

        listes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goListes(); }
        });

        parametres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goParametres(); }
        });*/
    }

    private void goModifierProfil(){
        Intent intent = new Intent(this, modifier_profil.class);
        startActivityForResult(intent, 0);
    }

    private void goAmis(){
        Intent intent = new Intent(this, amis.class);
        startActivityForResult(intent, 0);
    }
                        // TODO
    /*private void goNotifications(){
        Intent intent = new Intent(this, notifications.class);
        startActivityForResult(intent, 0);
    }

    private void goListes(){
        Intent intent = new Intent(this, listes.class);
        startActivityForResult(intent, 0);
    }

    private void goParametres(){
        Intent intent = new Intent(this, parametres.class);
        startActivityForResult(intent, 0);
    }*/
}
