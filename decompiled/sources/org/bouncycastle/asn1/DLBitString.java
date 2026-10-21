package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class DLBitString extends ASN1BitString {
    public DLBitString(byte b10, int i10) {
        super(b10, i10);
    }

    public static ASN1BitString getInstance(Object obj) {
        if (obj == null || (obj instanceof DLBitString)) {
            return (DLBitString) obj;
        }
        if (obj instanceof DERBitString) {
            return (DERBitString) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1BitString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        byte b10 = (byte) this.padBits;
        byte[] bArr = this.data;
        if (z10) {
            aSN1OutputStream.c(3);
        } else {
            aSN1OutputStream.getClass();
        }
        aSN1OutputStream.i(bArr.length + 1);
        aSN1OutputStream.c(b10);
        aSN1OutputStream.d(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        return j.a(this.data.length + 1) + 1 + this.data.length + 1;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public DLBitString(int i10) {
        super(ASN1BitString.getBytes(i10), ASN1BitString.getPadBits(i10));
    }

    public DLBitString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public DLBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DLBitString(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public static ASN1BitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z10 && !(object instanceof DLBitString)) {
            byte[] octets = ASN1OctetString.getInstance(object).getOctets();
            if (octets.length < 1) {
                throw new IllegalArgumentException("truncated BIT STRING detected");
            }
            byte b10 = octets[0];
            int length = octets.length - 1;
            byte[] bArr = new byte[length];
            if (length != 0) {
                System.arraycopy(octets, 1, bArr, 0, octets.length - 1);
            }
            return new DLBitString(bArr, b10);
        }
        return getInstance(object);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive d() {
        return this;
    }
}
