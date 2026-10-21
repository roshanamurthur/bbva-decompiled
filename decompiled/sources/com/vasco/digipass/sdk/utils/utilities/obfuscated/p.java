package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class p extends u {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final ConcurrentMap<a, p> f66243r0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final String f66244p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private byte[] f66245q0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f66246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f66247b;

        public a(byte[] bArr) {
            this.f66246a = Arrays.hashCode(bArr);
            this.f66247b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.areEqual(this.f66247b, ((a) obj).f66247b);
            }
            return false;
        }

        public int hashCode() {
            return this.f66246a;
        }
    }

    public p(byte[] bArr) {
        int i10;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z10 = true;
        BigInteger bigIntegerShiftLeft = null;
        int i11 = 0;
        long j10 = 0;
        while (i11 != bArr.length) {
            byte b10 = bArr[i11];
            if (j10 <= 72057594037927808L) {
                i10 = i11;
                long j11 = j10 + ((long) (b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        if (j11 < 40) {
                            stringBuffer.append('0');
                        } else if (j11 < 80) {
                            stringBuffer.append('1');
                            j11 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j11 -= 80;
                        }
                        z10 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j11);
                    j10 = 0;
                } else {
                    j10 = j11 << 7;
                }
            } else {
                i10 = i11;
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j10) : bigIntegerShiftLeft).or(BigInteger.valueOf(b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        stringBuffer.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z10 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j10 = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
            i11 = i10 + 1;
        }
        this.f66244p0 = stringBuffer.toString();
        this.f66245q0 = Arrays.clone(bArr);
    }

    public static p a(Object obj) {
        if (obj == null || (obj instanceof p)) {
            return (p) obj;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.toASN1Primitive() instanceof p) {
                return (p) gVar.toASN1Primitive();
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (p) u.a((byte[]) obj);
        } catch (IOException e5) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("failed to construct object identifier from byte[]: ")));
        }
    }

    private static boolean b(String str) {
        char cCharAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2') {
            return false;
        }
        return a(str, 2);
    }

    private synchronized byte[] g() {
        try {
            if (this.f66245q0 == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                a(byteArrayOutputStream);
                this.f66245q0 = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f66245q0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() throws IOException {
        int length = g().length;
        return i5.a(length) + 1 + length;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    public String h() {
        return this.f66244p0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return this.f66244p0.hashCode();
    }

    public p i() {
        a aVar = new a(g());
        ConcurrentMap<a, p> concurrentMap = f66243r0;
        p pVar = concurrentMap.get(aVar);
        if (pVar != null) {
            return pVar;
        }
        p pVarPutIfAbsent = concurrentMap.putIfAbsent(aVar, this);
        return pVarPutIfAbsent == null ? this : pVarPutIfAbsent;
    }

    public String toString() {
        return h();
    }

    public static p b(byte[] bArr) {
        p pVar = f66243r0.get(new a(bArr));
        return pVar == null ? new p(bArr) : pVar;
    }

    public p(String str) {
        if (str != null) {
            if (b(str)) {
                this.f66244p0 = str;
                return;
            }
            throw new IllegalArgumentException(androidx.camera.camera2.internal.h0.b("string ", str, " not an OID"));
        }
        throw new IllegalArgumentException("'identifier' cannot be null");
    }

    public p a(String str) {
        return new p(this, str);
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, long j10) {
        byte[] bArr = new byte[9];
        int i10 = 8;
        bArr[8] = (byte) (((int) j10) & 127);
        while (j10 >= 128) {
            j10 >>= 7;
            i10--;
            bArr[i10] = (byte) ((((int) j10) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i10, 9 - i10);
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i10 = iBitLength - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            bArr[i11] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i10] = (byte) (bArr[i10] & 127);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    public p(p pVar, String str) {
        if (a(str, 0)) {
            this.f66244p0 = pVar.h() + Constant.DOT_STRING + str;
            return;
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.h0.b("string ", str, " not a valid OID branch"));
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream) {
        f4 f4Var = new f4(this.f66244p0);
        int i10 = Integer.parseInt(f4Var.b()) * 40;
        String strB = f4Var.b();
        if (strB.length() <= 18) {
            a(byteArrayOutputStream, Long.parseLong(strB) + ((long) i10));
        } else {
            a(byteArrayOutputStream, new BigInteger(strB).add(BigInteger.valueOf(i10)));
        }
        while (f4Var.a()) {
            String strB2 = f4Var.b();
            if (strB2.length() <= 18) {
                a(byteArrayOutputStream, Long.parseLong(strB2));
            } else {
                a(byteArrayOutputStream, new BigInteger(strB2));
            }
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        byte[] bArrG = g();
        sVar.a(6);
        sVar.b(bArrG.length);
        sVar.a(bArrG);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (uVar == this) {
            return true;
        }
        if (uVar instanceof p) {
            return this.f66244p0.equals(((p) uVar).f66244p0);
        }
        return false;
    }

    private static boolean a(String str, int i10) {
        boolean z10;
        char cCharAt;
        int length = str.length();
        do {
            z10 = false;
            while (true) {
                length--;
                if (length < i10) {
                    return z10;
                }
                cCharAt = str.charAt(length);
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                z10 = true;
            }
            if (cCharAt != '.') {
                break;
            }
        } while (z10);
        return false;
    }
}
