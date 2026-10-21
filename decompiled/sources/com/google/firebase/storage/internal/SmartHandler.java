package com.google.firebase.storage.internal;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.storage.StorageTaskScheduler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class SmartHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f49139a;

    @SuppressLint({"ThreadPoolCreation"})
    public SmartHandler(@Nullable Executor executor) {
        if (executor == null) {
            this.f49139a = StorageTaskScheduler.getInstance().getMainThreadExecutor();
        } else {
            this.f49139a = executor;
        }
    }

    public void callBack(@NonNull Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        Executor executor = this.f49139a;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            StorageTaskScheduler.getInstance().scheduleCallback(runnable);
        }
    }
}
