package com.example.comrules;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class Mayday_40_atmosphere extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageView playPause;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayday_40_atmosphere);
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.mayday40atmosphere); // проинициализируем медиаплеер
        playPause = findViewById(R.id.playIconImageView);
        seekBar = findViewById(R.id.seekBar);
        seekBar.setMax(mediaPlayer.getDuration()); // метод возвращает длительность трека
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // для реализации перемтоки, установим слушатель
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser){
                    mediaPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                seekBar.setProgress(mediaPlayer.getCurrentPosition());
            }
        }, 0, 1000); // задержка старта 0, периодичноть 1 сек
    }
    public void play(View view) {
        if (mediaPlayer.isPlaying()){ // если плеер играет то установим паузу и поменяем иконку
            mediaPlayer.pause();
            playPause.setImageResource(R.drawable.ic_baseline_play_arrow_24);
        } else {
            seekBar.setProgress(0);
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
            playPause.setImageResource(R.drawable.ic_baseline_pause_24);
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
    }
}