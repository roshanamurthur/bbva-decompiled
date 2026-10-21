package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class e0 implements g, g3 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final int f66022p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final y f66023q0;

    public e0(int i10, y yVar) {
        this.f66022p0 = i10;
        this.f66023q0 = yVar;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g3
    public u a() throws IOException {
        return new d0(this.f66022p0, this.f66023q0.b());
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
