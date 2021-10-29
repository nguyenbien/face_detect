package com.msb.msb_ekyc_face_detect_camera.core.ekyc;

import android.os.CountDownTimer;

import com.msb.msb_ekyc_face_detect_camera.entity.DetectionParams;
import com.msb.msb_ekyc_face_detect_camera.entity.Gesture;

import java.io.IOException;

interface EKYCInterface {
   void startDetection(CameraSourcePreview var1, GraphicOverlay var2, DetectionParams var3);

   CountDownTimer detectGesture(Gesture var1);

   void onPause();

   void onResume() throws IOException;

   void onDestroy();

   void stopDetection() throws IOException;
}
