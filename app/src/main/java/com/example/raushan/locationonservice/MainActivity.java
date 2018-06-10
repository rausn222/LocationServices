package com.example.raushan.locationonservice;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    DatabaseReference current_user_latitude = FirebaseDatabase.getInstance().getReference().child("Location").child("Latitude").child("Hii");
    DatabaseReference current_user_longitude = FirebaseDatabase.getInstance().getReference().child("Location").child("Longitude").child("helo");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(getBaseContext(),HomeService.class);
        startService(intent);
        current_user_latitude.setValue(true);
        current_user_longitude.setValue(true);
    }
}
