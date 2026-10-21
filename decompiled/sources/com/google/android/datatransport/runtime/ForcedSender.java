package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.logging.Logging;

/* JADX INFO: loaded from: classes9.dex */
public final class ForcedSender {
    @SuppressLint({"DiscouragedApi"})
    @WorkerThread
    public static void sendBlocking(Transport<?> transport, Priority priority) {
        if (!(transport instanceof d)) {
            Logging.w("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", transport);
        } else {
            TransportRuntime.getInstance().getUploader().logAndUpdateState(((d) transport).f43744a.withPriority(priority), 1);
        }
    }
}
