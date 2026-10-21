package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class mo extends IOException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lz f42606c;

    public mo(lz lzVar) {
        super("stream was reset: ".concat(String.valueOf(lzVar)));
        this.f42606c = lzVar;
    }
}
