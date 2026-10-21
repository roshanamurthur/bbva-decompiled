package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class os extends pf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f57541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f57542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f57543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f57544q = null;

    @NotNull
    public final String m;

    static {
        b();
        f57543p = 1;
        f57542o = 1;
        f57541n = -443079982;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x01d5  */
    public os(@NotNull String str) throws Throwable {
        int i10;
        Throwable cause;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        int i11 = 0;
        int iRgb = (-16777185) - Color.rgb(0, 0, 0);
        int deadChar = KeyEvent.getDeadChar(0, 0) + 101;
        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 20;
        int i12 = f57543p;
        int i13 = i12 + 35;
        int i14 = i13 % 128;
        int i15 = 2;
        if (i13 % 2 != 0) {
            throw null;
        }
        char[] charArray = "\n\u001b￪\u0013\u0014\u000e\u0019\u0006\u001b\u000e\u0019\b￦\u0013\u0014\u000e\u0018\u0018\n\ufff8ￕￓￖￒ\ufff0￩\ufff8\ufff9ￒ\u0019\u0013".toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[iRgb];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i16 = getnavbartitlestring.setY;
            if (i16 >= iRgb) {
                break;
            }
            char c10 = charArray[i16];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (c10 + deadChar);
            cArr[i16] = c11;
            try {
                Object[] objArr = new Object[i15];
                objArr[1] = Integer.valueOf(f57541n);
                objArr[i11] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) TextUtils.getOffsetAfter(str2, i11), 41 - KeyEvent.normalizeMetaState(i11), 483 - (ViewConfiguration.getTapTimeout() >> 16));
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr2 = new Object[1];
                    c(b10, b11, (byte) (b11 + 1), objArr2);
                    String str3 = (String) objArr2[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str3, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i16] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                Object[] objArr3 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (View.MeasureSpec.getSize(0) + 55966), (ViewConfiguration.getTouchSlop() >> 8) + 43, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2268);
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr4 = new Object[1];
                    c(b12, b13, (byte) (-b13), objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                str2 = str2;
                deadChar = deadChar;
                charArray = charArray;
                i11 = 0;
                i15 = 2;
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
        if (jumpTapTimeout > 0) {
            int i17 = i12 + 89;
            int i18 = i17 % 128;
            int i19 = i17 % 2;
            getnavbartitlestring.setOnFocusChangeListener = jumpTapTimeout;
            char[] cArr2 = new char[iRgb];
            i10 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, iRgb);
            int i20 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, iRgb - i20, i20);
            int i21 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i21, cArr, 0, iRgb - i21);
            int i22 = i12 + 57;
            int i23 = i22 % 128;
            int i24 = i22 % 2;
        } else {
            i10 = 0;
        }
        char[] cArr3 = new char[iRgb];
        getnavbartitlestring.setY = i10;
        while (true) {
            int i25 = getnavbartitlestring.setY;
            if (i25 >= iRgb) {
                super(null, n1.f(cArr3), null, 0L, 13, null);
                this.m = str;
                return;
            }
            int i26 = i12 + 21;
            int i27 = i26 % 128;
            int i28 = i26 % 2;
            cArr3[i25] = cArr[(iRgb - i25) - 1];
            Object[] objArr5 = {getnavbartitlestring, getnavbartitlestring};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1860518195);
            if (method3 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 55967), 43 - Gravity.getAbsoluteGravity(0, 0), 2268 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr6 = new Object[1];
                c(b14, b15, (byte) (-b15), objArr6);
                method3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(1860518195, method3);
            }
            ((Method) method3).invoke(null, objArr5);
        }
    }

    public static void b() {
        f57544q = new byte[]{33, -116, -123, 116};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r8 = 66 - r8
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.os.f57544q
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r7
            r7 = r6
            goto L35
        L16:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L35:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.os.c(byte, int, short, java.lang.Object[]):void");
    }

    @NotNull
    public final String setY() {
        int i10 = f57542o + 51;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        int i13 = i11 + 115;
        f57542o = i13 % 128;
        int i14 = i13 % 2;
        String str = this.m;
        if (i14 == 0) {
            int i15 = 12 / 0;
        }
        return str;
    }
}
