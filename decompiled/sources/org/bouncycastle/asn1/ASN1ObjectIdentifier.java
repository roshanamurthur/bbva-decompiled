package org.bouncycastle.asn1;

import androidx.camera.camera2.internal.h0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1ObjectIdentifier extends ASN1Primitive {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final ConcurrentHashMap f86516r0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f86517p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f86518q0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f86520b;

        public a(byte[] bArr) {
            this.f86519a = Arrays.hashCode(bArr);
            this.f86520b = bArr;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Arrays.areEqual(this.f86520b, ((a) obj).f86520b);
        }

        public final int hashCode() {
            return this.f86519a;
        }
    }

    public ASN1ObjectIdentifier(String str) {
        char cCharAt;
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2' || !g(2, str)) {
            throw new IllegalArgumentException(h0.b("string ", str, " not an OID"));
        }
        this.f86517p0 = str;
    }

    public static boolean g(int i10, String str) {
        int length = str.length();
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (i12 < i10) {
                return i11 != 0 && (i11 <= 1 || str.charAt(length) != '0');
            }
            char cCharAt = str.charAt(i12);
            if (cCharAt == '.') {
                if (i11 == 0 || (i11 > 1 && str.charAt(length) == '0')) {
                    return false;
                }
                i11 = 0;
            } else {
                if ('0' > cCharAt || cCharAt > '9') {
                    return false;
                }
                i11++;
            }
            length = i12;
        }
    }

    public static ASN1ObjectIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1ObjectIdentifier)) {
            return (ASN1ObjectIdentifier) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                return (ASN1ObjectIdentifier) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1ObjectIdentifier) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (IOException e5) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("failed to construct object identifier from byte[]: ")));
        }
    }

    public static void h(ByteArrayOutputStream byteArrayOutputStream, long j10) {
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

    public static void i(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
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

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 6, f());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive == this) {
            return true;
        }
        if (!(aSN1Primitive instanceof ASN1ObjectIdentifier)) {
            return false;
        }
        return this.f86517p0.equals(((ASN1ObjectIdentifier) aSN1Primitive).f86517p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        int length = f().length;
        return j.a(length) + 1 + length;
    }

    public ASN1ObjectIdentifier branch(String str) {
        return new ASN1ObjectIdentifier(str, this);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004d A[LOOP:0: B:7:0x0038->B:12:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:15:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0048 -> B:5:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void e(java.io.ByteArrayOutputStream r8) {
        /*
            r7 = this;
            org.bouncycastle.asn1.OIDTokenizer r0 = new org.bouncycastle.asn1.OIDTokenizer
            java.lang.String r1 = r7.f86517p0
            r0.<init>(r1)
            java.lang.String r1 = r0.nextToken()
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r1 * 40
            java.lang.String r2 = r0.nextToken()
            int r3 = r2.length()
            r4 = 18
            if (r3 > r4) goto L27
            long r5 = (long) r1
            long r1 = java.lang.Long.parseLong(r2)
            long r1 = r1 + r5
        L23:
            h(r8, r1)
            goto L38
        L27:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            long r1 = (long) r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r1 = r3.add(r1)
            i(r8, r1)
        L38:
            boolean r1 = r0.hasMoreTokens()
            if (r1 == 0) goto L56
            java.lang.String r1 = r0.nextToken()
            int r2 = r1.length()
            if (r2 > r4) goto L4d
            long r1 = java.lang.Long.parseLong(r1)
            goto L23
        L4d:
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r1)
            i(r8, r2)
            goto L38
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1ObjectIdentifier.e(java.io.ByteArrayOutputStream):void");
    }

    public final synchronized byte[] f() {
        try {
            if (this.f86518q0 == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e(byteArrayOutputStream);
                this.f86518q0 = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f86518q0;
    }

    public String getId() {
        return this.f86517p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return this.f86517p0.hashCode();
    }

    public ASN1ObjectIdentifier intern() {
        a aVar = new a(f());
        ConcurrentHashMap concurrentHashMap = f86516r0;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) concurrentHashMap.get(aVar);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) concurrentHashMap.putIfAbsent(aVar, this);
        return aSN1ObjectIdentifier2 == null ? this : aSN1ObjectIdentifier2;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public boolean on(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String id = getId();
        String id2 = aSN1ObjectIdentifier.getId();
        return id.length() > id2.length() && id.charAt(id2.length()) == '.' && id.startsWith(id2);
    }

    public String toString() {
        return getId();
    }

    public ASN1ObjectIdentifier(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (!g(0, str)) {
            throw new IllegalArgumentException(h0.b("string ", str, " not a valid OID branch"));
        }
        this.f86517p0 = aSN1ObjectIdentifier.getId() + Constant.DOT_STRING + str;
    }

    public static ASN1ObjectIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (z10 || (object instanceof ASN1ObjectIdentifier)) {
            return getInstance(object);
        }
        byte[] octets = ASN1OctetString.getInstance(object).getOctets();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) f86516r0.get(new a(octets));
        return aSN1ObjectIdentifier == null ? new ASN1ObjectIdentifier(octets) : aSN1ObjectIdentifier;
    }

    public ASN1ObjectIdentifier(byte[] bArr) {
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
        this.f86517p0 = stringBuffer.toString();
        this.f86518q0 = Arrays.clone(bArr);
    }
}
