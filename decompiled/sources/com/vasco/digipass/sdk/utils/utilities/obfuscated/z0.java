package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class z0 extends u {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final byte[] f66503p0;

    public z0(byte[] bArr) {
        this.f66503p0 = bArr;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(27, this.f66503p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        return i5.a(this.f66503p0.length) + 1 + this.f66503p0.length;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    public String g() {
        return k5.b(this.f66503p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return Arrays.hashCode(this.f66503p0);
    }

    public String toString() {
        return g();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (uVar instanceof z0) {
            return Arrays.areEqual(this.f66503p0, ((z0) uVar).f66503p0);
        }
        return false;
    }
}
