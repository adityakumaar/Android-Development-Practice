package com.example.androidspinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
//  import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    //declaring a Spinner object
    Spinner spinnerCountry;
    //Declaring a string array
    String[] countryName = {"India", "USA", "China", "Japan", "Other"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerCountry = (Spinner)findViewById(R.id.spinnerCountry);
        spinnerCountry.setOnItemSelectedListener(this);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter adapterspinner = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countryName);
        // Specify the layout to use when the list of choices appears
        adapterspinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerCountry.setAdapter(adapterspinner);
    }
    //method for displaying toast messages
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id){
        Toast.makeText(getApplicationContext(), countryName[position], Toast.LENGTH_LONG).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0){
        //do nothing, just chill
    }
}