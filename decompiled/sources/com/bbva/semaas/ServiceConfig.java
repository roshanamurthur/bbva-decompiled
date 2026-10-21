package com.bbva.semaas;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/bbva/semaas/ServiceConfig;", "", "host", "", "path", "timeSpan", "", "chunkSize", "(Ljava/lang/String;Ljava/lang/String;II)V", "getChunkSize", "()I", "getHost", "()Ljava/lang/String;", "getPath", "getTimeSpan", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ServiceConfig {
    private final int chunkSize;

    @NotNull
    private final String host;

    @NotNull
    private final String path;
    private final int timeSpan;

    public ServiceConfig(@NotNull String host, @NotNull String path, int i10, int i11) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        this.host = host;
        this.path = path;
        this.timeSpan = i10;
        this.chunkSize = i11;
    }

    public final int getChunkSize() {
        return this.chunkSize;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final int getTimeSpan() {
        return this.timeSpan;
    }
}
