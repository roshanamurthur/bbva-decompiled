package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzbr;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static zzp f46373a;

    public static synchronized zzp zza(Context context) {
        try {
            if (f46373a == null) {
                zzc zzcVar = new zzc();
                zzcVar.zza(new zzac(zzbr.zza(context)));
                f46373a = zzcVar.zzb();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46373a;
    }
}
