package com.mypinpad.tsdk.isolation;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
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
final /* synthetic */ class z9 extends FunctionReferenceImpl implements Function1<byte[], Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f62288p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f62289q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final boolean f62290r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final boolean f62291s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f62292t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f62293u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f62294w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f62295x0 = null;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f62296y0 = 0;

    static {
        c();
        v0 = 0;
        f62294w0 = 1;
        f62292t0 = 0;
        f62293u0 = 1;
        f62290r0 = true;
        f62291s0 = true;
        f62289q0 = 1794962379;
        f62288p0 = new char[]{62291, 62250, 62297, 62255, 62295, 62254, 62264, 62290, 62269, 62298, 62302, 62300, 62303, 62240, 62267, 62227, 62244, 62221, 62226, 62241};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z9(Object obj) throws Throwable {
        Object[] objArr = new Object[1];
        a(127 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0083\u0088\u008f\u0081\u008d\u0088\u008e\u008d\u008c\u0086\u008b\u008a\u0086\u0089\u0086\u0083\u0088\u0085\u0083\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, "\u0094\u0093\u0092\u0091\u0090\u0083\u0088\u008f\u0081\u008d\u0088\u008e\u008d\u008c\u0086\u008b\u008a\u0086\u0089\u0086\u0083\u0088\u0085\u0083\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
        super(1, obj, ul.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        int i11 = f62294w0 + 85;
        v0 = i11 % 128;
        int i12 = 2;
        char c10 = 0;
        if (i11 % 2 != 0) {
            int i13 = 75 / 0;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = f62288p0;
        if (cArr != null) {
            int i14 = f62294w0 + 95;
            v0 = i14 % 128;
            int i15 = i14 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                int i17 = v0 + 9;
                f62294w0 = i17 % 128;
                int i18 = i17 % i12;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i16])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 26288), TextUtils.getCapsMode("", 0, 0) + 64, 1595 - (ViewConfiguration.getTouchSlop() >> 8));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b11, b10, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16++;
                    i12 = 2;
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
        Object[] objArr4 = {Integer.valueOf(f62289q0)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        int i19 = f62296y0;
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (10743 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getTapTimeout() >> 16) + 43, 565 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            byte b12 = (byte) (i19 & 5);
            byte b13 = (byte) (b12 - 1);
            Object[] objArr5 = new Object[1];
            b(b13, b12, b13, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!f62291s0) {
            if (!f62290r0) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i20 = setz.setDividerPadding;
            int i21 = setz.setOnFocusChangeListener;
            if (i20 >= i21) {
                objArr[0] = new String(cArr3);
                return;
            }
            int i22 = f62294w0 + 53;
            v0 = i22 % 128;
            int i23 = i22 % 2;
            cArr3[i20] = (char) (cArr[bytes[(i21 - 1) - i20] + i10] - iIntValue);
            Object[] objArr6 = new Object[2];
            objArr6[1] = setz;
            objArr6[c10] = setz;
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 51 - KeyEvent.keyCodeFromString(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2879);
                byte b14 = (byte) (i19 & 6);
                byte b15 = (byte) (b14 - 2);
                Object[] objArr7 = new Object[1];
                b(b15, b14, b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            c10 = 0;
        }
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
    public static void b(byte r8, short r9, short r10, java.lang.Object[] r11) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 118
            int r10 = r10 * 4
            int r10 = r10 + 1
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r0 = new byte[r10]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.z9.f62295x0
            if (r2 != 0) goto L1a
            r9 = r8
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r11
            r11 = r10
            goto L35
        L1a:
            r3 = r1
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r10) goto L2a
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0, r1)
            r11[r1] = r8
            return
        L2a:
            r3 = r2[r8]
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = r11
            r11 = r10
            r10 = r3
            r3 = r2
            r2 = r0
            r0 = r7
        L35:
            int r8 = r8 + r10
            int r9 = r9 + 1
            r10 = r11
            r11 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.z9.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f62295x0 = new byte[]{24, 55, -101, -128};
        f62296y0 = 203;
    }

    public final void d(@NotNull byte[] bArr) throws Throwable {
        int i10 = f62293u0 + 69;
        f62292t0 = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            ul.setY((ul) this.receiver, bArr);
            int i11 = 1 / 0;
        } else {
            Intrinsics.checkNotNullParameter(bArr, "");
            ul.setY((ul) this.receiver, bArr);
        }
        int i12 = f62293u0 + 7;
        f62292t0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(byte[] bArr) throws Throwable {
        int i10 = f62292t0 + 95;
        f62293u0 = i10 % 128;
        int i11 = i10 % 2;
        d(bArr);
        Unit unit = Unit.INSTANCE;
        int i12 = f62292t0 + 107;
        f62293u0 = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }
}
