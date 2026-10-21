package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class pl extends pf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f57721n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f57722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f57723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f57724q = null;

    @NotNull
    public final UUID m;

    static {
        b();
        f57722o = 0;
        f57723p = 1;
        f57721n = -443080093;
    }

    public pl(@NotNull UUID uuid) throws Throwable {
        Intrinsics.checkNotNullParameter(uuid, "");
        int i10 = 0;
        int offsetAfter = 37 - TextUtils.getOffsetAfter("", 0);
        int maxKeyCode = 280 - (KeyEvent.getMaxKeyCode() >> 16);
        int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28;
        int i12 = f57723p + 103;
        f57722o = i12 % 128;
        int i13 = 2;
        if (i12 % 2 != 0) {
            throw null;
        }
        char[] charArray = "\u0004\u0011\u0016\u0004\u0006\u0017\f\u0012\u0011\ufff6\u0017\u0004\u0017\u0018\u0016￨\u0019\b\u0011\u0017\uffd0\ufff7\ufff6\uffe7￮\uffd0ￔ\uffd1ￓ\ufff8\u0013\u0007\u0004\u0017\b\ufff7\u0015".toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[offsetAfter];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i14 = getnavbartitlestring.setY;
            if (i14 >= offsetAfter) {
                break;
            }
            char c10 = charArray[i14];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (c10 + maxKeyCode);
            cArr[i14] = c11;
            try {
                Object[] objArr = new Object[i13];
                objArr[1] = Integer.valueOf(f57721n);
                objArr[i10] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) View.MeasureSpec.getSize(i10), Color.argb(i10, i10, i10, i10) + 41, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 483);
                    byte b10 = (byte) i10;
                    byte b11 = b10;
                    Object[] objArr2 = new Object[1];
                    c((byte) (b11 + 1), b11, b10, objArr2);
                    String str = (String) objArr2[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i14] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                Object[] objArr3 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55966 - View.resolveSize(0, 0)), 43 - KeyEvent.normalizeMetaState(0), 2268 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr4 = new Object[1];
                    c(b13, b13, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                maxKeyCode = maxKeyCode;
                i10 = 0;
                i13 = 2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        if (i11 > 0) {
            int i15 = f57722o + 61;
            f57723p = i15 % 128;
            int i16 = i15 % 2;
            getnavbartitlestring.setOnFocusChangeListener = i11;
            char[] cArr2 = new char[offsetAfter];
            System.arraycopy(cArr, 0, cArr2, 0, offsetAfter);
            int i17 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, offsetAfter - i17, i17);
            int i18 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i18, cArr, 0, offsetAfter - i18);
        }
        super(null, n1.f(cArr), null, 0L, 13, null);
        this.m = uuid;
    }

    public static void b() {
        f57724q = new byte[]{92, -124, 49, 72};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r6 = r6 + 65
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.pl.f57724q
            if (r2 != 0) goto L19
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L35
        L19:
            r3 = r1
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L27:
            int r7 = r7 + 1
            r4 = r2[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L35:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.pl.c(byte, int, short, java.lang.Object[]):void");
    }

    @NotNull
    public final UUID setDividerPadding() {
        return this.m;
    }
}
