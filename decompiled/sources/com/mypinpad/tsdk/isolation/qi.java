package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class qi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f57870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f57871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f57872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f57873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f57877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f57878i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f57879j = 0;

    static {
        c();
        f57876g = 0;
        f57877h = 1;
        f57874e = 0;
        f57875f = 1;
        f57873d = (char) 18948;
        f57872c = (char) 17097;
        f57870a = (char) 34404;
        f57871b = (char) 11793;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12;
        int i13 = f57877h + 77;
        f57876g = i13 % 128;
        int i14 = 2;
        if (i13 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i15 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i16 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[i15] = charArray[i16];
            cArr2[1] = charArray[i16 + 1];
            int i17 = 58224;
            int i18 = i15;
            while (true) {
                i11 = f57879j;
                if (i18 >= 16) {
                    break;
                }
                int i19 = f57876g + 53;
                f57877h = i19 % 128;
                int i20 = i19 % i14;
                char c10 = cArr2[1];
                char c11 = cArr2[i15];
                setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled2 = setalwaysdrawnwithcacheenabled;
                int i21 = (c11 + i17) ^ ((c11 << 4) + ((char) (((long) f57872c) ^ 4333817592127744003L)));
                int i22 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f57873d);
                    objArr2[i14] = Integer.valueOf(i22);
                    objArr2[1] = Integer.valueOf(i21);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Color.rgb(0, 0, 0) + 16825750), (ViewConfiguration.getWindowTouchSlop() >> 8) + 47, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2671);
                        byte b10 = (byte) (i11 - 4);
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b11, b11, b10, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) f57870a) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f57871b)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 48534), TextUtils.indexOf((CharSequence) "", '0') + 48, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2672);
                        byte b12 = (byte) (i11 - 4);
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b13, b13, b12, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i17 -= 40503;
                    i18++;
                    setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled2;
                    i14 = 2;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled3 = setalwaysdrawnwithcacheenabled;
            int i23 = setalwaysdrawnwithcacheenabled3.setOnFocusChangeListener;
            cArr[i23] = cArr2[0];
            cArr[i23 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled3, setalwaysdrawnwithcacheenabled3};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i12 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 37 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf("", "") + 2145);
                byte b14 = (byte) (i11 - 4);
                byte b15 = (byte) (b14 + 1);
                Object[] objArr7 = new Object[1];
                b(b15, (byte) (b15 - 1), b14, objArr7);
                i12 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled3;
            i14 = i12;
            i15 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r6 = r6 * 2
            int r6 = r6 + 103
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.qi.f57878i
            if (r2 != 0) goto L1c
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L37
        L1c:
            r3 = r1
        L1d:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r2[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L37:
            int r6 = r6 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qi.b(byte, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        f57878i = new byte[]{82, -15, 113, 17};
        f57879j = 4;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    public static final boolean setX(@Nullable Pair<String, Integer> pair, @Nullable Pair<String, Integer> pair2) throws Throwable {
        boolean z10;
        Integer second;
        Integer second2;
        int i10 = f57875f + 31;
        f57874e = i10 % 128;
        int i11 = i10 % 2;
        if (Intrinsics.areEqual(pair != null ? pair.getFirst() : null, pair2 != null ? pair2.getFirst() : null)) {
            if (pair != null) {
                int i12 = f57875f + 59;
                f57874e = i12 % 128;
                if (i12 % 2 != 0) {
                    pair.getSecond();
                    throw null;
                }
                second = pair.getSecond();
            } else {
                second = null;
            }
            if (pair2 != null) {
                int i13 = f57875f + 115;
                f57874e = i13 % 128;
                if (i13 % 2 != 0) {
                    pair2.getSecond();
                    throw null;
                }
                second2 = pair2.getSecond();
            } else {
                second2 = null;
            }
            if (Intrinsics.areEqual(second, second2)) {
                z10 = false;
            } else {
                int i14 = f57874e + 91;
                f57875f = i14 % 128;
                int i15 = i14 % 2;
                z10 = true;
            }
        } else {
            int i16 = f57874e + 91;
            f57875f = i16 % 128;
            int i17 = i16 % 2;
            z10 = true;
        }
        if (z10) {
            mr mrVar = mr.getAmountFieldTextColor;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a("⮷骛쫆츬諃ᷠ쏀ﱳ奦蕍ㆾ㮋\ue116搬\udb86䦨虢攪窣\uf345\udef0\ude9b䊏胍\udccb삲\ue116搬틎Ż裺簹\u1bfa喯", Gravity.getAbsoluteGravity(0, 0) + 33, objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(pair2 != null ? pair2.getFirst() : null);
            Object[] objArr2 = new Object[1];
            a("㮛缩䇲厜裺簹\u1bfa喯", 7 - ExpandableListView.getPackedPositionType(0L), objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(pair2 != null ? pair2.getSecond() : null);
            mt.setX(new Object[]{mrVar, sb2.toString()}, -225944049, 225944051, (int) System.currentTimeMillis());
        }
        int i18 = f57874e + 21;
        f57875f = i18 % 128;
        int i19 = i18 % 2;
        return z10;
    }
}
