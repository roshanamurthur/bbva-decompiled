package com.veridas.camera.picture;

import android.graphics.Bitmap;
import com.veridas.camera.resolution.Resolution;
import com.veridas.graphics.Frame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public interface Picture {
    Bitmap getBitmap();

    ByteBuffer getBuffer();

    Object getRawData();

    byte[] getRawDataAsBytes();

    int[] getRawDataAsIntArray();

    Resolution getResolution();

    int getRotation();

    boolean isEmpty();

    boolean isMirrored();

    Frame toFrame();
}
