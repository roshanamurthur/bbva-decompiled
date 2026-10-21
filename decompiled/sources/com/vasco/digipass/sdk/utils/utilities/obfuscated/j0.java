package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class j0 implements w {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private y f66086p0;

    public j0(y yVar) {
        this.f66086p0 = yVar;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g3
    public u a() throws IOException {
        return new i0(this.f66086p0.b());
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        try {
            return a();
        } catch (IOException e5) {
            throw new IllegalStateException(e5.getMessage());
        }
    }
}
