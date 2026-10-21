package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
class m3 extends v {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private byte[] f66191q0;

    public m3(byte[] bArr) throws IOException {
        this.f66191q0 = bArr;
    }

    private void j() {
        l3 l3Var = new l3(this.f66191q0);
        while (l3Var.hasMoreElements()) {
            this.f66399p0.addElement(l3Var.nextElement());
        }
        this.f66191q0 = null;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.v
    public synchronized g a(int i10) {
        try {
            if (this.f66191q0 != null) {
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.a(i10);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() throws IOException {
        byte[] bArr = this.f66191q0;
        return bArr != null ? i5.a(bArr.length) + 1 + this.f66191q0.length : super.f().c();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.v, com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u e() {
        if (this.f66191q0 != null) {
            j();
        }
        return super.e();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.v, com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u f() {
        if (this.f66191q0 != null) {
            j();
        }
        return super.f();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.v
    public synchronized Enumeration g() {
        byte[] bArr = this.f66191q0;
        if (bArr == null) {
            return super.g();
        }
        return new l3(bArr);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.v
    public synchronized int h() {
        try {
            if (this.f66191q0 != null) {
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.h();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        byte[] bArr = this.f66191q0;
        if (bArr != null) {
            sVar.a(48, bArr);
        } else {
            super.f().a(sVar);
        }
    }
}
