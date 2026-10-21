package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setScrollX extends setPaintFlags implements getDynamicButtonIconTextSpacingDp {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final long f60506r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f60507s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f60508t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f60509u0;
    public static final byte[] v0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f60510p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final Throwable f60511q0;

    static {
        c();
        f60509u0 = 1;
        f60507s0 = 0;
        f60508t0 = 1;
        f60506r0 = 8353960688299132885L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setScrollX(@NotNull String str, @Nullable Throwable th2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.f60510p0 = str;
        this.f60511q0 = th2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e9  */
    public static void a(int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = f60509u0;
        int i12 = i11 + 119;
        int i13 = i12 % 128;
        char c10 = 2;
        if (i12 % 2 != 0) {
            throw null;
        }
        char[] charArray = "\u243e\ue35d".toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i14 = 0;
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i15 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i15 >= charArray.length) {
                break;
            }
            char c11 = charArray[i15];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[i14] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) View.resolveSize(i14, i14), View.getDefaultSize(i14, i14) + 33, 1195 - TextUtils.indexOf("", "", i14));
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (-b10);
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, (byte) (b11 - 1), objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f60506r0 ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) Color.red(0), TextUtils.getOffsetBefore("", 0) + 44, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 728);
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                c10 = 2;
                i14 = 0;
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
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i17 = i11 + 15;
            int i18 = i17 % 128;
            if (i17 % 2 != 0) {
                cArr[i16] = (char) jArr[i16];
                Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getLongPressTimeout() >> 16), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 728 - View.MeasureSpec.getMode(0));
                    byte b14 = (byte) (-1);
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                throw null;
            }
            cArr[i16] = (char) jArr[i16];
            Object[] objArr8 = {setlayoutanimation, setlayoutanimation};
            Map map3 = setTextScaleX.setMaxEms;
            Object method4 = map3.get(645183118);
            if (method4 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 44 - Color.green(0), 728 - Color.alpha(0));
                byte b16 = (byte) (-1);
                byte b17 = (byte) (b16 + 1);
                Object[] objArr9 = new Object[1];
                b(b16, b17, b17, objArr9);
                method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map3.put(645183118, method4);
            }
            ((Method) method4).invoke(null, objArr8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 107
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.setScrollX.v0
            if (r2 != 0) goto L1b
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L38
        L1b:
            r3 = r1
        L1c:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2b:
            int r3 = r3 + 1
            r4 = r2[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L38:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setScrollX.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        v0 = new byte[]{66, 118, 114, -11};
    }

    @Override // java.lang.Throwable
    @Nullable
    public final Throwable getCause() {
        int i10 = f60508t0 + 81;
        int i11 = i10 % 128;
        f60507s0 = i11;
        if (i10 % 2 != 0) {
            int i12 = 28 / 0;
        }
        int i13 = i11 + 119;
        f60508t0 = i13 % 128;
        int i14 = i13 % 2;
        return this.f60511q0;
    }

    @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
    @NotNull
    public final String setX() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a(AndroidCharacter.getMirror('0') + 50995, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(this.f60510p0);
        Object[] objArr2 = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 51042, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        Throwable cause = getCause();
        String message = null;
        sb2.append((Object) (cause == null ? null : cause.getClass().getSimpleName()));
        Object[] objArr3 = new Object[1];
        a(51043 - Color.blue(0), objArr3);
        sb2.append(((String) objArr3[0]).intern());
        Throwable cause2 = getCause();
        if (cause2 == null) {
            int i10 = f60507s0 + 33;
            f60508t0 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } else {
            message = cause2.getMessage();
        }
        sb2.append((Object) message);
        return sb2.toString();
    }
}
