package com.example.comrules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startDoc(View view) {
        Intent DocIntent  = new Intent(MainActivity.this, Doc.class);
        startActivity(DocIntent); // запускаем activityDoc

    }

    public void startMethods(View view) {
        Intent MethodsIntent  = new Intent(MainActivity.this, Methods.class);
        startActivity(MethodsIntent); // запускаем activityDoc
    }


    public void startСhar(View view) {
        Intent CharIntent  = new Intent(MainActivity.this, Character.class);
        startActivity(CharIntent); // запускаем activityDoc
    }

    public void startRules(View view) {
        Intent RulesIntent  = new Intent(MainActivity.this, Rules.class);
        startActivity(RulesIntent); // запускаем activityDoc
    }

    public void startMayday(View view) {
        Intent MaydayIntent  = new Intent(MainActivity.this, Mayday.class);
        startActivity(MaydayIntent); // запускаем activityDoc
    }

    public void startAudio(View view) {
        Intent AudioIntent  = new Intent(MainActivity.this, Audio.class);
        startActivity(AudioIntent); // запускаем activityDoc
    }
}