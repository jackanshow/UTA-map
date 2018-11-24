/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.a14860.googletest07.bus;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;

import com.example.a14860.googletest07.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.ButtCap;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.CustomCap;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Dot;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.JointType;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.gms.maps.model.SquareCap;

import java.util.Arrays;
import java.util.List;

/**
 * This shows how to draw polylines on a map.
 */
public class PolylineActivity extends AppCompatActivity
        implements OnSeekBarChangeListener, OnItemSelectedListener, OnMapReadyCallback {

    // City locations for mutable polyline.
    private static final LatLng ADELAIDE = new LatLng(-34.92873, 138.59995);
    private static final LatLng DARWIN = new LatLng(-12.4258647, 130.7932231);
    private static final LatLng MELBOURNE = new LatLng(-37.81319, 144.96298);
    private static final LatLng PERTH = new LatLng(-31.95285, 115.85734);


    //bus stop
    private static final LatLng BUS1 = new LatLng(32.724312, -97.119432);
    private static final LatLng BUS2 = new LatLng(32.724366, -97.120859);
    private static final LatLng BUS3 = new LatLng(32.724366, -97.122243);
    private static final LatLng BUS4= new LatLng(32.724465, -97.123713);
    private static final LatLng BUS5 = new LatLng(32.725250, -97.123692);

    private static final LatLng BUS6 = new LatLng(32.726062, -97.123681);
    private static final LatLng BUS7 = new LatLng(32.726107, -97.125065);
    private static final LatLng BUS8 = new LatLng(32.726098, -97.126277);
    private static final LatLng BUS9 = new LatLng(32.725990, -97.126953);
    private static final LatLng BUS10 = new LatLng(32.725864, -97.127586);

    private static final LatLng BUS11 = new LatLng(32.726956, -97.127607);
    private static final LatLng BUS12 = new LatLng(32.727859, -97.127575);
    private static final LatLng BUS13 = new LatLng(32.727868, -97.126438);
    private static final LatLng BUS14 = new LatLng(32.727877, -97.125333);
    private static final LatLng BUS15 = new LatLng(32.728003, -97.125183);

    private static final LatLng BUS16 = new LatLng(32.729062, -97.125161);
    private static final LatLng BUS17 = new LatLng(32.729585, -97.125147);
    private static final LatLng BUS18 = new LatLng(32.729594, -97.124258);
    private static final LatLng BUS19 = new LatLng(32.729621, -97.123700);
    private static final LatLng BUS20= new LatLng(32.730244, -97.123679);

    private static final LatLng BUS21 = new LatLng(32.730722, -97.123615);
    private static final LatLng BUS22 = new LatLng(32.730742, -97.122717);
    private static final LatLng BUS23 = new LatLng(32.730742, -97.121708);
    private static final LatLng BUS24 = new LatLng(32.730101, -97.121687);
    private static final LatLng BUS25 = new LatLng(32.729379, -97.121687);

    private static final LatLng BUS26 = new LatLng(32.729478, -97.120249);
    private static final LatLng BUS27 = new LatLng(32.729595, -97.118693);
    private static final LatLng BUS28 = new LatLng(32.730209, -97.118704);
    private static final LatLng BUS29 = new LatLng(32.730778, -97.118763);
    private static final LatLng BUS30 = new LatLng(32.730674, -97.118119);

    private static final LatLng BUS31 = new LatLng(32.730638, -97.117556);
    private static final LatLng BUS32 = new LatLng(32.730633, -97.116944);
    private static final LatLng BUS33 = new LatLng(32.730633, -97.116391);
    private static final LatLng BUS34 = new LatLng(32.729488, -97.116399);
    private static final LatLng BUS35 = new LatLng(32.728577, -97.116413);

    private static final LatLng BUS36= new LatLng(32.728415, -97.116279);
    private static final LatLng BUS37 = new LatLng(32.728429, -97.115464);
    private static final LatLng BUS38 = new LatLng(32.728402, -97.114638);
    private static final LatLng BUS39 = new LatLng(32.727251, -97.114676);
    private static final LatLng BUS40 = new LatLng(32.727233, -97.113877);

    private static final LatLng BUS41 = new LatLng(32.726976, -97.112933);
    private static final LatLng BUS42 = new LatLng(32.726899, -97.111876);
    private static final LatLng BUS43 = new LatLng(32.727012, -97.111087);
    private static final LatLng BUS44 = new LatLng(32.728366, -97.111071);
    private static final LatLng BUS45 = new LatLng(32.729192, -97.111068);

    private static final LatLng BUS46 = new LatLng(32.729187, -97.109931);
    private static final LatLng BUS47 = new LatLng(32.729164, -97.108767);
    private static final LatLng BUS48 = new LatLng(32.727571, -97.108799);
    private static final LatLng BUS49 = new LatLng(32.727196, -97.109958);
    private static final LatLng BUS50 = new LatLng(32.727020, -97.111085);

    private static final LatLng BUS51 = new LatLng(32.726903, -97.112303);
    private static final LatLng BUS52= new LatLng(32.727093, -97.113365);
    private static final LatLng BUS53 = new LatLng(32.727228, -97.114003);
    private static final LatLng BUS54 = new LatLng(32.727251, -97.114883);
    private static final LatLng BUS55 = new LatLng(32.727066, -97.115752);

    private static final LatLng BUS56 = new LatLng(32.726669, -97.116390);
    private static final LatLng BUS57 = new LatLng(32.726091, -97.117297);
    private static final LatLng BUS58 = new LatLng(32.725924, -97.118032);
    private static final LatLng BUS59 = new LatLng(32.726019, -97.122593);
    private static final LatLng BUS60 = new LatLng(32.724439, -97.122644);

    private static final LatLng BUS61 = new LatLng(32.724403, -97.119522);


    // Airport locations for geodesic polyline.
    private static final LatLng AKL = new LatLng(-37.006254, 174.783018);
    private static final LatLng JFK = new LatLng(40.641051, -73.777485);
    private static final LatLng LAX = new LatLng(33.936524, -118.377686);
    private static final LatLng LHR = new LatLng(51.471547, -0.460052);

    private static final int MAX_WIDTH_PX = 100;
    private static final int MAX_HUE_DEGREES = 360;
    private static final int MAX_ALPHA = 255;
    private static final int CUSTOM_CAP_IMAGE_REF_WIDTH_PX = 50;
    private static final int INITIAL_STROKE_WIDTH_PX = 5;

    private static final int PATTERN_DASH_LENGTH_PX = 50;
    private static final int PATTERN_GAP_LENGTH_PX = 20;
    private static final Dot DOT = new Dot();
    private static final Dash DASH = new Dash(PATTERN_DASH_LENGTH_PX);
    private static final Gap GAP = new Gap(PATTERN_GAP_LENGTH_PX);
    private static final List<PatternItem> PATTERN_DOTTED = Arrays.asList(DOT, GAP);
    private static final List<PatternItem> PATTERN_DASHED = Arrays.asList(DASH, GAP);
    private static final List<PatternItem> PATTERN_MIXED = Arrays.asList(DOT, GAP, DOT, DASH, GAP);

    private Polyline mMutablePolyline;
    private SeekBar mHueBar;
    private SeekBar mAlphaBar;
    private SeekBar mWidthBar;
    private Spinner mStartCapSpinner;
    private Spinner mEndCapSpinner;
    private Spinner mJointTypeSpinner;
    private Spinner mPatternSpinner;
    private CheckBox mClickabilityCheckbox;

    // These are the options for polyline caps, joints and patterns. We use their
    // string resource IDs as identifiers.

    private static final int[] CAP_TYPE_NAME_RESOURCE_IDS = {
            R.string.cap_butt, // Default
            R.string.cap_round,
            R.string.cap_square,
            R.string.cap_image,
    };

    private static final int[] JOINT_TYPE_NAME_RESOURCE_IDS = {
            R.string.joint_type_default, // Default
            R.string.joint_type_bevel,
            R.string.joint_type_round,
    };

    private static final int[] PATTERN_TYPE_NAME_RESOURCE_IDS = {
            R.string.pattern_solid, // Default
            R.string.pattern_dashed,
            R.string.pattern_dotted,
            R.string.pattern_mixed,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.polyline_demo);

        mHueBar = (SeekBar) findViewById(R.id.hueSeekBar);
        mHueBar.setMax(MAX_HUE_DEGREES);
        mHueBar.setProgress(0);

        mAlphaBar = (SeekBar) findViewById(R.id.alphaSeekBar);
        mAlphaBar.setMax(MAX_ALPHA);
        mAlphaBar.setProgress(MAX_ALPHA);

        mWidthBar = (SeekBar) findViewById(R.id.widthSeekBar);
        mWidthBar.setMax(MAX_WIDTH_PX);
        mWidthBar.setProgress(MAX_WIDTH_PX / 2);

        mStartCapSpinner = (Spinner) findViewById(R.id.startCapSpinner);
        mStartCapSpinner.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item,
                getResourceStrings(CAP_TYPE_NAME_RESOURCE_IDS)));

        mEndCapSpinner = (Spinner) findViewById(R.id.endCapSpinner);
        mEndCapSpinner.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item,
                getResourceStrings(CAP_TYPE_NAME_RESOURCE_IDS)));

        mJointTypeSpinner = (Spinner) findViewById(R.id.jointTypeSpinner);
        mJointTypeSpinner.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item,
                getResourceStrings(JOINT_TYPE_NAME_RESOURCE_IDS)));

        mPatternSpinner = (Spinner) findViewById(R.id.patternSpinner);
        mPatternSpinner.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item,
                getResourceStrings(PATTERN_TYPE_NAME_RESOURCE_IDS)));

        mClickabilityCheckbox = (CheckBox) findViewById(R.id.toggleClickability);

        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    private String[] getResourceStrings(int[] resourceIds) {
        String[] strings = new String[resourceIds.length];
        for (int i = 0; i < resourceIds.length; i++) {
            strings[i] = getString(resourceIds[i]);
        }
        return strings;
    }

    @Override
    public void onMapReady(GoogleMap map) {

        // Override the default content description on the view, for accessibility mode.
        map.setContentDescription(getString(R.string.polyline_demo_description));

        // A geodesic polyline that goes around the world.
        map.addPolyline(new PolylineOptions()
                .add(LHR, AKL, LAX, JFK, LHR)
                .width(INITIAL_STROKE_WIDTH_PX)
                .color(Color.BLUE)
                .geodesic(true)
                .clickable(mClickabilityCheckbox.isChecked()));

        // A simple polyline across Australia. This polyline will be mutable.
        int color = Color.HSVToColor(
                mAlphaBar.getProgress(), new float[]{mHueBar.getProgress(), 1, 1});
        mMutablePolyline = map.addPolyline(new PolylineOptions()
                .color(color)
                .width(mWidthBar.getProgress())
                .clickable(mClickabilityCheckbox.isChecked())
                .add(BUS1,BUS2,BUS3,BUS4,BUS5,BUS6,BUS7,BUS8,BUS9,BUS10,
                        BUS11,BUS12,BUS13,BUS14,BUS15,BUS16,BUS17,BUS18,BUS19,BUS20,
                        BUS21,BUS22,BUS23,BUS24,BUS25,BUS26,BUS27,BUS28,BUS29,BUS30,
                        BUS31,BUS32,BUS33,BUS34,BUS35,BUS36,BUS37,BUS38,BUS39,BUS40,
                        BUS41,BUS42,BUS43,BUS44,BUS45,BUS46,BUS47,BUS48,BUS49,BUS50,
                        BUS51,BUS52,BUS53,BUS54,BUS55,BUS56,BUS57,BUS58,BUS59,BUS60,BUS61,BUS1)); //由起点到终点依次

        mHueBar.setOnSeekBarChangeListener(this);
        mAlphaBar.setOnSeekBarChangeListener(this);
        mWidthBar.setOnSeekBarChangeListener(this);

        mStartCapSpinner.setOnItemSelectedListener(this);
        mEndCapSpinner.setOnItemSelectedListener(this);
        mJointTypeSpinner.setOnItemSelectedListener(this);
        mPatternSpinner.setOnItemSelectedListener(this);

        mMutablePolyline.setStartCap(getSelectedCap(mStartCapSpinner.getSelectedItemPosition()));
        mMutablePolyline.setEndCap(getSelectedCap(mEndCapSpinner.getSelectedItemPosition()));
        mMutablePolyline.setJointType(getSelectedJointType(mJointTypeSpinner.getSelectedItemPosition()));
        mMutablePolyline.setPattern(getSelectedPattern(mPatternSpinner.getSelectedItemPosition()));

        // Move the map so that it is centered on the mutable polyline.
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(BUS1, 15));

        // Add a listener for polyline clicks that changes the clicked polyline's color.
        map.setOnPolylineClickListener(new GoogleMap.OnPolylineClickListener() {
            @Override
            public void onPolylineClick(Polyline polyline) {
                // Flip the values of the red, green and blue components of the polyline's color.
                polyline.setColor(polyline.getColor() ^ 0x00ffffff);
            }
        });
    }

    private Cap getSelectedCap(int pos) {
        switch (CAP_TYPE_NAME_RESOURCE_IDS[pos]) {
            case R.string.cap_butt:
                return new ButtCap();
            case R.string.cap_square:
                return new SquareCap();
            case R.string.cap_round:
                return new RoundCap();
            case R.string.cap_image:
                return new CustomCap(
                        BitmapDescriptorFactory.fromResource(R.drawable.chevron),
                        CUSTOM_CAP_IMAGE_REF_WIDTH_PX);
        }
        return null;
    }

    private int getSelectedJointType(int pos) {
        switch (JOINT_TYPE_NAME_RESOURCE_IDS[pos]) {
            case R.string.joint_type_bevel:
                return JointType.BEVEL;
            case R.string.joint_type_round:
                return JointType.ROUND;
            case R.string.joint_type_default:
                return JointType.DEFAULT;
        }
        return 0;
    }

    private List<PatternItem> getSelectedPattern(int pos) {
        switch (PATTERN_TYPE_NAME_RESOURCE_IDS[pos]) {
            case R.string.pattern_solid:
                return null;
            case R.string.pattern_dotted:
                return PATTERN_DOTTED;
            case R.string.pattern_dashed:
                return PATTERN_DASHED;
            case R.string.pattern_mixed:
                return PATTERN_MIXED;
            default:
                return null;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        switch (parent.getId()) {
            case R.id.startCapSpinner:
                mMutablePolyline.setStartCap(getSelectedCap(pos));
                break;
            case R.id.endCapSpinner:
                mMutablePolyline.setEndCap(getSelectedCap(pos));
                break;
            case R.id.jointTypeSpinner:
                mMutablePolyline.setJointType(getSelectedJointType(pos));
                break;
            case R.id.patternSpinner:
                mMutablePolyline.setPattern(getSelectedPattern(pos));
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Don't do anything here.
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // Don't do anything here.
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // Don't do anything here.
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (mMutablePolyline == null) {
            return;
        }

        if (seekBar == mHueBar) {
            mMutablePolyline.setColor(Color.HSVToColor(
                    Color.alpha(mMutablePolyline.getColor()), new float[]{progress, 1, 1}));
        } else if (seekBar == mAlphaBar) {
            float[] prevHSV = new float[3];
            Color.colorToHSV(mMutablePolyline.getColor(), prevHSV);
            mMutablePolyline.setColor(Color.HSVToColor(progress, prevHSV));
        } else if (seekBar == mWidthBar) {
            mMutablePolyline.setWidth(progress);
        }
    }

    /**
     * Toggles the clickability of the polyline based on the state of the View that triggered this
     * call.
     * This callback is defined on the CheckBox in the layout for this Activity.
     */
    public void toggleClickability(View view) {
        if (mMutablePolyline != null) {
            mMutablePolyline.setClickable(((CheckBox) view).isChecked());
        }
    }
}