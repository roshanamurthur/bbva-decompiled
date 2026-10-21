package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class l1 implements g, g3 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private y f66175p0;

    public l1(y yVar) {
        this.f66175p0 = yVar;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g3
    public u a() throws IOException {
        return new k1(this.f66175p0.b(), false);
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
