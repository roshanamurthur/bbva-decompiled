package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class i0 extends v {
    public i0() {
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(48);
        sVar.a(128);
        Enumeration enumerationG = g();
        while (enumerationG.hasMoreElements()) {
            sVar.a((g) enumerationG.nextElement());
        }
        sVar.a(0);
        sVar.a(0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() throws IOException {
        Enumeration enumerationG = g();
        int iC = 0;
        while (enumerationG.hasMoreElements()) {
            iC += ((g) enumerationG.nextElement()).toASN1Primitive().c();
        }
        return iC + 4;
    }

    public i0(h hVar) {
        super(hVar);
    }
}
