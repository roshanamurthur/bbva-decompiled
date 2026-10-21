package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class z1 extends d {
    public z1(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        byte[] bArr = this.f65999p0;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        bArr2[0] = (byte) i();
        System.arraycopy(bArr, 0, bArr2, 1, length);
        sVar.a(3, bArr2);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        return i5.a(this.f65999p0.length + 1) + 1 + this.f65999p0.length + 1;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }
}
