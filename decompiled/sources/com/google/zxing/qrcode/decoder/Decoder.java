package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.StringUtils;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import lh.b;
import lh.c;
import lh.d;

/* JADX INFO: loaded from: classes10.dex */
public final class Decoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReedSolomonDecoder f50028a = new ReedSolomonDecoder(GenericGF.QR_CODE_FIELD_256);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:177:0x0362  */
    /* JADX WARN: Code duplicated, block: B:178:0x0364  */
    /* JADX WARN: Code duplicated, block: B:180:0x0367  */
    /* JADX WARN: Code duplicated, block: B:181:0x0369  */
    /* JADX WARN: Code duplicated, block: B:184:0x0376 A[LOOP:21: B:193:0x022c->B:184:0x0376, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x0356 A[SYNTHETIC] */
    public final DecoderResult a(lh.a aVar, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        int i10;
        int i11;
        int bits;
        ArrayList arrayList;
        String string;
        int i12;
        Version versionC = aVar.c();
        ErrorCorrectionLevel errorCorrectionLevel = aVar.b().f83219a;
        d dVarB = aVar.b();
        Version versionC2 = aVar.c();
        b bVar = b.values()[dVarB.f83220b];
        BitMatrix bitMatrix = aVar.f83212a;
        int height = bitMatrix.getHeight();
        bVar.getClass();
        int i13 = 0;
        for (int i14 = 0; i14 < height; i14++) {
            for (int i15 = 0; i15 < height; i15++) {
                if (bVar.a(i14, i15)) {
                    bitMatrix.flip(i15, i14);
                }
            }
        }
        int dimensionForVersion = versionC2.getDimensionForVersion();
        BitMatrix bitMatrix2 = new BitMatrix(dimensionForVersion);
        bitMatrix2.setRegion(0, 0, 9, 9);
        int i16 = dimensionForVersion - 8;
        bitMatrix2.setRegion(i16, 0, 8, 9);
        bitMatrix2.setRegion(0, i16, 9, 8);
        int[] iArr = versionC2.f50033b;
        int length = iArr.length;
        int i17 = 0;
        while (true) {
            int i18 = 2;
            if (i17 >= length) {
                break;
            }
            int i19 = iArr[i17] - 2;
            int i20 = 0;
            while (i20 < length) {
                if ((i17 != 0 || (i20 != 0 && i20 != length - 1)) && (i17 != length - 1 || i20 != 0)) {
                    bitMatrix2.setRegion(iArr[i20] - i18, i19, 5, 5);
                }
                i20++;
                i18 = 2;
            }
            i17++;
        }
        int i21 = dimensionForVersion - 17;
        int i22 = 6;
        bitMatrix2.setRegion(6, 9, 1, i21);
        bitMatrix2.setRegion(9, 6, i21, 1);
        if (versionC2.f50032a > 6) {
            int i23 = dimensionForVersion - 11;
            bitMatrix2.setRegion(i23, 0, 3, 6);
            bitMatrix2.setRegion(0, i23, 6, 3);
        }
        int totalCodewords = versionC2.getTotalCodewords();
        byte[] bArr = new byte[totalCodewords];
        int i24 = height - 1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z10 = true;
        int i28 = i24;
        while (i28 > 0) {
            if (i28 == i22) {
                i28--;
            }
            int i29 = i13;
            while (i29 < height) {
                int i30 = z10 ? i24 - i29 : i29;
                while (i13 < 2) {
                    int i31 = i28 - i13;
                    if (bitMatrix2.get(i31, i30)) {
                        bitMatrix = bitMatrix;
                        i12 = height;
                    } else {
                        i12 = height;
                        int i32 = i26 + 1;
                        int i33 = i27 << 1;
                        int i34 = bitMatrix.get(i31, i30) ? i33 | 1 : i33;
                        if (i32 == 8) {
                            bArr[i25] = (byte) i34;
                            i25++;
                            i26 = 0;
                            i27 = 0;
                        } else {
                            i26 = i32;
                            i27 = i34;
                        }
                    }
                    i13++;
                    height = i12;
                    bitMatrix = bitMatrix;
                }
                i29++;
                i13 = 0;
            }
            z10 = !z10;
            i28 -= 2;
            i13 = 0;
            i22 = 6;
        }
        if (i25 != versionC2.getTotalCodewords()) {
            throw FormatException.getFormatInstance();
        }
        if (totalCodewords != versionC.getTotalCodewords()) {
            throw new IllegalArgumentException();
        }
        Version.ECBlocks eCBlocksForLevel = versionC.getECBlocksForLevel(errorCorrectionLevel);
        Version.ECB[] eCBlocks = eCBlocksForLevel.getECBlocks();
        int count = 0;
        for (Version.ECB ecb : eCBlocks) {
            count += ecb.getCount();
        }
        a[] aVarArr = new a[count];
        int i35 = 0;
        for (Version.ECB ecb2 : eCBlocks) {
            int i36 = 0;
            while (i36 < ecb2.getCount()) {
                int dataCodewords = ecb2.getDataCodewords();
                aVarArr[i35] = new a(dataCodewords, new byte[eCBlocksForLevel.getECCodewordsPerBlock() + dataCodewords]);
                i36++;
                i35++;
            }
        }
        int length2 = aVarArr[0].f50041b.length;
        int i37 = count - 1;
        while (i37 >= 0 && aVarArr[i37].f50041b.length != length2) {
            i37--;
        }
        int i38 = i37 + 1;
        int eCCodewordsPerBlock = length2 - eCBlocksForLevel.getECCodewordsPerBlock();
        int i39 = 0;
        for (int i40 = 0; i40 < eCCodewordsPerBlock; i40++) {
            int i41 = 0;
            while (i41 < i35) {
                aVarArr[i41].f50041b[i40] = bArr[i39];
                i41++;
                i39++;
            }
        }
        int i42 = i38;
        while (i42 < i35) {
            aVarArr[i42].f50041b[eCCodewordsPerBlock] = bArr[i39];
            i42++;
            i39++;
        }
        int length3 = aVarArr[0].f50041b.length;
        while (eCCodewordsPerBlock < length3) {
            int i43 = 0;
            while (i43 < i35) {
                aVarArr[i43].f50041b[i43 < i38 ? eCCodewordsPerBlock : eCCodewordsPerBlock + 1] = bArr[i39];
                i43++;
                i39++;
            }
            eCCodewordsPerBlock++;
        }
        int i44 = 0;
        for (int i45 = 0; i45 < count; i45++) {
            i44 += aVarArr[i45].f50040a;
        }
        byte[] bArr2 = new byte[i44];
        int i46 = 0;
        for (int i47 = 0; i47 < count; i47++) {
            a aVar2 = aVarArr[i47];
            byte[] bArr3 = aVar2.f50041b;
            int i48 = aVar2.f50040a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i49 = 0; i49 < length4; i49++) {
                iArr2[i49] = bArr3[i49] & 255;
            }
            try {
                this.f50028a.decode(iArr2, bArr3.length - i48);
                for (int i50 = 0; i50 < i48; i50++) {
                    bArr3[i50] = (byte) iArr2[i50];
                }
                int i51 = 0;
                while (i51 < i48) {
                    bArr2[i46] = bArr3[i51];
                    i51++;
                    i46++;
                }
            } catch (ReedSolomonException unused) {
                throw ChecksumException.getChecksumInstance();
            }
        }
        char[] cArr = c.f83216a;
        BitSource bitSource = new BitSource(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList2 = new ArrayList(1);
        int i52 = -1;
        int bits2 = -1;
        boolean z11 = false;
        CharacterSetECI characterSetECIByValue = null;
        while (true) {
            try {
                Mode modeForBits = bitSource.available() < 4 ? Mode.TERMINATOR : Mode.forBits(bitSource.readBits(4));
                int[] iArr3 = c.a.f83217a;
                switch (iArr3[modeForBits.ordinal()]) {
                    case 5:
                        i10 = i52;
                        i11 = bits2;
                        if (modeForBits == Mode.TERMINATOR) {
                            String string2 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string2, arrayList, string, i10, i11);
                        }
                        bits2 = i11;
                        i52 = i10;
                        break;
                        break;
                    case 6:
                    case 7:
                        i10 = i52;
                        i11 = bits2;
                        z11 = true;
                        if (modeForBits == Mode.TERMINATOR) {
                            String string3 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string3, arrayList, string, i10, i11);
                        }
                        bits2 = i11;
                        i52 = i10;
                        break;
                        break;
                    case 8:
                        if (bitSource.available() < 16) {
                            throw FormatException.getFormatInstance();
                        }
                        int bits3 = bitSource.readBits(8);
                        bits2 = bitSource.readBits(8);
                        i10 = bits3;
                        i11 = bits2;
                        if (modeForBits == Mode.TERMINATOR) {
                            String string4 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string4, arrayList, string, i10, i11);
                        }
                        bits2 = i11;
                        i52 = i10;
                        break;
                        break;
                    case 9:
                        i10 = i52;
                        int bits4 = bitSource.readBits(8);
                        if ((bits4 & 128) == 0) {
                            bits = bits4 & 127;
                        } else if ((bits4 & 192) == 128) {
                            bits = bitSource.readBits(8) | ((bits4 & 63) << 8);
                        } else {
                            if ((bits4 & 224) != 192) {
                                throw FormatException.getFormatInstance();
                            }
                            bits = ((bits4 & 31) << 16) | bitSource.readBits(16);
                        }
                        characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(bits);
                        if (characterSetECIByValue == null) {
                            throw FormatException.getFormatInstance();
                        }
                        i11 = bits2;
                        if (modeForBits == Mode.TERMINATOR) {
                            String string5 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string5, arrayList, string, i10, i11);
                        }
                        bits2 = i11;
                        i52 = i10;
                        break;
                        break;
                    case 10:
                        i10 = i52;
                        int bits5 = bitSource.readBits(4);
                        int bits6 = bitSource.readBits(modeForBits.getCharacterCountBits(versionC));
                        if (bits5 == 1) {
                            c.b(bitSource, sb2, bits6);
                        }
                        i11 = bits2;
                        if (modeForBits == Mode.TERMINATOR) {
                            String string6 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string6, arrayList, string, i10, i11);
                        }
                        bits2 = i11;
                        i52 = i10;
                        break;
                        break;
                    default:
                        int bits7 = bitSource.readBits(modeForBits.getCharacterCountBits(versionC));
                        int i53 = iArr3[modeForBits.ordinal()];
                        if (i53 == 1) {
                            i10 = i52;
                            c.d(bitSource, sb2, bits7);
                        } else if (i53 == 2) {
                            i10 = i52;
                            c.a(bitSource, sb2, bits7, z11);
                        } else if (i53 != 3) {
                            if (i53 != 4) {
                                throw FormatException.getFormatInstance();
                            }
                            c.c(bitSource, sb2, bits7);
                            i10 = i52;
                            i11 = bits2;
                            if (modeForBits == Mode.TERMINATOR) {
                                String string7 = sb2.toString();
                                if (arrayList2.isEmpty()) {
                                    arrayList = null;
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (errorCorrectionLevel == null) {
                                    string = null;
                                } else {
                                    string = errorCorrectionLevel.toString();
                                }
                                return new DecoderResult(bArr2, string7, arrayList, string, i10, i11);
                            }
                            bits2 = i11;
                            i52 = i10;
                            break;
                        } else {
                            if ((bits7 << 3) > bitSource.available()) {
                                throw FormatException.getFormatInstance();
                            }
                            byte[] bArr4 = new byte[bits7];
                            int i54 = 0;
                            while (i54 < bits7) {
                                bArr4[i54] = (byte) bitSource.readBits(8);
                                i54++;
                                i52 = i52;
                            }
                            i10 = i52;
                            try {
                                sb2.append(new String(bArr4, characterSetECIByValue == null ? StringUtils.guessEncoding(bArr4, map) : characterSetECIByValue.name()));
                                arrayList2.add(bArr4);
                            } catch (UnsupportedEncodingException unused2) {
                                throw FormatException.getFormatInstance();
                            }
                        }
                        i11 = bits2;
                        if (modeForBits == Mode.TERMINATOR) {
                            String string8 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string8, arrayList, string, i10, i11);
                        }
                        bits2 = i11;
                        i52 = i10;
                        break;
                        break;
                }
            } catch (IllegalArgumentException unused3) {
                throw FormatException.getFormatInstance();
            }
        }
    }

    public DecoderResult decode(boolean[][] zArr) throws ChecksumException, FormatException {
        return decode(zArr, (Map<DecodeHintType, ?>) null);
    }

    public DecoderResult decode(boolean[][] zArr, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        return decode(BitMatrix.parse(zArr), map);
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
        return decode(bitMatrix, (Map<DecodeHintType, ?>) null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a A[Catch: ChecksumException | FormatException -> 0x0055, TryCatch #2 {ChecksumException | FormatException -> 0x0055, blocks: (B:9:0x0011, B:10:0x0022, B:12:0x002a, B:13:0x002d, B:15:0x0033, B:17:0x003d, B:18:0x0043, B:20:0x0048), top: B:25:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[Catch: ChecksumException | FormatException -> 0x0055, TryCatch #2 {ChecksumException | FormatException -> 0x0055, blocks: (B:9:0x0011, B:10:0x0022, B:12:0x002a, B:13:0x002d, B:15:0x0033, B:17:0x003d, B:18:0x0043, B:20:0x0048), top: B:25:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x003d A[Catch: ChecksumException | FormatException -> 0x0055, TryCatch #2 {ChecksumException | FormatException -> 0x0055, blocks: (B:9:0x0011, B:10:0x0022, B:12:0x002a, B:13:0x002d, B:15:0x0033, B:17:0x003d, B:18:0x0043, B:20:0x0048), top: B:25:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0043 A[SYNTHETIC] */
    public DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        ChecksumException checksumException;
        int i10;
        BitMatrix bitMatrix2;
        int i11;
        lh.a aVar = new lh.a(bitMatrix);
        try {
            return a(aVar, map);
        } catch (ChecksumException e5) {
            checksumException = e5;
            e = null;
            try {
                aVar.d();
                aVar.f83213b = null;
                aVar.f83214c = null;
                aVar.f83215d = true;
                aVar.c();
                aVar.b();
                i10 = 0;
                while (true) {
                    bitMatrix2 = aVar.f83212a;
                    if (i10 < bitMatrix2.getWidth()) {
                        int i12 = i10 + 1;
                        for (i11 = i12; i11 < bitMatrix2.getHeight(); i11++) {
                            if (bitMatrix2.get(i10, i11) != bitMatrix2.get(i11, i10)) {
                                bitMatrix2.flip(i11, i10);
                                bitMatrix2.flip(i10, i11);
                            }
                        }
                        i10 = i12;
                    } else {
                        DecoderResult decoderResultA = a(aVar, map);
                        decoderResultA.setOther(new QRCodeDecoderMetaData());
                        return decoderResultA;
                    }
                }
            } catch (ChecksumException | FormatException unused) {
                if (e != null) {
                    throw e;
                }
                throw checksumException;
            }
        } catch (FormatException e7) {
            e = e7;
            checksumException = null;
            aVar.d();
            aVar.f83213b = null;
            aVar.f83214c = null;
            aVar.f83215d = true;
            aVar.c();
            aVar.b();
            i10 = 0;
            while (true) {
                bitMatrix2 = aVar.f83212a;
                if (i10 < bitMatrix2.getWidth()) {
                    int i13 = i10 + 1;
                    while (i11 < bitMatrix2.getHeight()) {
                        if (bitMatrix2.get(i10, i11) != bitMatrix2.get(i11, i10)) {
                            bitMatrix2.flip(i11, i10);
                            bitMatrix2.flip(i10, i11);
                        }
                    }
                    i10 = i13;
                } else {
                    DecoderResult decoderResultA2 = a(aVar, map);
                    decoderResultA2.setOther(new QRCodeDecoderMetaData());
                    return decoderResultA2;
                }
            }
        }
    }
}
