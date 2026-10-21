package com.google.mlkit.vision.face.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.vision.face.FaceDetectorOptions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zze f49627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorSelector f49628b;

    public zzc(zze zzeVar, ExecutorSelector executorSelector) {
        this.f49627a = zzeVar;
        this.f49628b = executorSelector;
    }

    @NonNull
    public final FaceDetectorImpl zza() {
        return zzb(FaceDetectorImpl.f49626w0);
    }

    @NonNull
    public final FaceDetectorImpl zzb(@NonNull FaceDetectorOptions faceDetectorOptions) {
        Preconditions.checkNotNull(faceDetectorOptions, "You must provide a valid FaceDetectorOptions.");
        return new FaceDetectorImpl((zzh) this.f49627a.get(faceDetectorOptions), this.f49628b, faceDetectorOptions);
    }
}
