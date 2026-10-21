package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.view.PointerIconCompat;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/name$setX;", "p0", "", "d", "(Lcom/mypinpad/tsdk/i/name$setX;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
final class l9 extends Lambda implements Function1<name.setX, CharSequence> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l9 f56918p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static char[] f56919q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56920r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56921s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f56922t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f56923u0;
    public static final byte[] v0 = null;

    static {
        c();
        f56922t0 = 0;
        f56923u0 = 1;
        f56920r0 = 0;
        f56921s0 = 1;
        e();
        f56918p0 = new l9(1);
        int i10 = f56920r0 + 79;
        f56921s0 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 69 / 0;
        }
    }

    public l9() {
        super(1);
    }

    public static void a(String str, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        int i12;
        int i13;
        char[] cArr;
        int i14 = f56923u0 + 9;
        f56922t0 = i14 % 128;
        int i15 = 2;
        if (i14 % 2 != 0) {
            str.getBytes("ISO-8859-1");
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i16 = iArr[0];
        int i17 = 1;
        int i18 = iArr[1];
        int i19 = iArr[2];
        int i20 = iArr[3];
        char[] cArr2 = f56919q0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i21 = 0;
            while (i21 < length) {
                int i22 = f56922t0 + 13;
                f56923u0 = i22 % 128;
                int i23 = i22 % i15;
                try {
                    Object[] objArr2 = new Object[i17];
                    objArr2[0] = Integer.valueOf(cArr2[i21]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 36 - MotionEvent.axisFromString(""), 609 - KeyEvent.getDeadChar(0, 0));
                        byte b10 = (byte) 3;
                        byte b11 = (byte) (b10 - 4);
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, (byte) (b11 + 1), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr3[i21] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i21++;
                    cArr2 = cArr2;
                    length = length;
                    i19 = i19;
                    i20 = i20;
                    i15 = 2;
                    i17 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i19;
            i11 = i20;
            cArr2 = cArr3;
        } else {
            i10 = i19;
            i11 = i20;
        }
        char[] cArr4 = new char[i18];
        System.arraycopy(cArr2, i16, cArr4, 0, i18);
        if (bytes != null) {
            char[] cArr5 = new char[i18];
            setnavigationonclicklistener.setX = 0;
            char c10 = 0;
            while (true) {
                int i24 = setnavigationonclicklistener.setX;
                if (i24 >= i18) {
                    cArr4 = cArr5;
                    break;
                }
                int i25 = f56922t0;
                int i26 = i25 + 5;
                f56923u0 = i26 % 128;
                if (i26 % 2 != 0 ? bytes[i24] != 1 : bytes[i24] != 0) {
                    Object[] objArr4 = {Integer.valueOf(cArr4[i24]), Integer.valueOf(c10)};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(-504758789);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) TextUtils.getOffsetBefore("", 0), 45 - Color.green(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2626);
                        byte length2 = (byte) v0.length;
                        byte b12 = (byte) (length2 - 5);
                        Object[] objArr5 = new Object[1];
                        b(length2, b12, (byte) (b12 + 1), objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls3 = Integer.TYPE;
                        method2 = cls2.getMethod(str2, cls3, cls3);
                        map2.put(-504758789, method2);
                    }
                    cArr5[i24] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    int i27 = i25 + 45;
                    f56923u0 = i27 % 128;
                    if (i27 % 2 == 0) {
                        Object[] objArr6 = {Integer.valueOf(cArr4[i24]), Integer.valueOf(c10)};
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method3 = map3.get(1737824323);
                        if (method3 == null) {
                            Class cls4 = (Class) setTextScaleX.setX((char) (4449 - (ViewConfiguration.getEdgeSlop() >> 16)), 42 - (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + PointerIconCompat.TYPE_GRAB);
                            byte b13 = (byte) 0;
                            byte b14 = (byte) (b13 - 1);
                            Object[] objArr7 = new Object[1];
                            b(b13, b14, (byte) (b14 + 1), objArr7);
                            String str3 = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method3 = cls4.getMethod(str3, cls5, cls5);
                            map3.put(1737824323, method3);
                        }
                        cArr5[i24] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                        throw null;
                    }
                    Object[] objArr8 = {Integer.valueOf(cArr4[i24]), Integer.valueOf(c10)};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(1737824323);
                    if (method4 == null) {
                        Class cls6 = (Class) setTextScaleX.setX((char) (Color.green(0) + 4449), 43 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1022 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr9 = new Object[1];
                        b(b15, b16, (byte) (b16 + 1), objArr9);
                        String str4 = (String) objArr9[0];
                        Class<?> cls7 = Integer.TYPE;
                        method4 = cls6.getMethod(str4, cls7, cls7);
                        map4.put(1737824323, method4);
                    }
                    cArr5[i24] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                }
                c10 = cArr5[setnavigationonclicklistener.setX];
                Object[] objArr10 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(-265085633);
                if (method5 == null) {
                    Class cls8 = (Class) setTextScaleX.setX((char) (31346 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 48 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 840 - TextUtils.getTrimmedLength(""));
                    byte b17 = (byte) 1;
                    byte b18 = (byte) (-b17);
                    Object[] objArr11 = new Object[1];
                    b(b17, b18, (byte) (b18 + 1), objArr11);
                    method5 = cls8.getMethod((String) objArr11[0], Object.class, Object.class);
                    map5.put(-265085633, method5);
                }
                ((Method) method5).invoke(null, objArr10);
            }
        }
        if (i11 > 0) {
            int i28 = f56923u0 + 65;
            f56922t0 = i28 % 128;
            int i29 = i28 % 2;
            char[] cArr6 = new char[i18];
            System.arraycopy(cArr4, 0, cArr6, 0, i18);
            int i30 = i18 - i11;
            int i31 = i11;
            System.arraycopy(cArr6, 0, cArr4, i30, i31);
            System.arraycopy(cArr6, i31, cArr4, 0, i30);
            int i32 = f56922t0 + 113;
            f56923u0 = i32 % 128;
            i12 = 2;
            int i33 = i32 % 2;
        } else {
            i12 = 2;
        }
        int i34 = f56922t0 + 5;
        f56923u0 = i34 % 128;
        if (i34 % i12 == 0) {
            cArr = new char[i18];
            i13 = 0;
        } else {
            i13 = 0;
            cArr = new char[i18];
        }
        while (true) {
            setnavigationonclicklistener.setX = i13;
            int i35 = setnavigationonclicklistener.setX;
            if (i35 >= i18) {
                break;
            }
            cArr[i35] = cArr4[(i18 - i35) - 1];
            i13 = i35 + 1;
        }
        if (i10 > 0) {
            int i36 = f56923u0 + 3;
            f56922t0 = i36 % 128;
            int i37 = i36 % 2;
            int i38 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i38;
                int i39 = setnavigationonclicklistener.setX;
                if (i39 >= i18) {
                    break;
                }
                cArr[i39] = (char) (cArr[i39] - iArr[2]);
                i38 = i39 + 1;
            }
        }
        objArr[0] = new String(cArr);
    }

    public static void b(int i10, short s4, int i11, Object[] objArr) {
        int i12 = s4 + 4;
        int i13 = 101 - i10;
        int i14 = i11 * 2;
        byte[] bArr = new byte[i14 + 1];
        byte[] bArr2 = v0;
        int i15 = -1;
        if (bArr2 == null) {
            int i16 = i12 + i14;
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = -1;
            i12 = i12;
            i13 = i16;
        }
        while (true) {
            int i17 = i12 + 1;
            int i18 = i15 + 1;
            bArr[i18] = (byte) i13;
            if (i18 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = i18;
            i12 = i17;
            i13 += bArr2[i17];
        }
    }

    public static void c() {
        v0 = new byte[]{113, 16, 76, 90};
    }

    public static void e() {
        f56919q0 = new char[]{59015, 59051, 59088, 59044, 59013, 59064};
    }

    @NotNull
    public final CharSequence d(@NotNull name.setX setx) throws Throwable {
        Intrinsics.checkNotNullParameter(setx, "");
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("\u0001\u0001\u0000\u0000", new int[]{0, 4, 0, 1}, objArr);
        String str = String.format(((String) objArr[0]).intern(), Arrays.copyOf(new Object[]{Byte.valueOf(((Byte) name.setX.setX(new Object[]{setx}, 97530741, -97530741, System.identityHashCode(setx))).byteValue())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        sb2.append(str);
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000", new int[]{4, 2, 0, 0}, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append((String) name.setX.setX(new Object[]{setx}, -548165890, 548165891, System.identityHashCode(setx)));
        String string = sb2.toString();
        int i10 = f56921s0 + 121;
        f56920r0 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ CharSequence invoke(name.setX setx) throws Throwable {
        int i10 = f56920r0 + 81;
        f56921s0 = i10 % 128;
        int i11 = i10 % 2;
        CharSequence charSequenceD = d(setx);
        if (i11 == 0) {
            int i12 = 49 / 0;
        }
        return charSequenceD;
    }
}
