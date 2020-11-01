package com.ccbury.joblisting;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GradJobActivity extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grad_job);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Button homeBack = findViewById(R.id.home1);
        homeBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity2Intent = new Intent(getApplicationContext(), WorkFromHomeActivity.class);
                startActivity(activity2Intent);
            }
        });
        
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng NCI = new LatLng(53.34, -6.24);
        googleMap.addMarker(new MarkerOptions()
                .position(NCI)
                .title("Marker for NCI Dublin"));
        float zoomLevel = 16.0f; //This goes up to 21
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(NCI, zoomLevel));
    }

}
