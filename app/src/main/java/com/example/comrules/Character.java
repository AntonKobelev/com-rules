package com.example.comrules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Character extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.front2,"Радиостанция спереди"));
        slideModels.add(new SlideModel(R.drawable.left2,"Радиостанция слева"));
        slideModels.add(new SlideModel(R.drawable.right2,"Радиостанция справа"));
        slideModels.add(new SlideModel(R.drawable.back2,"Задняя часть радиостанции"));
        slideModels.add(new SlideModel(R.drawable.accum,"Радиостанция в разобранном состоянии"));
        slideModels.add(new SlideModel(R.drawable.volume,"Органы управления радиостанцией"));
        slideModels.add(new SlideModel(R.drawable.charge_back,"Нижняя часть зарядного устройства"));
        slideModels.add(new SlideModel(R.drawable.charge_front,"Верхняя часть зарядного устройства"));
        imageSlider.setImageList(slideModels,true);

    }
}