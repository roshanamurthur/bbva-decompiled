package com.google.android.play.core.splitinstall.testing;

import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ye.b;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzv {
    public static final zzv zza;

    static {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap());
        if (mapUnmodifiableMap == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        zza = new b(null, mapUnmodifiableMap);
    }

    @Nullable
    @SplitInstallErrorCode
    public abstract Integer zza();

    public abstract Map zzb();
}
