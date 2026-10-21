package com.google.android.gms.internal.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zza {
    public static final int zza;

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    static {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 33554432;
        if (i10 < 31) {
            if (i10 >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() != 1 || str.charAt(0) < 'S' || str.charAt(0) > 'Z') {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
        }
        zza = i11;
    }

    public static PendingIntent zza(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getBroadcast(context, 0, intent, i11);
    }
}
