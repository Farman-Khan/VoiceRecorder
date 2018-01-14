package com.techtouch.voicerecorder;

import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.io.File;

/**
 * Created by Farman on 1/6/2018.
 */

public class RecordingActivity extends AppCompatActivity {


    private String mFilePath=null;
    private MediaRecorder mediaRecorder = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recording);
    }


    public void startRecording(View view) {
         mFilePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        mFilePath += "/VoiceRecorder/MyVoice";

        File file = new File(mFilePath);

         mediaRecorder = new MediaRecorder();
         mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
         mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
         mediaRecorder.setOutputFile(mFilePath);
        mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
        mediaRecorder.setAudioChannels(1);


        try{

            mediaRecorder.prepare();
            mediaRecorder.start();

        }catch (Exception e){
            Log.e("FK", "MedaiRecorder Prepare failed");
        }


    }

    public void stoptRecording(View view) {

        mediaRecorder.stop();
        mediaRecorder.release();
    }
}
