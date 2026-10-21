package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.k;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzap {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzas zzf;

    public zzap(zzfr zzfrVar, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzas zzasVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzfrVar.zzay().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzeh.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzasVar = new zzas(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfrVar.zzay().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object objZzA = zzfrVar.zzv().zzA(next, bundle2.get(next));
                    if (objZzA == null) {
                        zzfrVar.zzay().zzk().zzb("Param value can't be null", zzfrVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzfrVar.zzv().zzN(bundle2, next, objZzA);
                    }
                }
            }
            zzasVar = new zzas(bundle2);
        }
        this.zzf = zzasVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String string = this.zzf.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + String.valueOf(str).length() + 33 + String.valueOf(str2).length());
        k.e(sb2, "Event{appId='", str, "', name='", str2);
        sb2.append("', params=");
        sb2.append(string);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public final zzap zza(zzfr zzfrVar, long j10) {
        return new zzap(zzfrVar, this.zzc, this.zza, this.zzb, this.zzd, j10, this.zzf);
    }

    private zzap(zzfr zzfrVar, String str, String str2, String str3, long j10, long j11, zzas zzasVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzasVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzfrVar.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzeh.zzn(str2), zzeh.zzn(str3));
        }
        this.zzf = zzasVar;
    }
}
