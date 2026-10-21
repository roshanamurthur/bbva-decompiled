package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ov extends pf {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final char[] f57565p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f57566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f57567r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f57568s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f57569t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f57570u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f57571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f57572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f57573x = null;

    @NotNull
    public final UUID m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f57574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final getDynamicButtonIconTextSpacingDp f57575o;

    static {
        b();
        f57571v = 0;
        f57572w = 1;
        f57569t = 0;
        f57570u = 1;
        f57567r = true;
        f57568s = true;
        f57566q = 1794962343;
        f57565p = new char[]{62440, 62260, 62258, 62263, 62259, 62218, 62267, 62222, 62261, 62220, 62235, 62265, 62214, 62264, 62216, 62442, 62269, 62450, 62232, 62443, 62224, 62454, 62453, 62455};
    }

    public ov(@NotNull UUID uuid, @NotNull String str, @NotNull getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp) throws Throwable {
        char[] cArr;
        int i10;
        Object method;
        String str2 = "";
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getdynamicbuttonicontextspacingdp, "");
        int i11 = 0;
        int iGreen = 127 - Color.green(0);
        byte[] bytes = "\u0098\u0097\u0096\u0092\u0095\u0094\u0093\u008b\u0092\u0087\u0089\u0086\u0091\u0090\u0089\u0082\u0088\u0087\u008f\u008d\u008e\u0089\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
        setZ setz = new setZ();
        int i12 = 1;
        char[] cArr2 = f57565p;
        if (cArr2 != null) {
            int i13 = f57572w + 37;
            f57571v = i13 % 128;
            int i14 = i13 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr = new Object[i12];
                    objArr[i11] = Integer.valueOf(cArr2[i15]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method2 = map.get(1129500232);
                    if (method2 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (TextUtils.getTrimmedLength("") + 26288), 64 - View.resolveSize(i11, i11), 1596 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 2);
                        Object[] objArr2 = new Object[1];
                        c(b10, b11, (byte) (b11 - 3), objArr2);
                        method2 = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(1129500232, method2);
                    }
                    cArr3[i15] = ((Character) ((Method) method2).invoke(null, objArr)).charValue();
                    i15++;
                    cArr2 = cArr2;
                    length = length;
                    i11 = 0;
                    i12 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f57566q)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method3 = map2.get(1019674483);
        if (method3 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (10744 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 43, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 566);
            byte b12 = (byte) 0;
            byte b13 = (byte) (b12 + 1);
            Object[] objArr4 = new Object[1];
            c(b12, b13, (byte) (-b13), objArr4);
            method3 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(1019674483, method3);
        }
        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr3)).intValue();
        if (!f57568s) {
            if (!f57567r) {
                throw null;
            }
            int i16 = f57571v + 75;
            f57572w = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
            throw null;
        }
        int i17 = f57572w + 123;
        f57571v = i17 % 128;
        if (i17 % 2 != 0) {
            int length2 = bytes.length;
            setz.setOnFocusChangeListener = length2;
            cArr = new char[length2];
            i10 = 1;
        } else {
            int length3 = bytes.length;
            setz.setOnFocusChangeListener = length3;
            cArr = new char[length3];
            i10 = 0;
        }
        setz.setDividerPadding = i10;
        while (true) {
            int i18 = setz.setDividerPadding;
            int i19 = setz.setOnFocusChangeListener;
            if (i18 >= i19) {
                super(null, n1.f(cArr), null, 0L, 13, null);
                this.m = uuid;
                this.f57574n = str;
                this.f57575o = getdynamicbuttonicontextspacingdp;
                return;
            }
            int i20 = f57572w + 93;
            f57571v = i20 % 128;
            int i21 = i20 % 2;
            cArr[i18] = (char) (cArr2[bytes[(i19 - 1) - i18] + iGreen] - iIntValue);
            Object[] objArr5 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object obj = map3.get(-1539766653);
            if (obj != null) {
                method = obj;
            } else {
                Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - MotionEvent.axisFromString(str2)), 52 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2879);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr6 = new Object[1];
                c(b14, b15, (byte) (b15 - 1), objArr6);
                method = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                map3.put(-1539766653, method);
            }
            ((Method) method).invoke(null, objArr5);
            int i22 = f57571v + 75;
            f57572w = i22 % 128;
            int i23 = i22 % 2;
            str2 = str2;
            iIntValue = iIntValue;
        }
    }

    public static void b() {
        f57573x = new byte[]{113, 126, 19, 62};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r7 = r7 * 2
            int r7 = 122 - r7
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            byte[] r2 = com.mypinpad.tsdk.isolation.ov.f57573x
            if (r2 != 0) goto L19
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L34
        L19:
            r3 = r1
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2b:
            r3 = r2[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L34:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ov.c(int, short, int, java.lang.Object[]):void");
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        int i10 = f57569t;
        int i11 = i10 + 109;
        f57570u = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 7;
        f57570u = i13 % 128;
        int i14 = i13 % 2;
        return this.f57574n;
    }

    @NotNull
    public final getDynamicButtonIconTextSpacingDp setOnFocusChangeListener() {
        int i10 = f57570u;
        int i11 = i10 + 121;
        f57569t = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 119;
        f57569t = i13 % 128;
        if (i13 % 2 == 0) {
            return this.f57575o;
        }
        throw null;
    }

    @NotNull
    public final UUID setY() {
        int i10 = f57570u;
        int i11 = i10 + 87;
        f57569t = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = i10 + 61;
        f57569t = i12 % 128;
        int i13 = i12 % 2;
        UUID uuid = this.m;
        if (i13 != 0) {
            int i14 = 56 / 0;
        }
        return uuid;
    }
}
