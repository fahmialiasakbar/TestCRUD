package id.sch.smktelkom_mlg.project2.xiri11126.thoharoh;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Wudhu extends Fragment {
    Button btSiwak;

    public Wudhu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wudhu, container, false);
        btSiwak = (Button) view.findViewById(R.id.sunnah);
        return view;
    }

}
