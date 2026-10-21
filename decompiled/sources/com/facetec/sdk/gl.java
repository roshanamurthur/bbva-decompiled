package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public final class gl implements el {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg f41784a = new gg();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final gd f41785e = new gd();

    @Override // com.facetec.sdk.el
    public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
        try {
            if (fyVar.d() == m.class) {
                return new cb(dvVar, f41784a, f41785e);
            }
        } catch (NoClassDefFoundError unused) {
        }
        try {
            if (s.class.isAssignableFrom(fyVar.d())) {
                return new by(dvVar, f41784a, f41785e);
            }
            return null;
        } catch (NoClassDefFoundError unused2) {
            return null;
        }
    }
}
