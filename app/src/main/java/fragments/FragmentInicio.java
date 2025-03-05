package fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nicestartsergio.R;

public class FragmentInicio extends Fragment {

    public FragmentInicio() {
        // Constructor vacío
    }

    public static FragmentInicio newInstance(String param1, String param2) {
        FragmentInicio fragment = new FragmentInicio();
        // Aquí puedes agregar argumentos si es necesario
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // Maneja argumentos si los hay
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla el layout del fragmento
        return inflater.inflate(R.layout.activity_fragment_inicio, container, false);
    }
}
