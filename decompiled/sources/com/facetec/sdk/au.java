package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.PointF;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class au {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f40406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f40407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<String, Long> f40408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f40409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f40410e;

    static {
        init$0();
        e();
        f40408c = new HashMap<>();
    }

    private static String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("__S");
        return sb2.toString();
    }

    public static void b(@NonNull String str) {
        if (!f40408c.containsKey(a(str)) || f40408c.containsKey(e(str))) {
            return;
        }
        HashMap<String, Long> map = f40408c;
        String strE = e(str);
        try {
            Object[] objArr = new Object[1];
            f(null, null, TextUtils.lastIndexOf("", '0') + 128, "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(null, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u008c\u008d\u0090\u008f\u008e\u0086\u0082\u0086", objArr2);
            map.put(strE, Long.valueOf(((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue()));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void c(@NonNull String str) {
        f40408c.remove(a(str));
        f40408c.remove(e(str));
        HashMap<String, Long> map = f40408c;
        String strA = a(str);
        try {
            Object[] objArr = new Object[1];
            f(null, null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(null, null, KeyEvent.normalizeMetaState(0) + 127, "\u008c\u008d\u0090\u008f\u008e\u0086\u0082\u0086", objArr2);
            map.put(strA, Long.valueOf(((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue()));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static long d(@NonNull String str) throws Throwable {
        long jLongValue = f40408c.containsKey(a(str)) ? f40408c.get(a(str)).longValue() : -1L;
        long jLongValue2 = f40408c.containsKey(e(str)) ? f40408c.get(e(str)).longValue() : -1L;
        if (jLongValue == -1) {
            return 0L;
        }
        if (jLongValue2 != -1) {
            return jLongValue2 - jLongValue;
        }
        try {
            Object[] objArr = new Object[1];
            f(null, null, TextUtils.getOffsetBefore("", 0) + 127, "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(null, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u008c\u008d\u0090\u008f\u008e\u0086\u0082\u0086", objArr2);
            return ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() - jLongValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static String e(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("__E");
        return sb2.toString();
    }

    private static void f(String str, int[] iArr, int i10, String str2, Object[] objArr) throws Throwable {
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        gs gsVar = new gs();
        char[] cArr = f40406a;
        long j10 = 0;
        int i11 = 1;
        int i12 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = new Object[i11];
                    objArr2[i12] = Integer.valueOf(cArr[i13]);
                    Map map = bp.f40694x;
                    Object method = map.get(-1869190227);
                    if (method == null) {
                        Class cls = (Class) bp.a(24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1386 - (ExpandableListView.getPackedPositionForChild(i12, i12) > j10 ? 1 : (ExpandableListView.getPackedPositionForChild(i12, i12) == j10 ? 0 : -1)), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(i12, i12, i12)));
                        byte b10 = (byte) i12;
                        byte b11 = (byte) (b10 + 2);
                        Object[] objArr3 = new Object[1];
                        g(b10, b11, (byte) (b11 - 2), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-1869190227, method);
                    }
                    cArr2[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13++;
                    cArr = cArr;
                    j10 = 0;
                    i11 = 1;
                    i12 = 0;
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
        Object[] objArr4 = {Integer.valueOf(f40407b)};
        Map map2 = bp.f40694x;
        Object method2 = map2.get(-1521609240);
        if (method2 == null) {
            Class cls2 = (Class) bp.a((-16777185) - Color.rgb(0, 0, 0), 1238 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (17819 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
            byte b12 = (byte) 0;
            byte b13 = (byte) (b12 + 1);
            Object[] objArr5 = new Object[1];
            g(b12, b13, (byte) (b13 - 1), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(-1521609240, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        int i14 = 52007;
        int i15 = 1178884533;
        int i16 = 2;
        if (f40410e) {
            int length2 = bArr.length;
            gsVar.f41825d = length2;
            char[] cArr3 = new char[length2];
            gsVar.f41824b = 0;
            while (true) {
                int i17 = gsVar.f41824b;
                int i18 = gsVar.f41825d;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i17] = (char) (cArr[bArr[(i18 - 1) - i17] + i10] - iIntValue);
                Object[] objArr6 = new Object[i16];
                objArr6[1] = gsVar;
                objArr6[0] = gsVar;
                Map map3 = bp.f40694x;
                Object method3 = map3.get(Integer.valueOf(i15));
                if (method3 == null) {
                    Class cls3 = (Class) bp.a(TextUtils.getOffsetBefore("", 0) + 23, TextUtils.indexOf((CharSequence) "", '0', 0) + 1365, (char) (TextUtils.indexOf("", "", 0, 0) + i14));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    g(b14, b15, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map3.put(1178884533, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i14 = 52007;
                i15 = 1178884533;
                i16 = 2;
            }
        } else {
            int i19 = 0;
            if (f40409d) {
                int length3 = charArray.length;
                gsVar.f41825d = length3;
                char[] cArr4 = new char[length3];
                gsVar.f41824b = 0;
                while (true) {
                    int i20 = gsVar.f41824b;
                    int i21 = gsVar.f41825d;
                    if (i20 >= i21) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i20] = (char) (cArr[charArray[(i21 - 1) - i20] - i10] - iIntValue);
                    Object[] objArr8 = {gsVar, gsVar};
                    Map map4 = bp.f40694x;
                    Object method4 = map4.get(1178884533);
                    if (method4 == null) {
                        Class cls4 = (Class) bp.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 23, ExpandableListView.getPackedPositionChild(0L) + 1365, (char) (52007 - Color.red(0)));
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        Object[] objArr9 = new Object[1];
                        g(b16, b17, b17, objArr9);
                        method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                        map4.put(1178884533, method4);
                    }
                    ((Method) method4).invoke(null, objArr8);
                }
            } else {
                int length4 = iArr.length;
                gsVar.f41825d = length4;
                char[] cArr5 = new char[length4];
                while (true) {
                    gsVar.f41824b = i19;
                    int i22 = gsVar.f41824b;
                    int i23 = gsVar.f41825d;
                    if (i22 >= i23) {
                        objArr[0] = new String(cArr5);
                        return;
                    } else {
                        cArr5[i22] = (char) (cArr[iArr[(i23 - 1) - i22] - i10] - iIntValue);
                        i19 = i22 + 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(short r8, int r9, byte r10, java.lang.Object[] r11) {
        /*
            int r9 = r9 * 4
            int r9 = 120 - r9
            byte[] r0 = com.facetec.sdk.au.$$a
            int r10 = r10 * 3
            int r10 = r10 + 1
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = new byte[r10]
            r2 = 0
            if (r0 != 0) goto L1a
            r9 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r11
            r11 = r10
            goto L35
        L1a:
            r3 = r2
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r10) goto L2a
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r2)
            r11[r2] = r8
            return
        L2a:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = r11
            r11 = r10
            r10 = r3
            r3 = r1
            r1 = r0
            r0 = r7
        L35:
            int r8 = r8 + r10
            int r9 = r9 + 1
            r10 = r11
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.au.g(short, int, byte, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{124, -25, -92, -48};
        $$b = 77;
    }

    public static void e() {
        f40406a = new char[]{35687, 35484, 35691, 35491, 35681, 35683, 35482, 35470, 35700, 35694, 35689, 35480, 35680, 35682, 35465, 35684};
        f40407b = -401306883;
        f40409d = true;
        f40410e = true;
    }
}
