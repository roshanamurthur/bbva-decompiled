package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zznl;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzht implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ Uri zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzhv zze;

    public zzht(zzhv zzhvVar, boolean z10, Uri uri, String str, String str2) {
        this.zze = zzhvVar;
        this.zza = z10;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleZzs;
        zzhv zzhvVar = this.zze;
        boolean z10 = this.zza;
        Uri uri = this.zzb;
        String str = this.zzc;
        String str2 = this.zzd;
        zzhvVar.zza.zzg();
        try {
            zzkw zzkwVarZzv = zzhvVar.zza.zzs.zzv();
            zznl.zzc();
            zzaf zzafVarZzf = zzhvVar.zza.zzs.zzf();
            zzdt zzdtVar = zzdu.zzav;
            boolean zZzs = zzafVarZzf.zzs(null, zzdtVar);
            if (TextUtils.isEmpty(str2)) {
                bundleZzs = null;
            } else {
                if (!str2.contains("gclid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium")) {
                    if (zZzs && (str2.contains("utm_id") || str2.contains("dclid"))) {
                        zZzs = true;
                    }
                    zzkwVarZzv.zzs.zzay().zzc().zza("Activity created with data 'referrer' without required params");
                    bundleZzs = null;
                }
                bundleZzs = zzkwVarZzv.zzs(Uri.parse(str2.length() != 0 ? "https://google.com/search?".concat(str2) : new String("https://google.com/search?")), zZzs);
                if (bundleZzs != null) {
                    bundleZzs.putString("_cis", "referrer");
                }
            }
            if (z10) {
                zzkw zzkwVarZzv2 = zzhvVar.zza.zzs.zzv();
                zznl.zzc();
                Bundle bundleZzs2 = zzkwVarZzv2.zzs(uri, zzhvVar.zza.zzs.zzf().zzs(null, zzdtVar));
                if (bundleZzs2 != null) {
                    bundleZzs2.putString("_cis", "intent");
                    if (!bundleZzs2.containsKey("gclid") && bundleZzs != null && bundleZzs.containsKey("gclid")) {
                        bundleZzs2.putString("_cer", String.format("gclid=%s", bundleZzs.getString("gclid")));
                    }
                    zzhvVar.zza.zzG(str, "_cmp", bundleZzs2);
                    zzhvVar.zza.zzb.zza(str, bundleZzs2);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            zzhvVar.zza.zzs.zzay().zzc().zzb("Activity created with referrer", str2);
            if (zzhvVar.zza.zzs.zzf().zzs(null, zzdu.zzY)) {
                if (bundleZzs != null) {
                    zzhvVar.zza.zzG(str, "_cmp", bundleZzs);
                    zzhvVar.zza.zzb.zza(str, bundleZzs);
                } else {
                    zzhvVar.zza.zzs.zzay().zzc().zzb("Referrer does not contain valid parameters", str2);
                }
                zzhvVar.zza.zzX(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM) && !str2.contains(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT))) {
                zzhvVar.zza.zzs.zzay().zzc().zza("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                zzhvVar.zza.zzX(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", str2, true);
            }
        } catch (RuntimeException e5) {
            zzhvVar.zza.zzs.zzay().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", e5);
        }
    }
}
