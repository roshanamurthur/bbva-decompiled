package com.facetec.sdk;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
final class nt {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f42716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f42717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f42718j;
    private static boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f42719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f42720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f42721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f42722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f42723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    nt f42724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    nt f42725g;

    static {
        init$0();
        f42718j = new char[]{35529, 35526, 35549, 35349, 35531, 35541, 35532, 35568, 35550, 35536, 35539, 35522, 35530, 35537, 35520, 35540, 35543};
        f42716h = -401307097;
        f42717i = true;
        m = true;
    }

    public nt() {
        this.f42721c = new byte[8192];
        this.f42720b = true;
        this.f42723e = false;
    }

    public static void init$0() {
        $$a = new byte[]{32, -41, Constants.FCI_TEMPLATE, -31};
        $$b = 152;
    }

    private static void k(String str, int[] iArr, int i10, String str2, Object[] objArr) throws Throwable {
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        gs gsVar = new gs();
        char[] cArr = f42718j;
        int i11 = -1;
        int i12 = 1;
        int i13 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = new Object[i12];
                    objArr2[i13] = Integer.valueOf(cArr[i14]);
                    Map map = bp.f40694x;
                    Object method = map.get(-1869190227);
                    if (method == null) {
                        Class cls = (Class) bp.a((ExpandableListView.getPackedPositionForGroup(i13) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i13) == 0L ? 0 : -1)) + 24, Color.green(i13) + 1387, (char) TextUtils.indexOf("", "", i13, i13));
                        byte b10 = (byte) i11;
                        byte b11 = (byte) (b10 + 3);
                        Object[] objArr3 = new Object[1];
                        l(b10, b11, (byte) (b11 - 2), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-1869190227, method);
                    }
                    cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i14++;
                    cArr = cArr;
                    i11 = -1;
                    i12 = 1;
                    i13 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f42716h)};
        Map map2 = bp.f40694x;
        Object method2 = map2.get(-1521609240);
        if (method2 == null) {
            Class cls2 = (Class) bp.a(31 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1238 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.getOffsetAfter("", 0) + 17819));
            byte b12 = (byte) (-1);
            byte b13 = (byte) (-b12);
            Object[] objArr5 = new Object[1];
            l(b12, b13, (byte) (b13 - 1), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(-1521609240, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        char c10 = '0';
        int i15 = 1178884533;
        if (m) {
            int length2 = bArr.length;
            gsVar.f41825d = length2;
            char[] cArr3 = new char[length2];
            gsVar.f41824b = 0;
            while (true) {
                int i16 = gsVar.f41824b;
                int i17 = gsVar.f41825d;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i16] = (char) (cArr[bArr[(i17 - 1) - i16] + i10] - iIntValue);
                Object[] objArr6 = {gsVar, gsVar};
                Map map3 = bp.f40694x;
                Object method3 = map3.get(Integer.valueOf(i15));
                if (method3 == null) {
                    Class cls3 = (Class) bp.a(23 - (ViewConfiguration.getPressedStateDuration() >> 16), 1363 - TextUtils.lastIndexOf("", c10, 0), (char) (52007 - (ViewConfiguration.getPressedStateDuration() >> 16)));
                    byte b14 = (byte) (-1);
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr7 = new Object[1];
                    l(b14, b15, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map3.put(1178884533, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                c10 = '0';
                i15 = 1178884533;
            }
        } else if (f42717i) {
            int length3 = charArray.length;
            gsVar.f41825d = length3;
            char[] cArr4 = new char[length3];
            gsVar.f41824b = 0;
            while (true) {
                int i18 = gsVar.f41824b;
                int i19 = gsVar.f41825d;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i18] = (char) (cArr[charArray[(i19 - 1) - i18] - i10] - iIntValue);
                Object[] objArr8 = {gsVar, gsVar};
                Map map4 = bp.f40694x;
                Object method4 = map4.get(1178884533);
                if (method4 == null) {
                    Class cls4 = (Class) bp.a(23 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1364 - Color.red(0), (char) (TextUtils.lastIndexOf("", '0') + 52008));
                    byte b16 = (byte) (-1);
                    byte b17 = (byte) (b16 + 1);
                    Object[] objArr9 = new Object[1];
                    l(b16, b17, b17, objArr9);
                    method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(1178884533, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
        } else {
            int i20 = 0;
            int length4 = iArr.length;
            gsVar.f41825d = length4;
            char[] cArr5 = new char[length4];
            while (true) {
                gsVar.f41824b = i20;
                int i21 = gsVar.f41824b;
                int i22 = gsVar.f41825d;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i21] = (char) (cArr[iArr[(i22 - 1) - i21] - i10] - iIntValue);
                    i20 = i21 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void l(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = 120 - r7
            byte[] r1 = com.facetec.sdk.nt.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L34:
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.nt.l(byte, byte, short, java.lang.Object[]):void");
    }

    @Nullable
    public final nt c() {
        nt ntVar = this.f42725g;
        nt ntVar2 = ntVar != this ? ntVar : null;
        nt ntVar3 = this.f42724f;
        ntVar3.f42725g = ntVar;
        this.f42725g.f42724f = ntVar3;
        this.f42725g = null;
        this.f42724f = null;
        return ntVar2;
    }

    public final nt d() {
        this.f42723e = true;
        return new nt(this.f42721c, this.f42719a, this.f42722d);
    }

    public final void d(nt ntVar, int i10) {
        if (ntVar.f42720b) {
            int i11 = ntVar.f42722d;
            if (i11 + i10 > 8192) {
                if (!ntVar.f42723e) {
                    int i12 = ntVar.f42719a;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = ntVar.f42721c;
                        try {
                            Object[] objArr = {bArr, Integer.valueOf(i12), bArr, 0, Integer.valueOf(i11 - i12)};
                            Object[] objArr2 = new Object[1];
                            k(null, null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr2);
                            Class<?> cls = Class.forName((String) objArr2[0]);
                            Object[] objArr3 = new Object[1];
                            k(null, null, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0089\u0091\u0090\u008f\u0089\u0082\u008e\u008e\u0082", objArr3);
                            String str = (String) objArr3[0];
                            Class<?> cls2 = Integer.TYPE;
                            cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                            ntVar.f42722d -= ntVar.f42719a;
                            ntVar.f42719a = 0;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            Object[] objArr4 = {this.f42721c, Integer.valueOf(this.f42719a), ntVar.f42721c, Integer.valueOf(ntVar.f42722d), Integer.valueOf(i10)};
            Object[] objArr5 = new Object[1];
            k(null, null, ExpandableListView.getPackedPositionGroup(0L) + 127, "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            k(null, null, 127 - (Process.myTid() >> 22), "\u0089\u0091\u0090\u008f\u0089\u0082\u008e\u008e\u0082", objArr6);
            String str2 = (String) objArr6[0];
            Class<?> cls4 = Integer.TYPE;
            cls3.getMethod(str2, Object.class, cls4, Object.class, cls4, cls4).invoke(null, objArr4);
            ntVar.f42722d += i10;
            this.f42719a += i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public nt(byte[] bArr, int i10, int i11) {
        this.f42721c = bArr;
        this.f42719a = i10;
        this.f42722d = i11;
        this.f42723e = true;
        this.f42720b = false;
    }

    public final nt c(nt ntVar) {
        ntVar.f42724f = this;
        ntVar.f42725g = this.f42725g;
        this.f42725g.f42724f = ntVar;
        this.f42725g = ntVar;
        return ntVar;
    }
}
