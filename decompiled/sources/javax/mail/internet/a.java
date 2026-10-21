package javax.mail.internet;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: MimeUtility.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f79031p0;
    public final boolean v0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79032q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f79033r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f79034s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f79035t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f79036u0 = false;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f79037w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f79038x0 = 0;

    public a(boolean z10, boolean z11) {
        boolean z12 = false;
        this.v0 = false;
        this.f79031p0 = z10;
        if (z11 && z10) {
            z12 = true;
        }
        this.v0 = z12;
    }

    public final void a(int i10) throws IOException {
        int i11;
        int i12 = i10 & 255;
        if (this.v0 && (((i11 = this.f79037w0) == 13 && i12 != 10) || (i11 != 13 && i12 == 10))) {
            this.f79036u0 = true;
        }
        if (i12 == 13 || i12 == 10) {
            this.f79034s0 = 0;
        } else {
            int i13 = this.f79034s0 + 1;
            this.f79034s0 = i13;
            if (i13 > 998) {
                this.f79035t0 = true;
            }
        }
        if (MimeUtility.i(i12)) {
            this.f79033r0++;
            if (this.f79031p0) {
                this.f79038x0 = 3;
                throw new EOFException();
            }
        } else {
            this.f79032q0++;
        }
        this.f79037w0 = i12;
    }

    public final int b() {
        int i10 = this.f79038x0;
        if (i10 != 0) {
            return i10;
        }
        if (this.f79036u0) {
            return 3;
        }
        int i11 = this.f79033r0;
        if (i11 == 0) {
            return this.f79035t0 ? 2 : 1;
        }
        return this.f79032q0 > i11 ? 2 : 3;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        a(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        while (i10 < i12) {
            a(bArr[i10]);
            i10++;
        }
    }
}
