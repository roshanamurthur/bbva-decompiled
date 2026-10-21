package com.budiyev.android.codescanner;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.zxing.Result;

/* JADX INFO: loaded from: classes9.dex */
public interface DecodeCallback {
    @WorkerThread
    void onDecoded(@NonNull Result result);
}
