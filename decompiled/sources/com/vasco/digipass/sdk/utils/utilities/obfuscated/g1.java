package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class g1 extends s {
    public g1(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.s
    public s a() {
        return this;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.s
    public void a(g gVar) throws IOException {
        if (gVar == null) {
            throw new IOException("null object detected");
        }
        gVar.toASN1Primitive().e().a(this);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.s
    public s b() {
        return this;
    }
}
