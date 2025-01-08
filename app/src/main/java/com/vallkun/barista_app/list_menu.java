package com.vallkun.barista_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class list_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_menu);

        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list_menu.this, homepage.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list_menu.this, blackcoffee_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list_menu.this, caramelcoldcoffee_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list_menu.this, coffeeindonesia_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton10 = findViewById(R.id.imageButton10);
        imageButton10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list_menu.this, classicespresso_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton12 = findViewById(R.id.imageButton12);
        imageButton12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list_menu.this, italianespresso_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton14 = findViewById(R.id.imageButton14);
        imageButton14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list_menu.this, vanillacoffee_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton16 = findViewById(R.id.imageButton16);
        imageButton16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list_menu.this, icedmocha_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton18 = findViewById(R.id.imageButton18);
        imageButton18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list_menu.this, bavariancoffee_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton20 = findViewById(R.id.imageButton20);
        imageButton20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list_menu.this, cappuccino_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton23 = findViewById(R.id.imageButton23);
        imageButton23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list_menu.this, cinnamonlatte_resep.class);
                startActivity(intent);
            }
        });
    }
}