package com.example.mediatest;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaMetadata;import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;import android.os.Bundle;
import android.os.Handler;import android.provider.ContactsContract;
import android.view.MotionEvent;import android.view.View;
import android.widget.ImageButton;import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mediatest.R;

import java.io.IOException;
public class MainActivity extends AppCompatActivity {
    ImageButton btnPlay, btnFwd, btnBwd;
    ImageView img;
    SeekBar seekBar;
    Handler mHandler = new Handler();
    Runnable mRunnable;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.imageView);
        btnPlay = (ImageButton) findViewById(R.id.btnPlay);
        btnFwd = (ImageButton) findViewById(R.id.btnFwd);
        btnBwd = (ImageButton) findViewById(R.id.btnBwd);
        btnPlay = (ImageButton) findViewById(R.id.btnPlay);
    }
}