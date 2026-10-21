package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class m0 extends z {
    public m0(boolean z10, int i10, g gVar) {
        super(z10, i10, gVar);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        Enumeration enumerationG;
        sVar.a(160, this.f66499p0);
        sVar.a(128);
        if (!this.f66500q0) {
            if (this.f66501r0) {
                sVar.a(this.f66502s0);
            } else {
                g gVar = this.f66502s0;
                if (gVar instanceof q) {
                    enumerationG = gVar instanceof g0 ? ((g0) gVar).i() : new g0(((q) gVar).g()).i();
                } else if (gVar instanceof v) {
                    enumerationG = ((v) gVar).g();
                } else {
                    if (!(gVar instanceof x)) {
                        throw new j("not implemented: ".concat(this.f66502s0.getClass().getName()));
                    }
                    enumerationG = ((x) gVar).g();
                }
                while (enumerationG.hasMoreElements()) {
                    sVar.a((g) enumerationG.nextElement());
                }
            }
        }
        sVar.a(0);
        sVar.a(0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() throws IOException {
        int iB;
        if (this.f66500q0) {
            return i5.b(this.f66499p0) + 1;
        }
        int iC = this.f66502s0.toASN1Primitive().c();
        if (this.f66501r0) {
            iB = i5.b(this.f66499p0) + i5.a(iC);
        } else {
            iC--;
            iB = i5.b(this.f66499p0);
        }
        return iB + iC;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        if (this.f66500q0 || this.f66501r0) {
            return true;
        }
        return this.f66502s0.toASN1Primitive().e().d();
    }
}
