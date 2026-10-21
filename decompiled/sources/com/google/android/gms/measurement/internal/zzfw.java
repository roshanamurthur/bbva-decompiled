package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfw implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgj zzd;

    public zzfw(zzgj zzgjVar, String str, String str2, String str3) {
        this.zzd = zzgjVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.zzd.zza.zzA();
        return this.zzd.zza.zzi().zzv(this.zza, this.zzb, this.zzc);
    }
}
