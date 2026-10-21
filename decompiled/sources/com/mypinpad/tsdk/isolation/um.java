package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mypinpad.tsdk.api.models.AsiaPacificEndpoint;
import com.mypinpad.tsdk.api.models.Endpoint;
import com.mypinpad.tsdk.api.models.EuropeEndpoint;
import com.mypinpad.tsdk.api.models.GlobalEndpoint;
import com.mypinpad.tsdk.api.models.IntegrationEndpoint;
import com.mypinpad.tsdk.api.models.NorthAmericaEndpoint;
import com.mypinpad.tsdk.api.models.SouthAmericaEndpoint;
import com.mypinpad.tsdk.api.models.SouthPacificEndpoint;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/um;", "", "Lcom/mypinpad/tsdk/api/models/Endpoint;", "p0", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/api/models/Endpoint;)Ljava/lang/String;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/api/models/Endpoint;)[Ljava/lang/String;", "setDividerPadding", "Lcom/mypinpad/tsdk/i/um$setX;", "setX", "(Lcom/mypinpad/tsdk/api/models/Endpoint;)Lcom/mypinpad/tsdk/i/um$setX;", "setY", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class um {

    @NotNull
    public static final um INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char f61378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char f61379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static char f61380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static char f61381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f61382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f61383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f61384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f61385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f61386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f61387j = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/um$setX;", "", "Ljava/io/Serializable;", "setX", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 8, 0})
    public static final class setX implements Serializable {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        public static final setX setCompoundDrawableTintBlendMode;
        private static final /* synthetic */ setX[] setDividerPadding;
        private static int setLayoutAnimation;
        private static int setOnFocusChangeListener;
        public static final setX setX;
        private static long setY;

        static {
            setX[] setxArr;
            c();
            $10 = 0;
            $11 = 1;
            setOnFocusChangeListener = 0;
            setLayoutAnimation = 1;
            d();
            Object[] objArr = new Object[1];
            a("醆✅ﲅ", Color.alpha(0) + 46723, objArr);
            setX setx = new setX(((String) objArr[0]).intern(), 0);
            setX = setx;
            Object[] objArr2 = new Object[1];
            a("醅廲ྊ", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52999, objArr2);
            setX setx2 = new setX(((String) objArr2[0]).intern(), 1);
            setCompoundDrawableTintBlendMode = setx2;
            int i10 = setOnFocusChangeListener;
            int i11 = i10 + 81;
            setLayoutAnimation = i11 % 128;
            if (i11 % 2 == 0) {
                setxArr = new setX[3];
                setxArr[1] = setx;
                setxArr[1] = setx2;
            } else {
                setxArr = new setX[]{setx, setx2};
            }
            setDividerPadding = setxArr;
            int i12 = i10 + 59;
            setLayoutAnimation = i12 % 128;
            int i13 = i12 % 2;
        }

        public setX() {
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x017d  */
        /* JADX WARN: Code duplicated, block: B:33:0x017e  */
        public static void a(String str, int i10, Object[] objArr) throws Throwable {
            int i11;
            Throwable cause;
            int i12 = $10 + 25;
            $11 = i12 % 128;
            char c10 = 2;
            int i13 = i12 % 2;
            char[] charArray = str.toCharArray();
            setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
            setlayoutanimation.setOnFocusChangeListener = i10;
            int length = charArray.length;
            long[] jArr = new long[length];
            setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
            while (true) {
                int i14 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                if (i14 >= charArray.length) {
                    break;
                }
                char c11 = charArray[i14];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[c10] = setlayoutanimation;
                    objArr2[1] = setlayoutanimation;
                    objArr2[0] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTapTimeout() >> 16), 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1194);
                        byte b10 = (byte) 1;
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (setY ^ 1779209353347916695L);
                    Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) + 44, 728 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, b13, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                        map.put(645183118, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    c10 = 2;
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
            int i15 = $11 + 99;
            $10 = i15 % 128;
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
                    Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 44, 728 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, b15, objArr7);
                    i11 = 2;
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i16 = i11;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 2
                int r0 = 1 - r7
                int r6 = r6 * 3
                int r6 = r6 + 107
                byte[] r1 = com.mypinpad.tsdk.i.um.setX.$$a
                int r8 = r8 * 3
                int r8 = 4 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L1c
                r6 = r7
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r9
                r9 = r8
                goto L36
            L1c:
                r3 = r2
            L1d:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2a:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r9
                r9 = r6
                r6 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L36:
                int r8 = r8 + 1
                int r7 = -r7
                int r7 = r7 + r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.um.setX.b(byte, short, short, java.lang.Object[]):void");
        }

        public static void c() {
            $$a = new byte[]{123, -100, Constants.CVR_B2b8765_1111_APP_DISABLED, 20};
            $$b = 226;
        }

        public static void d() {
            setY = 2490532390421885520L;
        }

        public static setX valueOf(String str) {
            int i10 = setLayoutAnimation + 75;
            setOnFocusChangeListener = i10 % 128;
            int i11 = i10 % 2;
            setX setx = (setX) Enum.valueOf(setX.class, str);
            int i12 = setLayoutAnimation + 21;
            setOnFocusChangeListener = i12 % 128;
            int i13 = i12 % 2;
            return setx;
        }

        public static setX[] values() {
            int i10 = setOnFocusChangeListener + 59;
            setLayoutAnimation = i10 % 128;
            int i11 = i10 % 2;
            setX[] setxArr = (setX[]) setDividerPadding.clone();
            int i12 = setLayoutAnimation + 87;
            setOnFocusChangeListener = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 54 / 0;
            }
            return setxArr;
        }
    }

    static {
        d();
        f61385h = 0;
        f61386i = 1;
        f61383f = 0;
        f61384g = 1;
        e();
        INSTANCE = new um();
        int i10 = f61384g + 5;
        f61383f = i10 % 128;
        int i11 = i10 % 2;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11 = f61386i + 7;
        f61385h = i11 % 128;
        int i12 = 2;
        if (i11 % 2 != 0) {
            int i13 = 43 / 0;
        }
        char[] charArray = str.toCharArray();
        int i14 = f61385h + 35;
        f61386i = i14 % 128;
        int i15 = i14 % 2;
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i16 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[0] = charArray[i16];
            cArr2[1] = charArray[i16 + 1];
            int i17 = 58224;
            int i18 = 0;
            while (i18 < 16) {
                int i19 = f61385h + 93;
                f61386i = i19 % 128;
                int i20 = i19 % i12;
                char c10 = cArr2[1];
                char c11 = cArr2[0];
                int i21 = (c11 + i17) ^ ((c11 << 4) + ((char) (((long) f61380c) ^ 4333817592127744003L)));
                int i22 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f61381d);
                    objArr2[i12] = Integer.valueOf(i22);
                    objArr2[1] = Integer.valueOf(i21);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Color.red(0) + 48534), 47 - View.MeasureSpec.getMode(0), 2672 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr3 = new Object[1];
                        c(b10, b11, b11, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) f61378a) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f61379b)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 48534), 47 - Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0') + 2673);
                        byte b12 = (byte) (-1);
                        byte b13 = (byte) (b12 + 1);
                        Object[] objArr5 = new Object[1];
                        c(b12, b13, b13, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i17 -= 40503;
                    i18++;
                    i12 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i23 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i23] = cArr2[0];
            cArr[i23 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2145 - ExpandableListView.getPackedPositionGroup(0L));
                byte b14 = (byte) (-1);
                byte b15 = (byte) (b14 + 1);
                Object[] objArr7 = new Object[1];
                c(b14, b15, (byte) (b15 + 1), objArr7);
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            int i24 = f61386i + 117;
            f61385h = i24 % 128;
            int i25 = i24 % 2;
            i12 = 2;
        }
    }

    public static void b(String str, int i10, Object[] objArr) throws Throwable {
        int i11 = f61386i + 1;
        f61385h = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        setOnDragListener setondraglistener = new setOnDragListener();
        char[] y7 = setOnDragListener.setY(f61382e ^ 2122665171656649951L, charArray, i10);
        setondraglistener.setDividerPadding = 4;
        while (true) {
            int i12 = setondraglistener.setDividerPadding;
            if (i12 >= y7.length) {
                objArr[0] = new String(y7, 4, y7.length - 4);
                return;
            }
            int i13 = f61385h + 51;
            f61386i = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i12 - 4;
            setondraglistener.setX = i15;
            try {
                Object[] objArr2 = {Long.valueOf(y7[i12] ^ y7[i12 % 4]), Long.valueOf(i15), Long.valueOf(f61382e)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(2144228148);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (9780 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), '[' - AndroidCharacter.getMirror('0'), 3187 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod("y", cls2, cls2, cls2);
                    map.put(2144228148, method);
                }
                y7[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setondraglistener, setondraglistener};
                Object method2 = map.get(-62642757);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), 52 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.getDefaultSize(0, 0) + 3029);
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr4 = new Object[1];
                    c(b10, b11, (byte) (b11 | 7), objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-62642757, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r8 = r8 * 2
            int r8 = r8 + 103
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.um.f61387j
            if (r2 != 0) goto L19
            r8 = r7
            r4 = r1
            r3 = r2
            r7 = r6
            r2 = r0
            r0 = r9
            r9 = r8
            goto L38
        L19:
            r3 = r1
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2e:
            r3 = r2[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L38:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.um.c(int, int, int, java.lang.Object[]):void");
    }

    public static void d() {
        f61387j = new byte[]{70, -122, 54, 105};
    }

    public static void e() {
        f61381d = (char) 42903;
        f61380c = (char) 37968;
        f61378a = (char) 58886;
        f61379b = (char) 62312;
        f61382e = -1279682571792480916L;
    }

    @NotNull
    public static String[] setCompoundDrawableTintBlendMode(@NotNull Endpoint p4) {
        return (String[]) setDividerPadding(new Object[]{p4}, -1659648415, 1659648415, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Endpoint endpoint = (Endpoint) objArr[0];
        Object[] objArr2 = new Object[1];
        b("훳뫙횀錂ᐎ猪䜉蜽瀊檐\uee13\ud99a魜췅뒤ブ⋃꒸厬譛䶌繓\ufaf7\ue216靽턃脥䕥㹽꣰⠔龜太ώ\uf69a\uf6f9\ue0e2\udab8鶛䥝\u0bad뱢⓵ꀅ啛\u171e썿ﭴﰅ\ueedb橧巤ܠ䇃ヅ", 1 - TextUtils.getOffsetBefore("", 0), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b("屇靹尴뺢᪣τ䦤绯諭䜰\ue0be⁙ᇫ\ue063먧줥ꡰ褭嵑犈읇发\uf400ᮢᷘﲛ辫벳뒿蔷⛜晈폧⹕\uf86a༫橐\uf75f錟냿脅醒⩝姕\udfdb㪝췒ʻ盆썙撦ꑍ足氎㹨", 1 - TextUtils.getTrimmedLength(""), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("\uec19齀㊘\ue982鮻\ue7e4捄ﴆ蕅溇\ue6f7\ue72e笨⌉ᡐꕌ魤\ue7b4解㌁袖⭅앹\uee78\u0ccf\ue991鮔ჾྸ虢㲀뫲\uf88a쌹酊籵\ud83e圀嵅≱⠼颵梇휾萙풌䕊\uf85f懋ꔲ䒘倅", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 50, objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        Intrinsics.checkNotNullParameter(endpoint, "");
        if (Intrinsics.areEqual(endpoint, IntegrationEndpoint.INSTANCE)) {
            int i13 = f61383f + 121;
            f61384g = i13 % 128;
            int i14 = i13 % 2;
            return new String[]{strIntern, strIntern2, strIntern3};
        }
        if (!Intrinsics.areEqual(endpoint, GlobalEndpoint.INSTANCE) && !Intrinsics.areEqual(endpoint, EuropeEndpoint.INSTANCE)) {
            if (Intrinsics.areEqual(endpoint, AsiaPacificEndpoint.INSTANCE)) {
                int i15 = f61384g + 79;
                f61383f = i15 % 128;
                if (i15 % 2 == 0) {
                    return new String[]{strIntern, strIntern2, strIntern3};
                }
                String[] strArr = new String[3];
                strArr[1] = strIntern;
                strArr[1] = strIntern2;
                strArr[3] = strIntern3;
                return strArr;
            }
            if (!Intrinsics.areEqual(endpoint, SouthPacificEndpoint.INSTANCE) && !Intrinsics.areEqual(endpoint, NorthAmericaEndpoint.INSTANCE)) {
                if (!Intrinsics.areEqual(endpoint, SouthAmericaEndpoint.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i16 = f61384g + 59;
                f61383f = i16 % 128;
                if (i16 % 2 == 0) {
                    return new String[]{strIntern, strIntern2, strIntern3};
                }
                String[] strArr2 = new String[4];
                strArr2[0] = strIntern;
                strArr2[0] = strIntern2;
                strArr2[3] = strIntern3;
                return strArr2;
            }
            return new String[]{strIntern, strIntern2, strIntern3};
        }
        return new String[]{strIntern, strIntern2, strIntern3};
    }

    @NotNull
    public static String setOnFocusChangeListener(@NotNull Endpoint p4) throws Throwable {
        Intrinsics.checkNotNullParameter(p4, "");
        if (Intrinsics.areEqual(p4, IntegrationEndpoint.INSTANCE)) {
            Object[] objArr = new Object[1];
            a("츚\uf181ڹ㧞혰䟚攑뜟ﻢ\ufaecⰩ鋾癹鷋䓰舰胍૭ྷ㒣툤ꌭ薎ꖳ촃뮇羽㢃", KeyEvent.normalizeMetaState(0) + 27, objArr);
            return ((String) objArr[0]).intern();
        }
        if (Intrinsics.areEqual(p4, GlobalEndpoint.INSTANCE)) {
            int i10 = f61383f + 113;
            f61384g = i10 % 128;
            if (i10 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                a("츚\uf181ڹ㧞혰䟚攑뜟㘵\udd49靑輼胍૭ྷ㒣툤ꌭ薎ꖳ촃뮇羽㢃", Drawable.resolveOpacity(0, 0) + 23, objArr2);
                return ((String) objArr2[0]).intern();
            }
            Object[] objArr3 = new Object[1];
            a("츚\uf181ڹ㧞혰䟚攑뜟㘵\udd49靑輼胍૭ྷ㒣툤ꌭ薎ꖳ촃뮇羽㢃", 126 >>> Drawable.resolveOpacity(0, 1), objArr3);
            return ((String) objArr3[0]).intern();
        }
        if (Intrinsics.areEqual(p4, EuropeEndpoint.INSTANCE)) {
            int i11 = f61384g + 67;
            f61383f = i11 % 128;
            int i12 = i11 % 2;
            Object[] objArr4 = new Object[1];
            b("\udb13\u0a58\udb7b⎟䂓꾉ᎁ틠綬\uda1d몎豃雪絣\ue004攕⼒ᐺݨ\udeda䁎컂깵랩骁憇햐ჸ㏵ᡊ糒", 1 - Color.blue(0), objArr4);
            return ((String) objArr4[0]).intern();
        }
        if (Intrinsics.areEqual(p4, AsiaPacificEndpoint.INSTANCE)) {
            Object[] objArr5 = new Object[1];
            a("츚\uf181ڹ㧞혰䟚攑뜟㘵\udd49擾䕼㘵\udd49蚩\ue9b4胍૭ྷ㒣툤ꌭ薎ꖳ촃뮇羽㢃", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27, objArr5);
            return ((String) objArr5[0]).intern();
        }
        if (Intrinsics.areEqual(p4, SouthPacificEndpoint.INSTANCE)) {
            Object[] objArr6 = new Object[1];
            a("츚\uf181ڹ㧞혰䟚攑뜟㘵\udd49擾䕼ઞ즠蚩\ue9b4胍૭ྷ㒣툤ꌭ薎ꖳ촃뮇羽㢃", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26, objArr6);
            return ((String) objArr6[0]).intern();
        }
        if (!Intrinsics.areEqual(p4, NorthAmericaEndpoint.INSTANCE)) {
            if (!Intrinsics.areEqual(p4, SouthAmericaEndpoint.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr7 = new Object[1];
            a("츚\uf181ڹ㧞혰䟚攑뜟㘵\udd49擾䕼ﻢ\ufaec蚩\ue9b4胍૭ྷ㒣툤ꌭ薎ꖳ촃뮇羽㢃", 26 - Process.getGidForName(""), objArr7);
            return ((String) objArr7[0]).intern();
        }
        int i13 = f61384g + 57;
        f61383f = i13 % 128;
        int i14 = i13 % 2;
        Object[] objArr8 = new Object[1];
        b("匔\uaa3d卼菺鯤\udce8죶ꆁ\uf5ab穸懹Ｂử\udd06㭳ᙴꜞ둋\udc1f궻졉溧甂쓈ኆ쇢\u0ee7掙믲렯ꞥ", (-16777215) - Color.rgb(0, 0, 0), objArr8);
        return ((String) objArr8[0]).intern();
    }

    @NotNull
    public static setX setX(@NotNull Endpoint p4) {
        int i10 = f61384g + 115;
        f61383f = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        if (Intrinsics.areEqual(p4, IntegrationEndpoint.INSTANCE)) {
            return setX.setCompoundDrawableTintBlendMode;
        }
        if (Intrinsics.areEqual(p4, GlobalEndpoint.INSTANCE)) {
            int i12 = f61384g + 43;
            f61383f = i12 % 128;
            if (i12 % 2 != 0) {
                setX setx = setX.setX;
                throw null;
            }
            setX setx2 = setX.setCompoundDrawableTintBlendMode;
            int i13 = f61384g + 13;
            f61383f = i13 % 128;
            int i14 = i13 % 2;
            return setx2;
        }
        if (Intrinsics.areEqual(p4, EuropeEndpoint.INSTANCE)) {
            return setX.setCompoundDrawableTintBlendMode;
        }
        if (Intrinsics.areEqual(p4, AsiaPacificEndpoint.INSTANCE)) {
            int i15 = f61384g + 45;
            f61383f = i15 % 128;
            if (i15 % 2 == 0) {
                return setX.setCompoundDrawableTintBlendMode;
            }
            setX setx3 = setX.setX;
            throw null;
        }
        if (Intrinsics.areEqual(p4, SouthPacificEndpoint.INSTANCE)) {
            return setX.setCompoundDrawableTintBlendMode;
        }
        if (Intrinsics.areEqual(p4, NorthAmericaEndpoint.INSTANCE)) {
            return setX.setCompoundDrawableTintBlendMode;
        }
        if (Intrinsics.areEqual(p4, SouthAmericaEndpoint.INSTANCE)) {
            return setX.setCompoundDrawableTintBlendMode;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static String setY(@NotNull Endpoint p4) throws Throwable {
        Object[] objArr = new Object[1];
        a("츚\uf181ڹ㧞혰䟚攑뜟漂䉋疗\udb23䨁되霬\u10cf꯰㣛¼瀬鏯\ueecd㻃쩲唄\ue252髠䆋ड़”\uea26䀉\uefbb퉺\uea26䀉尒ꤡ脢앢蕡렸ﯥ⊋憐塜\uec5a\uf142絷絏\uea4d\uea20瑂Ὗ랂됥龢졈", 57 - ImageFormat.getBitsPerPixel(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intrinsics.checkNotNullParameter(p4, "");
        if (!(!Intrinsics.areEqual(p4, IntegrationEndpoint.INSTANCE)) || Intrinsics.areEqual(p4, GlobalEndpoint.INSTANCE)) {
            return strIntern;
        }
        if (Intrinsics.areEqual(p4, EuropeEndpoint.INSTANCE)) {
            int i10 = f61384g + 119;
            f61383f = i10 % 128;
            int i11 = i10 % 2;
            return strIntern;
        }
        if (Intrinsics.areEqual(p4, AsiaPacificEndpoint.INSTANCE)) {
            int i12 = f61384g + 99;
            f61383f = i12 % 128;
            int i13 = i12 % 2;
            return strIntern;
        }
        if (!(!Intrinsics.areEqual(p4, SouthPacificEndpoint.INSTANCE))) {
            int i14 = f61383f + 49;
            f61384g = i14 % 128;
            int i15 = i14 % 2;
            return strIntern;
        }
        if (Intrinsics.areEqual(p4, NorthAmericaEndpoint.INSTANCE)) {
            return strIntern;
        }
        if (!Intrinsics.areEqual(p4, SouthAmericaEndpoint.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        int i16 = f61384g + 99;
        f61383f = i16 % 128;
        int i17 = i16 % 2;
        return strIntern;
    }

    @NotNull
    public static String[] setDividerPadding(@NotNull Endpoint p4) throws Throwable {
        Object[] objArr = new Object[1];
        b("훳뫙횀錂ᐎ猪䜉蜽瀊檐\uee13\ud99a魜췅뒤ブ⋃꒸厬譛䶌繓\ufaf7\ue216靽턃脥䕥㹽꣰⠔龜太ώ\uf69a\uf6f9\ue0e2\udab8鶛䥝\u0bad뱢⓵ꀅ啛\u171e썿ﭴﰅ\ueedb橧巤ܠ䇃ヅ", 1 - Gravity.getAbsoluteGravity(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b("\ue11f鴢\ue16c듹ﱈ呺꽏⥑䟦䵫ٕ短겨\uea04峿麠ᔼ茆믧╂穟妗ኺ䱞ꃈ\uf6f8椅\ueb04স轶쀅\u31ec滳␟ỽ墚휐ﴀ痬\ue768㰇鮩첣\u0e77抮ュ⭔唒쮲줷舋\uf3e6ズ昤\ud883", 1 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("\uec19齀㊘\ue982鮻\ue7e4鏑\uea09㽰ܔﱨ辝랫ᣗ綒疏원ꗯꂤ彗ᮗੳ朐⫊捜刐\ued3d꺘穱念ᕈ㿶\uddf6钙疪\ue452\ua7da䰪ᬋ쮔\u31eb볪鉂빨쐇壒瓳\ue264ꐟ鸵䒘倅", View.resolveSize(0, 0) + 51, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b("♖鼀☥뛛䝘욌ᑟ뮧肯佉뵅\ue530毷\ue826\ue7d0\u0c50툂腲ê랳봍寒ꦄ\udeaa査\uf49a툍秿캧购笛ꍟꧺ☭ꗩ쩎ဃｿ컘疘ﭕ馨瞥鲂ꗍ㋽遾쟯ೋ쬏㤇慩\uf7f6搬掓", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a("\uec19齀㊘\ue982鮻\ue7e4霢能⤛漰ྷ㒣摢ᖾత盠ᬯ\ue8a2ꇺᢩ꼃ɛ䦨榘猴摬楢儌Ⱥ䨀鑢⅁ၤ\ue95a㎷쭦\ua63b⤕\uef92\ude1b邭ർꥡ鳕\uee2f︅혫ᠼሑ襔䒘倅", 50 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
        String strIntern5 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b("铫ᙏ钘㾔ࢌ挞宋ḵ㈒옆\uf291䂵\ud915慑ꡊꦛ惜ࠂ企ሦ྾틭\ue660笆핇緔鷝\udc3f籆ь㒛ګᬲ꽥\uea31濋ꋜ瘙腳퀞䦩ე㠧㤙\u1758뮔\udf97扙빩䈀盒쒱䔂\ued6bⱇ", 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr6);
        String strIntern6 = ((String) objArr6[0]).intern();
        Intrinsics.checkNotNullParameter(p4, "");
        if (Intrinsics.areEqual(p4, IntegrationEndpoint.INSTANCE)) {
            String[] strArr = {strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6};
            int i10 = f61383f + 87;
            f61384g = i10 % 128;
            int i11 = i10 % 2;
            return strArr;
        }
        if (!Intrinsics.areEqual(p4, GlobalEndpoint.INSTANCE)) {
            if (!Intrinsics.areEqual(p4, EuropeEndpoint.INSTANCE) && !Intrinsics.areEqual(p4, AsiaPacificEndpoint.INSTANCE) && !Intrinsics.areEqual(p4, SouthPacificEndpoint.INSTANCE) && !Intrinsics.areEqual(p4, NorthAmericaEndpoint.INSTANCE)) {
                if (!Intrinsics.areEqual(p4, SouthAmericaEndpoint.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i12 = f61383f + 53;
                f61384g = i12 % 128;
                if (i12 % 2 != 0) {
                    return new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6};
                }
                String[] strArr2 = new String[43];
                strArr2[1] = strIntern;
                strArr2[1] = strIntern2;
                strArr2[3] = strIntern3;
                strArr2[4] = strIntern4;
                strArr2[4] = strIntern5;
                strArr2[2] = strIntern6;
                return strArr2;
            }
            return new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6};
        }
        int i13 = f61383f;
        int i14 = i13 + 121;
        f61384g = i14 % 128;
        int i15 = i14 % 2;
        String[] strArr3 = {strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6};
        int i16 = i13 + 33;
        f61384g = i16 % 128;
        int i17 = i16 % 2;
        return strArr3;
    }
}
