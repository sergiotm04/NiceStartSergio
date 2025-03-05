package com.example.nicestartsergio;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Configurar Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Registrar un menú contextual en un TextView o Button
        View textView = findViewById(R.id.texto);
        registerForContextMenu(textView);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Inflar el menú de opciones en la AppBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

    // Funcionalidad de las opciones de la AppBar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item4) {
            final View mLayout = findViewById(R.id.main);
            Snackbar snackbar = Snackbar
                    .make(mLayout, "¿Quieres deshacer esta acción?", Snackbar.LENGTH_SHORT)
                    .setAction("Deshacer", view -> {
                        Snackbar snackbar1 = Snackbar.make(mLayout, "Acción restaurada", Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    });
            snackbar.show();
        } else if (id == R.id.login) {
            startActivity(new Intent(this, LoginActivity.class));
        } else if (id == R.id.profile) {
            startActivity(new Intent(this, ProfileActivity.class));
        } else if (id == R.id.signup) {
            startActivity(new Intent(this, SignupActivity.class));
        } else if (id == R.id.logout) {
            Toast.makeText(this, "Sesión cerrada", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    // Crear menú contextual
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    // Acciones del menú contextual
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Toast.makeText(this, "Elemento copiado", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.item2) {
            Toast.makeText(this, "Descargando elemento...", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onContextItemSelected(item);
    }
}
