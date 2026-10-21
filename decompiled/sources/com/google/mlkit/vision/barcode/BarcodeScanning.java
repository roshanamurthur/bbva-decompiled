package com.google.mlkit.vision.barcode;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.internal.zze;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public class BarcodeScanning {
    @NonNull
    public static BarcodeScanner getClient() {
        return ((zze) MlKitContext.getInstance().get(zze.class)).zza();
    }

    @NonNull
    public static BarcodeScanner getClient(@NonNull BarcodeScannerOptions barcodeScannerOptions) {
        Preconditions.checkNotNull(barcodeScannerOptions, "You must provide a valid BarcodeScannerOptions.");
        return ((zze) MlKitContext.getInstance().get(zze.class)).zzb(barcodeScannerOptions);
    }
}
