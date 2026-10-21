package com.mypinpad.tsdk.isolation;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface aco extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    void setDividerPadding(@NotNull abx abxVar, long j10) throws IOException;

    @NotNull
    acq setY();
}
