package com.facetec.sdk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class k {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f41960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f41961b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f41962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f41963e;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f41960a = 0;
        f41962d = 1;
        f41961b = new char[]{25152, 25171, 25017, 25157, 25019, 25160, 25170, 25016, 25186, 25164, 25159, 25158, 25018, 25176, 25173, 25169, 25154, 25165, 25167, 25177, 25188, 25156, 25103, 25166, 25161};
        f41963e = (char) 22462;
    }

    private static Method a() {
        int i10 = f41962d + 113;
        f41960a = i10 % 128;
        int i11 = i10 % 2;
        Method method = null;
        try {
            Object[] objArr = new Object[1];
            f(36 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0012\u0015\u0007\u0018\u0015\u0006\u0001\u0005\u0016\u0013\u000e\n\u0006\u000f\u0007\u0015\u0003\u000f\u0004\u0002\u0014\b\u0002\u0017\u0006\u0003\u0001\u0005\u0016\u0013\u000e\n\u0006\u000f㗻", (byte) (18 - Color.alpha(0)), objArr);
            Class<?> cls = Class.forName(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            f((ViewConfiguration.getPressedStateDuration() >> 16) + 12, "\u0012\u0016\n\u0015\u000f\u0011\u0014\u0010\n\t\u0003\u0017", (byte) (6 - KeyEvent.normalizeMetaState(0)), objArr2);
            method = cls.getMethod(((String) objArr2[0]).intern(), Throwable.class);
            int i12 = f41962d + 21;
            f41960a = i12 % 128;
            int i13 = i12 % 2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
        return method;
    }

    public static void c(Throwable th2) {
        int i10 = f41962d + 85;
        f41960a = i10 % 128;
        int i11 = i10 % 2;
        String strD = bg.d((Context) null);
        if (strD != null) {
            Object[] objArr = new Object[1];
            f(TextUtils.getTrimmedLength("") + 12, "\u0012\u0015\u0007\u0018\u000f\u0005\u0015\u0001\u000b\u0018\u0011\u0015", (byte) (122 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr);
            if (strD.startsWith(((String) objArr[0]).intern())) {
                int i12 = f41960a;
                int i13 = i12 + 97;
                f41962d = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = i12 + 61;
                    f41962d = i14 % 128;
                    if (i14 % 2 == 0) {
                        a();
                        throw null;
                    }
                    Method methodA = a();
                    if (methodA != null) {
                        try {
                            methodA.invoke(null, th2);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        Log.getStackTraceString(th2);
        int i15 = f41962d + 89;
        f41960a = i15 % 128;
        int i16 = i15 % 2;
    }

    private static void f(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        char[] charArray;
        int i11;
        int i12 = $10;
        int i13 = i12 + 61;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            int i14 = i12 + 33;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        gv gvVar = new gv();
        char[] cArr2 = f41961b;
        long j10 = 0;
        int i15 = -324767611;
        int i16 = 3;
        int i17 = 0;
        int i18 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = new Object[i18];
                    objArr2[i17] = Integer.valueOf(cArr2[i19]);
                    Map map = bp.f40694x;
                    Object method = map.get(Integer.valueOf(i15));
                    if (method == null) {
                        Class cls = (Class) bp.a(24 - ExpandableListView.getPackedPositionType(j10), 1412 - (ViewConfiguration.getZoomControlsTimeout() > j10 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j10 ? 0 : -1)), (char) TextUtils.getCapsMode("", i17, i17));
                        byte b11 = (byte) ($$b & i16);
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[1];
                        g(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-324767611, method);
                    }
                    cArr3[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i19++;
                    j10 = 0;
                    i15 = -324767611;
                    i16 = 3;
                    i17 = 0;
                    i18 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f41963e)};
        Map map2 = bp.f40694x;
        Object method2 = map2.get(-324767611);
        if (method2 == null) {
            Class cls2 = (Class) bp.a(24 - (ViewConfiguration.getPressedStateDuration() >> 16), 1411 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            byte b13 = (byte) ($$b & 3);
            byte b14 = (byte) (b13 - 1);
            Object[] objArr5 = new Object[1];
            g(b13, b14, b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(-324767611, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr4[i11] = (char) (cArr[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            gvVar.f41832e = 0;
            int i20 = $11 + 85;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            while (true) {
                int i22 = gvVar.f41832e;
                if (i22 >= i11) {
                    break;
                }
                char c10 = cArr[i22];
                gvVar.f41829b = c10;
                char c11 = cArr[i22 + 1];
                gvVar.f41831d = c11;
                if (c10 == c11) {
                    cArr4[i22] = (char) (c10 - b10);
                    cArr4[i22 + 1] = (char) (c11 - b10);
                } else {
                    Object[] objArr6 = {gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(-779085347);
                    if (method3 == null) {
                        Class cls3 = (Class) bp.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, Process.getGidForName("") + 720, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        g(b15, b16, b16, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(-779085347, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i23 = gvVar.f41833g;
                    if (iIntValue == i23) {
                        Object[] objArr8 = {gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, Integer.valueOf(cCharValue), gvVar};
                        Object method4 = map3.get(531504056);
                        if (method4 == null) {
                            Class cls5 = (Class) bp.a(24 - (Process.myPid() >> 22), ExpandableListView.getPackedPositionType(0L) + 221, (char) Drawable.resolveOpacity(0, 0));
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod("l", Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(531504056, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i24 = (gvVar.f41828a * cCharValue) + gvVar.f41833g;
                        int i25 = gvVar.f41832e;
                        cArr4[i25] = cArr2[iIntValue2];
                        cArr4[i25 + 1] = cArr2[i24];
                    } else {
                        int i26 = gvVar.f41830c;
                        int i27 = gvVar.f41828a;
                        if (i26 == i27) {
                            int iA = androidx.activity.a.a(gvVar.f41834j, cCharValue, 1, cCharValue);
                            gvVar.f41834j = iA;
                            int iA2 = androidx.activity.a.a(i23, cCharValue, 1, cCharValue);
                            gvVar.f41833g = iA2;
                            int i28 = (i27 * cCharValue) + iA2;
                            int i29 = gvVar.f41832e;
                            cArr4[i29] = cArr2[(i26 * cCharValue) + iA];
                            cArr4[i29 + 1] = cArr2[i28];
                        } else {
                            int i30 = (i26 * cCharValue) + i23;
                            int i31 = (i27 * cCharValue) + gvVar.f41834j;
                            int i32 = gvVar.f41832e;
                            cArr4[i32] = cArr2[i30];
                            cArr4[i32 + 1] = cArr2[i31];
                        }
                    }
                }
                gvVar.f41832e += 2;
            }
        }
        int i33 = $11 + 123;
        $10 = i33 % 128;
        int i34 = i33 % 2;
        for (int i35 = 0; i35 < i10; i35++) {
            cArr4[i35] = (char) (cArr4[i35] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r6 = r6 * 6
            int r6 = 111 - r6
            byte[] r0 = com.facetec.sdk.k.$$a
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L1a
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L34
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L34:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.k.g(byte, byte, short, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{71, 33, 15, 78};
        $$b = 85;
    }
}
