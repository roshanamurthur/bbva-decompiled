package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcc {

    @GuardedBy("DirectBootUtils.class")
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzcc() {
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0054 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:35:0x0058, B:36:0x005a, B:24:0x0031, B:26:0x0037, B:33:0x0054, B:31:0x0046), top: B:42:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0058 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:35:0x0058, B:36:0x005a, B:24:0x0031, B:26:0x0037, B:33:0x0054, B:31:0x0046), top: B:42:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x005d A[RETURN] */
    public static boolean zza(Context context) {
        boolean z10;
        if (zzb() && !zzb) {
            synchronized (zzcc.class) {
                try {
                    if (!zzb) {
                        int i10 = 1;
                        while (true) {
                            if (i10 <= 2) {
                                if (zza == null) {
                                    zza = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = zza;
                                if (userManager == null) {
                                    z10 = true;
                                } else {
                                    try {
                                        if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            zza = null;
                                        }
                                    } catch (NullPointerException e5) {
                                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e5);
                                        zza = null;
                                        i10++;
                                    }
                                }
                                if (z10) {
                                    zzb = true;
                                }
                                if (!z10) {
                                    return true;
                                }
                            }
                            z10 = false;
                            if (z10) {
                                zza = null;
                            }
                            if (z10) {
                                zzb = true;
                            }
                            if (!z10) {
                                return true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 24)
    public static boolean zzb() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
