package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class DERBMPString extends ASN1Primitive implements ASN1String {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final char[] f86562p0;

    public DERBMPString(String str) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f86562p0 = str.toCharArray();
    }

    public static DERBMPString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERBMPString)) {
            return (DERBMPString) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (DERBMPString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        char[] cArr = this.f86562p0;
        int length = cArr.length;
        if (z10) {
            aSN1OutputStream.c(30);
        }
        aSN1OutputStream.i(length * 2);
        byte[] bArr = new byte[8];
        int i10 = length & (-4);
        int i11 = 0;
        while (i11 < i10) {
            char c10 = cArr[i11];
            char c11 = cArr[i11 + 1];
            char c12 = cArr[i11 + 2];
            char c13 = cArr[i11 + 3];
            i11 += 4;
            bArr[0] = (byte) (c10 >> '\b');
            bArr[1] = (byte) c10;
            bArr[2] = (byte) (c11 >> '\b');
            bArr[3] = (byte) c11;
            bArr[4] = (byte) (c12 >> '\b');
            bArr[5] = (byte) c12;
            bArr[6] = (byte) (c13 >> '\b');
            bArr[7] = (byte) c13;
            aSN1OutputStream.d(bArr, 0, 8);
        }
        if (i11 < length) {
            int i12 = 0;
            do {
                char c14 = cArr[i11];
                i11++;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (c14 >> '\b');
                i12 += 2;
                bArr[i13] = (byte) c14;
            } while (i11 < length);
            aSN1OutputStream.d(bArr, 0, i12);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERBMPString) {
            return Arrays.areEqual(this.f86562p0, ((DERBMPString) aSN1Primitive).f86562p0);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        char[] cArr = this.f86562p0;
        return (cArr.length * 2) + j.a(cArr.length * 2) + 1;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        return new String(this.f86562p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.f86562p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    public DERBMPString(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i10 = length / 2;
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 != i10; i11++) {
            int i12 = i11 * 2;
            cArr[i11] = (char) ((bArr[i12 + 1] & 255) | (bArr[i12] << 8));
        }
        this.f86562p0 = cArr;
    }

    public DERBMPString(char[] cArr) {
        this.f86562p0 = cArr;
    }

    public static DERBMPString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof DERBMPString)) ? getInstance(object) : new DERBMPString(ASN1OctetString.getInstance(object).getOctets());
    }
}
