package com.nazhiif.fima;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.snackbar.Snackbar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfilPribadiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfilPribadiFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfilPribadiFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfilPribadiFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfilPribadiFragment newInstance(String param1, String param2) {
        ProfilPribadiFragment fragment = new ProfilPribadiFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profil_pribadi, container, false);

        EditText namaProfilPribadi = (EditText) view.findViewById(R.id.editTextPersonNameProfilPribadi);
        EditText usiaProfilPribadi = (EditText) view.findViewById(R.id.editTextUsiaProfilPribadi);
        EditText bbProfilPribadi = (EditText) view.findViewById(R.id.editTextBBProfilPribadi);
        EditText tbProfilPribadi = (EditText) view.findViewById(R.id.editTextTBProfilPribadi);
        EditText riwayatProfilPribadi = (EditText) view.findViewById(R.id.editTextMultiLineRiwayatProfilPribadi);

        RadioGroup radioGroupFrekuensi = (RadioGroup) view.findViewById(R.id.radioGroupFrekuensiProfilPribadi);

        namaProfilPribadi.setText(LoginActivity.nama);
        usiaProfilPribadi.setText(LoginActivity.usia);
        bbProfilPribadi.setText(LoginActivity.beratBadan);
        tbProfilPribadi.setText(LoginActivity.tinggiBadan);
        riwayatProfilPribadi.setText(LoginActivity.riwayat);

        switch(LoginActivity.frekuensiOlahraga) {
            case "radioButtonTidakPernahProfilmu":
                radioGroupFrekuensi.check(R.id.radioButtonTidakPernahProfilPribadi);
                break;
            case "radioButtonSedangProfilmu":
                radioGroupFrekuensi.check(R.id.radioButtonSedangProfilPribadi);
                break;
            case "radioButtonAktifProfilmu":
                radioGroupFrekuensi.check(R.id.radioButtonAktifProfilPribadi);
                break;
        }

        Button simpanProfilPribadi = (Button) view.findViewById(R.id.buttonSimpanProfilPribadi);

        simpanProfilPribadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!namaProfilPribadi.getText().toString().equals(LoginActivity.nama)) {
                    LoginActivity.nama = namaProfilPribadi.getText().toString();
                }
                if (!usiaProfilPribadi.getText().toString().equals(LoginActivity.usia)) {
                    LoginActivity.usia = usiaProfilPribadi.getText().toString();
                }
                if (!bbProfilPribadi.getText().toString().equals(LoginActivity.beratBadan)) {
                    LoginActivity.beratBadan = bbProfilPribadi.getText().toString();
                }
                if (!tbProfilPribadi.getText().toString().equals(LoginActivity.tinggiBadan)) {
                    LoginActivity.tinggiBadan = tbProfilPribadi.getText().toString();
                }

                if (!riwayatProfilPribadi.getText().toString().equals(LoginActivity.riwayat)) {
                    LoginActivity.riwayat = riwayatProfilPribadi.getText().toString();
                }

                Navigation.findNavController(v).navigateUp();
            }
        });

        return view;
    }
}