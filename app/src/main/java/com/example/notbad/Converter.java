package com.example.notbad;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;

public class Converter extends Fragment {

    Button distance;
    Button energy;
    Button force;
    Button sound;
    Button speed;
    Button temperature;
    Button time;
    Button weight;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.converter_frgment, container, false);

        distance = (Button) view.findViewById(R.id.CLength);
        distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Distance.class);
                startActivity(intent);
            }
        });

        energy = (Button) view.findViewById(R.id.CEnergy);
        energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Energy.class);
                startActivity(intent);
            }
        });

        force = (Button) view.findViewById(R.id.CForce);
        force.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Force.class);
                startActivity(intent);
            }
        });

        sound = (Button) view.findViewById(R.id.CSound);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Sound.class);
                startActivity(intent);
            }
        });

        speed = (Button) view.findViewById(R.id.CSpeed);
        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Speed.class);
                startActivity(intent);
            }
        });

        temperature = (Button) view.findViewById(R.id.CTemperature);
        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Temperature.class);
                startActivity(intent);
            }
        });

        time = (Button) view.findViewById(R.id.CTime);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Time.class);
                startActivity(intent);
            }
        });

        weight = (Button) view.findViewById(R.id.CWeight);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Weight.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
