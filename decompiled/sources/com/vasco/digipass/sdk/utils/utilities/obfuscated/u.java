package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u extends o {
    public static u a(byte[] bArr) throws IOException {
        l lVar = new l(bArr);
        try {
            u uVarD = lVar.d();
            if (lVar.available() == 0) {
                return uVarD;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract void a(s sVar) throws IOException;

    public abstract boolean a(u uVar);

    public abstract int c() throws IOException;

    public abstract boolean d();

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && a(((g) obj).toASN1Primitive());
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public abstract int hashCode();

    public u e() {
        return this;
    }

    public u f() {
        return this;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        return this;
    }
}
