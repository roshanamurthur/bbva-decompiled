package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
enum w {
    NOT_RAN(0),
    NOT_DETECTED(1),
    DETECTED(2);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f42933d;

    w(int i10) {
        this.f42933d = i10;
    }

    public static w c(int i10) {
        for (w wVar : values()) {
            if (wVar.f42933d == i10) {
                return wVar;
            }
        }
        throw new IllegalArgumentException();
    }
}
