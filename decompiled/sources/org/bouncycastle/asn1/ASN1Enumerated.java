package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1Enumerated extends ASN1Primitive {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final ASN1Enumerated[] f86507r0 = new ASN1Enumerated[12];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f86508p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f86509q0;

    public ASN1Enumerated(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f86508p0 = BigInteger.valueOf(i10).toByteArray();
        this.f86509q0 = 0;
    }

    public static ASN1Enumerated e(byte[] bArr) {
        if (bArr.length > 1) {
            return new ASN1Enumerated(bArr);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i10 = bArr[0] & 255;
        if (i10 >= 12) {
            return new ASN1Enumerated(bArr);
        }
        ASN1Enumerated[] aSN1EnumeratedArr = f86507r0;
        ASN1Enumerated aSN1Enumerated = aSN1EnumeratedArr[i10];
        if (aSN1Enumerated != null) {
            return aSN1Enumerated;
        }
        ASN1Enumerated aSN1Enumerated2 = new ASN1Enumerated(bArr);
        aSN1EnumeratedArr[i10] = aSN1Enumerated2;
        return aSN1Enumerated2;
    }

    public static ASN1Enumerated getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Enumerated)) {
            return (ASN1Enumerated) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1Enumerated) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 10, this.f86508p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Enumerated) {
            return Arrays.areEqual(this.f86508p0, ((ASN1Enumerated) aSN1Primitive).f86508p0);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        byte[] bArr = this.f86508p0;
        return j.a(bArr.length) + 1 + bArr.length;
    }

    public BigInteger getValue() {
        return new BigInteger(this.f86508p0);
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && ASN1Integer.e(this.f86509q0, -1, this.f86508p0) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.f86508p0);
    }

    public int intValueExact() {
        byte[] bArr = this.f86508p0;
        int length = bArr.length;
        int i10 = this.f86509q0;
        if (length - i10 <= 4) {
            return ASN1Integer.e(i10, -1, bArr);
        }
        throw new ArithmeticException("ASN.1 Enumerated out of int range");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public ASN1Enumerated(BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f86508p0 = bigInteger.toByteArray();
        this.f86509q0 = 0;
    }

    public ASN1Enumerated(byte[] bArr) {
        if (ASN1Integer.f(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        int i10 = 0;
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f86508p0 = Arrays.clone(bArr);
        int length = bArr.length - 1;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (bArr[i10] != (bArr[i11] >> 7)) {
                break;
            } else {
                i10 = i11;
            }
        }
        this.f86509q0 = i10;
    }

    public static ASN1Enumerated getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof ASN1Enumerated)) ? getInstance(object) : e(ASN1OctetString.getInstance(object).getOctets());
    }
}
