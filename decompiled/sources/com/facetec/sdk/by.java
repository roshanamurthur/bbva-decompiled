package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class by extends eo implements gj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gk f40732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dv f40733c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private gf f40734e;

    public by(dv dvVar, gk gkVar, gf gfVar) {
        this.f40733c = dvVar;
        this.f40732b = gkVar;
        this.f40734e = gfVar;
    }

    @Override // com.facetec.sdk.eo
    public final Object a(fz fzVar) throws IOException {
        int iD = this.f40732b.d(fzVar);
        if (iD == 1) {
            return s.FACE_SCAN;
        }
        if (iD == 9) {
            return s.ID_SCAN_ONLY;
        }
        if (iD != 11) {
            return null;
        }
        return s.ID_SCAN_MATCH;
    }

    @Override // com.facetec.sdk.eo
    public final void b(ga gaVar, Object obj) throws IOException {
        int i10;
        if (obj == null) {
            gaVar.g();
            return;
        }
        gf gfVar = this.f40734e;
        if (obj == s.ID_SCAN_MATCH) {
            i10 = 8;
        } else if (obj == s.FACE_SCAN) {
            i10 = 10;
        } else {
            i10 = obj == s.ID_SCAN_ONLY ? 7 : -1;
        }
        gfVar.a(gaVar, i10);
    }
}
