package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getAmountFieldTextSizeSp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f55662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f55663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f55664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f55665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f55669i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f55670j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f55671a;

    static {
        b();
        f55667g = 0;
        f55668h = 1;
        f55666f = 1;
        f55665e = (char) 31532;
        f55664d = (char) 38129;
        f55662b = (char) 19176;
        f55663c = (char) 15180;
    }

    public getAmountFieldTextSizeSp(@NotNull byte[] bArr, @NotNull setTextLocale settextlocale) throws Throwable {
        setChildIndicatorBoundsRelative setchildindicatorboundsrelative;
        int i10;
        char c10;
        String str = "";
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(settextlocale, "");
        this.f55671a = bArr;
        int length = bArr.length;
        setRight.setOnFocusChangeListener setonfocuschangelistener = setRight.setOnFocusChangeListener;
        int i11 = 1;
        int i12 = 0;
        int i13 = 2;
        if (length >= ((Integer) setRight.setOnFocusChangeListener.setX(new Object[]{settextlocale.setOnFocusChangeListener()}, -1066917021, 1066917021, (int) System.currentTimeMillis())).intValue() / 2) {
            return;
        }
        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 4;
        Class<?> cls = Object.class;
        char[] charArray = "\u1bfa沎鋺߁".toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i14 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i14 >= charArray.length) {
                throw new setChildIndicatorBoundsRelative(new String(cArr, 0, modifierMetaStateMask).intern());
            }
            cArr2[i12] = charArray[i14];
            cArr2[i11] = charArray[i14 + 1];
            int i15 = f55668h + i11;
            f55667g = i15 % 128;
            int i16 = i15 % i13;
            int i17 = 58224;
            int i18 = i12;
            while (i18 < 16) {
                int i19 = f55668h + 93;
                f55667g = i19 % 128;
                int i20 = i19 % i13;
                char c11 = cArr2[i11];
                char c12 = cArr2[i12];
                try {
                    Object[] objArr = {Integer.valueOf(c11), Integer.valueOf((c12 + i17) ^ ((c12 << 4) + ((char) (((long) f55664d) ^ 4333817592127744003L)))), Integer.valueOf(c12 >>> 5), Integer.valueOf(f55665e)};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    int i21 = f55670j;
                    if (method == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (48534 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getTouchSlop() >> 8) + 47, KeyEvent.keyCodeFromString(str) + 2672);
                        byte b10 = (byte) (i21 & 7);
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, b11, objArr2);
                        String str2 = (String) objArr2[0];
                        Class<?> cls3 = Integer.TYPE;
                        method = cls2.getMethod(str2, cls3, cls3, cls3, cls3);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    cArr2[1] = cCharValue;
                    Class<?> cls4 = cls;
                    Object[] objArr3 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) f55662b) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f55663c)};
                    Object method2 = map.get(-1434759016);
                    if (method2 != null) {
                        c10 = 4;
                    } else {
                        Class cls5 = (Class) setTextScaleX.setX((char) (48534 - Color.green(0)), Gravity.getAbsoluteGravity(0, 0) + 47, 2672 - KeyEvent.getDeadChar(0, 0));
                        byte b12 = (byte) (i21 & 7);
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr4 = new Object[1];
                        a(b12, b13, b13, objArr4);
                        String str3 = (String) objArr4[0];
                        c10 = 4;
                        Class<?> cls6 = Integer.TYPE;
                        method2 = cls5.getMethod(str3, cls6, cls6, cls6, cls6);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i17 -= 40503;
                    i18++;
                    cls = cls4;
                    str = str;
                    charArray = charArray;
                    setchildindicatorboundsrelative = setchildindicatorboundsrelative;
                    i11 = 1;
                    i13 = 2;
                    i12 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            setChildIndicatorBoundsRelative setchildindicatorboundsrelative2 = setchildindicatorboundsrelative;
            String str4 = str;
            Class<?> cls7 = cls;
            char[] cArr3 = charArray;
            int i22 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i22] = cArr2[0];
            cArr[i22 + 1] = cArr2[1];
            Object[] objArr5 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i10 = 1;
            } else {
                Class cls8 = (Class) setTextScaleX.setX((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36, 2145 - KeyEvent.getDeadChar(0, 0));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr6 = new Object[1];
                a(b14, b15, b15, objArr6);
                i10 = 1;
                method3 = cls8.getMethod((String) objArr6[0], cls7, cls7);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            int i23 = f55667g + 15;
            f55668h = i23 % 128;
            int i24 = i23 % 2;
            i11 = i10;
            cls = cls7;
            charArray = cArr3;
            setchildindicatorboundsrelative = setchildindicatorboundsrelative2;
            i12 = 0;
            i13 = 2;
            str = str4;
        }
    }

    public static void a(byte b10, byte b11, byte b12, Object[] objArr) {
        int i10 = (b11 * 3) + 4;
        int i11 = 105 - (b10 * 2);
        int i12 = b12 * 2;
        byte[] bArr = new byte[i12 + 1];
        byte[] bArr2 = f55669i;
        int i13 = -1;
        if (bArr2 == null) {
            i11 += i12;
            i10++;
            i12 = i12;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i13 = -1;
        }
        while (true) {
            int i14 = i13 + 1;
            bArr[i14] = (byte) i11;
            if (i14 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i11 += bArr2[i10];
            i10++;
            i12 = i12;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i13 = i14;
        }
    }

    public static void b() {
        f55669i = new byte[]{115, MessageUtils.MESSAGE_30_RS, -113, MessageUtils.MESSAGE_21_NAK};
        f55670j = 25;
    }

    @NotNull
    public final byte[] setDividerPadding() {
        int i10 = f55666f;
        int i11 = i10 + 11;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        int i14 = i10 + 79;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        return this.f55671a;
    }
}
