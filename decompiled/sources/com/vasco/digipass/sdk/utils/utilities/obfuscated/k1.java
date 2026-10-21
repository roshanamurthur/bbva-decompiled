package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class k1 extends x {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f66164r0;

    public k1() {
        this.f66164r0 = -1;
    }

    private int k() throws IOException {
        if (this.f66164r0 < 0) {
            Enumeration enumerationG = g();
            int iC = 0;
            while (enumerationG.hasMoreElements()) {
                iC += ((g) enumerationG.nextElement()).toASN1Primitive().e().c();
            }
            this.f66164r0 = iC;
        }
        return this.f66164r0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        s sVarA = sVar.a();
        int iK = k();
        sVar.a(49);
        sVar.b(iK);
        Enumeration enumerationG = g();
        while (enumerationG.hasMoreElements()) {
            sVarA.a((g) enumerationG.nextElement());
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() throws IOException {
        int iK = k();
        return i5.a(iK) + 1 + iK;
    }

    public k1(h hVar, boolean z10) {
        super(hVar, z10);
        this.f66164r0 = -1;
    }
}
