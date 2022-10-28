package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.splashscreen.SplashScreen;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.tensorflow.lite.examples.classification.env.MyApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit ;


public class Home_page extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    BottomAppBar bottomAppBar;
    FloatingActionButton cameraBtn;
    private static final String TAG = "Bio GO";

    MyApplication myApplication = (MyApplication) this.getApplication();

    List<Species> speciesList;
    List<Species> foundSpecies;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);

        super.onCreate(savedInstanceState);

        // Keep the splash screen visible for this Activity
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
            setContentView(R.layout.activity_home_page);
        } catch (InterruptedException e) {
            e.printStackTrace();
            setContentView(R.layout.activity_home_page);
        }

        setContentView(R.layout.activity_home_page);

        List<Species> foundspecies = new ArrayList<Species>();

        speciesList = myApplication.getAllSpecies();

        // Display all the species who have been already found
        for (Species s : speciesList) {
            if (s.getWasFound() == true) {
                foundspecies.add(s);
            }
        }

        speciesList = foundspecies;

        Log.d(TAG, "OnCreate" + speciesList.toString());

        bottomAppBar = findViewById(R.id.bottomAppBar);
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    //openHome();
                    Toast.makeText(Home_page.this, "Já está em casa", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.colecao) {
                    Toast.makeText(Home_page.this, "Coleciona espécies", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

        cameraBtn = findViewById(R.id.cameraBtn);
        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Take user to the camera page
                openCamera();
            }
        });

        recyclerView = findViewById(R.id.species_recyclerView);

        recyclerView.setHasFixedSize(true);

        // Display a vertical grid with 3 columns
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(gridLayoutManager);

        mAdapter = new RecyclerViewAdapter(speciesList, this);
        recyclerView.setAdapter(mAdapter);

        // Dialog to show each species specific information
        dialog = new Dialog(this);
    }

    public void openCamera() {
        // Open CameraActivity
        Intent myIntent = new Intent(Home_page.this, ClassifierActivity.class);

        Home_page.this.startActivity(myIntent);
    }

}