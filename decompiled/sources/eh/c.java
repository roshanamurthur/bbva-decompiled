package eh;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.UPCEANReader;
import java.util.EnumMap;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: UPCEANExtension5Support.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f68354c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f68355a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f68356b = new StringBuilder();

    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:68:0x0120  */
    public final Result a(BitArray bitArray, int i10, int[] iArr) throws NotFoundException {
        String str;
        String str2;
        EnumMap enumMap;
        StringBuilder sb2 = this.f68356b;
        sb2.setLength(0);
        int[] iArr2 = this.f68355a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int nextUnset = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 5 && nextUnset < size; i12++) {
            int iC = UPCEANReader.c(bitArray, iArr2, nextUnset, UPCEANReader.f49946h);
            sb2.append((char) ((iC % 10) + 48));
            for (int i13 : iArr2) {
                nextUnset += i13;
            }
            if (iC >= 10) {
                i11 |= 1 << (4 - i12);
            }
            if (i12 != 4) {
                nextUnset = bitArray.getNextUnset(bitArray.getNextSet(nextUnset));
            }
        }
        if (sb2.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i14 = 0; i14 < 10; i14++) {
            if (i11 == f68354c[i14]) {
                String string = sb2.toString();
                int length = string.length();
                int iCharAt = 0;
                for (int i15 = length - 2; i15 >= 0; i15 -= 2) {
                    iCharAt += string.charAt(i15) - '0';
                }
                int iCharAt2 = iCharAt * 3;
                for (int i16 = length - 1; i16 >= 0; i16 -= 2) {
                    iCharAt2 += string.charAt(i16) - '0';
                }
                if ((iCharAt2 * 3) % 10 != i14) {
                    throw NotFoundException.getNotFoundInstance();
                }
                String string2 = sb2.toString();
                if (string2.length() == 5) {
                    char cCharAt = string2.charAt(0);
                    if (cCharAt == '0') {
                        str = "£";
                    } else if (cCharAt != '5') {
                        str = "";
                        if (cCharAt == '9') {
                            switch (string2) {
                                case "90000":
                                    str2 = null;
                                    break;
                                case "99990":
                                    str2 = "Used";
                                    break;
                                case "99991":
                                    str2 = EglobalUtils.DECIMAL_FORMAT_PATTERN;
                                    break;
                            }
                        }
                        if (str2 == null) {
                            enumMap = null;
                        } else {
                            enumMap = new EnumMap(ResultMetadataType.class);
                            enumMap.put(ResultMetadataType.SUGGESTED_PRICE, str2);
                        }
                    } else {
                        str = Constant.MXN_SYMBOL;
                    }
                    int i17 = Integer.parseInt(string2.substring(1));
                    String strValueOf = String.valueOf(i17 / 100);
                    int i18 = i17 % 100;
                    str2 = str + strValueOf + '.' + (i18 < 10 ? "0".concat(String.valueOf(i18)) : String.valueOf(i18));
                    if (str2 == null) {
                        enumMap = null;
                    } else {
                        enumMap = new EnumMap(ResultMetadataType.class);
                        enumMap.put(ResultMetadataType.SUGGESTED_PRICE, str2);
                    }
                } else {
                    enumMap = null;
                }
                float f6 = i10;
                Result result = new Result(string2, null, new ResultPoint[]{new ResultPoint((iArr[0] + iArr[1]) / 2.0f, f6), new ResultPoint(nextUnset, f6)}, BarcodeFormat.UPC_EAN_EXTENSION);
                if (enumMap != null) {
                    result.putAllMetadata(enumMap);
                }
                return result;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
