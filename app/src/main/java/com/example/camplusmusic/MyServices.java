package com.example.camplusmusic;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

import java.security.Provider;
import java.util.List;
import java.util.Map;



public class MyServices extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
      //  return super.onStartCommand(intent, flags, startId);
        player = MediaPlayer.create(this,
                Settings.System.DEFAULT_NOTIFICATION_URI);
        player.setLooping(true);
        player.start();
        return START_STICKY;

    }
    private MediaPlayer player;
    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
        }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}




