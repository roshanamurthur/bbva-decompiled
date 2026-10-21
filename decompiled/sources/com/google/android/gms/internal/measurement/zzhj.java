package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhj {
    static volatile zzhz zza = zzhz.zzc();
    private static final Object zzb = new Object();

    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (zza.zzb()) {
            return ((Boolean) zza.zza()).booleanValue();
        }
        synchronized (zzb) {
            try {
                if (zza.zzb()) {
                    return ((Boolean) zza.zza()).booleanValue();
                }
                try {
                    if (!"com.google.android.gms".equals(context.getPackageName())) {
                        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                        if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                        }
                        zza = zzhz.zzd(Boolean.valueOf(z10));
                        return ((Boolean) zza.zza()).booleanValue();
                    }
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z10 = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                zza = zzhz.zzd(Boolean.valueOf(z10));
                return ((Boolean) zza.zza()).booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
