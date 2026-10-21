package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class l0 implements g, g3 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private y f66174p0;

    public l0(y yVar) {
        this.f66174p0 = yVar;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g3
    public u a() throws IOException {
        return new k0(this.f66174p0.b());
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        try {
            return a();
        } catch (IOException e5) {
            throw new t(e5.getMessage(), e5);
        }
    }
}
