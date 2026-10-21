package com.google.mlkit.vision.face;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class FaceLandmark {
    public static final int LEFT_CHEEK = 1;
    public static final int LEFT_EAR = 3;
    public static final int LEFT_EYE = 4;
    public static final int MOUTH_BOTTOM = 0;
    public static final int MOUTH_LEFT = 5;
    public static final int MOUTH_RIGHT = 11;
    public static final int NOSE_BASE = 6;
    public static final int RIGHT_CHEEK = 7;
    public static final int RIGHT_EAR = 9;
    public static final int RIGHT_EYE = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f49625b;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface LandmarkType {
    }

    public FaceLandmark(@LandmarkType int i10, @NonNull PointF pointF) {
        this.f49624a = i10;
        this.f49625b = pointF;
    }

    @LandmarkType
    public int getLandmarkType() {
        return this.f49624a;
    }

    @NonNull
    public PointF getPosition() {
        return this.f49625b;
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("FaceLandmark");
        zzvVarZza.zzb("type", this.f49624a);
        zzvVarZza.zzc("position", this.f49625b);
        return zzvVarZza.toString();
    }
}
