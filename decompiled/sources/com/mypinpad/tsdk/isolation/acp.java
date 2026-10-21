package com.mypinpad.tsdk.isolation;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface acp extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long setY(@NotNull abx abxVar, long j10) throws IOException;

    @NotNull
    acq setY();
}
