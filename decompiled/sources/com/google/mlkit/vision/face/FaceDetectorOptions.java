package com.google.mlkit.vision.face;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class FaceDetectorOptions {
    public static final int CLASSIFICATION_MODE_ALL = 2;
    public static final int CLASSIFICATION_MODE_NONE = 1;
    public static final int CONTOUR_MODE_ALL = 2;
    public static final int CONTOUR_MODE_NONE = 1;
    public static final int LANDMARK_MODE_ALL = 2;
    public static final int LANDMARK_MODE_NONE = 1;
    public static final int PERFORMANCE_MODE_ACCURATE = 2;
    public static final int PERFORMANCE_MODE_FAST = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @LandmarkMode
    public final int f49610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ContourMode
    public final int f49611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ClassificationMode
    public final int f49612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @PerformanceMode
    public final int f49613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f49614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f49615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Executor f49616g;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @LandmarkMode
        public int f49617a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ContourMode
        public int f49618b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ClassificationMode
        public int f49619c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @PerformanceMode
        public int f49620d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f49621e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f49622f = 0.1f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Executor f49623g;

        @NonNull
        public FaceDetectorOptions build() {
            return new FaceDetectorOptions(this.f49617a, this.f49618b, this.f49619c, this.f49620d, this.f49621e, this.f49622f, this.f49623g);
        }

        @NonNull
        public Builder enableTracking() {
            this.f49621e = true;
            return this;
        }

        @NonNull
        public Builder setClassificationMode(@ClassificationMode int i10) {
            this.f49619c = i10;
            return this;
        }

        @NonNull
        public Builder setContourMode(@ContourMode int i10) {
            this.f49618b = i10;
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            this.f49623g = executor;
            return this;
        }

        @NonNull
        public Builder setLandmarkMode(@LandmarkMode int i10) {
            this.f49617a = i10;
            return this;
        }

        @NonNull
        public Builder setMinFaceSize(float f6) {
            this.f49622f = f6;
            return this;
        }

        @NonNull
        public Builder setPerformanceMode(@PerformanceMode int i10) {
            this.f49620d = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface ClassificationMode {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface ContourMode {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface LandmarkMode {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface PerformanceMode {
    }

    public /* synthetic */ FaceDetectorOptions(int i10, int i11, int i12, int i13, boolean z10, float f6, Executor executor) {
        this.f49610a = i10;
        this.f49611b = i11;
        this.f49612c = i12;
        this.f49613d = i13;
        this.f49614e = z10;
        this.f49615f = f6;
        this.f49616g = executor;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FaceDetectorOptions)) {
            return false;
        }
        FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) obj;
        return Float.floatToIntBits(this.f49615f) == Float.floatToIntBits(faceDetectorOptions.f49615f) && Objects.equal(Integer.valueOf(this.f49610a), Integer.valueOf(faceDetectorOptions.f49610a)) && Objects.equal(Integer.valueOf(this.f49611b), Integer.valueOf(faceDetectorOptions.f49611b)) && Objects.equal(Integer.valueOf(this.f49613d), Integer.valueOf(faceDetectorOptions.f49613d)) && Objects.equal(Boolean.valueOf(this.f49614e), Boolean.valueOf(faceDetectorOptions.f49614e)) && Objects.equal(Integer.valueOf(this.f49612c), Integer.valueOf(faceDetectorOptions.f49612c)) && Objects.equal(this.f49616g, faceDetectorOptions.f49616g);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Float.floatToIntBits(this.f49615f)), Integer.valueOf(this.f49610a), Integer.valueOf(this.f49611b), Integer.valueOf(this.f49613d), Boolean.valueOf(this.f49614e), Integer.valueOf(this.f49612c), this.f49616g);
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("FaceDetectorOptions");
        zzvVarZza.zzb("landmarkMode", this.f49610a);
        zzvVarZza.zzb("contourMode", this.f49611b);
        zzvVarZza.zzb("classificationMode", this.f49612c);
        zzvVarZza.zzb("performanceMode", this.f49613d);
        zzvVarZza.zzd("trackingEnabled", this.f49614e);
        zzvVarZza.zza("minFaceSize", this.f49615f);
        return zzvVarZza.toString();
    }

    public final float zza() {
        return this.f49615f;
    }

    @ClassificationMode
    public final int zzb() {
        return this.f49612c;
    }

    @ContourMode
    public final int zzc() {
        return this.f49611b;
    }

    @LandmarkMode
    public final int zzd() {
        return this.f49610a;
    }

    @PerformanceMode
    public final int zze() {
        return this.f49613d;
    }

    @Nullable
    public final Executor zzf() {
        return this.f49616g;
    }

    public final boolean zzg() {
        return this.f49614e;
    }
}
