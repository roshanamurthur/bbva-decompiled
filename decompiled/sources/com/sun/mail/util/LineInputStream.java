package com.sun.mail.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes9.dex */
public class LineInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f65550p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f65551q0;

    public LineInputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public String readLine() throws IOException {
        int i10;
        byte[] bArr = this.f65551q0;
        if (bArr == null) {
            bArr = new byte[128];
            this.f65551q0 = bArr;
        }
        int length = bArr.length;
        int i11 = 0;
        while (true) {
            i10 = ((FilterInputStream) this).in.read();
            if (i10 == -1 || i10 == 10) {
                break;
            }
            boolean z10 = true;
            if (i10 == 13) {
                if (((FilterInputStream) this).in.markSupported()) {
                    ((FilterInputStream) this).in.mark(2);
                }
                int i12 = ((FilterInputStream) this).in.read();
                if (i12 == 13) {
                    i12 = ((FilterInputStream) this).in.read();
                } else {
                    z10 = false;
                }
                if (i12 == 10) {
                    break;
                }
                if (!((FilterInputStream) this).in.markSupported()) {
                    if (!(((FilterInputStream) this).in instanceof PushbackInputStream)) {
                        ((FilterInputStream) this).in = new PushbackInputStream(((FilterInputStream) this).in, 2);
                    }
                    if (i12 != -1) {
                        ((PushbackInputStream) ((FilterInputStream) this).in).unread(i12);
                    }
                    if (!z10) {
                        break;
                    }
                    ((PushbackInputStream) ((FilterInputStream) this).in).unread(13);
                    break;
                }
                ((FilterInputStream) this).in.reset();
                break;
            }
            length--;
            if (length < 0) {
                bArr = bArr.length < 1048576 ? new byte[bArr.length * 2] : new byte[bArr.length + 1048576];
                length = (bArr.length - i11) - 1;
                System.arraycopy(this.f65551q0, 0, bArr, 0, i11);
                this.f65551q0 = bArr;
            }
            bArr[i11] = (byte) i10;
            i11++;
        }
        if (i10 == -1 && i11 == 0) {
            return null;
        }
        return this.f65550p0 ? new String(bArr, 0, i11, StandardCharsets.UTF_8) : new String(bArr, 0, 0, i11);
    }

    public LineInputStream(InputStream inputStream, boolean z10) {
        super(inputStream);
        this.f65551q0 = null;
        this.f65550p0 = z10;
    }
}
