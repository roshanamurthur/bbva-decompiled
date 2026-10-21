package com.google.android.gms.vision.face.mlkit;

import android.os.RemoteException;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zze {
    public static RemoteException zza(String str) {
        return PlatformVersion.isAtLeastIceCreamSandwichMR1() ? new RemoteException(str) : new RemoteException();
    }
}
