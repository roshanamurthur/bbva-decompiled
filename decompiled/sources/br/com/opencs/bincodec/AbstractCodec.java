package br.com.opencs.bincodec;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractCodec implements Codec {
    @Override // br.com.opencs.bincodec.Codec
    public abstract int decode(CharSequence charSequence, int i10, int i11, byte[] bArr, int i12);

    @Override // br.com.opencs.bincodec.Codec
    public byte[] decode(CharSequence charSequence) throws IllegalArgumentException {
        return decode(charSequence, 0, charSequence.length());
    }

    @Override // br.com.opencs.bincodec.Codec
    public abstract int encode(byte[] bArr, int i10, int i11, Appendable appendable) throws IOException;

    @Override // br.com.opencs.bincodec.Codec
    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    @Override // br.com.opencs.bincodec.Codec
    public abstract int getDecodedSize(int i10);

    @Override // br.com.opencs.bincodec.Codec
    public abstract int getEncodedSize(int i10);

    @Override // br.com.opencs.bincodec.Codec
    public byte[] decode(CharSequence charSequence, int i10, int i11) throws IllegalArgumentException {
        int decodedSize = getDecodedSize(i11);
        byte[] bArr = new byte[decodedSize];
        int iDecode = decode(charSequence, i10, i11, bArr, 0);
        return iDecode == decodedSize ? bArr : Arrays.copyOf(bArr, iDecode);
    }

    @Override // br.com.opencs.bincodec.Codec
    public String encode(byte[] bArr, int i10, int i11) {
        try {
            StringBuilder sb2 = new StringBuilder(getEncodedSize(i11));
            encode(bArr, i10, i11, sb2);
            return sb2.toString();
        } catch (IOException unused) {
            return null;
        }
    }
}
