package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getNavBarTextColor implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f55917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f55918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f55920f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f55921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f55922b;

    static {
        c();
        f55919e = 0;
        f55918d = -4284777274741945305L;
        f55917c = new char[]{50813, 3145, 21006, 39135, 61087, 13650, 31514, 16815, 38828, 55918, Typography.dagger, 30449, 48303, 33410, 51540, 7948, 25986, 43929, 65116, 50206};
    }

    public getNavBarTextColor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f55921a = context;
        this.f55922b = getTransactionPortrait.UiMessageCallbackKtWhenMappings;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01de  */
    /* JADX WARN: Code duplicated, block: B:39:0x01df  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i12 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i12 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f55917c[i10 + i12])};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(1832327647);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 44, TextUtils.getOffsetAfter("", 0) + 728);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, (byte) (b11 + 5), objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                    map.put(1832327647, method);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f55918d), Integer.valueOf(c10)};
                Object method2 = map.get(2012362404);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46117), 43 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1776 - ExpandableListView.getPackedPositionGroup(0L));
                    byte b12 = (byte) 0;
                    Object[] objArr5 = new Object[1];
                    b(b12, b12, (byte) f55920f.length, objArr5);
                    String str = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method2 = cls2.getMethod(str, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method2);
                }
                jArr[i12] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method3 = map.get(1606688712);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 27, 2311 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr7 = new Object[1];
                    b(b13, b14, b14, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method3);
                }
                ((Method) method3).invoke(null, objArr6);
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
            int i13 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i13 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i13] = (char) jArr[i13];
            Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map2 = setTextScaleX.setMaxEms;
            Object method4 = map2.get(1606688712);
            if (method4 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 27 - Color.argb(0, 0, 0, 0), 2311 - (ViewConfiguration.getScrollBarSize() >> 8));
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr9 = new Object[1];
                b(b15, b16, b16, objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map2.put(1606688712, method4);
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
    public static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r8 = 72 - r8
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            byte[] r2 = com.mypinpad.tsdk.isolation.getNavBarTextColor.f55920f
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
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2b:
            int r3 = r3 + 1
            r4 = r2[r7]
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
            int r6 = r6 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getNavBarTextColor.b(int, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f55920f = new byte[]{113, 126, 19, 62};
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        int i10 = f55919e + 21;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        int i13 = i11 + 79;
        f55919e = i13 % 128;
        if (i13 % 2 == 0) {
            return this.f55922b;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0080, code lost:
    
        return (com.mypinpad.tsdk.isolation.setAutoSizeTextTypeUniformWithPresetSizes) com.mypinpad.tsdk.isolation.setPersistentDrawingCache.setDividerPadding(new java.lang.Object[]{r9}, -2060556907, 2060556908, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.setAutoSizeTextTypeUniformWithPresetSizes) com.mypinpad.tsdk.isolation.setPersistentDrawingCache.setDividerPadding(new java.lang.Object[]{r9}, -462901680, 462901680, (int) java.lang.System.currentTimeMillis());
        r1 = com.mypinpad.tsdk.isolation.getNavBarTextColor.f55919e + 19;
        r2 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x009e, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        if (r0.hasSystemFeature(((java.lang.String) r3[0]).intern()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (r0.hasSystemFeature(((java.lang.String) r5[0]).intern()) != false) goto L9;
     */
    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mypinpad.tsdk.isolation.setAutoSizeTextTypeUniformWithPresetSizes setX() throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = com.mypinpad.tsdk.isolation.getNavBarTextColor.f55919e
            int r0 = r0 + 67
            int r1 = r0 % 128
            int r0 = r0 % 2
            r1 = 0
            android.content.Context r3 = r9.f55921a
            r4 = 1
            r5 = 0
            r6 = 0
            if (r0 != 0) goto L3f
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            long r7 = android.widget.ExpandableListView.getPackedPositionForGroup(r6)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            char r1 = (char) r1
            float r2 = android.util.TypedValue.complexToFloat(r6)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            float r3 = android.view.ViewConfiguration.getScrollFriction()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 78
            int r5 = r5 / r3
            java.lang.Object[] r3 = new java.lang.Object[r4]
            a(r1, r2, r5, r3)
            r1 = r3[r6]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L81
            goto L6b
        L3f:
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            long r7 = android.widget.ExpandableListView.getPackedPositionForGroup(r6)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            char r1 = (char) r1
            float r2 = android.util.TypedValue.complexToFloat(r6)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            float r3 = android.view.ViewConfiguration.getScrollFriction()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = 21 - r3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            a(r1, r2, r3, r5)
            r1 = r5[r6]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L81
        L6b:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r6] = r9
            long r1 = java.lang.System.currentTimeMillis()
            int r1 = (int) r1
            r2 = -2060556907(0xffffffff852e6595, float:-8.200098E-36)
            r3 = 2060556908(0x7ad19a6c, float:5.4416105E35)
            java.lang.Object r0 = com.mypinpad.tsdk.isolation.setPersistentDrawingCache.setDividerPadding(r0, r2, r3, r1)
            com.mypinpad.tsdk.i.setAutoSizeTextTypeUniformWithPresetSizes r0 = (com.mypinpad.tsdk.isolation.setAutoSizeTextTypeUniformWithPresetSizes) r0
            return r0
        L81:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r6] = r9
            long r1 = java.lang.System.currentTimeMillis()
            int r1 = (int) r1
            r2 = -462901680(0xffffffffe468ae50, float:-1.7168821E22)
            r3 = 462901680(0x1b9751b0, float:2.5033644E-22)
            java.lang.Object r0 = com.mypinpad.tsdk.isolation.setPersistentDrawingCache.setDividerPadding(r0, r2, r3, r1)
            com.mypinpad.tsdk.i.setAutoSizeTextTypeUniformWithPresetSizes r0 = (com.mypinpad.tsdk.isolation.setAutoSizeTextTypeUniformWithPresetSizes) r0
            int r1 = com.mypinpad.tsdk.isolation.getNavBarTextColor.f55919e
            int r1 = r1 + 19
            int r2 = r1 % 128
            int r1 = r1 % 2
            if (r1 == 0) goto La1
            return r0
        La1:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getNavBarTextColor.setX():com.mypinpad.tsdk.i.setAutoSizeTextTypeUniformWithPresetSizes");
    }
}
