package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzeq {
    final /* synthetic */ zzew zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzeq(zzew zzewVar, String str, boolean z10) {
        this.zza = zzewVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z10;
    }

    @WorkerThread
    public final void zza(boolean z10) {
        SharedPreferences.Editor editorEdit = this.zza.zza().edit();
        editorEdit.putBoolean(this.zzb, z10);
        editorEdit.apply();
        this.zze = z10;
    }

    @WorkerThread
    public final boolean zzb() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }
}
