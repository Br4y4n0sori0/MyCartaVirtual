package com.example.bryan.mycartavirtual;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng upb = new LatLng(6.2415823, -75.5909451);
        LatLng upbB9 = new LatLng(6.2414384, -75.5908969);
        LatLng upbPoli = new LatLng(6.2419503, -75.5915513);
        LatLng upbB6 = new LatLng(6.2420303, -75.5894377);

        mMap.addMarker(new MarkerOptions().position(upb).title("Marker in upb"));
        mMap.addMarker(new MarkerOptions().position(upbB9).title("Marker in upb bloque 9"));
        mMap.addMarker(new MarkerOptions().position(upbPoli).title("Marker in upb polideportivo"));
        mMap.addMarker(new MarkerOptions().position(upbB6).title("Marker in upb Bloque 6"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(upb, 14));

        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

    }
}
