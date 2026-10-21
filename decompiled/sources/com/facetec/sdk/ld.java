package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class ld implements km {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kl f42257a;

    public ld(kl klVar) {
        this.f42257a = klVar;
    }

    @Override // com.facetec.sdk.km
    public final kq c(km.e eVar) throws IOException {
        ls lsVar = (ls) eVar;
        kr krVarD = lsVar.d();
        lj ljVarC = lsVar.c();
        return lsVar.c(krVarD, ljVarC, ljVarC.b(this.f42257a, eVar, !krVarD.c().equals("GET")), ljVarC.e());
    }
}
