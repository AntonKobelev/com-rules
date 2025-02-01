package com.example.comrules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class Audio extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
    }

    public void startArrival(View view) {
        Intent ArrivalIntent  = new Intent(Audio.this, Arrival.class);
        startActivity(ArrivalIntent); // запускаем activityDoc
    }

    public void startExploration(View view) {
        Intent ExplorationIntent  = new Intent(Audio.this, Exploration.class);
        startActivity(ExplorationIntent); // запускаем activityDoc
    }

    public void startLocalization(View view) {
        Intent LocalizationIntent  = new Intent(Audio.this, Localization.class);
        startActivity(LocalizationIntent); // запускаем activityDoc
    }

    public void startEmergencyCall(View view) {
        Intent EmergencyCallIntent  = new Intent(Audio.this, Emergency_call.class);
        startActivity(EmergencyCallIntent); // запускаем activityDoc
    }

    public void startReturn(View view) {
        Intent ReturnIntent  = new Intent(Audio.this, Return.class);
        startActivity(ReturnIntent); // запускаем activityDoc
    }

    public void startVictims(View view) {
        Intent VictimsIntent  = new Intent(Audio.this, Victims.class);
        startActivity(VictimsIntent); // запускаем activityDoc
    }

    public void startAmbulanceMap(View view) {
        Intent AmbulanceIntent  = new Intent(Audio.this, Ambulance_map.class);
        startActivity(AmbulanceIntent); // запускаем activityDoc
    }

    public void startFireRequest(View view) {
        Intent FireRequestIntent  = new Intent(Audio.this, Fire_request.class);
        startActivity(FireRequestIntent); // запускаем activityDoc
    }

    public void startBroadcast(View view) {
        Intent BroadcastIntent  = new Intent(Audio.this, broadcast.class);
        startActivity(BroadcastIntent); // запускаем activityDoc
    }

    public void startOrderB(View view) {
        Intent OrderBIntent  = new Intent(Audio.this, Order_b.class);
        startActivity(OrderBIntent); // запускаем activityDoc
    }

    public void startExecutingB(View view) {
        Intent ExecutingBIntent  = new Intent(Audio.this, Executing_b.class);
        startActivity(ExecutingBIntent); // запускаем activityDoc
    }

    public void startOrderVictims(View view) {
        Intent OrderVictimsIntent  = new Intent(Audio.this, Order_victims.class);
        startActivity(OrderVictimsIntent); // запускаем activityDoc

    }

    public void startExecutingVictims(View view) {
        Intent ExecutingVictimsIntent  = new Intent(Audio.this, Executing_victims.class);
        startActivity(ExecutingVictimsIntent); // запускаем activityDoc

    }

    public void startRepeat(View view) {
        Intent RepeatIntent  = new Intent(Audio.this, Repeat.class);
        startActivity(RepeatIntent); // запускаем activityDoc

    }

    public void startLadder(View view) {
        Intent LadderIntent  = new Intent(Audio.this, Ladder.class);
        startActivity(LadderIntent); // запускаем activityDoc
    }

    public void startMayday40Atmosphere(View view) {
        Intent Mayday40AtmosphereIntent  = new Intent(Audio.this, Mayday_40_atmosphere.class);
        startActivity(Mayday40AtmosphereIntent); // запускаем activityDoc
    }

    public void startMaydayLink(View view) {
        Intent MaydayLinkIntent  = new Intent(Audio.this, Mayday_link.class);
        startActivity(MaydayLinkIntent); // запускаем activityDoc
    }

    public void startMaydayTwo(View view) {
        Intent MaydayTwoIntent  = new Intent(Audio.this, Mayday_two.class);
        startActivity(MaydayTwoIntent); // запускаем activityDoc
    }

    public void startMaydayBurnout(View view) {
        Intent MaydayBurnoutIntent  = new Intent(Audio.this, Mayday_burnout.class);
        startActivity(MaydayBurnoutIntent); // запускаем activityDoc
    }
}