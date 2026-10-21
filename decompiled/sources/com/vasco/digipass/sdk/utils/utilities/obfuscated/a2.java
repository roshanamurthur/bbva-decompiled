package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class a2 extends s {
    public a2(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.s
    public void a(g gVar) throws IOException {
        if (gVar == null) {
            throw new IOException("null object detected");
        }
        gVar.toASN1Primitive().f().a(this);
    }
}
