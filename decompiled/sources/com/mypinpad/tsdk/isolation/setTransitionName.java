package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setTransitionName implements setIndeterminateTintMode {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60780e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60781f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setRecyclerListener f60782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public setGravity f60783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public onOptionsItemSelected f60784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final getBeepOnSuccess f60785d;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Integer, byte[]> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final long f60786p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60787q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60788r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f60789s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f60790t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final byte[] f60791u0 = null;

        static {
            c();
            f60789s0 = 0;
            f60790t0 = 1;
            f60787q0 = 0;
            f60788r0 = 1;
            f60786p0 = -1785861258172538211L;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Object obj) throws Throwable {
            Object[] objArr = new Object[1];
            a("腭촤᧨斥끃ﰅ䢼靅\ue32b\u2fdd箁와", View.MeasureSpec.getMode(0) + 19531, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("腭\uef6c嵸쭍㥣Ᵹᕬ荝\uf16b彥쵱㭘꤆ᝤ蔉\uf37c慸", Drawable.resolveOpacity(0, 0) + 28163, objArr2);
            super(1, obj, setRecyclerListener.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0186  */
        /* JADX WARN: Code duplicated, block: B:33:0x0187  */
        public static void a(String str, int i10, Object[] objArr) throws Throwable {
            byte[] bArr;
            Throwable cause;
            int i11 = f60789s0 + 121;
            f60790t0 = i11 % 128;
            int i12 = 2;
            int i13 = i11 % 2;
            char[] charArray = str.toCharArray();
            setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
            setlayoutanimation.setOnFocusChangeListener = i10;
            int length = charArray.length;
            long[] jArr = new long[length];
            setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
            while (true) {
                int i14 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                int length2 = charArray.length;
                bArr = f60791u0;
                if (i14 >= length2) {
                    break;
                }
                int i15 = f60790t0 + 89;
                f60789s0 = i15 % 128;
                int i16 = i15 % i12;
                char c10 = charArray[i14];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[i12] = setlayoutanimation;
                    objArr2[1] = setlayoutanimation;
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 33, 1195 - KeyEvent.getDeadChar(0, 0));
                        byte b10 = bArr[i12];
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b11, b10, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f60786p0 ^ 1779209353347916695L);
                    Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) View.getDefaultSize(0, 0), 44 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 728);
                        byte b12 = bArr[2];
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b((byte) (b13 + 1), b12, b13, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                        map.put(645183118, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    i12 = 2;
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
            while (true) {
                int i17 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                if (i17 >= charArray.length) {
                    String str2 = new String(cArr);
                    int i18 = f60789s0 + 107;
                    f60790t0 = i18 % 128;
                    int i19 = i18 % 2;
                    objArr[0] = str2;
                    return;
                }
                cArr[i17] = (char) jArr[i17];
                Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionGroup(0L) + 44, TextUtils.getTrimmedLength("") + 728);
                    byte b14 = bArr[2];
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b((byte) (b15 + 1), b14, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(int r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 2
                int r9 = r9 + 4
                int r7 = r7 * 3
                int r7 = 110 - r7
                int r8 = r8 * 3
                int r8 = r8 + 1
                byte[] r0 = new byte[r8]
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.i.setTransitionName.a.f60791u0
                if (r2 != 0) goto L1a
                r5 = r1
                r3 = r2
                r2 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                goto L33
            L1a:
                r3 = r1
            L1b:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r0[r3] = r4
                if (r5 != r8) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r1)
                r10[r1] = r7
                return
            L2a:
                r3 = r2[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r2
                r2 = r0
                r0 = r10
                r10 = r6
            L33:
                int r7 = r7 + r8
                int r8 = r10 + 1
                r10 = r0
                r0 = r2
                r2 = r3
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setTransitionName.a.b(int, short, short, java.lang.Object[]):void");
        }

        public static void c() {
            f60791u0 = new byte[]{92, -47, 0, -97};
        }

        @NotNull
        public final byte[] d(int i10) {
            int i11 = f60788r0 + 13;
            f60787q0 = i11 % 128;
            int i12 = i11 % 2;
            byte[] x4 = ((setRecyclerListener) this.receiver).setX(i10);
            int i13 = f60788r0 + 69;
            f60787q0 = i13 % 128;
            int i14 = i13 % 2;
            return x4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ byte[] invoke(Integer num) {
            int i10 = f60787q0 + 87;
            f60788r0 = i10 % 128;
            int i11 = i10 % 2;
            int iIntValue = num.intValue();
            if (i11 != 0) {
                return d(iIntValue);
            }
            d(iIntValue);
            throw null;
        }
    }

    public setTransitionName(@NotNull setRecyclerListener setrecyclerlistener) {
        Intrinsics.checkNotNullParameter(setrecyclerlistener, "");
        this.f60782a = setrecyclerlistener;
        this.f60785d = new getBeepOnSuccess(new a(setrecyclerlistener));
    }

    public static /* synthetic */ Object a(Object[] objArr) {
        setFadingEdgeLength setfadingedgelength;
        setTransitionName settransitionname = (setTransitionName) objArr[0];
        Context context = (Context) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        Canvas canvas = (Canvas) objArr[4];
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(canvas, "");
        setSupportImageTintList setsupportimagetintlist = new setSupportImageTintList(5, 6);
        setGravity setgravity = settransitionname.f60783b;
        if (setgravity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            setgravity = null;
        }
        int includeFontPadding = setgravity.setIncludeFontPadding();
        setGravity setgravity2 = settransitionname.f60783b;
        if (setgravity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            setgravity2 = null;
        }
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = new setHorizontalFadingEdgeEnabled(setsupportimagetintlist, iIntValue, iIntValue2, includeFontPadding, setgravity2.setZ());
        setGravity setgravity3 = settransitionname.f60783b;
        if (setgravity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            setgravity3 = null;
        }
        setGravity setgravity4 = settransitionname.f60783b;
        if (setgravity4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            setgravity4 = null;
        }
        if (setgravity4.setZ() == 0.0f) {
            setfadingedgelength = null;
        } else {
            mv mvVar = new mv(0, 0);
            mv mvVar2 = new mv(4, 0);
            mv mvVar3 = new mv(0, 6);
            mv mvVar4 = new mv(2, 6);
            setGravity setgravity5 = settransitionname.f60783b;
            if (setgravity5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                setgravity5 = null;
            }
            setfadingedgelength = new setFadingEdgeLength(mvVar, mvVar2, mvVar3, mvVar4, setgravity5.setZ());
        }
        setBottomEdgeEffectColor setbottomedgeeffectcolor = new setBottomEdgeEffectColor(context, setgravity3, canvas, sethorizontalfadingedgeenabled, setfadingedgelength);
        setbottomedgeeffectcolor.setY();
        mv mvVar5 = (mv) setDividerPadding(new Object[]{settransitionname}, -1215501187, 1215501188, System.identityHashCode(settransitionname));
        onOptionsItemSelected onoptionsitemselected = settransitionname.f60784c;
        if (onoptionsitemselected == null) {
            Intrinsics.throwUninitializedPropertyAccessException(r4);
            onoptionsitemselected = null;
        }
        try {
            char c10 = onoptionsitemselected.setX()[0];
            int iIntValue3 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 509932451, -509932450, System.identityHashCode(mvVar5))).intValue();
            Object[] objArr2 = {mvVar5};
            char c11 = onoptionsitemselected.setX()[1];
            int iIntValue4 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 509932451, -509932450, System.identityHashCode(mvVar5))).intValue();
            int i10 = -(~(iIntValue4 * (-675)));
            int i11 = iIntValue & 1;
            int i12 = (~i11) & (iIntValue | 1);
            int i13 = ~iIntValue;
            int i14 = ((((-1) << 1) - ((((677 | i10) << 1) - (i10 ^ 677)) ^ (-1))) - (~(((i11 | i12) | (~iIntValue4)) * (-676)))) - 1;
            int i15 = ~iIntValue4;
            int i16 = ~iIntValue4;
            int i17 = i15 & (i16 | iIntValue4);
            int i18 = i17 ^ 1;
            int i19 = i17 & 1;
            int i20 = ~((i18 ^ i19) | (i18 & i19));
            int i21 = ~iIntValue;
            int i22 = i13 | iIntValue;
            int i23 = i21 & i22;
            int i24 = ~i23;
            int i25 = (i23 & (-2)) | (i24 & 1);
            int i26 = i23 & 1;
            int i27 = ((~((i25 ^ i26) | (i25 & i26))) | i20) * 676;
            int i28 = ((~i14) & i27) | ((~i27) & i14);
            int i29 = (i27 & i14) << 1;
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            int i31 = (-2) ^ i16;
            int i32 = (-2) & i16;
            int i33 = (i31 ^ i32) | (i31 & i32);
            int i34 = ((~i33) | i33) & (~i33);
            int i35 = (~iIntValue) & i22;
            int i36 = i16 & i35;
            int i37 = (~i36) & (i16 | i35);
            int i38 = ~((i37 & i36) | (i37 ^ i36));
            int i39 = (i34 & i38) | (i34 ^ i38);
            int i40 = iIntValue4 | 1;
            int i41 = (i40 & i13) | ((~i40) & iIntValue);
            int i42 = i40 & iIntValue;
            int i43 = ~((i42 & i41) | (i41 ^ i42));
            int i44 = i39 & i43;
            int i45 = (i39 | i43) & (~i44);
            int i46 = ((i45 & i44) | (i45 ^ i44)) * 676;
            int i47 = ((i30 | i46) << 1) - (i46 ^ i30);
            Object[] objArr3 = {mvVar5};
            char c12 = onoptionsitemselected.setX()[2];
            int iIntValue5 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 509932451, -509932450, System.identityHashCode(mvVar5))).intValue();
            int i48 = -(~(-(-(iIntValue5 * (-69)))));
            int i49 = (((142 | i48) << 1) - (i48 ^ 142)) - 1;
            int i50 = (-3) & iIntValue5;
            int i51 = (~i50) & ((-3) | iIntValue5);
            int i52 = ~iIntValue5;
            int i53 = i50 | i51;
            int i54 = ((~i53) | i53) & (~i53);
            int i55 = iIntValue5 & iIntValue;
            int i56 = ~(i55 | ((~i55) & (iIntValue5 | iIntValue)));
            int i57 = i54 & i56;
            int i58 = (~i57) & (i54 | i56);
            int i59 = ((i58 & i57) | (i58 ^ i57)) * (-140);
            int i60 = ((((~i59) & i49) | ((~i49) & i59)) - (~((i59 & i49) << 1))) - 1;
            int i61 = iIntValue5 & 2;
            int i62 = (~i61) & (iIntValue5 | 2);
            int i63 = (i61 & i62) | (i62 ^ i61);
            int i64 = i63 & iIntValue;
            int i65 = (i63 | iIntValue) & (~i64);
            int i66 = -(~(-(-((~((i65 & i64) | (i65 ^ i64))) * 70))));
            int i67 = (i60 ^ i66) + ((i66 & i60) << 1);
            int i68 = (i67 ^ (-1)) + (i67 << 1);
            int i69 = (-3) & iIntValue5;
            int i70 = (~i69) & ((-3) | iIntValue5);
            int i71 = (i70 & i69) | (i70 ^ i69);
            int i72 = (i71 | (~i71)) & (~i71);
            int i73 = (iIntValue5 | i52) & (~iIntValue5);
            int i74 = (i73 & (-3)) | ((~i73) & 2);
            int i75 = i73 & 2;
            int i76 = ~((i75 & i74) | (i74 ^ i75));
            int i77 = i72 & i76;
            int i78 = ((i76 | i72) & (~i77)) | i77;
            int i79 = (i13 & 2) | (iIntValue & (-3));
            int i80 = iIntValue & 2;
            int i81 = i79 | i80;
            int i82 = (i81 | (~i81)) & (~i81);
            int i83 = i78 & i82;
            int i84 = (i78 | i82) & (~i83);
            int i85 = ((i84 & i83) | (i84 ^ i83)) * 70;
            int i86 = i68 | i85;
            int i87 = ((i86 << 1) - (~(-((~(i85 & i68)) & i86)))) - 1;
            Object[] objArr4 = {mvVar5};
            char c13 = onoptionsitemselected.setX()[3];
            int iIntValue6 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 509932451, -509932450, System.identityHashCode(mvVar5))).intValue();
            int iIntValue7 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 94375366, -94375366, System.identityHashCode(mvVar5))).intValue();
            int i88 = 1648 - (~(iIntValue7 * 825));
            int i89 = ~iIntValue7;
            int i90 = i89 & 1;
            int i91 = (~i90) & (i89 | 1);
            int i92 = ((i91 & i90) | (i91 ^ i90)) * (-824);
            int i93 = i88 & i92;
            int i94 = (i92 | i88) & (~i93);
            int i95 = i93 << 1;
            int i96 = (i94 ^ i95) + ((i94 & i95) << 1);
            int i97 = ~iIntValue7;
            int i98 = (i97 & 1) | (iIntValue7 & (-2));
            int i99 = iIntValue7 & 1;
            int i100 = -(~(((i99 & i98) | (i98 ^ i99)) * (-1648)));
            int i101 = ((-1) << 1) - (((i96 ^ i100) + ((i100 & i96) << 1)) ^ (-1));
            int i102 = ((~i97) & (-2)) | (i97 & 1);
            int i103 = i97 & (-2);
            int i104 = i102 ^ i103;
            char c14 = onoptionsitemselected.setX()[4];
            int iIntValue8 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 509932451, -509932450, System.identityHashCode(mvVar5))).intValue();
            int i105 = -(-(iIntValue8 * 111));
            int i106 = ((-109) & i105) + (i105 | (-109));
            int i107 = iIntValue8 & iIntValue;
            int i108 = (iIntValue8 ^ iIntValue) | i107;
            int i109 = (i108 | (~i108)) & (~i108);
            int i110 = ((~i109) & (-2)) | (i109 & 1);
            int i111 = i109 & (-2);
            int i112 = -(-(((i111 & i110) | (i110 ^ i111)) * (-220)));
            int i113 = i106 & i112;
            int i114 = (i113 - (~(-(-((i112 ^ i106) | i113))))) - 1;
            int i115 = ~iIntValue8;
            int i116 = (i115 & 1) | (iIntValue8 & (-2));
            int i117 = iIntValue8 & 1;
            int i118 = ~((i116 ^ i117) | (i116 & i117));
            int i119 = (iIntValue8 & i13) | (iIntValue & i115);
            int i120 = ~((i119 ^ i107) | (i107 & i119));
            int i121 = i118 & i120;
            int i122 = (i120 | i118) & (~i121);
            int i123 = (i114 - (~(-(~(-(-(((i122 & i121) | (i122 ^ i121)) * 220))))))) - 2;
            int i124 = ((-2) ^ iIntValue8) | ((-2) & iIntValue8);
            int i125 = (i124 | (~i124)) & (~i124);
            int i126 = (iIntValue8 | i115) & (~iIntValue8);
            int i127 = (i126 & (-2)) | ((~i126) & 1);
            int i128 = i126 & 1;
            int i129 = (i128 & i127) | (i127 ^ i128);
            int i130 = (i129 | (~i129)) & (~i129);
            int i131 = ((~i130) & i125) | ((~i125) & i130);
            int i132 = i130 & i125;
            int i133 = ((i132 & i131) | (i131 ^ i132)) * 110;
            int i134 = i123 & i133;
            int i135 = -(-((i133 ^ i123) | i134));
            int i136 = (i134 & i135) + (i135 | i134);
            int iIntValue9 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 94375366, -94375366, System.identityHashCode(mvVar5))).intValue();
            int i137 = -(-(iIntValue9 * (-183)));
            int i138 = (-183) & i137;
            int i139 = -(-((i137 ^ (-183)) | i138));
            int i140 = (i138 & i139) + (i139 | i138);
            int i141 = ((-2) ^ i21) | ((-2) & i21);
            int i142 = ~iIntValue9;
            int i143 = (i141 & i142) | ((~i141) & iIntValue9);
            int i144 = i141 & iIntValue9;
            int i145 = ~((i144 & i143) | (i143 ^ i144));
            int i146 = ~iIntValue9;
            int i147 = i21 & i22;
            int i148 = (i146 ^ i147) | (i146 & i147);
            int i149 = (i148 ^ 1) | (i148 & 1);
            int i150 = ((~i149) | i149) & (~i149);
            int i151 = ((~i150) & i145) | ((~i145) & i150);
            int i152 = i150 & i145;
            int i153 = ((i152 & i151) | (i151 ^ i152)) * (-184);
            int i154 = i140 & i153;
            int i155 = i153 | i140;
            int i156 = (i154 & i155) + (i155 | i154);
            int i157 = (i142 | iIntValue9) & i146;
            int i158 = (-2) & i157;
            int i159 = (i157 | (-2)) & (~i158);
            int i160 = ~((i159 & i158) | (i159 ^ i158));
            int i161 = (-2) & i23;
            int i162 = ((-2) | i23) & (~i161);
            int i163 = ~((i162 & i161) | (i162 ^ i161));
            int i164 = (i160 & i163) | (i160 ^ i163);
            int i165 = (i142 & i24) | (i23 & (~i142));
            int i166 = i142 & i23;
            int i167 = i165 ^ i166;
            char c15 = onoptionsitemselected.setX()[5];
            int iIntValue10 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 509932451, -509932450, System.identityHashCode(mvVar5))).intValue();
            int i168 = -(-(iIntValue10 * 713));
            int i169 = (((-1422) ^ i168) | ((-1422) & i168)) << 1;
            int i170 = -((i168 & 1421) | ((-1422) & (~i168)));
            int i171 = (i169 & i170) + (i170 | i169);
            int i172 = ~iIntValue10;
            int i173 = ~((i172 ^ 2) | (i172 & 2));
            int i174 = (i147 & (-3)) | ((~i147) & 2);
            int i175 = i147 & 2;
            int i176 = ~((i175 & i174) | (i174 ^ i175));
            int i177 = ((~i176) & i173) | ((~i173) & i176);
            int i178 = i176 & i173;
            int i179 = -(-(((i178 & i177) | (i177 ^ i178)) * (-712)));
            int i180 = (((i171 | i179) << 1) - (~(-(i179 ^ i171)))) - 1;
            int i181 = (~iIntValue10) | iIntValue10;
            int i182 = i172 & i181;
            int i183 = ((~i13) & i182) | ((~i182) & i13);
            int i184 = i182 & i13;
            int i185 = (i184 & i183) | (i183 ^ i184);
            int i186 = i185 & 2;
            int i187 = (i185 | 2) & (~i186);
            int i188 = ~((i187 & i186) | (i187 ^ i186));
            int i189 = iIntValue10 & 2;
            int i190 = (iIntValue10 | 2) & (~i189);
            int i191 = (i190 & i189) | (i190 ^ i189);
            int i192 = ~((i191 & iIntValue) | (i191 ^ iIntValue));
            int i193 = (i180 - (~(((i192 & i188) | (((~i192) & i188) | ((~i188) & i192))) * (-712)))) - 1;
            int i194 = i181 & i172;
            int i195 = i35 & 2;
            int i196 = ~(i195 | ((~i195) & (i35 | 2)));
            int i197 = i194 ^ i196;
            int i198 = i194 & i196;
            int i199 = ((i198 & i197) | (i197 ^ i198)) * 712;
            int i200 = ((i193 ^ i199) | (i193 & i199)) << 1;
            int i201 = -((i199 & (~i193)) | ((~i199) & i193));
            int i202 = ((i200 | i201) << 1) - (i201 ^ i200);
            int iIntValue11 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 94375366, -94375366, System.identityHashCode(mvVar5))).intValue();
            int i203 = iIntValue11 & 1;
            int i204 = (iIntValue11 ^ 1) | i203;
            char c16 = onoptionsitemselected.setX()[6];
            int iIntValue12 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 509932451, -509932450, System.identityHashCode(mvVar5))).intValue();
            int iIntValue13 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 94375366, -94375366, System.identityHashCode(mvVar5))).intValue();
            int i205 = iIntValue13 & 2;
            int i206 = (iIntValue13 ^ 2) | i205;
            char c17 = onoptionsitemselected.setX()[7];
            int iIntValue14 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 509932451, -509932450, System.identityHashCode(mvVar5))).intValue();
            int i207 = ((iIntValue14 & 2) + (iIntValue14 | 2)) - 1;
            int iIntValue15 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 94375366, -94375366, System.identityHashCode(mvVar5))).intValue();
            int i208 = -(~(iIntValue15 * (-858)));
            int i209 = ((-1) << 1) - (((1720 & i208) + (i208 | 1720)) ^ (-1));
            int i210 = ((i79 ^ i80) | (i79 & i80)) * (-859);
            int i211 = (i209 ^ i210) + ((i209 & i210) << 1);
            int i212 = (i23 ^ 2) | (i23 & 2);
            int i213 = (i212 | (~i212)) & (~i212);
            int i214 = ~iIntValue15;
            int i215 = (-3) ^ i214;
            int i216 = (-3) & i214;
            int i217 = (i215 ^ i216) | (i215 & i216) | iIntValue;
            int i218 = (i217 | (~i217)) & (~i217);
            int i219 = ((~i218) & i213) | ((~i213) & i218);
            int i220 = i213 & i218;
            int i221 = -(~(-(-(((i220 & i219) | (i219 ^ i220)) * 859))));
            int i222 = ((-1) << 1) - ((((i211 | i221) << 1) - (i221 ^ i211)) ^ (-1));
            int i223 = i214 ^ i13;
            int i224 = i214 & i13;
            int i225 = ~((i223 & i224) | (i223 ^ i224));
            int i226 = ((iIntValue15 | i214) & (~iIntValue15)) | 2;
            int i227 = (i226 | (~i226)) & (~i226);
            int i228 = -(~(((i227 & i225) | (i225 ^ i227)) * 859));
            int i229 = (i222 & i228) + (i228 | i222);
            char c18 = onoptionsitemselected.setX()[8];
            int iIntValue16 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 509932451, -509932450, System.identityHashCode(mvVar5))).intValue();
            int i230 = iIntValue16 * 881;
            int i231 = 1762 & i230;
            int i232 = (((i230 | 1762) & (~i231)) - (~(-(-(i231 << 1))))) - 1;
            int i233 = (~iIntValue16) & ((~iIntValue16) | iIntValue16);
            int i234 = (-3) ^ i233;
            int i235 = (-3) & i233;
            int i236 = (i234 & i235) | (i234 ^ i235);
            int i237 = (i236 | (~i236)) & (~i236);
            int i238 = ~(((-3) ^ iIntValue) | ((-3) & iIntValue));
            int i239 = i237 & i238;
            int i240 = (i238 | i237) & (~i239);
            int i241 = (i240 & i239) | (i240 ^ i239);
            int i242 = ~((i233 & iIntValue) | (i233 ^ iIntValue));
            int i243 = i241 ^ i242;
            int i244 = i242 & i241;
            int i245 = ((i244 & i243) | (i243 ^ i244)) * (-880);
            int i246 = (i232 ^ i245) + ((i232 & i245) << 1);
            int i247 = ((-3) & i13) | ((-3) ^ i13);
            int i248 = (i247 | (~i247)) & (~i247);
            int i249 = iIntValue16 ^ i248;
            int i250 = iIntValue16 & i248;
            int i251 = (i250 & i249) | (i249 ^ i250);
            int i252 = iIntValue ^ 2;
            int i253 = ~(i252 | i80);
            int i254 = ((~i253) & i251) | ((~i251) & i253);
            int i255 = i251 & i253;
            int i256 = -(-(((i255 & i254) | (i254 ^ i255)) * (-880)));
            int i257 = (((i246 ^ i256) | (i246 & i256)) << 1) - ((i256 & (~i246)) | ((~i256) & i246));
            int i258 = (i252 ^ i80) | (i252 & i80);
            int i259 = -(-(((i258 | (~i258)) & (~i258)) * 880));
            int i260 = (((i257 | i259) << 1) - (~(-((i259 & (~i257)) | ((~i259) & i257))))) - 1;
            int iIntValue17 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 94375366, -94375366, System.identityHashCode(mvVar5))).intValue();
            char c19 = onoptionsitemselected.setX()[9];
            int iIntValue18 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 509932451, -509932450, System.identityHashCode(mvVar5))).intValue();
            int i261 = ((iIntValue18 | 1) << 1) - (iIntValue18 ^ 1);
            int iIntValue19 = ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 94375366, -94375366, System.identityHashCode(mvVar5))).intValue();
            int i262 = (iIntValue19 & (-4)) | ((~iIntValue19) & 3);
            int i263 = -(-((iIntValue19 & 3) << 1));
            getMetadata[] getmetadataArr = {new setImeOptions(c10, new mv(iIntValue3, ((Integer) mv.setDividerPadding(objArr2, 94375366, -94375366, System.identityHashCode(mvVar5))).intValue())), new setImeOptions(c11, new mv(i47, ((Integer) mv.setDividerPadding(objArr3, 94375366, -94375366, System.identityHashCode(mvVar5))).intValue())), new setImeOptions(c12, new mv(i87, ((Integer) mv.setDividerPadding(objArr4, 94375366, -94375366, System.identityHashCode(mvVar5))).intValue())), new setImeOptions(c13, new mv(iIntValue6, (i101 - (~(((i103 & i102) | i104) * 824))) - 1)), new setImeOptions(c14, new mv(i136, (((i156 - (~(-(-((i164 | (~((i165 & i166) | i167))) * 184))))) - 1) - (~(-(~((iIntValue9 | 1) * 184))))) - 2)), new setImeOptions(c15, new mv(i202, (i203 & i204) + (i204 | i203))), new setImeOptions(c16, new mv(iIntValue12, ((i205 | i206) << 1) - (i206 ^ i205))), new setImeOptions(c17, new mv(i207, (i229 ^ (-1)) + (i229 << 1))), new setImeOptions(c18, new mv(i260, ((iIntValue17 & (-3)) | ((~iIntValue17) & 2)) + ((iIntValue17 & 2) << 1))), new setImeOptions(c19, new mv(i261, ((i262 | i263) << 1) - (i263 ^ i262))), new setTextMetricsParams(new mv(1, 6), true), new setImageDrawable(new mv(2, 6)), new setNestedScrollingEnabled(new mv(0, 6))};
            CloseableKt.closeFinally(onoptionsitemselected, null);
            ArrayList arrayList = new ArrayList(13);
            for (int i264 = 0; i264 < 13; i264++) {
                getMetadata getmetadata = getmetadataArr[i264];
                arrayList.add((mv) getMetadata.setDividerPadding(new Object[]{getmetadata}, -815815505, 815815505, System.identityHashCode(getmetadata)));
            }
            setGravity setgravity6 = settransitionname.f60783b;
            if (setgravity6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                setgravity6 = null;
            }
            setbottomedgeeffectcolor.setDividerPadding(arrayList, setgravity6.setZ());
            setbottomedgeeffectcolor.setCompoundDrawableTintBlendMode();
            return setbottomedgeeffectcolor.setCompoundDrawableTintBlendMode(getmetadataArr);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(onoptionsitemselected, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = (((~(i10 | i11)) | (~(i15 | i11)) | (~(i13 | i14))) * 494) + ((i11 | i14 | i15) * 494) + ((i10 | i13) * (-988)) + (i11 * (-493)) + (i10 * 495);
        if (i16 == 1) {
            setTransitionName settransitionname = (setTransitionName) objArr[0];
            int i17 = f60780e;
            int i18 = i17 & 41;
            int i19 = (i17 ^ 41) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            f60781f = i20 % 128;
            int i21 = i20 % 2;
            getBeepOnSuccess getbeeponsuccess = settransitionname.f60785d;
            mv mvVar = (mv) setDividerPadding(new Object[]{Byte.valueOf(((Byte) getBeepOnSuccess.setCompoundDrawableTintBlendMode(new Object[]{getbeeponsuccess, (byte) 8}, 408057020, -408057019, System.identityHashCode(getbeeponsuccess))).byteValue())}, -1146965247, 1146965249, (int) System.currentTimeMillis());
            int i22 = f60780e;
            int i23 = (((i22 | 48) << 1) - (i22 ^ 48)) - 1;
            f60781f = i23 % 128;
            if (i23 % 2 != 0) {
                return mvVar;
            }
            throw null;
        }
        if (i16 == 2) {
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            int i24 = f60781f;
            int i25 = (i24 & 45) + (i24 | 45);
            f60780e = i25 % 128;
            int i26 = i25 % 2;
            if (bByteValue > 8) {
                throw new IllegalArgumentException();
            }
            mv mvVar2 = new mv(bByteValue % 3, bByteValue / 3);
            int i27 = f60781f;
            int i28 = (i27 ^ 93) + ((i27 & 93) << 1);
            f60780e = i28 % 128;
            int i29 = i28 % 2;
            return mvVar2;
        }
        if (i16 != 3) {
            return a(objArr);
        }
        setTransitionName settransitionname2 = (setTransitionName) objArr[0];
        setGravity setgravity = (setGravity) objArr[1];
        onOptionsItemSelected onoptionsitemselected = (onOptionsItemSelected) objArr[2];
        int i30 = f60781f;
        int i31 = ((i30 | 89) << 1) - (i30 ^ 89);
        f60780e = i31 % 128;
        if (i31 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setgravity, "");
            Intrinsics.checkNotNullParameter(onoptionsitemselected, "");
            settransitionname2.f60784c = onoptionsitemselected;
            settransitionname2.f60783b = setgravity;
            return null;
        }
        Intrinsics.checkNotNullParameter(setgravity, "");
        Intrinsics.checkNotNullParameter(onoptionsitemselected, "");
        settransitionname2.f60784c = onoptionsitemselected;
        settransitionname2.f60783b = setgravity;
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.setIndeterminateTintMode
    @NotNull
    public final setCollapseIcon[] y_(@NotNull Context context, int i10, int i11, @NotNull Canvas canvas) {
        return (setCollapseIcon[]) setDividerPadding(new Object[]{this, context, Integer.valueOf(i10), Integer.valueOf(i11), canvas}, -901572035, 901572035, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.setIndeterminateTintMode
    public final void setDividerPadding(@NotNull setGravity setgravity, @NotNull onOptionsItemSelected onoptionsitemselected) {
        setDividerPadding(new Object[]{this, setgravity, onoptionsitemselected}, -1477114717, 1477114720, System.identityHashCode(this));
    }
}
