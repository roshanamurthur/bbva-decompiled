package org.bouncycastle.util.encoders;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class HexEncoder implements Encoder {
    protected final byte[] encodingTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, Constants.DIRECTORY_ENTRY, 98, 99, 100, 101, 102};
    protected final byte[] decodingTable = new byte[128];

    public HexEncoder() {
        initialiseDecodingTable();
    }

    public static boolean b(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    public final byte[] a(String str, int i10, int i11) throws IOException {
        if (str == null) {
            throw new NullPointerException("'str' cannot be null");
        }
        if (i10 < 0 || i11 < 0 || i10 > str.length() - i11) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i11 & 1) != 0) {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
        int i12 = i11 >>> 1;
        byte[] bArr = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 + 1;
            byte b10 = this.decodingTable[str.charAt(i10)];
            i10 += 2;
            int i15 = (b10 << 4) | this.decodingTable[str.charAt(i14)];
            if (i15 < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            bArr[i13] = (byte) i15;
        }
        return bArr;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && b(str.charAt(length - 1))) {
            length--;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            while (i10 < length && b(str.charAt(i10))) {
                i10++;
            }
            int i12 = i10 + 1;
            byte b10 = this.decodingTable[str.charAt(i10)];
            while (i12 < length && b(str.charAt(i12))) {
                i12++;
            }
            int i13 = i12 + 1;
            byte b11 = this.decodingTable[str.charAt(i12)];
            if ((b10 | b11) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            outputStream.write((b10 << 4) | b11);
            i11++;
            i10 = i13;
        }
        return i11;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            byte b10 = bArr[i12];
            outputStream.write(this.encodingTable[(b10 & 255) >>> 4]);
            outputStream.write(this.encodingTable[b10 & 15]);
        }
        return i11 * 2;
    }

    public void initialiseDecodingTable() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i10 >= bArr2.length) {
                byte[] bArr3 = this.decodingTable;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.decodingTable[bArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        int i12 = i11 + i10;
        while (i12 > i10 && b((char) bArr[i12 - 1])) {
            i12--;
        }
        int i13 = 0;
        while (i10 < i12) {
            while (i10 < i12 && b((char) bArr[i10])) {
                i10++;
            }
            int i14 = i10 + 1;
            byte b10 = this.decodingTable[bArr[i10]];
            while (i14 < i12 && b((char) bArr[i14])) {
                i14++;
            }
            int i15 = i14 + 1;
            byte b11 = this.decodingTable[bArr[i14]];
            if ((b10 | b11) < 0) {
                throw new IOException("invalid characters encountered in Hex data");
            }
            outputStream.write((b10 << 4) | b11);
            i13++;
            i10 = i15;
        }
        return i13;
    }
}
