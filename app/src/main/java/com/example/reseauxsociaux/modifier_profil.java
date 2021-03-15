package com.example.reseauxsociaux;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class modifier_profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_profil);

        ImageButton x = findViewById(R.id.x);
        ImageButton ok = findViewById(R.id.ok);

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goProfil(); }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { finish(); }
        });
    }

    private void goProfil(){
        Intent intent = new Intent(this, profil.class);
        startActivityForResult(intent, 0);
    }
}
