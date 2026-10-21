package org.junit.runners.model;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class InitializationError extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<Throwable> f92046p0;

    public InitializationError(List<Throwable> list) {
        this.f92046p0 = list;
    }

    public List<Throwable> getCauses() {
        return this.f92046p0;
    }

    public InitializationError(Throwable th2) {
        this((List<Throwable>) Arrays.asList(th2));
    }

    public InitializationError(String str) {
        this(new Exception(str));
    }
}
