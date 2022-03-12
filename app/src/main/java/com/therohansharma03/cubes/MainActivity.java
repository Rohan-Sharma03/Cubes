package com.therohansharma03.cubes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ListView listView;
    SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        listView = findViewById(R.id.mytable);
        seekbar = findViewById(R.id.seekBar);

        seekbar.setMax(2);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                Toast.makeText(MainActivity.this, "Populating table of " + progress, Toast.LENGTH_SHORT).show();
                populate(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void populate(int table){

        ArrayList<String> mulTable  = new ArrayList<>();
        if(table==1){
        for (int i = 1; i<=10;i++){
            mulTable.add(i + " X " + i +" X "+ i + " = " + i*i*i);
        }
            textView.setText(" Cube of  1 to 10 ");
        }
        else if(table==2){


            for (int i1 = 11; i1<=20;i1++){
                mulTable.add(i1 + " X " + i1+" X "+ i1 + " = " + i1*i1*i1);
            }
            textView.setText(" Cube of 11 to 20 ");
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mulTable);
        listView.setAdapter(arrayAdapter);



    }
}

