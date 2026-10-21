package com.mypinpad.tsdk.isolation;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setPivotX;", "", "", "p0", "Lcom/mypinpad/tsdk/i/getTooFewDigitsMessage;", "setY", "([B)Lcom/mypinpad/tsdk/i/getTooFewDigitsMessage;", "Lcom/mypinpad/tsdk/i/setRecyclerListener;", "Lcom/mypinpad/tsdk/i/setTypeface;", "p1", "<init>", "(Lcom/mypinpad/tsdk/i/setRecyclerListener;Lcom/mypinpad/tsdk/i/setTypeface;)V", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class setPivotX {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static char[] f60312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f60314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f60315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f60318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f60319j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setRecyclerListener f60320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTypeface f60321b;

    static {
        b();
        f60318i = 0;
        f60316g = 0;
        f60317h = 1;
        c();
        INSTANCE = new Companion(null);
        int i10 = f60316g + 105;
        f60317h = i10 % 128;
        int i11 = i10 % 2;
    }

    public setPivotX(@NotNull setRecyclerListener setrecyclerlistener, @NotNull setTypeface settypeface) {
        Intrinsics.checkNotNullParameter(setrecyclerlistener, "");
        Intrinsics.checkNotNullParameter(settypeface, "");
        this.f60320a = setrecyclerlistener;
        this.f60321b = settypeface;
    }

    public static void a(byte b10, byte b11, int i10, Object[] objArr) {
        int i11 = (i10 * 2) + 118;
        int i12 = b11 * 4;
        int i13 = 4 - (b10 * 4);
        byte[] bArr = new byte[i12 + 1];
        int i14 = -1;
        byte[] bArr2 = f60319j;
        if (bArr2 == null) {
            i13++;
            objArr = objArr;
            bArr = bArr;
            i14 = -1;
            bArr2 = bArr2;
            i11 = i12 + i11;
            i12 = i12;
        }
        while (true) {
            int i15 = i14 + 1;
            bArr[i15] = (byte) i11;
            if (i15 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i16 = i11;
            int i17 = i12;
            i13++;
            objArr = objArr;
            bArr = bArr;
            i14 = i15;
            bArr2 = bArr2;
            i11 = bArr2[i13] + i16;
            i12 = i17;
        }
    }

    public static void b() {
        f60319j = new byte[]{24, 55, -101, -128};
    }

    public static void c() {
        f60314e = true;
        f60315f = true;
        f60313d = 1794962189;
        f60312c = new char[]{62107, 62080, 62105, 62253, 62318, 62316, 62106, 62081, 62319, 62096, 62110, 62296, 62084, 62109, 62103, 62083, 62299, 62098, 62334, 62111, 62100};
    }

    public static final /* synthetic */ setTypeface setCompoundDrawableTintBlendMode(setPivotX setpivotx) {
        int i10 = f60317h;
        int i11 = i10 + 73;
        f60316g = i11 % 128;
        int i12 = i11 % 2;
        setTypeface settypeface = setpivotx.f60321b;
        int i13 = i10 + 123;
        f60316g = i13 % 128;
        int i14 = i13 % 2;
        return settypeface;
    }

    public static final /* synthetic */ setRecyclerListener setY(setPivotX setpivotx) {
        int i10 = f60316g + 19;
        f60317h = i10 % 128;
        int i11 = i10 % 2;
        setRecyclerListener setrecyclerlistener = setpivotx.f60320a;
        if (i11 != 0) {
            return setrecyclerlistener;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029c  */
    /* JADX WARN: Code duplicated, block: B:102:0x029e  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:120:0x0300  */
    /* JADX WARN: Code duplicated, block: B:122:0x030c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0312  */
    /* JADX WARN: Code duplicated, block: B:127:0x031c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0328  */
    /* JADX WARN: Code duplicated, block: B:132:0x0336 A[LOOP:3: B:115:0x02e4->B:132:0x0336, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x0346 A[LOOP:4: B:134:0x0340->B:136:0x0346, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00da  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0131 A[Catch: all -> 0x0188, TryCatch #0 {all -> 0x0188, blocks: (B:68:0x0117, B:72:0x016c, B:71:0x0131, B:79:0x0192, B:83:0x01ee, B:90:0x0225, B:94:0x0286, B:93:0x0241, B:82:0x01ab), top: B:141:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x018d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ab A[Catch: all -> 0x0188, TryCatch #0 {all -> 0x0188, blocks: (B:68:0x0117, B:72:0x016c, B:71:0x0131, B:79:0x0192, B:83:0x01ee, B:90:0x0225, B:94:0x0286, B:93:0x0241, B:82:0x01ab), top: B:141:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0201  */
    /* JADX WARN: Code duplicated, block: B:89:0x020f  */
    /* JADX WARN: Code duplicated, block: B:92:0x023c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0241 A[Catch: all -> 0x0188, TryCatch #0 {all -> 0x0188, blocks: (B:68:0x0117, B:72:0x016c, B:71:0x0131, B:79:0x0192, B:83:0x01ee, B:90:0x0225, B:94:0x0286, B:93:0x0241, B:82:0x01ab), top: B:141:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0298  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v4 int) = (r1v3 int), (r1v51 int) binds: [B:8:0x001d, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @NotNull
    public static getTooFewDigitsMessage setY(@NotNull byte[] p4) throws Throwable {
        int length;
        int i10;
        char c10;
        int i11;
        char[] cArr;
        int i12;
        String str;
        byte b10;
        char c11;
        char c12;
        byte b11;
        String strTrimEnd;
        int i13;
        char[] charArray;
        byte[] bArr;
        int i14;
        int iMax;
        int i15;
        int i16;
        int i17;
        int i18;
        char c13;
        byte b12;
        Iterator<Integer> it;
        int i19;
        int i20;
        byte[] bytes;
        setZ setz;
        char[] cArr2;
        Map map;
        Object method;
        int iIntValue;
        char[] cArr3;
        int i21;
        int i22;
        Map map2;
        Object method2;
        int length2;
        char[] cArr4;
        int i23;
        Map map3;
        Object method3;
        int i24;
        int i25 = f60316g + 105;
        f60317h = i25 % 128;
        if (i25 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p4, "");
            length = p4.length;
            if (3 <= length) {
                if (length <= 10) {
                    i10 = 1;
                    c10 = '0';
                    i11 = 0;
                    if (p4.length == 0) {
                        i24 = f60317h + 67;
                        f60316g = i24 % 128;
                        if (i24 % 2 == 0) {
                            throw null;
                        }
                        str = "";
                    } else {
                        cArr = new char[p4.length << 1];
                        for (i12 = 0; i12 < p4.length; i12++) {
                            byte b13 = p4[i12];
                            int i26 = i12 << 1;
                            b10 = (byte) ((b13 >>> 4) & 15);
                            c11 = '1';
                            switch (b10) {
                                case 0:
                                    c12 = '0';
                                    break;
                                case 1:
                                    c12 = '1';
                                    break;
                                case 2:
                                    c12 = '2';
                                    break;
                                case 3:
                                    c12 = '3';
                                    break;
                                case 4:
                                    c12 = '4';
                                    break;
                                case 5:
                                    c12 = '5';
                                    break;
                                case 6:
                                    c12 = '6';
                                    break;
                                case 7:
                                    c12 = '7';
                                    break;
                                case 8:
                                    c12 = '8';
                                    break;
                                case 9:
                                    c12 = '9';
                                    break;
                                case 10:
                                    c12 = 'a';
                                    break;
                                case 11:
                                    c12 = 'b';
                                    break;
                                case 12:
                                    c12 = 'c';
                                    break;
                                case 13:
                                    c12 = 'd';
                                    break;
                                case 14:
                                    c12 = 'e';
                                    break;
                                case 15:
                                    c12 = 'f';
                                    break;
                                default:
                                    throw new IllegalArgumentException(String.valueOf((int) b10));
                            }
                            cArr[i26] = c12;
                            int i27 = i26 + 1;
                            b11 = (byte) (b13 & 15);
                            switch (b11) {
                                case 0:
                                    c11 = '0';
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    c11 = '2';
                                    break;
                                case 3:
                                    c11 = '3';
                                    break;
                                case 4:
                                    c11 = '4';
                                    break;
                                case 5:
                                    c11 = '5';
                                    break;
                                case 6:
                                    c11 = '6';
                                    break;
                                case 7:
                                    c11 = '7';
                                    break;
                                case 8:
                                    c11 = '8';
                                    break;
                                case 9:
                                    c11 = '9';
                                    break;
                                case 10:
                                    c11 = 'a';
                                    break;
                                case 11:
                                    c11 = 'b';
                                    break;
                                case 12:
                                    c11 = 'c';
                                    break;
                                case 13:
                                    c11 = 'd';
                                    break;
                                case 14:
                                    c11 = 'e';
                                    break;
                                case 15:
                                    c11 = 'f';
                                    break;
                                default:
                                    throw new IllegalArgumentException(String.valueOf((int) b11));
                            }
                            cArr[i27] = c11;
                        }
                        str = new String(cArr);
                    }
                    strTrimEnd = StringsKt__StringsKt.trimEnd(str, 'f');
                    i13 = 16;
                    if (strTrimEnd == null) {
                        charArray = strTrimEnd.toCharArray();
                        Intrinsics.checkNotNullExpressionValue(charArray, "");
                        bArr = new byte[16];
                        i14 = 0;
                        while (i14 < 16) {
                            i19 = f60317h + 121;
                            f60316g = i19 % 128;
                            if (i19 % 2 != 0) {
                                bArr[i14] = 0;
                            } else {
                                bArr[i14] = 0;
                                i14++;
                            }
                        }
                        bArr[0] = (byte) ((((byte) Math.max(0, charArray.length - 12)) << 4) & 240);
                        iMax = Math.max(0, 12 - charArray.length);
                        i15 = 1;
                        while (true) {
                            i16 = i15 + 1;
                            i17 = i15 >> 1;
                            if (i15 < iMax + 1) {
                                int i28 = f60316g + 17;
                                f60317h = i28 % 128;
                                int i29 = i28 % 2;
                                b12 = 0;
                            } else if (i15 < charArray.length + iMax + 1) {
                                i18 = f60317h + 37;
                                f60316g = i18 % 128;
                                if (i18 % 2 != 0) {
                                    c13 = charArray[i15 / iMax];
                                } else {
                                    c13 = charArray[(i15 - 1) - iMax];
                                }
                                b12 = (byte) c13;
                            }
                            if (i15 % 2 == 0) {
                                bArr[i17] = (byte) (((byte) ((b12 << 4) & 240)) | bArr[i17]);
                            } else {
                                bArr[i17] = (byte) (((byte) (b12 & 15)) | bArr[i17]);
                            }
                            if (i16 >= 32) {
                                i15 = i16;
                            }
                        }
                        it = ArraysKt___ArraysKt.getIndices(charArray).iterator();
                        while (it.hasNext()) {
                            charArray[((IntIterator) it).nextInt()] = (char) Random.INSTANCE.nextInt();
                        }
                        return new getTooFewDigitsMessage(bArr);
                    }
                    i20 = 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    bytes = "\u0092\u0081\u0095\u0094\u0088\u0093\u0091\u0092\u0081\u0086\u0083\u0091\u0086\u0090\u0086\u008f\u0084\u008a\u008e\u008d\u0088\u0084\u0083\u0083\u0082\u0081\u008c\u0081\u0087\u0081\u0084\u0087\u0088\u0084\u0088\u008b\u0086\u0085\u0084\u008a\u0089\u0084\u0088\u0087\u0081\u0081\u0086\u0085\u0084\u0083\u0083\u0082\u0081".getBytes("ISO-8859-1");
                    setz = new setZ();
                    cArr2 = f60312c;
                    if (cArr2 != null) {
                        length2 = cArr2.length;
                        cArr4 = new char[length2];
                        i23 = 0;
                        while (i23 < length2) {
                            try {
                                Object[] objArr = new Object[i10];
                                objArr[i11] = Integer.valueOf(cArr2[i23]);
                                map3 = setTextScaleX.setMaxEms;
                                method3 = map3.get(1129500232);
                                if (method3 != null) {
                                    Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getKeyRepeatTimeout() >> i13) + 26288), 63 - ImageFormat.getBitsPerPixel(i11), TextUtils.indexOf("", c10, i11) + 1596);
                                    byte b14 = (byte) i11;
                                    byte b15 = b14;
                                    Object[] objArr2 = new Object[1];
                                    a(b14, b15, b15, objArr2);
                                    method3 = cls.getMethod((String) objArr2[0], Integer.TYPE);
                                    map3.put(1129500232, method3);
                                }
                                cArr4[i23] = ((Character) ((Method) method3).invoke(null, objArr)).charValue();
                                i23++;
                                cArr2 = cArr2;
                                i13 = 16;
                                i10 = 1;
                                c10 = '0';
                                i11 = 0;
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th2;
                            }
                        }
                        cArr2 = cArr4;
                    }
                    Object[] objArr3 = {Integer.valueOf(f60313d)};
                    map = setTextScaleX.setMaxEms;
                    method = map.get(1019674483);
                    if (method != null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10744), (ViewConfiguration.getScrollBarSize() >> 8) + 43, 566 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        byte b16 = (byte) 0;
                        byte b17 = (byte) (b16 + 1);
                        Object[] objArr4 = new Object[1];
                        a(b16, (byte) (b17 - 1), b17, objArr4);
                        method = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                        map.put(1019674483, method);
                    }
                    iIntValue = ((Integer) ((Method) method).invoke(null, objArr3)).intValue();
                    if (f60315f) {
                        if (f60314e) {
                            throw null;
                        }
                        throw null;
                    }
                    int length3 = bytes.length;
                    setz.setOnFocusChangeListener = length3;
                    cArr3 = new char[length3];
                    setz.setDividerPadding = 0;
                    while (true) {
                        i21 = setz.setDividerPadding;
                        i22 = setz.setOnFocusChangeListener;
                        if (i21 < i22) {
                            throw new NullPointerException(n1.f(cArr3));
                        }
                        int i30 = f60318i + 101;
                        int i31 = i30 % 128;
                        int i32 = i30 % 2;
                        cArr3[i21] = (char) (cArr2[bytes[(i22 - 1) - i21] + i20] - iIntValue);
                        Object[] objArr5 = {setz, setz};
                        map2 = setTextScaleX.setMaxEms;
                        method2 = map2.get(-1539766653);
                        if (method2 != null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) View.combineMeasuredStates(0, 0), 51 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 2881);
                            byte b18 = (byte) 0;
                            byte b19 = (byte) (b18 + 2);
                            Object[] objArr6 = new Object[1];
                            a(b18, (byte) (b19 - 2), b19, objArr6);
                            method2 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                            map2.put(-1539766653, method2);
                        }
                        ((Method) method2).invoke(null, objArr5);
                        iIntValue = iIntValue;
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(p4, "");
            length = p4.length;
            if (6 <= length) {
                if (length <= 10) {
                    i10 = 1;
                    c10 = '0';
                    i11 = 0;
                    if (p4.length == 0) {
                        i24 = f60317h + 67;
                        f60316g = i24 % 128;
                        if (i24 % 2 == 0) {
                            throw null;
                        }
                        str = "";
                    } else {
                        cArr = new char[p4.length << 1];
                        while (i12 < p4.length) {
                            byte b110 = p4[i12];
                            int i210 = i12 << 1;
                            b10 = (byte) ((b110 >>> 4) & 15);
                            c11 = '1';
                            switch (b10) {
                                case 0:
                                    c12 = '0';
                                    break;
                                case 1:
                                    c12 = '1';
                                    break;
                                case 2:
                                    c12 = '2';
                                    break;
                                case 3:
                                    c12 = '3';
                                    break;
                                case 4:
                                    c12 = '4';
                                    break;
                                case 5:
                                    c12 = '5';
                                    break;
                                case 6:
                                    c12 = '6';
                                    break;
                                case 7:
                                    c12 = '7';
                                    break;
                                case 8:
                                    c12 = '8';
                                    break;
                                case 9:
                                    c12 = '9';
                                    break;
                                case 10:
                                    c12 = 'a';
                                    break;
                                case 11:
                                    c12 = 'b';
                                    break;
                                case 12:
                                    c12 = 'c';
                                    break;
                                case 13:
                                    c12 = 'd';
                                    break;
                                case 14:
                                    c12 = 'e';
                                    break;
                                case 15:
                                    c12 = 'f';
                                    break;
                                default:
                                    throw new IllegalArgumentException(String.valueOf((int) b10));
                            }
                            cArr[i210] = c12;
                            int i211 = i210 + 1;
                            b11 = (byte) (b110 & 15);
                            switch (b11) {
                                case 0:
                                    c11 = '0';
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    c11 = '2';
                                    break;
                                case 3:
                                    c11 = '3';
                                    break;
                                case 4:
                                    c11 = '4';
                                    break;
                                case 5:
                                    c11 = '5';
                                    break;
                                case 6:
                                    c11 = '6';
                                    break;
                                case 7:
                                    c11 = '7';
                                    break;
                                case 8:
                                    c11 = '8';
                                    break;
                                case 9:
                                    c11 = '9';
                                    break;
                                case 10:
                                    c11 = 'a';
                                    break;
                                case 11:
                                    c11 = 'b';
                                    break;
                                case 12:
                                    c11 = 'c';
                                    break;
                                case 13:
                                    c11 = 'd';
                                    break;
                                case 14:
                                    c11 = 'e';
                                    break;
                                case 15:
                                    c11 = 'f';
                                    break;
                                default:
                                    throw new IllegalArgumentException(String.valueOf((int) b11));
                            }
                            cArr[i211] = c11;
                        }
                        str = new String(cArr);
                    }
                    strTrimEnd = StringsKt__StringsKt.trimEnd(str, 'f');
                    i13 = 16;
                    if (strTrimEnd == null) {
                        charArray = strTrimEnd.toCharArray();
                        Intrinsics.checkNotNullExpressionValue(charArray, "");
                        bArr = new byte[16];
                        i14 = 0;
                        while (i14 < 16) {
                            i19 = f60317h + 121;
                            f60316g = i19 % 128;
                            if (i19 % 2 != 0) {
                                bArr[i14] = 0;
                            } else {
                                bArr[i14] = 0;
                                i14++;
                            }
                        }
                        bArr[0] = (byte) ((((byte) Math.max(0, charArray.length - 12)) << 4) & 240);
                        iMax = Math.max(0, 12 - charArray.length);
                        i15 = 1;
                        while (true) {
                            i16 = i15 + 1;
                            i17 = i15 >> 1;
                            if (i15 < iMax + 1) {
                                int i212 = f60316g + 17;
                                f60317h = i212 % 128;
                                int i213 = i212 % 2;
                                b12 = 0;
                            } else if (i15 < charArray.length + iMax + 1) {
                                i18 = f60317h + 37;
                                f60316g = i18 % 128;
                                if (i18 % 2 != 0) {
                                    c13 = charArray[i15 / iMax];
                                } else {
                                    c13 = charArray[(i15 - 1) - iMax];
                                }
                                b12 = (byte) c13;
                            }
                            if (i15 % 2 == 0) {
                                bArr[i17] = (byte) (((byte) ((b12 << 4) & 240)) | bArr[i17]);
                            } else {
                                bArr[i17] = (byte) (((byte) (b12 & 15)) | bArr[i17]);
                            }
                            if (i16 >= 32) {
                                i15 = i16;
                            }
                        }
                        it = ArraysKt___ArraysKt.getIndices(charArray).iterator();
                        while (it.hasNext()) {
                            charArray[((IntIterator) it).nextInt()] = (char) Random.INSTANCE.nextInt();
                        }
                        return new getTooFewDigitsMessage(bArr);
                    }
                    i20 = 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    bytes = "\u0092\u0081\u0095\u0094\u0088\u0093\u0091\u0092\u0081\u0086\u0083\u0091\u0086\u0090\u0086\u008f\u0084\u008a\u008e\u008d\u0088\u0084\u0083\u0083\u0082\u0081\u008c\u0081\u0087\u0081\u0084\u0087\u0088\u0084\u0088\u008b\u0086\u0085\u0084\u008a\u0089\u0084\u0088\u0087\u0081\u0081\u0086\u0085\u0084\u0083\u0083\u0082\u0081".getBytes("ISO-8859-1");
                    setz = new setZ();
                    cArr2 = f60312c;
                    if (cArr2 != null) {
                        length2 = cArr2.length;
                        cArr4 = new char[length2];
                        i23 = 0;
                        while (i23 < length2) {
                            Object[] objArr7 = new Object[i10];
                            objArr7[i11] = Integer.valueOf(cArr2[i23]);
                            map3 = setTextScaleX.setMaxEms;
                            method3 = map3.get(1129500232);
                            if (method3 != null) {
                                Class cls4 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getKeyRepeatTimeout() >> i13) + 26288), 63 - ImageFormat.getBitsPerPixel(i11), TextUtils.indexOf("", c10, i11) + 1596);
                                byte b111 = (byte) i11;
                                byte b112 = b111;
                                Object[] objArr8 = new Object[1];
                                a(b111, b112, b112, objArr8);
                                method3 = cls4.getMethod((String) objArr8[0], Integer.TYPE);
                                map3.put(1129500232, method3);
                            }
                            cArr4[i23] = ((Character) ((Method) method3).invoke(null, objArr7)).charValue();
                            i23++;
                            cArr2 = cArr2;
                            i13 = 16;
                            i10 = 1;
                            c10 = '0';
                            i11 = 0;
                        }
                        cArr2 = cArr4;
                    }
                    Object[] objArr9 = {Integer.valueOf(f60313d)};
                    map = setTextScaleX.setMaxEms;
                    method = map.get(1019674483);
                    if (method != null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10744), (ViewConfiguration.getScrollBarSize() >> 8) + 43, 566 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        byte b113 = (byte) 0;
                        byte b114 = (byte) (b113 + 1);
                        Object[] objArr10 = new Object[1];
                        a(b113, (byte) (b114 - 1), b114, objArr10);
                        method = cls5.getMethod((String) objArr10[0], Integer.TYPE);
                        map.put(1019674483, method);
                    }
                    iIntValue = ((Integer) ((Method) method).invoke(null, objArr9)).intValue();
                    if (f60315f) {
                        if (f60314e) {
                            throw null;
                        }
                        throw null;
                    }
                    int length4 = bytes.length;
                    setz.setOnFocusChangeListener = length4;
                    cArr3 = new char[length4];
                    setz.setDividerPadding = 0;
                    while (true) {
                        i21 = setz.setDividerPadding;
                        i22 = setz.setOnFocusChangeListener;
                        if (i21 < i22) {
                            throw new NullPointerException(n1.f(cArr3));
                        }
                        int i33 = f60318i + 101;
                        int i34 = i33 % 128;
                        int i35 = i33 % 2;
                        cArr3[i21] = (char) (cArr2[bytes[(i22 - 1) - i21] + i20] - iIntValue);
                        Object[] objArr11 = {setz, setz};
                        map2 = setTextScaleX.setMaxEms;
                        method2 = map2.get(-1539766653);
                        if (method2 != null) {
                            Class cls6 = (Class) setTextScaleX.setX((char) View.combineMeasuredStates(0, 0), 51 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 2881);
                            byte b115 = (byte) 0;
                            byte b116 = (byte) (b115 + 2);
                            Object[] objArr12 = new Object[1];
                            a(b115, (byte) (b116 - 2), b116, objArr12);
                            method2 = cls6.getMethod((String) objArr12[0], Object.class, Object.class);
                            map2.put(-1539766653, method2);
                        }
                        ((Method) method2).invoke(null, objArr11);
                        iIntValue = iIntValue;
                    }
                }
            }
        }
        throw new getBeepVolume(p4.length);
    }
}
