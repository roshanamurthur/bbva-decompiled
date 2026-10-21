package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f86522a;

    public ASN1OutputStream(OutputStream outputStream) {
        this.f86522a = outputStream;
    }

    public static ASN1OutputStream create(OutputStream outputStream) {
        return new ASN1OutputStream(outputStream);
    }

    public DEROutputStream a() {
        return new DEROutputStream(this.f86522a);
    }

    public ASN1OutputStream b() {
        return new DLOutputStream(this.f86522a);
    }

    public final void c(int i10) throws IOException {
        this.f86522a.write(i10);
    }

    public void close() throws IOException {
        this.f86522a.close();
    }

    public final void d(byte[] bArr, int i10, int i11) throws IOException {
        this.f86522a.write(bArr, i10, i11);
    }

    public final void e(Enumeration enumeration) throws IOException {
        while (enumeration.hasMoreElements()) {
            j(((ASN1Encodable) enumeration.nextElement()).toASN1Primitive(), true);
        }
    }

    public final void f(boolean z10, int i10, byte[] bArr) throws IOException {
        if (z10) {
            c(i10);
        }
        i(bArr.length);
        d(bArr, 0, bArr.length);
    }

    public void flush() throws IOException {
        this.f86522a.flush();
    }

    public final void g(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        k(i10, i11, z10);
        i(bArr.length);
        d(bArr, 0, bArr.length);
    }

    public final void h(boolean z10, int i10, ASN1Encodable[] aSN1EncodableArr) throws IOException {
        if (z10) {
            c(i10);
        }
        c(128);
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            j(aSN1Encodable.toASN1Primitive(), true);
        }
        c(0);
        c(0);
    }

    public final void i(int i10) throws IOException {
        if (i10 <= 127) {
            c((byte) i10);
            return;
        }
        int i11 = i10;
        int i12 = 1;
        while (true) {
            i11 >>>= 8;
            if (i11 == 0) {
                break;
            } else {
                i12++;
            }
        }
        c((byte) (i12 | 128));
        for (int i13 = (i12 - 1) * 8; i13 >= 0; i13 -= 8) {
            c((byte) (i10 >> i13));
        }
    }

    public void j(ASN1Primitive aSN1Primitive, boolean z10) throws IOException {
        aSN1Primitive.a(this, z10);
    }

    public final void k(int i10, int i11, boolean z10) throws IOException {
        if (z10) {
            if (i11 < 31) {
                c(i10 | i11);
                return;
            }
            c(i10 | 31);
            if (i11 < 128) {
                c(i11);
                return;
            }
            byte[] bArr = new byte[5];
            int i12 = 4;
            bArr[4] = (byte) (i11 & 127);
            do {
                i11 >>= 7;
                i12--;
                bArr[i12] = (byte) ((i11 & 127) | 128);
            } while (i11 > 127);
            d(bArr, i12, 5 - i12);
        }
    }

    public void writeNull() throws IOException {
        c(5);
        c(0);
    }

    public void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable == null) {
            throw new IOException("null object detected");
        }
        j(aSN1Encodable.toASN1Primitive(), true);
    }

    public static ASN1OutputStream create(OutputStream outputStream, String str) {
        if (str.equals(ASN1Encoding.DER)) {
            return new DEROutputStream(outputStream);
        }
        return str.equals(ASN1Encoding.DL) ? new DLOutputStream(outputStream) : new ASN1OutputStream(outputStream);
    }

    public void writeObject(ASN1Primitive aSN1Primitive) throws IOException {
        if (aSN1Primitive == null) {
            throw new IOException("null object detected");
        }
        j(aSN1Primitive, true);
    }
}
