package com.sun.mail.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
public class LogOutputStream extends OutputStream {
    protected MailLogger logger;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f65554p0 = -1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f65555q0 = new byte[80];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f65556r0 = 0;
    protected Level level = Level.FINEST;

    public LogOutputStream(MailLogger mailLogger) {
        this.logger = mailLogger;
    }

    public final void a(int i10) {
        while (true) {
            int i11 = this.f65556r0;
            int i12 = i11 + i10;
            byte[] bArr = this.f65555q0;
            if (i12 <= bArr.length) {
                return;
            }
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            this.f65555q0 = bArr2;
        }
    }

    public final void b() {
        String str = new String(this.f65555q0, 0, this.f65556r0);
        this.f65556r0 = 0;
        log(str);
    }

    public void log(String str) {
        this.logger.log(this.level, str);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        if (this.logger.isLoggable(this.level)) {
            if (i10 == 13) {
                b();
            } else if (i10 != 10) {
                a(1);
                byte[] bArr = this.f65555q0;
                int i11 = this.f65556r0;
                this.f65556r0 = i11 + 1;
                bArr[i11] = (byte) i10;
            } else if (this.f65554p0 != 13) {
                b();
            }
            this.f65554p0 = i10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (this.logger.isLoggable(this.level)) {
            int i12 = i11 + i10;
            int i13 = i10;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (b10 == 13) {
                    int i14 = i10 - i13;
                    a(i14);
                    System.arraycopy(bArr, i13, this.f65555q0, this.f65556r0, i14);
                    this.f65556r0 += i14;
                    b();
                } else {
                    if (b10 == 10) {
                        if (this.f65554p0 != 13) {
                            int i15 = i10 - i13;
                            a(i15);
                            System.arraycopy(bArr, i13, this.f65555q0, this.f65556r0, i15);
                            this.f65556r0 += i15;
                            b();
                        }
                    }
                    this.f65554p0 = bArr[i10];
                    i10++;
                }
                i13 = i10 + 1;
                this.f65554p0 = bArr[i10];
                i10++;
            }
            int i16 = i12 - i13;
            if (i16 > 0) {
                a(i16);
                System.arraycopy(bArr, i13, this.f65555q0, this.f65556r0, i16);
                this.f65556r0 += i16;
            }
        }
    }
}
