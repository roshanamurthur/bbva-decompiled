package org.junit.internal.runners;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class InitializationError extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<Throwable> f91878p0;

    public InitializationError(List<Throwable> list) {
        this.f91878p0 = list;
    }

    public List<Throwable> getCauses() {
        return this.f91878p0;
    }

    public InitializationError(Throwable... thArr) {
        this((List<Throwable>) Arrays.asList(thArr));
    }

    public InitializationError(String str) {
        this(new Exception(str));
    }
}
