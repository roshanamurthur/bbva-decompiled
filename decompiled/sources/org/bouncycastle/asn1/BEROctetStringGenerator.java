package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public class BEROctetStringGenerator extends BERGenerator {
    public BEROctetStringGenerator(OutputStream outputStream) throws IOException {
        super(outputStream);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream() {
        return getOctetOutputStream(new byte[1000]);
    }

    public BEROctetStringGenerator(OutputStream outputStream, int i10, boolean z10) throws IOException {
        super(outputStream, i10, z10);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream(byte[] bArr) {
        return new a(bArr);
    }

    public class a extends OutputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final byte[] f86552p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f86553q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final DEROutputStream f86554r0;

        public a(byte[] bArr) {
            this.f86552p0 = bArr;
            this.f86554r0 = new DEROutputStream(BEROctetStringGenerator.this._out);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            int i10 = this.f86553q0;
            DEROutputStream dEROutputStream = this.f86554r0;
            if (i10 != 0) {
                byte[] bArr = this.f86552p0;
                dEROutputStream.c(4);
                dEROutputStream.i(i10);
                dEROutputStream.d(bArr, 0, i10);
            }
            dEROutputStream.getClass();
            BEROctetStringGenerator.this.writeBEREnd();
        }

        @Override // java.io.OutputStream
        public final void write(int i10) throws IOException {
            int i11 = this.f86553q0;
            int i12 = i11 + 1;
            this.f86553q0 = i12;
            byte[] bArr = this.f86552p0;
            bArr[i11] = (byte) i10;
            if (i12 == bArr.length) {
                DEROutputStream dEROutputStream = this.f86554r0;
                int length = bArr.length;
                dEROutputStream.c(4);
                dEROutputStream.i(length);
                dEROutputStream.d(bArr, 0, length);
                this.f86553q0 = 0;
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            while (i11 > 0) {
                byte[] bArr2 = this.f86552p0;
                int iMin = Math.min(i11, bArr2.length - this.f86553q0);
                System.arraycopy(bArr, i10, bArr2, this.f86553q0, iMin);
                int i12 = this.f86553q0 + iMin;
                this.f86553q0 = i12;
                if (i12 < bArr2.length) {
                    return;
                }
                int length = bArr2.length;
                DEROutputStream dEROutputStream = this.f86554r0;
                dEROutputStream.c(4);
                dEROutputStream.i(length);
                dEROutputStream.d(bArr2, 0, length);
                this.f86553q0 = 0;
                i10 += iMin;
                i11 -= iMin;
            }
        }
    }
}
