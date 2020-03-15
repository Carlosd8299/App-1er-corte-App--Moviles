package com.cdlc.myapplication;

import androidx.fragment.app.FragmentActivity;

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

        mMap.setMaxZoomPreference(100);

        // Add a marker in Sydney and move the camera
        LatLng niñoJesus = new LatLng(11.0185913, -74.8040582);
        mMap.addMarker(new MarkerOptions().position(niñoJesus).title("Hospital Niño Jesus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(niñoJesus));

        LatLng villaEstadio = new LatLng(10.911787, -74.803810);
        mMap.addMarker(new MarkerOptions().position(villaEstadio).title("Puesto de Salud Villa Estadio"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(villaEstadio));

        LatLng Materno = new LatLng(10.9173859,-74.7710211);
        mMap.addMarker(new MarkerOptions().position(Materno).title("Hospital Materno Infantil"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Materno));

        LatLng hUtario= new LatLng (10.9789344,-74.8032338);
        mMap.addMarker(new MarkerOptions().position(hUtario).title("Hospital Universitario"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hUtario));

        LatLng HGeneralB= new LatLng (10.9759893,-74.7998338);
        mMap.addMarker(new MarkerOptions().position(HGeneralB).title("Hospital General de Barranquilla"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HGeneralB));

        LatLng Manga= new LatLng (10.9677411,-74.8170233);
        mMap.addMarker(new MarkerOptions().position(Manga).title("Hospital La Manga"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Manga));

        LatLng Cari= new LatLng (10.9759893,-74.7998338);
        mMap.addMarker(new MarkerOptions().position(Cari).title("Hospital universitario Cari Sede de Alta Complejidad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Cari));

        LatLng Bosque= new LatLng (10.9759893,-74.7998338);
        mMap.addMarker(new MarkerOptions().position(Bosque).title("Camino Bosque de Maria"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bosque));

        LatLng Naza= new LatLng (10.9609157,-74.8150921);
        mMap.addMarker(new MarkerOptions().position(Naza).title("Hospital Nazareth"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Naza));
    }
}
