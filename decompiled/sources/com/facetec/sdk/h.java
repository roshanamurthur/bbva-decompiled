package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
final class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f41847a = null;

    @FunctionalInterface
    public interface a {
        Object create();
    }

    public final synchronized T c(a aVar) {
        try {
            if (this.f41847a == null) {
                this.f41847a = (T) aVar.create();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f41847a;
    }
}
