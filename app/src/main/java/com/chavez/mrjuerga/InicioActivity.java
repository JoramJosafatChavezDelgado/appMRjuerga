package com.chavez.mrjuerga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.chavez.mrjuerga.activities.ReservaListActivity;

public class InicioActivity extends AppCompatActivity {

    ImageButton eventos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        eventos=(ImageButton)findViewById(R.id.eventos);
        eventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login= new Intent(InicioActivity.this, ReservaListActivity.class);
                startActivity(Login);
            }
        });

    }
}
