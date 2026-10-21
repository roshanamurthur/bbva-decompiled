package com.budiyev.android.codescanner;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes9.dex */
public final class CodeScannerException extends RuntimeException {
    public CodeScannerException() {
    }

    public CodeScannerException(@Nullable String str) {
        super(str);
    }

    public CodeScannerException(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public CodeScannerException(@Nullable Throwable th2) {
        super(th2);
    }

    @RequiresApi(24)
    public CodeScannerException(@Nullable String str, @Nullable Throwable th2, boolean z10, boolean z11) {
        super(str, th2, z10, z11);
    }
}
