package com.google.android.gms.internal.mlkit_vision_barcode;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdc extends zzdd {
    public static int zza(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }
}
