package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class DERT61UTF8String extends ASN1Primitive implements ASN1String {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f86580p0;

    public DERT61UTF8String(String str) {
        this(Strings.toUTF8ByteArray(str));
    }

    public static DERT61UTF8String getInstance(Object obj) {
        if (obj instanceof DERT61String) {
            return new DERT61UTF8String(((DERT61String) obj).getOctets());
        }
        if (obj == null || (obj instanceof DERT61UTF8String)) {
            return (DERT61UTF8String) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return new DERT61UTF8String(((DERT61String) ASN1Primitive.fromByteArray((byte[]) obj)).getOctets());
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 20, this.f86580p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof DERT61UTF8String)) {
            return false;
        }
        return Arrays.areEqual(this.f86580p0, ((DERT61UTF8String) aSN1Primitive).f86580p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        byte[] bArr = this.f86580p0;
        return j.a(bArr.length) + 1 + bArr.length;
    }

    public byte[] getOctets() {
        return Arrays.clone(this.f86580p0);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        return Strings.fromUTF8ByteArray(this.f86580p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.f86580p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    public DERT61UTF8String(byte[] bArr) {
        this.f86580p0 = bArr;
    }

    public static DERT61UTF8String getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof DERT61String) || (object instanceof DERT61UTF8String)) ? getInstance(object) : new DERT61UTF8String(ASN1OctetString.getInstance(object).getOctets());
    }
}
