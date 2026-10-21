package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class DERUniversalString extends ASN1Primitive implements ASN1String {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char[] f86582q0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f86583p0;

    public DERUniversalString(byte[] bArr) {
        this.f86583p0 = Arrays.clone(bArr);
    }

    public static DERUniversalString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERUniversalString)) {
            return (DERUniversalString) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (DERUniversalString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 28, this.f86583p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof DERUniversalString)) {
            return false;
        }
        return Arrays.areEqual(this.f86583p0, ((DERUniversalString) aSN1Primitive).f86583p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        byte[] bArr = this.f86583p0;
        return j.a(bArr.length) + 1 + bArr.length;
    }

    public byte[] getOctets() {
        return Arrays.clone(this.f86583p0);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i10 = 0; i10 != encoded.length; i10++) {
                char[] cArr = f86582q0;
                stringBuffer.append(cArr[(encoded[i10] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i10] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new ASN1ParsingException("internal error encoding UniversalString");
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.f86583p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    public static DERUniversalString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof DERUniversalString)) ? getInstance(object) : new DERUniversalString(ASN1OctetString.getInstance(object).getOctets());
    }
}
