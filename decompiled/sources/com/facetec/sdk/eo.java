package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class eo<T> {
    public abstract T a(fz fzVar) throws IOException;

    public final eo<T> b() {
        return new eo<T>() { // from class: com.facetec.sdk.eo.2
            @Override // com.facetec.sdk.eo
            public final T a(fz fzVar) throws IOException {
                if (fzVar.j() != gb.NULL) {
                    return (T) eo.this.a(fzVar);
                }
                fzVar.m();
                return null;
            }

            @Override // com.facetec.sdk.eo
            public final void b(ga gaVar, T t10) throws IOException {
                if (t10 == null) {
                    gaVar.g();
                } else {
                    eo.this.b(gaVar, t10);
                }
            }
        };
    }

    public abstract void b(ga gaVar, T t10) throws IOException;

    public final ec d(T t10) {
        try {
            fk fkVar = new fk();
            b(fkVar, t10);
            return fkVar.e();
        } catch (IOException e5) {
            throw new ed(e5);
        }
    }
}
