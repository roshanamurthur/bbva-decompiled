package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzbn extends zzl implements zzbo {
    public static zzbo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return iInterfaceQueryLocalInterface instanceof zzbo ? (zzbo) iInterfaceQueryLocalInterface : new zzbm(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }
}
