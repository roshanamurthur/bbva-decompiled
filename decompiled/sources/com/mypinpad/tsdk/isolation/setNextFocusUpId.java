package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setNextFocusUpId {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f60177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f60178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f60182g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f60183a;

    static {
        c();
        f60180e = 0;
        f60181f = 1;
        f60179d = 0;
        f60178c = 952400408983401952L;
        f60177b = new char[]{10046, 38090, 16590, 50724, 30160, 41429};
    }

    public setNextFocusUpId(@NotNull byte[] bArr, @NotNull setTextLocale settextlocale) throws Throwable {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(settextlocale, "");
        this.f60183a = bArr;
        int length = bArr.length;
        setRight.setOnFocusChangeListener setonfocuschangelistener = setRight.setOnFocusChangeListener;
        if (length < ((Integer) setRight.setOnFocusChangeListener.setX(new Object[]{settextlocale.setOnFocusChangeListener()}, -1066917021, 1066917021, (int) System.currentTimeMillis())).intValue()) {
            Object[] objArr = new Object[1];
            a((char) (57627 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, objArr);
            throw new setChildIndicatorBoundsRelative(((String) objArr[0]).intern());
        }
        if (bArr.length <= Integer.MAX_VALUE) {
            return;
        }
        Object[] objArr2 = new Object[1];
        a((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getSize(0) + 3, 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
        throw new setChildIndicatorBoundsRelative(((String) objArr2[0]).intern());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x01f5  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        int i12 = 0;
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i13 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i13 >= i11) {
                break;
            }
            int i14 = f60180e + 105;
            f60181f = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i12] = Integer.valueOf(f60177b[i10 + i13]);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(1832327647);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 44 - Drawable.resolveOpacity(i12, i12), TextUtils.indexOf("", "", i12, i12) + 728);
                    byte b10 = (byte) 5;
                    byte b11 = (byte) (b10 - 5);
                    Object[] objArr3 = new Object[1];
                    b(b11, b10, b11, objArr3);
                    String str = (String) objArr3[i12];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i12] = Integer.TYPE;
                    method = cls.getMethod(str, clsArr);
                    map.put(1832327647, method);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f60178c), Integer.valueOf(c10)};
                Object method2 = map.get(2012362404);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (46115 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.getTrimmedLength("") + 43, (ViewConfiguration.getLongPressTimeout() >> 16) + 1776);
                    byte length = (byte) f60182g.length;
                    byte b12 = (byte) (length - 4);
                    Object[] objArr5 = new Object[1];
                    b(b12, length, b12, objArr5);
                    String str2 = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method2 = cls2.getMethod(str2, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method2);
                }
                jArr[i13] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method3 = map.get(1606688712);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (ImageFormat.getBitsPerPixel(0) + 1), 27 - (ViewConfiguration.getTouchSlop() >> 8), 2311 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr7 = new Object[1];
                    b(b14, b13, b14, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                int i16 = f60181f + 83;
                f60180e = i16 % 128;
                int i17 = i16 % 2;
                i12 = 0;
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
        char[] cArr = new char[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i18 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i18 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            int i19 = f60180e + 59;
            f60181f = i19 % 128;
            int i20 = i19 % 2;
            cArr[i18] = (char) jArr[i18];
            Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map2 = setTextScaleX.setMaxEms;
            Object method4 = map2.get(1606688712);
            if (method4 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) TextUtils.getTrimmedLength(""), 27 - Color.alpha(0), 2311 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr9 = new Object[1];
                b(b16, b15, b16, objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map2.put(1606688712, method4);
            }
            ((Method) method4).invoke(null, objArr8);
        }
    }

    public static void b(byte b10, int i10, short s4, Object[] objArr) {
        int i11 = b10 * 2;
        int i12 = 4 - (s4 * 2);
        int i13 = 72 - i10;
        byte[] bArr = new byte[i11 + 1];
        int i14 = -1;
        byte[] bArr2 = f60182g;
        if (bArr2 == null) {
            i13 += -i12;
            i12++;
            objArr = objArr;
            bArr = bArr;
            i14 = -1;
            bArr2 = bArr2;
        }
        while (true) {
            int i15 = i14 + 1;
            bArr[i15] = (byte) i13;
            if (i15 == i11) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            Object[] objArr2 = objArr;
            int i16 = i12;
            byte[] bArr3 = bArr2;
            byte[] bArr4 = bArr;
            i13 += -bArr2[i12];
            i12 = i16 + 1;
            objArr = objArr2;
            bArr = bArr4;
            i14 = i15;
            bArr2 = bArr3;
        }
    }

    public static void c() {
        f60182g = new byte[]{Constants.STATE_ERROR, -58, -15, -71};
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        int i10 = f60179d + 111;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        int i13 = i11 + 61;
        f60179d = i13 % 128;
        int i14 = i13 % 2;
        byte[] bArr = this.f60183a;
        if (i14 != 0) {
            int i15 = 86 / 0;
        }
        return bArr;
    }
}
