package com.google.mlkit.vision.face.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import com.google.android.gms.tasks.Task;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class FaceDetectorImpl extends MobileVisionBase<List<Face>> implements FaceDetector {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @VisibleForTesting
    public static final FaceDetectorOptions f49626w0 = new FaceDetectorOptions.Builder().build();
    public final boolean v0;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FaceDetectorImpl(zzh zzhVar, ExecutorSelector executorSelector, FaceDetectorOptions faceDetectorOptions) {
        Executor executorToUse = executorSelector.getExecutorToUse(faceDetectorOptions.zzf());
        zzoc zzocVarZzb = zzon.zzb(zzj.zzb());
        super(zzhVar, executorToUse);
        boolean zA = zzj.a();
        this.v0 = zA;
        zzku zzkuVar = new zzku();
        zzkuVar.zze(zA ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzlj zzljVar = new zzlj();
        zzljVar.zze(zzj.zza(faceDetectorOptions));
        zzkuVar.zzg(zzljVar.zzi());
        zzocVarZzb.zzd(zzof.zzg(zzkuVar, 1), zzkt.ON_DEVICE_FACE_CREATE);
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
        return 2;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    @NonNull
    public final Feature[] getOptionalFeatures() {
        return this.v0 ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_FACE};
    }

    @Override // com.google.mlkit.vision.face.FaceDetector
    @NonNull
    public final Task<List<Face>> process(@NonNull MlImage mlImage) {
        return super.processBase(mlImage);
    }

    @Override // com.google.mlkit.vision.face.FaceDetector
    @NonNull
    public final Task<List<Face>> process(@NonNull InputImage inputImage) {
        return super.processBase(inputImage);
    }
}
