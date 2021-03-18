package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void openNumbersList(View view){
            intent= new Intent(this, NumbersActivity.class);
            startActivity(intent);
        }
        public void openFamilyMembers(View view){
            intent= new Intent(this, FamilyActivity.class);
            startActivity(intent);
        }
        public void openColors(View view){
            intent= new Intent(this, ColorsActivity.class);
            startActivity(intent);
        }
        public void openPhrases(View view){
            intent= new Intent(this, PhrasesActivity.class);
            startActivity(intent);
        }

}