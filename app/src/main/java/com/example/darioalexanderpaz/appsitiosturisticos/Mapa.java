package com.example.darioalexanderpaz.appsitiosturisticos;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public Marker marcador;
    public double lat = 0.0;
    public double lon = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
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

        Bundle bundle = getIntent().getExtras();
        int lugar = bundle.getInt("lugar");

        switch (lugar) {
            case 1:
                LatLng sydney = new LatLng(51.5072, -0.1275);
                mMap.addMarker(new MarkerOptions().position(sydney).title("Londres"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 2:
                LatLng sydney2 = new LatLng(41.0122, 28.97641);
                mMap.addMarker(new MarkerOptions().position(sydney2).title("Estambul"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney2, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 3:
                LatLng sydney3 = new LatLng(31.6341600, -7.9999400);
                mMap.addMarker(new MarkerOptions().position(sydney3).title("Marraquech"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney3, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 4:
                LatLng sydney4 = new LatLng(48.8534100, 2.3488000);
                mMap.addMarker(new MarkerOptions().position(sydney4).title("Paris"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney4, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 5:
                LatLng sydney5 = new LatLng(13.3617900, 103.8605600);
                mMap.addMarker(new MarkerOptions().position(sydney5).title("Siem Reap"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney5, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 6:
                LatLng sydney6 = new LatLng(50.0880400, 14.4207600);
                mMap.addMarker(new MarkerOptions().position(sydney6).title("Praga"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney6, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 7:
                LatLng sydney7 = new LatLng(41.8919300, 12.5113300);
                mMap.addMarker(new MarkerOptions().position(sydney7).title("Roma"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney7, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 8:
                LatLng sydney8 = new LatLng(21.0245000, 105.8411700);
                mMap.addMarker(new MarkerOptions().position(sydney8).title("Hanoi"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney8, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 9:
                LatLng sydney9 = new LatLng(40.6643, -73.9385);
                mMap.addMarker(new MarkerOptions().position(sydney9).title("Nueva York"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney9, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 10:
                LatLng sydney10 = new LatLng(-8.5193, 115.2633);
                mMap.addMarker(new MarkerOptions().position(sydney10).title("Ubud"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney10, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 11:
                LatLng sydney11 = new LatLng(41.3818, 2.1685);
                mMap.addMarker(new MarkerOptions().position(sydney11).title("Barcelona"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney11, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 12:
                LatLng sydney12 = new LatLng(38.7166700, -9.1333300);
                mMap.addMarker(new MarkerOptions().position(sydney12).title("Lisboa"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney12));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 13:
                LatLng sydney13 = new LatLng(51.5072, -0.1275);
                mMap.addMarker(new MarkerOptions().position(sydney13).title("Londres"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney13));

                LatLng sydney14 = new LatLng(41.0122, 28.97641);
                mMap.addMarker(new MarkerOptions().position(sydney14).title("Estambul "));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney14));

                LatLng sydney15 = new LatLng(13.3333, 103.8333);
                mMap.addMarker(new MarkerOptions().position(sydney15).title("Marrakech "));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney15));

                LatLng sydney16 = new LatLng(48.8534100, 2.3488000);
                mMap.addMarker(new MarkerOptions().position(sydney16).title("Paris"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney16));

                LatLng sydney17 = new LatLng(13.3617900, 103.8605600);
                mMap.addMarker(new MarkerOptions().position(sydney17).title("Siem Reap"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney17));

                LatLng sydney18 = new LatLng(50.0880400, 14.4207600);
                mMap.addMarker(new MarkerOptions().position(sydney18).title("Praga "));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney18));

                LatLng sydney19 = new LatLng(41.8919300, 12.5113300);
                mMap.addMarker(new MarkerOptions().position(sydney19).title("Roma"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney19));

                LatLng sydney20 = new LatLng(42.48019996901214, -2.5926734375);
                mMap.addMarker(new MarkerOptions().position(sydney20).title("Hanoi"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney20));

                LatLng sydney21 = new LatLng(40.6643, -73.9385);
                mMap.addMarker(new MarkerOptions().position(sydney21).title("Nueva York"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney21));

                LatLng sydney22 = new LatLng(-8.5193, 115.2633);
                mMap.addMarker(new MarkerOptions().position(sydney22).title("Ubud "));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney22));

                LatLng sydney23 = new LatLng(41.3818, 2.1685);
                mMap.addMarker(new MarkerOptions().position(sydney23).title("Barcelona "));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney23));

                LatLng sydney24 = new LatLng(38.7166700, -9.1333300);
                mMap.addMarker(new MarkerOptions().position(sydney24).title("Lisboa"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney24));

                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;


        }
    }


    public void agregarmark(double lat, double lon) {
        LatLng coor = new LatLng(lat, lon);
        CameraUpdate miubicacion = CameraUpdateFactory.newLatLngZoom(coor, 16);
        if (marcador != null) marcador.remove();
        {
            marcador = mMap.addMarker(new MarkerOptions().position(coor).title("tu estas aqui"));
            mMap.animateCamera(miubicacion);
        }
    }

    LocationListener locListe = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            actualizarubicacion(location);
        }

        @Override
        public void onStatusChanged(String s, int i, Bundle bundle) {

        }

        @Override
        public void onProviderEnabled(String s) {

        }

        @Override
        public void onProviderDisabled(String s) {

        }
    };

    public void actualizarubicacion(Location location) {
        if (location != null) {
            lat = location.getLatitude();
            lon = location.getLongitude();
            agregarmark(lat, lon);

        }
    }

    private void ub() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        LocationManager locma = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Location loca = locma.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        actualizarubicacion(loca);
        locma.requestLocationUpdates(LocationManager.GPS_PROVIDER,15000,0,locListe);
    }


}
