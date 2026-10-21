package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class a0 extends u {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private byte[] f65924p0;

    public a0(byte[] bArr) {
        this.f65924p0 = bArr;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(23);
        int length = this.f65924p0.length;
        sVar.b(length);
        for (int i10 = 0; i10 != length; i10++) {
            sVar.a(this.f65924p0[i10]);
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        int length = this.f65924p0.length;
        return i5.a(length) + 1 + length;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return Arrays.hashCode(this.f65924p0);
    }

    public String toString() {
        return k5.b(this.f65924p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (uVar instanceof a0) {
            return Arrays.areEqual(this.f65924p0, ((a0) uVar).f65924p0);
        }
        return false;
    }
}
