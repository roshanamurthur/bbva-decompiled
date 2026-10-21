package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class p1 extends u {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final char[] f66248q0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final byte[] f66249p0;

    public p1(byte[] bArr) {
        this.f66249p0 = Arrays.clone(bArr);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(28, g());
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        return i5.a(this.f66249p0.length) + 1 + this.f66249p0.length;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    public byte[] g() {
        return Arrays.clone(this.f66249p0);
    }

    public String h() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new s(byteArrayOutputStream).a((g) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i10 = 0; i10 != byteArray.length; i10++) {
                char[] cArr = f66248q0;
                stringBuffer.append(cArr[(byteArray[i10] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i10] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new t("internal error encoding BitString");
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return Arrays.hashCode(this.f66249p0);
    }

    public String toString() {
        return h();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (uVar instanceof p1) {
            return Arrays.areEqual(this.f66249p0, ((p1) uVar).f66249p0);
        }
        return false;
    }
}
