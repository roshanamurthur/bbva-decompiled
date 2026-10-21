package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/getApplicationFilteringSelectors;", "", "", "p0", "setX", "([B)[B", "", "setDividerPadding", "()V", "Lcom/mypinpad/tsdk/i/getApplicationFilteringSelectors$setY;", "setY", "([B)Lcom/mypinpad/tsdk/i/getApplicationFilteringSelectors$setY;", "Lcom/mypinpad/tsdk/i/setMultiChoiceModeListener;", "Lcom/mypinpad/tsdk/i/AsiaPacificEndpoint;", "p1", "Lcom/mypinpad/tsdk/i/setColorFilter;", "p2", "<init>", "(Lcom/mypinpad/tsdk/i/setMultiChoiceModeListener;Lcom/mypinpad/tsdk/i/AsiaPacificEndpoint;Lcom/mypinpad/tsdk/i/setColorFilter;)V"}, k = 1, mv = {1, 5, 1})
public final class getApplicationFilteringSelectors {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f55677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f55678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f55679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f55680l = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setMultiChoiceModeListener f55681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AsiaPacificEndpoint f55682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setColorFilter f55683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Object f55684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public setY f55685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final setScrollBarSize f55686f;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final char[] f55687p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final char f55688q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55689r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f55690s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f55691t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f55692u0;
        public static final byte[] v0 = null;

        static {
            c();
            f55691t0 = 0;
            f55692u0 = 1;
            f55689r0 = 0;
            f55690s0 = 1;
            f55688q0 = (char) 53957;
            f55687p0 = new char[]{59250, 59252, 59254, 59257, 59182, 59189, 59186, 59170, 59185, 59255, 59251, 59149, 59184, 59253, 59256, 59197};
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Object obj) throws Throwable {
            Object[] objArr = new Object[1];
            a(7 - TextUtils.indexOf("", ""), "\f\b\u0004\r\u0007\u000e㘞", (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 59), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(9 - ExpandableListView.getPackedPositionChild(0L), "\f\b\u0004\r\u0007\u000e\u0006\u000b\u0003\b", (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 122), objArr2);
            super(0, obj, getApplicationFilteringSelectors.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
            int i11;
            int i12 = f55691t0 + 37;
            f55692u0 = i12 % 128;
            int i13 = i12 % 2;
            char[] charArray = str.toCharArray();
            setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
            char[] cArr = f55687p0;
            int i14 = 290255894;
            int i15 = 0;
            if (cArr != null) {
                int i16 = f55691t0 + 85;
                f55692u0 = i16 % 128;
                int i17 = i16 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i18 = 0;
                while (i18 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i15] = Integer.valueOf(cArr[i18]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(Integer.valueOf(i14));
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), 45 - Gravity.getAbsoluteGravity(i15, i15), 1116 - Color.red(i15));
                            byte b11 = (byte) i15;
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            b(b11, b12, b12, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(290255894, method);
                        }
                        cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i18++;
                        i14 = 290255894;
                        i15 = 0;
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
            Object[] objArr4 = {Integer.valueOf(f55688q0)};
            Map map2 = setTextScaleX.setMaxEms;
            Object method2 = map2.get(290255894);
            if (method2 == null) {
                Class cls2 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 45 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.rgb(0, 0, 0) + 16778332);
                byte b13 = (byte) 0;
                byte b14 = b13;
                Object[] objArr5 = new Object[1];
                b(b13, b14, b14, objArr5);
                method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                map2.put(290255894, method2);
            }
            char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i11 = i10 - 1;
                cArr3[i11] = (char) (charArray[i11] - b10);
                int i19 = f55692u0 + 43;
                f55691t0 = i19 % 128;
                int i20 = i19 % 2;
            } else {
                i11 = i10;
            }
            if (i11 > 1) {
                setincludefontpadding.setDividerPadding = 0;
                while (true) {
                    int i21 = setincludefontpadding.setDividerPadding;
                    if (i21 >= i11) {
                        break;
                    }
                    char c10 = charArray[i21];
                    setincludefontpadding.setY = c10;
                    int i22 = i21 + 1;
                    char c11 = charArray[i22];
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                    if (c10 == c11) {
                        cArr3[i21] = (char) (c10 - b10);
                        cArr3[i22] = (char) (c11 - b10);
                    } else {
                        Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method3 = map3.get(180437302);
                        if (method3 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) View.getDefaultSize(0, 0), View.combineMeasuredStates(0, 0) + 27, 2311 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr7 = new Object[1];
                            b(b15, b16, (byte) (b16 + 3), objArr7);
                            String str2 = (String) objArr7[0];
                            Class<?> cls4 = Integer.TYPE;
                            method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                            map3.put(180437302, method3);
                        }
                        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                        int i23 = setincludefontpadding.setNavigationOnClickListener;
                        if (iIntValue == i23) {
                            Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                            Object method4 = map3.get(1989802713);
                            if (method4 == null) {
                                Class cls5 = (Class) setTextScaleX.setX((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49102), TextUtils.indexOf("", "", 0, 0) + 35, TextUtils.indexOf("", "", 0) + 2545);
                                byte b17 = (byte) 0;
                                byte b18 = b17;
                                Object[] objArr9 = new Object[1];
                                b(b17, b18, (byte) (b18 | 7), objArr9);
                                String str3 = (String) objArr9[0];
                                Class<?> cls6 = Integer.TYPE;
                                method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                                map3.put(1989802713, method4);
                            }
                            int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                            int i24 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                            int i25 = setincludefontpadding.setDividerPadding;
                            cArr3[i25] = cArr[iIntValue2];
                            cArr3[i25 + 1] = cArr[i24];
                        } else {
                            int i26 = setincludefontpadding.setX;
                            int i27 = setincludefontpadding.setOnFocusChangeListener;
                            if (i26 == i27) {
                                int i28 = f55691t0 + 125;
                                f55692u0 = i28 % 128;
                                int i29 = i28 % 2;
                                int iA = androidx.activity.a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                                setincludefontpadding.setOnLongClickListener = iA;
                                int iA2 = androidx.activity.a.a(i23, cCharValue, 1, cCharValue);
                                setincludefontpadding.setNavigationOnClickListener = iA2;
                                int i30 = (i27 * cCharValue) + iA2;
                                int i31 = setincludefontpadding.setDividerPadding;
                                cArr3[i31] = cArr[(i26 * cCharValue) + iA];
                                cArr3[i31 + 1] = cArr[i30];
                            } else {
                                int i32 = (i26 * cCharValue) + i23;
                                int i33 = (i27 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                                int i34 = setincludefontpadding.setDividerPadding;
                                cArr3[i34] = cArr[i32];
                                cArr3[i34 + 1] = cArr[i33];
                            }
                        }
                    }
                    setincludefontpadding.setDividerPadding += 2;
                }
            }
            int i35 = 0;
            while (i35 < i10) {
                int i36 = f55691t0 + 61;
                f55692u0 = i36 % 128;
                if (i36 % 2 == 0) {
                    cArr3[i35] = (char) (cArr3[i35] ^ 16929);
                    i35 += 31;
                } else {
                    cArr3[i35] = (char) (cArr3[i35] ^ 13722);
                    i35++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 2
                int r0 = r6 + 1
                int r8 = r8 + 99
                int r7 = r7 * 3
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                byte[] r1 = com.mypinpad.tsdk.i.getApplicationFilteringSelectors.a.v0
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L25:
                r3 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L2a:
                int r3 = -r3
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.getApplicationFilteringSelectors.a.b(byte, short, short, java.lang.Object[]):void");
        }

        public static void c() {
            v0 = new byte[]{GenerateAcResponseApdu.DDA_HEADER, 15, 117, 20};
        }

        public final void d() {
            int i10 = f55690s0 + 13;
            f55689r0 = i10 % 128;
            int i11 = i10 % 2;
            getApplicationFilteringSelectors.setX(new Object[]{(getApplicationFilteringSelectors) this.receiver}, -1600031642, 1600031642, (int) System.currentTimeMillis());
            int i12 = f55690s0 + 17;
            f55689r0 = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            Unit unit;
            int i10 = f55689r0 + 83;
            f55690s0 = i10 % 128;
            int i11 = i10 % 2;
            d();
            if (i11 == 0) {
                unit = Unit.INSTANCE;
                int i12 = 18 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i13 = f55689r0 + 115;
            f55690s0 = i13 % 128;
            if (i13 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    static {
        c();
        f55678j = 0;
        f55679k = 1;
        f55676h = 0;
        f55677i = 1;
        e();
        INSTANCE = new Companion(null);
        int i10 = f55676h + 99;
        f55677i = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public getApplicationFilteringSelectors(@NotNull setMultiChoiceModeListener setmultichoicemodelistener, @NotNull AsiaPacificEndpoint asiaPacificEndpoint, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(setmultichoicemodelistener, "");
        Intrinsics.checkNotNullParameter(asiaPacificEndpoint, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f55681a = setmultichoicemodelistener;
        this.f55682b = asiaPacificEndpoint;
        this.f55683c = setcolorfilter;
        this.f55684d = new Object();
        this.f55686f = new setScrollBarSize(new setForceDarkAllowed(), new a(this));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b1  */
    public static void a(int i10, int i11, int i12, String str, Object[] objArr) throws Throwable {
        int i13;
        char[] cArr;
        Throwable cause;
        int i14 = f55679k + 99;
        f55678j = i14 % 128;
        int i15 = 2;
        int i16 = i14 % 2;
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr2 = new char[i10];
        int i17 = 0;
        getnavbartitlestring.setY = 0;
        while (true) {
            int i18 = getnavbartitlestring.setY;
            if (i18 >= i10) {
                break;
            }
            char c10 = charArray[i18];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr2[i18] = c11;
            try {
                Object[] objArr2 = new Object[i15];
                objArr2[1] = Integer.valueOf(f55675g);
                objArr2[i17] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) Color.argb(i17, i17, i17, i17), 41 - (ExpandableListView.getPackedPositionForGroup(i17) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i17) == 0L ? 0 : -1)), 483 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    byte b10 = (byte) i17;
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr3 = new Object[1];
                    b(b10, (byte) (b11 - 1), b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55965 - Process.getGidForName("")), 43 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2268);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i15 = 2;
                i17 = 0;
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
        if (i12 > 0) {
            int i19 = f55679k + 45;
            f55678j = i19 % 128;
            int i20 = i19 % 2;
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr3 = new char[i10];
            System.arraycopy(cArr2, 0, cArr3, 0, i10);
            int i21 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr3, 0, cArr2, i10 - i21, i21);
            int i22 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr3, i22, cArr2, 0, i10 - i22);
        }
        int i23 = f55678j + 25;
        f55679k = i23 % 128;
        if (i23 % 2 == 0) {
            cArr = new char[i10];
            i13 = 0;
        } else {
            i13 = 0;
            cArr = new char[i10];
        }
        getnavbartitlestring.setY = i13;
        while (true) {
            int i24 = getnavbartitlestring.setY;
            if (i24 >= i10) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i24] = cArr2[(i10 - i24) - 1];
            Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1860518195);
            if (method3 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (ImageFormat.getBitsPerPixel(0) + 55967), MotionEvent.axisFromString("") + 44, TextUtils.indexOf((CharSequence) "", '0') + 2269);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, b15, b15, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1860518195, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 65
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            byte[] r2 = com.mypinpad.tsdk.isolation.getApplicationFilteringSelectors.f55680l
            if (r2 != 0) goto L1b
            r8 = r7
            r4 = r1
            r3 = r2
            r7 = r6
            r2 = r0
            r0 = r9
            r9 = r8
            goto L34
        L1b:
            r3 = r1
        L1c:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2b:
            r3 = r2[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L34:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r9 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getApplicationFilteringSelectors.b(byte, byte, short, java.lang.Object[]):void");
    }

    public static void c() {
        f55680l = new byte[]{83, 37, -54, -111};
    }

    public static void e() {
        f55675g = -443080064;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        getApplicationFilteringSelectors getapplicationfilteringselectors = (getApplicationFilteringSelectors) objArr[0];
        int i13 = f55677i + 101;
        f55676h = i13 % 128;
        int i14 = i13 % 2;
        getapplicationfilteringselectors.d();
        int i15 = f55677i + 79;
        f55676h = i15 % 128;
        int i16 = i15 % 2;
        return null;
    }

    public final void d() {
        synchronized (this.f55684d) {
            Object[] objArr = new Object[1];
            a(11 - (Process.myTid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 182, 6 - Gravity.getAbsoluteGravity(0, 0), "\b\u000b\r\u0010\u0017\f\ufff5\uffef\ufff5ￂ\u001b", objArr);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f55683c, 26, null, null, 6}, 1173867142, -1173867141, 26);
            setMultiChoiceModeListener setmultichoicemodelistener = this.f55681a;
            setMultiChoiceModeListener.setX(new Object[]{setmultichoicemodelistener}, 804740668, -804740665, System.identityHashCode(setmultichoicemodelistener));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setDividerPadding() {
        int i10 = f55676h + 85;
        f55677i = i10 % 128;
        int i11 = i10 % 2;
        d();
        this.f55685e = null;
        int i12 = f55677i + 41;
        f55676h = i12 % 128;
        int i13 = i12 % 2;
    }

    @Nullable
    public final setY setY(@NotNull byte[] p4) {
        Intrinsics.checkNotNullParameter(p4, "");
        setY x4 = this.f55682b.setX(p4);
        this.f55685e = x4;
        synchronized (this.f55684d) {
            setMultiChoiceModeListener setmultichoicemodelistener = this.f55681a;
            setMultiChoiceModeListener.setX(new Object[]{setmultichoicemodelistener, p4}, -1043927957, 1043927957, System.identityHashCode(setmultichoicemodelistener));
            setScrollBarSize setscrollbarsize = this.f55686f;
            setscrollbarsize.setOnFocusChangeListener();
            setScrollBarSize.setDividerPadding(new Object[]{setscrollbarsize}, 1794332503, -1794332503, System.identityHashCode(setscrollbarsize));
            Unit unit = Unit.INSTANCE;
        }
        return x4;
    }

    @NotNull
    public final byte[] setX(@NotNull byte[] p4) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(p4, "");
        synchronized (this.f55684d) {
            try {
                setMultiChoiceModeListener setmultichoicemodelistener = this.f55681a;
                if (!((Boolean) setMultiChoiceModeListener.setX(new Object[]{setmultichoicemodelistener}, 352617956, -352617954, System.identityHashCode(setmultichoicemodelistener))).booleanValue()) {
                    Object[] objArr = new Object[1];
                    a(32 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 187, (ViewConfiguration.getLongPressTimeout() >> 16) + 26, "\u0003\u0012\u000e\u0017\u0010\u0001\u0003\u0002ﾾ\u0012\u0013\r\u0006\u0012\u0007\u0015ﾾ\u0017\u0003￩\u0003\u0014\u0007\u0010\u0003\u0002\ufff1￫\ufff1ￋ\u0002", objArr);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                    Unit unit = null;
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f55683c, 25, null, null, 6}, 1173867142, -1173867141, 25);
                    setY sety = this.f55685e;
                    if (sety != null) {
                        setMultiChoiceModeListener setmultichoicemodelistener2 = this.f55681a;
                        setMultiChoiceModeListener.setX(new Object[]{setmultichoicemodelistener2, this.f55682b.setOnFocusChangeListener(sety)}, -1043927957, 1043927957, System.identityHashCode(setmultichoicemodelistener2));
                        setScrollBarSize setscrollbarsize = this.f55686f;
                        setScrollBarSize.setDividerPadding(new Object[]{setscrollbarsize}, 1794332503, -1794332503, System.identityHashCode(setscrollbarsize));
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        throw new getDeclaringClass();
                    }
                }
                bArr = (byte[]) setMultiChoiceModeListener.setX(new Object[]{this.f55681a, p4}, 393644320, -393644319, (int) System.currentTimeMillis());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public static final class setY {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f55693c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f55694d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f55695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f55696b;

        public setY(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.f55695a = str;
            this.f55696b = str2;
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            String str;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i14 | i12)) | (~(i13 | i14)) | (~(i13 | i12))) * (-880)) + (i11 * 881) + (i10 * 881);
            int i16 = i11 | (~(i13 | (~i12)));
            int i17 = ~(i10 | i12);
            if ((i17 * 880) + ((i16 | i17) * (-880)) + i15 != 1) {
                setY sety = (setY) objArr[0];
                int i18 = f55694d;
                int i19 = i18 + 121;
                f55693c = i19 % 128;
                int i20 = i19 % 2;
                str = sety.f55695a;
                if (i20 != 0) {
                    throw null;
                }
                int i21 = i18 & 47;
                int i22 = -(-((i18 ^ 47) | i21));
                int i23 = (i21 & i22) + (i22 | i21);
                f55693c = i23 % 128;
                int i24 = i23 % 2;
            } else {
                setY sety2 = (setY) objArr[0];
                int i25 = f55693c;
                int i26 = i25 & 29;
                int i27 = (i26 - (~((i25 ^ 29) | i26))) - 1;
                int i28 = i27 % 128;
                f55694d = i28;
                int i29 = i27 % 2;
                str = sety2.f55696b;
                int i30 = i28 + 47;
                f55693c = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 18 / 0;
                }
            }
            return str;
        }

        @NotNull
        public final String setY() {
            return (String) setOnFocusChangeListener(new Object[]{this}, -61382174, 61382174, System.identityHashCode(this));
        }

        @NotNull
        public final String setOnFocusChangeListener() {
            return (String) setOnFocusChangeListener(new Object[]{this}, -1861453730, 1861453731, System.identityHashCode(this));
        }
    }
}
