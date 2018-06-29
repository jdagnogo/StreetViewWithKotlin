package com.example.jdagnogo.streetviewwithkotlin.ui

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.example.jdagnogo.streetviewwithkotlin.R
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback
import com.google.android.gms.maps.StreetViewPanorama
import com.google.android.gms.maps.StreetViewPanoramaFragment
import com.google.android.gms.maps.model.LatLng


class PanoramaActivity : FragmentActivity(), OnStreetViewPanoramaReadyCallback {

    override fun onStreetViewPanoramaReady(panorama: StreetViewPanorama?) {
        if (panorama != null) {
            panorama.setPosition(LatLng(44.827646, -0.575700))

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panorama)

        val streetViewPanoramaFragment = fragmentManager
                .findFragmentById(R.id.streetviewpanorama) as StreetViewPanoramaFragment
        streetViewPanoramaFragment.getStreetViewPanoramaAsync(this)
    }
}
