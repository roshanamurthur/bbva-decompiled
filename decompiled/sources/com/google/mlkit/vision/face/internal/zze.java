package com.google.mlkit.vision.face.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import vg.a;
import vg.c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zze extends LazyInstanceMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MlKitContext f49629a;

    public zze(MlKitContext mlKitContext) {
        this.f49629a = mlKitContext;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final Object create(Object obj) {
        FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) obj;
        Context applicationContext = this.f49629a.getApplicationContext();
        zzoc zzocVarZzb = zzon.zzb(zzj.zzb());
        return new zzh(zzon.zzb(zzj.zzb()), faceDetectorOptions, (DynamiteModule.getLocalVersion(applicationContext, ModuleDescriptor.MODULE_ID) <= 0 && GoogleApiAvailabilityLight.getInstance().getApkVersion(applicationContext) < 204500000) ? new c(applicationContext, faceDetectorOptions, zzocVarZzb) : new a(applicationContext, faceDetectorOptions, zzocVarZzb));
    }
}
