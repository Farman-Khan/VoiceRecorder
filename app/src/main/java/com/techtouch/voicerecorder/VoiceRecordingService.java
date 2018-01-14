package com.techtouch.voicerecorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class VoiceRecordingService extends Service {
    public VoiceRecordingService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
