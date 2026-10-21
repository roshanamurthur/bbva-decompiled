package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class HttpException extends IOException {
    public static final int UNKNOWN = -1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f38129p0;

    public HttpException(int i10) {
        this("Http request failed", i10);
    }

    public int getStatusCode() {
        return this.f38129p0;
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i10) {
        this(str, i10, null);
    }

    public HttpException(String str, int i10, @Nullable Throwable th2) {
        super(str + ", status code: " + i10, th2);
        this.f38129p0 = i10;
    }
}
