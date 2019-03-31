package com.example.notbad;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Energy extends AppCompatActivity {
    HashMap<Integer, Double> length = new HashMap<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.energy);

        final Spinner spinner_from = (Spinner) findViewById(R.id.spinner_from);
        final Spinner spinner_to = (Spinner) findViewById(R.id.spinner_to);
        final Button convert = (Button) findViewById(R.id.convert);
        final EditText from = (EditText) findViewById(R.id.value_from);
        final TextView to = (TextView) findViewById(R.id.value_to);
        initializeHashMap();

        List<String> units = new ArrayList<String>();
        units.add("Meter");
        units.add("Kilometer");
        units.add("Centimeter");
        units.add("Millimeter");
        units.add("Inch");
        units.add("Foot");
        units.add("Mile");
        units.add("Yard");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, units);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_from.setAdapter(dataAdapter);
        spinner_to.setAdapter(dataAdapter);

        spinner_from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        spinner_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                to.setText(convert(length, from.getText().toString(),spinner_from.getSelectedItemPosition(), spinner_to.getSelectedItemPosition()));
            }
        });
    }

    private void initializeHashMap() {
        length.put(0, 1.0);
        length.put(1, 1000.0);
        length.put(2, 0.01);
        length.put(3, 0.001);
        length.put(4, 0.0254);
        length.put(5, 0.3048);
        length.put(6, 1609.34);
        length.put(7, 0.9144);
    }

    private String convert(HashMap<Integer, Double> converter, String value, int from, int to) {
        try {
            double d = Double.parseDouble(value);
            d = d * converter.get(from) / converter.get(to);
            return String.format("%.10f", d);
        } catch (Exception e) {
            return "N/A";
        }
    }

}
