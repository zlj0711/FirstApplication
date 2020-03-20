package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int count = 0;
    public void commit(View v){
        EditText editText = (EditText)findViewById(R.id.editText);
        String txtN = editText.getText().toString();
        count ++;
        if(count % 12 == 1){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox4);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        if(count % 12 == 2){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox5);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        if(count % 12 == 3){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox6);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        if(count % 12 == 4){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox7);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        if(count % 12 == 5){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox8);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        if(count % 12 == 6){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox9);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        if(count % 12 == 7){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox10);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        if(count % 12 == 8){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox11);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        if(count % 12 == 9){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox12);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        if(count % 12 == 10){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox13);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        if(count % 12 == 11){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox14);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        if(count % 12 == 12){
            CheckBox checkN = (CheckBox)findViewById(R.id.checkBox15);
            checkN.setText(txtN);
            checkN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        buttonView.setTextColor(Color.RED);
                    }
                    else{
                        buttonView.setTextColor(Color.BLACK);
                    }
                }
            });
        }
    }
}
