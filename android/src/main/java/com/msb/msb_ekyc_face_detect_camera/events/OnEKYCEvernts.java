package com.msb.msb_ekyc_face_detect_camera.events;

import com.msb.msb_ekyc_face_detect_camera.misc.DetectionEvent;

public interface OnEKYCEvernts {
   void detectionEvents(DetectionEvent var1, String var2);

   void onGestreDetectinCompleted(boolean var1, String var2);
}
