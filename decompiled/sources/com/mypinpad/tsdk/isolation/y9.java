package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class y9 extends FunctionReferenceImpl implements Function1<byte[], Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f62007p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f62008q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f62009r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final byte[] f62010s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f62011t0 = 0;

    static {
        c();
        f62008q0 = 0;
        f62009r0 = 1;
        f62007p0 = new char[]{59043, 59133, 59134, 59128, 59129, 59129, 59083, 59127, 59108, 59131, 59130, 59128, 59082, 59082, 59130, 59106, 59108, 59109, 59106, 59116, 58953, 58951, 59006, 58955, 59006, 59269, 59292, 59295, 59269, 59293, 58989, 58989, 59283, 59293, 59282, 59295, 58990, 58978, 59280, 59280, 59283, 59281, 59284};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y9(Object obj) throws Throwable {
        Object[] objArr = new Object[1];
        a("\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001", false, new int[]{0, 19, 4, 0}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001", true, new int[]{19, 24, 157, 0}, objArr2);
        super(1, obj, ul.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010d A[PHI: r11
      0x010d: PHI (r11v2 char) = (r11v1 char), (r11v29 char) binds: [B:33:0x010b, B:30:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x012e  */
    /* JADX WARN: Code duplicated, block: B:38:0x012f A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:9:0x003d, B:13:0x00a2, B:12:0x005d, B:42:0x0190, B:46:0x01f8, B:49:0x020c, B:53:0x026d, B:52:0x0224, B:45:0x01b0, B:35:0x0110, B:39:0x0172, B:38:0x012f), top: B:78:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x018d  */
    /* JADX WARN: Code duplicated, block: B:44:0x01af  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b0 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:9:0x003d, B:13:0x00a2, B:12:0x005d, B:42:0x0190, B:46:0x01f8, B:49:0x020c, B:53:0x026d, B:52:0x0224, B:45:0x01b0, B:35:0x0110, B:39:0x0172, B:38:0x012f), top: B:78:0x003d }] */
    public static void a(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        int i12;
        char[] cArr;
        char c10;
        char c11;
        Map map;
        Object method;
        Map map2;
        Object method2;
        int i13 = f62009r0 + 105;
        f62008q0 = i13 % 128;
        if (i13 % 2 != 0) {
            str.getBytes("ISO-8859-1");
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i14 = 0;
        int i15 = iArr[0];
        int i16 = 1;
        int i17 = iArr[1];
        int i18 = iArr[2];
        int i19 = iArr[3];
        char[] cArr2 = f62007p0;
        byte[] bArr = f62010s0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i20 = f62008q0 + 123;
            f62009r0 = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (i22 < length) {
                try {
                    Object[] objArr2 = new Object[i16];
                    objArr2[i14] = Integer.valueOf(cArr2[i22]);
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-637734149);
                    if (method3 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.getDeadChar(i14, i14) + 37, 609 - Color.argb(i14, i14, i14, i14));
                        byte b10 = bArr[2];
                        byte b11 = (byte) (b10 - 3);
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        method3 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map3.put(-637734149, method3);
                    }
                    cArr3[i22] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i22++;
                    length = length;
                    cArr2 = cArr2;
                    i18 = i18;
                    i19 = i19;
                    i14 = 0;
                    i16 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i18;
            i11 = i19;
            cArr2 = cArr3;
        } else {
            i10 = i18;
            i11 = i19;
        }
        char[] cArr4 = new char[i17];
        System.arraycopy(cArr2, i15, cArr4, 0, i17);
        if (bytes != null) {
            int i23 = f62008q0 + 37;
            f62009r0 = i23 % 128;
            if (i23 % 2 == 0) {
                cArr = new char[i17];
                setnavigationonclicklistener.setX = 1;
                c10 = 1;
            } else {
                cArr = new char[i17];
                setnavigationonclicklistener.setX = 0;
                c10 = 0;
            }
            while (true) {
                int i24 = setnavigationonclicklistener.setX;
                if (i24 >= i17) {
                    break;
                }
                int i25 = f62009r0 + 19;
                f62008q0 = i25 % 128;
                if (i25 % 2 != 0) {
                    c11 = 1;
                    if (bytes[i24] == 1) {
                        char c12 = cArr4[i24];
                        Object[] objArr4 = new Object[2];
                        objArr4[c11] = Integer.valueOf(c10);
                        objArr4[0] = Integer.valueOf(c12);
                        map = setTextScaleX.setMaxEms;
                        method = map.get(1737824323);
                        if (method != null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) (Color.red(0) + 4449), 42 - (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1022);
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            Object[] objArr5 = new Object[1];
                            b(b12, b13, b13, objArr5);
                            String str2 = (String) objArr5[0];
                            Class<?> cls3 = Integer.TYPE;
                            method = cls2.getMethod(str2, cls3, cls3);
                            map.put(1737824323, method);
                        }
                        cArr[i24] = ((Character) ((Method) method).invoke(null, objArr4)).charValue();
                        int i26 = f62009r0 + 19;
                        f62008q0 = i26 % 128;
                        int i27 = i26 % 2;
                    } else {
                        Object[] objArr6 = {Integer.valueOf(cArr4[i24]), Integer.valueOf(c10)};
                        map2 = setTextScaleX.setMaxEms;
                        method2 = map2.get(-504758789);
                        if (method2 != null) {
                            Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 44, 2627 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            byte length2 = (byte) bArr.length;
                            byte b14 = (byte) (length2 - 4);
                            Object[] objArr7 = new Object[1];
                            b(length2, b14, b14, objArr7);
                            String str3 = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method2 = cls4.getMethod(str3, cls5, cls5);
                            map2.put(-504758789, method2);
                        }
                        cArr[i24] = ((Character) ((Method) method2).invoke(null, objArr6)).charValue();
                    }
                } else {
                    c11 = 1;
                    if (bytes[i24] == 1) {
                        char c13 = cArr4[i24];
                        Object[] objArr8 = new Object[2];
                        objArr8[c11] = Integer.valueOf(c10);
                        objArr8[0] = Integer.valueOf(c13);
                        map = setTextScaleX.setMaxEms;
                        method = map.get(1737824323);
                        if (method != null) {
                            Class cls6 = (Class) setTextScaleX.setX((char) (Color.red(0) + 4449), 42 - (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1022);
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr9 = new Object[1];
                            b(b15, b16, b16, objArr9);
                            String str4 = (String) objArr9[0];
                            Class<?> cls7 = Integer.TYPE;
                            method = cls6.getMethod(str4, cls7, cls7);
                            map.put(1737824323, method);
                        }
                        cArr[i24] = ((Character) ((Method) method).invoke(null, objArr8)).charValue();
                        int i28 = f62009r0 + 19;
                        f62008q0 = i28 % 128;
                        int i29 = i28 % 2;
                    } else {
                        Object[] objArr10 = {Integer.valueOf(cArr4[i24]), Integer.valueOf(c10)};
                        map2 = setTextScaleX.setMaxEms;
                        method2 = map2.get(-504758789);
                        if (method2 != null) {
                            Class cls8 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 44, 2627 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            byte length3 = (byte) bArr.length;
                            byte b17 = (byte) (length3 - 4);
                            Object[] objArr11 = new Object[1];
                            b(length3, b17, b17, objArr11);
                            String str5 = (String) objArr11[0];
                            Class<?> cls9 = Integer.TYPE;
                            method2 = cls8.getMethod(str5, cls9, cls9);
                            map2.put(-504758789, method2);
                        }
                        cArr[i24] = ((Character) ((Method) method2).invoke(null, objArr10)).charValue();
                    }
                }
                c10 = cArr[setnavigationonclicklistener.setX];
                Object[] objArr12 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls10 = (Class) setTextScaleX.setX((char) (31347 - KeyEvent.getDeadChar(0, 0)), 49 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (Process.myPid() >> 22) + 840);
                    byte b18 = (byte) (f62011t0 & 3);
                    byte b19 = (byte) (b18 - 1);
                    Object[] objArr13 = new Object[1];
                    b(b18, b19, b19, objArr13);
                    method4 = cls10.getMethod((String) objArr13[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr12);
            }
            cArr4 = cArr;
        }
        if (i11 > 0) {
            int i30 = f62009r0 + 109;
            f62008q0 = i30 % 128;
            int i31 = i30 % 2;
            char[] cArr5 = new char[i17];
            i12 = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i17);
            int i32 = i17 - i11;
            int i33 = i11;
            System.arraycopy(cArr5, 0, cArr4, i32, i33);
            System.arraycopy(cArr5, i33, cArr4, 0, i32);
        } else {
            i12 = 0;
        }
        if (z10) {
            char[] cArr6 = new char[i17];
            while (true) {
                setnavigationonclicklistener.setX = i12;
                int i34 = setnavigationonclicklistener.setX;
                if (i34 >= i17) {
                    break;
                }
                cArr6[i34] = cArr4[(i17 - i34) - 1];
                i12 = i34 + 1;
            }
            cArr4 = cArr6;
        }
        if (i10 > 0) {
            int i35 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i35;
                int i36 = setnavigationonclicklistener.setX;
                if (i36 >= i17) {
                    break;
                }
                cArr4[i36] = (char) (cArr4[i36] - iArr[2]);
                i35 = i36 + 1;
            }
        }
        objArr[0] = new String(cArr4);
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
    public static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r6 = 101 - r6
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.y9.f62010s0
            if (r2 != 0) goto L17
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L36
        L17:
            r3 = r1
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r6 = r6 + 1
            r4 = r2[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L36:
            int r6 = -r6
            int r6 = r6 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.y9.b(int, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f62010s0 = new byte[]{67, 9, 3, 91};
        f62011t0 = 69;
    }

    public final void d(@NotNull byte[] bArr) throws Throwable {
        Intrinsics.checkNotNullParameter(bArr, "");
        ul.setCompoundDrawableTintBlendMode((ul) this.receiver, bArr);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(byte[] bArr) throws Throwable {
        d(bArr);
        return Unit.INSTANCE;
    }
}
