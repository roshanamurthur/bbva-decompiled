package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class u0 extends u {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final char[] f66381p0;

    public u0(char[] cArr) {
        this.f66381p0 = cArr;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (uVar instanceof u0) {
            return Arrays.areEqual(this.f66381p0, ((u0) uVar).f66381p0);
        }
        return false;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        return (this.f66381p0.length * 2) + i5.a(this.f66381p0.length * 2) + 1;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    public String g() {
        return new String(this.f66381p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return Arrays.hashCode(this.f66381p0);
    }

    public String toString() {
        return g();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(30);
        sVar.b(this.f66381p0.length * 2);
        int i10 = 0;
        while (true) {
            char[] cArr = this.f66381p0;
            if (i10 == cArr.length) {
                return;
            }
            char c10 = cArr[i10];
            sVar.a((byte) (c10 >> '\b'));
            sVar.a((byte) c10);
            i10++;
        }
    }
}
