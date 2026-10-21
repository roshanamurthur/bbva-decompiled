package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1Boolean extends ASN1Primitive {
    public static final ASN1Boolean FALSE = new ASN1Boolean((byte) 0);
    public static final ASN1Boolean TRUE = new ASN1Boolean((byte) -1);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte f86502p0;

    public ASN1Boolean(byte b10) {
        this.f86502p0 = b10;
    }

    public static ASN1Boolean e(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b10 = bArr[0];
        if (b10 != -1) {
            return b10 != 0 ? new ASN1Boolean(b10) : FALSE;
        }
        return TRUE;
    }

    public static ASN1Boolean getInstance(int i10) {
        return i10 != 0 ? TRUE : FALSE;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        if (z10) {
            aSN1OutputStream.c(1);
        }
        aSN1OutputStream.i(1);
        aSN1OutputStream.c(this.f86502p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return (aSN1Primitive instanceof ASN1Boolean) && isTrue() == ((ASN1Boolean) aSN1Primitive).isTrue();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        return 3;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive c() {
        return isTrue() ? TRUE : FALSE;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return isTrue() ? 1 : 0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public boolean isTrue() {
        return this.f86502p0 != 0;
    }

    public String toString() {
        return isTrue() ? "TRUE" : "FALSE";
    }

    public static ASN1Boolean getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Boolean)) {
            return (ASN1Boolean) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1Boolean) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (IOException e5) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("failed to construct boolean from byte[]: ")));
        }
    }

    public static ASN1Boolean getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof ASN1Boolean)) ? getInstance(object) : e(ASN1OctetString.getInstance(object).getOctets());
    }

    public static ASN1Boolean getInstance(boolean z10) {
        return z10 ? TRUE : FALSE;
    }
}
