package org.bouncycastle.util.encoders;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, Constants.CVR_B1b85_0101_MOBILE_APP, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, Constants.DIRECTORY_ENTRY, 98, 99, 100, 101, 102, 103, 104, 105, GenerateAcResponseApdu.DDA_HEADER, 107, 108, 109, 110, Constants.FCI_TEMPLATE, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 113, 114, 115, 116, 117, 118, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte padding = kotlin.io.encoding.Base64.padSymbol;
    protected final byte[] decodingTable = new byte[128];

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    public static boolean b(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    public static int c(int i10, int i11, String str) {
        while (i10 < i11 && b(str.charAt(i10))) {
            i10++;
        }
        return i10;
    }

    public static int d(int i10, int i11, byte[] bArr) {
        while (i10 < i11 && b((char) bArr[i10])) {
            i10++;
        }
        return i10;
    }

    public final int a(OutputStream outputStream, char c10, char c11, char c12, char c13) throws IOException {
        char c14 = this.padding;
        if (c12 == c14) {
            if (c13 != c14) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr = this.decodingTable;
            byte b10 = bArr[c10];
            byte b11 = bArr[c11];
            if ((b10 | b11) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b10 << 2) | (b11 >> 4));
            return 1;
        }
        if (c13 == c14) {
            byte[] bArr2 = this.decodingTable;
            byte b12 = bArr2[c10];
            byte b13 = bArr2[c11];
            byte b14 = bArr2[c12];
            if ((b12 | b13 | b14) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b12 << 2) | (b13 >> 4));
            outputStream.write((b13 << 4) | (b14 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b15 = bArr3[c10];
        byte b16 = bArr3[c11];
        byte b17 = bArr3[c12];
        byte b18 = bArr3[c13];
        if ((b15 | b16 | b17 | b18) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write((b15 << 2) | (b16 >> 4));
        outputStream.write((b16 << 4) | (b17 >> 2));
        outputStream.write((b17 << 6) | b18);
        return 3;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && b(str.charAt(length - 1))) {
            length--;
        }
        int i10 = 0;
        if (length == 0) {
            return 0;
        }
        int i11 = length;
        int i12 = 0;
        while (i11 > 0 && i12 != 4) {
            if (!b(str.charAt(i11 - 1))) {
                i12++;
            }
            i11--;
        }
        int iC = c(0, i11, str);
        while (iC < i11) {
            int i13 = iC + 1;
            byte b10 = this.decodingTable[str.charAt(iC)];
            int iC2 = c(i13, i11, str);
            int i14 = iC2 + 1;
            byte b11 = this.decodingTable[str.charAt(iC2)];
            int iC3 = c(i14, i11, str);
            int i15 = iC3 + 1;
            byte b12 = this.decodingTable[str.charAt(iC3)];
            int iC4 = c(i15, i11, str);
            int i16 = iC4 + 1;
            byte b13 = this.decodingTable[str.charAt(iC4)];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write((b10 << 2) | (b11 >> 4));
            outputStream.write((b11 << 4) | (b12 >> 2));
            outputStream.write((b12 << 6) | b13);
            i10 += 3;
            iC = c(i16, i11, str);
        }
        int iC5 = c(iC, length, str);
        int iC6 = c(iC5 + 1, length, str);
        int iC7 = c(iC6 + 1, length, str);
        return i10 + a(outputStream, str.charAt(iC5), str.charAt(iC6), str.charAt(iC7), str.charAt(c(iC7 + 1, length, str)));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a4  */
    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        int i12;
        byte b10;
        int i13 = i11 % 3;
        int i14 = i11 - i13;
        int i15 = i10;
        while (true) {
            i12 = i10 + i14;
            if (i15 >= i12) {
                break;
            }
            int i16 = bArr[i15] & 255;
            int i17 = bArr[i15 + 1] & 255;
            byte b11 = bArr[i15 + 2];
            outputStream.write(this.encodingTable[(i16 >>> 2) & 63]);
            outputStream.write(this.encodingTable[((i16 << 4) | (i17 >>> 4)) & 63]);
            outputStream.write(this.encodingTable[((i17 << 2) | ((b11 & 255) >>> 6)) & 63]);
            outputStream.write(this.encodingTable[b11 & 63]);
            i15 += 3;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                int i18 = bArr[i12] & 255;
                int i19 = bArr[i12 + 1] & 255;
                outputStream.write(this.encodingTable[(i18 >>> 2) & 63]);
                outputStream.write(this.encodingTable[((i18 << 4) | (i19 >>> 4)) & 63]);
                b10 = this.encodingTable[(i19 << 2) & 63];
            }
            return ((i14 / 3) * 4) + (i13 == 0 ? 0 : 4);
        }
        int i20 = bArr[i12] & 255;
        outputStream.write(this.encodingTable[(i20 >>> 2) & 63]);
        outputStream.write(this.encodingTable[(i20 << 4) & 63]);
        b10 = this.padding;
        outputStream.write(b10);
        outputStream.write(this.padding);
        return ((i14 / 3) * 4) + (i13 == 0 ? 0 : 4);
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
        if (i12 == 0) {
            return 0;
        }
        int i14 = i12;
        int i15 = 0;
        while (i14 > i10 && i15 != 4) {
            if (!b((char) bArr[i14 - 1])) {
                i15++;
            }
            i14--;
        }
        int iD = d(i10, i14, bArr);
        while (iD < i14) {
            int i16 = iD + 1;
            byte b10 = this.decodingTable[bArr[iD]];
            int iD2 = d(i16, i14, bArr);
            int i17 = iD2 + 1;
            byte b11 = this.decodingTable[bArr[iD2]];
            int iD3 = d(i17, i14, bArr);
            int i18 = iD3 + 1;
            byte b12 = this.decodingTable[bArr[iD3]];
            int iD4 = d(i18, i14, bArr);
            int i19 = iD4 + 1;
            byte b13 = this.decodingTable[bArr[iD4]];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write((b10 << 2) | (b11 >> 4));
            outputStream.write((b11 << 4) | (b12 >> 2));
            outputStream.write((b12 << 6) | b13);
            i13 += 3;
            iD = d(i19, i14, bArr);
        }
        int iD5 = d(iD, i12, bArr);
        int iD6 = d(iD5 + 1, i12, bArr);
        int iD7 = d(iD6 + 1, i12, bArr);
        return i13 + a(outputStream, (char) bArr[iD5], (char) bArr[iD6], (char) bArr[iD7], (char) bArr[d(iD7 + 1, i12, bArr)]);
    }
}
