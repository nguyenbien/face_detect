package com.msb.msb_ekyc_face_detect_camera.misc;

import androidx.annotation.Keep;

@Keep
public enum DetectionEvent {
   STARTED,
   SUCCESS,
   TIME_OUT,
   MULTIPLE_FACE,
   LOST_FACE,
   FAILED;
}
