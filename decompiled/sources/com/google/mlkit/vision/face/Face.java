package com.google.mlkit.vision.face;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.g0;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class Face {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f49598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f49600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f49601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f49602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f49603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f49604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f49605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray f49606i = new SparseArray();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f49607j = new SparseArray();

    public Face(@NonNull zzf zzfVar, @Nullable Matrix matrix) {
        float f6 = zzfVar.zzc;
        float f10 = zzfVar.zze / 2.0f;
        float f11 = zzfVar.zzd;
        float f12 = zzfVar.zzf / 2.0f;
        Rect rect = new Rect((int) (f6 - f10), (int) (f11 - f12), (int) (f6 + f10), (int) (f11 + f12));
        this.f49598a = rect;
        if (matrix != null) {
            CommonConvertUtils.transformRect(rect, matrix);
        }
        this.f49599b = zzfVar.zzb;
        for (zzn zznVar : zzfVar.zzj) {
            if (a(zznVar.zzd)) {
                PointF pointF = new PointF(zznVar.zzb, zznVar.zzc);
                if (matrix != null) {
                    CommonConvertUtils.transformPointF(pointF, matrix);
                }
                SparseArray sparseArray = this.f49606i;
                int i10 = zznVar.zzd;
                sparseArray.put(i10, new FaceLandmark(i10, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.zzn) {
            int i11 = zzdVar.zzb;
            if (i11 <= 15 && i11 > 0) {
                PointF[] pointFArr = zzdVar.zza;
                pointFArr.getClass();
                int length = pointFArr.length;
                long j10 = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j10 > 2147483647L ? Integer.MAX_VALUE : (int) j10);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    CommonConvertUtils.transformPointList(arrayList, matrix);
                }
                this.f49607j.put(i11, new FaceContour(i11, arrayList));
            }
        }
        this.f49603f = zzfVar.zzi;
        this.f49604g = zzfVar.zzg;
        this.f49605h = zzfVar.zzh;
        this.f49602e = zzfVar.zzm;
        this.f49601d = zzfVar.zzk;
        this.f49600c = zzfVar.zzl;
    }

    public static boolean a(@FaceLandmark.LandmarkType int i10) {
        return i10 == 0 || i10 == 1 || i10 == 7 || i10 == 3 || i10 == 9 || i10 == 4 || i10 == 10 || i10 == 5 || i10 == 11 || i10 == 6;
    }

    @NonNull
    public List<FaceContour> getAllContours() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f49607j;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add((FaceContour) sparseArray.valueAt(i10));
        }
        return arrayList;
    }

    @NonNull
    public List<FaceLandmark> getAllLandmarks() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f49606i;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add((FaceLandmark) sparseArray.valueAt(i10));
        }
        return arrayList;
    }

    @NonNull
    public Rect getBoundingBox() {
        return this.f49598a;
    }

    @Nullable
    public FaceContour getContour(@FaceContour.ContourType int i10) {
        return (FaceContour) this.f49607j.get(i10);
    }

    public float getHeadEulerAngleX() {
        return this.f49603f;
    }

    public float getHeadEulerAngleY() {
        return this.f49604g;
    }

    public float getHeadEulerAngleZ() {
        return this.f49605h;
    }

    @Nullable
    public FaceLandmark getLandmark(@FaceLandmark.LandmarkType int i10) {
        return (FaceLandmark) this.f49606i.get(i10);
    }

    @Nullable
    public Float getLeftEyeOpenProbability() {
        float f6 = this.f49602e;
        if (f6 < 0.0f || f6 > 1.0f) {
            return null;
        }
        return Float.valueOf(this.f49601d);
    }

    @Nullable
    public Float getRightEyeOpenProbability() {
        float f6 = this.f49600c;
        if (f6 < 0.0f || f6 > 1.0f) {
            return null;
        }
        return Float.valueOf(f6);
    }

    @Nullable
    public Float getSmilingProbability() {
        float f6 = this.f49602e;
        if (f6 < 0.0f || f6 > 1.0f) {
            return null;
        }
        return Float.valueOf(f6);
    }

    @Nullable
    public Integer getTrackingId() {
        int i10 = this.f49599b;
        if (i10 == -1) {
            return null;
        }
        return Integer.valueOf(i10);
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("Face");
        zzvVarZza.zzc("boundingBox", this.f49598a);
        zzvVarZza.zzb("trackingId", this.f49599b);
        zzvVarZza.zza("rightEyeOpenProbability", this.f49600c);
        zzvVarZza.zza("leftEyeOpenProbability", this.f49601d);
        zzvVarZza.zza("smileProbability", this.f49602e);
        zzvVarZza.zza("eulerX", this.f49603f);
        zzvVarZza.zza("eulerY", this.f49604g);
        zzvVarZza.zza("eulerZ", this.f49605h);
        zzv zzvVarZza2 = zzw.zza("Landmarks");
        for (int i10 = 0; i10 <= 11; i10++) {
            if (a(i10)) {
                zzvVarZza2.zzc(g0.c("landmark_", i10), getLandmark(i10));
            }
        }
        zzvVarZza.zzc("landmarks", zzvVarZza2.toString());
        zzv zzvVarZza3 = zzw.zza("Contours");
        for (int i11 = 1; i11 <= 15; i11++) {
            zzvVarZza3.zzc(g0.c("Contour_", i11), getContour(i11));
        }
        zzvVarZza.zzc("contours", zzvVarZza3.toString());
        return zzvVarZza.toString();
    }

    @NonNull
    public final SparseArray zza() {
        return this.f49607j;
    }

    public final void zzb(@NonNull SparseArray sparseArray) {
        SparseArray sparseArray2 = this.f49607j;
        sparseArray2.clear();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), (FaceContour) sparseArray.valueAt(i10));
        }
    }

    public final void zzc(int i10) {
        this.f49599b = -1;
    }

    public Face(@NonNull zzow zzowVar, @Nullable Matrix matrix) {
        Rect rectZzh = zzowVar.zzh();
        this.f49598a = rectZzh;
        if (matrix != null) {
            CommonConvertUtils.transformRect(rectZzh, matrix);
        }
        this.f49599b = zzowVar.zzg();
        for (zzpc zzpcVar : zzowVar.zzj()) {
            if (a(zzpcVar.zza())) {
                PointF pointFZzb = zzpcVar.zzb();
                if (matrix != null) {
                    CommonConvertUtils.transformPointF(pointFZzb, matrix);
                }
                this.f49606i.put(zzpcVar.zza(), new FaceLandmark(zzpcVar.zza(), pointFZzb));
            }
        }
        for (zzos zzosVar : zzowVar.zzi()) {
            int iZza = zzosVar.zza();
            if (iZza <= 15 && iZza > 0) {
                List listZzb = zzosVar.zzb();
                listZzb.getClass();
                ArrayList arrayList = new ArrayList(listZzb);
                if (matrix != null) {
                    CommonConvertUtils.transformPointList(arrayList, matrix);
                }
                this.f49607j.put(iZza, new FaceContour(iZza, arrayList));
            }
        }
        this.f49603f = zzowVar.zzf();
        this.f49604g = zzowVar.zzb();
        this.f49605h = -zzowVar.zzd();
        this.f49602e = zzowVar.zze();
        this.f49601d = zzowVar.zza();
        this.f49600c = zzowVar.zzc();
    }
}
