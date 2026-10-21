package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.media.SoundPool;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.mypinpad.tsdk.R;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.c;
import ok.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class nw implements nn {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char[] f57352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f57353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f57354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f57355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f57356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f57357l = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SoundPool f57358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f57361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f57363f;

    public /* synthetic */ class setOnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f57364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f57365b;
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[getRevealSystemBarToastMessage.setDividerPadding.values().length];
            try {
                iArr[getRevealSystemBarToastMessage.setDividerPadding.setOnFocusChangeListener.ordinal()] = 1;
                int i10 = (1 & 59) + (1 | 59);
                f57364a = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getRevealSystemBarToastMessage.setDividerPadding.setDividerPadding.ordinal()] = 2;
                int i12 = f57364a;
                int i13 = i12 & 91;
                int i14 = (i12 | 91) & (~i13);
                int i15 = i13 << 1;
                int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                f57365b = i16 % 128;
                int i17 = i16 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            setOnFocusChangeListener = iArr;
            int i18 = f57365b;
            int i19 = (i18 & 57) + (i18 | 57);
            f57364a = i19 % 128;
            int i20 = i19 % 2;
        }
    }

    static {
        d();
        f57355j = 0;
        f57356k = 1;
        f57353h = -1789126779243024453L;
        f57352g = new char[]{48150, 54678, 28543, 32977, 6888, 44158, 50637, 24549, 61697, 2814, 40102, 13852, 20452, 57601, 50782, 45022, 5431, 64153, 24736, 54843, 49055, 9726, 35653, 28833, 59126, 19540, 13740, 39751, 344, 63162, 23582, 49707, 43985, 4364, 34675, 27852, 53795, 47214, 8647, 38771, 31902, 58094, 18486, 12690, 46164, 56788, 26429, 34963, 4778, 42033, 52629, 22516, 63823, 683, 38140, 15966, 18342, 59725, 29522, 33968, 11796, 45089, 55758, 25362, 62835, 7881, 41017, 51813, 21467, 58745, 3732, 37092, 14908, 17304};
        f57354i = new int[]{-1609883509, 802210148, 624747541, -900111063, -1883114030, -719231322, 508177058, -1964843769, 1388428814, -1228190984, 2122572457, 1782573163, -978256593, 324572090, -2113147660, -1376427818, 920395647, -333174173};
    }

    public nw(@NotNull Context context, float f6, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "");
        SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(4).build()).build();
        Intrinsics.checkNotNullExpressionValue(soundPoolBuild, "");
        this.f57358a = soundPoolBuild;
        this.f57359b = soundPoolBuild.load(context, R.raw.success_tone, 1);
        this.f57360c = soundPoolBuild.load(context, R.raw.failure_tone, 1);
        setY(f6);
        this.f57361d = z10;
        this.f57362e = z11;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x025a  */
    /* JADX WARN: Code duplicated, block: B:48:0x025b  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        int i12 = f57356k + 125;
        f57355j = i12 % 128;
        int i13 = i12 % 2;
        while (true) {
            int i14 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i14 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f57352g[i10 + i14])};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(1832327647);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getEdgeSlop() >> 16), Gravity.getAbsoluteGravity(0, 0) + 44, Color.red(0) + 728);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b10, b11, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                    map.put(1832327647, method);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f57353h), Integer.valueOf(c10)};
                Object method2 = map.get(2012362404);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 46116), View.resolveSize(0, 0) + 43, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1776);
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    c(b12, (byte) (b13 - 1), b13, objArr5);
                    String str = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method2 = cls2.getMethod(str, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method2);
                }
                jArr[i14] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method3 = map.get(1606688712);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) Color.blue(0), 26 - TextUtils.lastIndexOf("", '0', 0, 0), 2312 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 5);
                    Object[] objArr7 = new Object[1];
                    c(b14, (byte) (b15 - 5), b15, objArr7);
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
            int i15 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i15 >= i11) {
                String str2 = new String(cArr);
                int i16 = f57356k + 1;
                f57355j = i16 % 128;
                if (i16 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str2;
                return;
            }
            int i17 = f57355j + 87;
            f57356k = i17 % 128;
            if (i17 % 2 == 0) {
                cArr[i15] = (char) jArr[i15];
                Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Map map2 = setTextScaleX.setMaxEms;
                Object method4 = map2.get(1606688712);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 26 - TextUtils.lastIndexOf("", '0', 0), 2311 - Color.green(0));
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 + 5);
                    Object[] objArr9 = new Object[1];
                    c(b16, (byte) (b17 - 5), b17, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                    map2.put(1606688712, method4);
                }
                ((Method) method4).invoke(null, objArr8);
                throw null;
            }
            cArr[i15] = (char) jArr[i15];
            Object[] objArr10 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map3 = setTextScaleX.setMaxEms;
            Object method5 = map3.get(1606688712);
            if (method5 == null) {
                Class cls6 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 27, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2311);
                byte b18 = (byte) 0;
                byte b19 = (byte) (b18 + 5);
                Object[] objArr11 = new Object[1];
                c(b18, (byte) (b19 - 5), b19, objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map3.put(1606688712, method5);
            }
            ((Method) method5).invoke(null, objArr10);
        }
    }

    public static void b(int[] iArr, int i10, Object[] objArr) throws Throwable {
        int[] iArr2;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr = new char[4];
        int i11 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f57354i;
        int i12 = 1;
        long j10 = 0;
        int i13 = 1833429914;
        int i14 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            iArr2 = new int[length];
            int i15 = 0;
            while (i15 < length) {
                int i16 = f57356k + 25;
                f57355j = i16 % 128;
                int i17 = i16 % i11;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i15])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i13));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) TextUtils.getCapsMode("", 0, 0), 44 - ExpandableListView.getPackedPositionType(j10), 728 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte b10 = (byte) 0;
                        Object[] objArr3 = new Object[1];
                        c(b10, b10, (byte) (b10 | 37), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1833429914, method);
                    }
                    iArr2[i15] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    i15++;
                    i11 = 2;
                    j10 = 0;
                    i13 = 1833429914;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
        } else {
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        if (iArr3 != null) {
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int i18 = 0;
            while (i18 < length3) {
                Object[] objArr4 = new Object[i12];
                objArr4[i14] = Integer.valueOf(iArr3[i18]);
                Map map2 = setTextScaleX.setMaxEms;
                Object method2 = map2.get(1833429914);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.rgb(i14, i14, i14) + 16777260, (TypedValue.complexToFloat(i14) > 0.0f ? 1 : (TypedValue.complexToFloat(i14) == 0.0f ? 0 : -1)) + 728);
                    byte b11 = (byte) i14;
                    Object[] objArr5 = new Object[1];
                    c(b11, b11, (byte) (b11 | 37), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(1833429914, method2);
                }
                iArr5[i18] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i18++;
                iArr3 = iArr3;
                i12 = 1;
                i14 = 0;
            }
            iArr3 = iArr5;
        }
        int i19 = i14;
        System.arraycopy(iArr3, i19, iArr4, i19, length2);
        setonlongclicklistener.setDividerPadding = i19;
        while (true) {
            int i20 = setonlongclicklistener.setDividerPadding;
            if (i20 >= iArr.length) {
                break;
            }
            int i21 = iArr[i20];
            char c10 = (char) (i21 >> 16);
            cArr[i19] = c10;
            char c11 = (char) i21;
            cArr[1] = c11;
            int i22 = iArr[i20 + 1];
            char c12 = (char) (i22 >> 16);
            cArr[2] = c12;
            char c13 = (char) i22;
            cArr[3] = c13;
            setonlongclicklistener.setY = (c10 << 16) + c11;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c12 << 16) + c13;
            setOnLongClickListener.setX(iArr4);
            int i23 = 0;
            for (int i24 = 16; i23 < i24; i24 = 16) {
                int i25 = f57355j + 105;
                f57356k = i25 % 128;
                if (i25 % 2 == 0) {
                    int i26 = setonlongclicklistener.setY ^ iArr4[i23];
                    setonlongclicklistener.setY = i26;
                    Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i26)), setonlongclicklistener, setonlongclicklistener};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-350984188);
                    if (method3 == null) {
                        method3 = ((Class) setTextScaleX.setX((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> i24) + 41, 179 - ImageFormat.getBitsPerPixel(0))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map3.put(-350984188, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                    i23 += 82;
                } else {
                    int i27 = setonlongclicklistener.setY ^ iArr4[i23];
                    setonlongclicklistener.setY = i27;
                    Object[] objArr7 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i27)), setonlongclicklistener, setonlongclicklistener};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(-350984188);
                    if (method4 == null) {
                        method4 = ((Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 41 - KeyEvent.getDeadChar(0, 0), 179 - ExpandableListView.getPackedPositionChild(0L))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map4.put(-350984188, method4);
                    }
                    int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue2;
                    i23++;
                }
            }
            int i28 = setonlongclicklistener.setY;
            int i29 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i30 = i28 ^ iArr4[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i30;
            int i31 = i29 ^ iArr4[17];
            setonlongclicklistener.setY = i31;
            cArr[0] = (char) (i31 >>> 16);
            cArr[1] = (char) i31;
            cArr[2] = (char) (i30 >>> 16);
            cArr[3] = (char) i30;
            setOnLongClickListener.setX(iArr4);
            int i32 = setonlongclicklistener.setDividerPadding * 2;
            cArr2[i32] = cArr[0];
            cArr2[i32 + 1] = cArr[1];
            cArr2[i32 + 2] = cArr[2];
            cArr2[i32 + 3] = cArr[3];
            Object[] objArr8 = {setonlongclicklistener, setonlongclicklistener};
            Map map5 = setTextScaleX.setMaxEms;
            Object method5 = map5.get(-147294223);
            if (method5 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) Color.green(0), (ViewConfiguration.getTapTimeout() >> 16) + 41, 483 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                byte b12 = (byte) 0;
                Object[] objArr9 = new Object[1];
                c(b12, b12, (byte) (b12 | 41), objArr9);
                method5 = cls3.getMethod((String) objArr9[0], Object.class, Object.class);
                map5.put(-147294223, method5);
            }
            ((Method) method5).invoke(null, objArr8);
            i19 = 0;
        }
        String str = new String(cArr2, 0, i10);
        int i33 = f57355j + 95;
        f57356k = i33 % 128;
        if (i33 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 67
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r0 = new byte[r7]
            byte[] r1 = com.mypinpad.tsdk.isolation.nw.f57357l
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r1
            r5 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            goto L33
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r0[r3] = r4
            if (r5 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r1[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L33:
            int r7 = -r7
            int r7 = r7 + r10
            int r9 = r9 + 1
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.nw.c(byte, byte, short, java.lang.Object[]):void");
    }

    public static void d() {
        f57357l = new byte[]{107, -84, 8, 70};
    }

    @Override // com.mypinpad.tsdk.isolation.getRevealSystemBarToastMessage
    public final void setOnFocusChangeListener(@NotNull getRevealSystemBarToastMessage.setDividerPadding setdividerpadding) throws Throwable {
        int i10;
        Intrinsics.checkNotNullParameter(setdividerpadding, "");
        if (this.f57363f < 0.001d) {
            mr mrVar = mr.setDividerPadding;
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31303), View.getDefaultSize(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14, objArr);
            mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
            return;
        }
        int i11 = setOnFocusChangeListener.setOnFocusChangeListener[setdividerpadding.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!this.f57362e) {
                mr mrVar2 = mr.setDividerPadding;
                Object[] objArr2 = new Object[1];
                a((char) (View.MeasureSpec.getMode(0) + 29194), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43, 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                mt.setX(new Object[]{mrVar2, ((String) objArr2[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                return;
            }
            i10 = this.f57360c;
        } else {
            if (!this.f57361d) {
                mr mrVar3 = mr.setDividerPadding;
                Object[] objArr3 = new Object[1];
                a((char) TextUtils.indexOf("", "", 0, 0), 14 - Color.blue(0), 30 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
                mt.setX(new Object[]{mrVar3, ((String) objArr3[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                return;
            }
            i10 = this.f57359b;
        }
        int i12 = i10;
        mr mrVar4 = mr.setDividerPadding;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr4 = new Object[1];
        b(new int[]{-1916258449, -295892522, 1905526100, 1810547286, -927507055, 643296646, 1175093943, 928957438}, TextUtils.getCapsMode("", 0, 0) + 16, objArr4);
        sb2.append(((String) objArr4[0]).intern());
        sb2.append(setdividerpadding.name());
        sb2.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr5 = new Object[1];
        b(new int[]{1610787698, 834739625, 1113334499, 783869100}, 6 - KeyEvent.getDeadChar(0, 0), objArr5);
        String str = String.format(((String) objArr5[0]).intern(), Arrays.copyOf(new Object[]{Float.valueOf(this.f57363f * 100.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        sb2.append(str);
        mt.setX(new Object[]{mrVar4, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
        SoundPool soundPool = this.f57358a;
        float f6 = this.f57363f;
        boolean z10 = soundPool.play(i12, f6, f6, 1, 0, 1.0f) == 0;
        if (z10) {
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(new int[]{1542640955, 724730775, 700282470, 1610778620, 1129211261, 808321947, -1107499077, -75587593}, 15 - TextUtils.getOffsetBefore("", 0), objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(setdividerpadding.name());
            mt.setX(new Object[]{mrVar4, sb3.toString()}, -855939515, 855939522, (int) System.currentTimeMillis());
        }
        mu.setCompoundDrawableTintBlendMode(new Object[]{150003, getDisplayExponent.setDividerPadding(!z10), null, 4}, -1968587119, 1968587120, 150003);
    }

    @Override // com.mypinpad.tsdk.isolation.nn
    public final void setY(float f6) {
        this.f57363f = ((Number) c.coerceIn(Float.valueOf(f6), e.rangeTo(0.0f, 1.0f))).floatValue();
    }
}
