package com.facetec.sdk;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class nu extends nj {
    private static final byte[] $$d = null;
    private static final int $$e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f42726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f42727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f42728h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient byte[][] f42729a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient int[] f42730d;

    static {
        init$0();
        f42727g = 5402764725387775499L;
        f42728h = -2051027445;
        f42726f = (char) 62885;
    }

    public nu(nb nbVar, int i10) {
        super(null);
        nv.a(nbVar.f42665b, 0L, i10);
        nt ntVar = nbVar.f42664a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = ntVar.f42722d;
            int i15 = ntVar.f42719a;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            ntVar = ntVar.f42725g;
        }
        this.f42729a = new byte[i13][];
        this.f42730d = new int[i13 << 1];
        nt ntVar2 = nbVar.f42664a;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f42729a;
            bArr[i16] = ntVar2.f42721c;
            int i17 = ntVar2.f42722d;
            int i18 = ntVar2.f42719a;
            int i19 = (i17 - i18) + i11;
            i11 = i19 > i10 ? i10 : i19;
            int[] iArr = this.f42730d;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            ntVar2.f42723e = true;
            i16++;
            ntVar2 = ntVar2.f42725g;
        }
    }

    private nj h() {
        return new nj(f());
    }

    public static void init$0() {
        $$d = new byte[]{114, -126, 20, -77};
        $$e = 248;
    }

    private static void m(String str, int i10, char c10, String str2, String str3, Object[] objArr) throws Throwable {
        char c11;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        go goVar = new go();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        int i11 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        goVar.f41794c = 0;
        while (goVar.f41794c < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i11] = goVar;
                Map map = bp.f40694x;
                Object method = map.get(26369957);
                if (method == null) {
                    Class cls = (Class) bp.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, View.MeasureSpec.getSize(i11) + 719, (char) View.MeasureSpec.getMode(i11));
                    byte b10 = (byte) i11;
                    Object[] objArr3 = new Object[1];
                    n((byte) 52, b10, b10, objArr3);
                    String str4 = (String) objArr3[i11];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i11] = Object.class;
                    method = cls.getMethod(str4, clsArr);
                    map.put(26369957, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i11] = goVar;
                Object method2 = map.get(-1014658957);
                if (method2 == null) {
                    Class cls2 = (Class) bp.a(24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 196 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((-1) - ImageFormat.getBitsPerPixel(i11)));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[i11] = Object.class;
                    method2 = cls2.getMethod(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, clsArr2);
                    map.put(-1014658957, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr5 = {goVar, Integer.valueOf(cArr[goVar.f41794c % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(918635547);
                if (method3 == null) {
                    Class cls3 = (Class) bp.a(24 - KeyEvent.normalizeMetaState(0), 1316 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41876));
                    byte b11 = (byte) 0;
                    Object[] objArr6 = new Object[1];
                    n((byte) 55, b11, b11, objArr6);
                    String str5 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str5, Object.class, cls4, cls4);
                    map.put(918635547, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                Object[] objArr7 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(-1899743495);
                if (method4 != null) {
                    c11 = 2;
                } else {
                    Class cls5 = (Class) bp.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 24, View.getDefaultSize(0, 0) + 837, (char) ExpandableListView.getPackedPositionType(0L));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr8 = new Object[1];
                    n(b12, b13, b13, objArr8);
                    String str6 = (String) objArr8[0];
                    c11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str6, cls6, cls6);
                    map.put(-1899743495, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c12 = goVar.f41793b;
                cArr[iIntValue2] = c12;
                int i12 = goVar.f41794c;
                cArr3[i12] = (char) (((((long) (c12 ^ charArray2[i12])) ^ (f42727g ^ 5402764725387775499L)) ^ ((long) ((int) (((long) f42728h) ^ 5402764725387775499L)))) ^ ((long) ((char) (((long) f42726f) ^ 5402764725387775499L))));
                goVar.f41794c = i12 + 1;
                length3 = length3;
                i11 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void n(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r0 = com.facetec.sdk.nu.$$d
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 + 67
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L1a
            r6 = r7
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L37
        L1a:
            r3 = r2
            r5 = r8
            r8 = r6
        L1d:
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r9
            r9 = r6
            r6 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L37:
            int r8 = r8 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.nu.n(int, short, byte, java.lang.Object[]):void");
    }

    private Object writeReplace() {
        return h();
    }

    @Override // com.facetec.sdk.nj
    public final String a() {
        return h().a();
    }

    @Override // com.facetec.sdk.nj
    public final String b() {
        return h().b();
    }

    @Override // com.facetec.sdk.nj
    public final nj c() {
        return h().c();
    }

    @Override // com.facetec.sdk.nj
    public final String d() {
        return h().d();
    }

    @Override // com.facetec.sdk.nj
    public final nj e() {
        return h().e();
    }

    @Override // com.facetec.sdk.nj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nj) {
            nj njVar = (nj) obj;
            if (njVar.g() == g() && b(0, njVar, 0, g())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facetec.sdk.nj
    public final byte[] f() throws Throwable {
        int[] iArr = this.f42730d;
        byte[][] bArr = this.f42729a;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f42730d;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            try {
                Object[] objArr = {this.f42729a[i10], Integer.valueOf(i12), bArr2, Integer.valueOf(i11), Integer.valueOf(i13 - i11)};
                Object[] objArr2 = new Object[1];
                m("ʰ㌪䷛\ueb37", ViewConfiguration.getFadingEdgeLength() >> 16, (char) (View.getDefaultSize(0, 0) + 14157), "㑎ꬊ뛔⎖錪猪⣃銫ꩍ點▎\udd88愚\udeb9糏㩤", "\u0000\u0000\u0000\u0000", objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                m("닿豝踺穗", MotionEvent.axisFromString("") + 982277555, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "窎ꌡ\ue2d6\u1c3aਯጶ⦻賈鲵", "\u0000\u0000\u0000\u0000", objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                i10++;
                i11 = i13;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        return bArr2;
    }

    @Override // com.facetec.sdk.nj
    public final int g() {
        return this.f42730d[this.f42729a.length - 1];
    }

    @Override // com.facetec.sdk.nj
    public final int hashCode() {
        int i10 = this.f42689b;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f42729a.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f42729a[i11];
            int[] iArr = this.f42730d;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f42689b = i12;
        return i12;
    }

    @Override // com.facetec.sdk.nj
    public final nj j() {
        return h().j();
    }

    @Override // com.facetec.sdk.nj
    public final String toString() {
        return h().toString();
    }

    private int e(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.f42730d, 0, this.f42729a.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.facetec.sdk.nj
    public final nj b(int i10, int i11) {
        return h().b(i10, i11);
    }

    @Override // com.facetec.sdk.nj
    public final byte c(int i10) {
        nv.a(this.f42730d[this.f42729a.length - 1], i10, 1L);
        int iE = e(i10);
        int i11 = iE == 0 ? 0 : this.f42730d[iE - 1];
        int[] iArr = this.f42730d;
        byte[][] bArr = this.f42729a;
        return bArr[iE][(i10 - i11) + iArr[bArr.length + iE]];
    }

    @Override // com.facetec.sdk.nj
    public final void d(nb nbVar) {
        int length = this.f42729a.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f42730d;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            nt ntVar = new nt(this.f42729a[i10], i12, (i12 + i13) - i11);
            nt ntVar2 = nbVar.f42664a;
            if (ntVar2 == null) {
                ntVar.f42724f = ntVar;
                ntVar.f42725g = ntVar;
                nbVar.f42664a = ntVar;
            } else {
                ntVar2.f42724f.c(ntVar);
            }
            i10++;
            i11 = i13;
        }
        nbVar.f42665b += (long) i11;
    }

    @Override // com.facetec.sdk.nj
    public final boolean b(int i10, nj njVar, int i11, int i12) {
        if (g() - i12 < 0) {
            return false;
        }
        int iE = e(0);
        while (i12 > 0) {
            int i13 = iE == 0 ? 0 : this.f42730d[iE - 1];
            int iMin = Math.min(i12, ((this.f42730d[iE] - i13) + i13) - i10);
            int[] iArr = this.f42730d;
            byte[][] bArr = this.f42729a;
            if (!njVar.d(i11, bArr[iE], (i10 - i13) + iArr[bArr.length + iE], iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iE++;
        }
        return true;
    }

    @Override // com.facetec.sdk.nj
    public final boolean d(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > g() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iE = e(i10);
        while (i12 > 0) {
            int i13 = iE == 0 ? 0 : this.f42730d[iE - 1];
            int iMin = Math.min(i12, ((this.f42730d[iE] - i13) + i13) - i10);
            int[] iArr = this.f42730d;
            byte[][] bArr2 = this.f42729a;
            if (!nv.a(bArr2[iE], (i10 - i13) + iArr[bArr2.length + iE], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iE++;
        }
        return true;
    }
}
