package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes9.dex */
final class fv<T> extends eo<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f41703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final eo<T> f41704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dv f41705e;

    public fv(dv dvVar, eo<T> eoVar, Type type) {
        this.f41705e = dvVar;
        this.f41704d = eoVar;
        this.f41703c = type;
    }

    @Override // com.facetec.sdk.eo
    public final T a(fz fzVar) throws IOException {
        return this.f41704d.a(fzVar);
    }

    @Override // com.facetec.sdk.eo
    public final void b(ga gaVar, T t10) throws IOException {
        eo<T> eoVarB = this.f41704d;
        Type type = this.f41703c;
        if (t10 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t10.getClass();
        }
        if (type != this.f41703c) {
            eoVarB = this.f41705e.b(fy.e(type));
            if (eoVarB instanceof fp.c) {
                eo<T> eoVar = this.f41704d;
                if (!(eoVar instanceof fp.c)) {
                    eoVarB = eoVar;
                }
            }
        }
        eoVarB.b(gaVar, t10);
    }
}
