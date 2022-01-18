package com.nazhiif.fima;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AkunSayaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AkunSayaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AkunSayaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AkunSayaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AkunSayaFragment newInstance(String param1, String param2) {
        AkunSayaFragment fragment = new AkunSayaFragment();
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
        View view = inflater.inflate(R.layout.fragment_akun_saya, container, false);

        EditText namaAkunSaya = (EditText) view.findViewById(R.id.editTextUsernameAkunSaya);
        EditText emailAkunSaya = (EditText) view.findViewById(R.id.editTextEmailAkunSaya);
        EditText passwordAkunSaya = (EditText) view.findViewById(R.id.editTextPasswordAkunSaya);

        namaAkunSaya.setText(LoginActivity.username);
        emailAkunSaya.setText(LoginActivity.email);
        passwordAkunSaya.setText(LoginActivity.password);

        Button simpanAkunSaya = (Button) view.findViewById(R.id.buttonSimpanAkunSaya);

        simpanAkunSaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameBaru = namaAkunSaya.getText().toString();
                String emailBaru = emailAkunSaya.getText().toString();
                String passwordBaru = passwordAkunSaya.getText().toString();

                if (!usernameBaru.equals(LoginActivity.username)) {
                    LoginActivity.username = usernameBaru;
                }

                if (!emailBaru.equals(LoginActivity.email)) {
                    LoginActivity.email = emailBaru;
                }

                if (!passwordBaru.equals(LoginActivity.password)) {
                    LoginActivity.password = passwordBaru;
                }

                Navigation.findNavController(v).navigateUp();
            }
        });

        return view;
    }
}