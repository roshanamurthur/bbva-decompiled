package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode.zzki;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkz;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zznp;
import com.google.android.gms.internal.mlkit_vision_barcode.zznx;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzf f49560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorSelector f49561b;

    public zze(zzf zzfVar, ExecutorSelector executorSelector) {
        this.f49560a = zzfVar;
        this.f49561b = executorSelector;
    }

    public final BarcodeScannerImpl zza() {
        return zzb(BarcodeScannerImpl.v0);
    }

    public final BarcodeScannerImpl zzb(@NonNull BarcodeScannerOptions barcodeScannerOptions) {
        zzi zziVar = (zzi) this.f49560a.get(barcodeScannerOptions);
        Executor executorToUse = this.f49561b.getExecutorToUse(barcodeScannerOptions.zzb());
        zznm zznmVarZzb = zznx.zzb(zzb.zzd());
        BarcodeScannerImpl barcodeScannerImpl = new BarcodeScannerImpl(zziVar, executorToUse);
        zzkx zzkxVar = new zzkx();
        zzkxVar.zzi(zzb.zzc(barcodeScannerOptions));
        zzkz zzkzVarZzj = zzkxVar.zzj();
        zzkl zzklVar = new zzkl();
        zzklVar.zze(zzb.b() ? zzki.TYPE_THICK : zzki.TYPE_THIN);
        zzklVar.zzg(zzkzVarZzj);
        zznmVarZzb.zze(zznp.zze(zzklVar, 1), zzkk.ON_DEVICE_BARCODE_CREATE);
        return barcodeScannerImpl;
    }
}
