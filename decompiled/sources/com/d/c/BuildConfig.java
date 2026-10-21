package com.d.c;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class BuildConfig extends BufferedInputStream {
    public BuildConfig(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }
}
