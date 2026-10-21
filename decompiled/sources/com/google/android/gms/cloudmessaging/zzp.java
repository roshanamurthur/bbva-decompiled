package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.i;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* JADX INFO: loaded from: classes9.dex */
abstract class zzp<T> {
    final int zza;
    final TaskCompletionSource<T> zzb = new TaskCompletionSource<>();
    final int zzc;
    final Bundle zzd;

    public zzp(int i10, int i11, Bundle bundle) {
        this.zza = i10;
        this.zzc = i11;
        this.zzd = bundle;
    }

    public final String toString() {
        int i10 = this.zzc;
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        return i.c(sb2, zzb(), "}");
    }

    public abstract void zza(Bundle bundle);

    public abstract boolean zzb();

    public final void zzc(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzqVar);
            new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
        }
        this.zzb.setException(zzqVar);
    }

    public final void zzd(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t10);
            new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
        }
        this.zzb.setResult(t10);
    }
}
