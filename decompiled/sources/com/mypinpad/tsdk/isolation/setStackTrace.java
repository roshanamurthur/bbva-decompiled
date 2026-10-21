package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setStackTrace implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f60580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f60581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f60586i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getDisplaySymbol f60587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f60588b;

    static {
        b();
        f60584g = 0;
        f60585h = 1;
        f60582e = 0;
        f60583f = 1;
        f60581d = (char) 53957;
        f60580c = new char[]{59192, 59197, 59189, 59195, 59198, 59186, 59253, 59194, 59199, 59188, 59196, 59190, 59177, 58561, 58560, 59181};
    }

    public setStackTrace(@NotNull getDisplaySymbol getdisplaysymbol) {
        Intrinsics.checkNotNullParameter(getdisplaysymbol, "");
        this.f60587a = getdisplaysymbol;
        this.f60588b = getTransactionPortrait.setOnLongClickListener;
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
    public static void a(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r9 = 106 - r9
            byte[] r0 = new byte[r7]
            byte[] r1 = com.mypinpad.tsdk.isolation.setStackTrace.f60586i
            r2 = 0
            if (r1 != 0) goto L18
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
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r1[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L31:
            int r8 = -r8
            int r8 = r8 + r10
            int r9 = r9 + 1
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setStackTrace.a(int, byte, int, java.lang.Object[]):void");
    }

    public static void b() {
        f60586i = new byte[]{92, -124, 49, 72};
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        int i10 = f60583f + 109;
        int i11 = i10 % 128;
        f60582e = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 25;
        f60583f = i13 % 128;
        int i14 = i13 % 2;
        return this.f60588b;
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setX() throws Throwable {
        String str;
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        char c10 = 0;
        getDisplaySymbol getdisplaysymbol = this.f60587a;
        String str2 = (String) getDisplaySymbol.setY(new Object[]{getdisplaysymbol}, 1447781523, -1447781523, System.identityHashCode(getdisplaysymbol));
        int size = View.MeasureSpec.getSize(0);
        int i14 = 19 - size;
        String str3 = "";
        char trimmedLength = (byte) (TextUtils.getTrimmedLength("") + 6);
        int i15 = f60585h + 55;
        f60584g = i15 % 128;
        int i16 = i15 % 2;
        char[] charArray = "\u0001\b\n\u0007\u0006\u0003\f\u0000\r\t\n\u0004\f\u0007\u0000\n\u0006\u0001㘃".toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        int i17 = 290255894;
        char[] cArr = f60580c;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    Object[] objArr = new Object[i13];
                    objArr[c10] = Integer.valueOf(cArr[i18]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i17));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((-1) - MotionEvent.axisFromString(str3)), 45 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1116 - Color.argb(0, 0, 0, 0));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        a(b11, b10, (byte) (b11 | 7), objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i18++;
                    int i19 = f60584g + 33;
                    f60585h = i19 % 128;
                    int i20 = i19 % 2;
                    cArr = cArr;
                    str3 = str3;
                    length = length;
                    i13 = 1;
                    c10 = 0;
                    i17 = 290255894;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            str = str3;
            cArr = cArr2;
        } else {
            str = "";
        }
        Object[] objArr3 = {Integer.valueOf(f60581d)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) Color.blue(0), 45 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.getMode(0) + 1116);
            byte b12 = (byte) 0;
            byte b13 = b12;
            Object[] objArr4 = new Object[1];
            a(b13, b12, (byte) (b13 | 7), objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i14];
        if (i14 % 2 != 0) {
            i10 = 18 - size;
            cArr3[i10] = (char) (charArray[i10] - trimmedLength);
        } else {
            i10 = i14;
        }
        if (i10 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i21 = setincludefontpadding.setDividerPadding;
                if (i21 >= i10) {
                    break;
                }
                char c11 = charArray[i21];
                setincludefontpadding.setY = c11;
                int i22 = i21 + 1;
                char c12 = charArray[i22];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c12;
                if (c11 == c12) {
                    cArr3[i21] = (char) (c11 - trimmedLength);
                    cArr3[i22] = (char) (c12 - trimmedLength);
                    i10 = i10;
                    i12 = 2;
                } else {
                    Object[] objArr5 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ('0' - AndroidCharacter.getMirror('0')), 27 - ExpandableListView.getPackedPositionType(0L), 2311 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        byte b14 = (byte) 0;
                        Object[] objArr6 = new Object[1];
                        a(b14, b14, (byte) f60586i.length, objArr6);
                        String str4 = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                    int i23 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i23) {
                        int i24 = f60584g + 55;
                        f60585h = i24 % 128;
                        int i25 = i24 % 2;
                        Object[] objArr7 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49103 - View.resolveSizeAndState(0, 0, 0)), View.MeasureSpec.getSize(0) + 35, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2544);
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr8 = new Object[1];
                            a(b16, b15, b16, objArr8);
                            String str5 = (String) objArr8[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str5, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                        int i26 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i27 = setincludefontpadding.setDividerPadding;
                        cArr3[i27] = cArr[iIntValue2];
                        cArr3[i27 + 1] = cArr[i26];
                    } else {
                        int i28 = setincludefontpadding.setX;
                        int i29 = setincludefontpadding.setOnFocusChangeListener;
                        if (i28 == i29) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i23, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i30 = (i29 * cCharValue) + iA2;
                            int i31 = setincludefontpadding.setDividerPadding;
                            cArr3[i31] = cArr[(i28 * cCharValue) + iA];
                            cArr3[i31 + 1] = cArr[i30];
                        } else {
                            int i32 = (i28 * cCharValue) + i23;
                            int i33 = (i29 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i34 = setincludefontpadding.setDividerPadding;
                            cArr3[i34] = cArr[i32];
                            cArr3[i34 + 1] = cArr[i33];
                            int i35 = f60584g + 123;
                            f60585h = i35 % 128;
                            i12 = 2;
                            int i36 = i35 % 2;
                        }
                    }
                    i12 = 2;
                }
                setincludefontpadding.setDividerPadding += i12;
                i10 = i10;
            }
        }
        int i37 = 0;
        while (i37 < i14) {
            int i38 = f60584g + 73;
            f60585h = i38 % 128;
            if (i38 % 2 == 0) {
                cArr3[i37] = (char) (cArr3[i37] ^ 5453);
                i37 += 81;
            } else {
                cArr3[i37] = (char) (cArr3[i37] ^ 13722);
                i37++;
            }
        }
        if (Intrinsics.areEqual(str2, new String(cArr3).intern())) {
            int i39 = f60583f + 97;
            f60582e = i39 % 128;
            int i40 = i39 % 2;
            return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
        }
        if (str2 == null) {
            int i41 = f60582e + 101;
            f60583f = i41 % 128;
            i11 = 2;
            if (i41 % 2 == 0) {
                throw null;
            }
            str2 = str;
        } else {
            i11 = 2;
        }
        Object[] objArr9 = new Object[i11];
        objArr9[0] = this;
        objArr9[1] = str2;
        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(objArr9, 728146901, -728146899, (int) System.currentTimeMillis());
        int i42 = f60583f + 109;
        f60582e = i42 % 128;
        if (i42 % 2 == 0) {
            return setautosizetexttypeuniformwithpresetsizes;
        }
        throw null;
    }
}
