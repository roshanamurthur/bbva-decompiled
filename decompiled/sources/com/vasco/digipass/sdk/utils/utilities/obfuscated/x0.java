package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class x0 implements g, g3 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private y f66425p0;

    public x0(y yVar) {
        this.f66425p0 = yVar;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g3
    public u a() throws IOException {
        try {
            return new w0(this.f66425p0.b());
        } catch (IllegalArgumentException e5) {
            throw new j(e5.getMessage(), e5);
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        try {
            return a();
        } catch (IOException e5) {
            throw new t("unable to get DER object", e5);
        } catch (IllegalArgumentException e7) {
            throw new t("unable to get DER object", e7);
        }
    }
}
