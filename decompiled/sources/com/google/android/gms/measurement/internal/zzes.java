package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzes {
    final /* synthetic */ zzew zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzes(zzew zzewVar, String str, long j10) {
        this.zza = zzewVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j10;
    }

    @WorkerThread
    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    @WorkerThread
    public final void zzb(long j10) {
        SharedPreferences.Editor editorEdit = this.zza.zza().edit();
        editorEdit.putLong(this.zzb, j10);
        editorEdit.apply();
        this.zze = j10;
    }
}
