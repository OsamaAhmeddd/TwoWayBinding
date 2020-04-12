package com.osama.twowaybindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.osama.twowaybindingexample.databinding.ActivityMainBinding;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {
    public static final String TAG =MainActivity.class.getSimpleName();

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User();
        user.setName("Osama");
        binding.setUser(user);
        binding.setActivity(this);
    }

    public void onButtonClick(String email){

        Log.d(TAG, "Email :" +binding.getUser().getEmail());
        Log.d(TAG, "Email : "+email);
        Toast.makeText(this,email, Toast.LENGTH_SHORT).show();
    }
}