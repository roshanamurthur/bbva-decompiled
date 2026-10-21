package com.google.zxing.datamatrix.decoder;

import ah.b;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.veridas.detect.ImageAnalysisKt;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public final class Decoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReedSolomonDecoder f49863a = new ReedSolomonDecoder(GenericGF.DATA_MATRIX_FIELD_256);

    public DecoderResult decode(boolean[][] zArr) throws ChecksumException, FormatException {
        return decode(BitMatrix.parse(zArr));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:504:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:? A[LOOP:15: B:207:0x035a->B:507:?, LOOP_END, SYNTHETIC] */
    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
        BitMatrix bitMatrix2;
        int i10;
        int bits;
        int bits2;
        int bits3;
        ah.a aVar = new ah.a(bitMatrix);
        Version version = aVar.f247c;
        int totalCodewords = version.getTotalCodewords();
        byte[] bArr = new byte[totalCodewords];
        BitMatrix bitMatrix3 = aVar.f245a;
        int height = bitMatrix3.getHeight();
        int width = bitMatrix3.getWidth();
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i14 = 4;
        while (true) {
            if (i14 == height && i12 == 0 && !z10) {
                int i15 = i13 + 1;
                int i16 = height - 1;
                int i17 = (aVar.a(i16, i11, height, width) ? 1 : 0) << 1;
                if (aVar.a(i16, 1, height, width)) {
                    i17 |= 1;
                }
                int i18 = i17 << 1;
                if (aVar.a(i16, 2, height, width)) {
                    i18 |= 1;
                }
                int i19 = i18 << 1;
                if (aVar.a(0, width - 2, height, width)) {
                    i19 |= 1;
                }
                int i20 = i19 << 1;
                int i21 = width - 1;
                if (aVar.a(0, i21, height, width)) {
                    i20 |= 1;
                }
                int i22 = i20 << 1;
                if (aVar.a(1, i21, height, width)) {
                    i22 |= 1;
                }
                int i23 = i22 << 1;
                if (aVar.a(2, i21, height, width)) {
                    i23 |= 1;
                }
                int i24 = i23 << 1;
                if (aVar.a(3, i21, height, width)) {
                    i24 |= 1;
                }
                bArr[i13] = (byte) i24;
                i14 -= 2;
                i12 += 2;
                i13 = i15;
                z10 = true;
            } else {
                int i25 = height - 2;
                if (i14 == i25 && i12 == 0 && (width & 3) != 0 && !z11) {
                    int i26 = i13 + 1;
                    int i27 = (aVar.a(height + (-3), 0, height, width) ? 1 : 0) << 1;
                    if (aVar.a(i25, 0, height, width)) {
                        i27 |= 1;
                    }
                    int i28 = i27 << 1;
                    if (aVar.a(height - 1, 0, height, width)) {
                        i28 |= 1;
                    }
                    int i29 = i28 << 1;
                    if (aVar.a(0, width - 4, height, width)) {
                        i29 |= 1;
                    }
                    int i30 = i29 << 1;
                    if (aVar.a(0, width - 3, height, width)) {
                        i30 |= 1;
                    }
                    int i31 = i30 << 1;
                    if (aVar.a(0, width - 2, height, width)) {
                        i31 |= 1;
                    }
                    int i32 = i31 << 1;
                    int i33 = width - 1;
                    if (aVar.a(0, i33, height, width)) {
                        i32 |= 1;
                    }
                    int i34 = i32 << 1;
                    if (aVar.a(1, i33, height, width)) {
                        i34 |= 1;
                    }
                    bArr[i13] = (byte) i34;
                    i14 -= 2;
                    i12 += 2;
                    i13 = i26;
                    z11 = true;
                } else if (i14 == height + 4 && i12 == 2 && (width & 7) == 0 && !z12) {
                    int i35 = i13 + 1;
                    int i36 = height - 1;
                    int i37 = (aVar.a(i36, 0, height, width) ? 1 : 0) << 1;
                    int i38 = width - 1;
                    if (aVar.a(i36, i38, height, width)) {
                        i37 |= 1;
                    }
                    int i39 = i37 << 1;
                    int i40 = width - 3;
                    if (aVar.a(0, i40, height, width)) {
                        i39 |= 1;
                    }
                    int i41 = i39 << 1;
                    int i42 = width - 2;
                    boolean z14 = z10;
                    if (aVar.a(0, i42, height, width)) {
                        i41 |= 1;
                    }
                    boolean z15 = z11;
                    int i43 = i41 << 1;
                    if (aVar.a(0, i38, height, width)) {
                        i43 |= 1;
                    }
                    int i44 = i43 << 1;
                    if (aVar.a(1, i40, height, width)) {
                        i44 |= 1;
                    }
                    int i45 = i44 << 1;
                    if (aVar.a(1, i42, height, width)) {
                        i45 |= 1;
                    }
                    int i46 = i45 << 1;
                    if (aVar.a(1, i38, height, width)) {
                        i46 |= 1;
                    }
                    bArr[i13] = (byte) i46;
                    i14 -= 2;
                    i12 += 2;
                    i13 = i35;
                    z10 = z14;
                    z11 = z15;
                    z12 = true;
                } else {
                    boolean z16 = z10;
                    boolean z17 = z11;
                    if (i14 == i25 && i12 == 0 && (width & 7) == 4 && !z13) {
                        int i47 = i13 + 1;
                        int i48 = (aVar.a(height + (-3), 0, height, width) ? 1 : 0) << 1;
                        if (aVar.a(i25, 0, height, width)) {
                            i48 |= 1;
                        }
                        int i49 = i48 << 1;
                        if (aVar.a(height - 1, 0, height, width)) {
                            i49 |= 1;
                        }
                        int i50 = i49 << 1;
                        if (aVar.a(0, width - 2, height, width)) {
                            i50 |= 1;
                        }
                        int i51 = i50 << 1;
                        int i52 = width - 1;
                        if (aVar.a(0, i52, height, width)) {
                            i51 |= 1;
                        }
                        int i53 = i51 << 1;
                        if (aVar.a(1, i52, height, width)) {
                            i53 |= 1;
                        }
                        int i54 = i53 << 1;
                        if (aVar.a(2, i52, height, width)) {
                            i54 |= 1;
                        }
                        int i55 = i54 << 1;
                        if (aVar.a(3, i52, height, width)) {
                            i55 |= 1;
                        }
                        bArr[i13] = (byte) i55;
                        i14 -= 2;
                        i12 += 2;
                        i13 = i47;
                        z10 = z16;
                        z11 = z17;
                        z13 = true;
                    } else {
                        while (true) {
                            bitMatrix2 = aVar.f246b;
                            if (i14 < height && i12 >= 0 && !bitMatrix2.get(i12, i14)) {
                                bArr[i13] = (byte) aVar.b(i14, i12, height, width);
                                i13++;
                            }
                            int i56 = i14 - 2;
                            int i57 = i12 + 2;
                            if (i56 < 0 || i57 >= width) {
                                break;
                            }
                            i14 = i56;
                            i12 = i57;
                        }
                        int i58 = i14 - 1;
                        int i59 = i12 + 5;
                        while (true) {
                            if (i58 >= 0 && i59 < width && !bitMatrix2.get(i59, i58)) {
                                bArr[i13] = (byte) aVar.b(i58, i59, height, width);
                                i13++;
                            }
                            int i60 = i58 + 2;
                            int i61 = i59 - 2;
                            if (i60 >= height || i61 < 0) {
                                break;
                            }
                            i58 = i60;
                            i59 = i61;
                        }
                        i14 = i58 + 5;
                        i12 = i59 - 1;
                        z10 = z16;
                        z11 = z17;
                    }
                }
            }
            if (i14 >= height && i12 >= width) {
                break;
            }
            i11 = 0;
        }
        if (i13 != version.getTotalCodewords()) {
            throw FormatException.getFormatInstance();
        }
        Version.b bVar = version.f49870f;
        Version.a[] aVarArr = bVar.f49875b;
        int i62 = 0;
        for (Version.a aVar2 : aVarArr) {
            i62 += aVar2.f49872a;
        }
        a[] aVarArr2 = new a[i62];
        int length = aVarArr.length;
        int i63 = 0;
        int i64 = 0;
        while (true) {
            i10 = bVar.f49874a;
            if (i63 >= length) {
                break;
            }
            Version.a aVar3 = aVarArr[i63];
            int i65 = 0;
            while (i65 < aVar3.f49872a) {
                int i66 = aVar3.f49873b;
                aVarArr2[i64] = new a(i66, new byte[i10 + i66]);
                i65++;
                i64++;
                bVar = bVar;
            }
            i63++;
        }
        int length2 = aVarArr2[0].f49877b.length - i10;
        int i67 = length2 - 1;
        int i68 = 0;
        for (int i69 = 0; i69 < i67; i69++) {
            int i70 = 0;
            while (i70 < i64) {
                aVarArr2[i70].f49877b[i69] = bArr[i68];
                i70++;
                i68++;
            }
        }
        boolean z18 = version.getVersionNumber() == 24;
        int i71 = 8;
        int i72 = z18 ? 8 : i64;
        int i73 = 0;
        while (i73 < i72) {
            aVarArr2[i73].f49877b[i67] = bArr[i68];
            i73++;
            i68++;
        }
        int length3 = aVarArr2[0].f49877b.length;
        while (length2 < length3) {
            int i74 = 0;
            while (i74 < i64) {
                int i75 = z18 ? (i74 + 8) % i64 : i74;
                aVarArr2[i75].f49877b[(!z18 || i75 <= 7) ? length2 : length2 - 1] = bArr[i68];
                i74++;
                i68++;
            }
            length2++;
        }
        if (i68 != totalCodewords) {
            throw new IllegalArgumentException();
        }
        int i76 = 0;
        for (int i77 = 0; i77 < i62; i77++) {
            i76 += aVarArr2[i77].f49876a;
        }
        byte[] bArr2 = new byte[i76];
        for (int i78 = 0; i78 < i62; i78++) {
            a aVar4 = aVarArr2[i78];
            byte[] bArr3 = aVar4.f49877b;
            int i79 = aVar4.f49876a;
            int length4 = bArr3.length;
            int[] iArr = new int[length4];
            for (int i80 = 0; i80 < length4; i80++) {
                iArr[i80] = bArr3[i80] & 255;
            }
            try {
                this.f49863a.decode(iArr, bArr3.length - i79);
                for (int i81 = 0; i81 < i79; i81++) {
                    bArr3[i81] = (byte) iArr[i81];
                }
                for (int i82 = 0; i82 < i79; i82++) {
                    bArr2[(i82 * i62) + i78] = bArr3[i82];
                }
            } catch (ReedSolomonException unused) {
                throw ChecksumException.getChecksumInstance();
            }
        }
        BitSource bitSource = new BitSource(bArr2);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b.EnumC0000b enumC0000b = b.EnumC0000b.ASCII_ENCODE;
        while (true) {
            if (enumC0000b == b.EnumC0000b.ASCII_ENCODE) {
                boolean z19 = false;
                while (true) {
                    int bits4 = bitSource.readBits(i71);
                    if (bits4 == 0) {
                        throw FormatException.getFormatInstance();
                    }
                    if (bits4 <= 128) {
                        if (z19) {
                            bits4 += 128;
                        }
                        sb2.append((char) (bits4 - 1));
                        enumC0000b = b.EnumC0000b.ASCII_ENCODE;
                    } else if (bits4 == 129) {
                        enumC0000b = b.EnumC0000b.PAD_ENCODE;
                    } else {
                        if (bits4 > 229) {
                            switch (bits4) {
                                case ImageAnalysisKt.OVER_EXPOSED_THRESHOLD /* 230 */:
                                    enumC0000b = b.EnumC0000b.C40_ENCODE;
                                    break;
                                case 231:
                                    enumC0000b = b.EnumC0000b.BASE256_ENCODE;
                                    break;
                                case 232:
                                    sb2.append((char) 29);
                                    if (bitSource.available() <= 0) {
                                        enumC0000b = b.EnumC0000b.ASCII_ENCODE;
                                    }
                                    break;
                                case 233:
                                case 234:
                                case 241:
                                    break;
                                case 235:
                                    z19 = true;
                                    if (bitSource.available() <= 0) {
                                        enumC0000b = b.EnumC0000b.ASCII_ENCODE;
                                    }
                                    break;
                                case 236:
                                    sb2.append("[)>\u001e05\u001d");
                                    sb3.insert(0, "\u001e\u0004");
                                    if (bitSource.available() <= 0) {
                                        enumC0000b = b.EnumC0000b.ASCII_ENCODE;
                                    }
                                    break;
                                case 237:
                                    sb2.append("[)>\u001e06\u001d");
                                    sb3.insert(0, "\u001e\u0004");
                                    if (bitSource.available() <= 0) {
                                        enumC0000b = b.EnumC0000b.ASCII_ENCODE;
                                    }
                                    break;
                                case 238:
                                    enumC0000b = b.EnumC0000b.ANSIX12_ENCODE;
                                    break;
                                case 239:
                                    enumC0000b = b.EnumC0000b.TEXT_ENCODE;
                                    break;
                                case 240:
                                    enumC0000b = b.EnumC0000b.EDIFACT_ENCODE;
                                    break;
                                default:
                                    if (bits4 != 254 || bitSource.available() != 0) {
                                        throw FormatException.getFormatInstance();
                                    }
                                    break;
                            }
                        } else {
                            int i83 = bits4 - 130;
                            if (i83 < 10) {
                                sb2.append('0');
                            }
                            sb2.append(i83);
                        }
                        if (bitSource.available() <= 0) {
                            enumC0000b = b.EnumC0000b.ASCII_ENCODE;
                        }
                    }
                }
            } else {
                int i84 = 0;
                int i85 = b.a.f253a[enumC0000b.ordinal()];
                if (i85 == 1) {
                    int i86 = 3;
                    int[] iArr2 = new int[3];
                    boolean z20 = false;
                    int i87 = 0;
                    while (true) {
                        if (bitSource.available() != 8 && (bits = bitSource.readBits(8)) != 254) {
                            b.a(bits, bitSource.readBits(8), iArr2);
                            int i88 = 0;
                            while (i88 < i86) {
                                int i89 = iArr2[i88];
                                if (i87 != 0) {
                                    if (i87 != 1) {
                                        if (i87 != 2) {
                                            if (i87 != i86) {
                                                throw FormatException.getFormatInstance();
                                            }
                                            if (z20) {
                                                sb2.append((char) (i89 + 224));
                                                z20 = false;
                                            } else {
                                                sb2.append((char) (i89 + 96));
                                            }
                                        } else if (i89 < 27) {
                                            char c10 = b.f249b[i89];
                                            if (z20) {
                                                sb2.append((char) (c10 + 128));
                                                z20 = false;
                                            } else {
                                                sb2.append(c10);
                                            }
                                        } else if (i89 == 27) {
                                            sb2.append((char) 29);
                                        } else {
                                            if (i89 != 30) {
                                                throw FormatException.getFormatInstance();
                                            }
                                            z20 = true;
                                        }
                                    } else if (z20) {
                                        sb2.append((char) (i89 + 128));
                                        z20 = false;
                                    } else {
                                        sb2.append((char) i89);
                                    }
                                    i87 = 0;
                                } else if (i89 < i86) {
                                    i87 = i89 + 1;
                                } else {
                                    if (i89 >= 40) {
                                        throw FormatException.getFormatInstance();
                                    }
                                    char c11 = b.f248a[i89];
                                    if (z20) {
                                        sb2.append((char) (c11 + 128));
                                        z20 = false;
                                    } else {
                                        sb2.append(c11);
                                    }
                                }
                                i88++;
                                i86 = 3;
                            }
                            if (bitSource.available() > 0) {
                                i86 = 3;
                            }
                        }
                    }
                    enumC0000b = b.EnumC0000b.ASCII_ENCODE;
                } else if (i85 == 2) {
                    int i90 = 3;
                    int[] iArr3 = new int[3];
                    boolean z21 = false;
                    int i91 = 0;
                    for (int i92 = 254; bitSource.available() != i71 && (bits2 = bitSource.readBits(i71)) != i92; i92 = 254) {
                        b.a(bits2, bitSource.readBits(i71), iArr3);
                        boolean z22 = z21;
                        int i93 = i91;
                        int i94 = 0;
                        while (i94 < i90) {
                            int i95 = iArr3[i94];
                            if (i93 != 0) {
                                if (i93 != 1) {
                                    if (i93 != 2) {
                                        if (i93 != i90) {
                                            throw FormatException.getFormatInstance();
                                        }
                                        if (i95 >= 32) {
                                            throw FormatException.getFormatInstance();
                                        }
                                        char c12 = b.f252e[i95];
                                        if (z22) {
                                            sb2.append((char) (c12 + 128));
                                            z22 = false;
                                        } else {
                                            sb2.append(c12);
                                        }
                                    } else if (i95 < 27) {
                                        char c13 = b.f251d[i95];
                                        if (z22) {
                                            sb2.append((char) (c13 + 128));
                                            z22 = false;
                                        } else {
                                            sb2.append(c13);
                                        }
                                    } else if (i95 == 27) {
                                        sb2.append((char) 29);
                                    } else {
                                        if (i95 != 30) {
                                            throw FormatException.getFormatInstance();
                                        }
                                        z22 = true;
                                    }
                                } else if (z22) {
                                    sb2.append((char) (i95 + 128));
                                    z22 = false;
                                } else {
                                    sb2.append((char) i95);
                                }
                                i93 = 0;
                            } else if (i95 < i90) {
                                i93 = i95 + 1;
                            } else {
                                if (i95 >= 40) {
                                    throw FormatException.getFormatInstance();
                                }
                                char c14 = b.f250c[i95];
                                if (z22) {
                                    sb2.append((char) (c14 + 128));
                                    z22 = false;
                                } else {
                                    sb2.append(c14);
                                }
                            }
                            i94++;
                            i90 = 3;
                        }
                        if (bitSource.available() > 0) {
                            i91 = i93;
                            z21 = z22;
                            i90 = 3;
                            i71 = 8;
                        }
                    }
                } else if (i85 == 3) {
                    int i96 = 3;
                    int[] iArr4 = new int[3];
                    while (bitSource.available() != i71 && (bits3 = bitSource.readBits(i71)) != 254) {
                        b.a(bits3, bitSource.readBits(i71), iArr4);
                        int i97 = i84;
                        while (i97 < i96) {
                            int i98 = iArr4[i97];
                            if (i98 == 0) {
                                sb2.append('\r');
                            } else if (i98 == 1) {
                                sb2.append('*');
                            } else if (i98 == 2) {
                                sb2.append(Typography.greater);
                            } else if (i98 == i96) {
                                sb2.append(' ');
                            } else if (i98 < 14) {
                                sb2.append((char) (i98 + 44));
                            } else {
                                if (i98 >= 40) {
                                    throw FormatException.getFormatInstance();
                                }
                                sb2.append((char) (i98 + 51));
                            }
                            i97++;
                            i96 = 3;
                        }
                        if (bitSource.available() > 0) {
                            i96 = 3;
                            i84 = 0;
                        }
                    }
                } else if (i85 == 4) {
                    while (bitSource.available() > 16) {
                        int i99 = 0;
                        while (true) {
                            if (i99 < 4) {
                                int bits5 = bitSource.readBits(6);
                                if (bits5 == 31) {
                                    int bitOffset = 8 - bitSource.getBitOffset();
                                    if (bitOffset != i71) {
                                        bitSource.readBits(bitOffset);
                                    }
                                } else {
                                    if ((bits5 & 32) == 0) {
                                        bits5 |= 64;
                                    }
                                    sb2.append((char) bits5);
                                    i99++;
                                }
                            } else if (bitSource.available() <= 0) {
                            }
                        }
                    }
                } else {
                    if (i85 != 5) {
                        throw FormatException.getFormatInstance();
                    }
                    int byteOffset = bitSource.getByteOffset();
                    int i100 = byteOffset + 2;
                    int iB = b.b(bitSource.readBits(i71), byteOffset + 1);
                    if (iB == 0) {
                        iB = bitSource.available() / 8;
                    } else if (iB >= 250) {
                        iB = ((iB - 249) * 250) + b.b(bitSource.readBits(i71), i100);
                        i100 = byteOffset + 3;
                    }
                    if (iB < 0) {
                        throw FormatException.getFormatInstance();
                    }
                    byte[] bArr4 = new byte[iB];
                    int i101 = 0;
                    while (i101 < iB) {
                        if (bitSource.available() < i71) {
                            throw FormatException.getFormatInstance();
                        }
                        bArr4[i101] = (byte) b.b(bitSource.readBits(i71), i100);
                        i101++;
                        i100++;
                    }
                    arrayList.add(bArr4);
                    try {
                        sb2.append(new String(bArr4, "ISO8859_1"));
                    } catch (UnsupportedEncodingException e5) {
                        throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e5)));
                    }
                }
                enumC0000b = b.EnumC0000b.ASCII_ENCODE;
            }
            if (enumC0000b == b.EnumC0000b.PAD_ENCODE || bitSource.available() <= 0) {
                if (sb3.length() > 0) {
                    sb2.append((CharSequence) sb3);
                }
                String string = sb2.toString();
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new DecoderResult(bArr2, string, arrayList, null);
            }
            i71 = 8;
        }
    }
}
