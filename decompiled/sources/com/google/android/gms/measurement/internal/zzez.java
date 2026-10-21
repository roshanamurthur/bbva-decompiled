package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzez {
    final zzfr zza;

    public zzez(zzkp zzkpVar) {
        this.zza = zzkpVar.zzq();
    }

    @VisibleForTesting
    public final boolean zza() {
        try {
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(this.zza.zzau());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.zza.zzay().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e5) {
            this.zza.zzay().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e5);
            return false;
        }
    }
}
