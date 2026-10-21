package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class ew {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f41498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f41499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f41500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f41501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f41502e;

    static {
        init$0();
        b();
        try {
            Object[] objArr = new Object[1];
            f("\ueda6璭奋갥덊㾂䖚糠➄㙼ୃƅ闪憎\u1756ꙿ", 16 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f("獷장峓㲷鰴\uf7faज़퐗̭큲柨㸶", Drawable.resolveOpacity(0, 0) + 11, objArr2);
            String str = (String) cls.getMethod((String) objArr2[0], String.class).invoke(null, "java.version");
            int iA = a(str);
            if (iA == -1) {
                iA = c(str);
            }
            if (iA == -1) {
                iA = 6;
            }
            f41499b = iA;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static int a(String str) {
        try {
            String[] strArrSplit = str.split("[._]");
            int i10 = Integer.parseInt(strArrSplit[0]);
            return (i10 != 1 || strArrSplit.length <= 1) ? i10 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static void b() {
        f41498a = (char) 56643;
        f41502e = (char) 26527;
        f41501d = (char) 22462;
        f41500c = (char) 46958;
    }

    private static int c(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb2.append(cCharAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean e() {
        return f41499b >= 9;
    }

    private static void f(String str, int i10, Object[] objArr) throws Throwable {
        char c10;
        char[] charArray = str != null ? str.toCharArray() : str;
        gu guVar = new gu();
        char[] cArr = new char[charArray.length];
        int i11 = 0;
        guVar.f41827b = 0;
        char c11 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i12 = guVar.f41827b;
            if (i12 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[i11] = charArray[i12];
            cArr2[1] = charArray[i12 + 1];
            int i13 = 58224;
            int i14 = i11;
            while (i14 < 16) {
                char c12 = cArr2[1];
                char c13 = cArr2[i11];
                int i15 = (c13 + i13) ^ ((c13 << 4) + ((char) (((long) f41501d) ^ (-6773320768317835938L))));
                int i16 = c13 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f41500c);
                    objArr2[c11] = Integer.valueOf(i16);
                    objArr2[1] = Integer.valueOf(i15);
                    objArr2[0] = Integer.valueOf(c12);
                    Map map = bp.f40694x;
                    Object method = map.get(753387582);
                    if (method == null) {
                        Class cls = (Class) bp.a(24 - Color.red(0), 1119 - Color.argb(0, 0, 0, 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        g(b10, b11, (byte) (b11 + 1), objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(753387582, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i13) ^ ((cCharValue << 4) + ((char) (((long) f41498a) ^ (-6773320768317835938L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f41502e)};
                    Object method2 = map.get(753387582);
                    if (method2 == null) {
                        Class cls3 = (Class) bp.a(24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1119, (char) KeyEvent.normalizeMetaState(0));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        g(b12, b13, (byte) (b13 + 1), objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(753387582, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i13 -= 40503;
                    i14++;
                    i11 = 0;
                    c11 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i17 = guVar.f41827b;
            cArr[i17] = cArr2[0];
            cArr[i17 + 1] = cArr2[1];
            Object[] objArr6 = {guVar, guVar};
            Map map2 = bp.f40694x;
            Object method3 = map2.get(52059537);
            if (method3 != null) {
                c10 = 2;
            } else {
                Class cls5 = (Class) bp.a((ViewConfiguration.getScrollBarSize() >> 8) + 24, TextUtils.indexOf("", "", 0) + 435, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 10110));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                g(b14, b15, b15, objArr7);
                c10 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(52059537, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            c11 = c10;
            i11 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.facetec.sdk.ew.$$a
            int r9 = r9 * 2
            int r9 = 71 - r9
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L1b
            r9 = r8
            r3 = r1
            r4 = r2
            r8 = r7
            r1 = r0
            r0 = r10
            r10 = r9
            goto L36
        L1b:
            r3 = r2
        L1c:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2b:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L36:
            int r7 = -r7
            int r9 = r9 + r7
            r7 = r8
            r8 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ew.g(short, byte, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{65, 127, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 113};
        $$b = 72;
    }

    public static int c() {
        return f41499b;
    }
}
