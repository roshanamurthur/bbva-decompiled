package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes12.dex */
public class BERConstructedOctetString extends BEROctetString {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Vector f86544s0;

    public BERConstructedOctetString(Vector vector) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 != vector.size(); i10++) {
            try {
                byteArrayOutputStream.write(((DEROctetString) vector.elementAt(i10)).getOctets());
            } catch (IOException e5) {
                throw new IllegalArgumentException("exception converting octets " + e5.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(vector.elementAt(i10).getClass().getName().concat(" found in input should only contain DEROctetString"));
            }
        }
        super(byteArrayOutputStream.toByteArray());
        this.f86544s0 = vector;
    }

    public static BEROctetString fromSequence(ASN1Sequence aSN1Sequence) {
        Vector vector = new Vector();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            vector.addElement(objects.nextElement());
        }
        return new BERConstructedOctetString(vector);
    }

    @Override // org.bouncycastle.asn1.BEROctetString
    public Enumeration getObjects() {
        Vector vector = this.f86544s0;
        if (vector != null) {
            return vector.elements();
        }
        Vector vector2 = new Vector();
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f86521p0;
            if (i10 >= bArr.length) {
                return vector2.elements();
            }
            int i11 = i10 + 1000;
            int length = (i11 > bArr.length ? bArr.length : i11) - i10;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i10, bArr2, 0, length);
            vector2.addElement(new DEROctetString(bArr2));
            i10 = i11;
        }
    }

    public BERConstructedOctetString(ASN1Encodable aSN1Encodable) {
        this(aSN1Encodable.toASN1Primitive());
    }

    public BERConstructedOctetString(ASN1Primitive aSN1Primitive) {
        try {
            super(aSN1Primitive.getEncoded());
        } catch (IOException unused) {
            throw new IllegalArgumentException("Unable to encode object");
        }
    }

    public BERConstructedOctetString(byte[] bArr) {
        super(bArr);
    }
}
