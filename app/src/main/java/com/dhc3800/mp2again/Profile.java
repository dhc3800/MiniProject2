package com.dhc3800.mp2again;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Profile extends AppCompatActivity {

    ImageView img;
    TextView idTV;
    TextView nameTV;
    TextView v1;
    TextView v2;
    Button leave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Bundle b = getIntent().getExtras();
        String name = b.getString("name");
        leave = findViewById(R.id.button4);
        leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
            }
        });

        img = findViewById(R.id.pokemonimage);
        Glide.with(img.getContext()).load("http://img.pokemondb.net/artwork/" + name.toLowerCase() + ".jpg").centerCrop().into(img);

        idTV = findViewById(R.id.id);
        nameTV = findViewById(R.id.name);
        v1 = findViewById(R.id.tv1);
        v2 = findViewById(R.id.tv2);



        int id = b.getInt("id", 0);
        int attack = b.getInt("attack", 0);
        int defense = b.getInt("defense", 0);
        int hp = b.getInt("hp", 0);
        String[] types = getIntent().getExtras().getStringArray("types");
        int spatk = b.getInt("spatk", 0);
        int spdef = b.getInt("spdef", 0);
        int speed = b.getInt("speed", 0);
        int total = b.getInt("total", 0);
        String flavortext = b.getString("flavortext");
        String species = b.getString("species");

        nameTV.setText(name);
        idTV.setText(Integer.toString(id));
        String concat = "Attack: " + Integer.toString(attack) + ", Defense: "
                + Integer.toString(defense) + ", HP: " + Integer.toString(hp)
                + ", Special Attack: " + Integer.toString(spatk) + ", Special Defense: "
                + Integer.toString(spdef) + ", Speed: " + Integer.toString(speed) + ", Total: "
                + Integer.toString(total) + ", Species: " + species;

        v1.setText(concat);
        v2.setText(flavortext);

    }
}

