package com.facetec.sdk;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class ny {
    private static final byte[] $$d = null;
    private static final int $$e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f42732b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ny f42733d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f42734a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42735c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42736e;

    static {
        init$0();
        f();
        f42733d = new ny() { // from class: com.facetec.sdk.ny.4
            @Override // com.facetec.sdk.ny
            public final void e_() throws IOException {
            }

            @Override // com.facetec.sdk.ny
            public final ny d(long j10) {
                return this;
            }

            @Override // com.facetec.sdk.ny
            public final ny c(long j10, TimeUnit timeUnit) {
                return this;
            }
        };
    }

    public static void f() {
        f42732b = new char[]{46670, 46612, 46655, 46654, 46643, 46611, 46617, 46655, 46639, 46634, 46645, 46640, 46642, 46652, 46642, 46642, 46612, 46805, 46800, 46799, 46797, 46797, 46795, 46795};
    }

    public static void init$0() {
        $$d = new byte[]{48, 123, -123, 83};
        $$e = 251;
    }

    private static void p(boolean z10, int[] iArr, String str, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        int i12;
        String str2 = str;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        hb hbVar = new hb();
        int i13 = 0;
        int i14 = iArr[0];
        int i15 = 1;
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        char[] cArr = f42732b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = new Object[i15];
                    objArr2[i13] = Integer.valueOf(cArr[i19]);
                    Map map = bp.f40694x;
                    Object method = map.get(834839604);
                    if (method == null) {
                        Class cls = (Class) bp.a((-16777192) - Color.rgb(i13, i13, i13), TextUtils.indexOf("", "") + 765, (char) (36772 - TextUtils.lastIndexOf("", '0', 0, 0)));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        q(b10, b11, (byte) (b11 + 5), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(834839604, method);
                    }
                    cArr2[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i19++;
                    cArr = cArr;
                    length = length;
                    i17 = i17;
                    i18 = i18;
                    i13 = 0;
                    i15 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i17;
            i11 = i18;
            cArr = cArr2;
        } else {
            i10 = i17;
            i11 = i18;
        }
        char[] cArr3 = new char[i16];
        System.arraycopy(cArr, i14, cArr3, 0, i16);
        if (bArr != null) {
            char[] cArr4 = new char[i16];
            hbVar.f41865e = 0;
            char c10 = 0;
            while (true) {
                int i20 = hbVar.f41865e;
                if (i20 >= i16) {
                    break;
                }
                if (bArr[i20] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i20]), Integer.valueOf(c10)};
                    Map map2 = bp.f40694x;
                    Object method2 = map2.get(427996090);
                    if (method2 == null) {
                        Class cls2 = (Class) bp.a(23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1025 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (38453 - Color.green(0)));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        q(b12, b13, (byte) (b13 | 6), objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls3 = Integer.TYPE;
                        method2 = cls2.getMethod(str3, cls3, cls3);
                        map2.put(427996090, method2);
                    }
                    cArr4[i20] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    Object[] objArr6 = {Integer.valueOf(cArr3[i20]), Integer.valueOf(c10)};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(-236045356);
                    if (method3 == null) {
                        Class cls4 = (Class) bp.a(24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 411 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        q(b14, b15, (byte) (b15 | 8), objArr7);
                        String str4 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str4, cls5, cls5);
                        map3.put(-236045356, method3);
                    }
                    cArr4[i20] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c10 = cArr4[hbVar.f41865e];
                Object[] objArr8 = {hbVar, hbVar};
                Map map4 = bp.f40694x;
                Object method4 = map4.get(540243420);
                if (method4 == null) {
                    Class cls6 = (Class) bp.a(23 - TextUtils.lastIndexOf("", '0'), 411 - TextUtils.indexOf("", ""), (char) Color.alpha(0));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    q(b16, b17, b17, objArr9);
                    method4 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(540243420, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            char[] cArr5 = new char[i16];
            i12 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i16);
            int i21 = i16 - i11;
            int i22 = i11;
            System.arraycopy(cArr5, 0, cArr3, i21, i22);
            System.arraycopy(cArr5, i22, cArr3, 0, i21);
        } else {
            i12 = 0;
        }
        if (z10) {
            char[] cArr6 = new char[i16];
            while (true) {
                hbVar.f41865e = i12;
                int i23 = hbVar.f41865e;
                if (i23 >= i16) {
                    break;
                }
                cArr6[i23] = cArr3[(i16 - i23) - 1];
                i12 = i23 + 1;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            int i24 = 0;
            while (true) {
                hbVar.f41865e = i24;
                int i25 = hbVar.f41865e;
                if (i25 >= i16) {
                    break;
                }
                cArr3[i25] = (char) (cArr3[i25] - iArr[2]);
                i24 = i25 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void q(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = com.facetec.sdk.ny.$$d
            int r9 = 115 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            r9 = r8
            r8 = r7
            goto L2e
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L2e:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ny.q(byte, int, byte, java.lang.Object[]):void");
    }

    public long a_() {
        return this.f42735c;
    }

    public boolean b_() {
        return this.f42736e;
    }

    public ny c(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j10)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f42735c = timeUnit.toNanos(j10);
        return this;
    }

    public long c_() {
        if (this.f42736e) {
            return this.f42734a;
        }
        throw new IllegalStateException("No deadline");
    }

    public ny d(long j10) {
        this.f42736e = true;
        this.f42734a = j10;
        return this;
    }

    public ny d_() {
        this.f42736e = false;
        return this;
    }

    public void e_() throws Throwable {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f42736e) {
            long j10 = this.f42734a;
            try {
                Object[] objArr = new Object[1];
                p(false, new int[]{0, 16, 0, 12}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                p(false, new int[]{16, 8, 43, 5}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001", objArr2);
                if (j10 - ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() <= 0) {
                    throw new InterruptedIOException("deadline reached");
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public ny f_() {
        this.f42735c = 0L;
        return this;
    }
}
