package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setScrollBarStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f60487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f60488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f60491e = null;

    static {
        c();
        f60489c = 0;
        f60490d = 1;
        f60488b = -3856146131795923735L;
        f60487a = new char[]{16594, 10757, 38153, '*', 60183, 22077, 49486, 44102, 5980, 33406, 27978, 55416, 17291, 11919, 39391, 1196, 61352, 23206, 50630, 45257, 7124, 34554, 29178, 56516, 17932, 12558, 39936, 1839, 62002, 23870, 51226, 39986, 63179, 18844, 56480, 14264, 35507, 7639, 28876, 52164, 24294, 45530, 1276, 40720, 61980, 17681, 55338, 13088, 34406, 46360, 57313, 24749, 62862, 7826, 41876, 13547, 23019, 58066, 30684, 39115, 11729, 46637, 56119, 27759};
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x01f2  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Object method;
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        int i12 = 0;
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i13 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i13 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i12] = Integer.valueOf(f60487a[i10 + i13]);
                Map map = setTextScaleX.setMaxEms;
                Object method2 = map.get(1832327647);
                if (method2 == null) {
                    Class cls = (Class) setTextScaleX.setX((char) KeyEvent.keyCodeFromString(""), ((Process.getThreadPriority(i12) + 20) >> 6) + 44, 728 - Color.blue(i12));
                    byte b10 = (byte) 5;
                    byte b11 = (byte) (b10 - 5);
                    Object[] objArr3 = new Object[1];
                    b(b11, b10, (byte) (b11 - 1), objArr3);
                    String str = (String) objArr3[i12];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i12] = Integer.TYPE;
                    method2 = cls.getMethod(str, clsArr);
                    map.put(1832327647, method2);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method2).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f60488b), Integer.valueOf(c10)};
                Object method3 = map.get(2012362404);
                if (method3 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (46116 - (ViewConfiguration.getEdgeSlop() >> 16)), 43 - TextUtils.getOffsetAfter("", 0), 1775 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    byte length = (byte) f60491e.length;
                    byte b12 = (byte) (length - 4);
                    Object[] objArr5 = new Object[1];
                    b(b12, length, (byte) (b12 - 1), objArr5);
                    String str2 = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method3 = cls2.getMethod(str2, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method3);
                }
                jArr[i13] = ((Long) ((Method) method3).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method4 = map.get(1606688712);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 27, 2311 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr7 = new Object[1];
                    b(b14, b13, (byte) (b14 - 1), objArr7);
                    method4 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method4);
                }
                ((Method) method4).invoke(null, objArr6);
                i12 = 0;
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
        char[] cArr = new char[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i14 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i14 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i14] = (char) jArr[i14];
            Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map2 = setTextScaleX.setMaxEms;
            Object obj = map2.get(1606688712);
            if (obj != null) {
                method = obj;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 27, TextUtils.indexOf((CharSequence) "", '0', 0) + 2312);
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr9 = new Object[1];
                b(b16, b15, (byte) (b16 - 1), objArr9);
                method = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map2.put(1606688712, method);
            }
            ((Method) method).invoke(null, objArr8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = 72 - r8
            int r9 = r9 + 4
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.setScrollBarStyle.f60491e
            if (r2 != 0) goto L18
            r8 = r7
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            goto L36
        L18:
            r3 = r1
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r9 = r9 + 1
            if (r3 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L28:
            int r3 = r3 + 1
            r4 = r2[r9]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r6
        L36:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setScrollBarStyle.b(int, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        f60491e = new byte[]{59, -77, 103, 16};
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r5 instanceof com.mypinpad.tsdk.isolation.setScrollBarStyle) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        ((com.mypinpad.tsdk.isolation.setScrollBarStyle) r5).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) null, (java.lang.Object) null) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r5 = com.mypinpad.tsdk.isolation.setScrollBarStyle.f60489c + 65;
        com.mypinpad.tsdk.isolation.setScrollBarStyle.f60490d = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) null, (java.lang.Object) null)) == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) null, (java.lang.Object) null)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r0 = r0 + 83;
        com.mypinpad.tsdk.isolation.setScrollBarStyle.f60489c = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.mypinpad.tsdk.isolation.setScrollBarStyle.f60490d
            int r1 = r0 + 45
            int r2 = r1 % 128
            com.mypinpad.tsdk.isolation.setScrollBarStyle.f60489c = r2
            int r1 = r1 % 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = 63
            int r1 = r1 / r3
            if (r4 != r5) goto L1f
            goto L16
        L14:
            if (r4 != r5) goto L1f
        L16:
            int r0 = r0 + 83
            int r5 = r0 % 128
            com.mypinpad.tsdk.isolation.setScrollBarStyle.f60489c = r5
            int r0 = r0 % 2
            return r2
        L1f:
            boolean r0 = r5 instanceof com.mypinpad.tsdk.isolation.setScrollBarStyle
            if (r0 != 0) goto L24
            return r3
        L24:
            com.mypinpad.tsdk.i.setScrollBarStyle r5 = (com.mypinpad.tsdk.isolation.setScrollBarStyle) r5
            r5.getClass()
            r5 = 0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r5)
            if (r0 != 0) goto L3b
            int r5 = com.mypinpad.tsdk.isolation.setScrollBarStyle.f60489c
            int r5 = r5 + 65
            int r0 = r5 % 128
            com.mypinpad.tsdk.isolation.setScrollBarStyle.f60490d = r0
            int r5 = r5 % 2
            return r3
        L3b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r5)
            r0 = r0 ^ r2
            if (r0 == r2) goto L4b
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r5)
            r5 = r5 ^ r2
            if (r5 == 0) goto L4a
            return r3
        L4a:
            return r2
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setScrollBarStyle.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        throw null;
    }

    @NotNull
    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) (34445 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Color.blue(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append((String) null);
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23042), 32 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 18 - View.MeasureSpec.getMode(0), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append((String) null);
        Object[] objArr3 = new Object[1];
        a((char) (Color.blue(0) + 29480), 49 - (ViewConfiguration.getTouchSlop() >> 8), Color.green(0) + 15, objArr3);
        sb2.append(((String) objArr3[0]).intern());
        sb2.append("null)");
        String string = sb2.toString();
        int i10 = f60490d + 101;
        f60489c = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }
}
