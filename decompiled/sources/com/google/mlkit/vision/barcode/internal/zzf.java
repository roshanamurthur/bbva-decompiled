package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zznx;
import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import sg.b;
import sg.c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzf extends LazyInstanceMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MlKitContext f49562a;

    public zzf(MlKitContext mlKitContext) {
        this.f49562a = mlKitContext;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final Object create(Object obj) {
        BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
        MlKitContext mlKitContext = this.f49562a;
        Context applicationContext = mlKitContext.getApplicationContext();
        zznm zznmVarZzb = zznx.zzb(zzb.zzd());
        zzcc zzccVar = b.f93184h;
        return new zzi(mlKitContext, barcodeScannerOptions, (DynamiteModule.getLocalVersion(applicationContext, ModuleDescriptor.MODULE_ID) <= 0 && GoogleApiAvailabilityLight.getInstance().getApkVersion(applicationContext) < 204500000) ? new c(applicationContext, barcodeScannerOptions, zznmVarZzb) : new b(applicationContext, barcodeScannerOptions, zznmVarZzb), zznmVarZzb);
    }
}
