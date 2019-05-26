package com.example.customspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<CountryItem> countryItems;
    private CountryAdapter countryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //now we have to create ArrayList and fill with items and we are creating in seprate method
        //call that method
        intiList();

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        countryAdapter = new CountryAdapter(this,countryItems);
        spinner.setAdapter(countryAdapter);

      spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              //here we want country name when we click
              //so we need refrence of our clicked item
              CountryItem clickedItem = (CountryItem) parent.getItemAtPosition(position);
              String clickedCountryName = clickedItem.getCountry_name();
              Toast.makeText(MainActivity.this, clickedCountryName+"Selected", Toast.LENGTH_SHORT).show();
          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });
    }

    private void intiList() {
          countryItems = new ArrayList<>();
         countryItems.add(new CountryItem("India",R.drawable.india));
         countryItems.add(new CountryItem("USA",R.drawable.usa));
         countryItems.add(new CountryItem("China",R.drawable.china));
         countryItems.add(new CountryItem("Canada",R.drawable.canda));
         countryItems.add(new CountryItem("Pakistan",R.drawable.pakistan));

    }
}
