package com.msb.msb_ekyc_face_detect_camera.core.ekyc;

import android.graphics.Bitmap;

import com.google.mlkit.common.MlKitException;

import java.nio.ByteBuffer;

interface VisionImageProcessor {
   void process(ByteBuffer var1, FrameMetadata var2, GraphicOverlay var3) throws MlKitException;

   void process(Bitmap var1, GraphicOverlay var2);

   void stop();

}
