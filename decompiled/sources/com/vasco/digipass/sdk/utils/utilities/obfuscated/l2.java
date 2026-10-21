package com.vasco.digipass.sdk.utils.utilities.obfuscated;

/* JADX INFO: loaded from: classes9.dex */
public class l2 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private byte[] f66176p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private b0 f66177q0;

    public l2(b0 b0Var, byte[] bArr) {
        this.f66176p0 = bArr;
        this.f66177q0 = b0Var;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(this.f66177q0);
        hVar.a(new e1(this.f66176p0));
        return new i1(hVar);
    }
}
