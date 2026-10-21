package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
final class ar extends Exception {
    public ar(String str) {
        super(str);
    }

    public final boolean c() {
        return getCause() instanceof IllegalAccessException;
    }

    public ar(Throwable th2) {
        super(th2.getMessage(), th2);
    }

    public ar(String str, Throwable th2) {
        super(str, th2);
    }
}
