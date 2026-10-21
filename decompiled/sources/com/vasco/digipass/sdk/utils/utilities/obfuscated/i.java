package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class i extends u {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static i[] f66068q0 = new i[12];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final byte[] f66069p0;

    public i(byte[] bArr) {
        if (!q4.b("org.bouncycastle.asn1.allow_unsafe_integer") && m.b(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        this.f66069p0 = Arrays.clone(bArr);
    }

    public static i b(byte[] bArr) {
        if (bArr.length > 1) {
            return new i(bArr);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i10 = bArr[0] & 255;
        i[] iVarArr = f66068q0;
        if (i10 >= iVarArr.length) {
            return new i(Arrays.clone(bArr));
        }
        i iVar = iVarArr[i10];
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(Arrays.clone(bArr));
        iVarArr[i10] = iVar2;
        return iVar2;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(10, this.f66069p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        return i5.a(this.f66069p0.length) + 1 + this.f66069p0.length;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return Arrays.hashCode(this.f66069p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (uVar instanceof i) {
            return Arrays.areEqual(this.f66069p0, ((i) uVar).f66069p0);
        }
        return false;
    }
}
