package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class f1 implements r {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private k2 f66030p0;

    public f1(k2 k2Var) {
        this.f66030p0 = k2Var;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g3
    public u a() throws IOException {
        return new e1(this.f66030p0.b());
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.r
    public InputStream b() {
        return this.f66030p0;
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
