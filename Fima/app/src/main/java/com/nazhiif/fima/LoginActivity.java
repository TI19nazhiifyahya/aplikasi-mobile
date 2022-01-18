package com.nazhiif.fima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    static String username, email, password, nama, usia, beratBadan, tinggiBadan, frekuensiOlahraga, riwayat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = "";
        email = "";
        password = "";
        nama = "";
        usia = "";
        beratBadan = "";
        tinggiBadan = "";
        frekuensiOlahraga = "";
        riwayat = "";
    }
}