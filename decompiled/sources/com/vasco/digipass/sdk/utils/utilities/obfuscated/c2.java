package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class c2 extends x {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f65960r0;

    public c2() {
        this.f65960r0 = -1;
    }

    private int k() throws IOException {
        if (this.f65960r0 < 0) {
            Enumeration enumerationG = g();
            int iC = 0;
            while (enumerationG.hasMoreElements()) {
                iC += ((g) enumerationG.nextElement()).toASN1Primitive().f().c();
            }
            this.f65960r0 = iC;
        }
        return this.f65960r0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        s sVarB = sVar.b();
        int iK = k();
        sVar.a(49);
        sVar.b(iK);
        Enumeration enumerationG = g();
        while (enumerationG.hasMoreElements()) {
            sVarB.a((g) enumerationG.nextElement());
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() throws IOException {
        int iK = k();
        return i5.a(iK) + 1 + iK;
    }

    public c2(g gVar) {
        super(gVar);
        this.f65960r0 = -1;
    }

    public c2(h hVar) {
        super(hVar, false);
        this.f65960r0 = -1;
    }

    public c2(g[] gVarArr) {
        super(gVarArr, false);
        this.f65960r0 = -1;
    }
}
