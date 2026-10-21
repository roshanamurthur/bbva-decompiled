package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setIndicatorBounds;", "Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;", "", "setX", "()Ljava/lang/String;", "p0", "p1", "<init>", "([Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;Ljava/lang/String;)V"}, k = 1, mv = {1, 5, 1})
public final class setIndicatorBounds implements getDynamicButtonIconTextSpacingDp {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char[] f59889r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f59890s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final boolean f59891t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final boolean f59892u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f59893w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f59894x0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final getDynamicButtonIconTextSpacingDp[] f59895p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f59896q0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;", "p0", "", "d", "(Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<getDynamicButtonIconTextSpacingDp, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f59897p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int[] f59898q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f59899r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f59900s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f59901t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f59902u0;
        public static final byte[] v0 = null;

        static {
            c();
            f59901t0 = 0;
            f59902u0 = 1;
            f59899r0 = 0;
            f59900s0 = 1;
            setOnFocusChangeListener();
            f59897p0 = new a(1);
            int i10 = f59900s0 + 17;
            f59899r0 = i10 % 128;
            int i11 = i10 % 2;
        }

        public a() {
            super(1);
        }

        public static void a(int[] iArr, int i10, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = f59898q0;
            long j10 = 0;
            int i11 = 1833429914;
            int i12 = 0;
            if (iArr3 != null) {
                int i13 = f59902u0 + 113;
                f59901t0 = i13 % 128;
                if (i13 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                }
                int i14 = 0;
                while (i14 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i12] = Integer.valueOf(iArr3[i14]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(Integer.valueOf(i11));
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionType(j10), 44 - Color.alpha(i12), 728 - View.MeasureSpec.makeMeasureSpec(i12, i12));
                            byte b10 = (byte) i12;
                            byte b11 = (byte) (b10 - 1);
                            Object[] objArr3 = new Object[1];
                            b(b10, b11, (byte) (b11 + 1), objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(1833429914, method);
                        }
                        iArr2[i14] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                        i14++;
                        j10 = 0;
                        i11 = 1833429914;
                        i12 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f59898q0;
            int i15 = 16;
            int i16 = 17;
            if (iArr5 != null) {
                int i17 = f59901t0 + 93;
                f59902u0 = i17 % 128;
                int i18 = i17 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i19 = 0;
                while (i19 < length3) {
                    int i20 = f59902u0 + i16;
                    f59901t0 = i20 % 128;
                    int i21 = i20 % 2;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i19])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1833429914);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollDefaultDelay() >> i15), (-16777172) - Color.rgb(0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 727);
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, (byte) (b13 + 1), objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(1833429914, method2);
                    }
                    iArr6[i19] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    i19++;
                    iArr5 = iArr5;
                    length3 = length3;
                    i15 = 16;
                    i16 = 17;
                }
                iArr5 = iArr6;
            }
            char c10 = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            setonlongclicklistener.setDividerPadding = 0;
            while (true) {
                int i22 = setonlongclicklistener.setDividerPadding;
                if (i22 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i10);
                    return;
                }
                int i23 = iArr[i22];
                char c11 = (char) (i23 >> 16);
                cArr[c10] = c11;
                char c12 = (char) i23;
                cArr[1] = c12;
                int i24 = iArr[i22 + 1];
                char c13 = (char) (i24 >> 16);
                cArr[2] = c13;
                char c14 = (char) i24;
                cArr[3] = c14;
                setonlongclicklistener.setY = (c11 << 16) + c12;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = (c13 << 16) + c14;
                setOnLongClickListener.setX(iArr4);
                int i25 = 0;
                for (int i26 = 16; i25 < i26; i26 = 16) {
                    int i27 = f59901t0 + 93;
                    f59902u0 = i27 % 128;
                    int i28 = i27 % 2;
                    int i29 = setonlongclicklistener.setY ^ iArr4[i25];
                    setonlongclicklistener.setY = i29;
                    Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i29)), setonlongclicklistener, setonlongclicklistener};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-350984188);
                    if (method3 == null) {
                        method3 = ((Class) setTextScaleX.setX((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 41, 180 - View.MeasureSpec.getMode(0))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map3.put(-350984188, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                    i25++;
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
                Object[] objArr7 = {setonlongclicklistener, setonlongclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-147294223);
                if (method4 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 41 - (KeyEvent.getMaxKeyCode() >> 16), ExpandableListView.getPackedPositionType(0L) + 483);
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr8 = new Object[1];
                    b(b14, b15, (byte) (-b15), objArr8);
                    method4 = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-147294223, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                c10 = 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002b  */
        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(int r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 + 4
                int r9 = r9 * 4
                int r9 = r9 + 104
                int r7 = r7 * 2
                int r7 = r7 + 1
                byte[] r0 = new byte[r7]
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.i.setIndicatorBounds.a.v0
                if (r2 != 0) goto L19
                r5 = r1
                r3 = r2
                r2 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                goto L35
            L19:
                r3 = r1
            L1a:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r0[r3] = r4
                int r8 = r8 + 1
                if (r5 != r7) goto L2b
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r1)
                r10[r1] = r7
                return
            L2b:
                r3 = r2[r8]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r2
                r2 = r0
                r0 = r10
                r10 = r9
                r9 = r6
            L35:
                int r7 = -r7
                int r7 = r7 + r10
                r10 = r0
                r0 = r2
                r2 = r3
                r3 = r5
                r6 = r9
                r9 = r7
                r7 = r8
                r8 = r6
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setIndicatorBounds.a.b(int, short, int, java.lang.Object[]):void");
        }

        public static void c() {
            v0 = new byte[]{113, 126, 19, 62};
        }

        public static void setOnFocusChangeListener() {
            f59898q0 = new int[]{-438080406, -411504111, 1990420495, -699584074, -1222311600, 1079257811, -1119543660, -1586601419, -713503311, 2130811814, -1182450882, -862831868, 392250955, 657246656, 1937387401, -1210627668, -1342753123, -1077501679};
        }

        @NotNull
        public final CharSequence d(@Nullable getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp) throws Throwable {
            Object obj;
            int i10 = f59900s0 + 75;
            int i11 = i10 % 128;
            f59899r0 = i11;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (getdynamicbuttonicontextspacingdp != null) {
                String x4 = getdynamicbuttonicontextspacingdp.setX();
                if (x4 != null) {
                    return x4;
                }
                Object[] objArr = new Object[1];
                a(new int[]{-658693024, 543836366}, 4 - Drawable.resolveOpacity(0, 0), objArr);
                return ((String) objArr[0]).intern();
            }
            int i12 = i11 + 1;
            f59900s0 = i12 % 128;
            if (i12 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                a(new int[]{-658693024, 543836366}, 4 / TextUtils.indexOf((CharSequence) "", '3', 1, 0), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                a(new int[]{-658693024, 543836366}, 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
                obj = objArr3[0];
            }
            return ((String) obj).intern();
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp) throws Throwable {
            int i10 = f59899r0 + 89;
            f59900s0 = i10 % 128;
            int i11 = i10 % 2;
            CharSequence charSequenceD = d(getdynamicbuttonicontextspacingdp);
            int i12 = f59899r0 + 31;
            f59900s0 = i12 % 128;
            int i13 = i12 % 2;
            return charSequenceD;
        }
    }

    static {
        b();
        v0 = 0;
        f59893w0 = 1;
        f59891t0 = true;
        f59892u0 = true;
        f59890s0 = 1794962068;
        f59889r0 = new char[]{62112};
    }

    public setIndicatorBounds(@NotNull getDynamicButtonIconTextSpacingDp[] getdynamicbuttonicontextspacingdpArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(getdynamicbuttonicontextspacingdpArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f59895p0 = getdynamicbuttonicontextspacingdpArr;
        this.f59896q0 = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 118
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = new byte[r9]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.setIndicatorBounds.f59894x0
            if (r2 != 0) goto L19
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            goto L34
        L19:
            r3 = r1
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r0[r3] = r5
            if (r4 != r9) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L29:
            int r7 = r7 + 1
            r3 = r2[r7]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L34:
            int r8 = -r8
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setIndicatorBounds.a(byte, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        f59894x0 = new byte[]{94, Constants.CVR_B2b8765_1111_APP_DISABLED, 73, 34};
    }

    @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
    @NotNull
    public final String setX() {
        return ArraysKt___ArraysKt.joinToString$default(this.f59895p0, this.f59896q0, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f59897p0, 30, (Object) null);
    }

    public setIndicatorBounds(getDynamicButtonIconTextSpacingDp[] getdynamicbuttonicontextspacingdpArr, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        String strIntern;
        int i11;
        Object method;
        int i12 = 2;
        if ((i10 & 2) != 0) {
            int i13 = 0;
            int iMakeMeasureSpec = 127 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bytes = "\u0081".getBytes("ISO-8859-1");
            setZ setz = new setZ();
            float f6 = 0.0f;
            char[] cArr = f59889r0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i14 = 0;
                while (i14 < length) {
                    int i15 = f59893w0 + 61;
                    v0 = i15 % 128;
                    int i16 = i15 % i12;
                    try {
                        Object[] objArr = {Integer.valueOf(cArr[i14])};
                        Map map = setTextScaleX.setMaxEms;
                        Object method2 = map.get(1129500232);
                        if (method2 == null) {
                            Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 26288), 64 - View.resolveSize(0, 0), (PointF.length(f6, f6) > f6 ? 1 : (PointF.length(f6, f6) == f6 ? 0 : -1)) + 1595);
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            Object[] objArr2 = new Object[1];
                            a(b10, b11, b11, objArr2);
                            method2 = cls.getMethod((String) objArr2[0], Integer.TYPE);
                            map.put(1129500232, method2);
                        }
                        cArr2[i14] = ((Character) ((Method) method2).invoke(null, objArr)).charValue();
                        i14++;
                        i12 = 2;
                        f6 = 0.0f;
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
            Object[] objArr3 = {Integer.valueOf(f59890s0)};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1019674483);
            if (method3 == null) {
                Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10743), Process.getGidForName("") + 44, Color.alpha(0) + 566);
                byte b12 = (byte) 0;
                byte b13 = (byte) (b12 + 1);
                Object[] objArr4 = new Object[1];
                a(b12, b13, (byte) (b13 - 1), objArr4);
                method3 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                map2.put(1019674483, method3);
            }
            int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr3)).intValue();
            if (f59892u0) {
                int length2 = bytes.length;
                setz.setOnFocusChangeListener = length2;
                char[] cArr3 = new char[length2];
                setz.setDividerPadding = 0;
                while (true) {
                    int i17 = setz.setDividerPadding;
                    int i18 = setz.setOnFocusChangeListener;
                    if (i17 >= i18) {
                        break;
                    }
                    int i19 = v0 + 65;
                    f59893w0 = i19 % 128;
                    if (i19 % 2 == 0) {
                        cArr3[i17] = (char) (cArr[bytes[(i18 >>> 1) + i17] >> iMakeMeasureSpec] - iIntValue);
                        Object[] objArr5 = new Object[2];
                        objArr5[1] = setz;
                        objArr5[i13] = setz;
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method4 = map3.get(-1539766653);
                        if (method4 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.getOffsetBefore("", i13), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 50, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2879);
                            byte b14 = (byte) i13;
                            byte b15 = (byte) (b14 + 2);
                            Object[] objArr6 = new Object[1];
                            a(b14, b15, (byte) (b15 - 2), objArr6);
                            method4 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                            map3.put(-1539766653, method4);
                        }
                        ((Method) method4).invoke(null, objArr5);
                        i13 = 0;
                    } else {
                        cArr3[i17] = (char) (cArr[bytes[(i18 - 1) - i17] + iMakeMeasureSpec] - iIntValue);
                        Object[] objArr7 = {setz, setz};
                        Map map4 = setTextScaleX.setMaxEms;
                        Object obj = map4.get(-1539766653);
                        if (obj != null) {
                            i11 = 0;
                            method = obj;
                        } else {
                            Class cls4 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 51, 2880 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            byte b16 = (byte) 0;
                            byte b17 = (byte) (b16 + 2);
                            Object[] objArr8 = new Object[1];
                            a(b16, b17, (byte) (b17 - 2), objArr8);
                            i11 = 0;
                            method = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                            map4.put(-1539766653, method);
                        }
                        ((Method) method).invoke(null, objArr7);
                        i13 = i11;
                    }
                }
                String str2 = new String(cArr3);
                int i20 = v0 + 35;
                f59893w0 = i20 % 128;
                if (i20 % 2 != 0) {
                    strIntern = str2.intern();
                } else {
                    throw null;
                }
            } else {
                if (f59891t0) {
                    throw null;
                }
                throw null;
            }
        } else {
            strIntern = str;
        }
        this(getdynamicbuttonicontextspacingdpArr, strIntern);
    }
}
