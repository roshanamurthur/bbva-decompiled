package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/mq;", "", "Lkotlin/Function1;", "", "", "p0", "setCompoundDrawableTintBlendMode", "(Lkotlin/jvm/functions/Function1;)V", "", "p1", "", "p2", "setY", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "setX", "(Ljava/lang/String;)V", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRedactedLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedactedLogger.kt\ncom/mypinpad/tsdk/internal/common/logging/RedactedLogger\n+ 2 DebugFunctions.kt\ncom/mypinpad/common/buildconstants/DebugFunctionsKt\n+ 3 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,72:1\n51#2:73\n42#2:74\n14#3:75\n*S KotlinDebug\n*F\n+ 1 RedactedLogger.kt\ncom/mypinpad/tsdk/internal/common/logging/RedactedLogger\n*L\n47#1:73\n47#1:74\n62#1:75\n*E\n"})
public final class mq {

    @NotNull
    public static final mq INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static Function1<? super String, Unit> f57129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f57130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f57135g = null;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int[] f57136p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57137q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57138r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f57139s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f57140t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final byte[] f57141u0 = null;

        static {
            c();
            f57139s0 = 0;
            f57140t0 = 1;
            f57137q0 = 0;
            f57138r0 = 1;
            f57136p0 = new int[]{794833714, -200646167, 889269839, -789163150, 431841931, 1195192910, 1802633122, 48565838, -1187457794, -412249155, 1351384986, 1677878289, -1510910638, -1614177183, 605819372, -451810450, 11111589, -463384923};
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(ml mlVar) throws Throwable {
            Object[] objArr = new Object[1];
            a(new int[]{2046745094, 1364700463}, 3 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new int[]{-138620750, -789171876, -1160710678, 1042595687, -632515769, -2146296700, -1417196617, -1996826537, -694441860, -1661363927, 2084470112, 1880122560}, 23 - ImageFormat.getBitsPerPixel(0), objArr2);
            super(1, mlVar, ml.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        public static void a(int[] iArr, int i10, Object[] objArr) throws Throwable {
            int[] iArr2;
            Object method;
            int length;
            int i11;
            setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
            char[] cArr = new char[4];
            int i12 = 2;
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = f57136p0;
            int i13 = 1;
            int i14 = 1833429914;
            int i15 = 0;
            if (iArr3 != null) {
                int i16 = f57140t0 + 33;
                int i17 = i16 % 128;
                f57139s0 = i17;
                if (i16 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i11 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i11 = 0;
                }
                int i18 = i17 + 73;
                f57140t0 = i18 % 128;
                int i19 = i18 % 2;
                while (i11 < length) {
                    int i20 = f57139s0 + 49;
                    f57140t0 = i20 % 128;
                    if (i20 % i12 == 0) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i15] = Integer.valueOf(iArr3[i11]);
                            Map map = setTextScaleX.setMaxEms;
                            Object method2 = map.get(Integer.valueOf(i14));
                            if (method2 == null) {
                                Class cls = (Class) setTextScaleX.setX((char) TextUtils.getCapsMode("", i15, i15), View.MeasureSpec.makeMeasureSpec(i15, i15) + 44, 728 - Drawable.resolveOpacity(i15, i15));
                                byte b10 = (byte) 1;
                                byte b11 = (byte) (b10 - 1);
                                Object[] objArr3 = new Object[1];
                                b(b10, b11, b11, objArr3);
                                method2 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                                map.put(1833429914, method2);
                            }
                            iArr2[i11] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr4 = {Integer.valueOf(iArr3[i11])};
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method3 = map2.get(1833429914);
                        if (method3 == null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", ""), 44 - View.MeasureSpec.getMode(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 728);
                            byte b12 = (byte) 1;
                            byte b13 = (byte) (b12 - 1);
                            Object[] objArr5 = new Object[1];
                            b(b12, b13, b13, objArr5);
                            method3 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                            map2.put(1833429914, method3);
                        }
                        iArr2[i11] = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
                        i11++;
                    }
                    i12 = 2;
                    i14 = 1833429914;
                    i15 = 0;
                }
            } else {
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            float f6 = 0.0f;
            if (iArr3 != null) {
                int length3 = iArr3.length;
                int[] iArr5 = new int[length3];
                int i21 = 0;
                while (i21 < length3) {
                    Object[] objArr6 = new Object[i13];
                    objArr6[0] = Integer.valueOf(iArr3[i21]);
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method4 = map3.get(1833429914);
                    if (method4 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 728 - (AudioTrack.getMinVolume() > f6 ? 1 : (AudioTrack.getMinVolume() == f6 ? 0 : -1)));
                        byte b14 = (byte) 1;
                        byte b15 = (byte) (b14 - 1);
                        Object[] objArr7 = new Object[1];
                        b(b14, b15, b15, objArr7);
                        method4 = cls3.getMethod((String) objArr7[0], Integer.TYPE);
                        map3.put(1833429914, method4);
                    }
                    iArr5[i21] = ((Integer) ((Method) method4).invoke(null, objArr6)).intValue();
                    i21++;
                    iArr3 = iArr3;
                    length3 = length3;
                    f6 = 0.0f;
                    i13 = 1;
                }
                iArr3 = iArr5;
            }
            System.arraycopy(iArr3, 0, iArr4, 0, length2);
            setonlongclicklistener.setDividerPadding = 0;
            int i22 = f57140t0 + 97;
            f57139s0 = i22 % 128;
            int i23 = i22 % 2;
            while (true) {
                int i24 = setonlongclicklistener.setDividerPadding;
                if (i24 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i10);
                    return;
                }
                int i25 = iArr[i24];
                char c10 = (char) (i25 >> 16);
                cArr[0] = c10;
                char c11 = (char) i25;
                cArr[1] = c11;
                int i26 = iArr[i24 + 1];
                char c12 = (char) (i26 >> 16);
                cArr[2] = c12;
                char c13 = (char) i26;
                cArr[3] = c13;
                setonlongclicklistener.setY = (c10 << 16) + c11;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = (c12 << 16) + c13;
                setOnLongClickListener.setX(iArr4);
                int i27 = 0;
                for (int i28 = 16; i27 < i28; i28 = 16) {
                    int i29 = setonlongclicklistener.setY ^ iArr4[i27];
                    setonlongclicklistener.setY = i29;
                    Object[] objArr8 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i29)), setonlongclicklistener, setonlongclicklistener};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method5 = map4.get(-350984188);
                    if (method5 == null) {
                        method5 = ((Class) setTextScaleX.setX((char) Color.argb(0, 0, 0, 0), 41 - ((Process.getThreadPriority(0) + 20) >> 6), 180 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map4.put(-350984188, method5);
                    }
                    int iIntValue = ((Integer) ((Method) method5).invoke(null, objArr8)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                    i27++;
                }
                int i30 = setonlongclicklistener.setY;
                int i31 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                int i32 = i30 ^ iArr4[16];
                setonlongclicklistener.setCompoundDrawableTintBlendMode = i32;
                int i33 = i31 ^ iArr4[17];
                setonlongclicklistener.setY = i33;
                cArr[0] = (char) (i33 >>> 16);
                cArr[1] = (char) i33;
                cArr[2] = (char) (i32 >>> 16);
                cArr[3] = (char) i32;
                setOnLongClickListener.setX(iArr4);
                int i34 = setonlongclicklistener.setDividerPadding * 2;
                cArr2[i34] = cArr[0];
                cArr2[i34 + 1] = cArr[1];
                cArr2[i34 + 2] = cArr[2];
                cArr2[i34 + 3] = cArr[3];
                Object[] objArr9 = {setonlongclicklistener, setonlongclicklistener};
                Map map5 = setTextScaleX.setMaxEms;
                Object obj = map5.get(-147294223);
                if (obj != null) {
                    method = obj;
                } else {
                    Class cls4 = (Class) setTextScaleX.setX((char) (Color.rgb(0, 0, 0) + 16777216), 41 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 484 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr10 = new Object[1];
                    b(b16, b17, b17, objArr10);
                    method = cls4.getMethod((String) objArr10[0], Object.class, Object.class);
                    map5.put(-147294223, method);
                }
                ((Method) method).invoke(null, objArr9);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0037). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 4
                int r6 = 108 - r6
                int r8 = r8 * 3
                int r8 = r8 + 4
                int r7 = r7 * 4
                int r0 = 1 - r7
                byte[] r0 = new byte[r0]
                r1 = 0
                int r7 = 0 - r7
                byte[] r2 = com.mypinpad.tsdk.i.mq.a.f57141u0
                if (r2 != 0) goto L1c
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                goto L37
            L1c:
                r3 = r1
            L1d:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L2a:
                r4 = r2[r8]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                r8 = r5
            L37:
                int r9 = r9 + 1
                int r6 = r6 + r7
                r7 = r8
                r8 = r9
                r9 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.mq.a.b(int, int, int, java.lang.Object[]):void");
        }

        public static void c() {
            f57141u0 = new byte[]{107, -43, 87, -84};
        }

        public final void d(@NotNull String str) {
            int i10 = f57138r0 + 27;
            f57137q0 = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            ml mlVar = (ml) this.receiver;
            ml.setY(new Object[]{mlVar, str}, 194155730, -194155730, System.identityHashCode(mlVar));
            int i12 = f57137q0 + 33;
            f57138r0 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 57 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i10 = f57137q0 + 121;
            f57138r0 = i10 % 128;
            int i11 = i10 % 2;
            d(str);
            Unit unit = Unit.INSTANCE;
            int i12 = f57137q0 + 99;
            f57138r0 = i12 % 128;
            int i13 = i12 % 2;
            return unit;
        }
    }

