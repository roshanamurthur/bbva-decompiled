package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.esotericsoftware.kryo.serializers.d;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setFastScrollStyle {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f59661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f59662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f59663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f59664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f59665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f59666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f59667j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CameraManager f59668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setColorFilter f59669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public setDividerPadding f59670c;

    public static final class setDividerPadding extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int[] f59671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f59672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f59673f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f59674g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f59675h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final byte[] f59676i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f59677j = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CompletableFuture<Boolean> f59679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f59680c;

        static {
            b();
            f59674g = 0;
            f59675h = 1;
            f59672e = 0;
            f59673f = 1;
            f59671d = new int[]{1514792587, -964167408, -1952511179, -1301493257, -1214629475, 1269138304, 663657681, -995579910, 1197263645, 1478358573, -1177417466, 652476471, -2127887013, -1298288290, -310486473, -1097285047, -1699397029, -2000792436};
        }

        public setDividerPadding(CompletableFuture<Boolean> completableFuture, Function0<Unit> function0) {
            this.f59679b = completableFuture;
            this.f59680c = function0;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 2
                int r0 = r7 + 1
                int r8 = r8 * 2
                int r8 = r8 + 4
                int r6 = r6 * 4
                int r6 = 108 - r6
                byte[] r0 = new byte[r0]
                byte[] r1 = com.mypinpad.tsdk.i.setFastScrollStyle.setDividerPadding.f59676i
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r9
                r9 = r8
                goto L32
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r9
                r9 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L32:
                int r8 = -r8
                int r6 = r6 + r8
                int r8 = r9 + 1
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setFastScrollStyle.setDividerPadding.a(int, short, short, java.lang.Object[]):void");
        }

        public static void b() {
            f59676i = new byte[]{22, 117, -35, 69};
            f59677j = 169;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            CompletableFuture<Boolean> completableFuture = this.f59679b;
            if (!completableFuture.isDone()) {
                int i10 = f59672e + 77;
                f59673f = i10 % 128;
                int i11 = i10 % 2;
                completableFuture.complete(Boolean.FALSE);
                int i12 = f59673f + 53;
                f59672e = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = f59672e + 19;
            f59673f = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(@NotNull String str) throws Throwable {
            int i10;
            int[] iArr;
            char[] cArr;
            int length;
            Intrinsics.checkNotNullParameter(str, "");
            setFastScrollStyle.setCompoundDrawableTintBlendMode(setFastScrollStyle.this);
            int[] iArr2 = {782526689, 827297591, -1863157932, -235407033, 1632106073, -1116592063, -1746703877, -1286339266, -1436959968, -925678460, -1371591454, -435751328, -1452877573, -344664178, -967514350, -179837330, 766258278, -1629854336};
            int iResolveSize = View.resolveSize(0, 0) + 33;
            setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
            char[] cArr2 = new char[4];
            char[] cArr3 = new char[36];
            int[] iArr3 = f59671d;
            int i11 = 2;
            int i12 = 1;
            int i13 = f59677j;
            if (iArr3 != null) {
                int i14 = f59675h + 17;
                f59674g = i14 % 128;
                if (i14 % 2 != 0) {
                    length = iArr3.length;
                    iArr = new int[length];
                } else {
                    length = iArr3.length;
                    iArr = new int[length];
                }
                int i15 = 0;
                while (i15 < length) {
                    int i16 = f59675h + 65;
                    f59674g = i16 % 128;
                    if (i16 % i11 != 0) {
                        try {
                            Object[] objArr = new Object[i12];
                            objArr[0] = Integer.valueOf(iArr3[i15]);
                            Map map = setTextScaleX.setMaxEms;
                            Object method = map.get(1833429914);
                            if (method == null) {
                                Class cls = (Class) setTextScaleX.setX((char) (Process.getGidForName("") + i12), 44 - (Process.myTid() >> 22), 728 - View.MeasureSpec.getMode(0));
                                byte b10 = (byte) (i13 & 7);
                                byte b11 = (byte) (b10 - 1);
                                Object[] objArr2 = new Object[1];
                                a(b10, b11, b11, objArr2);
                                method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                                map.put(1833429914, method);
                            }
                            iArr[i15] = ((Integer) ((Method) method).invoke(null, objArr)).intValue();
                            i15 %= 0;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        length = length;
                        iResolveSize = iResolveSize;
                        Object[] objArr3 = {Integer.valueOf(iArr3[i15])};
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(1833429914);
                        if (method2 == null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, 728 - (KeyEvent.getMaxKeyCode() >> 16));
                            byte b12 = (byte) (i13 & 7);
                            byte b13 = (byte) (b12 - 1);
                            Object[] objArr4 = new Object[1];
                            a(b12, b13, b13, objArr4);
                            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                            map2.put(1833429914, method2);
                        }
                        iArr[i15] = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
                        i15++;
                    }
                    length = length;
                    iResolveSize = iResolveSize;
                    i11 = 2;
                    i12 = 1;
                }
                i10 = iResolveSize;
            } else {
                i10 = iResolveSize;
                iArr = iArr3;
            }
            int length2 = iArr.length;
            int[] iArr4 = new int[length2];
            if (iArr3 != null) {
                int length3 = iArr3.length;
                int[] iArr5 = new int[length3];
                int i17 = f59674g + 33;
                f59675h = i17 % 128;
                int i18 = 2;
                int i19 = i17 % 2;
                int i20 = 0;
                while (i20 < length3) {
                    int i21 = f59674g + 47;
                    f59675h = i21 % 128;
                    int i22 = i21 % i18;
                    Object[] objArr5 = {Integer.valueOf(iArr3[i20])};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(1833429914);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 44, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 728);
                        byte b14 = (byte) (i13 & 7);
                        byte b15 = (byte) (b14 - 1);
                        Object[] objArr6 = new Object[1];
                        a(b14, b15, b15, objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], Integer.TYPE);
                        map3.put(1833429914, method3);
                    }
                    iArr5[i20] = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                    i20++;
                    length3 = length3;
                    iArr3 = iArr3;
                    cArr3 = cArr3;
                    i18 = 2;
                }
                cArr = cArr3;
                iArr3 = iArr5;
            } else {
                cArr = cArr3;
            }
            char c10 = 0;
            System.arraycopy(iArr3, 0, iArr4, 0, length2);
            setonlongclicklistener.setDividerPadding = 0;
            while (true) {
                int i23 = setonlongclicklistener.setDividerPadding;
                if (i23 >= 18) {
                    break;
                }
                int i24 = iArr2[i23];
                char c11 = (char) (i24 >> 16);
                cArr2[c10] = c11;
                char c12 = (char) i24;
                cArr2[1] = c12;
                int i25 = iArr2[i23 + 1];
                char c13 = (char) (i25 >> 16);
                cArr2[2] = c13;
                char c14 = (char) i25;
                cArr2[3] = c14;
                setonlongclicklistener.setY = (c11 << 16) + c12;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = (c13 << 16) + c14;
                setOnLongClickListener.setX(iArr4);
                int i26 = f59675h + 57;
                f59674g = i26 % 128;
                int i27 = i26 % 2;
                for (int i28 = 0; i28 < 16; i28++) {
                    int i29 = setonlongclicklistener.setY ^ iArr4[i28];
                    setonlongclicklistener.setY = i29;
                    Object[] objArr7 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i29)), setonlongclicklistener, setonlongclicklistener};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(-350984188);
                    if (method4 == null) {
                        method4 = ((Class) setTextScaleX.setX((char) (ImageFormat.getBitsPerPixel(0) + 1), (Process.myTid() >> 22) + 41, 179 - MotionEvent.axisFromString(""))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map4.put(-350984188, method4);
                    }
                    int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                }
                int i30 = setonlongclicklistener.setY;
                int i31 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                int i32 = i30 ^ iArr4[16];
                setonlongclicklistener.setCompoundDrawableTintBlendMode = i32;
                int i33 = i31 ^ iArr4[17];
                setonlongclicklistener.setY = i33;
                cArr2[0] = (char) (i33 >>> 16);
                cArr2[1] = (char) i33;
                cArr2[2] = (char) (i32 >>> 16);
                cArr2[3] = (char) i32;
                setOnLongClickListener.setX(iArr4);
                int i34 = setonlongclicklistener.setDividerPadding * 2;
                cArr[i34] = cArr2[0];
                cArr[i34 + 1] = cArr2[1];
                cArr[i34 + 2] = cArr2[2];
                cArr[i34 + 3] = cArr2[3];
                Object[] objArr8 = {setonlongclicklistener, setonlongclicklistener};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(-147294223);
                if (method5 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (KeyEvent.getMaxKeyCode() >> 16), 40 - ((byte) KeyEvent.getModifierMetaStateMask()), 482 - Process.getGidForName(""));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    a(b16, b17, b17, objArr9);
                    method5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map5.put(-147294223, method5);
                }
                ((Method) method5).invoke(null, objArr8);
                c10 = 0;
            }
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus(new String(cArr, 0, i10).intern(), str)}, 2065174743, -2065174734, (int) System.currentTimeMillis());
            CompletableFuture<Boolean> completableFuture = this.f59679b;
            if (completableFuture.isDone()) {
                this.f59680c.invoke();
                return;
            }
            int i35 = f59672e + 37;
            f59673f = i35 % 128;
            if (i35 % 2 == 0) {
                completableFuture.complete(Boolean.TRUE);
                throw null;
            }
            completableFuture.complete(Boolean.TRUE);
            int i36 = f59673f + 109;
            f59672e = i36 % 128;
            if (i36 % 2 != 0) {
                int i37 = 6 / 0;
            }
        }
    }

    static {
        d();
        f59665h = 0;
        f59666i = 1;
        f59663f = 0;
        f59664g = 1;
        f59661d = new char[]{59047, 59134, 59132, 59093, 59103, 59105, 59135, 59121, 59123, 59095, 59095, 59121, 59129, 59129, 59121, 59134, 59131, 59129, 59131, 59125, 59126, 59135, 59132, 59110, 59129, 59121, 59095, 59092, 59127, 59122, 59075, 58936, 58942, 58936, 58943, 58934, 58942, 58942, 58934, 58900, 58900, 58928, 58934, 58940, 58918, 58908, 59114, 58941, 58943, 58941, 58931, 58932, 58901, 58900, 58934, 58940, 58938, 58939, 58917, 58935};
        f59662e = 3377053672711866415L;
    }

    public setFastScrollStyle(@NotNull CameraManager cameraManager, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(cameraManager, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f59668a = cameraManager;
        this.f59669b = setcolorfilter;
    }

    public static void a(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        int i12;
        byte[] bytes = str.getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i13 = iArr[0];
        int i14 = 1;
        int i15 = iArr[1];
        int i16 = 2;
        int i17 = iArr[2];
        int i18 = iArr[3];
        char[] cArr = f59661d;
        if (cArr != null) {
            int i19 = f59666i + 79;
            int i20 = i19 % 128;
            f59665h = i20;
            int i21 = i19 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i22 = i20 + 117;
            f59666i = i22 % 128;
            int i23 = i22 % 2;
            int i24 = 0;
            while (i24 < length) {
                int i25 = f59665h + 27;
                f59666i = i25 % 128;
                int i26 = i25 % i16;
                try {
                    Object[] objArr2 = new Object[i14];
                    objArr2[0] = Integer.valueOf(cArr[i24]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", ""), View.MeasureSpec.getSize(0) + 37, TextUtils.getOffsetAfter("", 0) + TypedValues.MotionType.TYPE_POLAR_RELATIVETO);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        c(b11, b10, (byte) (b11 | 12), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr2[i24] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i24++;
                    length = length;
                    cArr = cArr;
                    i17 = i17;
                    i18 = i18;
                    i14 = 1;
                    i16 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i17;
            i11 = i18;
            cArr = cArr2;
        } else {
            i10 = i17;
            i11 = i18;
        }
        char[] cArr3 = new char[i15];
        System.arraycopy(cArr, i13, cArr3, 0, i15);
        if (bytes != null) {
            char[] cArr4 = new char[i15];
            setnavigationonclicklistener.setX = 0;
            char c10 = 0;
            while (true) {
                int i27 = setnavigationonclicklistener.setX;
                if (i27 >= i15) {
                    break;
                }
                if (bytes[i27] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i27]), Integer.valueOf(c10)};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1737824323);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (4449 - TextUtils.indexOf("", "", 0, 0)), (Process.myTid() >> 22) + 42, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + PointerIconCompat.TYPE_GRABBING);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        c(b13, b12, (byte) (b13 | 9), objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls3 = Integer.TYPE;
                        method2 = cls2.getMethod(str2, cls3, cls3);
                        map2.put(1737824323, method2);
                    }
                    cArr4[i27] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    Object[] objArr6 = {Integer.valueOf(cArr3[i27]), Integer.valueOf(c10)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-504758789);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) ((-1) - MotionEvent.axisFromString("")), 46 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2626 - TextUtils.lastIndexOf("", '0'));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        c(b15, b14, (byte) (b15 | 13), objArr7);
                        String str3 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str3, cls5, cls5);
                        map3.put(-504758789, method3);
                    }
                    cArr4[i27] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c10 = cArr4[setnavigationonclicklistener.setX];
                Object[] objArr8 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) (TextUtils.getCapsMode("", 0, 0) + 31347), 48 - View.getDefaultSize(0, 0), (-16776376) - Color.rgb(0, 0, 0));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    c(b17, b16, (byte) (b17 | 10), objArr9);
                    method4 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            int i28 = f59666i + 105;
            f59665h = i28 % 128;
            int i29 = i28 % 2;
            char[] cArr5 = new char[i15];
            i12 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i15);
            int i30 = i15 - i11;
            int i31 = i11;
            System.arraycopy(cArr5, 0, cArr3, i30, i31);
            System.arraycopy(cArr5, i31, cArr3, 0, i30);
        } else {
            i12 = 0;
        }
        if (z10) {
            char[] cArr6 = new char[i15];
            while (true) {
                setnavigationonclicklistener.setX = i12;
                int i32 = setnavigationonclicklistener.setX;
                if (i32 >= i15) {
                    break;
                }
                cArr6[i32] = cArr3[(i15 - i32) - 1];
                i12 = i32 + 1;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            setnavigationonclicklistener.setX = 0;
            int i33 = f59666i + 13;
            while (true) {
                f59665h = i33 % 128;
                int i34 = i33 % 2;
                int i35 = setnavigationonclicklistener.setX;
                if (i35 >= i15) {
                    break;
                }
                cArr3[i35] = (char) (cArr3[i35] - iArr[2]);
                setnavigationonclicklistener.setX = i35 + 1;
                i33 = f59666i + 121;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0180  */
    /* JADX WARN: Code duplicated, block: B:33:0x0181  */
    public static void b(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        Throwable cause;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i12 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i12 >= charArray.length) {
                break;
            }
            int i13 = f59665h + 63;
            f59666i = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr2 = {Integer.valueOf(charArray[i12]), setlayoutanimation, setlayoutanimation};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 33, TextUtils.getTrimmedLength("") + 1195);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b11, b10, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i12] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f59662e ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, Color.green(0) + 728);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b13, b12, (byte) (b13 + 3), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
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
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        int i15 = f59665h + 71;
        f59666i = i15 % 128;
        int i16 = 2;
        int i17 = i15 % 2;
        while (true) {
            int i18 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i18 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i18] = (char) jArr[i18];
            Object[] objArr6 = new Object[i16];
            objArr6[1] = setlayoutanimation;
            objArr6[0] = setlayoutanimation;
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls3 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, TextUtils.getTrimmedLength("") + 728);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                c(b15, b14, (byte) (b15 + 3), objArr7);
                i11 = 2;
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i16 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 110 - r8
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.setFastScrollStyle.f59667j
            if (r2 != 0) goto L16
            r4 = r8
            r3 = r1
            r8 = r7
            r7 = r6
            goto L2c
        L16:
            r3 = r1
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r2[r6]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L2c:
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setFastScrollStyle.c(byte, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        f59667j = new byte[]{75, 85, 67, -51};
    }

    public static final /* synthetic */ setColorFilter setCompoundDrawableTintBlendMode(setFastScrollStyle setfastscrollstyle) {
        int i10 = f59663f + 25;
        int i11 = i10 % 128;
        f59664g = i11;
        int i12 = i10 % 2;
        setColorFilter setcolorfilter = setfastscrollstyle.f59669b;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i11 + 21;
        f59663f = i13 % 128;
        if (i13 % 2 == 0) {
            return setcolorfilter;
        }
        throw null;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws CameraAccessException {
        setFastScrollStyle setfastscrollstyle = (setFastScrollStyle) objArr[0];
        int i13 = f59663f + 7;
        f59664g = i13 % 128;
        int i14 = i13 % 2;
        String[] cameraIdList = setfastscrollstyle.f59668a.getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
        int length = cameraIdList.length;
        int i15 = 0;
        while (i15 < length) {
            int i16 = f59663f + 65;
            f59664g = i16 % 128;
            int i17 = i16 % 2;
            CameraManager cameraManager = setfastscrollstyle.f59668a;
            if (i17 == 0) {
                throw null;
            }
            Integer num = (Integer) cameraManager.getCameraCharacteristics(cameraIdList[i15]).get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 2) {
                int i18 = f59663f + 105;
                f59664g = i18 % 128;
                return Boolean.valueOf(i18 % 2 != 0);
            }
            i15++;
            int i19 = f59664g + 27;
            f59663f = i19 % 128;
            int i20 = i19 % 2;
        }
        return Boolean.FALSE;
    }

    public final void e() throws Throwable {
        setDividerPadding setdividerpadding = this.f59670c;
        if (setdividerpadding != null) {
            int i10 = f59664g + 105;
            f59663f = i10 % 128;
            int i11 = i10 % 2;
            Object[] objArr = new Object[1];
            a("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{30, 30, 63, 0}, objArr);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, -1422891482, 1422891482, (int) System.currentTimeMillis());
            this.f59668a.unregisterAvailabilityCallback(setdividerpadding);
            int i12 = f59664g + 77;
            f59663f = i12 % 128;
            int i13 = i12 % 2;
        }
        this.f59670c = null;
    }

    public final boolean f_(@NotNull Looper looper, @NotNull Function0<Unit> function0) throws Throwable {
        String[] cameraIdList;
        CameraManager cameraManager = this.f59668a;
        Intrinsics.checkNotNullParameter(looper, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Object[] objArr = new Object[1];
        a("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000", false, new int[]{0, 30, 0, 19}, objArr);
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, -1422891482, 1422891482, (int) System.currentTimeMillis());
        e();
        CompletableFuture completableFutureB = d.b();
        try {
            cameraIdList = cameraManager.getCameraIdList();
            Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
        } catch (CameraAccessException unused) {
            Object[] objArr2 = new Object[1];
            b("\uabfd쮕歴諊⪶䩃\ue9e3ूꤣ좊桽连⾥伅\ueeedฉ긫춖浻賐Ⲧ䰒\ue3b2\u0378ꌔ슌", 24671 - Drawable.resolveOpacity(0, 0), objArr2);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr2[0]).intern()}, -821746216, 821746227, (int) System.currentTimeMillis());
            cameraIdList = new String[0];
        }
        if (cameraIdList.length == 0) {
            int i10 = f59664g + 125;
            int i11 = i10 % 128;
            f59663f = i11;
            if (i10 % 2 == 0) {
                int i12 = i11 + 71;
                f59664g = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr3 = new Object[1];
                b("꯶骰쥖㿮湅峖获\uf21b⃡\u1754䖞뒴\ufb1a⧢ᡳ仝붩\uec0d틪Ÿ瞔ꚤ锌\udbd9\u0a64磟꾫鹅처㍶懜储蜻\uf59a\u2438", TextUtils.indexOf("", "", 0) + 12647, objArr3);
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr3[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                return false;
            }
        }
        setDividerPadding setdividerpadding = new setDividerPadding(completableFutureB, function0);
        this.f59670c = setdividerpadding;
        Intrinsics.checkNotNull(setdividerpadding);
        cameraManager.registerAvailabilityCallback(setdividerpadding, new Handler(looper));
        Object obj = completableFutureB.get();
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return ((Boolean) obj).booleanValue();
    }

    public final boolean setY() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 693624790, -693624790, System.identityHashCode(this))).booleanValue();
    }

    public final void setOnFocusChangeListener() throws Throwable {
        int i10 = f59663f + 69;
        f59664g = i10 % 128;
        int i11 = i10 % 2;
        e();
        int i12 = f59663f + 35;
        f59664g = i12 % 128;
        int i13 = i12 % 2;
    }
}
