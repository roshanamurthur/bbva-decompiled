package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
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
final class v7 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int[] f61464q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61465r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61466s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final byte[] f61467t0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setOnTouchListener[] f61468p0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setOnTouchListener;", "Lcom/mypinpad/tsdk/i/mo;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/setOnTouchListener;)Lcom/mypinpad/tsdk/i/mo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<setOnTouchListener, mo> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f61469p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61470q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f61471r0;

        static {
            int i10 = f61470q0;
            int i11 = ((i10 ^ 10) + ((i10 & 10) << 1)) - 1;
            f61471r0 = i11 % 128;
            int i12 = i11 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ mo a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i13 | i11);
            int i15 = ~(i13 | i12);
            int i16 = ~i11;
            int i17 = ((i15 | (~(i16 | i12))) * 140) + ((i14 | i15) * (-280)) + (i11 * (-139)) + (i10 * 141);
            int i18 = ~(i13 | i16 | i12);
            int i19 = ~i12;
            int i20 = (((~(i10 | i19 | i16)) | (~(i11 | i13 | i19)) | i18) * 140) + i17;
            int i21 = f61471r0;
            if (i20 != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i22 = i21 + 83;
                f61470q0 = i22 % 128;
                setOnTouchListener setontouchlistener = (setOnTouchListener) obj;
                if (i22 % 2 == 0) {
                    return a(new Object[]{aVar, setontouchlistener}, -687592460, 687592461, System.identityHashCode(aVar));
                }
                a(new Object[]{aVar, setontouchlistener}, -687592460, 687592461, System.identityHashCode(aVar));
                throw null;
            }
            setOnTouchListener setontouchlistener2 = (setOnTouchListener) objArr[1];
            Intrinsics.checkNotNullParameter(setontouchlistener2, "");
            mo moVar = new mo(new u7(setontouchlistener2));
            int i23 = (i21 ^ 107) + ((i21 & 107) << 1);
            f61470q0 = i23 % 128;
            if (i23 % 2 == 0) {
                return moVar;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ mo invoke(setOnTouchListener setontouchlistener) {
            return a(new Object[]{this, setontouchlistener}, 1930706194, -1930706194, System.identityHashCode(this));
        }
    }

    static {
        b();
        f61465r0 = 0;
        f61466s0 = 1;
        f61464q0 = new int[]{-495796485, -2044902026, -1640153204, -171917937, -640955022, -126919430, 1227823382, -1911707143, -598309907, -1866718540, -2127253028, 51125544, 1157082541, -1320538240, -1078392621, 891837192, 1825063804, 639519452};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(setOnTouchListener[] setontouchlistenerArr) {
        super(1);
        this.f61468p0 = setontouchlistenerArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r5 = r5 * 4
            int r5 = 108 - r5
            byte[] r0 = new byte[r0]
            r1 = -1
            byte[] r2 = com.mypinpad.tsdk.isolation.v7.f61467t0
            if (r2 != 0) goto L19
            r5 = r7
            r3 = r2
            r7 = r6
            r2 = r1
            r1 = r0
            r0 = r8
            r8 = r5
            goto L38
        L19:
            r4 = r7
            r7 = r5
            r5 = r4
        L1c:
            int r1 = r1 + 1
            int r6 = r6 + 1
            byte r3 = (byte) r7
            r0[r1] = r3
            if (r1 != r5) goto L2e
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L2e:
            r3 = r2[r6]
            r4 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r8
            r8 = r4
        L38:
            int r6 = r6 + r8
            r8 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r4 = r7
            r7 = r6
            r6 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.v7.a(int, int, int, java.lang.Object[]):void");
    }

    public static void b() {
        f61467t0 = new byte[]{76, 17, -23, -60};
    }

    public final void c(@NotNull mo moVar) throws Throwable {
        int i10;
        int[] iArr;
        char[] cArr;
        Object method;
        int length;
        int[] iArr2;
        int i11;
        int length2;
        int i12;
        Intrinsics.checkNotNullParameter(moVar, "");
        int[] iArr3 = {-453553111, -732944294, -1948692214, 1386719571};
        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 7;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[8];
        int i13 = 0;
        int i14 = 1;
        int[] iArr4 = f61464q0;
        if (iArr4 != null) {
            int i15 = f61466s0 + 77;
            f61465r0 = i15 % 128;
            if (i15 % 2 != 0) {
                length2 = iArr4.length;
                iArr = new int[length2];
                i12 = 1;
            } else {
                length2 = iArr4.length;
                iArr = new int[length2];
                i12 = 0;
            }
            while (i12 < length2) {
                try {
                    Object[] objArr = new Object[i14];
                    objArr[i13] = Integer.valueOf(iArr4[i12]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method2 = map.get(1833429914);
                    if (method2 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Color.rgb(i13, i13, i13) + 16777216), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 728);
                        byte b10 = (byte) 1;
                        byte b11 = (byte) (-b10);
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, (byte) (b11 + 1), objArr2);
                        method2 = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(1833429914, method2);
                    }
                    iArr[i12] = ((Integer) ((Method) method2).invoke(null, objArr)).intValue();
                    i12++;
                    length2 = length2;
                    jumpTapTimeout = jumpTapTimeout;
                    i13 = 0;
                    i14 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = jumpTapTimeout;
        } else {
            i10 = jumpTapTimeout;
            iArr = iArr4;
        }
        int length3 = iArr.length;
        int[] iArr5 = new int[length3];
        if (iArr4 != null) {
            int i16 = f61466s0 + 43;
            f61465r0 = i16 % 128;
            if (i16 % 2 != 0) {
                length = iArr4.length;
                iArr2 = new int[length];
                i11 = 1;
            } else {
                length = iArr4.length;
                iArr2 = new int[length];
                i11 = 0;
            }
            while (i11 < length) {
                int i17 = f61465r0 + 109;
                f61466s0 = i17 % 128;
                int i18 = i17 % 2;
                Object[] objArr3 = {Integer.valueOf(iArr4[i11])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1833429914);
                if (method3 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "", 0) + 44, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 728);
                    byte b12 = (byte) 1;
                    byte b13 = (byte) (-b12);
                    Object[] objArr4 = new Object[1];
                    a(b12, b13, (byte) (b13 + 1), objArr4);
                    method3 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                    map2.put(1833429914, method3);
                }
                iArr2[i11] = ((Integer) ((Method) method3).invoke(null, objArr3)).intValue();
                i11++;
                length = length;
                iArr4 = iArr4;
                cArr3 = cArr3;
            }
            cArr = cArr3;
            iArr4 = iArr2;
        } else {
            cArr = cArr3;
        }
        System.arraycopy(iArr4, 0, iArr5, 0, length3);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i19 = setonlongclicklistener.setDividerPadding;
            if (i19 >= 4) {
                mo.setY(new Object[]{moVar, new String(cArr, 0, i10).intern(), new mn(this.f61468p0, a.f61469p0)}, 733397612, -733397606, System.identityHashCode(moVar));
                return;
            }
            int i20 = f61465r0 + 73;
            f61466s0 = i20 % 128;
            int i21 = i20 % 2;
            int i22 = iArr3[i19];
            char c10 = (char) (i22 >> 16);
            cArr2[0] = c10;
            char c11 = (char) i22;
            cArr2[1] = c11;
            int i23 = iArr3[i19 + 1];
            char c12 = (char) (i23 >> 16);
            cArr2[2] = c12;
            char c13 = (char) i23;
            cArr2[3] = c13;
            setonlongclicklistener.setY = (c10 << 16) + c11;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c12 << 16) + c13;
            setOnLongClickListener.setX(iArr5);
            int i24 = 0;
            for (int i25 = 16; i24 < i25; i25 = 16) {
                int i26 = f61466s0 + 115;
                f61465r0 = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = setonlongclicklistener.setY ^ iArr5[i24];
                    setonlongclicklistener.setY = i27;
                    Object[] objArr5 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i27)), setonlongclicklistener, setonlongclicklistener};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method4 = map3.get(-350984188);
                    if (method4 == null) {
                        method4 = ((Class) setTextScaleX.setX((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 40 - TextUtils.lastIndexOf("", '0', 0, 0), 179 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map3.put(-350984188, method4);
                    }
                    int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr5)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                    i24 += 122;
                } else {
                    int i28 = setonlongclicklistener.setY ^ iArr5[i24];
                    setonlongclicklistener.setY = i28;
                    Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i28)), setonlongclicklistener, setonlongclicklistener};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object obj = map4.get(-350984188);
                    if (obj != null) {
                        method = obj;
                    } else {
                        method = ((Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 41, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 179)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map4.put(-350984188, method);
                    }
                    int iIntValue2 = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue2;
                    i24++;
                }
            }
            int i29 = setonlongclicklistener.setY;
            int i30 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i31 = i29 ^ iArr5[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i31;
            int i32 = i30 ^ iArr5[17];
            setonlongclicklistener.setY = i32;
            cArr2[0] = (char) (i32 >>> 16);
            cArr2[1] = (char) i32;
            cArr2[2] = (char) (i31 >>> 16);
            cArr2[3] = (char) i31;
            setOnLongClickListener.setX(iArr5);
            int i33 = setonlongclicklistener.setDividerPadding * 2;
            cArr[i33] = cArr2[0];
            cArr[i33 + 1] = cArr2[1];
            cArr[i33 + 2] = cArr2[2];
            cArr[i33 + 3] = cArr2[3];
            Object[] objArr7 = {setonlongclicklistener, setonlongclicklistener};
            Map map5 = setTextScaleX.setMaxEms;
            Object method5 = map5.get(-147294223);
            if (method5 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.green(0) + 41, TextUtils.getOffsetAfter("", 0) + 483);
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr8 = new Object[1];
                a(b14, b15, (byte) (b15 + 1), objArr8);
                method5 = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                map5.put(-147294223, method5);
            }
            ((Method) method5).invoke(null, objArr7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        c(moVar);
        return Unit.INSTANCE;
    }
}
