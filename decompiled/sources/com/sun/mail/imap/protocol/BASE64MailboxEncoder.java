package com.sun.mail.imap.protocol;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class BASE64MailboxEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f65411a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', AbstractJsonLexerKt.COMMA};
    protected Writer out;
    protected byte[] buffer = new byte[4];
    protected int bufsize = 0;
    protected boolean started = false;

    public BASE64MailboxEncoder(Writer writer) {
        this.out = writer;
    }

    public static String encode(String str) {
        char[] charArray = str.toCharArray();
        CharArrayWriter charArrayWriter = new CharArrayWriter(charArray.length);
        BASE64MailboxEncoder bASE64MailboxEncoder = null;
        boolean z10 = false;
        for (char c10 : charArray) {
            if (c10 < ' ' || c10 > '~') {
                if (bASE64MailboxEncoder == null) {
                    bASE64MailboxEncoder = new BASE64MailboxEncoder(charArrayWriter);
                    z10 = true;
                }
                bASE64MailboxEncoder.write(c10);
            } else {
                if (bASE64MailboxEncoder != null) {
                    bASE64MailboxEncoder.flush();
                }
                if (c10 == '&') {
                    charArrayWriter.write(38);
                    charArrayWriter.write(45);
                    z10 = true;
                } else {
                    charArrayWriter.write(c10);
                }
            }
        }
        if (bASE64MailboxEncoder != null) {
            bASE64MailboxEncoder.flush();
        }
        return z10 ? charArrayWriter.toString() : str;
    }

    public void flush() {
        try {
            if (this.bufsize > 0) {
                encode();
                this.bufsize = 0;
            }
            if (this.started) {
                this.out.write(45);
                this.started = false;
            }
        } catch (IOException unused) {
        }
    }

    public void write(int i10) {
        try {
            if (!this.started) {
                this.started = true;
                this.out.write(38);
            }
            byte[] bArr = this.buffer;
            int i11 = this.bufsize;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 >> 8);
            int i13 = i11 + 2;
            this.bufsize = i13;
            bArr[i12] = (byte) (i10 & 255);
            if (i13 >= 3) {
                encode();
                this.bufsize -= 3;
            }
        } catch (IOException unused) {
        }
    }

    public void encode() throws IOException {
        int i10 = this.bufsize;
        char[] cArr = f65411a;
        if (i10 == 1) {
            byte b10 = this.buffer[0];
            this.out.write(cArr[(b10 >>> 2) & 63]);
            this.out.write(cArr[(b10 << 4) & 48]);
            return;
        }
        if (i10 == 2) {
            byte[] bArr = this.buffer;
            byte b11 = bArr[0];
            byte b12 = bArr[1];
            this.out.write(cArr[(b11 >>> 2) & 63]);
            this.out.write(cArr[((b11 << 4) & 48) + ((b12 >>> 4) & 15)]);
            this.out.write(cArr[(b12 << 2) & 60]);
            return;
        }
        byte[] bArr2 = this.buffer;
        byte b13 = bArr2[0];
        byte b14 = bArr2[1];
        byte b15 = bArr2[2];
        this.out.write(cArr[(b13 >>> 2) & 63]);
        this.out.write(cArr[((b13 << 4) & 48) + ((b14 >>> 4) & 15)]);
        this.out.write(cArr[((b14 << 2) & 60) + ((b15 >>> 6) & 3)]);
        this.out.write(cArr[b15 & 63]);
        if (this.bufsize == 4) {
            byte[] bArr3 = this.buffer;
            bArr3[0] = bArr3[3];
        }
    }
}
