package com.chavez.mrjuerga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Login;
    Button registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login=(Button)findViewById(R.id.btnInicio);
        registro=(Button)findViewById(R.id.registrar);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login= new Intent(MainActivity.this, InicioActivity.class);
                startActivity(Login);
            }
        });
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login= new Intent(MainActivity.this, RegistroActivity.class);
                startActivity(Login);
            }
        });
    }
}
