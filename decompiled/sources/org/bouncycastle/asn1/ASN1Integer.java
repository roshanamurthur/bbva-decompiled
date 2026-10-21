package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1Integer extends ASN1Primitive {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f86514p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f86515q0;

    public ASN1Integer(long j10) {
        this.f86514p0 = BigInteger.valueOf(j10).toByteArray();
        this.f86515q0 = 0;
    }

    public static int e(int i10, int i11, byte[] bArr) {
        int length = bArr.length;
        int iMax = Math.max(i10, length - 4);
        int i12 = i11 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i12;
            }
            i12 = (i12 << 8) | (bArr[iMax] & 255);
        }
    }

    public static boolean f(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length != 1) {
            return bArr[0] == (bArr[1] >> 7) && !Properties.isOverrideSet("org.bouncycastle.asn1.allow_unsafe_integer");
        }
        return false;
    }

    public static ASN1Integer getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Integer)) {
            return (ASN1Integer) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1Integer) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 2, this.f86514p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Integer) {
            return Arrays.areEqual(this.f86514p0, ((ASN1Integer) aSN1Primitive).f86514p0);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        byte[] bArr = this.f86514p0;
        return j.a(bArr.length) + 1 + bArr.length;
    }

    public BigInteger getPositiveValue() {
        return new BigInteger(1, this.f86514p0);
    }

    public BigInteger getValue() {
        return new BigInteger(this.f86514p0);
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && e(this.f86515q0, -1, this.f86514p0) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.f86514p0);
    }

    public int intPositiveValueExact() {
        byte[] bArr = this.f86514p0;
        int length = bArr.length;
        int i10 = this.f86515q0;
        int i11 = length - i10;
        if (i11 > 4 || (i11 == 4 && (bArr[i10] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return e(i10, 255, bArr);
    }

    public int intValueExact() {
        byte[] bArr = this.f86514p0;
        int length = bArr.length;
        int i10 = this.f86515q0;
        if (length - i10 <= 4) {
            return e(i10, -1, bArr);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public long longValueExact() {
        byte[] bArr = this.f86514p0;
        int length = bArr.length;
        int i10 = this.f86515q0;
        if (length - i10 > 8) {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
        int length2 = bArr.length;
        int iMax = Math.max(i10, length2 - 8);
        long j10 = bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length2) {
                return j10;
            }
            j10 = (j10 << 8) | ((long) (bArr[iMax] & 255));
        }
    }

    public String toString() {
        return getValue().toString();
    }

    public ASN1Integer(BigInteger bigInteger) {
        this.f86514p0 = bigInteger.toByteArray();
        this.f86515q0 = 0;
    }

    public ASN1Integer(byte[] bArr) {
        this(bArr, true);
    }

    public ASN1Integer(byte[] bArr, boolean z10) {
        if (f(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f86514p0 = z10 ? Arrays.clone(bArr) : bArr;
        int length = bArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (bArr[i10] != (bArr[i11] >> 7)) {
                break;
            } else {
                i10 = i11;
            }
        }
        this.f86515q0 = i10;
    }

    public static ASN1Integer getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof ASN1Integer)) ? getInstance(object) : new ASN1Integer(ASN1OctetString.getInstance(object).getOctets());
    }
}
