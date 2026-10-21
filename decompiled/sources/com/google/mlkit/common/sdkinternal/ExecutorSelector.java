package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class ExecutorSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f49409a;

    public ExecutorSelector(@NonNull Provider provider) {
        this.f49409a = provider;
    }

    @NonNull
    @KeepForSdk
    public Executor getExecutorToUse(@Nullable Executor executor) {
        return executor != null ? executor : (Executor) this.f49409a.get();
    }
}
