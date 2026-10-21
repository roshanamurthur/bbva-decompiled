package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class b2 extends v {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f65937q0;

    public b2() {
        this.f65937q0 = -1;
    }

    private int j() throws IOException {
        if (this.f65937q0 < 0) {
            Enumeration enumerationG = g();
            int iC = 0;
            while (enumerationG.hasMoreElements()) {
                iC += ((g) enumerationG.nextElement()).toASN1Primitive().f().c();
            }
            this.f65937q0 = iC;
        }
        return this.f65937q0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        s sVarB = sVar.b();
        int iJ = j();
        sVar.a(48);
        sVar.b(iJ);
        Enumeration enumerationG = g();
        while (enumerationG.hasMoreElements()) {
            sVarB.a((g) enumerationG.nextElement());
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() throws IOException {
        int iJ = j();
        return i5.a(iJ) + 1 + iJ;
    }

    public b2(h hVar) {
        super(hVar);
        this.f65937q0 = -1;
    }
}
