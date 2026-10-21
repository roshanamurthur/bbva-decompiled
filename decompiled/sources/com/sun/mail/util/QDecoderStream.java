package com.sun.mail.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class QDecoderStream extends QPDecoderStream {
    public QDecoderStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // com.sun.mail.util.QPDecoderStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 == 95) {
            return 32;
        }
        if (i10 != 61) {
            return i10;
        }
        this.ba[0] = (byte) ((FilterInputStream) this).in.read();
        this.ba[1] = (byte) ((FilterInputStream) this).in.read();
        try {
            return ASCIIUtility.parseInt(this.ba, 0, 2, 16);
        } catch (NumberFormatException e5) {
            throw new DecodingException("QDecoder: Error in QP stream " + e5.getMessage());
        }
    }
}
