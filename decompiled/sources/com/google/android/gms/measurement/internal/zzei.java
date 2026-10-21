package com.google.android.gms.measurement.internal;

import ad.d;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.k;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzei {

    @NonNull
    public final String zza;

    @NonNull
    public final String zzb;
    public final long zzc;

    @NonNull
    public final Bundle zzd;

    public zzei(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j10) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j10;
    }

    public static zzei zzb(zzau zzauVar) {
        return new zzei(zzauVar.zza, zzauVar.zzc, zzauVar.zzb.zzc(), zzauVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String string = this.zzd.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        k.e(sb2, "origin=", str, ",name=", str2);
        return d.f(sb2, ",params=", string);
    }

    public final zzau zza() {
        return new zzau(this.zza, new zzas(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
