package com.alphacrown.socialemergencysystem.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

import com.alphacrown.socialemergencysystem.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Handle button click events here
        ImageButton imgBtnHome = findViewById(R.id.imageButton_wallet);
        imgBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent walletIntent = new Intent(v.getContext(), WalletActivity.class);
                startActivity(walletIntent);
            }
        });
        // Thrift button click
        ImageButton imgBtnThrift = findViewById(R.id.imageButton_thrift);
        imgBtnThrift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thriftIntent = new Intent(view.getContext(), ThriftActivity.class);
                startActivity(thriftIntent);
            }
        });
        // Loan button click
        ImageButton imgBtnLoan = findViewById(R.id.imageButton_loans);
        imgBtnLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loanIntent = new Intent(view.getContext(), LoanActivity.class);
                startActivity(loanIntent);
            }
        });
        // Store button click
        ImageButton imgBtnStore = findViewById(R.id.imageButton_store);
        imgBtnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(view.getContext(), StoreActivity.class);
                startActivity(storeIntent);
            }
        });
        // Bills button click
        ImageButton imgBtnBills = findViewById(R.id.imageButton_bills);
        imgBtnBills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent billsIntent = new Intent(view.getContext(), BillActivity.class);
                startActivity(billsIntent);
            }
        });
        // Coperatives button click
        ImageButton imgBtnCoperatives = findViewById(R.id.imageButton_coperatives);
        imgBtnCoperatives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coperativesIntent = new Intent(view.getContext(), CoperativeActivity.class);
                startActivity(coperativesIntent);
            }
        });
        // Support button click
        ImageButton imgBtnSupport = findViewById(R.id.imageButton_support);
        imgBtnSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent supportIntent = new Intent(view.getContext(), SupportActivity.class);
                startActivity(supportIntent);
            }
        });
        // Maps image button
//        ImageButton imgBtnMaps = findViewById(R.id.imageButton_coperatives);
//        imgBtnMaps.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mapsIntent = new Intent(v.getContext(), MapsActivity.class);
//                startActivity(mapsIntent);
//            }
//        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
