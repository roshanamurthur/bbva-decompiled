package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class h0 implements r {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private y f66061p0;

    public h0(y yVar) {
        this.f66061p0 = yVar;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g3
    public u a() throws IOException {
        return new g0(j5.a(b()));
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.r
    public InputStream b() {
        return new r0(this.f66061p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        try {
            return a();
        } catch (IOException e5) {
            throw new t(androidx.camera.core.impl.a.d(e5, new StringBuilder("IOException converting stream to byte array: ")), e5);
        }
    }
}
