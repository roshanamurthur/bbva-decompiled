package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a FNC_1;
        public static final a ONE_DIGIT;
        public static final a TWO_DIGITS;
        public static final a UNCODABLE;

        static {
            a aVar = new a("UNCODABLE", 0);
            UNCODABLE = aVar;
            a aVar2 = new a("ONE_DIGIT", 1);
            ONE_DIGIT = aVar2;
            a aVar3 = new a("TWO_DIGITS", 2);
            TWO_DIGITS = aVar3;
            a aVar4 = new a("FNC_1", 3);
            FNC_1 = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static a a(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        if (i10 >= length) {
            return a.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == 241) {
            return a.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return a.UNCODABLE;
        }
        int i11 = i10 + 1;
        if (i11 >= length) {
            return a.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i11);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int i10;
        a aVarA;
        char cCharAt;
        int i11;
        int iCharAt;
        int length = str.length();
        if (length > 0 && length <= 80) {
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt2 = str.charAt(i12);
                switch (cCharAt2) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (cCharAt2 > 127) {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt2)));
                        }
                        break;
                        break;
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i13 = 1;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[][] iArr = Code128Reader.f49916a;
                if (i14 < length) {
                    a aVarA2 = a(i14, str);
                    a aVar = a.ONE_DIGIT;
                    if (aVarA2 != aVar) {
                        a aVar2 = a.UNCODABLE;
                        if (aVarA2 != aVar2) {
                            i10 = 99;
                            if (i16 != 99) {
                                if (i16 == 100) {
                                    a aVar3 = a.FNC_1;
                                    if (aVarA2 != aVar3 && (aVarA = a(i14 + 2, str)) != aVar2 && aVarA != aVar) {
                                        if (aVarA != aVar3) {
                                            int i17 = i14 + 4;
                                            while (true) {
                                                a aVarA3 = a(i17, str);
                                                if (aVarA3 == a.TWO_DIGITS) {
                                                    i17 += 2;
                                                } else if (aVarA3 != a.ONE_DIGIT) {
                                                    i10 = 99;
                                                }
                                            }
                                        } else if (a(i14 + 3, str) == a.TWO_DIGITS) {
                                            i10 = 99;
                                        }
                                    }
                                    i10 = 100;
                                } else {
                                    if (aVarA2 == a.FNC_1) {
                                        aVarA2 = a(i14 + 1, str);
                                    }
                                    if (aVarA2 == a.TWO_DIGITS) {
                                        i10 = 99;
                                    } else {
                                        i10 = 100;
                                    }
                                }
                            }
                        } else if (i14 >= str.length() || ((cCharAt = str.charAt(i14)) >= ' ' && (i16 != 101 || cCharAt >= '`'))) {
                            i10 = 100;
                        } else {
                            i10 = 101;
                        }
                    } else {
                        i10 = 100;
                    }
                    if (i10 == i16) {
                        switch (str.charAt(i14)) {
                            case 241:
                                iCharAt = 102;
                                break;
                            case 242:
                                iCharAt = 97;
                                break;
                            case 243:
                                iCharAt = 96;
                                break;
                            case 244:
                                iCharAt = i16 == 101 ? 101 : 100;
                                break;
                            default:
                                if (i16 == 100) {
                                    iCharAt = str.charAt(i14) - ' ';
                                } else if (i16 != 101) {
                                    iCharAt = Integer.parseInt(str.substring(i14, i14 + 2));
                                    i14++;
                                } else {
                                    char cCharAt3 = str.charAt(i14);
                                    iCharAt = cCharAt3 - ' ';
                                    if (iCharAt < 0) {
                                        iCharAt = cCharAt3 + '@';
                                    }
                                }
                                break;
                        }
                        i14++;
                    } else {
                        if (i16 != 0) {
                            i11 = i10;
                        } else if (i10 != 100) {
                            i11 = i10 != 101 ? 105 : 103;
                        } else {
                            i11 = 104;
                        }
                        i16 = i10;
                        iCharAt = i11;
                    }
                    arrayList.add(iArr[iCharAt]);
                    i15 += iCharAt * i13;
                    if (i14 != 0) {
                        i13++;
                    }
                } else {
                    arrayList.add(iArr[i15 % 103]);
                    arrayList.add(iArr[106]);
                    int i18 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i19 : iArr2) {
                            i18 += i19;
                        }
                    }
                    boolean[] zArr = new boolean[i18];
                    Iterator it = arrayList.iterator();
                    int iAppendPattern = 0;
                    while (it.hasNext()) {
                        iAppendPattern += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, (int[]) it.next(), true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
