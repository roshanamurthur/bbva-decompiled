package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import androidx.compose.animation.core.AnimationKt;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
public class zzkl implements Closeable {
    private static final Map zza = new HashMap();
    private final String zzb;
    private int zzc;
    private double zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    private zzkl(String str) {
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
        this.zzb = str;
    }

    private final void zza() {
        this.zzc = 0;
        this.zzd = 0.0d;
        this.zze = 0L;
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
    }

    public static zzkl zze(String str) {
        zzlk.zza();
        if (!zzlk.zzb()) {
            return zzkj.zza;
        }
        Map map = zza;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new zzkl("detectorTaskWithResource#run"));
        }
        return (zzkl) map.get("detectorTaskWithResource#run");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.zze;
        if (j10 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        zzd(j10);
    }

    public zzkl zzb() {
        this.zze = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void zzc(long j10) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.zzf;
        if (j11 != 0 && jElapsedRealtimeNanos - j11 >= AnimationKt.MillisToNanos) {
            zza();
        }
        this.zzf = jElapsedRealtimeNanos;
        this.zzc++;
        this.zzd += j10;
        this.zzg = Math.min(this.zzg, j10);
        this.zzh = Math.max(this.zzh, j10);
        if (this.zzc % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.zzb, Long.valueOf(j10), Integer.valueOf(this.zzc), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf((int) (this.zzd / ((double) this.zzc))));
            zzlk.zza();
        }
        if (this.zzc % 500 == 0) {
            zza();
        }
    }

    public void zzd(long j10) {
        zzc((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }
}
