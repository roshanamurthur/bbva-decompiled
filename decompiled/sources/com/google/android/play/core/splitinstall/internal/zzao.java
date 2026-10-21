package com.google.android.play.core.splitinstall.internal;

import android.os.Build;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzao {
    public static zzan zza() {
        switch (Build.VERSION.SDK_INT) {
            case 23:
                return new af.d();
            case 24:
                return new af.e();
            case 25:
                return new h();
            case 26:
                return new k();
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new l();
                }
                break;
        }
        return new m();
    }
}
