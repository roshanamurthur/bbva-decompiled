package com.wutka.dtd;

import androidx.databinding.e;
import java.io.IOException;
import java.io.Reader;
import java.util.Hashtable;
import java.util.Stack;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes7.dex */
public final class Scanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StreamInfo f68062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Stack f68063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f68064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f68065d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f68067f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f68069h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EntityExpansion f68071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f68047k = new b(0, "LTQUES");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f68048l = new b(1, "IDENTIFIER");
    public static final b m = new b(2, "EQUAL");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f68049n = new b(3, "LPAREN");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f68050o = new b(4, "RPAREN");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f68051p = new b(5, "COMMA");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f68052q = new b(6, "STRING");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f68053r = new b(8, "LTBANG");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f68054s = new b(9, "GT");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f68055t = new b(10, "PIPE");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f68056u = new b(11, "QUES");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f68057v = new b(12, "PLUS");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f68058w = new b(13, "ASTERISK");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f68059x = new b(14, "LT");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f68060y = new b(15, "EOF");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f68061z = new b(16, "COMMENT");
    public static final b A = new b(17, "PERCENT");
    public static final b B = new b(18, "CONDITIONAL");
    public static final b C = new b(19, "ENDCONDITIONAL");
    public static final b D = new b(20, "NMTOKEN");
    public static final char[][] E = {new char[]{'A', Matrix.MATRIX_TYPE_ZERO}, new char[]{'a', 'z'}, new char[]{192, 214}, new char[]{216, 246}, new char[]{248, 255}, new char[]{256, 305}, new char[]{308, 318}, new char[]{321, 328}, new char[]{330, 382}, new char[]{384, 451}, new char[]{461, 496}, new char[]{500, 501}, new char[]{506, 535}, new char[]{592, 680}, new char[]{699, 705}, new char[]{902, 902}, new char[]{904, 906}, new char[]{908, 908}, new char[]{910, 929}, new char[]{931, 974}, new char[]{976, 982}, new char[]{986, 986}, new char[]{988, 988}, new char[]{990, 990}, new char[]{992, 992}, new char[]{994, 1011}, new char[]{1025, 1036}, new char[]{1038, 1103}, new char[]{1105, 1116}, new char[]{1118, 1153}, new char[]{1168, 1220}, new char[]{1223, 1224}, new char[]{1227, 1228}, new char[]{1232, 1259}, new char[]{1262, 1269}, new char[]{1272, 1273}, new char[]{1329, 1366}, new char[]{1369, 1369}, new char[]{1377, 1414}, new char[]{1488, 1514}, new char[]{1520, 1522}, new char[]{1569, 1594}, new char[]{1601, 1610}, new char[]{1649, 1719}, new char[]{1722, 1726}, new char[]{1728, 1742}, new char[]{1744, 1747}, new char[]{1749, 1749}, new char[]{1765, 1766}, new char[]{2309, 2361}, new char[]{2365, 2365}, new char[]{2392, 2401}, new char[]{2437, 2444}, new char[]{2447, 2448}, new char[]{2451, 2472}, new char[]{2474, 2480}, new char[]{2482, 2482}, new char[]{2486, 2489}, new char[]{2524, 2525}, new char[]{2527, 2529}, new char[]{2544, 2545}, new char[]{2565, 2570}, new char[]{2575, 2576}, new char[]{2579, 2600}, new char[]{2602, 2608}, new char[]{2610, 2611}, new char[]{2613, 2614}, new char[]{2616, 2617}, new char[]{2649, 2652}, new char[]{2654, 2654}, new char[]{2674, 2676}, new char[]{2693, 2699}, new char[]{2701, 2701}, new char[]{2703, 2705}, new char[]{2707, 2728}, new char[]{2730, 2736}, new char[]{2738, 2739}, new char[]{2741, 2745}, new char[]{2749, 2749}, new char[]{2784, 2784}, new char[]{2821, 2828}, new char[]{2831, 2832}, new char[]{2835, 2856}, new char[]{2858, 2864}, new char[]{2866, 2867}, new char[]{2870, 2873}, new char[]{2877, 2877}, new char[]{2908, 2909}, new char[]{2911, 2913}, new char[]{2949, 2954}, new char[]{2958, 2960}, new char[]{2962, 2965}, new char[]{2969, 2970}, new char[]{2972, 2972}, new char[]{2974, 2975}, new char[]{2979, 2980}, new char[]{2984, 2986}, new char[]{2990, 2997}, new char[]{2999, 3001}, new char[]{3077, 3084}, new char[]{3086, 3088}, new char[]{3090, 3112}, new char[]{3114, 3123}, new char[]{3125, 3129}, new char[]{3168, 3169}, new char[]{3205, 3212}, new char[]{3214, 3216}, new char[]{3218, 3240}, new char[]{3242, 3251}, new char[]{3253, 3257}, new char[]{3294, 3294}, new char[]{3296, 3297}, new char[]{3333, 3340}, new char[]{3342, 3344}, new char[]{3346, 3368}, new char[]{3370, 3385}, new char[]{3424, 3425}, new char[]{3585, 3630}, new char[]{3632, 3632}, new char[]{3634, 3635}, new char[]{3648, 3653}, new char[]{3713, 3714}, new char[]{3716, 3716}, new char[]{3719, 3720}, new char[]{3722, 3722}, new char[]{3725, 3725}, new char[]{3732, 3735}, new char[]{3737, 3743}, new char[]{3745, 3747}, new char[]{3749, 3749}, new char[]{3751, 3751}, new char[]{3754, 3755}, new char[]{3757, 3758}, new char[]{3760, 3760}, new char[]{3762, 3763}, new char[]{3773, 3773}, new char[]{3776, 3780}, new char[]{3904, 3911}, new char[]{3913, 3945}, new char[]{4256, 4293}, new char[]{4304, 4342}, new char[]{4352, 4352}, new char[]{4354, 4355}, new char[]{4357, 4359}, new char[]{4361, 4361}, new char[]{4363, 4364}, new char[]{4366, 4370}, new char[]{4412, 4412}, new char[]{4414, 4414}, new char[]{4416, 4416}, new char[]{4428, 4428}, new char[]{4430, 4430}, new char[]{4432, 4432}, new char[]{4436, 4437}, new char[]{4441, 4441}, new char[]{4447, 4449}, new char[]{4451, 4451}, new char[]{4453, 4453}, new char[]{4455, 4455}, new char[]{4457, 4457}, new char[]{4461, 4462}, new char[]{4466, 4467}, new char[]{4469, 4469}, new char[]{4510, 4510}, new char[]{4520, 4520}, new char[]{4523, 4523}, new char[]{4526, 4527}, new char[]{4535, 4536}, new char[]{4538, 4538}, new char[]{4540, 4546}, new char[]{4587, 4587}, new char[]{4592, 4592}, new char[]{4601, 4601}, new char[]{7680, 7835}, new char[]{7840, 7929}, new char[]{7936, 7957}, new char[]{7960, 7965}, new char[]{7968, 8005}, new char[]{8008, 8013}, new char[]{8016, 8023}, new char[]{8025, 8025}, new char[]{8027, 8027}, new char[]{8029, 8029}, new char[]{8031, 8061}, new char[]{8064, 8116}, new char[]{8118, 8124}, new char[]{8126, 8126}, new char[]{8130, 8132}, new char[]{8134, 8140}, new char[]{8144, 8147}, new char[]{8150, 8155}, new char[]{8160, 8172}, new char[]{8178, 8180}, new char[]{8182, 8188}, new char[]{8486, 8486}, new char[]{8490, 8491}, new char[]{8494, 8494}, new char[]{8576, 8578}, new char[]{12353, 12436}, new char[]{12449, 12538}, new char[]{12549, 12588}, new char[]{44032, 55203}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f68066e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char[] f68068g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hashtable f68070i = new Hashtable();

    public class StreamInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Reader f68073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f68074c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f68075d = 1;

        public StreamInfo(String str, Reader reader) {
            this.f68072a = str;
            this.f68073b = reader;
        }
    }

    public Scanner(Reader reader, boolean z10, EntityExpansion entityExpansion) {
        this.f68062a = new StreamInfo("", reader);
        this.f68067f = z10;
        this.f68071j = entityExpansion;
    }

    public static boolean b(char c10) {
        return c(c10) || c10 == '_' || c10 == ':';
    }

    public static boolean c(char c10) {
        char[] cArr;
        char c11;
        for (int i10 = 0; i10 < 202 && c10 >= (c11 = (cArr = E[i10])[0]); i10++) {
            if (c10 >= c11 && c10 <= cArr[1]) {
                return true;
            }
        }
        if (c10 < 19968) {
            return false;
        }
        if ((c10 < 19968 || c10 > 40869) && c10 != 12295 && (c10 < 12321 || c10 > 12329)) {
            return false;
        }
        return true;
    }

    public static boolean d(char c10) {
        if (c(c10)) {
            return true;
        }
        if (c10 >= '0' && c10 <= '9') {
            return true;
        }
        if (c10 >= 1632) {
            if (c10 >= 1632 && c10 <= 1641) {
                return true;
            }
            if (c10 >= 1776) {
                if (c10 >= 1776 && c10 <= 1785) {
                    return true;
                }
                if (c10 >= 2406) {
                    if (c10 >= 2406 && c10 <= 2415) {
                        return true;
                    }
                    if (c10 >= 2534) {
                        if (c10 >= 2534 && c10 <= 2543) {
                            return true;
                        }
                        if (c10 >= 2662) {
                            if (c10 >= 2662 && c10 <= 2671) {
                                return true;
                            }
                            if (c10 >= 2790) {
                                if (c10 >= 2790 && c10 <= 2799) {
                                    return true;
                                }
                                if (c10 >= 2918) {
                                    if (c10 >= 2918 && c10 <= 2927) {
                                        return true;
                                    }
                                    if (c10 >= 3047) {
                                        if (c10 >= 3047 && c10 <= 3055) {
                                            return true;
                                        }
                                        if (c10 >= 3174) {
                                            if (c10 >= 3174 && c10 <= 3183) {
                                                return true;
                                            }
                                            if (c10 >= 3302) {
                                                if (c10 >= 3302 && c10 <= 3311) {
                                                    return true;
                                                }
                                                if (c10 >= 3430) {
                                                    if (c10 >= 3430 && c10 <= 3439) {
                                                        return true;
                                                    }
                                                    if (c10 >= 3664) {
                                                        if (c10 >= 3664 && c10 <= 3673) {
                                                            return true;
                                                        }
                                                        if (c10 >= 3792) {
                                                            if (c10 >= 3792 && c10 <= 3801) {
                                                                return true;
                                                            }
                                                            if (c10 >= 3872 && c10 >= 3872 && c10 <= 3881) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (c10 == '-' || c10 == '_' || c10 == '.' || c10 == ':') {
            return true;
        }
        if (c10 >= 768) {
            if (c10 >= 768 && c10 <= 837) {
                return true;
            }
            if (c10 >= 864 && c10 <= 865) {
                return true;
            }
            if (c10 >= 1155 && c10 <= 1158) {
                return true;
            }
            if (c10 >= 1425 && c10 <= 1441) {
                return true;
            }
            if (c10 >= 1443 && c10 <= 1465) {
                return true;
            }
            if ((c10 >= 1467 && c10 <= 1469) || c10 == 1471) {
                return true;
            }
            if ((c10 >= 1473 && c10 <= 1474) || c10 == 1476) {
                return true;
            }
            if ((c10 >= 1611 && c10 <= 1618) || c10 == 1648) {
                return true;
            }
            if (c10 >= 1750 && c10 <= 1756) {
                return true;
            }
            if (c10 >= 1757 && c10 <= 1759) {
                return true;
            }
            if (c10 >= 1760 && c10 <= 1764) {
                return true;
            }
            if (c10 >= 1767 && c10 <= 1768) {
                return true;
            }
            if (c10 >= 1770 && c10 <= 1773) {
                return true;
            }
            if ((c10 >= 2305 && c10 <= 2307) || c10 == 2364) {
                return true;
            }
            if ((c10 >= 2366 && c10 <= 2380) || c10 == 2381) {
                return true;
            }
            if (c10 >= 2385 && c10 <= 2388) {
                return true;
            }
            if (c10 >= 2402 && c10 <= 2403) {
                return true;
            }
            if ((c10 >= 2433 && c10 <= 2435) || c10 == 2492 || c10 == 2494 || c10 == 2495) {
                return true;
            }
            if (c10 >= 2496 && c10 <= 2500) {
                return true;
            }
            if (c10 >= 2503 && c10 <= 2504) {
                return true;
            }
            if ((c10 >= 2507 && c10 <= 2509) || c10 == 2519) {
                return true;
            }
            if ((c10 >= 2530 && c10 <= 2531) || c10 == 2562 || c10 == 2620 || c10 == 2622 || c10 == 2623) {
                return true;
            }
            if (c10 >= 2624 && c10 <= 2626) {
                return true;
            }
            if (c10 >= 2631 && c10 <= 2632) {
                return true;
            }
            if (c10 >= 2635 && c10 <= 2637) {
                return true;
            }
            if (c10 >= 2672 && c10 <= 2673) {
                return true;
            }
            if ((c10 >= 2689 && c10 <= 2691) || c10 == 2748) {
                return true;
            }
            if (c10 >= 2750 && c10 <= 2757) {
                return true;
            }
            if (c10 >= 2759 && c10 <= 2761) {
                return true;
            }
            if (c10 >= 2763 && c10 <= 2765) {
                return true;
            }
            if ((c10 >= 2817 && c10 <= 2819) || c10 == 2876) {
                return true;
            }
            if (c10 >= 2878 && c10 <= 2883) {
                return true;
            }
            if (c10 >= 2887 && c10 <= 2888) {
                return true;
            }
            if (c10 >= 2891 && c10 <= 2893) {
                return true;
            }
            if (c10 >= 2902 && c10 <= 2903) {
                return true;
            }
            if (c10 >= 2946 && c10 <= 2947) {
                return true;
            }
            if (c10 >= 3006 && c10 <= 3010) {
                return true;
            }
            if (c10 >= 3014 && c10 <= 3016) {
                return true;
            }
            if ((c10 >= 3018 && c10 <= 3021) || c10 == 3031) {
                return true;
            }
            if (c10 >= 3073 && c10 <= 3075) {
                return true;
            }
            if (c10 >= 3134 && c10 <= 3140) {
                return true;
            }
            if (c10 >= 3142 && c10 <= 3144) {
                return true;
            }
            if (c10 >= 3146 && c10 <= 3149) {
                return true;
            }
            if (c10 >= 3157 && c10 <= 3158) {
                return true;
            }
            if (c10 >= 3202 && c10 <= 3203) {
                return true;
            }
            if (c10 >= 3262 && c10 <= 3268) {
                return true;
            }
            if (c10 >= 3270 && c10 <= 3272) {
                return true;
            }
            if (c10 >= 3274 && c10 <= 3277) {
                return true;
            }
            if (c10 >= 3285 && c10 <= 3286) {
                return true;
            }
            if (c10 >= 3330 && c10 <= 3331) {
                return true;
            }
            if (c10 >= 3390 && c10 <= 3395) {
                return true;
            }
            if (c10 >= 3398 && c10 <= 3400) {
                return true;
            }
            if ((c10 >= 3402 && c10 <= 3405) || c10 == 3415 || c10 == 3633) {
                return true;
            }
            if (c10 >= 3636 && c10 <= 3642) {
                return true;
            }
            if ((c10 >= 3655 && c10 <= 3662) || c10 == 3761) {
                return true;
            }
            if (c10 >= 3764 && c10 <= 3769) {
                return true;
            }
            if (c10 >= 3771 && c10 <= 3772) {
                return true;
            }
            if (c10 >= 3784 && c10 <= 3789) {
                return true;
            }
            if ((c10 >= 3864 && c10 <= 3865) || c10 == 3893 || c10 == 3895 || c10 == 3897 || c10 == 3902 || c10 == 3903) {
                return true;
            }
            if (c10 >= 3953 && c10 <= 3972) {
                return true;
            }
            if (c10 >= 3974 && c10 <= 3979) {
                return true;
            }
            if ((c10 >= 3984 && c10 <= 3989) || c10 == 3991) {
                return true;
            }
            if (c10 >= 3993 && c10 <= 4013) {
                return true;
            }
            if ((c10 >= 4017 && c10 <= 4023) || c10 == 4025) {
                return true;
            }
            if ((c10 >= 8400 && c10 <= 8412) || c10 == 8417) {
                return true;
            }
            if ((c10 >= 12330 && c10 <= 12335) || c10 == 12441 || c10 == 12442) {
                return true;
            }
        }
        if (c10 < 183) {
            return false;
        }
        if (c10 == 183 || c10 == 720 || c10 == 721 || c10 == 903 || c10 == 1600 || c10 == 3654) {
            return true;
        }
        if (c10 >= 12337 && c10 <= 12341) {
            return true;
        }
        if (c10 < 12445 || c10 > 12446) {
            return c10 >= 12540 && c10 <= 12542;
        }
        return true;
    }

    public final a a() throws IOException {
        if (this.f68064c == null) {
            this.f68064c = i();
        }
        a aVar = this.f68064c;
        this.f68064c = null;
        return aVar;
    }

    public final a e() throws IOException {
        if (this.f68064c == null) {
            this.f68064c = i();
        }
        return this.f68064c;
    }

    public final int f() throws IOException {
        char[] cArr = this.f68068g;
        if (cArr != null) {
            return cArr[this.f68069h];
        }
        if (this.f68065d == 0) {
            int iH = h();
            this.f68065d = iH;
            StreamInfo streamInfo = this.f68062a;
            streamInfo.f68075d++;
            if (iH == 10) {
                streamInfo.f68074c++;
                streamInfo.f68075d = 1;
            }
        }
        return this.f68065d;
    }

    public final int g() throws IOException {
        char[] cArr = this.f68068g;
        boolean z10 = this.f68067f;
        if (cArr == null) {
            if (this.f68065d == 0) {
                f();
            }
            int i10 = this.f68065d;
            this.f68065d = 0;
            if (z10) {
                System.out.print((char) i10);
            }
            return i10;
        }
        int i11 = this.f68069h;
        int i12 = i11 + 1;
        this.f68069h = i12;
        char c10 = cArr[i11];
        if (i12 >= cArr.length) {
            this.f68069h = -1;
            this.f68068g = null;
        }
        if (z10) {
            System.out.print(c10);
        }
        return c10;
    }

    public final int h() throws IOException {
        Stack stack;
        int i10 = this.f68062a.f68073b.read();
        if (i10 >= 0 || (stack = this.f68063b) == null || stack.empty()) {
            return i10;
        }
        this.f68062a.f68073b.close();
        this.f68062a = (StreamInfo) this.f68063b.pop();
        return h();
    }

    public final a i() throws IOException {
        Reader reader;
        while (true) {
            int iG = g();
            if (iG == 60) {
                int iF = f();
                if (iF != 33) {
                    if (iF != 63) {
                        return new a(f68059x);
                    }
                    g();
                    return new a(f68047k);
                }
                g();
                if (f() == 91) {
                    g();
                    return new a(B);
                }
                if (f() != 45) {
                    return new a(f68053r);
                }
                g();
                if (f() != 45) {
                    String str = this.f68062a.f68072a;
                    StringBuffer stringBuffer = new StringBuffer("Invalid character sequence <!-");
                    stringBuffer.append(g());
                    String string = stringBuffer.toString();
                    StreamInfo streamInfo = this.f68062a;
                    throw new DTDParseException(str, string, streamInfo.f68074c, streamInfo.f68075d);
                }
                g();
                StringBuffer stringBuffer2 = new StringBuffer();
                while (f() >= 0) {
                    if (f() != 45) {
                        stringBuffer2.append((char) g());
                    } else {
                        g();
                        if (f() < 0) {
                            String str2 = this.f68062a.f68072a;
                            StringBuffer stringBuffer3 = new StringBuffer("Unterminated comment: <!--");
                            stringBuffer3.append(stringBuffer2.toString());
                            String string2 = stringBuffer3.toString();
                            StreamInfo streamInfo2 = this.f68062a;
                            throw new DTDParseException(str2, string2, streamInfo2.f68074c, streamInfo2.f68075d);
                        }
                        if (f() == 45) {
                            g();
                            if (f() == 62) {
                                g();
                                return new a(f68061z, stringBuffer2.toString());
                            }
                            String str3 = this.f68062a.f68072a;
                            StringBuffer stringBuffer4 = new StringBuffer("Invalid character sequence --");
                            stringBuffer4.append(g());
                            String string3 = stringBuffer4.toString();
                            StreamInfo streamInfo3 = this.f68062a;
                            throw new DTDParseException(str3, string3, streamInfo3.f68074c, streamInfo3.f68075d);
                        }
                        stringBuffer2.append('-');
                    }
                }
                String str4 = this.f68062a.f68072a;
                StringBuffer stringBuffer5 = new StringBuffer("Unterminated comment: <!--");
                stringBuffer5.append(stringBuffer2.toString());
                String string4 = stringBuffer5.toString();
                StreamInfo streamInfo4 = this.f68062a;
                throw new DTDParseException(str4, string4, streamInfo4.f68074c, streamInfo4.f68075d);
            }
            if (iG == 63) {
                return new a(f68056u);
            }
            if (iG == 34 || iG == 39) {
                StringBuffer stringBuffer6 = new StringBuffer();
                while (f() != iG) {
                    int iG2 = g();
                    if (iG2 == 92) {
                        stringBuffer6.append((char) g());
                    } else {
                        if (iG2 < 0) {
                            break;
                        }
                        stringBuffer6.append((char) iG2);
                    }
                }
                g();
                return new a(f68052q, stringBuffer6.toString());
            }
            if (iG == 40) {
                return new a(f68049n);
            }
            if (iG == 41) {
                return new a(f68050o);
            }
            if (iG == 124) {
                return new a(f68055t);
            }
            if (iG == 62) {
                return new a(f68054s);
            }
            if (iG == 61) {
                return new a(m);
            }
            if (iG == 42) {
                return new a(f68058w);
            }
            if (iG == 93) {
                if (g() != 93) {
                    String str5 = this.f68062a.f68072a;
                    StringBuffer stringBuffer7 = new StringBuffer("Illegal character in input stream: ");
                    stringBuffer7.append(iG);
                    String string5 = stringBuffer7.toString();
                    StreamInfo streamInfo5 = this.f68062a;
                    throw new DTDParseException(str5, string5, streamInfo5.f68074c, streamInfo5.f68075d);
                }
                if (g() == 62) {
                    return new a(C);
                }
                String str6 = this.f68062a.f68072a;
                StringBuffer stringBuffer8 = new StringBuffer("Illegal character in input stream: ");
                stringBuffer8.append(iG);
                String string6 = stringBuffer8.toString();
                StreamInfo streamInfo6 = this.f68062a;
                throw new DTDParseException(str6, string6, streamInfo6.f68074c, streamInfo6.f68075d);
            }
            b bVar = f68048l;
            if (iG == 35) {
                StringBuffer stringBuffer9 = new StringBuffer();
                stringBuffer9.append((char) iG);
                if (b((char) f())) {
                    stringBuffer9.append((char) g());
                    while (d((char) f())) {
                        stringBuffer9.append((char) g());
                    }
                }
                return new a(bVar, stringBuffer9.toString());
            }
            if (iG == 38 || iG == 37) {
                if (iG == 37 && Character.isWhitespace((char) f())) {
                    return new a(A);
                }
                boolean z10 = iG == 37;
                StringBuffer stringBuffer10 = new StringBuffer();
                stringBuffer10.append((char) iG);
                if (b((char) f())) {
                    stringBuffer10.append((char) g());
                    while (d((char) f())) {
                        stringBuffer10.append((char) g());
                    }
                }
                if (g() != 59) {
                    String str7 = this.f68062a.f68072a;
                    StringBuffer stringBuffer11 = new StringBuffer("Expected ';' after reference ");
                    stringBuffer11.append(stringBuffer10.toString());
                    stringBuffer11.append(", found '");
                    stringBuffer11.append(iG);
                    stringBuffer11.append("'");
                    String string7 = stringBuffer11.toString();
                    StreamInfo streamInfo7 = this.f68062a;
                    throw new DTDParseException(str7, string7, streamInfo7.f68074c, streamInfo7.f68075d);
                }
                stringBuffer10.append(';');
                if (!z10) {
                    return new a(bVar, stringBuffer10.toString());
                }
                String string8 = stringBuffer10.toString();
                String str8 = (String) this.f68070i.get(string8);
                if (str8 != null) {
                    char[] charArray = str8.toCharArray();
                    char[] cArr = this.f68068g;
                    if (cArr != null) {
                        int length = cArr.length - this.f68069h;
                        int length2 = charArray.length + length;
                        char[] cArr2 = new char[length2];
                        System.arraycopy(charArray, 0, cArr2, 0, charArray.length);
                        System.arraycopy(this.f68068g, this.f68069h, cArr2, charArray.length, length);
                        this.f68069h = 0;
                        this.f68068g = cArr2;
                        if (length2 == 0) {
                            this.f68068g = null;
                            this.f68069h = -1;
                        }
                    } else {
                        this.f68068g = charArray;
                        this.f68069h = 0;
                        if (charArray.length == 0) {
                            this.f68068g = null;
                            this.f68069h = -1;
                        }
                    }
                } else {
                    DTDEntity dTDEntityExpandEntity = this.f68071j.expandEntity(e.c(string8, 1, 1));
                    if (dTDEntityExpandEntity != null && (reader = dTDEntityExpandEntity.getReader()) != null) {
                        if (this.f68063b == null) {
                            this.f68063b = new Stack();
                        }
                        this.f68063b.push(this.f68062a);
                        this.f68062a = new StreamInfo(dTDEntityExpandEntity.getExternalId(), reader);
                    }
                }
            } else {
                if (iG == 43) {
                    return new a(f68057v);
                }
                if (iG == 44) {
                    return new a(f68051p);
                }
                char c10 = (char) iG;
                if (b(c10)) {
                    StringBuffer stringBuffer12 = new StringBuffer();
                    stringBuffer12.append(c10);
                    while (d((char) f())) {
                        stringBuffer12.append((char) g());
                    }
                    return new a(bVar, stringBuffer12.toString());
                }
                if (d(c10)) {
                    StringBuffer stringBuffer13 = new StringBuffer();
                    stringBuffer13.append(c10);
                    while (d((char) f())) {
                        stringBuffer13.append((char) g());
                    }
                    return new a(D, stringBuffer13.toString());
                }
                if (iG < 0) {
                    if (this.f68066e) {
                        throw new IOException("Read past EOF");
                    }
                    this.f68066e = true;
                    return new a(f68060y);
                }
                if (!Character.isWhitespace(c10)) {
                    String str9 = this.f68062a.f68072a;
                    StringBuffer stringBuffer14 = new StringBuffer("Illegal character in input stream: ");
                    stringBuffer14.append(iG);
                    String string9 = stringBuffer14.toString();
                    StreamInfo streamInfo8 = this.f68062a;
                    throw new DTDParseException(str9, string9, streamInfo8.f68074c, streamInfo8.f68075d);
                }
            }
        }
    }
}
