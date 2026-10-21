package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f66302a;

    public class a extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f66303b;

        public a(OutputStream outputStream) {
            super(outputStream);
            this.f66303b = true;
        }

        @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.s
        public void a(int i10) throws IOException {
            if (this.f66303b) {
                this.f66303b = false;
            } else {
                super.a(i10);
            }
        }
    }

    public s(OutputStream outputStream) {
        this.f66302a = outputStream;
    }

    public void a(int i10) throws IOException {
        this.f66302a.write(i10);
    }

    public void b(int i10) throws IOException {
        if (i10 <= 127) {
            a((byte) i10);
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
        a((byte) (i12 | 128));
        for (int i13 = (i12 - 1) * 8; i13 >= 0; i13 -= 8) {
            a((byte) (i10 >> i13));
        }
    }

    public void a(byte[] bArr) throws IOException {
        this.f66302a.write(bArr);
    }

    public void a(byte[] bArr, int i10, int i11) throws IOException {
        this.f66302a.write(bArr, i10, i11);
    }

    public void a(int i10, byte[] bArr) throws IOException {
        a(i10);
        b(bArr.length);
        a(bArr);
    }

    public s b() {
        return new a2(this.f66302a);
    }

    public void a(int i10, int i11) throws IOException {
        if (i11 < 31) {
            a(i10 | i11);
            return;
        }
        a(i10 | 31);
        if (i11 < 128) {
            a(i11);
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
        a(bArr, i12, 5 - i12);
    }

    public void a(int i10, int i11, byte[] bArr) throws IOException {
        a(i10, i11);
        b(bArr.length);
        a(bArr);
    }

    public void a(g gVar) throws IOException {
        if (gVar != null) {
            gVar.toASN1Primitive().a(this);
            return;
        }
        throw new IOException("null object detected");
    }

    public void a(u uVar) throws IOException {
        if (uVar != null) {
            uVar.a(new a(this.f66302a));
            return;
        }
        throw new IOException("null object detected");
    }

    public s a() {
        return new g1(this.f66302a);
    }
}
