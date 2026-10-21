package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kf f42021b = new kf() { // from class: com.facetec.sdk.kf.2
    };

    public interface a {
        kf a();
    }

    public static a e(kf kfVar) {
        return new a() { // from class: com.facetec.sdk.kf.5
            @Override // com.facetec.sdk.kf.a
            public final kf a() {
                return kf.this;
            }
        };
    }
}
