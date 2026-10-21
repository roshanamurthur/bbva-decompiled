package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "c", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
final class b8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char[] f54270q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f54271r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final boolean f54272s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final boolean f54273t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54274u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f54275w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f54276x0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ getTotalElapsedTimeout[] f54277p0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/getTotalElapsedTimeout;", "Lcom/mypinpad/tsdk/i/mo;", "setX", "(Lcom/mypinpad/tsdk/i/getTotalElapsedTimeout;)Lcom/mypinpad/tsdk/i/mo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<getTotalElapsedTimeout, mo> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f54278p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f54279q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f54280r0 = 1;

        static {
            int i10 = f54280r0;
            int i11 = ((i10 | 105) << 1) - (i10 ^ 105);
            f54279q0 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ mo a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~i12;
            if ((((~(i14 | i15)) | i13) * 68) + ((~(i11 | i13 | i15)) * (-68)) + (((~(i10 | i11)) | (~(i13 | i14 | i15)) | (~(i12 | i11))) * (-68)) + (i11 * (-67)) + (i10 * 69) == 1) {
                getTotalElapsedTimeout gettotalelapsedtimeout = (getTotalElapsedTimeout) objArr[1];
                Intrinsics.checkNotNullParameter(gettotalelapsedtimeout, "");
                mo moVar = new mo(new a8(gettotalelapsedtimeout));
                int i16 = f54280r0 + 85;
                f54279q0 = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 68 / 0;
                }
                return moVar;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i18 = f54279q0;
            int i19 = i18 & 125;
            int i20 = i19 + ((i18 ^ 125) | i19);
            f54280r0 = i20 % 128;
            int i21 = i20 % 2;
            mo moVarA = a(new Object[]{aVar, (getTotalElapsedTimeout) obj}, 1723121894, -1723121893, System.identityHashCode(aVar));
            int i22 = f54280r0 + 103;
            f54279q0 = i22 % 128;
            if (i22 % 2 == 0) {
                return moVarA;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ mo invoke(getTotalElapsedTimeout gettotalelapsedtimeout) {
            return a(new Object[]{this, gettotalelapsedtimeout}, 1076157106, -1076157106, System.identityHashCode(this));
        }
    }

    static {
        b();
        f54275w0 = 0;
        f54274u0 = 0;
        v0 = 1;
        f54272s0 = true;
        f54273t0 = true;
        f54271r0 = 1794962285;
        f54270q0 = new char[]{62205, 62207, 62202, 62192, 62177, 62196, 62206};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(getTotalElapsedTimeout[] gettotalelapsedtimeoutArr) {
        super(1);
        this.f54277p0 = gettotalelapsedtimeoutArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r7 = r7 * 2
            int r7 = 122 - r7
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.b8.f54276x0
            if (r2 != 0) goto L1a
            r7 = r8
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            goto L38
        L1a:
            r3 = r1
        L1b:
            int r9 = r9 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2a:
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
        L38:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.b8.a(int, short, short, java.lang.Object[]):void");
    }

    public static void b() {
        f54276x0 = new byte[]{89, 113, 13, -86};
    }

    public final void c(@NotNull mo moVar) throws Throwable {
        int i10;
        char[] cArr;
        Intrinsics.checkNotNullParameter(moVar, "");
        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 127;
        byte[] bytes = "\u0087\u0084\u0086\u0085\u0082\u0084\u0081\u0083\u0082\u0081".getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr2 = f54270q0;
        int i11 = 0;
        int i12 = 2;
        if (cArr2 != null) {
            int i13 = f54275w0;
            int i14 = i13 + 39;
            int i15 = i14 % 128;
            int i16 = i14 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i17 = i13 + 105;
            int i18 = i17 % 128;
            int i19 = i17 % 2;
            int i20 = 0;
            while (i20 < length) {
                int i21 = f54275w0 + 45;
                int i22 = i21 % 128;
                int i23 = i21 % i12;
                try {
                    Object[] objArr = new Object[1];
                    objArr[i11] = Integer.valueOf(cArr2[i20]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0', i11) + 26289), 64 - TextUtils.indexOf("", ""), Color.blue(i11) + 1595);
                        byte b10 = (byte) i11;
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr2 = new Object[1];
                        a((byte) (b11 + 3), b10, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr3[i20] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i20++;
                    cArr2 = cArr2;
                    i11 = 0;
                    i12 = 2;
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
        Object[] objArr3 = {Integer.valueOf(f54271r0)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (10744 - View.MeasureSpec.getMode(0)), 42 - MotionEvent.axisFromString(""), 566 - KeyEvent.normalizeMetaState(0));
            byte b12 = (byte) 0;
            byte b13 = (byte) (b12 - 1);
            Object[] objArr4 = new Object[1];
            a((byte) (-b13), b12, b13, objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (!f54273t0) {
            if (!f54272s0) {
                throw null;
            }
            int i24 = f54275w0 + 17;
            int i25 = i24 % 128;
            int i26 = i24 % 2;
            throw null;
        }
        int i27 = f54275w0 + 69;
        int i28 = i27 % 128;
        if (i27 % 2 == 0) {
            int length2 = bytes.length;
            setz.setOnFocusChangeListener = length2;
            cArr = new char[length2];
            i10 = 0;
        } else {
            i10 = 0;
            int length3 = bytes.length;
            setz.setOnFocusChangeListener = length3;
            cArr = new char[length3];
        }
        setz.setDividerPadding = i10;
        while (true) {
            int i29 = setz.setDividerPadding;
            int i30 = setz.setOnFocusChangeListener;
            if (i29 >= i30) {
                break;
            }
            cArr[i29] = (char) (cArr2[bytes[(i30 - 1) - i29] + maxKeyCode] - iIntValue);
            Object[] objArr5 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) View.getDefaultSize(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 51, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2879);
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr6 = new Object[1];
                a((byte) (b15 + 1), b14, b15, objArr6);
                method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr5);
        }
        mo.setY(new Object[]{moVar, n1.f(cArr), new mn(this.f54277p0, a.f54278p0)}, 733397612, -733397606, System.identityHashCode(moVar));
        int i31 = f54274u0 + 15;
        v0 = i31 % 128;
        if (i31 % 2 == 0) {
            int i32 = 20 / 0;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f54274u0 + 107;
        v0 = i10 % 128;
        int i11 = i10 % 2;
        c(moVar);
        Unit unit = Unit.INSTANCE;
        int i12 = v0 + 59;
        f54274u0 = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }
}
