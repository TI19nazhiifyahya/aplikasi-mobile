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
 * Use the {@link BuatAkunFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BuatAkunFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BuatAkunFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BuatAkunFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BuatAkunFragment newInstance(String param1, String param2) {
        BuatAkunFragment fragment = new BuatAkunFragment();
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
        View view = inflater.inflate(R.layout.fragment_buat_akun, container, false);

        EditText username = (EditText) view.findViewById(R.id.editTextUsernameBuatAkun);
        EditText email = (EditText) view.findViewById(R.id.editTextEmailBuatAkun);
        EditText password = (EditText) view.findViewById(R.id.editTextPasswordBuatAkun);

        Button daftarBuatAkun = (Button) view.findViewById(R.id.buttonDaftarBuatAkun);

        daftarBuatAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginActivity.username = username.getText().toString();
                LoginActivity.email = email.getText().toString();
                LoginActivity.password = password.getText().toString();

                Navigation.findNavController(v).navigate(R.id.action_buatAkunFragment_to_buatProfileFragment);
            }
        });

        return view;
    }
}