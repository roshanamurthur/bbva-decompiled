package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getDisplayExponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f55805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f55810f = null;

    public static final class setDividerPadding implements getDynamicButtonIconTextSpacingDp {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ boolean f55811p0;

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            return String.valueOf(((setDividerPadding) objArr[0]).f55811p0);
        }

        @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
        @NotNull
        public final String setX() {
            return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1543133305, -1543133305, System.identityHashCode(this));
        }
    }

    public static final class setX implements getDynamicButtonIconTextSpacingDp {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Enum<?> f55812p0;

        public setX() {
            throw null;
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            return String.valueOf(((setX) objArr[0]).f55812p0.ordinal());
        }

        @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
        @NotNull
        public final String setX() {
            return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -247326259, 247326259, System.identityHashCode(this));
        }
    }

    public static final class setY implements getDynamicButtonIconTextSpacingDp {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ String f55813p0;

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            return ((setY) objArr[0]).f55813p0;
        }

        @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
        @NotNull
        public final String setX() {
            return (String) setY(new Object[]{this}, 341713736, -341713736, System.identityHashCode(this));
        }
    }

    static {
        b();
        f55808d = 0;
        f55809e = 1;
        f55806b = 0;
        f55807c = 1;
        f55805a = new int[]{1599792767, 247832692, -806376473, 1064031347, -449488662, -1981900891, -614483333, 335780584, 1873838146, -1697408954, -1445412161, 759612197, -1242275281, -1634795244, -1084574609, 1288014431, 1823995826, 582688109};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 108 - r8
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.getDisplayExponent.f55810f
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getDisplayExponent.a(byte, byte, short, java.lang.Object[]):void");
    }

    public static void b() {
        f55810f = new byte[]{59, 125, 28, -9};
    }

    @NotNull
    public static final getDynamicButtonIconTextSpacingDp setCompoundDrawableTintBlendMode(@NotNull Enum<?> r3) {
        Intrinsics.checkNotNullParameter(r3, "");
        setX setx = new setX();
        setx.f55812p0 = r3;
        int i10 = f55806b + 75;
        f55807c = i10 % 128;
        int i11 = i10 % 2;
        return setx;
    }

    @NotNull
    public static final getDynamicButtonIconTextSpacingDp setDividerPadding(boolean z10) {
        setDividerPadding setdividerpadding = new setDividerPadding();
        setdividerpadding.f55811p0 = z10;
        int i10 = f55807c + 25;
        f55806b = i10 % 128;
        if (i10 % 2 == 0) {
            return setdividerpadding;
        }
        throw null;
    }

    @NotNull
    public static final getDynamicButtonIconTextSpacingDp setY(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        setY sety = new setY();
        sety.f55813p0 = str;
        int i10 = f55807c + 83;
        f55806b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 47 / 0;
        }
        return sety;
    }

    @NotNull
    public static final getDynamicButtonIconTextSpacingDp setCompoundDrawableTintBlendMode(@NotNull getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp, @Nullable getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp2) throws Throwable {
        StringBuilder sb2;
        int i10;
        int[] iArr;
        char[] cArr;
        Object method;
        int i11 = f55806b + 87;
        f55807c = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        Intrinsics.checkNotNullParameter(getdynamicbuttonicontextspacingdp, "");
        int i14 = 0;
        if (getdynamicbuttonicontextspacingdp2 == null) {
            int i15 = f55807c + 37;
            f55806b = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 4 / 0;
            }
            return getdynamicbuttonicontextspacingdp;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getdynamicbuttonicontextspacingdp.setX());
        int[] iArr2 = {-314864238, 406579427};
        int i17 = 1;
        int i18 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[4];
        int[] iArr3 = f55805a;
        if (iArr3 != null) {
            int i19 = f55809e + 37;
            f55808d = i19 % 128;
            int i20 = i19 % 2;
            int length = iArr3.length;
            iArr = new int[length];
            int i21 = 0;
            while (i21 < length) {
                int i22 = f55808d + 75;
                f55809e = i22 % 128;
                if (i22 % i12 == 0) {
                    try {
                        Object[] objArr = new Object[i17];
                        objArr[i14] = Integer.valueOf(iArr3[i21]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method2 = map.get(1833429914);
                        if (method2 == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionForGroup(i14) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i14) == 0L ? 0 : -1)), 44 - Color.blue(i14), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 728);
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 - 1);
                            Object[] objArr2 = new Object[1];
                            a(b10, b11, (byte) (-b11), objArr2);
                            method2 = cls.getMethod((String) objArr2[0], Integer.TYPE);
                            map.put(1833429914, method2);
                        }
                        iArr[i21] = ((Integer) ((Method) method2).invoke(null, objArr)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                } else {
                    length = length;
                    sb3 = sb3;
                    i18 = i18;
                    Object[] objArr3 = {Integer.valueOf(iArr3[i21])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method3 = map2.get(1833429914);
                    if (method3 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 45, 728 - TextUtils.getOffsetAfter("", 0));
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr4 = new Object[1];
                        a(b12, b13, (byte) (-b13), objArr4);
                        method3 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                        map2.put(1833429914, method3);
                    }
                    iArr[i21] = ((Integer) ((Method) method3).invoke(null, objArr3)).intValue();
                    i21++;
                }
                length = length;
                sb3 = sb3;
                i18 = i18;
                i12 = 2;
                i14 = 0;
                i17 = 1;
            }
            sb2 = sb3;
            i10 = i18;
        } else {
            sb2 = sb3;
            i10 = i18;
            iArr = iArr3;
        }
        int length2 = iArr.length;
        int[] iArr4 = new int[length2];
        float f6 = 0.0f;
        if (iArr3 != null) {
            int i23 = f55808d + 37;
            f55809e = i23 % 128;
            int i24 = i23 % 2;
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int i25 = 0;
            while (i25 < length3) {
                Object[] objArr5 = {Integer.valueOf(iArr3[i25])};
                Map map3 = setTextScaleX.setMaxEms;
                Object method4 = map3.get(1833429914);
                if (method4 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > f6 ? 1 : (TypedValue.complexToFloat(0) == f6 ? 0 : -1)) + 44, KeyEvent.keyCodeFromString("") + 728);
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr6 = new Object[1];
                    a(b14, b15, (byte) (-b15), objArr6);
                    method4 = cls3.getMethod((String) objArr6[0], Integer.TYPE);
                    map3.put(1833429914, method4);
                }
                iArr5[i25] = ((Integer) ((Method) method4).invoke(null, objArr5)).intValue();
                i25++;
                length3 = length3;
                iArr3 = iArr3;
                cArr3 = cArr3;
                f6 = 0.0f;
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
            int i26 = setonlongclicklistener.setDividerPadding;
            if (i26 < 2) {
                int i27 = iArr2[i26];
                char c11 = (char) (i27 >> 16);
                cArr2[c10] = c11;
                char c12 = (char) i27;
                cArr2[1] = c12;
                int i28 = iArr2[i26 + 1];
                char c13 = (char) (i28 >> 16);
                cArr2[2] = c13;
                char c14 = (char) i28;
                cArr2[3] = c14;
                setonlongclicklistener.setY = (c11 << 16) + c12;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = (c13 << 16) + c14;
                setOnLongClickListener.setX(iArr4);
                int i29 = f55809e + 29;
                f55808d = i29 % 128;
                int i30 = i29 % 2;
                for (int i31 = 0; i31 < 16; i31++) {
                    int i32 = f55808d + 7;
                    f55809e = i32 % 128;
                    int i33 = i32 % 2;
                    int i34 = setonlongclicklistener.setY ^ iArr4[i31];
                    setonlongclicklistener.setY = i34;
                    Object[] objArr7 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i34)), setonlongclicklistener, setonlongclicklistener};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object obj = map4.get(-350984188);
                    if (obj != null) {
                        method = obj;
                    } else {
                        method = ((Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 41 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map4.put(-350984188, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr7)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                }
                int i35 = setonlongclicklistener.setY;
                int i36 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                int i37 = i35 ^ iArr4[16];
                setonlongclicklistener.setCompoundDrawableTintBlendMode = i37;
                int i38 = i36 ^ iArr4[17];
                setonlongclicklistener.setY = i38;
                cArr2[0] = (char) (i38 >>> 16);
                cArr2[1] = (char) i38;
                cArr2[2] = (char) (i37 >>> 16);
                cArr2[3] = (char) i37;
                setOnLongClickListener.setX(iArr4);
                int i39 = setonlongclicklistener.setDividerPadding * 2;
                cArr[i39] = cArr2[0];
                cArr[i39 + 1] = cArr2[1];
                cArr[i39 + 2] = cArr2[2];
                cArr[i39 + 3] = cArr2[3];
                Object[] objArr8 = {setonlongclicklistener, setonlongclicklistener};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(-147294223);
                if (method5 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 41 - (ViewConfiguration.getScrollBarSize() >> 8), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 483);
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 - 1);
                    Object[] objArr9 = new Object[1];
                    a(b16, b17, (byte) (b17 + 1), objArr9);
                    method5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map5.put(-147294223, method5);
                }
                ((Method) method5).invoke(null, objArr8);
                c10 = 0;
            } else {
                StringBuilder sb4 = sb2;
                sb4.append(new String(cArr, 0, i10).intern());
                sb4.append(getdynamicbuttonicontextspacingdp2.setX());
                return setY(sb4.toString());
            }
        }
    }
}
