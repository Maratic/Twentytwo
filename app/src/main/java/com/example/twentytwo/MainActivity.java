package com.example.twentytwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

import com.example.twentytwo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);эту строчку заменяем следующими строчками
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final NumberPicker userTypePicker=findViewById(R.id.userTypePicker);
        userTypePicker.setMaxValue(1);//устанавливаем значение
        userTypePicker.setMinValue(0);
        userTypePicker.setDisplayedValues(new String[]{"Администратор","Клиент"});// замена чисел на значения
        findViewById(R.id.signInButtonAction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean admin=userTypePicker.getValue()==0;

            }
        });

    }

}