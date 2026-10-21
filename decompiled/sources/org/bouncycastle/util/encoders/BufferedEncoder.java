package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes13.dex */
public class BufferedEncoder {
    protected byte[] buf;
    protected int bufOff;
    protected Translator translator;

    public BufferedEncoder(Translator translator, int i10) {
        this.translator = translator;
        if (i10 % translator.getEncodedBlockSize() != 0) {
            throw new IllegalArgumentException("buffer size not multiple of input block size");
        }
        this.buf = new byte[i10];
        this.bufOff = 0;
    }

    public int processByte(byte b10, byte[] bArr, int i10) {
        byte[] bArr2 = this.buf;
        int i11 = this.bufOff;
        int i12 = i11 + 1;
        this.bufOff = i12;
        bArr2[i11] = b10;
        if (i12 != bArr2.length) {
            return 0;
        }
        int iEncode = this.translator.encode(bArr2, 0, bArr2.length, bArr, i10);
        this.bufOff = 0;
        return iEncode;
    }

    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i13 = this.bufOff;
        int i14 = length - i13;
        int iEncode = 0;
        if (i11 > i14) {
            System.arraycopy(bArr, i10, bArr3, i13, i14);
            Translator translator = this.translator;
            byte[] bArr4 = this.buf;
            int iEncode2 = translator.encode(bArr4, 0, bArr4.length, bArr2, i12);
            this.bufOff = 0;
            int i15 = i11 - i14;
            int i16 = i10 + i14;
            int i17 = i12 + iEncode2;
            int length2 = i15 - (i15 % this.buf.length);
            iEncode = iEncode2 + this.translator.encode(bArr, i16, length2, bArr2, i17);
            i11 = i15 - length2;
            i10 = i16 + length2;
        }
        if (i11 != 0) {
            System.arraycopy(bArr, i10, this.buf, this.bufOff, i11);
            this.bufOff += i11;
        }
        return iEncode;
    }
}
