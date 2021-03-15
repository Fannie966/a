package com.example.reseauxsociaux;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class amis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amis);

        ImageButton profil = findViewById(R.id.amis_profil);
        ImageButton groupes = findViewById(R.id.amis_add);
        ImageButton listes = findViewById(R.id.amis_listes);
        ImageButton notifications = findViewById(R.id.amis_notifications);
        ImageButton messagerie = findViewById(R.id.amis_messagerie);
        ImageButton recherche = findViewById(R.id.amis_recherche);
        ImageButton amis = findViewById(R.id.amis_amis);
        ImageButton message = findViewById(R.id.amis_message1 | R.id.amis_message2 | R.id.amis_message3);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goProfil(); }
        });

       /* groupes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goGroupes(); }
        });

        listes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goListes(); }
        }); */

        /*notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goNotifications(); }
        });

        messagerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMessagerie(); }
        });*/

        recherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goRecherche(); }
        });

        amis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goAmis(); }
        });

       /* message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMessage(); }
        });*/
    }

    private void goProfil(){
        Intent intent = new Intent(this, profil.class);
        startActivityForResult(intent, 0);
    }

    /*private void goNotifications(){
        Intent intent = new Intent(this, notifications.class);
        startActivityForResult(intent, 0);
    }

    private void goMessagerie(){
        Intent intent = new Intent(this, messagerie.class);
        startActivityForResult(intent, 0);
    }*/

    private void goRecherche(){
        Intent intent = new Intent(this, Search.class);
        startActivityForResult(intent, 0);
    }

    private void goAmis(){
        Intent intent = new Intent(this, amis.class);
        startActivityForResult(intent, 0);
    }

   /* private void goMessage(){
        Intent intent = new Intent(this, message.class);
        startActivityForResult(intent, 0);
    }*/
}
