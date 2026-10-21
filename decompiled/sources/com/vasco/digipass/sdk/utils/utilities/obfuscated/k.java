package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class k extends u {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private byte[] f66163p0;

    public k(byte[] bArr) {
        this.f66163p0 = bArr;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(24, this.f66163p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        int length = this.f66163p0.length;
        return i5.a(length) + 1 + length;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return Arrays.hashCode(this.f66163p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (uVar instanceof k) {
            return Arrays.areEqual(this.f66163p0, ((k) uVar).f66163p0);
        }
        return false;
    }
}
