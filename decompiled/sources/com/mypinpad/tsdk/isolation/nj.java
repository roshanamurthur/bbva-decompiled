package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f57334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f57335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f57340g = null;

    static {
        c();
        f57338e = 0;
        f57339f = 1;
        f57336c = 0;
        f57337d = 1;
        f57335b = (char) 53952;
        f57334a = new char[]{59175};
    }

    public static void a(int i10, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = f57339f + 15;
        int i13 = i12 % 128;
        f57338e = i13;
        int i14 = 2;
        int i15 = i12 % 2;
        int i16 = i13 + 115;
        f57339f = i16 % 128;
        if (i16 % 2 == 0) {
            "㙤㙤".toCharArray();
            throw null;
        }
        char[] charArray = "㙤㙤".toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f57334a;
        int i17 = 290255894;
        int i18 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                int i20 = f57338e + 25;
                f57339f = i20 % 128;
                int i21 = i20 % i14;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i18] = Integer.valueOf(cArr[i19]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i17));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) View.MeasureSpec.makeMeasureSpec(i18, i18), Gravity.getAbsoluteGravity(i18, i18) + 45, 1116 - TextUtils.indexOf("", "", i18));
                        byte b11 = (byte) i18;
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i19++;
                    i14 = 2;
                    i17 = 290255894;
                    i18 = 0;
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
        Object[] objArr4 = {Integer.valueOf(f57335b)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        long j10 = 0;
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 45 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1117 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            byte b13 = (byte) 0;
            byte b14 = (byte) (b13 - 1);
            Object[] objArr5 = new Object[1];
            b(b13, b14, (byte) (b14 + 1), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
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
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i22 = setincludefontpadding.setDividerPadding;
                if (i22 >= i11) {
                    break;
                }
                char c10 = charArray[i22];
                setincludefontpadding.setY = c10;
                int i23 = i22 + 1;
                char c11 = charArray[i23];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    cArr3[i22] = (char) (c10 - b10);
                    cArr3[i23] = (char) (c11 - b10);
                } else {
                    Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) KeyEvent.keyCodeFromString(""), 28 - (SystemClock.uptimeMillis() > j10 ? 1 : (SystemClock.uptimeMillis() == j10 ? 0 : -1)), 2311 - (ViewConfiguration.getScrollBarSize() >> 8));
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 + 4), objArr7);
                        String str = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i24 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i24) {
                        int i25 = f57339f + 59;
                        f57338e = i25 % 128;
                        int i26 = i25 % 2;
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49103 - View.MeasureSpec.getSize(0)), 35 - (ViewConfiguration.getWindowTouchSlop() >> 8), 2545 - Gravity.getAbsoluteGravity(0, 0));
                            byte b17 = (byte) 0;
                            byte b18 = (byte) (b17 - 1);
                            Object[] objArr9 = new Object[1];
                            b(b17, b18, (byte) (b18 & 7), objArr9);
                            String str2 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i27 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i28 = setincludefontpadding.setDividerPadding;
                        cArr3[i28] = cArr[iIntValue2];
                        cArr3[i28 + 1] = cArr[i27];
                        int i29 = f57339f + 71;
                        f57338e = i29 % 128;
                        int i30 = i29 % 2;
                    } else {
                        int i31 = setincludefontpadding.setX;
                        int i32 = setincludefontpadding.setOnFocusChangeListener;
                        if (i31 == i32) {
                            int i33 = f57338e + 83;
                            f57339f = i33 % 128;
                            int i34 = i33 % 2;
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i24, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i35 = (i32 * cCharValue) + iA2;
                            int i36 = setincludefontpadding.setDividerPadding;
                            cArr3[i36] = cArr[(i31 * cCharValue) + iA];
                            cArr3[i36 + 1] = cArr[i35];
                        } else {
                            int i37 = (i31 * cCharValue) + i24;
                            int i38 = (i32 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i39 = setincludefontpadding.setDividerPadding;
                            cArr3[i39] = cArr[i37];
                            cArr3[i39 + 1] = cArr[i38];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                j10 = 0;
            }
        }
        int i40 = 0;
        while (i40 < i10) {
            cArr3[i40] = (char) (cArr3[i40] ^ 13722);
            i40++;
            int i41 = f57339f + 53;
            f57338e = i41 % 128;
            int i42 = i41 % 2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r9 = r9 + 99
            byte[] r0 = new byte[r7]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.nj.f57340g
            if (r2 != 0) goto L16
            r9 = r7
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r8
            goto L35
        L16:
            r3 = r1
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1b:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r0[r3] = r5
            if (r4 != r8) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2c:
            r3 = r2[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L35:
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.nj.b(int, short, int, java.lang.Object[]):void");
    }

    public static void c() {
        f57340g = new byte[]{49, -40, -94, -23};
    }

    @NotNull
    public static final String setX(int i10, @Nullable String str) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a(2 - Gravity.getAbsoluteGravity(0, 0), (byte) (126 - KeyEvent.keyCodeFromString("")), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(i10);
        Object[] objArr2 = new Object[1];
        a(2 - ExpandableListView.getPackedPositionType(0L), (byte) (126 - View.getDefaultSize(0, 0)), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        int i11 = f57336c + 19;
        int i12 = i11 % 128;
        f57337d = i12;
        int i13 = i11 % 2;
        if (str == null) {
            int i14 = i12 + 7;
            f57336c = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            str = "";
        }
        sb2.append(str);
        String string = sb2.toString();
        int i15 = f57337d + 109;
        f57336c = i15 % 128;
        if (i15 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
