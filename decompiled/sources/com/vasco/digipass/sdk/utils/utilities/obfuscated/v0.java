package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class v0 extends d {
    public v0(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public static v0 a(Object obj) {
        if (obj == null || (obj instanceof v0)) {
            return (v0) obj;
        }
        if (obj instanceof z1) {
            z1 z1Var = (z1) obj;
            return new v0(z1Var.f65999p0, z1Var.f66000q0);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (v0) u.a((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        return i5.a(this.f65999p0.length + 1) + 1 + this.f65999p0.length + 1;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    public v0(byte[] bArr) {
        this(bArr, 0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        byte[] bArrA = d.a(this.f65999p0, this.f66000q0);
        int length = bArrA.length;
        byte[] bArr = new byte[length + 1];
        bArr[0] = (byte) i();
        System.arraycopy(bArrA, 0, bArr, 1, length);
        sVar.a(3, bArr);
    }
}
