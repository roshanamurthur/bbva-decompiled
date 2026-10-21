package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setScrollBarSize {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f60473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f60478j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f60480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Timer f60481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public TimerTask f60482d;

    public static final class setDividerPadding extends TimerTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60483q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60484r0 = 1;

        public setDividerPadding() {
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i13 = f60483q0 + 79;
            f60484r0 = i13 % 128;
            if (i13 % 2 == 0) {
                setScrollBarSize.setX(setScrollBarSize.this).invoke();
                int i14 = 20 / 0;
            } else {
                setScrollBarSize.setX(setScrollBarSize.this).invoke();
            }
            int i15 = f60484r0;
            int i16 = i15 & 55;
            int i17 = ((i15 ^ 55) | i16) << 1;
            int i18 = -((i15 | 55) & (~i16));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f60483q0 = i19 % 128;
            int i20 = i19 % 2;
            return null;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            setY(new Object[]{this}, 2085333939, -2085333939, System.identityHashCode(this));
        }
    }

    public static final class setY extends TimerTask {
        public setY() {
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setScrollBarSize.setX(setScrollBarSize.this).invoke();
            return null;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            setDividerPadding(new Object[]{this}, 1385517175, -1385517175, System.identityHashCode(this));
        }
    }

    static {
        b();
        f60476h = 0;
        f60477i = 1;
        f60474f = 0;
        f60475g = 1;
        f60473e = -443080064;
    }

    public setScrollBarSize(@NotNull setForceDarkAllowed setforcedarkallowed, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(setforcedarkallowed, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.f60479a = 5000;
        this.f60480b = function0;
        this.f60482d = new setDividerPadding();
    }

    public static void a(byte b10, short s4, short s7, Object[] objArr) {
        int i10 = b10 * 2;
        int i11 = 4 - (s7 * 3);
        int i12 = 66 - s4;
        byte[] bArr = new byte[1 - i10];
        int i13 = 0 - i10;
        byte[] bArr2 = f60478j;
        int i14 = -1;
        if (bArr2 == null) {
            i11++;
            i12 += i11;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = -1;
        }
        while (true) {
            int i15 = i11;
            int i16 = i12;
            int i17 = i14 + 1;
            bArr[i17] = (byte) i16;
            if (i17 == i13) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i11 = i15 + 1;
            i12 = bArr2[i15] + i16;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = i17;
        }
    }

    public static void b() {
        f60478j = new byte[]{89, 94, -75, -44};
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setScrollBarSize setscrollbarsize = (setScrollBarSize) objArr[0];
        setscrollbarsize.getClass();
        int i13 = f60474f + 125;
        f60475g = i13 % 128;
        if (i13 % 2 == 0) {
            setscrollbarsize.f60482d.cancel();
            throw null;
        }
        setscrollbarsize.f60482d.cancel();
        int i14 = f60475g + 3;
        f60474f = i14 % 128;
        int i15 = i14 % 2;
        setY sety = setscrollbarsize.new setY();
        setscrollbarsize.f60482d = sety;
        Timer timer = setscrollbarsize.f60481c;
        if (timer != null) {
            int i16 = f60474f + 103;
            f60475g = i16 % 128;
            int i17 = i16 % 2;
            int i18 = setscrollbarsize.f60479a;
            if (i17 == 0) {
                timer.schedule(sety, i18);
                throw null;
            }
            timer.schedule(sety, i18);
        }
        return null;
    }

    public static final /* synthetic */ Function0 setX(setScrollBarSize setscrollbarsize) {
        int i10 = f60474f + 35;
        int i11 = i10 % 128;
        f60475g = i11;
        int i12 = i10 % 2;
        Function0<Unit> function0 = setscrollbarsize.f60480b;
        int i13 = i11 + 69;
        f60474f = i13 % 128;
        int i14 = i13 % 2;
        return function0;
    }

    public final void setCompoundDrawableTintBlendMode() {
        setDividerPadding(new Object[]{this}, 1794332503, -1794332503, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x01fc  */
    public final void setOnFocusChangeListener() throws Throwable {
        int i10;
        char[] cArr;
        Throwable cause;
        int i11 = f60474f;
        int i12 = i11 + 113;
        f60475g = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        int i15 = i11 + 89;
        f60475g = i15 % 128;
        int i16 = i15 % 2;
        Timer timer = this.f60481c;
        if (timer != null) {
            int i17 = i11 + 15;
            f60475g = i17 % 128;
            if (i17 % 2 == 0) {
                timer.cancel();
                timer.purge();
                throw null;
            }
            timer.cancel();
            timer.purge();
        }
        this.f60481c = null;
        int i18 = f60475g + 13;
        f60474f = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
        int i19 = 0;
        int iCombineMeasuredStates = 12 - View.combineMeasuredStates(0, 0);
        int scrollBarFadeDuration = 192 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
        char c10 = '0';
        int iIndexOf = 8 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        char[] charArray = "\u0001￬\u0006\u0007\u0001\u000b\u000b�￫\n�\u0005".toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr2 = new char[iCombineMeasuredStates];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i20 = getnavbartitlestring.setY;
            if (i20 >= iCombineMeasuredStates) {
                break;
            }
            char c11 = charArray[i20];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c11;
            char c12 = (char) (c11 + scrollBarFadeDuration);
            cArr2[i20] = c12;
            try {
                Object[] objArr = new Object[i13];
                objArr[1] = Integer.valueOf(f60473e);
                objArr[i19] = Integer.valueOf(c12);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) Color.alpha(i19), TextUtils.indexOf("", c10, i19, i19) + 42, 483 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    byte b10 = (byte) i19;
                    byte b11 = b10;
                    Object[] objArr2 = new Object[1];
                    a(b11, b10, b11, objArr2);
                    String str = (String) objArr2[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr2[i20] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                Object[] objArr3 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (Color.blue(0) + 55966), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 42, View.resolveSizeAndState(0, 0, 0) + 2268);
                    byte b12 = (byte) 1;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr4 = new Object[1];
                    a(b13, b12, b13, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                scrollBarFadeDuration = scrollBarFadeDuration;
                charArray = charArray;
                i19 = 0;
                i13 = 2;
                c10 = '0';
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
        if (iIndexOf > 0) {
            int i21 = f60476h + 61;
            f60477i = i21 % 128;
            int i22 = i21 % 2;
            getnavbartitlestring.setOnFocusChangeListener = iIndexOf;
            char[] cArr3 = new char[iCombineMeasuredStates];
            System.arraycopy(cArr2, 0, cArr3, 0, iCombineMeasuredStates);
            int i23 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr3, 0, cArr2, iCombineMeasuredStates - i23, i23);
            int i24 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr3, i24, cArr2, 0, iCombineMeasuredStates - i24);
        }
        int i25 = f60477i + 95;
        f60476h = i25 % 128;
        if (i25 % 2 != 0) {
            cArr = new char[iCombineMeasuredStates];
            i10 = 1;
            getnavbartitlestring.setY = 1;
        } else {
            i10 = 1;
            cArr = new char[iCombineMeasuredStates];
            getnavbartitlestring.setY = 0;
        }
        while (true) {
            int i26 = getnavbartitlestring.setY;
            if (i26 >= iCombineMeasuredStates) {
                this.f60481c = (Timer) setForceDarkAllowed.setY(new Object[]{n1.f(cArr)}, -1097943296, 1097943296, (int) System.currentTimeMillis());
                int i27 = f60475g + 123;
                f60474f = i27 % 128;
                int i28 = i27 % 2;
                return;
            }
            cArr[i26] = cArr2[(iCombineMeasuredStates - i26) - i10];
            Object[] objArr5 = new Object[2];
            objArr5[i10] = getnavbartitlestring;
            objArr5[0] = getnavbartitlestring;
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1860518195);
            if (method3 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (View.MeasureSpec.getMode(0) + 55966), 43 - TextUtils.getOffsetBefore("", 0), 2268 - TextUtils.getOffsetAfter("", 0));
                byte b14 = (byte) 1;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr6 = new Object[1];
                a(b15, b14, b15, objArr6);
                method3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(1860518195, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            i10 = 1;
        }
    }
}
