package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class gg implements gk {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f41773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Integer> f41774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f41775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f41776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f41777e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char[] f41778g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f41779j;

    static {
        init$0();
        e();
        HashMap map = new HashMap();
        Object[] objArr = new Object[1];
        f(127 - Color.red(0), null, null, "\u008d\u008c\u008b\u008a\u0089\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        map.put((String) objArr[0], 4);
        Object[] objArr2 = new Object[1];
        f(Color.rgb(0, 0, 0) + 16777343, null, null, "\u0081\u0090\u0089\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u008f\u0085\u0083\u0089\u008e\u0081\u0082", objArr2);
        map.put((String) objArr2[0], 0);
        Object[] objArr3 = new Object[1];
        h((byte) (KeyEvent.keyCodeFromString("") + 13), "\b\u0006\u0004\u000b\u0012\b\u0018\u000e\u0007\u0014\u0016\u0004\r\u0002\u0002\u0006\u0015\u0012\u0005\u0018\u0001\u0005\b\r\u000e\b", 26 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
        map.put((String) objArr3[0], 7);
        Object[] objArr4 = new Object[1];
        h((byte) (40 - ImageFormat.getBitsPerPixel(0)), "\t\u000f㘠", 2 - MotionEvent.axisFromString(""), objArr4);
        map.put((String) objArr4[0], 11);
        Object[] objArr5 = new Object[1];
        h((byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29), "\b\u0006\u0004\u000b\u0012\b\u0018\u000e\u0007\u0014\u0010\u0015㘇㘇\b\u0000\u000e\u000b㘜", Drawable.resolveOpacity(0, 0) + 19, objArr5);
        map.put((String) objArr5[0], 3);
        Object[] objArr6 = new Object[1];
        h((byte) (48 - TextUtils.indexOf("", "", 0)), "\t\u000f㘥", (ViewConfiguration.getFadingEdgeLength() >> 16) + 3, objArr6);
        map.put((String) objArr6[0], 9);
        Object[] objArr7 = new Object[1];
        h((byte) (18 - TextUtils.lastIndexOf("", '0', 0)), "\b\u0006\u0004\u000b\u0012\b\u0018\u000e\u0007\u0014\f\u0005", 12 - KeyEvent.keyCodeFromString(""), objArr7);
        map.put((String) objArr7[0], 10);
        Object[] objArr8 = new Object[1];
        h((byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 87), "\u000f\u0015\u0017\u0000\u0016\u000f\u0011\u000f\u0010\u0004\u000b\u0013", 12 - View.resolveSizeAndState(0, 0, 0), objArr8);
        map.put((String) objArr8[0], 6);
        Object[] objArr9 = new Object[1];
        h((byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 119), "\t\u0018\b\u0012", Color.green(0) + 4, objArr9);
        map.put((String) objArr9[0], 5);
        Object[] objArr10 = new Object[1];
        f(Color.alpha(0) + 127, null, null, "\u0081\u0090\u0085\u0086\u0082\u0087\u0087\u008d\u008e\u0088\u0085\u008d\u0093\u0092\u0092\u0086\u0091\u0085\u008d", objArr10);
        map.put((String) objArr10[0], 2);
        Object[] objArr11 = new Object[1];
        h((byte) (ImageFormat.getBitsPerPixel(0) + 107), "\u0013\u000f", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, objArr11);
        map.put((String) objArr11[0], 1);
        Object[] objArr12 = new Object[1];
        f(TextUtils.indexOf("", "", 0, 0) + 127, null, null, "\u0087\u0084\u0083\u0088", objArr12);
        map.put((String) objArr12[0], 8);
        f41774b = map;
    }

    public static void e() {
        f41773a = new char[]{35484, 35483, 35475, 35481, 35686, 35681, 35693, 35692, 35485, 35468, 35691, 35680, 35487, 35469, 35516, 35515, 35682, 35684, 35687};
        f41777e = -401306896;
        f41776d = true;
        f41775c = true;
        f41778g = new char[]{25176, 25152, 25169, 25166, 25163, 25160, 25186, 25157, 25172, 25173, 25192, 25202, 25165, 25167, 25158, 25183, 25156, 25196, 25159, 25170, 25171, 25164, 25154, 25203, 25204};
        f41779j = (char) 22462;
    }

    private static void f(int i10, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        gs gsVar = new gs();
        char[] cArr = f41773a;
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
                        Class cls = (Class) bp.a(23 - MotionEvent.axisFromString(""), 1386 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b10 = (byte) i11;
                        Object[] objArr3 = new Object[1];
                        i((byte) ($$b & 26), b10, b10, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-1869190227, method);
                    }
                    cArr2[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i12++;
                    cArr = cArr;
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
        Object[] objArr4 = {Integer.valueOf(f41777e)};
        Map map2 = bp.f40694x;
        Object method2 = map2.get(-1521609240);
        float f6 = 0.0f;
        if (method2 == null) {
            Class cls2 = (Class) bp.a((ViewConfiguration.getPressedStateDuration() >> 16) + 31, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1239, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17819));
            byte length2 = (byte) $$a.length;
            byte b11 = (byte) (length2 - 4);
            Object[] objArr5 = new Object[1];
            i(length2, b11, b11, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(-1521609240, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        int i13 = 52007;
        int i14 = 1178884533;
        int i15 = 2;
        if (f41775c) {
            int length3 = bArr.length;
            gsVar.f41825d = length3;
            char[] cArr3 = new char[length3];
            gsVar.f41824b = 0;
            while (true) {
                int i16 = gsVar.f41824b;
                int i17 = gsVar.f41825d;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i16] = (char) (cArr[bArr[(i17 - 1) - i16] + i10] - iIntValue);
                Object[] objArr6 = {gsVar, gsVar};
                Map map3 = bp.f40694x;
                Object method3 = map3.get(Integer.valueOf(i14));
                if (method3 == null) {
                    Class cls3 = (Class) bp.a(24 - (ViewConfiguration.getScrollFriction() > f6 ? 1 : (ViewConfiguration.getScrollFriction() == f6 ? 0 : -1)), 1364 - ExpandableListView.getPackedPositionGroup(0L), (char) (KeyEvent.normalizeMetaState(0) + i13));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr7 = new Object[1];
                    i(b12, b13, b13, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map3.put(1178884533, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i13 = 52007;
                f6 = 0.0f;
                i14 = 1178884533;
            }
        } else if (f41776d) {
            int length4 = charArray.length;
            gsVar.f41825d = length4;
            char[] cArr4 = new char[length4];
            gsVar.f41824b = 0;
            while (true) {
                int i18 = gsVar.f41824b;
                int i19 = gsVar.f41825d;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i18] = (char) (cArr[charArray[(i19 - 1) - i18] - i10] - iIntValue);
                Object[] objArr8 = new Object[i15];
                objArr8[1] = gsVar;
                objArr8[0] = gsVar;
                Map map4 = bp.f40694x;
                Object method4 = map4.get(1178884533);
                if (method4 == null) {
                    Class cls4 = (Class) bp.a(23 - KeyEvent.getDeadChar(0, 0), 1364 - Color.blue(0), (char) (52007 - TextUtils.getOffsetAfter("", 0)));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr9 = new Object[1];
                    i(b14, b15, b15, objArr9);
                    String str4 = (String) objArr9[0];
                    i15 = 2;
                    method4 = cls4.getMethod(str4, Object.class, Object.class);
                    map4.put(1178884533, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
        } else {
            int i20 = 0;
            int length5 = iArr.length;
            gsVar.f41825d = length5;
            char[] cArr5 = new char[length5];
            while (true) {
                gsVar.f41824b = i20;
                int i21 = gsVar.f41824b;
                int i22 = gsVar.f41825d;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i21] = (char) (cArr[iArr[(i22 - 1) - i21] - i10] - iIntValue);
                    i20 = i21 + 1;
                }
            }
        }
    }

    private static void h(byte b10, String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        char[] charArray = str != null ? str.toCharArray() : str;
        gv gvVar = new gv();
        char[] cArr = f41778g;
        char c10 = '0';
        int i12 = -324767611;
        int i13 = 6;
        int i14 = 1;
        int i15 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = new Object[i14];
                    objArr2[i15] = Integer.valueOf(cArr[i16]);
                    Map map = bp.f40694x;
                    Object method = map.get(Integer.valueOf(i12));
                    if (method == null) {
                        Class cls = (Class) bp.a('H' - AndroidCharacter.getMirror(c10), 1411 - ((Process.getThreadPriority(i15) + 20) >> i13), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)));
                        byte b11 = (byte) i15;
                        Object[] objArr3 = new Object[1];
                        i((byte) 15, b11, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-324767611, method);
                    }
                    cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16++;
                    c10 = '0';
                    i12 = -324767611;
                    i13 = 6;
                    i14 = 1;
                    i15 = 0;
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
        Object[] objArr4 = {Integer.valueOf(f41779j)};
        Map map2 = bp.f40694x;
        Object method2 = map2.get(-324767611);
        if (method2 == null) {
            Class cls2 = (Class) bp.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, 1410 - TextUtils.indexOf((CharSequence) "", '0'), (char) TextUtils.getTrimmedLength(""));
            byte b12 = (byte) 0;
            Object[] objArr5 = new Object[1];
            i((byte) 15, b12, b12, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(-324767611, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            gvVar.f41832e = 0;
            while (true) {
                int i17 = gvVar.f41832e;
                if (i17 >= i11) {
                    break;
                }
                char c11 = charArray[i17];
                gvVar.f41829b = c11;
                char c12 = charArray[i17 + 1];
                gvVar.f41831d = c12;
                if (c11 == c12) {
                    cArr3[i17] = (char) (c11 - b10);
                    cArr3[i17 + 1] = (char) (c12 - b10);
                } else {
                    Object[] objArr6 = {gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(-779085347);
                    if (method3 == null) {
                        Class cls3 = (Class) bp.a(23 - ExpandableListView.getPackedPositionType(0L), 720 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0));
                        byte b13 = (byte) 0;
                        Object[] objArr7 = new Object[1];
                        i((byte) ($$b & 27), b13, b13, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(-779085347, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i18 = gvVar.f41833g;
                    if (iIntValue == i18) {
                        Object[] objArr8 = {gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, Integer.valueOf(cCharValue), gvVar};
                        Object method4 = map3.get(531504056);
                        if (method4 == null) {
                            Class cls5 = (Class) bp.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, 221 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod("l", Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(531504056, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i19 = (gvVar.f41828a * cCharValue) + gvVar.f41833g;
                        int i20 = gvVar.f41832e;
                        cArr3[i20] = cArr[iIntValue2];
                        cArr3[i20 + 1] = cArr[i19];
                    } else {
                        int i21 = gvVar.f41830c;
                        int i22 = gvVar.f41828a;
                        if (i21 == i22) {
                            int iA = androidx.activity.a.a(gvVar.f41834j, cCharValue, 1, cCharValue);
                            gvVar.f41834j = iA;
                            int iA2 = androidx.activity.a.a(i18, cCharValue, 1, cCharValue);
                            gvVar.f41833g = iA2;
                            int i23 = (i22 * cCharValue) + iA2;
                            int i24 = gvVar.f41832e;
                            cArr3[i24] = cArr[(i21 * cCharValue) + iA];
                            cArr3[i24 + 1] = cArr[i23];
                        } else {
                            int i25 = (i21 * cCharValue) + i18;
                            int i26 = (i22 * cCharValue) + gvVar.f41834j;
                            int i27 = gvVar.f41832e;
                            cArr3[i27] = cArr[i25];
                            cArr3[i27 + 1] = cArr[i26];
                        }
                    }
                }
                gvVar.f41832e += 2;
            }
        }
        for (int i28 = 0; i28 < i10; i28++) {
            cArr3[i28] = (char) (cArr3[i28] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void i(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.facetec.sdk.gg.$$a
            int r9 = r9 * 4
            int r9 = 4 - r9
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = 120 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L31
        L18:
            r3 = r2
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L31:
            int r7 = r7 + r8
            int r8 = r10 + 1
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.gg.i(byte, int, byte, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{75, -96, -20, 12};
        $$b = 109;
    }

    @Override // com.facetec.sdk.gk
    public final int b(fz fzVar) throws Throwable {
        Integer num = f41774b.get(fzVar.i());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.facetec.sdk.gk
    public final int d(fz fzVar) throws Throwable {
        Integer num = f41774b.get(fzVar.f());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
