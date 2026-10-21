package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class n0 implements g, g3 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f66208p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f66209q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private y f66210r0;

    public n0(boolean z10, int i10, y yVar) {
        this.f66208p0 = z10;
        this.f66209q0 = i10;
        this.f66210r0 = yVar;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g3
    public u a() throws IOException {
        return this.f66210r0.a(this.f66208p0, this.f66209q0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        try {
            return a();
        } catch (IOException e5) {
            throw new t(e5.getMessage());
        }
    }
}
