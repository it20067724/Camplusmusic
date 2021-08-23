package com.example.camplusmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnStart, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = findViewById(R.id.btn_add);
        btnStop = findViewById(R.id.btn_sign_in);

        //Initiating sounds
     /*
       MediaPlayer mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
*/

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("mcall1","btnstart clicked");
                startService(new Intent(MainActivity.this, MyServices.class));

            }

        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("mcall1","btnStop clicked");
                stopService(new Intent(MainActivity.this, MyServices.class));
            }
        }
        );

    }
}