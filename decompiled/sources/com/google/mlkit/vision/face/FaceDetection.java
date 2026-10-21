package com.google.mlkit.vision.face;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.face.internal.zzc;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class FaceDetection {
    @NonNull
    public static FaceDetector getClient() {
        return ((zzc) MlKitContext.getInstance().get(zzc.class)).zza();
    }

    @NonNull
    public static FaceDetector getClient(@NonNull FaceDetectorOptions faceDetectorOptions) {
        Preconditions.checkNotNull(faceDetectorOptions, "You must provide a valid FaceDetectorOptions.");
        return ((zzc) MlKitContext.getInstance().get(zzc.class)).zzb(faceDetectorOptions);
    }
}
