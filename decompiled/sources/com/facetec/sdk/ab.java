package com.facetec.sdk;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
final class ab extends aj {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f40197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f40198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f40199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f40200e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f40201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f40202h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f40203j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f40204a;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f40201g = 0;
        f40202h = 1;
        c();
        e();
        Process.getThreadPriority(0);
        TextUtils.lastIndexOf("", '0');
        TextUtils.lastIndexOf("", '0');
        int i10 = f40201g + 87;
        f40202h = i10 % 128;
        int i11 = i10 % 2;
    }

    public ab(byte[] bArr) throws Exception {
        Object[] objArr = new Object[1];
        f((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, "�\u000b\ufff9", 2 - (Process.myPid() >> 22), Gravity.getAbsoluteGravity(0, 0) + 82, false, objArr);
        this.f40204a = new SecretKeySpec(bArr, ((String) objArr[0]).intern());
    }

    public static void c() {
        f40198c = new char[]{35630, 35623, 35634, 35690, 35624, 35626, 35629, 35665, 35647, 35633, 35632, 35619, 35627, 35638, 35617, 35637, 35636};
        f40200e = -401307004;
        f40197b = true;
        f40203j = true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0232  */
    /* JADX WARN: Code duplicated, block: B:51:0x0233  */
    private static void f(int i10, String str, int i11, int i12, boolean z10, Object[] objArr) throws Throwable {
        char c10;
        Throwable cause;
        char[] charArray = str != null ? str.toCharArray() : str;
        gz gzVar = new gz();
        char[] cArr = new char[i10];
        gzVar.f41846c = 0;
        while (true) {
            int i13 = gzVar.f41846c;
            c10 = '0';
            if (i13 >= i10) {
                break;
            }
            char c11 = charArray[i13];
            gzVar.f41844a = c11;
            char c12 = (char) (i12 + c11);
            cArr[i13] = c12;
            try {
                Object[] objArr2 = {Integer.valueOf(c12), Integer.valueOf(f40199d)};
                Map map = bp.f40694x;
                Object method = map.get(1917901234);
                if (method == null) {
                    Class cls = (Class) bp.a(23 - Color.alpha(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 1026, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 38452));
                    byte b10 = (byte) 0;
                    Object[] objArr3 = new Object[1];
                    k((byte) 19, b10, b10, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(1917901234, method);
                }
                cArr[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {gzVar, gzVar};
                Object method2 = map.get(-1709307603);
                if (method2 == null) {
                    Class cls3 = (Class) bp.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 24, 765 - (Process.myPid() >> 22), (char) (36774 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                    byte b11 = (byte) 0;
                    Object[] objArr5 = new Object[1];
                    k((byte) 14, b11, b11, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1709307603, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                int i14 = $11 + 93;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        if (i11 > 0) {
            int i16 = $11 + 27;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            gzVar.f41845b = i11;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i18 = gzVar.f41845b;
            System.arraycopy(cArr2, 0, cArr, i10 - i18, i18);
            int i19 = gzVar.f41845b;
            System.arraycopy(cArr2, i19, cArr, 0, i10 - i19);
        }
        if (!(!z10)) {
            char[] cArr3 = new char[i10];
            gzVar.f41846c = 0;
            while (true) {
                int i20 = gzVar.f41846c;
                if (i20 >= i10) {
                    break;
                }
                int i21 = $10 + 31;
                $11 = i21 % 128;
                if (i21 % 2 == 0) {
                    cArr3[i20] = cArr[(i10 << i20) - 1];
                    Object[] objArr6 = {gzVar, gzVar};
                    Map map2 = bp.f40694x;
                    Object method3 = map2.get(-1709307603);
                    if (method3 == null) {
                        Class cls4 = (Class) bp.a(TextUtils.indexOf("", c10) + 25, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 765, (char) (36773 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                        byte b12 = (byte) 0;
                        Object[] objArr7 = new Object[1];
                        k((byte) 14, b12, b12, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(-1709307603, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                } else {
                    cArr3[i20] = cArr[(i10 - i20) - 1];
                    Object[] objArr8 = {gzVar, gzVar};
                    Map map3 = bp.f40694x;
                    Object method4 = map3.get(-1709307603);
                    if (method4 == null) {
                        Class cls5 = (Class) bp.a(24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 766 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (36774 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        byte b13 = (byte) 0;
                        Object[] objArr9 = new Object[1];
                        k((byte) 14, b13, b13, objArr9);
                        method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                        map3.put(-1709307603, method4);
                    }
                    ((Method) method4).invoke(null, objArr8);
                    c10 = '0';
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    private static void i(String str, int[] iArr, int i10, String str2, Object[] objArr) throws Throwable {
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        gs gsVar = new gs();
        char[] cArr = f40198c;
        long j10 = 0;
        int i11 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i11] = Integer.valueOf(cArr[i12]);
                    Map map = bp.f40694x;
                    Object method = map.get(-1869190227);
                    if (method == null) {
                        Class cls = (Class) bp.a(25 - (SystemClock.uptimeMillis() > j10 ? 1 : (SystemClock.uptimeMillis() == j10 ? 0 : -1)), 1387 - Color.red(i11), (char) (ViewConfiguration.getJumpTapTimeout() >> 16));
                        byte b10 = (byte) i11;
                        Object[] objArr3 = new Object[1];
                        k((byte) 8, b10, b10, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-1869190227, method);
                    }
                    cArr2[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i12++;
                    j10 = 0;
                    i11 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f40200e)};
        Map map2 = bp.f40694x;
        Object method2 = map2.get(-1521609240);
        if (method2 == null) {
            Class cls2 = (Class) bp.a(31 - View.resolveSizeAndState(0, 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 1238, (char) (Color.rgb(0, 0, 0) + 16795035));
            byte length2 = (byte) $$a.length;
            byte b11 = (byte) (length2 - 4);
            Object[] objArr5 = new Object[1];
            k(length2, b11, b11, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(-1521609240, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        int i13 = 52007;
        int i14 = 1178884533;
        if (f40203j) {
            int length3 = bArr.length;
            gsVar.f41825d = length3;
            char[] cArr3 = new char[length3];
            gsVar.f41824b = 0;
            while (true) {
                int i15 = gsVar.f41824b;
                int i16 = gsVar.f41825d;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i15] = (char) (cArr[bArr[(i16 - 1) - i15] + i10] - iIntValue);
                Object[] objArr6 = {gsVar, gsVar};
                Map map3 = bp.f40694x;
                Object method3 = map3.get(Integer.valueOf(i14));
                if (method3 == null) {
                    Class cls3 = (Class) bp.a(23 - (ViewConfiguration.getFadingEdgeLength() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 1364, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + i13));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr7 = new Object[1];
                    k(b12, b13, b13, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map3.put(1178884533, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i13 = 52007;
                i14 = 1178884533;
            }
        } else if (f40197b) {
            int length4 = charArray.length;
            gsVar.f41825d = length4;
            char[] cArr4 = new char[length4];
            gsVar.f41824b = 0;
            while (true) {
                int i17 = gsVar.f41824b;
                int i18 = gsVar.f41825d;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i17] = (char) (cArr[charArray[(i18 - 1) - i17] - i10] - iIntValue);
                Object[] objArr8 = {gsVar, gsVar};
                Map map4 = bp.f40694x;
                Object method4 = map4.get(1178884533);
                if (method4 == null) {
                    Class cls4 = (Class) bp.a(22 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1363, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 52007));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr9 = new Object[1];
                    k(b14, b15, b15, objArr9);
                    method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(1178884533, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
        } else {
            int i19 = 0;
            int length5 = iArr.length;
            gsVar.f41825d = length5;
            char[] cArr5 = new char[length5];
            while (true) {
                gsVar.f41824b = i19;
                int i20 = gsVar.f41824b;
                int i21 = gsVar.f41825d;
                if (i20 >= i21) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i20] = (char) (cArr[iArr[(i21 - 1) - i20] - i10] - iIntValue);
                    i19 = i20 + 1;
                }
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{116, 81, 40, -24};
        $$b = 64;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void k(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 120 - r7
            byte[] r0 = com.facetec.sdk.ab.$$a
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r9 = r9 * 3
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r5 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L32
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L32:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r9 + 1
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ab.k(int, byte, int, java.lang.Object[]):void");
    }

    public final byte[] b(byte[] bArr) throws Throwable {
        try {
            byte[] bArrD = aj.d();
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrD);
            Object[] objArr = new Object[1];
            f(20 - TextUtils.getCapsMode("", 0, 0), "\ufff3\u0019 \u001b\u0016\u0016\u0013\u0002\uffe7\u0005\ufff5�\u0002￡\ufff5\ufff4\ufff5￡\u0005\ufff7", 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 88, true, objArr);
            Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
            try {
                cipher.init(1, this.f40204a, ivParameterSpec);
                byte[] bArrC = aj.c(cipher, bArr);
                byte[] bArr2 = new byte[bArrC.length + bArrD.length];
                int length = bArrD.length;
                int i10 = f40202h + 19;
                f40201g = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr2 = {bArrD, 0, bArr2, 0, Integer.valueOf(length)};
                    Object[] objArr3 = new Object[1];
                    i(null, null, 127 - (KeyEvent.getMaxKeyCode() >> 16), "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    i(null, null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0089\u0091\u0090\u008f\u0089\u0082\u008e\u008e\u0082", objArr4);
                    String str = (String) objArr4[0];
                    Class<?> cls2 = Integer.TYPE;
                    cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr2);
                    int length2 = bArrD.length;
                    int length3 = bArrC.length;
                    int i12 = f40201g + 125;
                    f40202h = i12 % 128;
                    int i13 = i12 % 2;
                    try {
                        Object[] objArr5 = {bArrC, 0, bArr2, Integer.valueOf(length2), Integer.valueOf(length3)};
                        Object[] objArr6 = new Object[1];
                        i(null, null, 127 - View.resolveSize(0, 0), "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr6);
                        Class<?> cls3 = Class.forName((String) objArr6[0]);
                        Object[] objArr7 = new Object[1];
                        i(null, null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u0089\u0091\u0090\u008f\u0089\u0082\u008e\u008e\u0082", objArr7);
                        cls3.getMethod((String) objArr7[0], Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr5);
                        return bArr2;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    public final byte[] e(byte[] bArr) throws Exception {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrCopyOfRange);
        Object[] objArr = new Object[1];
        f(TextUtils.indexOf((CharSequence) "", '0') + 21, "\ufff3\u0019 \u001b\u0016\u0016\u0013\u0002\uffe7\u0005\ufff5�\u0002￡\ufff5\ufff4\ufff5￡\u0005\ufff7", 1 - TextUtils.getCapsMode("", 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 88, true, objArr);
        Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
        cipher.init(2, this.f40204a, ivParameterSpec);
        byte[] bArrE = aj.e(cipher, bArrCopyOfRange2);
        int i10 = f40201g + 15;
        f40202h = i10 % 128;
        int i11 = i10 % 2;
        return bArrE;
    }

    public static void e() {
        f40199d = -1817348530;
    }
}
