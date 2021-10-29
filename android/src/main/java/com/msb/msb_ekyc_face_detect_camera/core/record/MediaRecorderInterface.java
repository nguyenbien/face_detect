package com.msb.msb_ekyc_face_detect_camera.core.record;

import android.content.Context;

import com.msb.msb_ekyc_face_detect_camera.core.ekyc.OnRecorderEvents;

public interface MediaRecorderInterface {
   void initRecorder(Context var1);

   void startRecording();

   void stopRecording(OnRecorderEvents var1);

   void onFrame(byte[] var1, int var2, int var3, int var4);
}
