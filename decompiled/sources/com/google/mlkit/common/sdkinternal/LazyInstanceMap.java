package com.google.mlkit.common.sdkinternal;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public abstract class LazyInstanceMap<K, V> {

    @GuardedBy("instances")
    private final Map zza = new HashMap();

    @NonNull
    @KeepForSdk
    public abstract V create(@NonNull K k10);

    @NonNull
    @KeepForSdk
    public V get(@NonNull K k10) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k10)) {
                    return (V) this.zza.get(k10);
                }
                V vCreate = create(k10);
                this.zza.put(k10, vCreate);
                return vCreate;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
