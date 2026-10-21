package com.google.zxing.oned;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public final class Code93Reader extends OneDReader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f49922c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f49923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f49924e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f49925a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f49926b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_EASING, 418, ResultCode.ERROR_REPO_CORRUPT, 402, 394, 360, 356, ResultCode.ERROR_CONN_SSL_PROTOCOL, 308, 282, 344, 332, 326, 300, 278, 436, 434, AsoResponse.HTTP_ARMADILLO_OTP_NEEDED, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, LoginHelperConstants.MAINTENANCE_RESPONSE_CODE, 294, 474, 470, 306, ResultCode.ERROR_CONN_SSL_GENERIC};
        f49923d = iArr;
        f49924e = iArr[47];
    }

    public static void b(StringBuilder sb2, int i10, int i11) throws ChecksumException {
        int iIndexOf = 0;
        int i12 = 1;
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(sb2.charAt(i13)) * i12;
            i12++;
            if (i12 > i11) {
                i12 = 1;
            }
        }
        if (sb2.charAt(i10) != f49922c[iIndexOf % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public static int c(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int iRound = Math.round((iArr[i13] * 9.0f) / i10);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < iRound; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= iRound;
            }
        }
        return i12;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int i11;
        char c10;
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int[] iArr = this.f49926b;
        Arrays.fill(iArr, 0);
        int length = iArr.length;
        boolean z10 = false;
        int i12 = 0;
        int i13 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z10) {
                iArr[i12] = iArr[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else if (c(iArr) == f49924e) {
                    int[] iArr2 = {i13, nextSet};
                    int nextSet2 = bitArray.getNextSet(iArr2[1]);
                    int size2 = bitArray.getSize();
                    Arrays.fill(iArr, 0);
                    StringBuilder sb2 = this.f49925a;
                    sb2.setLength(0);
                    while (true) {
                        OneDReader.recordPattern(bitArray, nextSet2, iArr);
                        int iC = c(iArr);
                        if (iC < 0) {
                            throw NotFoundException.getNotFoundInstance();
                        }
                        int i14 = 0;
                        while (true) {
                            int[] iArr3 = f49923d;
                            if (i14 >= iArr3.length) {
                                throw NotFoundException.getNotFoundInstance();
                            }
                            if (iArr3[i14] == iC) {
                                break;
                            }
                            i14++;
                        }
                        char c11 = f49922c[i14];
                        sb2.append(c11);
                        int i15 = nextSet2;
                        for (int i16 : iArr) {
                            i15 += i16;
                        }
                        int nextSet3 = bitArray.getNextSet(i15);
                        if (c11 == '*') {
                            sb2.deleteCharAt(sb2.length() - 1);
                            int i17 = 0;
                            for (int i18 : iArr) {
                                i17 += i18;
                            }
                            if (nextSet3 == size2 || !bitArray.get(nextSet3)) {
                                throw NotFoundException.getNotFoundInstance();
                            }
                            if (sb2.length() < 2) {
                                throw NotFoundException.getNotFoundInstance();
                            }
                            int length2 = sb2.length();
                            b(sb2, length2 - 2, 20);
                            b(sb2, length2 - 1, 15);
                            sb2.setLength(sb2.length() - 2);
                            int length3 = sb2.length();
                            StringBuilder sb3 = new StringBuilder(length3);
                            int i19 = 0;
                            while (i19 < length3) {
                                char cCharAt = sb2.charAt(i19);
                                if (cCharAt >= 'a' && cCharAt <= 'd') {
                                    if (i19 >= length3 - 1) {
                                        throw FormatException.getFormatInstance();
                                    }
                                    i19++;
                                    char cCharAt2 = sb2.charAt(i19);
                                    switch (cCharAt) {
                                        case 'a':
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw FormatException.getFormatInstance();
                                            }
                                            i11 = cCharAt2 - '@';
                                            c10 = (char) i11;
                                            sb3.append(c10);
                                            break;
                                            break;
                                        case 'b':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                                                i11 = cCharAt2 - '&';
                                            } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                                                i11 = cCharAt2 - 11;
                                            } else if (cCharAt2 < 'K' || cCharAt2 > 'O') {
                                                if (cCharAt2 >= 'P' && cCharAt2 <= 'S') {
                                                    i11 = cCharAt2 + '+';
                                                } else {
                                                    if (cCharAt2 < 'T' || cCharAt2 > 'Z') {
                                                        throw FormatException.getFormatInstance();
                                                    }
                                                    c10 = 127;
                                                }
                                                sb3.append(c10);
                                            } else {
                                                i11 = cCharAt2 + 16;
                                            }
                                            c10 = (char) i11;
                                            sb3.append(c10);
                                            break;
                                        case 'c':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                                i11 = cCharAt2 - ' ';
                                                c10 = (char) i11;
                                            } else {
                                                if (cCharAt2 != 'Z') {
                                                    throw FormatException.getFormatInstance();
                                                }
                                                c10 = AbstractJsonLexerKt.COLON;
                                            }
                                            sb3.append(c10);
                                            break;
                                        case 'd':
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw FormatException.getFormatInstance();
                                            }
                                            i11 = cCharAt2 + ' ';
                                            c10 = (char) i11;
                                            sb3.append(c10);
                                            break;
                                            break;
                                        default:
                                            c10 = 0;
                                            sb3.append(c10);
                                            break;
                                    }
                                } else {
                                    sb3.append(cCharAt);
                                }
                                i19++;
                            }
                            float f6 = i10;
                            return new Result(sb3.toString(), null, new ResultPoint[]{new ResultPoint((iArr2[1] + iArr2[0]) / 2.0f, f6), new ResultPoint((i17 / 2.0f) + nextSet2, f6)}, BarcodeFormat.CODE_93);
                        }
                        nextSet2 = nextSet3;
                    }
                } else {
                    i13 += iArr[0] + iArr[1];
                    int i20 = i12 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i20);
                    iArr[i20] = 0;
                    iArr[i12] = 0;
                    i12--;
                }
                iArr[i12] = 1;
                z10 = !z10;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
