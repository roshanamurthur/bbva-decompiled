package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
final class i8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f56353q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56354r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56355s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f56356t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f56357u0;
    public static final byte[] v0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setOverScrollMode[] f56358p0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setOverScrollMode;", "Lcom/mypinpad/tsdk/i/mo;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setOverScrollMode;)Lcom/mypinpad/tsdk/i/mo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<setOverScrollMode, mo> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56359p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56360q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56361r0 = 1;

        static {
            int i10 = f56360q0;
            int i11 = i10 & 19;
            int i12 = (i10 ^ 19) | i11;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f56361r0 = i13 % 128;
            int i14 = i13 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ mo a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = (((~((~i10) | i12)) | i13) * (-318)) + (i11 * (-317)) + (i10 * 319);
            int i15 = ~(i13 | i12);
            int i16 = ~i12;
            if ((((~(i10 | i11 | i12)) | (~(i13 | i16 | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + ((i15 | (~(i16 | i10 | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i14 == 1) {
                setOverScrollMode setoverscrollmode = (setOverScrollMode) objArr[1];
                Intrinsics.checkNotNullParameter(setoverscrollmode, "");
                mo moVar = new mo(new h8(setoverscrollmode));
                int i17 = f56360q0;
                int i18 = (i17 & 25) + (i17 | 25);
                f56361r0 = i18 % 128;
                if (i18 % 2 != 0) {
                    return moVar;
                }
                throw null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i19 = f56361r0;
            int i20 = (-2) - (((i19 & 108) + (i19 | 108)) ^ (-1));
            f56360q0 = i20 % 128;
            setOverScrollMode setoverscrollmode2 = (setOverScrollMode) obj;
            if (i20 % 2 != 0) {
                a(new Object[]{aVar, setoverscrollmode2}, -1213556085, 1213556086, System.identityHashCode(aVar));
                throw null;
            }
            mo moVarA = a(new Object[]{aVar, setoverscrollmode2}, -1213556085, 1213556086, System.identityHashCode(aVar));
            int i21 = f56360q0;
            int i22 = ((i21 | 51) << 1) - (i21 ^ 51);
            f56361r0 = i22 % 128;
            int i23 = i22 % 2;
            return moVarA;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ mo invoke(setOverScrollMode setoverscrollmode) {
            return a(new Object[]{this, setoverscrollmode}, 1176460094, -1176460094, System.identityHashCode(this));
        }
    }

    static {
        b();
        f56356t0 = 0;
        f56357u0 = 1;
        f56354r0 = 0;
        f56355s0 = 1;
        f56353q0 = -4115832177319050673L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(setOverScrollMode[] setoverscrollmodeArr) {
        super(1);
        this.f56358p0 = setoverscrollmodeArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = r6 * 3
            int r6 = 110 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.i8.v0
            if (r2 != 0) goto L19
            r6 = r8
            r4 = r1
            r3 = r2
            r8 = r7
            r2 = r0
            r0 = r9
            r9 = r6
            goto L37
        L19:
            r3 = r1
            r5 = r8
            r8 = r6
            r6 = r5
        L1d:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2e:
            r3 = r2[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L37:
            int r7 = r7 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.i8.a(int, byte, int, java.lang.Object[]):void");
    }

    public static void b() {
        v0 = new byte[]{82, -15, 113, 17};
    }

    /* JADX WARN: Code duplicated, block: B:56:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x02f0  */
    public final void c(@NotNull mo moVar) throws Throwable {
        Throwable cause;
        Intrinsics.checkNotNullParameter(moVar, "");
        char c10 = 0;
        int offsetAfter = 53927 - TextUtils.getOffsetAfter("", 0);
        int i10 = f56356t0 + 33;
        f56357u0 = i10 % 128;
        int i11 = 2;
        int i12 = i10 % 2;
        char[] charArray = "憹댜쓢ᙄ⬲糲蹆ꌠ\uf485ٴ".toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = offsetAfter;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        int i13 = f56356t0 + 83;
        f56357u0 = i13 % 128;
        int i14 = i13 % 2;
        while (true) {
            int i15 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i15 >= charArray.length) {
                break;
            }
            int i16 = f56357u0 + 119;
            f56356t0 = i16 % 128;
            int i17 = i16 % i11;
            long j10 = f56353q0;
            if (i17 != 0) {
                char c11 = charArray[i15];
                try {
                    Object[] objArr = new Object[3];
                    objArr[i11] = setlayoutanimation;
                    objArr[1] = setlayoutanimation;
                    objArr[c10] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 33 - TextUtils.indexOf("", ""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1195);
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr2 = new Object[1];
                        a(b11, b10, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i15] = ((Long) ((Method) method).invoke(null, objArr)).longValue() ^ (j10 - 1779209353347916695L);
                    Object[] objArr3 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) Color.blue(0), View.combineMeasuredStates(0, 0) + 44, TextUtils.indexOf("", "", 0, 0) + 728);
                        byte b12 = (byte) (-1);
                        byte b13 = (byte) (-b12);
                        Object[] objArr4 = new Object[1];
                        a(b13, b12, (byte) (b13 - 1), objArr4);
                        method2 = cls2.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(645183118, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                Object[] objArr5 = {Integer.valueOf(charArray[i15]), setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(-764403778);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((Process.getThreadPriority(0) + 20) >> 6), 33 - View.resolveSizeAndState(0, 0, 0), KeyEvent.normalizeMetaState(0) + 1195);
                    byte b14 = (byte) (-1);
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr6 = new Object[1];
                    a(b15, b14, b15, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Integer.TYPE, Object.class, Object.class);
                    map2.put(-764403778, method3);
                }
                jArr[i15] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (j10 ^ 1779209353347916695L);
                Object[] objArr7 = {setlayoutanimation, setlayoutanimation};
                Object method4 = map2.get(645183118);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, 728 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    byte b16 = (byte) (-1);
                    byte b17 = (byte) (-b16);
                    Object[] objArr8 = new Object[1];
                    a(b17, b16, (byte) (b17 - 1), objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(645183118, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
            c10 = 0;
            i11 = 2;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i18 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i18 >= charArray.length) {
                mo.setY(new Object[]{moVar, n1.f(cArr), new mn(this.f56358p0, a.f56359p0)}, 733397612, -733397606, System.identityHashCode(moVar));
                int i19 = f56354r0 + 67;
                f56355s0 = i19 % 128;
                int i20 = i19 % 2;
                return;
            }
            int i21 = f56357u0 + 13;
            f56356t0 = i21 % 128;
            if (i21 % 2 != 0) {
                cArr[i18] = (char) jArr[i18];
                Object[] objArr9 = {setlayoutanimation, setlayoutanimation};
                Map map3 = setTextScaleX.setMaxEms;
                Object method5 = map3.get(645183118);
                if (method5 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 44 - Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 729);
                    byte b18 = (byte) (-1);
                    byte b19 = (byte) (-b18);
                    Object[] objArr10 = new Object[1];
                    a(b19, b18, (byte) (b19 - 1), objArr10);
                    method5 = cls5.getMethod((String) objArr10[0], Object.class, Object.class);
                    map3.put(645183118, method5);
                }
                ((Method) method5).invoke(null, objArr9);
                throw null;
            }
            cArr[i18] = (char) jArr[i18];
            Object[] objArr11 = {setlayoutanimation, setlayoutanimation};
            Map map4 = setTextScaleX.setMaxEms;
            Object method6 = map4.get(645183118);
            if (method6 == null) {
                Class cls6 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), Color.green(0) + 44, 727 - TextUtils.indexOf((CharSequence) "", '0', 0));
                byte b20 = (byte) (-1);
                byte b21 = (byte) (-b20);
                Object[] objArr12 = new Object[1];
                a(b21, b20, (byte) (b21 - 1), objArr12);
                method6 = cls6.getMethod((String) objArr12[0], Object.class, Object.class);
                map4.put(645183118, method6);
            }
            ((Method) method6).invoke(null, objArr11);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f56355s0 + 33;
        f56354r0 = i10 % 128;
        int i11 = i10 % 2;
        c(moVar);
        Unit unit = Unit.INSTANCE;
        int i12 = f56355s0 + 5;
        f56354r0 = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }
}