    static {
        c();
        f57133e = 0;
        f57134f = 1;
        f57131c = 0;
        f57132d = 1;
        d();
        INSTANCE = new mq();
        f57129a = new a(ml.INSTANCE);
        q.emptyMap();
        int i10 = f57132d + 77;
        f57131c = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f4 A[PHI: r11
      0x00f4: PHI (r11v1 char) = (r11v0 char), (r11v14 char) binds: [B:35:0x00f2, B:32:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:14:0x003c, B:18:0x009c, B:17:0x005a, B:44:0x016e, B:48:0x01d0, B:51:0x01e4, B:55:0x023f, B:54:0x01fc, B:47:0x018e, B:37:0x00f6, B:41:0x015b, B:40:0x0115), top: B:81:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x016b  */
    /* JADX WARN: Code duplicated, block: B:46:0x018d  */
    /* JADX WARN: Code duplicated, block: B:47:0x018e A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:14:0x003c, B:18:0x009c, B:17:0x005a, B:44:0x016e, B:48:0x01d0, B:51:0x01e4, B:55:0x023f, B:54:0x01fc, B:47:0x018e, B:37:0x00f6, B:41:0x015b, B:40:0x0115), top: B:81:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static void a(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        char c10;
        Map map;
        Object method;
        Map map2;
        Object method2;
        String str2 = str;
        int i12 = f57133e + 67;
        f57134f = i12 % 128;
        int i13 = 0;
        Object bytes = str2;
        if (i12 % 2 == 0) {
            int i14 = 86 / 0;
            if (str2 != null) {
                bytes = str2;
                bytes = str2.getBytes("ISO-8859-1");
            }
        } else if (str2 != null) {
            bytes = str2;
            bytes = str2.getBytes("ISO-8859-1");
        }
        bytes = str2;
        byte[] bArr = (byte[]) bytes;
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i15 = iArr[0];
        int i16 = 1;
        int i17 = iArr[1];
        int i18 = iArr[2];
        int i19 = iArr[3];
        char[] cArr = f57130b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i20 = 0;
            while (i20 < length) {
                try {
                    Object[] objArr2 = new Object[i16];
                    objArr2[i13] = Integer.valueOf(cArr[i20]);
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-637734149);
                    if (method3 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Process.getGidForName("") + 38, Color.alpha(i13) + TypedValues.MotionType.TYPE_POLAR_RELATIVETO);
                        byte b10 = (byte) i13;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, (byte) (b11 + 3), objArr3);
                        method3 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map3.put(-637734149, method3);
                    }
                    cArr2[i20] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i20++;
                    cArr = cArr;
                    length = length;
                    i18 = i18;
                    i13 = 0;
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
            cArr = cArr2;
        } else {
            i10 = i18;
        }
        char[] cArr3 = new char[i17];
        System.arraycopy(cArr, i15, cArr3, 0, i17);
        if (bArr != null) {
            int i21 = f57134f + 87;
            f57133e = i21 % 128;
            int i22 = i21 % 2;
            char[] cArr4 = new char[i17];
            setnavigationonclicklistener.setX = 0;
            char c11 = 0;
            while (true) {
                int i23 = setnavigationonclicklistener.setX;
                if (i23 >= i17) {
                    break;
                }
                int i24 = f57134f + 27;
                f57133e = i24 % 128;
                if (i24 % 2 != 0) {
                    c10 = 1;
                    if (bArr[i23] == 1) {
                        char c12 = cArr3[i23];
                        Object[] objArr4 = new Object[2];
                        objArr4[c10] = Integer.valueOf(c11);
                        objArr4[0] = Integer.valueOf(c12);
                        map = setTextScaleX.setMaxEms;
                        method = map.get(1737824323);
                        if (method != null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 4449), (ViewConfiguration.getEdgeSlop() >> 16) + 42, 1021 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            Object[] objArr5 = new Object[1];
                            b(b12, b13, b13, objArr5);
                            String str3 = (String) objArr5[0];
                            Class<?> cls3 = Integer.TYPE;
                            method = cls2.getMethod(str3, cls3, cls3);
                            map.put(1737824323, method);
                        }
                        cArr4[i23] = ((Character) ((Method) method).invoke(null, objArr4)).charValue();
                    } else {
                        Object[] objArr6 = {Integer.valueOf(cArr3[i23]), Integer.valueOf(c11)};
                        map2 = setTextScaleX.setMaxEms;
                        method2 = map2.get(-504758789);
                        if (method2 != null) {
                            Class cls4 = (Class) setTextScaleX.setX((char) Color.red(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45, View.combineMeasuredStates(0, 0) + 2627);
                            byte b14 = (byte) 0;
                            Object[] objArr7 = new Object[1];
                            b(b14, b14, (byte) f57135g.length, objArr7);
                            String str4 = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method2 = cls4.getMethod(str4, cls5, cls5);
                            map2.put(-504758789, method2);
                        }
                        cArr4[i23] = ((Character) ((Method) method2).invoke(null, objArr6)).charValue();
                    }
                } else {
                    c10 = 1;
                    if (bArr[i23] == 1) {
                        char c13 = cArr3[i23];
                        Object[] objArr8 = new Object[2];
                        objArr8[c10] = Integer.valueOf(c11);
                        objArr8[0] = Integer.valueOf(c13);
                        map = setTextScaleX.setMaxEms;
                        method = map.get(1737824323);
                        if (method != null) {
                            Class cls6 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 4449), (ViewConfiguration.getEdgeSlop() >> 16) + 42, 1021 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr9 = new Object[1];
                            b(b15, b16, b16, objArr9);
                            String str5 = (String) objArr9[0];
                            Class<?> cls7 = Integer.TYPE;
                            method = cls6.getMethod(str5, cls7, cls7);
                            map.put(1737824323, method);
                        }
                        cArr4[i23] = ((Character) ((Method) method).invoke(null, objArr8)).charValue();
                    } else {
                        Object[] objArr10 = {Integer.valueOf(cArr3[i23]), Integer.valueOf(c11)};
                        map2 = setTextScaleX.setMaxEms;
                        method2 = map2.get(-504758789);
                        if (method2 != null) {
                            Class cls8 = (Class) setTextScaleX.setX((char) Color.red(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45, View.combineMeasuredStates(0, 0) + 2627);
                            byte b17 = (byte) 0;
                            Object[] objArr11 = new Object[1];
                            b(b17, b17, (byte) f57135g.length, objArr11);
                            String str6 = (String) objArr11[0];
                            Class<?> cls9 = Integer.TYPE;
                            method2 = cls8.getMethod(str6, cls9, cls9);
                            map2.put(-504758789, method2);
                        }
                        cArr4[i23] = ((Character) ((Method) method2).invoke(null, objArr10)).charValue();
                    }
                }
                c11 = cArr4[setnavigationonclicklistener.setX];
                Object[] objArr12 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls10 = (Class) setTextScaleX.setX((char) (View.MeasureSpec.getMode(0) + 31347), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 47, 840 - KeyEvent.normalizeMetaState(0));
                    byte b18 = (byte) 0;
                    byte b19 = b18;
                    Object[] objArr13 = new Object[1];
                    b(b18, b19, (byte) (b19 + 1), objArr13);
                    method4 = cls10.getMethod((String) objArr13[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr12);
            }
            cArr3 = cArr4;
        }
        if (i19 > 0) {
            int i25 = f57133e + 69;
            f57134f = i25 % 128;
            if (i25 % 2 == 0) {
                char[] cArr5 = new char[i17];
                System.arraycopy(cArr3, 1, cArr5, 1, i17);
                i11 = 0;
                System.arraycopy(cArr5, 0, cArr3, i17 + i19, i19);
                System.arraycopy(cArr5, i19, cArr3, 1, i17 - i19);
            } else {
                i11 = 0;
                char[] cArr6 = new char[i17];
                System.arraycopy(cArr3, 0, cArr6, 0, i17);
                int i26 = i17 - i19;
                System.arraycopy(cArr6, 0, cArr3, i26, i19);
                System.arraycopy(cArr6, i19, cArr3, 0, i26);
            }
        } else {
            i11 = 0;
        }
        if (z10) {
            char[] cArr7 = new char[i17];
            setnavigationonclicklistener.setX = i11;
            while (true) {
                int i27 = setnavigationonclicklistener.setX;
                if (i27 >= i17) {
                    break;
                }
                cArr7[i27] = cArr3[(i17 - i27) - 1];
                setnavigationonclicklistener.setX = i27 + 1;
            }
            cArr3 = cArr7;
        }
        if (i10 > 0) {
            int i28 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i28;
                int i29 = setnavigationonclicklistener.setX;
                if (i29 >= i17) {
                    break;
                }
                cArr3[i29] = (char) (cArr3[i29] - iArr[2]);
                i28 = i29 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r8 = 101 - r8
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.mq.f57135g
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r7
            r7 = r6
            goto L36
        L1a:
            r3 = r1
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L1f:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2e:
            r3 = r2[r7]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L36:
            int r8 = -r8
            int r6 = r6 + r8
            int r7 = r7 + 1
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.mq.b(short, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f57135g = new byte[]{72, 65, MessageUtils.MESSAGE_18_DC2, -53};
    }

    public static void d() {
        f57130b = new char[]{59072, 58909, 59013, 59064, 59064, 59052, 59111, 59109, 59109, 59074, 59047, 59091, 59050, 58905, 59115, 58903, 58908, 58903, 58906, 58903, 58885, 59047, 59121, 59126, 59134, 59131};
    }

    public final synchronized void setCompoundDrawableTintBlendMode(@NotNull Function1<? super String, Unit> p4) {
        int i10 = f57131c + 93;
        f57132d = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        f57129a = p4;
        int i12 = f57132d + 115;
        f57131c = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final synchronized void setX(@NotNull String p4) {
        int i10 = f57132d + 27;
        f57131c = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p4, "");
            f57129a.invoke(p4);
            throw null;
        }
        Intrinsics.checkNotNullParameter(p4, "");
        f57129a.invoke(p4);
    }

    public final synchronized void setY(int p4, @Nullable String p10, @Nullable Throwable p11) {
        int i10;
        try {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr = new Object[1];
            a("\u0000\u0000", false, new int[]{0, 2, 56, 0}, objArr);
            sb3.append(((String) objArr[0]).intern());
            sb3.append(p4);
            sb2.append(sb3.toString());
            if (p10 != null) {
                if (p10.length() > 0) {
                    StringBuilder sb4 = new StringBuilder();
                    Object[] objArr2 = new Object[1];
                    a("\u0000\u0000\u0000", true, new int[]{2, 3, 0, 0}, objArr2);
                    sb4.append(((String) objArr2[0]).intern());
                    sb4.append(p10);
                    sb2.append(sb4.toString());
                    i10 = f57132d + 83;
                    f57131c = i10 % 128;
                } else {
                    i10 = f57132d + 3;
                    f57131c = i10 % 128;
                }
                int i11 = i10 % 2;
            }
            if (p11 != null) {
                StringBuilder sb5 = new StringBuilder();
                Object[] objArr3 = new Object[1];
                a("\u0000\u0000\u0001\u0001\u0001\u0001\u0001", false, new int[]{5, 7, 0, 5}, objArr3);
                sb5.append(((String) objArr3[0]).intern());
                sb5.append(p11.getClass().getSimpleName());
                Object[] objArr4 = new Object[1];
                a("\u0001\u0000", true, new int[]{12, 2, 95, 0}, objArr4);
                sb5.append(((String) objArr4[0]).intern());
                sb5.append(p11.getMessage());
                sb5.append(RootService.CLOSE_BRACKET);
                sb2.append(sb5.toString());
            }
            Function1<? super String, Unit> function1 = f57129a;
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            function1.invoke(string);
            Unit unit = Unit.INSTANCE;
            Object[] objArr5 = new Object[1];
            a(null, true, new int[]{14, 7, 29, 5}, objArr5);
            String strIntern = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a("\u0000\u0001\u0001\u0001\u0000", false, new int[]{21, 5, 0, 5}, objArr6);
            if (Intrinsics.areEqual(strIntern, ((String) objArr6[0]).intern())) {
                int i12 = f57131c;
                int i13 = i12 + 71;
                f57132d = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                if (p11 != null) {
                    int i14 = i12 + 121;
                    f57132d = i14 % 128;
                    int i15 = i14 % 2;
                    p11.printStackTrace();
                    return;
                }
                int i16 = i12 + 95;
                f57132d = i16 % 128;
                int i17 = i16 % 2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
