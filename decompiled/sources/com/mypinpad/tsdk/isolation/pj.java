package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class pj extends pf {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f57715o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f57716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f57717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f57718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f57719s = null;

    @NotNull
    public final UUID m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f57720n;

    static {
        b();
        f57717q = 0;
        f57718r = 1;
        f57716p = 0;
        f57715o = new int[]{-1729178137, 512378605, 457348545, 887591014, -114036553, -1535122913, -82033461, 1912728265, 1502042756, 178255129, -1545654767, 1456273264, 1898385878, -1801372569, -1069322913, -748836766, 501010101, -569469259};
    }

    public pj(@NotNull UUID uuid, @NotNull String str) throws Throwable {
        int i10;
        int[] iArr;
        char[] cArr;
        Object method;
        int length;
        int i11;
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(str, "");
        int[] iArr2 = {-2129647260, 1916926270, 1927872203, -1018581381, -766462036, 1792708814, -1937973476, 1245569044, -561277825, 1935532340, 1243065744, 1827337677, -377590031, 462119591, 146964588, 525088202, -42901590, 1069624867};
        int gidForName = Process.getGidForName("") + 34;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[36];
        int i12 = 2;
        int[] iArr3 = f57715o;
        if (iArr3 != null) {
            int i13 = f57718r + 91;
            f57717q = i13 % 128;
            if (i13 % 2 != 0) {
                length = iArr3.length;
                iArr = new int[length];
                i11 = 1;
            } else {
                length = iArr3.length;
                iArr = new int[length];
                i11 = 0;
            }
            while (i11 < length) {
                int i14 = f57717q + 121;
                f57718r = i14 % 128;
                int i15 = i14 % i12;
                try {
                    Object[] objArr = {Integer.valueOf(iArr3[i11])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method2 = map.get(1833429914);
                    if (method2 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) View.MeasureSpec.getSize(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44, 728 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr2 = new Object[1];
                        c(b10, b11, (byte) (b11 - 1), objArr2);
                        method2 = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(1833429914, method2);
                    }
                    iArr[i11] = ((Integer) ((Method) method2).invoke(null, objArr)).intValue();
                    i11++;
                    length = length;
                    gidForName = gidForName;
                    i12 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = gidForName;
            int i16 = f57717q + 25;
            f57718r = i16 % 128;
            int i17 = i16 % 2;
        } else {
            i10 = gidForName;
            iArr = iArr3;
        }
        int length2 = iArr.length;
        int[] iArr4 = new int[length2];
        if (iArr3 != null) {
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int i18 = 0;
            while (i18 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr3[i18])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1833429914);
                if (method3 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) View.MeasureSpec.makeMeasureSpec(0, 0), 44 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 728);
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr4 = new Object[1];
                    c(b12, b13, (byte) (b13 - 1), objArr4);
                    method3 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                    map2.put(1833429914, method3);
                }
                iArr5[i18] = ((Integer) ((Method) method3).invoke(null, objArr3)).intValue();
                i18++;
                length3 = length3;
                iArr3 = iArr3;
                cArr3 = cArr3;
            }
            cArr = cArr3;
            iArr3 = iArr5;
        } else {
            cArr = cArr3;
        }
        char c10 = 0;
        System.arraycopy(iArr3, 0, iArr4, 0, length2);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i19 = setonlongclicklistener.setDividerPadding;
            if (i19 >= 18) {
                super(null, new String(cArr, 0, i10).intern(), null, 0L, 13, null);
                this.m = uuid;
                this.f57720n = str;
                return;
            }
            int i20 = iArr2[i19];
            char c11 = (char) (i20 >> 16);
            cArr2[c10] = c11;
            char c12 = (char) i20;
            cArr2[1] = c12;
            int i21 = iArr2[i19 + 1];
            char c13 = (char) (i21 >> 16);
            cArr2[2] = c13;
            char c14 = (char) i21;
            cArr2[3] = c14;
            setonlongclicklistener.setY = (c11 << 16) + c12;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c13 << 16) + c14;
            setOnLongClickListener.setX(iArr4);
            for (int i22 = 0; i22 < 16; i22++) {
                int i23 = setonlongclicklistener.setY ^ iArr4[i22];
                setonlongclicklistener.setY = i23;
                Object[] objArr5 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i23)), setonlongclicklistener, setonlongclicklistener};
                Map map3 = setTextScaleX.setMaxEms;
                Object method4 = map3.get(-350984188);
                if (method4 == null) {
                    method4 = ((Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Process.getGidForName("") + 42, MotionEvent.axisFromString("") + 181)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(-350984188, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr5)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
            }
            int i24 = setonlongclicklistener.setY;
            int i25 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i26 = i24 ^ iArr4[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i26;
            int i27 = i25 ^ iArr4[17];
            setonlongclicklistener.setY = i27;
            cArr2[0] = (char) (i27 >>> 16);
            cArr2[1] = (char) i27;
            cArr2[2] = (char) (i26 >>> 16);
            cArr2[3] = (char) i26;
            setOnLongClickListener.setX(iArr4);
            int i28 = setonlongclicklistener.setDividerPadding * 2;
            cArr[i28] = cArr2[0];
            cArr[i28 + 1] = cArr2[1];
            cArr[i28 + 2] = cArr2[2];
            cArr[i28 + 3] = cArr2[3];
            Object[] objArr6 = {setonlongclicklistener, setonlongclicklistener};
            Map map4 = setTextScaleX.setMaxEms;
            Object obj = map4.get(-147294223);
            if (obj != null) {
                method = obj;
            } else {
                Class cls3 = (Class) setTextScaleX.setX((char) Color.argb(0, 0, 0, 0), 41 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 483);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                c(b14, b15, b15, objArr7);
                method = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map4.put(-147294223, method);
            }
            ((Method) method).invoke(null, objArr6);
            c10 = 0;
        }
    }

    public static void b() {
        f57719s = new byte[]{59, 125, 28, -9};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r7 = r7 * 4
            int r7 = 108 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.pj.f57719s
            if (r2 != 0) goto L1a
            r7 = r6
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L37
        L1a:
            r3 = r1
            r5 = r8
            r8 = r7
        L1d:
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2d:
            r3 = r2[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L37:
            int r6 = -r6
            int r7 = r7 + 1
            int r6 = r6 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.pj.c(byte, int, short, java.lang.Object[]):void");
    }

    @NotNull
    public final UUID setCompoundDrawableTintBlendMode() {
        int i10 = f57716p + 73;
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.m;
        }
        throw null;
    }

    @NotNull
    public final String setOnFocusChangeListener() {
        int i10 = f57716p + 47;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        int i13 = i11 + 57;
        f57716p = i13 % 128;
        int i14 = i13 % 2;
        return this.f57720n;
    }
}
