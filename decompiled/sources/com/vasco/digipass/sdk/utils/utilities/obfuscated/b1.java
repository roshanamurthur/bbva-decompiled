package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class b1 extends u {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final byte[] f65936p0;

    public b1(byte[] bArr) {
        this.f65936p0 = bArr;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(22, this.f65936p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        return i5.a(this.f65936p0.length) + 1 + this.f65936p0.length;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    public String g() {
        return k5.b(this.f65936p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return Arrays.hashCode(this.f65936p0);
    }

    public String toString() {
        return g();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (uVar instanceof b1) {
            return Arrays.areEqual(this.f65936p0, ((b1) uVar).f65936p0);
        }
        return false;
    }
}
