package com.pigllet.clonecowater;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


import com.google.android.material.navigation.NavigationView;
import com.pigllet.clonecowater.ui.home.HomeFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createFragment();
        initViews();
        actionToolbar();
        HomeFragment homeFragment = new HomeFragment();

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.nav_fragment, homeFragment, "ReortFragment")
                    .commit();
        }
    }

    private void createFragment() {


    }

    private void initViews(){
        drawerLayout = findViewById(R.id.drawerLayout);
        toolbar = findViewById(R.id.layoutToolbar);
        navigationView = findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.imgMenu:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.txtReport:
                Intent itHome = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(itHome);
                break;
            case R.id.txtGuide:
                break;
            case R.id.txtIntroduction:
                break;
            case R.id.txtSetting:
                break;
            case R.id.txtLogout:
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }

    }

    private void actionToolbar() {
        toolbar.setNavigationIcon(R.drawable.ic_baseline_dehaze_24);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_baseline_dehaze_24); // Set Icon
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
}