package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class pa extends pf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f57646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f57647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f57648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f57649q = null;

    @NotNull
    public final String m;

    static {
        b();
        f57648p = 1;
        f57647o = 1;
        f57646n = 30214521865327457L;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0276  */
    /* JADX WARN: Code duplicated, block: B:48:0x0277  */
    public pa(@NotNull String str) throws Throwable {
        Throwable cause;
        Intrinsics.checkNotNullParameter(str, "");
        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 11070;
        int i10 = f57648p;
        int i11 = i10 + 111;
        int i12 = i11 % 128;
        int i13 = 2;
        int i14 = i11 % 2;
        int i15 = i10 + 93;
        int i16 = i15 % 128;
        int i17 = i15 % 2;
        char[] charArray = "낦鮪\ue6e8ㄌᱣ梳돽鸯\ue977㖲ø欬뙜芊\uedce㠑̋澯뫯蔵큹㳚߹劣뵾".toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = modifierMetaStateMask;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i18 = 0;
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i19 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i19 >= charArray.length) {
                break;
            }
            int i20 = i10 + 19;
            int i21 = i20 % 128;
            int i22 = i20 % i13;
            long j10 = f57646n;
            if (i22 != 0) {
                char c10 = charArray[i19];
                try {
                    Object[] objArr = new Object[3];
                    objArr[i13] = setlayoutanimation;
                    objArr[1] = setlayoutanimation;
                    objArr[i18] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) TextUtils.getCapsMode("", i18, i18), (CdmaCellLocation.convertQuartSecToDecDegrees(i18) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i18) == 0.0d ? 0 : -1)) + 33, 1196 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        byte b10 = (byte) i18;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        c(b10, b11, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i19] = ((Long) ((Method) method).invoke(null, objArr)).longValue() - (j10 % 1779209353347916695L);
                    Object[] objArr3 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 728);
                        byte b12 = (byte) 1;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr4 = new Object[1];
                        c(b12, b13, b13, objArr4);
                        method2 = cls2.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(645183118, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                i10 = i10;
                Object[] objArr5 = {Integer.valueOf(charArray[i19]), setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(-764403778);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), View.MeasureSpec.getMode(0) + 33, (ViewConfiguration.getScrollBarSize() >> 8) + 1195);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr6 = new Object[1];
                    c(b14, b15, b15, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Integer.TYPE, Object.class, Object.class);
                    map2.put(-764403778, method3);
                }
                jArr[i19] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (j10 ^ 1779209353347916695L);
                Object[] objArr7 = {setlayoutanimation, setlayoutanimation};
                Object method4 = map2.get(645183118);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) Color.alpha(0), 44 - View.getDefaultSize(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 727);
                    byte b16 = (byte) 1;
                    byte b17 = (byte) (b16 - 1);
                    Object[] objArr8 = new Object[1];
                    c(b16, b17, b17, objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(645183118, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
            i10 = i10;
            i13 = 2;
            i18 = 0;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i23 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i23 >= charArray.length) {
                super(null, n1.f(cArr), null, 0L, 13, null);
                this.m = str;
                return;
            }
            cArr[i23] = (char) jArr[i23];
            Object[] objArr9 = {setlayoutanimation, setlayoutanimation};
            Map map3 = setTextScaleX.setMaxEms;
            Object method5 = map3.get(645183118);
            if (method5 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 44, TextUtils.getOffsetBefore("", 0) + 728);
                byte b18 = (byte) 1;
                byte b19 = (byte) (b18 - 1);
                Object[] objArr10 = new Object[1];
                c(b18, b19, b19, objArr10);
                method5 = cls5.getMethod((String) objArr10[0], Object.class, Object.class);
                map3.put(645183118, method5);
            }
            ((Method) method5).invoke(null, objArr9);
        }
    }

    public static void b() {
        f57649q = new byte[]{89, 94, -75, -44};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r6 = 110 - r6
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.pa.f57649q
            if (r2 != 0) goto L1a
            r6 = r7
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L35
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L35:
            int r7 = -r7
            int r6 = r6 + 1
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.pa.c(byte, int, short, java.lang.Object[]):void");
    }

    @NotNull
    public final String setDividerPadding() {
        int i10 = f57647o;
        int i11 = i10 + 19;
        int i12 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i13 = i10 + 37;
        int i14 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.m;
        }
        throw null;
    }
}
