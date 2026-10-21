package com.google.zxing.qrcode.encoder;

import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.compat.u;
import com.google.android.play.core.splitinstall.internal.h;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import mh.b;

/* JADX INFO: loaded from: classes10.dex */
public final class Encoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f50069a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50070a;

        static {
            int[] iArr = new int[Mode.values().length];
            f50070a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50070a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50070a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50070a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Mode a(String str, String str2) {
        if ("Shift_JIS".equals(str2)) {
            try {
                byte[] bytes = str.getBytes("Shift_JIS");
                int length = bytes.length;
                if (length % 2 == 0) {
                    for (int i10 = 0; i10 < length; i10 += 2) {
                        int i11 = bytes[i10] & 255;
                        if ((i11 >= 129 && i11 <= 159) || (i11 >= 224 && i11 <= 235)) {
                        }
                    }
                    return Mode.KANJI;
                }
            } catch (UnsupportedEncodingException unused) {
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z11 = true;
            } else {
                if (cCharAt >= '`' || f50069a[cCharAt] == -1) {
                    return Mode.BYTE;
                }
                z10 = true;
            }
        }
        if (z10) {
            return Mode.ALPHANUMERIC;
        }
        return z11 ? Mode.NUMERIC : Mode.BYTE;
    }

    public static Mode chooseMode(String str) {
        return a(str, null);
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        return encode(str, errorCorrectionLevel, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:104:0x0216  */
    /* JADX WARN: Code duplicated, block: B:292:0x061b A[LOOP:23: B:103:0x0214->B:292:0x061b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:295:0x062f A[LOOP:22: B:98:0x01e9->B:295:0x062f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:361:0x063d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0629 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01d5  */
    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
        int size;
        int i10;
        Version versionForNumber;
        int size2;
        int i11;
        Version versionForNumber2;
        Version versionForNumber3;
        Version version;
        int i12;
        int i13;
        int i14;
        CharacterSetECI characterSetECIByName;
        boolean z10 = map != null && map.containsKey(EncodeHintType.CHARACTER_SET);
        String string = z10 ? map.get(EncodeHintType.CHARACTER_SET).toString() : "ISO-8859-1";
        Mode modeA = a(str, string);
        BitArray bitArray = new BitArray();
        int i15 = 8;
        if (modeA == Mode.BYTE && z10 && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(string)) != null) {
            bitArray.appendBits(Mode.ECI.getBits(), 4);
            bitArray.appendBits(characterSetECIByName.getValue(), 8);
        }
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.GS1_FORMAT;
            if (map.containsKey(encodeHintType) && Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue()) {
                bitArray.appendBits(Mode.FNC1_FIRST_POSITION.getBits(), 4);
            }
        }
        bitArray.appendBits(modeA.getBits(), 4);
        BitArray bitArray2 = new BitArray();
        int i16 = a.f50070a[modeA.ordinal()];
        char c10 = '\n';
        if (i16 == 1) {
            int length = str.length();
            int i17 = 0;
            while (i17 < length) {
                int iCharAt = str.charAt(i17) - '0';
                int i18 = i17 + 2;
                if (i18 < length) {
                    bitArray2.appendBits(u.b(str.charAt(i17 + 1) - '0', 10, iCharAt * 100, str.charAt(i18) - '0'), 10);
                    i17 += 3;
                } else {
                    i17++;
                    if (i17 < length) {
                        bitArray2.appendBits((iCharAt * 10) + (str.charAt(i17) - '0'), 7);
                        i17 = i18;
                    } else {
                        bitArray2.appendBits(iCharAt, 4);
                    }
                }
            }
        } else if (i16 == 2) {
            int length2 = str.length();
            int i19 = 0;
            while (i19 < length2) {
                char cCharAt = str.charAt(i19);
                int[] iArr = f50069a;
                int i20 = cCharAt < '`' ? iArr[cCharAt] : -1;
                if (i20 == -1) {
                    throw new WriterException();
                }
                int i21 = i19 + 1;
                if (i21 < length2) {
                    char cCharAt2 = str.charAt(i21);
                    int i22 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i22 == -1) {
                        throw new WriterException();
                    }
                    bitArray2.appendBits((i20 * 45) + i22, 11);
                    i19 += 2;
                } else {
                    bitArray2.appendBits(i20, 6);
                    i19 = i21;
                }
            }
        } else if (i16 == 3) {
            try {
                byte[] bytes = str.getBytes(string);
                for (byte b10 : bytes) {
                    bitArray2.appendBits(b10, 8);
                }
            } catch (UnsupportedEncodingException e5) {
                throw new WriterException(e5);
            }
        } else {
            if (i16 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(modeA)));
            }
            try {
                byte[] bytes2 = str.getBytes("Shift_JIS");
                int length3 = bytes2.length;
                for (int i23 = 0; i23 < length3; i23 += 2) {
                    int i24 = ((bytes2[i23] & 255) << 8) | (bytes2[i23 + 1] & 255);
                    int i25 = 33088;
                    if (i24 >= 33088 && i24 <= 40956) {
                        i14 = i24 - i25;
                    } else if (i24 < 57408 || i24 > 60351) {
                        i14 = -1;
                    } else {
                        i25 = 49472;
                        i14 = i24 - i25;
                    }
                    if (i14 == -1) {
                        throw new WriterException("Invalid byte sequence");
                    }
                    bitArray2.appendBits(((i14 >> 8) * 192) + (i14 & 255), 13);
                }
            } catch (UnsupportedEncodingException e7) {
                throw new WriterException(e7);
            }
        }
        if (map != null) {
            EncodeHintType encodeHintType2 = EncodeHintType.QR_VERSION;
            if (map.containsKey(encodeHintType2)) {
                versionForNumber3 = Version.getVersionForNumber(Integer.parseInt(map.get(encodeHintType2).toString()));
                if (versionForNumber3.getTotalCodewords() - versionForNumber3.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() < ((bitArray2.getSize() + (modeA.getCharacterCountBits(versionForNumber3) + bitArray.getSize())) + 7) / 8) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                size = bitArray2.getSize() + modeA.getCharacterCountBits(Version.getVersionForNumber(1)) + bitArray.getSize();
                i10 = 1;
                while (true) {
                    if (i10 <= 40) {
                        throw new WriterException("Data too big");
                    }
                    versionForNumber = Version.getVersionForNumber(i10);
                    if (versionForNumber.getTotalCodewords() - versionForNumber.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (size + 7) / i15) {
                        size2 = bitArray2.getSize() + modeA.getCharacterCountBits(versionForNumber) + bitArray.getSize();
                        i11 = 1;
                        while (true) {
                            if (i11 <= 40) {
                                throw new WriterException("Data too big");
                            }
                            versionForNumber2 = Version.getVersionForNumber(i11);
                            if (versionForNumber2.getTotalCodewords() - versionForNumber2.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (size2 + 7) / i15) {
                                versionForNumber3 = versionForNumber2;
                                break;
                            }
                            i11++;
                            modeA = modeA;
                            c10 = c10;
                            i15 = 8;
                        }
                    } else {
                        i10++;
                        modeA = modeA;
                        c10 = c10;
                        i15 = 8;
                    }
                }
            }
        } else {
            size = bitArray2.getSize() + modeA.getCharacterCountBits(Version.getVersionForNumber(1)) + bitArray.getSize();
            i10 = 1;
            while (true) {
                if (i10 <= 40) {
                    throw new WriterException("Data too big");
                }
                versionForNumber = Version.getVersionForNumber(i10);
                if (versionForNumber.getTotalCodewords() - versionForNumber.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (size + 7) / i15) {
                    size2 = bitArray2.getSize() + modeA.getCharacterCountBits(versionForNumber) + bitArray.getSize();
                    i11 = 1;
                    while (true) {
                        if (i11 <= 40) {
                            throw new WriterException("Data too big");
                        }
                        versionForNumber2 = Version.getVersionForNumber(i11);
                        if (versionForNumber2.getTotalCodewords() - versionForNumber2.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (size2 + 7) / i15) {
                            versionForNumber3 = versionForNumber2;
                            break;
                        }
                        i11++;
                        modeA = modeA;
                        c10 = c10;
                        i15 = 8;
                    }
                } else {
                    i10++;
                    modeA = modeA;
                    c10 = c10;
                    i15 = 8;
                }
            }
        }
        BitArray bitArray3 = new BitArray();
        bitArray3.appendBitArray(bitArray);
        int sizeInBytes = modeA == Mode.BYTE ? bitArray2.getSizeInBytes() : str.length();
        int characterCountBits = modeA.getCharacterCountBits(versionForNumber3);
        int i26 = 1 << characterCountBits;
        if (sizeInBytes >= i26) {
            throw new WriterException(sizeInBytes + " is bigger than " + (i26 - 1));
        }
        bitArray3.appendBits(sizeInBytes, characterCountBits);
        bitArray3.appendBitArray(bitArray2);
        Version.ECBlocks eCBlocksForLevel = versionForNumber3.getECBlocksForLevel(errorCorrectionLevel);
        int totalCodewords = versionForNumber3.getTotalCodewords() - eCBlocksForLevel.getTotalECCodewords();
        int i27 = totalCodewords << 3;
        if (bitArray3.getSize() > i27) {
            throw new WriterException("data bits cannot fit in the QR Code" + bitArray3.getSize() + " > " + i27);
        }
        for (int i28 = 0; i28 < 4 && bitArray3.getSize() < i27; i28++) {
            bitArray3.appendBit(false);
        }
        boolean z11 = false;
        int size3 = bitArray3.getSize() & 7;
        if (size3 > 0) {
            while (size3 < i15) {
                bitArray3.appendBit(z11);
                size3++;
                z11 = false;
            }
        }
        int sizeInBytes2 = totalCodewords - bitArray3.getSizeInBytes();
        for (int i29 = 0; i29 < sizeInBytes2; i29++) {
            bitArray3.appendBits((i29 & 1) == 0 ? 236 : 17, i15);
        }
        if (bitArray3.getSize() != i27) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int totalCodewords2 = versionForNumber3.getTotalCodewords();
        int numBlocks = eCBlocksForLevel.getNumBlocks();
        if (bitArray3.getSizeInBytes() != totalCodewords) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(numBlocks);
        int i30 = 0;
        int i31 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i30 < numBlocks) {
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            if (i30 >= numBlocks) {
                throw new WriterException("Block ID too large");
            }
            int i32 = totalCodewords2 % numBlocks;
            int i33 = numBlocks - i32;
            int i34 = totalCodewords2 / numBlocks;
            int i35 = i34 + 1;
            int i36 = totalCodewords / numBlocks;
            int i37 = i36 + 1;
            Version version2 = versionForNumber3;
            int i38 = i34 - i36;
            Mode mode = modeA;
            int i39 = i35 - i37;
            if (i38 != i39) {
                throw new WriterException("EC bytes mismatch");
            }
            if (numBlocks != i33 + i32) {
                throw new WriterException("RS blocks mismatch");
            }
            if (totalCodewords2 != ((i37 + i39) * i32) + ((i36 + i38) * i33)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i30 < i33) {
                i13 = 0;
                iArr2[0] = i36;
                iArr3[0] = i38;
            } else {
                i13 = 0;
                iArr2[0] = i37;
                iArr3[0] = i39;
            }
            int i40 = iArr2[i13];
            byte[] bArr = new byte[i40];
            bitArray3.toBytes(i31 << 3, bArr, i13, i40);
            int i41 = iArr3[i13];
            int[] iArr4 = new int[i40 + i41];
            for (int i42 = 0; i42 < i40; i42++) {
                iArr4[i42] = bArr[i42] & 255;
            }
            new ReedSolomonEncoder(GenericGF.QR_CODE_FIELD_256).encode(iArr4, i41);
            byte[] bArr2 = new byte[i41];
            int i43 = 0;
            while (i43 < i41) {
                bArr2[i43] = (byte) iArr4[i40 + i43];
                i43++;
                numBlocks = numBlocks;
            }
            arrayList.add(new mh.a(bArr, bArr2));
            iMax = Math.max(iMax, i40);
            iMax2 = Math.max(iMax2, i41);
            i31 += iArr2[0];
            i30++;
            numBlocks = numBlocks;
            versionForNumber3 = version2;
            modeA = mode;
        }
        Version version3 = versionForNumber3;
        Mode mode2 = modeA;
        if (totalCodewords != i31) {
            throw new WriterException("Data bytes does not match offset");
        }
        BitArray bitArray4 = new BitArray();
        for (int i44 = 0; i44 < iMax; i44++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = ((mh.a) it.next()).f83472a;
                if (i44 < bArr3.length) {
                    bitArray4.appendBits(bArr3[i44], 8);
                }
            }
        }
        for (int i45 = 0; i45 < iMax2; i45++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr4 = ((mh.a) it2.next()).f83473b;
                if (i45 < bArr4.length) {
                    bitArray4.appendBits(bArr4[i45], 8);
                }
            }
        }
        if (totalCodewords2 != bitArray4.getSizeInBytes()) {
            StringBuilder sbC = o1.c("Interleaving error: ", totalCodewords2, " and ");
            sbC.append(bitArray4.getSizeInBytes());
            sbC.append(" differ.");
            throw new WriterException(sbC.toString());
        }
        QRCode qRCode = new QRCode();
        qRCode.setECLevel(errorCorrectionLevel);
        qRCode.setMode(mode2);
        Version version4 = version3;
        qRCode.setVersion(version4);
        int dimensionForVersion = version4.getDimensionForVersion();
        ByteMatrix byteMatrix = new ByteMatrix(dimensionForVersion, dimensionForVersion);
        int i46 = Integer.MAX_VALUE;
        int i47 = 0;
        int i48 = -1;
        for (int i49 = 8; i47 < i49; i49 = 8) {
            b.a(bitArray4, errorCorrectionLevel, version4, i47, byteMatrix);
            int iB = h.b(byteMatrix, false) + h.b(byteMatrix, true);
            byte[][] array = byteMatrix.getArray();
            int width = byteMatrix.getWidth();
            int height = byteMatrix.getHeight();
            int i50 = 0;
            int i51 = 0;
            while (i50 < height - 1) {
                byte[] bArr5 = array[i50];
                BitArray bitArray5 = bitArray4;
                int i52 = height;
                int i53 = 0;
                while (i53 < width - 1) {
                    byte b11 = bArr5[i53];
                    int i54 = i53 + 1;
                    int i55 = width;
                    if (b11 == bArr5[i54]) {
                        byte[] bArr6 = array[i50 + 1];
                        if (b11 == bArr6[i53] && b11 == bArr6[i54]) {
                            i51++;
                        }
                    }
                    i53 = i54;
                    width = i55;
                }
                i50++;
                height = i52;
                bitArray4 = bitArray5;
            }
            BitArray bitArray6 = bitArray4;
            int i56 = (i51 * 3) + iB;
            byte[][] array2 = byteMatrix.getArray();
            int width2 = byteMatrix.getWidth();
            int height2 = byteMatrix.getHeight();
            int i57 = 0;
            int i58 = 0;
            while (i57 < height2) {
                int i59 = i58;
                int i60 = 0;
                while (i60 < width2) {
                    byte[] bArr7 = array2[i57];
                    int i61 = i60 + 6;
                    if (i61 < width2) {
                        i12 = width2;
                        version = version4;
                        byte b12 = 1;
                        if (bArr7[i60] == 1 && bArr7[i60 + 1] == 0 && bArr7[i60 + 2] == 1 && bArr7[i60 + 3] == 1 && bArr7[i60 + 4] == 1 && bArr7[i60 + 5] == 0 && bArr7[i61] == 1) {
                            int iMax3 = Math.max(i60 - 4, 0);
                            int iMin = Math.min(i60, bArr7.length);
                            while (true) {
                                if (iMax3 < iMin) {
                                    int i62 = iMin;
                                    if (bArr7[iMax3] == b12) {
                                        int iMax4 = Math.max(i60 + 7, 0);
                                        int iMin2 = Math.min(i60 + 11, bArr7.length);
                                        while (true) {
                                            if (iMax4 < iMin2) {
                                                int i63 = iMin2;
                                                if (bArr7[iMax4] == 1) {
                                                    break;
                                                }
                                                iMax4++;
                                                iMin2 = i63;
                                            }
                                        }
                                    } else {
                                        iMax3++;
                                        iMin = i62;
                                        b12 = 1;
                                    }
                                }
                                i59++;
                                break;
                            }
                        }
                    } else {
                        version = version4;
                        i12 = width2;
                    }
                    int i64 = i57 + 6;
                    if (i64 < height2) {
                        byte b13 = 1;
                        if (array2[i57][i60] == 1 && array2[i57 + 1][i60] == 0 && array2[i57 + 2][i60] == 1 && array2[i57 + 3][i60] == 1 && array2[i57 + 4][i60] == 1 && array2[i57 + 5][i60] == 0 && array2[i64][i60] == 1) {
                            int iMax5 = Math.max(i57 - 4, 0);
                            int iMin3 = Math.min(i57, array2.length);
                            while (true) {
                                if (iMax5 < iMin3) {
                                    if (array2[iMax5][i60] == b13) {
                                        int iMax6 = Math.max(i57 + 7, 0);
                                        int iMin4 = Math.min(i57 + 11, array2.length);
                                        while (true) {
                                            if (iMax6 < iMin4) {
                                                if (array2[iMax6][i60] == 1) {
                                                    break;
                                                }
                                                iMax6++;
                                            }
                                        }
                                    } else {
                                        iMax5++;
                                        b13 = 1;
                                    }
                                }
                                i59++;
                                break;
                            }
                        }
                    }
                    i60++;
                    width2 = i12;
                    version4 = version;
                }
                i57++;
                i58 = i59;
            }
            Version version5 = version4;
            int i65 = (i58 * 40) + i56;
            byte[][] array3 = byteMatrix.getArray();
            int width3 = byteMatrix.getWidth();
            int height3 = byteMatrix.getHeight();
            int i66 = 0;
            int i67 = 0;
            while (i66 < height3) {
                byte[] bArr8 = array3[i66];
                int i68 = i67;
                for (int i69 = 0; i69 < width3; i69++) {
                    if (bArr8[i69] == 1) {
                        i68++;
                    }
                }
                i66++;
                i67 = i68;
            }
            int width4 = byteMatrix.getWidth() * byteMatrix.getHeight();
            int iAbs = (((Math.abs((i67 << 1) - width4) * 10) / width4) * 10) + i65;
            if (iAbs < i46) {
                i46 = iAbs;
                i48 = i47;
            }
            i47++;
            bitArray4 = bitArray6;
            version4 = version5;
        }
        qRCode.setMaskPattern(i48);
        b.a(bitArray4, errorCorrectionLevel, version4, i48, byteMatrix);
        qRCode.setMatrix(byteMatrix);
        return qRCode;
    }
}
