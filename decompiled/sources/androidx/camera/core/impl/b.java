package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: compiled from: CameraCaptureResult.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    @NonNull
    public static CaptureResult a(CameraCaptureResult cameraCaptureResult) {
        return CameraCaptureResult.EmptyCameraCaptureResult.create().getCaptureResult();
    }

    public static void b(CameraCaptureResult cameraCaptureResult, @NonNull ExifData.Builder builder) {
        builder.setFlashState(cameraCaptureResult.getFlashState());
    }
}
