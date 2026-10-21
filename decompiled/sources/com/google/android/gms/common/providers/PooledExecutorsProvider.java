package com.google.android.gms.common.providers;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
@Deprecated
public class PooledExecutorsProvider {
    private static PooledExecutorFactory zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public interface PooledExecutorFactory {
        @NonNull
        @KeepForSdk
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static synchronized PooledExecutorFactory getInstance() {
        try {
            if (zza == null) {
                zza = new zza();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}
