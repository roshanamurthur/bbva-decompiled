package com.mypinpad.tsdk.isolation;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setMotionEventSplittingEnabled implements Closeable {
    public static int E0;
    public static int F0;
    public static int G0;
    public static int H0;
    public static final byte[] I0 = null;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final long f60138y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f60139p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f60140q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final execute f60141r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f60142s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public char[] f60143t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f60144u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f60145w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final getBeepOnSuccess f60146x0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "setOnFocusChangeListener", "(I)[B"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<Integer, byte[]> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60147q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60148r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ setRight f60149p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(setRight setright) {
            super(1);
            this.f60149p0 = setright;
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            byte[] y7;
            int i13 = (i11 * (-755)) + (i10 * (-755));
            int i14 = ~((~i10) | (~i11));
            int i15 = i10 | i11;
            if (((i15 | (~i12)) * 756) + (((~(i15 | i12)) | i14) * (-756)) + (i14 * 1512) + i13 != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i16 = f60148r0;
                int i17 = ((i16 | 45) << 1) - (i16 ^ 45);
                f60147q0 = i17 % 128;
                int i18 = i17 % 2;
                int iIntValue = ((Number) obj).intValue();
                y7 = (byte[]) a(new Object[]{aVar, Integer.valueOf(iIntValue)}, -1511927272, 1511927273, iIntValue);
                int i19 = f60147q0;
                int i20 = ((i19 ^ 123) | (i19 & 123)) << 1;
                int i21 = -(((~i19) & 123) | (i19 & (-124)));
                int i22 = (i20 & i21) + (i21 | i20);
                f60148r0 = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 97 / 0;
                }
            } else {
                a aVar2 = (a) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i24 = f60147q0;
                int i25 = (i24 | 39) << 1;
                int i26 = -(i24 ^ 39);
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                f60148r0 = i27 % 128;
                int i28 = i27 % 2;
                y7 = setRight.setY(aVar2.f60149p0, iIntValue2);
                int i29 = f60147q0;
                int i30 = (i29 & 9) + (i29 | 9);
                f60148r0 = i30 % 128;
                if (i30 % 2 == 0) {
                    int i31 = 88 / 0;
                }
            }
            return y7;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ byte[] invoke(Integer num) {
            return a(new Object[]{this, num}, -1133911786, 1133911786, System.identityHashCode(this));
        }
    }

    static {
        b();
        G0 = 0;
        H0 = 1;
        E0 = 0;
        F0 = 1;
        f60138y0 = 363181272497243790L;
    }

    public setMotionEventSplittingEnabled(@NotNull setRight setright, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(setright, "");
        this.f60139p0 = z10;
        this.f60140q0 = z11;
        this.f60141r0 = new execute();
        this.f60146x0 = new getBeepOnSuccess(new a(setright));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 110 - r8
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.setMotionEventSplittingEnabled.I0
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r8
            r3 = r2
            r8 = r7
            r7 = r6
            goto L30
        L18:
            r3 = r2
        L19:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L30:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setMotionEventSplittingEnabled.a(int, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        I0 = new byte[]{44, 117, 127, 10};
    }

    public static char c(char[] cArr, byte b10) {
        int i10 = E0 + 103;
        F0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(cArr, "");
        char c10 = cArr[b10];
        int i12 = E0 + 37;
        F0 = i12 % 128;
        int i13 = i12 % 2;
        return c10;
    }

    public static void d(char[] cArr, byte b10, char c10) {
        int i10 = E0 + 125;
        F0 = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cArr, "");
            cArr[b10] = c10;
        } else {
            Intrinsics.checkNotNullParameter(cArr, "");
            cArr[b10] = c10;
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0325  */
    /* JADX WARN: Code duplicated, block: B:63:0x0326  */
    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        char[] navBarTitleString;
        int i13;
        Throwable cause;
        long j10;
        int i14 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i15 = ~i11;
        int i16 = (((~((~i10) | i12)) | i15) * 301) + (((~(i15 | i12)) | (~((~i12) | i10))) * (-301)) + i14;
        int i17 = 0;
        int i18 = 2;
        if (i16 == 1) {
            setMotionEventSplittingEnabled setmotioneventsplittingenabled = (setMotionEventSplittingEnabled) objArr[0];
            char[] cArr = (char[]) objArr[1];
            int i19 = E0 + 91;
            F0 = i19 % 128;
            int i20 = i19 % 2;
            Intrinsics.checkNotNullParameter(cArr, "");
            setmotioneventsplittingenabled.f60143t0 = cArr;
            int i21 = F0 + 71;
            E0 = i21 % 128;
            if (i21 % 2 == 0) {
                return null;
            }
            throw null;
        }
        setMotionEventSplittingEnabled setmotioneventsplittingenabled2 = (setMotionEventSplittingEnabled) objArr[0];
        setmotioneventsplittingenabled2.getClass();
        int i22 = F0 + 23;
        int i23 = i22 % 128;
        E0 = i23;
        int i24 = i22 % 2;
        if (!setmotioneventsplittingenabled2.f60145w0) {
            setmotioneventsplittingenabled2.f60145w0 = true;
            int i25 = i23 + 9;
            F0 = i25 % 128;
            int i26 = i25 % 2;
            if (setmotioneventsplittingenabled2.f60139p0) {
                int i27 = i23 + 47;
                F0 = i27 % 128;
                int i28 = i27 % 2;
                navBarTitleString = setmotioneventsplittingenabled2.getNavBarTitleString();
                i13 = 2;
            } else {
                navBarTitleString = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
                int i29 = i23 + 19;
                F0 = i29 % 128;
                i13 = 2;
                int i30 = i29 % 2;
            }
            char[] navBarTitleString2 = setmotioneventsplittingenabled2.getNavBarTitleString();
            Object[] objArr2 = new Object[i13];
            objArr2[0] = setmotioneventsplittingenabled2;
            objArr2[1] = navBarTitleString2;
            setOnFocusChangeListener(objArr2, 634271129, -634271128, System.identityHashCode(setmotioneventsplittingenabled2));
            return navBarTitleString;
        }
        int i31 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3490;
        int i32 = H0 + 23;
        G0 = i32 % 128;
        if (i32 % 2 != 0) {
            "┠⢊㹮".toCharArray();
            throw null;
        }
        char[] charArray = "┠⢊㹮".toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i31;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i33 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i33 >= charArray.length) {
                break;
            }
            int i34 = H0 + 71;
            G0 = i34 % 128;
            int i35 = i34 % i18;
            long j11 = f60138y0;
            if (i35 != 0) {
                char c10 = charArray[i33];
                try {
                    Object[] objArr3 = new Object[3];
                    objArr3[i18] = setlayoutanimation;
                    objArr3[1] = setlayoutanimation;
                    objArr3[i17] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i17)), 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1195 - (KeyEvent.getMaxKeyCode() >> 16));
                        byte b10 = (byte) i17;
                        byte b11 = b10;
                        Object[] objArr4 = new Object[1];
                        a(b10, b11, b11, objArr4);
                        method = cls.getMethod((String) objArr4[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i33] = ((Long) ((Method) method).invoke(null, objArr3)).longValue() + (j11 ^ 1779209353347916695L);
                    Object[] objArr5 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 44 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 728);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr6 = new Object[1];
                        a(b12, b13, (byte) (b13 + 1), objArr6);
                        method2 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(645183118, method2);
                    }
                    ((Method) method2).invoke(null, objArr5);
                    j10 = 0;
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            } else {
                Object[] objArr7 = {Integer.valueOf(charArray[i33]), setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(-764403778);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getJumpTapTimeout() >> 16) + 33, 1195 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr8 = new Object[1];
                    a(b14, b15, b15, objArr8);
                    method3 = cls3.getMethod((String) objArr8[0], Integer.TYPE, Object.class, Object.class);
                    map2.put(-764403778, method3);
                }
                jArr[i33] = ((Long) ((Method) method3).invoke(null, objArr7)).longValue() ^ (j11 ^ 1779209353347916695L);
                Object[] objArr9 = {setlayoutanimation, setlayoutanimation};
                Object method4 = map2.get(645183118);
                if (method4 != null) {
                    j10 = 0;
                } else {
                    j10 = 0;
                    Class cls4 = (Class) setTextScaleX.setX((char) View.resolveSizeAndState(0, 0, 0), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 729 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr10 = new Object[1];
                    a(b16, b17, (byte) (b17 + 1), objArr10);
                    method4 = cls4.getMethod((String) objArr10[0], Object.class, Object.class);
                    map2.put(645183118, method4);
                }
                ((Method) method4).invoke(null, objArr9);
            }
            i17 = 0;
            i18 = 2;
            cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
        char[] cArr2 = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        int i36 = H0 + 97;
        G0 = i36 % 128;
        int i37 = i36 % 2;
        while (true) {
            int i38 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i38 >= charArray.length) {
                throw new IllegalStateException(n1.f(cArr2));
            }
            int i39 = G0 + 113;
            H0 = i39 % 128;
            if (i39 % 2 == 0) {
                cArr2[i38] = (char) jArr[i38];
                Object[] objArr11 = {setlayoutanimation, setlayoutanimation};
                Map map3 = setTextScaleX.setMaxEms;
                Object method5 = map3.get(645183118);
                if (method5 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) KeyEvent.normalizeMetaState(0), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 728 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    byte b18 = (byte) 0;
                    byte b19 = b18;
                    Object[] objArr12 = new Object[1];
                    a(b18, b19, (byte) (b19 + 1), objArr12);
                    method5 = cls5.getMethod((String) objArr12[0], Object.class, Object.class);
                    map3.put(645183118, method5);
                }
                ((Method) method5).invoke(null, objArr11);
                int i40 = 10 / 0;
            } else {
                cArr2[i38] = (char) jArr[i38];
                Object[] objArr13 = {setlayoutanimation, setlayoutanimation};
                Map map4 = setTextScaleX.setMaxEms;
                Object method6 = map4.get(645183118);
                if (method6 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) ((-1) - MotionEvent.axisFromString("")), 44 - View.combineMeasuredStates(0, 0), 728 - KeyEvent.keyCodeFromString(""));
                    byte b20 = (byte) 0;
                    byte b21 = b20;
                    Object[] objArr14 = new Object[1];
                    a(b20, b21, (byte) (b21 + 1), objArr14);
                    method6 = cls6.getMethod((String) objArr14[0], Object.class, Object.class);
                    map4.put(645183118, method6);
                }
                ((Method) method6).invoke(null, objArr13);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = E0 + 29;
        F0 = i10 % 128;
        int i11 = i10 % 2;
        this.f60142s0 = true;
        execute executeVar = this.f60141r0;
        execute.setDividerPadding(new Object[]{executeVar}, -928336311, 928336316, System.identityHashCode(executeVar));
        char[] compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode();
        Iterator<Integer> it = ArraysKt___ArraysKt.getIndices(compoundDrawableTintBlendMode).iterator();
        while (it.hasNext()) {
            compoundDrawableTintBlendMode[((IntIterator) it).nextInt()] = (char) Random.INSTANCE.nextInt();
        }
        int i12 = F0 + 5;
        E0 = i12 % 128;
        int i13 = i12 % 2;
    }

    @NotNull
    public final char[] getNavBarTitleString() {
        int i10 = F0 + 1;
        E0 = i10 % 128;
        int i11 = i10 % 2;
        byte b10 = 10;
        char[] cArr = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        while (b10 > 1) {
            int i12 = E0 + 101;
            F0 = i12 % 128;
            int i13 = i12 % 2;
            getBeepOnSuccess getbeeponsuccess = this.f60146x0;
            byte bByteValue = ((Byte) getBeepOnSuccess.setCompoundDrawableTintBlendMode(new Object[]{getbeeponsuccess, Byte.valueOf(b10)}, 408057020, -408057019, System.identityHashCode(getbeeponsuccess))).byteValue();
            char c10 = c(cArr, bByteValue);
            b10 = (byte) (b10 - 1);
            d(cArr, bByteValue, c(cArr, b10));
            d(cArr, b10, c10);
            int i14 = E0 + 51;
            F0 = i14 % 128;
            int i15 = i14 % 2;
        }
        this.f60144u0++;
        return cArr;
    }

    @NotNull
    public final char[] setCompoundDrawableTintBlendMode() {
        int i10 = F0;
        int i11 = i10 + 77;
        E0 = i11 % 128;
        int i12 = i11 % 2;
        char[] cArr = this.f60143t0;
        if (cArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i13 = i10 + 67;
        E0 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 69 / 0;
        }
        return cArr;
    }

    public final boolean setDividerPadding() {
        int i10 = E0;
        int i11 = i10 + 63;
        F0 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = this.f60142s0;
        int i13 = i10 + 27;
        F0 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    @NotNull
    public final setCompoundDrawableTintBlendMode setNavigationOnClickListener() throws setRotation {
        int i10 = E0 + 33;
        F0 = i10 % 128;
        if (i10 % 2 == 0) {
            setOnDragListener();
            throw null;
        }
        if (!setOnDragListener()) {
            throw new setRotation(902);
        }
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode(this.v0, this.f60141r0);
        int i11 = E0 + 23;
        F0 = i11 % 128;
        int i12 = i11 % 2;
        return setcompounddrawabletintblendmode;
    }

    public final boolean setOnDragListener() {
        int i10 = F0 + 25;
        E0 = i10 % 128;
        int i11 = i10 % 2;
        execute executeVar = this.f60141r0;
        if (executeVar.size() < 4 && (!this.f60140q0 || executeVar.size() != 0)) {
            return false;
        }
        int i12 = E0 + 101;
        F0 = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    @NotNull
    public final execute setX() {
        int i10 = E0 + 3;
        F0 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f60141r0;
        }
        throw null;
    }

    @NotNull
    public final char[] setY() {
        return (char[]) setOnFocusChangeListener(new Object[]{this}, -993480851, 993480851, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull char[] cArr) throws Throwable {
        setOnFocusChangeListener(new Object[]{this, cArr}, 634271129, -634271128, System.identityHashCode(this));
    }

    public static final class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f60150c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final execute f60152b;

        public setCompoundDrawableTintBlendMode(int i10, @NotNull execute executeVar) {
            Intrinsics.checkNotNullParameter(executeVar, "");
            this.f60151a = i10;
            this.f60152b = executeVar;
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i12;
            int i15 = i13 | i14;
            int i16 = ~(i15 | i11);
            int i17 = ~i11;
            int i18 = i14 | i17;
            if (((i10 | i11) * 184) + (((~i18) | (~(i13 | i17)) | (~i15)) * 184) + ((i16 | (~(i18 | i10))) * (-184)) + (i11 * (-183)) + (i10 * (-183)) != 1) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
                int i19 = f60150c;
                int i20 = ((i19 & 94) + (i19 | 94)) - 1;
                int i21 = i20 % 128;
                int i22 = i20 % 2;
                execute executeVar = setcompounddrawabletintblendmode.f60152b;
                int i23 = (i19 & (-74)) | ((~i19) & 73);
                int i24 = (i19 & 73) << 1;
                int i25 = (i23 & i24) + (i24 | i23);
                int i26 = i25 % 128;
                if (i25 % 2 == 0) {
                    return executeVar;
                }
                throw null;
            }
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) objArr[0];
            int i27 = f60150c;
            int i28 = i27 & 119;
            int i29 = -(-(i27 | 119));
            int i30 = (i28 & i29) + (i29 | i28);
            int i31 = i30 % 128;
            int i32 = i30 % 2;
            int i33 = setcompounddrawabletintblendmode2.f60151a;
            int i34 = i31 & 71;
            int i35 = (i31 ^ 71) | i34;
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            f60150c = i36 % 128;
            int i37 = i36 % 2;
            return Integer.valueOf(i33);
        }

        public final int setX() {
            return ((Integer) setY(new Object[]{this}, 741559397, -741559396, System.identityHashCode(this))).intValue();
        }

        @NotNull
        public final execute setY() {
            return (execute) setY(new Object[]{this}, -212655959, 212655959, System.identityHashCode(this));
        }
    }

    public final void setOnFocusChangeListener() throws Throwable {
        int i10 = F0 + 37;
        E0 = i10 % 128;
        int i11 = i10 % 2;
        if (!this.f60142s0) {
            execute executeVar = this.f60141r0;
            if (executeVar.isEmpty()) {
                int i12 = E0 + 9;
                F0 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                return;
            }
            executeVar.clear();
            this.v0 = this.f60144u0;
            setOnFocusChangeListener(new Object[]{this, getNavBarTitleString()}, 634271129, -634271128, System.identityHashCode(this));
            return;
        }
        throw new setRotation(TypedValues.Custom.TYPE_INT);
    }
}
