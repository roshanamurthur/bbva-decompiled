package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes12.dex */
public class BEROctetString extends ASN1OctetString {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f86548q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1OctetString[] f86549r0;

    public class a implements Enumeration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86550a = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f86550a < BEROctetString.this.f86549r0.length;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            ASN1OctetString[] aSN1OctetStringArr = BEROctetString.this.f86549r0;
            int i10 = this.f86550a;
            this.f86550a = i10 + 1;
            return aSN1OctetStringArr[i10];
        }
    }

    public BEROctetString(byte[] bArr) {
        this(bArr, 1000);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        Enumeration objects = getObjects();
        if (z10) {
            aSN1OutputStream.c(36);
        }
        aSN1OutputStream.c(128);
        aSN1OutputStream.e(objects);
        aSN1OutputStream.c(0);
        aSN1OutputStream.c(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        Enumeration objects = getObjects();
        int iB = 0;
        while (objects.hasMoreElements()) {
            iB += ((ASN1Encodable) objects.nextElement()).toASN1Primitive().b();
        }
        return iB + 4;
    }

    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeObject((ASN1Primitive) this);
    }

    public Enumeration getObjects() {
        if (this.f86549r0 != null) {
            return new a();
        }
        Vector vector = new Vector();
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f86521p0;
            if (i10 >= bArr.length) {
                return vector.elements();
            }
            int length = bArr.length;
            int i11 = this.f86548q0 + i10;
            int iMin = Math.min(length, i11) - i10;
            byte[] bArr2 = new byte[iMin];
            System.arraycopy(bArr, i10, bArr2, 0, iMin);
            vector.addElement(new DEROctetString(bArr2));
            i10 = i11;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return true;
    }

    public BEROctetString(byte[] bArr, int i10) {
        this(bArr, null, i10);
    }

    public BEROctetString(byte[] bArr, ASN1OctetString[] aSN1OctetStringArr, int i10) {
        super(bArr);
        this.f86549r0 = aSN1OctetStringArr;
        this.f86548q0 = i10;
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr) {
        this(aSN1OctetStringArr, 1000);
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i11 = 0; i11 != aSN1OctetStringArr.length; i11++) {
            try {
                byteArrayOutputStream.write(((DEROctetString) aSN1OctetStringArr[i11]).getOctets());
            } catch (IOException e5) {
                throw new IllegalArgumentException("exception converting octets " + e5.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(aSN1OctetStringArr[i11].getClass().getName().concat(" found in input should only contain DEROctetString"));
            }
        }
        this(byteArrayOutputStream.toByteArray(), aSN1OctetStringArr, i10);
    }
}
