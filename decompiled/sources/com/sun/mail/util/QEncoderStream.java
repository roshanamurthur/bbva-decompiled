package com.sun.mail.util;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class QEncoderStream extends QPEncoderStream {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f65574u0;

    public QEncoderStream(OutputStream outputStream, boolean z10) {
        super(outputStream, Integer.MAX_VALUE);
        this.f65574u0 = z10 ? "=_?\"#$%&'(),.:;<>@[\\]^`{|}~" : "=_?";
    }

    public static int encodedLength(byte[] bArr, boolean z10) {
        String str = z10 ? "=_?\"#$%&'(),.:;<>@[\\]^`{|}~" : "=_?";
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = b10 & 255;
            i10 = (i11 < 32 || i11 >= 127 || str.indexOf(i11) >= 0) ? i10 + 3 : i10 + 1;
        }
        return i10;
    }

    @Override // com.sun.mail.util.QPEncoderStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        int i11 = i10 & 255;
        if (i11 == 32) {
            output(95, false);
        } else if (i11 < 32 || i11 >= 127 || this.f65574u0.indexOf(i11) >= 0) {
            output(i11, true);
        } else {
            output(i11, false);
        }
    }
}
