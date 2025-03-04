package com.example.nicestartsergio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Cargar imagen de fondo con Glide
        ImageView fondo = findViewById(R.id.girl);
        Glide.with(this)
                .load(R.drawable.girl) // Imagen local
                .transition(DrawableTransitionOptions.withCrossFade(600))
                .centerCrop()
                .into(fondo);

        // Ajuste de pantalla para bordes en dispositivos modernos
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Método para ir a SignupActivity
    public void openSignup(View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

    // Método para ir a MainActivity después del login
    public void openMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
