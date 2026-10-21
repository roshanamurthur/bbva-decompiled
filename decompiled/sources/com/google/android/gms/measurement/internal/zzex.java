package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zznl;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzex implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzey zzc;

    public zzex(zzey zzeyVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzeyVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x010d  */
    /* JADX WARN: Code duplicated, block: B:42:0x011c  */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleZzd;
        zzey zzeyVar = this.zzc;
        zzez zzezVar = zzeyVar.zza;
        String str = zzeyVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzezVar.zza.zzaz().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            bundleZzd = zzbrVar.zzd(bundle);
            if (bundleZzd == null) {
                zzezVar.zza.zzay().zzd().zza("Install Referrer Service returned a null response");
                bundleZzd = null;
            }
        } catch (Exception e5) {
            zzezVar.zza.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e5.getMessage());
        }
        zzezVar.zza.zzaz().zzg();
        zzfr.zzO();
        if (bundleZzd != null) {
            long j10 = bundleZzd.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                a.f(zzezVar.zza, "Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleZzd.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    bc.org.bouncycastle.math.ec.custom.sec.a.e(zzezVar.zza, "No referrer defined in Install Referrer response");
                } else {
                    zzezVar.zza.zzay().zzj().zzb("InstallReferrer API result", string);
                    zzkw zzkwVarZzv = zzezVar.zza.zzv();
                    Uri uri = Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?"));
                    zznl.zzc();
                    Bundle bundleZzs = zzkwVarZzv.zzs(uri, zzezVar.zza.zzf().zzs(null, zzdu.zzau));
                    if (bundleZzs == null) {
                        bc.org.bouncycastle.math.ec.custom.sec.a.e(zzezVar.zza, "No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = bundleZzs.getString("medium");
                        if (string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) {
                            if (j10 == zzezVar.zza.zzm().zzd.zza()) {
                                androidx.activity.a.g(zzezVar.zza, "Logging Install Referrer campaign from module while it may have already been logged.");
                            }
                            if (zzezVar.zza.zzJ()) {
                                zzezVar.zza.zzm().zzd.zzb(j10);
                                zzezVar.zza.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                bundleZzs.putString("_cis", "referrer API v2");
                                zzezVar.zza.zzq().zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundleZzs, str);
                            }
                        } else {
                            long j11 = bundleZzd.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                bc.org.bouncycastle.math.ec.custom.sec.a.e(zzezVar.zza, "Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                bundleZzs.putLong("click_timestamp", j11);
                                if (j10 == zzezVar.zza.zzm().zzd.zza()) {
                                    androidx.activity.a.g(zzezVar.zza, "Logging Install Referrer campaign from module while it may have already been logged.");
                                }
                                if (zzezVar.zza.zzJ()) {
                                    zzezVar.zza.zzm().zzd.zzb(j10);
                                    zzezVar.zza.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                    bundleZzs.putString("_cis", "referrer API v2");
                                    zzezVar.zza.zzq().zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundleZzs, str);
                                }
                            }
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzezVar.zza.zzau(), serviceConnection);
    }
}
