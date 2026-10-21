package com.google.zxing.oned;

import androidx.camera.core.impl.utils.b;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    public static void a(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.encode(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int[] iArr;
        int length = str.length();
        if (length <= 80) {
            for (int i10 = 0; i10 < length; i10++) {
                if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i10)) < 0) {
                    int length2 = str.length();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < length2; i11++) {
                        char cCharAt = str.charAt(i11);
                        if (cCharAt == 0) {
                            sb2.append("%U");
                        } else if (cCharAt == ' ') {
                            sb2.append(cCharAt);
                        } else if (cCharAt == '@') {
                            sb2.append("%V");
                        } else if (cCharAt == '`') {
                            sb2.append("%W");
                        } else if (cCharAt == '-' || cCharAt == '.') {
                            sb2.append(cCharAt);
                        } else if (cCharAt <= 26) {
                            sb2.append(Typography.dollar);
                            sb2.append((char) (cCharAt + '@'));
                        } else if (cCharAt < ' ') {
                            sb2.append('%');
                            sb2.append((char) (cCharAt + Typography.amp));
                        } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                            sb2.append(JsonPointer.SEPARATOR);
                            sb2.append((char) (cCharAt + ' '));
                        } else if (cCharAt <= '9') {
                            sb2.append(cCharAt);
                        } else if (cCharAt <= '?') {
                            sb2.append('%');
                            sb2.append((char) (cCharAt + 11));
                        } else if (cCharAt <= 'Z') {
                            sb2.append(cCharAt);
                        } else if (cCharAt <= '_') {
                            sb2.append('%');
                            sb2.append((char) (cCharAt - 16));
                        } else if (cCharAt <= 'z') {
                            sb2.append('+');
                            sb2.append((char) (cCharAt - ' '));
                        } else if (cCharAt <= 127) {
                            sb2.append('%');
                            sb2.append((char) (cCharAt - '+'));
                        } else {
                            throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i11) + "'");
                        }
                    }
                    str = sb2.toString();
                    length = str.length();
                    if (length <= 80) {
                        break;
                    }
                    throw new IllegalArgumentException(b.a("Requested contents should be less than 80 digits long, but got ", length, " (extended full ASCII mode)"));
                }
            }
            int[] iArr2 = new int[9];
            int i12 = length + 25;
            int i13 = 0;
            while (true) {
                iArr = Code39Reader.f49917e;
                if (i13 >= length) {
                    break;
                }
                a(iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i13))], iArr2);
                for (int i14 = 0; i14 < 9; i14++) {
                    i12 += iArr2[i14];
                }
                i13++;
            }
            boolean[] zArr = new boolean[i12];
            a(148, iArr2);
            int iAppendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, iArr2, true);
            int[] iArr3 = {1};
            int iAppendPattern2 = OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, iArr3, false) + iAppendPattern;
            for (int i15 = 0; i15 < length; i15++) {
                a(iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i15))], iArr2);
                int iAppendPattern3 = OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr2, true) + iAppendPattern2;
                iAppendPattern2 = OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern3, iArr3, false) + iAppendPattern3;
            }
            a(148, iArr2);
            OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr2, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
