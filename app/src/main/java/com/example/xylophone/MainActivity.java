package com.example.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    final int NO_OF_SIMANTANEOUS_SOUNDS =7;
    final float LEFT_VOLUME = 1.0f;
    final float RIGHT_VOLIUME = 1.0f;
    final int NO_LOOP=0;
    final int PRIORITY =0;
    final float NORMAL_PLAY_RATE = 1.0f;


    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(NO_OF_SIMANTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);
        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,2);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,3);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,4);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,5);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,6);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,7);

    }
    public void playc (View V){
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLIUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playd (View V){
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLIUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playe (View V){
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLIUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playf (View V){
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLIUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playg (View V){
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLIUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playa (View V){
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLIUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playb (View V){
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLIUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }



}
