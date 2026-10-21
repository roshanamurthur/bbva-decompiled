package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbz extends zzce {
    private final AtomicReference zza = new AtomicReference();
    private boolean zzb;

    public static final Object zze(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e5) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e5);
            throw e5;
        }
    }

    public final Bundle zzb(long j10) {
        Bundle bundle;
        synchronized (this.zza) {
            if (!this.zzb) {
                try {
                    this.zza.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.zza.get();
        }
        return bundle;
    }

    public final String zzc(long j10) {
        return (String) zze(zzb(j10), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.zzcf
    public final void zzd(Bundle bundle) {
        synchronized (this.zza) {
            try {
                try {
                    this.zza.set(bundle);
                    this.zzb = true;
                    this.zza.notify();
                } catch (Throwable th2) {
                    this.zza.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
