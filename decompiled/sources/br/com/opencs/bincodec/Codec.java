package br.com.opencs.bincodec;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface Codec {
    int decode(CharSequence charSequence, int i10, int i11, byte[] bArr, int i12) throws IllegalArgumentException;

    byte[] decode(CharSequence charSequence) throws IllegalArgumentException;

    byte[] decode(CharSequence charSequence, int i10, int i11) throws IllegalArgumentException;

    int encode(byte[] bArr, int i10, int i11, Appendable appendable) throws IOException;

    String encode(byte[] bArr);

    String encode(byte[] bArr, int i10, int i11);

    int getDecodedSize(int i10);

    int getEncodedSize(int i10);
}
