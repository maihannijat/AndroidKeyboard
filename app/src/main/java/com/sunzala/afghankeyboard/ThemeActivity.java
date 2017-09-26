package com.sunzala.afghankeyboard;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class ThemeActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton themeButton1, themeButton2, themeButton3, themeButton4, themeButton5, themeButton6,
            themeButton7, themeButton8, themeButton9, themeButton10;

    public static final String THEME_KEY = "theme";

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);

        themeButton1 = (ImageButton) findViewById(R.id.theme1_imageButton);
        themeButton2 = (ImageButton) findViewById(R.id.theme2_imageButton);
        themeButton3 = (ImageButton) findViewById(R.id.theme3_imageButton);
        themeButton4 = (ImageButton) findViewById(R.id.theme4_imageButton);
        themeButton5 = (ImageButton) findViewById(R.id.theme5_imageButton);
        themeButton6 = (ImageButton) findViewById(R.id.theme6_imageButton);
        themeButton7 = (ImageButton) findViewById(R.id.theme7_imageButton);
        themeButton8 = (ImageButton) findViewById(R.id.theme8_imageButton);
        themeButton9 = (ImageButton) findViewById(R.id.theme9_imageButton);
        themeButton10 = (ImageButton) findViewById(R.id.theme10_imageButton);

        themeButton1.setOnClickListener(this);
        themeButton2.setOnClickListener(this);
        themeButton3.setOnClickListener(this);
        themeButton4.setOnClickListener(this);
        themeButton5.setOnClickListener(this);
        themeButton6.setOnClickListener(this);
        themeButton7.setOnClickListener(this);
        themeButton8.setOnClickListener(this);
        themeButton9.setOnClickListener(this);
        themeButton10.setOnClickListener(this);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("D17FE6D8441E3F2375E3709A2EED851B")
                .build();
        adView.loadAd(adRequest);

        final InterstitialAd interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial_unitID));
        interstitialAd.loadAd(adRequest);

        interstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                interstitialAd.show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        editor = sharedPreferences.edit();

        switch (view.getId()) {
            case R.id.theme1_imageButton:
                editor.putInt(THEME_KEY, R.layout.input_1).commit();
                break;
            case R.id.theme2_imageButton:
                editor.putInt(THEME_KEY, R.layout.input_2).commit();
                break;
            case R.id.theme3_imageButton:
                editor.putInt(THEME_KEY, R.layout.input_3).commit();
                break;
            case R.id.theme4_imageButton:
                editor.putInt(THEME_KEY, R.layout.input_4).commit();
                break;
            case R.id.theme5_imageButton:
                editor.putInt(THEME_KEY, R.layout.input_5).commit();
                break;
            case R.id.theme6_imageButton:
                editor.putInt(THEME_KEY, R.layout.input_6).commit();
                break;
            case R.id.theme7_imageButton:
                editor.putInt(THEME_KEY, R.layout.input_7).commit();
                break;
            case R.id.theme8_imageButton:
                editor.putInt(THEME_KEY, R.layout.input_8).commit();
                break;
            case R.id.theme9_imageButton:
                editor.putInt(THEME_KEY, R.layout.input_9).commit();
                break;
            case R.id.theme10_imageButton:
                editor.putInt(THEME_KEY, R.layout.input_10).commit();
                break;
            default:
                break;
        }

        Toast.makeText(this, "Theme is selected.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}