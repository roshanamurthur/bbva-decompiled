package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class m extends u {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final byte[] f66184p0;

    public m(long j10) {
        this.f66184p0 = BigInteger.valueOf(j10).toByteArray();
    }

    public static m a(Object obj) {
        if (obj == null || (obj instanceof m)) {
            return (m) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (m) u.a((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static boolean b(byte[] bArr) {
        if (bArr.length > 1) {
            byte b10 = bArr[0];
            if (b10 == 0 && (bArr[1] & 128) == 0) {
                return true;
            }
            if (b10 == -1 && (bArr[1] & 128) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        return i5.a(this.f66184p0.length) + 1 + this.f66184p0.length;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    public BigInteger g() {
        return new BigInteger(1, this.f66184p0);
    }

    public BigInteger h() {
        return new BigInteger(this.f66184p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f66184p0;
            if (i10 == bArr.length) {
                return i11;
            }
            i11 ^= (bArr[i10] & 255) << (i10 % 4);
            i10++;
        }
    }

    public String toString() {
        return h().toString();
    }

    public m(BigInteger bigInteger) {
        this.f66184p0 = bigInteger.toByteArray();
    }

    public m(byte[] bArr, boolean z10) {
        if (!q4.b("org.bouncycastle.asn1.allow_unsafe_integer") && b(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f66184p0 = z10 ? Arrays.clone(bArr) : bArr;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(2, this.f66184p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (uVar instanceof m) {
            return Arrays.areEqual(this.f66184p0, ((m) uVar).f66184p0);
        }
        return false;
    }
}
