package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class n1 extends z {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final byte[] f66211t0 = new byte[0];

    public n1(boolean z10, int i10, g gVar) {
        super(z10, i10, gVar);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        if (this.f66500q0) {
            sVar.a(160, this.f66499p0, f66211t0);
            return;
        }
        u uVarE = this.f66502s0.toASN1Primitive().e();
        if (!this.f66501r0) {
            sVar.a(uVarE.d() ? 160 : 128, this.f66499p0);
            sVar.a(uVarE);
        } else {
            sVar.a(160, this.f66499p0);
            sVar.b(uVarE.c());
            sVar.a((g) uVarE);
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() throws IOException {
        int iB;
        if (this.f66500q0) {
            return i5.b(this.f66499p0) + 1;
        }
        int iC = this.f66502s0.toASN1Primitive().e().c();
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
