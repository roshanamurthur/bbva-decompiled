package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setTitle implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f60710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f60711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f60716i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f60717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f60718b;

    static {
        c();
        f60714g = 0;
        f60715h = 1;
        f60712e = 0;
        f60713f = 1;
        f60711d = (char) 53952;
        f60710c = new char[]{59242};
    }

    public setTitle(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f60717a = context;
        this.f60718b = getTransactionPortrait.setIncludeFontPadding;
    }

    public static void a(int i10, byte b10, Object[] objArr) throws Throwable {
        int i11;
        char c10;
        char[] charArray = "㗵".toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f60710c;
        int i12 = 290255894;
        int i13 = 0;
        if (cArr != null) {
            int i14 = f60714g + 23;
            f60715h = i14 % 128;
            int i15 = i14 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i13] = Integer.valueOf(cArr[i16]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i12));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) Color.alpha(i13), TextUtils.indexOf("", "", i13) + 45, (KeyEvent.getMaxKeyCode() >> 16) + 1116);
                        byte b11 = (byte) i13;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16++;
                    i12 = 290255894;
                    i13 = 0;
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
        Object[] objArr4 = {Integer.valueOf(f60711d)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        char c11 = 6;
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 45, 1116 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            b(b13, b14, b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i17 = f60715h + 27;
            f60714g = i17 % 128;
            int i18 = i17 % 2;
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            int i19 = f60714g + 71;
            f60715h = i19 % 128;
            int i20 = i19 % 2;
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i21 = setincludefontpadding.setDividerPadding;
                if (i21 >= i11) {
                    break;
                }
                char c12 = charArray[i21];
                setincludefontpadding.setY = c12;
                int i22 = i21 + 1;
                char c13 = charArray[i22];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c13;
                if (c12 == c13) {
                    int i23 = f60714g + 111;
                    f60715h = i23 % 128;
                    if (i23 % 2 == 0) {
                        cArr3[i21] = (char) (c12 % b10);
                        cArr3[i21 - 1] = (char) (c13 >>> b10);
                    } else {
                        cArr3[i21] = (char) (c12 - b10);
                        cArr3[i22] = (char) (c13 - b10);
                    }
                    c10 = c11;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = setincludefontpadding;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = setincludefontpadding;
                    objArr6[9] = setincludefontpadding;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = setincludefontpadding;
                    objArr6[c11] = setincludefontpadding;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = setincludefontpadding;
                    objArr6[3] = setincludefontpadding;
                    objArr6[2] = Integer.valueOf(cCharValue);
                    objArr6[1] = setincludefontpadding;
                    objArr6[0] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getEdgeSlop() >> 16), 27 - TextUtils.getOffsetBefore("", 0), (KeyEvent.getMaxKeyCode() >> 16) + 2311);
                        byte b15 = f60716i[2];
                        Object[] objArr7 = new Object[1];
                        b((byte) 0, b15, (byte) (b15 - 3), objArr7);
                        String str = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i24 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i24) {
                        int i25 = f60714g + 63;
                        f60715h = i25 % 128;
                        int i26 = i25 % 2;
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 != null) {
                            c10 = 6;
                        } else {
                            Class cls5 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49102), 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2546 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                            byte b16 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            b(b16, (byte) (b16 | 7), b16, objArr9);
                            String str2 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            c10 = 6;
                            method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i27 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i28 = setincludefontpadding.setDividerPadding;
                        cArr3[i28] = cArr[iIntValue2];
                        cArr3[i28 + 1] = cArr[i27];
                        int i29 = f60715h + 69;
                        f60714g = i29 % 128;
                        int i30 = i29 % 2;
                    } else {
                        c10 = 6;
                        int i31 = setincludefontpadding.setX;
                        int i32 = setincludefontpadding.setOnFocusChangeListener;
                        if (i31 == i32) {
                            int i33 = f60714g + 113;
                            f60715h = i33 % 128;
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
                c11 = c10;
            }
        }
        for (int i40 = 0; i40 < i10; i40++) {
            cArr3[i40] = (char) (cArr3[i40] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static void b(byte b10, int i10, short s4, Object[] objArr) {
        int i11 = (b10 * 4) + 4;
        int i12 = i10 + 99;
        int i13 = s4 * 2;
        byte[] bArr = new byte[i13 + 1];
        byte[] bArr2 = f60716i;
        int i14 = -1;
        if (bArr2 == null) {
            i11++;
            i12 += i13;
            i13 = i13;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = -1;
        }
        while (true) {
            int i15 = i14 + 1;
            bArr[i15] = (byte) i12;
            if (i15 == i13) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            byte b11 = bArr2[i11];
            i11++;
            i12 += b11;
            i13 = i13;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = i15;
        }
    }

    public static void c() {
        f60716i = new byte[]{8, -126, 3, -115};
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        int i10 = f60713f;
        int i11 = i10 + 107;
        f60712e = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = i10 + 19;
        f60712e = i12 % 128;
        if (i12 % 2 == 0) {
            return this.f60718b;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setX() throws Throwable {
        Object dividerPadding;
        if (!new setIndeterminateTintList(this.f60717a).setOnFocusChangeListener()) {
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
            int i10 = f60712e + 55;
            f60713f = i10 % 128;
            int i11 = i10 % 2;
            return setautosizetexttypeuniformwithpresetsizes;
        }
        int i12 = f60713f + 9;
        f60712e = i12 % 128;
        if (i12 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getMinimumFlingVelocity() % 121, (byte) (15 % (KeyEvent.getMaxKeyCode() - 90)), objArr);
            dividerPadding = setPersistentDrawingCache.setDividerPadding(new Object[]{this, ((String) objArr[0]).intern()}, 728146901, -728146899, (int) System.currentTimeMillis());
        } else {
            Object[] objArr2 = new Object[1];
            a(1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 74), objArr2);
            dividerPadding = setPersistentDrawingCache.setDividerPadding(new Object[]{this, ((String) objArr2[0]).intern()}, 728146901, -728146899, (int) System.currentTimeMillis());
        }
        return (setAutoSizeTextTypeUniformWithPresetSizes) dividerPadding;
    }
}
