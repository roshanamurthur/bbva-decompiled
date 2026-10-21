package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhh implements zzhe {

    @GuardedBy("GservicesLoader.class")
    private static zzhh zza;

    @Nullable
    private final Context zzb;

    @Nullable
    private final ContentObserver zzc;

    private zzhh() {
        this.zzb = null;
        this.zzc = null;
    }

    public static zzhh zza(Context context) {
        zzhh zzhhVar;
        synchronized (zzhh.class) {
            try {
                if (zza == null) {
                    zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhh(context) : new zzhh();
                }
                zzhhVar = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhhVar;
    }

    public static synchronized void zze() {
        Context context;
        try {
            zzhh zzhhVar = zza;
            if (zzhhVar != null && (context = zzhhVar.zzb) != null && zzhhVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    @Nullable
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (String) zzhc.zza(new zzhd() { // from class: com.google.android.gms.internal.measurement.zzhf
                @Override // com.google.android.gms.internal.measurement.zzhd
                public final Object zza() {
                    return this.zza.zzd(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException unused) {
            String strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                "Unable to read GServices for: ".concat(strValueOf);
            }
            return null;
        }
    }

    public final /* synthetic */ String zzd(String str) {
        return zzgv.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzhh(Context context) {
        this.zzb = context;
        zzhg zzhgVar = new zzhg(this, null);
        this.zzc = zzhgVar;
        context.getContentResolver().registerContentObserver(zzgv.zza, true, zzhgVar);
    }
}
