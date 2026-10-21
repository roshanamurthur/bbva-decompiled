package com.google.zxing.oned;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.esotericsoftware.asm.Opcodes;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public final class Code39Reader extends OneDReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f49917e = {52, 289, 97, ResultCode.ERROR_CONN_SSL_HANDSHAKE, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, BluetoothState.REQUEST_ENABLE_BT, Opcodes.INSTANCEOF, 448, 145, 400, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 133, 388, 196, 168, 162, 138, 42};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f49920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f49921d;

    public Code39Reader() {
        this(false);
    }

    public static int b(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i14 |= 1 << ((length - 1) - i16);
                    i13++;
                    i15 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if ((i19 << 1) >= i15) {
                            return -1;
                        }
                    }
                }
                return i14;
            }
            if (i13 <= 3) {
                return -1;
            }
            i10 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0121  */
    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        char cCharAt;
        int i11;
        String string;
        int i12;
        char c10;
        int i13;
        int[] iArr = this.f49921d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f49920c;
        sb2.setLength(0);
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int length = iArr.length;
        boolean z10 = false;
        int i14 = 0;
        int i15 = nextSet;
        while (nextSet < size) {
            int i16 = 1;
            if (bitArray.get(nextSet) != z10) {
                iArr[i14] = iArr[i14] + 1;
            } else {
                if (i14 == length - 1) {
                    int i17 = 148;
                    if (b(iArr) == 148 && bitArray.isRange(Math.max(0, i15 - ((nextSet - i15) / 2)), i15, false)) {
                        int[] iArr2 = {i15, nextSet};
                        int nextSet2 = bitArray.getNextSet(iArr2[1]);
                        int size2 = bitArray.getSize();
                        while (true) {
                            OneDReader.recordPattern(bitArray, nextSet2, iArr);
                            int iB = b(iArr);
                            if (iB < 0) {
                                throw NotFoundException.getNotFoundInstance();
                            }
                            int i18 = 0;
                            while (true) {
                                if (i18 >= 43) {
                                    if (iB != i17) {
                                        throw NotFoundException.getNotFoundInstance();
                                    }
                                    cCharAt = '*';
                                    break;
                                }
                                if (f49917e[i18] == iB) {
                                    cCharAt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i18);
                                    break;
                                }
                                i18++;
                            }
                            sb2.append(cCharAt);
                            int i19 = nextSet2;
                            for (int i20 : iArr) {
                                i19 += i20;
                            }
                            int nextSet3 = bitArray.getNextSet(i19);
                            if (cCharAt == '*') {
                                sb2.setLength(sb2.length() - 1);
                                int i21 = 0;
                                for (int i22 : iArr) {
                                    i21 += i22;
                                }
                                int i23 = (nextSet3 - nextSet2) - i21;
                                if (nextSet3 != size2 && (i23 << 1) < i21) {
                                    throw NotFoundException.getNotFoundInstance();
                                }
                                if (this.f49918a) {
                                    int length2 = sb2.length() - 1;
                                    int iIndexOf = 0;
                                    for (int i24 = 0; i24 < length2; i24++) {
                                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb2.charAt(i24));
                                    }
                                    if (sb2.charAt(length2) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                                        throw ChecksumException.getChecksumInstance();
                                    }
                                    sb2.setLength(length2);
                                }
                                if (sb2.length() == 0) {
                                    throw NotFoundException.getNotFoundInstance();
                                }
                                if (this.f49919b) {
                                    int length3 = sb2.length();
                                    StringBuilder sb3 = new StringBuilder(length3);
                                    int i25 = 0;
                                    while (i25 < length3) {
                                        char cCharAt2 = sb2.charAt(i25);
                                        if (cCharAt2 == '+' || cCharAt2 == '$' || cCharAt2 == '%' || cCharAt2 == '/') {
                                            i25++;
                                            char cCharAt3 = sb2.charAt(i25);
                                            if (cCharAt2 != '$') {
                                                if (cCharAt2 != '%') {
                                                    if (cCharAt2 == '+') {
                                                        if (cCharAt3 < 'A' || cCharAt3 > 'Z') {
                                                            throw FormatException.getFormatInstance();
                                                        }
                                                        i12 = cCharAt3 + ' ';
                                                    } else if (cCharAt2 != '/') {
                                                        c10 = 0;
                                                    } else if (cCharAt3 >= 'A' && cCharAt3 <= 'O') {
                                                        i12 = cCharAt3 - ' ';
                                                    } else {
                                                        if (cCharAt3 != 'Z') {
                                                            throw FormatException.getFormatInstance();
                                                        }
                                                        c10 = AbstractJsonLexerKt.COLON;
                                                    }
                                                } else if (cCharAt3 >= 'A' && cCharAt3 <= 'E') {
                                                    i12 = cCharAt3 - '&';
                                                } else if (cCharAt3 >= 'F' && cCharAt3 <= 'J') {
                                                    i12 = cCharAt3 - 11;
                                                } else if (cCharAt3 >= 'K' && cCharAt3 <= 'O') {
                                                    i12 = cCharAt3 + 16;
                                                } else if (cCharAt3 >= 'P' && cCharAt3 <= 'T') {
                                                    i12 = cCharAt3 + '+';
                                                } else if (cCharAt3 == 'U') {
                                                    c10 = 0;
                                                } else if (cCharAt3 == 'V') {
                                                    c10 = '@';
                                                } else if (cCharAt3 == 'W') {
                                                    c10 = '`';
                                                } else {
                                                    if (cCharAt3 != 'X' && cCharAt3 != 'Y' && cCharAt3 != 'Z') {
                                                        throw FormatException.getFormatInstance();
                                                    }
                                                    c10 = 127;
                                                }
                                                sb3.append(c10);
                                                i13 = 1;
                                            } else {
                                                if (cCharAt3 < 'A' || cCharAt3 > 'Z') {
                                                    throw FormatException.getFormatInstance();
                                                }
                                                i12 = cCharAt3 - '@';
                                            }
                                            c10 = (char) i12;
                                            sb3.append(c10);
                                            i13 = 1;
                                        } else {
                                            sb3.append(cCharAt2);
                                            i13 = i16;
                                        }
                                        i25 += i13;
                                        i16 = i13;
                                    }
                                    i11 = i16;
                                    string = sb3.toString();
                                } else {
                                    i11 = 1;
                                    string = sb2.toString();
                                }
                                float f6 = i10;
                                return new Result(string, null, new ResultPoint[]{new ResultPoint((iArr2[i11] + iArr2[0]) / 2.0f, f6), new ResultPoint((i21 / 2.0f) + nextSet2, f6)}, BarcodeFormat.CODE_39);
                            }
                            nextSet2 = nextSet3;
                            i17 = 148;
                        }
                    } else {
                        i15 += iArr[0] + iArr[1];
                        int i26 = i14 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i26);
                        iArr[i26] = 0;
                        iArr[i14] = 0;
                        i14--;
                    }
                } else {
                    i14++;
                }
                iArr[i14] = 1;
                z10 = !z10;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Code39Reader(boolean z10) {
        this(z10, false);
    }

    public Code39Reader(boolean z10, boolean z11) {
        this.f49918a = z10;
        this.f49919b = z11;
        this.f49920c = new StringBuilder(20);
        this.f49921d = new int[9];
    }
}
