package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import androidx.core.view.PointerIconCompat;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ow extends pf {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final char[] f57576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f57577t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f57578u = null;

    @NotNull
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f57579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final String f57580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final String f57581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final String f57582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final String f57583r;

    static {
        b();
        f57577t = 1;
        f57576s = new char[]{59010, 59066, 59055, 59073, 59128, 59130, 59123, 59121, 59087, 59124, 59109, 59130, 59135, 59134, 59110, 59131, 59122, 59129, 59081, 59080, 59128, 59132, 59108, 59077, 59093, 59078, 59102, 59090, 59049, 59066};
    }

    public ow(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) throws Throwable {
        int[] iArr;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        int[] iArr2 = {0, 30, 0, 2};
        byte[] bytes = "\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000".getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        int i14 = iArr2[2];
        int i15 = iArr2[3];
        char[] cArr = f57576s;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                char[] cArr3 = cArr;
                int i17 = length;
                try {
                    Object[] objArr = {Integer.valueOf(cArr[i16])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), View.MeasureSpec.getSize(0) + 37, 610 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr2 = new Object[1];
                        c(b11, (byte) (b11 - 1), b10, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i16++;
                    cArr = cArr3;
                    length = i17;
                    iArr2 = iArr2;
                    i15 = i15;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr = iArr2;
            i10 = i15;
            cArr = cArr2;
        } else {
            iArr = iArr2;
            i10 = i15;
        }
        char[] cArr4 = new char[i13];
        System.arraycopy(cArr, i12, cArr4, 0, i13);
        if (bytes != null) {
            char[] cArr5 = new char[i13];
            setnavigationonclicklistener.setX = 0;
            char c10 = 0;
            while (true) {
                int i18 = setnavigationonclicklistener.setX;
                if (i18 >= i13) {
                    break;
                }
                if (bytes[i18] == 1) {
                    Object[] objArr3 = {Integer.valueOf(cArr4[i18]), Integer.valueOf(c10)};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1737824323);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (4449 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 42 - TextUtils.indexOf("", "", 0), View.MeasureSpec.makeMeasureSpec(0, 0) + PointerIconCompat.TYPE_GRABBING);
                        byte length2 = (byte) f57578u.length;
                        Object[] objArr4 = new Object[1];
                        c(length2, (byte) (length2 - 4), (byte) 0, objArr4);
                        String str7 = (String) objArr4[0];
                        Class<?> cls3 = Integer.TYPE;
                        method2 = cls2.getMethod(str7, cls3, cls3);
                        map2.put(1737824323, method2);
                    }
                    cArr5[i18] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(cArr4[i18]), Integer.valueOf(c10)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-504758789);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) KeyEvent.keyCodeFromString(""), 45 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.red(0) + 2627);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr6 = new Object[1];
                        c(b13, b13, b12, objArr6);
                        String str8 = (String) objArr6[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str8, cls5, cls5);
                        map3.put(-504758789, method3);
                    }
                    cArr5[i18] = ((Character) ((Method) method3).invoke(null, objArr5)).charValue();
                }
                c10 = cArr5[setnavigationonclicklistener.setX];
                Object[] objArr7 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) (31347 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 49, TextUtils.lastIndexOf("", '0') + 841);
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 3);
                    Object[] objArr8 = new Object[1];
                    c(b15, (byte) (b15 - 3), b14, objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
            cArr4 = cArr5;
        }
        if (i10 > 0) {
            char[] cArr6 = new char[i13];
            i11 = 0;
            System.arraycopy(cArr4, 0, cArr6, 0, i13);
            int i19 = i13 - i10;
            int i20 = i10;
            System.arraycopy(cArr6, 0, cArr4, i19, i20);
            System.arraycopy(cArr6, i20, cArr4, 0, i19);
        } else {
            i11 = 0;
        }
        if (i14 > 0) {
            setnavigationonclicklistener.setX = i11;
            while (true) {
                int i21 = setnavigationonclicklistener.setX;
                if (i21 >= i13) {
                    break;
                }
                cArr4[i21] = (char) (cArr4[i21] - iArr[2]);
                setnavigationonclicklistener.setX = i21 + 1;
            }
        }
        super(null, n1.f(cArr4), null, 0L, 13, null);
        this.m = str;
        this.f57579n = str2;
        this.f57580o = str3;
        this.f57581p = str4;
        this.f57582q = str5;
        this.f57583r = str6;
    }

    public static void b() {
        f57578u = new byte[]{57, 118, 8, 89};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r9 = r9 * 3
            int r9 = 3 - r9
            int r7 = r7 + 97
            byte[] r0 = new byte[r8]
            byte[] r1 = com.mypinpad.tsdk.isolation.ow.f57578u
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L33
        L18:
            r3 = r2
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r0[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L28:
            int r9 = r9 + 1
            r3 = r1[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L33:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ow.c(byte, int, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        ow owVar = (ow) objArr[0];
        int i13 = f57577t + 47;
        int i14 = i13 % 128;
        int i15 = i13 % 2;
        String str = owVar.m;
        int i16 = i14 + 119;
        f57577t = i16 % 128;
        int i17 = i16 % 2;
        return str;
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        int i10 = f57577t;
        int i11 = i10 + 5;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        int i14 = i10 + 59;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        return this.f57582q;
    }

    @NotNull
    public final String setDividerPadding() {
        int i10 = f57577t + 37;
        int i11 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f57580o;
        }
        throw null;
    }

    @NotNull
    public final String setOnLongClickListener() {
        int i10 = f57577t + 55;
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            int i12 = 25 / 0;
        }
        return this.f57583r;
    }

    @NotNull
    public final String setX() {
        int i10 = f57577t;
        int i11 = i10 + 85;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        int i14 = i10 + 5;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        return this.f57579n;
    }

    @NotNull
    public final String setY() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -670300325, 670300325, System.identityHashCode(this));
    }

    @NotNull
    public final String setOnFocusChangeListener() {
        int i10 = f57577t + 97;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        int i13 = i11 + 67;
        f57577t = i13 % 128;
        int i14 = i13 % 2;
        return this.f57581p;
    }
}
