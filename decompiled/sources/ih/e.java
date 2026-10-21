package ih;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.zxing.FormatException;
import java.math.BigInteger;

/* JADX INFO: compiled from: DecodedBitStreamParser.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f69700a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f69701b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger[] f69702c;

    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69703a;

        static {
            int[] iArr = new int[b.values().length];
            f69703a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69703a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69703a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69703a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69703a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69703a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b ALPHA;
        public static final b ALPHA_SHIFT;
        public static final b LOWER;
        public static final b MIXED;
        public static final b PUNCT;
        public static final b PUNCT_SHIFT;

        static {
            b bVar = new b("ALPHA", 0);
            ALPHA = bVar;
            b bVar2 = new b("LOWER", 1);
            LOWER = bVar2;
            b bVar3 = new b("MIXED", 2);
            MIXED = bVar3;
            b bVar4 = new b("PUNCT", 3);
            PUNCT = bVar4;
            b bVar5 = new b("ALPHA_SHIFT", 4);
            ALPHA_SHIFT = bVar5;
            b bVar6 = new b("PUNCT_SHIFT", 5);
            PUNCT_SHIFT = bVar6;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f69702c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f69702c;
            if (i10 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(bigIntegerValueOf);
            i10++;
        }
    }

    public static String a(int i10, int[] iArr) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigIntegerAdd = bigIntegerAdd.add(f69702c[(i10 - i11) - 1].multiply(BigInteger.valueOf(iArr[i11])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0007 A[SYNTHETIC] */
    public static int b(int[] iArr, int i10, StringBuilder sb2) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int i12 = iArr[0];
            if (i10 < i12 && !z10) {
                int i13 = i10 + 1;
                int i14 = iArr[i10];
                if (i13 == i12) {
                    z10 = true;
                }
                if (i14 < 900) {
                    iArr2[i11] = i14;
                    i11++;
                } else {
                    if (i14 != 900 && i14 != 901 && i14 != 928) {
                        switch (i14) {
                            case 922:
                            case 923:
                            case 924:
                                z10 = true;
                                break;
                        }
                    } else {
                        z10 = true;
                    }
                    if (i11 % 15 != 0 || i14 == 902 || z10) {
                        if (i11 > 0) {
                            sb2.append(a(i11, iArr2));
                            i11 = 0;
                        }
                    }
                }
                i10 = i13;
                if (i11 % 15 != 0) {
                }
                if (i11 > 0) {
                    sb2.append(a(i11, iArr2));
                    i11 = 0;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0038. Please report as an issue. */
    public static int c(int[] iArr, int i10, StringBuilder sb2) {
        b bVar;
        b bVar2;
        int i11;
        int i12 = (iArr[0] - i10) << 1;
        int[] iArr2 = new int[i12];
        int[] iArr3 = new int[i12];
        int i13 = i10;
        boolean z10 = false;
        int i14 = 0;
        while (i13 < iArr[0] && !z10) {
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            if (i16 < 900) {
                iArr2[i14] = i16 / 30;
                iArr2[i14 + 1] = i16 % 30;
                i14 += 2;
            } else if (i16 != 913) {
                if (i16 != 928) {
                    switch (i16) {
                        case TypedValues.Custom.TYPE_INT /* 900 */:
                            iArr2[i14] = 900;
                            i14++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i16) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z10 = true;
            } else {
                iArr2[i14] = 913;
                i13 += 2;
                iArr3[i14] = iArr[i15];
                i14++;
            }
            i13 = i15;
        }
        b bVar3 = b.ALPHA;
        b bVar4 = bVar3;
        for (int i17 = 0; i17 < i14; i17++) {
            int i18 = iArr2[i17];
            int i19 = a.f69703a[bVar3.ordinal()];
            char[] cArr = f69700a;
            char c10 = ' ';
            switch (i19) {
                case 1:
                    if (i18 < 26) {
                        i11 = i18 + 65;
                        c10 = (char) i11;
                    } else {
                        if (i18 == 900) {
                            bVar3 = b.ALPHA;
                        } else if (i18 != 913) {
                            switch (i18) {
                                case 27:
                                    bVar = b.LOWER;
                                    bVar3 = bVar;
                                    break;
                                case 28:
                                    bVar = b.MIXED;
                                    bVar3 = bVar;
                                    break;
                                case 29:
                                    bVar2 = b.PUNCT_SHIFT;
                                    bVar4 = bVar3;
                                    c10 = 0;
                                    bVar3 = bVar2;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr3[i17]);
                        }
                        c10 = 0;
                    }
                    break;
                case 2:
                    if (i18 < 26) {
                        i11 = i18 + 97;
                        c10 = (char) i11;
                    } else {
                        if (i18 == 900) {
                            bVar3 = b.ALPHA;
                        } else if (i18 != 913) {
                            switch (i18) {
                                case 27:
                                    bVar2 = b.ALPHA_SHIFT;
                                    bVar4 = bVar3;
                                    c10 = 0;
                                    bVar3 = bVar2;
                                    break;
                                case 28:
                                    bVar = b.MIXED;
                                    bVar3 = bVar;
                                    break;
                                case 29:
                                    bVar2 = b.PUNCT_SHIFT;
                                    bVar4 = bVar3;
                                    c10 = 0;
                                    bVar3 = bVar2;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr3[i17]);
                        }
                        c10 = 0;
                    }
                    break;
                case 3:
                    if (i18 < 25) {
                        c10 = f69701b[i18];
                    } else {
                        if (i18 == 900) {
                            bVar3 = b.ALPHA;
                        } else if (i18 != 913) {
                            switch (i18) {
                                case 25:
                                    bVar = b.PUNCT;
                                    bVar3 = bVar;
                                    break;
                                case 27:
                                    bVar = b.LOWER;
                                    bVar3 = bVar;
                                    break;
                                case 28:
                                    bVar = b.ALPHA;
                                    bVar3 = bVar;
                                    break;
                                case 29:
                                    bVar2 = b.PUNCT_SHIFT;
                                    bVar4 = bVar3;
                                    c10 = 0;
                                    bVar3 = bVar2;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr3[i17]);
                        }
                        c10 = 0;
                    }
                    break;
                case 4:
                    if (i18 < 29) {
                        c10 = cArr[i18];
                    } else {
                        if (i18 == 29) {
                            bVar = b.ALPHA;
                            bVar3 = bVar;
                        } else if (i18 == 900) {
                            bVar3 = b.ALPHA;
                        } else if (i18 == 913) {
                            sb2.append((char) iArr3[i17]);
                        }
                        c10 = 0;
                    }
                    break;
                case 5:
                    if (i18 < 26) {
                        c10 = (char) (i18 + 65);
                    } else if (i18 != 26) {
                        bVar = i18 != 900 ? bVar4 : b.ALPHA;
                        bVar3 = bVar;
                        c10 = 0;
                    }
                    bVar3 = bVar4;
                    break;
                case 6:
                    if (i18 < 29) {
                        c10 = cArr[i18];
                        bVar3 = bVar4;
                    } else {
                        if (i18 == 29 || i18 == 900) {
                            bVar = b.ALPHA;
                            bVar3 = bVar;
                        } else {
                            if (i18 == 913) {
                                sb2.append((char) iArr3[i17]);
                            }
                            bVar3 = bVar4;
                        }
                        c10 = 0;
                    }
                    break;
                default:
                    c10 = 0;
                    break;
            }
            if (c10 != 0) {
                sb2.append(c10);
            }
        }
        return i13;
    }
}
