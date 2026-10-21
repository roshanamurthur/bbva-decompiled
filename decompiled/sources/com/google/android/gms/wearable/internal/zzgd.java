package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.WearableStatusCodes;

/* JADX INFO: loaded from: classes9.dex */
public final class zzgd {
    public static Status zzb(int i10) {
        return new Status(i10, WearableStatusCodes.getStatusCodeString(i10));
    }
}
