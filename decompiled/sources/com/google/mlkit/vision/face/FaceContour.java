package com.google.mlkit.vision.face;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class FaceContour {
    public static final int FACE = 1;
    public static final int LEFT_CHEEK = 14;
    public static final int LEFT_EYE = 6;
    public static final int LEFT_EYEBROW_BOTTOM = 3;
    public static final int LEFT_EYEBROW_TOP = 2;
    public static final int LOWER_LIP_BOTTOM = 11;
    public static final int LOWER_LIP_TOP = 10;
    public static final int NOSE_BOTTOM = 13;
    public static final int NOSE_BRIDGE = 12;
    public static final int RIGHT_CHEEK = 15;
    public static final int RIGHT_EYE = 7;
    public static final int RIGHT_EYEBROW_BOTTOM = 5;
    public static final int RIGHT_EYEBROW_TOP = 4;
    public static final int UPPER_LIP_BOTTOM = 9;
    public static final int UPPER_LIP_TOP = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f49609b;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface ContourType {
    }

    public FaceContour(@ContourType int i10, @NonNull List list) {
        this.f49608a = i10;
        this.f49609b = list;
    }

    @ContourType
    public int getFaceContourType() {
        return this.f49608a;
    }

    @NonNull
    public List<PointF> getPoints() {
        return this.f49609b;
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("FaceContour");
        zzvVarZza.zzb("type", this.f49608a);
        zzvVarZza.zzc("points", this.f49609b.toArray());
        return zzvVarZza.toString();
    }
}
