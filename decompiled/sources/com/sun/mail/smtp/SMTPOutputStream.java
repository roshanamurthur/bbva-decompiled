package com.sun.mail.smtp;

import com.sun.mail.util.CRLFOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class SMTPOutputStream extends CRLFOutputStream {
    public SMTPOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public void ensureAtBOL() throws IOException {
        if (this.atBOL) {
            return;
        }
        super.writeln();
    }

    @Override // com.sun.mail.util.CRLFOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        int i11 = this.lastb;
        if ((i11 == 10 || i11 == 13 || i11 == -1) && i10 == 46) {
            ((FilterOutputStream) this).out.write(46);
        }
        super.write(i10);
    }

    @Override // com.sun.mail.util.CRLFOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.lastb;
        if (i12 == -1) {
            i12 = 10;
        }
        int i13 = i11 + i10;
        int i14 = i12;
        int i15 = i10;
        while (i10 < i13) {
            if ((i14 == 10 || i14 == 13) && bArr[i10] == 46) {
                super.write(bArr, i15, i10 - i15);
                ((FilterOutputStream) this).out.write(46);
                i15 = i10;
            }
            byte b10 = bArr[i10];
            i10++;
            i14 = b10;
        }
        int i16 = i13 - i15;
        if (i16 > 0) {
            super.write(bArr, i15, i16);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}
