package com.sun.mail.imap;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: IMAPFolder.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f65403p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f65404q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f65405r0;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        int i11 = this.f65403p0;
        int i12 = i11 + 1;
        byte[] bArr = this.f65404q0;
        if (bArr != null) {
            int i13 = this.f65405r0;
            if (i12 > i13 && i13 >= 0) {
                this.f65404q0 = null;
            } else if (i12 > bArr.length) {
                byte[] bArr2 = new byte[Math.max(bArr.length << 1, i12)];
                System.arraycopy(this.f65404q0, 0, bArr2, 0, this.f65403p0);
                this.f65404q0 = bArr2;
                bArr2[this.f65403p0] = (byte) i10;
            } else {
                bArr[i11] = (byte) i10;
            }
        }
        this.f65403p0 = i12;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        int i13 = this.f65403p0;
        int i14 = i13 + i11;
        byte[] bArr2 = this.f65404q0;
        if (bArr2 != null) {
            int i15 = this.f65405r0;
            if (i14 > i15 && i15 >= 0) {
                this.f65404q0 = null;
            } else if (i14 > bArr2.length) {
                byte[] bArr3 = new byte[Math.max(bArr2.length << 1, i14)];
                System.arraycopy(this.f65404q0, 0, bArr3, 0, this.f65403p0);
                this.f65404q0 = bArr3;
                System.arraycopy(bArr, i10, bArr3, this.f65403p0, i11);
            } else {
                System.arraycopy(bArr, i10, bArr2, i13, i11);
            }
        }
        this.f65403p0 = i14;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
