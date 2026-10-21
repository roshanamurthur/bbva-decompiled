package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class m1 extends u {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private byte[] f66185p0;

    public m1(byte[] bArr) {
        this.f66185p0 = Arrays.clone(bArr);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(20, this.f66185p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        return i5.a(this.f66185p0.length) + 1 + this.f66185p0.length;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    public String g() {
        return k5.b(this.f66185p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return Arrays.hashCode(this.f66185p0);
    }

    public String toString() {
        return g();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (uVar instanceof m1) {
            return Arrays.areEqual(this.f66185p0, ((m1) uVar).f66185p0);
        }
        return false;
    }
}
