package fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.nicestartsergio.R;

public class FragmentFavoritos extends Fragment {

    public FragmentFavoritos() {
        // Constructor vacío
    }

    public static FragmentFavoritos newInstance(String param1, String param2) {
        FragmentFavoritos fragment = new FragmentFavoritos();
        // Puedes agregar parámetros si es necesario
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // Maneja los argumentos si es necesario
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla el layout para este fragmento
        return inflater.inflate(R.layout.activity_fragment_favoritos, container, false);
    }
}
