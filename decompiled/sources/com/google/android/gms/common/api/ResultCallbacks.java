package com.google.android.gms.common.api;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(@NonNull Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void onResult(@NonNull R r3) {
        Status status = r3.getStatus();
        if (status.isSuccess()) {
            onSuccess(r3);
            return;
        }
        onFailure(status);
        if (r3 instanceof Releasable) {
            try {
                ((Releasable) r3).release();
            } catch (RuntimeException e5) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r3)), e5);
            }
        }
    }

    public abstract void onSuccess(@NonNull R r3);
}
