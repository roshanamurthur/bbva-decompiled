package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class hy {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56291h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56292i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final gv f56293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f56294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ex f56295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final getValue f56296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final gz f56297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final io f56298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final et f56299g;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f56300t0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f56301u0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public hy f56302p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f56303q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f56305s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            Object obj2 = objArr[1];
            int i10 = f56301u0;
            int i11 = ((i10 | 33) << 1) - (i10 ^ 33);
            f56300t0 = i11 % 128;
            int i12 = i11 % 2;
            aVar.f56303q0 = obj2;
            int i13 = aVar.f56305s0;
            if (i12 != 0) {
                int i14 = (Integer.MAX_VALUE & i13) | ((~i13) & Integer.MIN_VALUE);
                int i15 = i13 & Integer.MIN_VALUE;
                aVar.f56305s0 = (i15 & i14) | (i14 ^ i15);
                hy hyVar = hy.this;
                hy.setX(new Object[]{hyVar, aVar}, 1769335038, -1769335037, System.identityHashCode(hyVar));
                throw null;
            }
            int i16 = i13 & Integer.MIN_VALUE;
            int i17 = (i13 | Integer.MIN_VALUE) & (~i16);
            aVar.f56305s0 = (i17 & i16) | (i17 ^ i16);
            hy hyVar2 = hy.this;
            Object x4 = hy.setX(new Object[]{hyVar2, aVar}, 1769335038, -1769335037, System.identityHashCode(hyVar2));
            int i18 = f56300t0;
            int i19 = (i18 ^ 5) + ((i18 & 5) << 1);
            f56301u0 = i19 % 128;
            if (i19 % 2 != 0) {
                return x4;
            }
            throw null;
        }
    }

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[setTextLocales.values().length];
            iArr[setTextLocales.setY.ordinal()] = 1;
            iArr[setTextLocales.setX.ordinal()] = 2;
            iArr[setTextLocales.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            setX = iArr;
            int i10 = (113 << 1) - 113;
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i12 = 17 / 0;
            }
        }
    }

    public hy(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue, @NotNull gz gzVar, @NotNull io ioVar, @NotNull et etVar) {
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(gzVar, "");
        Intrinsics.checkNotNullParameter(ioVar, "");
        Intrinsics.checkNotNullParameter(etVar, "");
        this.f56293a = gvVar;
        this.f56294b = settextkeepstate;
        this.f56295c = exVar;
        this.f56296d = getvalue;
        this.f56297e = gzVar;
        this.f56298f = ioVar;
        this.f56299g = etVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x02e7 A[PHI: r9
      0x02e7: PHI (r9v11 com.mypinpad.tsdk.i.hy$a) = (r9v10 com.mypinpad.tsdk.i.hy$a), (r9v13 com.mypinpad.tsdk.i.hy$a) binds: [B:40:0x02e5, B:37:0x02dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0396  */
    /* JADX WARN: Code duplicated, block: B:70:0x0498  */
    /* JADX WARN: Code duplicated, block: B:71:0x049a  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        a aVar;
        fk fkVar;
        int i13;
        int i14;
        int i15 = ~i10;
        int i16 = (((~(i11 | (~i12))) | (~(i15 | i11))) * Opcodes.ATHROW) + ((i10 | (~(i11 | i12))) * Opcodes.ATHROW) + (i15 * (-191)) + (i11 * 192) + (i10 * (-381));
        String str = null;
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    hy hyVar = (hy) objArr[0];
                    int i17 = f56291h + 53;
                    f56292i = i17 % 128;
                    int i18 = i17 % 2;
                    et etVar = hyVar.f56299g;
                    et.setDividerPadding(new Object[]{hyVar.f56293a}, 338249870, -338249868, (int) System.currentTimeMillis());
                    fk compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode(hyVar.f56295c, hyVar.f56293a, hyVar.f56294b, fd.END_APPLICATION, null, null, null, setDrawSelectorOnTop.setOnFocusChangeListener, null, false, 184);
                    int i19 = f56291h;
                    int i20 = i19 & 27;
                    int i21 = i20 + ((i19 ^ 27) | i20);
                    f56292i = i21 % 128;
                    if (i21 % 2 != 0) {
                        return compoundDrawableTintBlendMode;
                    }
                    throw null;
                }
                hy hyVar2 = (hy) objArr[0];
                int i22 = f56291h;
                int i23 = (-2) - ((((i22 | 116) << 1) - (i22 ^ 116)) ^ (-1));
                f56292i = i23 % 128;
                int i24 = i23 % 2;
                et etVar2 = hyVar2.f56299g;
                et.setDividerPadding(new Object[]{hyVar2.f56293a}, 338249870, -338249868, (int) System.currentTimeMillis());
                fk compoundDrawableTintBlendMode2 = ex.setCompoundDrawableTintBlendMode(hyVar2.f56295c, hyVar2.f56293a, hyVar2.f56294b, fd.END_APPLICATION, null, null, null, setDrawSelectorOnTop.setY, null, false, 184);
                int i25 = f56292i;
                int i26 = i25 ^ 27;
                int i27 = ((i25 & 27) | i26) << 1;
                int i28 = -i26;
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                f56291h = i29 % 128;
                if (i29 % 2 == 0) {
                    return compoundDrawableTintBlendMode2;
                }
                int i30 = 23 / 0;
                return compoundDrawableTintBlendMode2;
            }
            hy hyVar3 = (hy) objArr[0];
            com.mypinpad.tsdk.isolation.a aVar2 = (com.mypinpad.tsdk.isolation.a) objArr[1];
            Continuation continuation = (Continuation) objArr[2];
            int i31 = f56291h;
            int i32 = (i31 & 65) + (i31 | 65);
            f56292i = i32 % 128;
            int i33 = i32 % 2;
            gv gvVar = hyVar3.f56293a;
            gv.setOnFocusChangeListener(new Object[]{gvVar, (Integer) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -114513983, 114513983, System.identityHashCode(aVar2)), (Integer) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, 156913967, -156913963, System.identityHashCode(aVar2)), (setMaxWidth) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -917873151, 917873153, System.identityHashCode(aVar2))}, -1273972116, 1273972121, System.identityHashCode(gvVar));
            io ioVar = hyVar3.f56298f;
            ioVar.setX();
            gv gvVar2 = hyVar3.f56293a;
            setMaxWidth setmaxwidth = (setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -836208544, 836208569, System.identityHashCode(gvVar2));
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth}, -852037600, 852037625, System.identityHashCode(setmaxwidth));
            if (getbeeponfailure == null) {
                int i34 = f56292i;
                int i35 = (i34 ^ 49) + ((i34 & 49) << 1);
                int i36 = i35 % 128;
                f56291h = i36;
                int i37 = i35 % 2;
                int i38 = ((i36 | 81) << 1) - (i36 ^ 81);
                f56292i = i38 % 128;
                int i39 = i38 % 2;
            } else {
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (setscrollcontainer == null) {
                    int i40 = f56291h;
                    int i41 = i40 & 9;
                    int i42 = ((i40 ^ 9) | i41) << 1;
                    int i43 = -((i40 | 9) & (~i41));
                    int i44 = (i42 & i43) + (i43 | i42);
                    int i45 = i44 % 128;
                    f56292i = i45;
                    int i46 = i44 % 2;
                    int i47 = (i45 & 22) + (i45 | 22);
                    i14 = (i47 ^ (-1)) + (i47 << 1);
                } else {
                    str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                    int i48 = f56292i;
                    i14 = (-2) - ((((i48 | 38) << 1) - (i48 ^ 38)) ^ (-1));
                }
                f56291h = i14 % 128;
                int i49 = i14 % 2;
            }
            gv.setOnFocusChangeListener(new Object[]{gvVar2, str}, -64680794, 64680813, System.identityHashCode(gvVar2));
            String str2 = (String) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -1126898243, 1126898267, System.identityHashCode(gvVar2));
            getValue getvalue = hyVar3.f56296d;
            if (str2 != null) {
                getvalue.setOnFocusChangeListener(new setDrawingCacheQuality(setInputExtras.setOnFocusChangeListener(str2, 2)));
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, setSupportBackgroundTintMode.setY}, 346983986, -346983929, System.identityHashCode(gvVar2));
                int i50 = f56292i + 105;
                f56291h = i50 % 128;
                int i51 = i50 % 2;
            } else {
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(gvVar2));
                int i52 = f56292i;
                int i53 = i52 & 83;
                int i54 = (i53 - (~((i52 ^ 83) | i53))) - 1;
                f56291h = i54 % 128;
                int i55 = i54 % 2;
            }
            hw hwVar = new hw(hyVar3.f56295c, hyVar3.f56299g);
            Object onFocusChangeListener = hw.setOnFocusChangeListener(new Object[]{hwVar, gvVar2, hyVar3.f56294b, hyVar3.f56297e, getvalue, ioVar, continuation}, -2058538250, 2058538250, System.identityHashCode(hwVar));
            int i56 = f56292i;
            int i57 = (i56 & 108) + (i56 | 108);
            int i58 = (i57 ^ (-1)) + (i57 << 1);
            f56291h = i58 % 128;
            if (i58 % 2 == 0) {
                return onFocusChangeListener;
            }
            int i59 = 65 / 0;
            return onFocusChangeListener;
        }
        hy hyVar4 = (hy) objArr[0];
        Continuation continuation2 = (Continuation) objArr[1];
        int i60 = f56291h;
        int i61 = ((i60 ^ 117) | (i60 & 117)) << 1;
        int i62 = -(((~i60) & 117) | (i60 & (-118)));
        int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
        int i64 = i63 % 128;
        f56292i = i64;
        if (i63 % 2 == 0) {
            boolean z10 = continuation2 instanceof a;
            throw null;
        }
        if (!(continuation2 instanceof a)) {
            aVar = hyVar4.new a(continuation2);
            int i65 = f56292i;
            int i66 = ((i65 ^ 59) - (~((i65 & 59) << 1))) - 1;
            f56291h = i66 % 128;
            int i67 = i66 % 2;
        } else {
            int i68 = (i64 ^ 113) + ((i64 & 113) << 1);
            int i69 = i68 % 128;
            f56291h = i69;
            if (i68 % 2 != 0) {
                aVar = (a) continuation2;
                int i70 = 15 / 0;
                if ((aVar.f56305s0 & Integer.MIN_VALUE) != 0) {
                    int i71 = i69 ^ 113;
                    int i72 = ((i69 & 113) | i71) << 1;
                    int i73 = -i71;
                    int i74 = (i72 & i73) + (i73 | i72);
                    f56292i = i74 % 128;
                    int i75 = i74 % 2;
                    int i76 = aVar.f56305s0;
                    int iIdentityHashCode = System.identityHashCode(hyVar4);
                    int i77 = -(~(-(-(i76 * (-396)))));
                    int i78 = ((i77 << 1) - i77) - 1;
                    int i79 = ~iIdentityHashCode;
                    int i80 = i79 & (i79 | iIdentityHashCode);
                    int i81 = ~i80;
                    int i82 = (Integer.MAX_VALUE & i81) | (i80 & Integer.MIN_VALUE);
                    int i83 = Integer.MAX_VALUE & i80;
                    int i84 = (i82 ^ i83) | (i82 & i83);
                    int i85 = ~i84;
                    int i86 = i85 & (i84 | i85);
                    int i87 = Integer.MAX_VALUE ^ i76;
                    int i88 = Integer.MAX_VALUE & i76;
                    int i89 = (i87 ^ i88) | (i87 & i88);
                    int i90 = ~i89;
                    int i91 = i90 & (i89 | i90);
                    int i92 = i86 & i91;
                    int i93 = (i86 | i91) & (~i92);
                    int i94 = (i93 & i92) | (i93 ^ i92);
                    int i95 = ~i76;
                    int i96 = ~((i80 & i95) | (i81 & i76) | (i80 & i76));
                    int i97 = -(-(((i94 & i96) | (i94 ^ i96)) * (-397)));
                    int i98 = i78 & i97;
                    int i99 = -(-((i97 ^ i78) | i98));
                    int i100 = (i98 & i99) + (i99 | i98);
                    int i101 = (~i88) & (Integer.MAX_VALUE | i76);
                    int i102 = ~((i101 & i88) | (i101 ^ i88));
                    int i103 = -(-(i102 * (-397)));
                    int i104 = i100 & i103;
                    int i105 = (i103 ^ i100) | i104;
                    int i106 = ((i104 | i105) << 1) - (i105 ^ i104);
                    int i107 = (i102 & iIdentityHashCode) | (iIdentityHashCode ^ i102);
                    int i108 = i95 & (i95 | i76);
                    int i109 = i108 & Integer.MIN_VALUE;
                    int i110 = (i108 | Integer.MIN_VALUE) & (~i109);
                    int i111 = ~((i110 & i109) | (i110 ^ i109));
                    int i112 = ((i107 & i111) | ((~i111) & i107) | ((~i107) & i111)) * 397;
                    int i113 = i106 ^ i112;
                    aVar.f56305s0 = (((i112 & i106) | i113) << 1) - i113;
                    int i114 = f56291h;
                    int i115 = i114 ^ 105;
                    int i116 = (((i114 & 105) | i115) << 1) - i115;
                    f56292i = i116 % 128;
                    int i117 = i116 % 2;
                } else {
                    aVar = hyVar4.new a(continuation2);
                    int i610 = f56292i;
                    int i611 = ((i610 ^ 59) - (~((i610 & 59) << 1))) - 1;
                    f56291h = i611 % 128;
                    int i612 = i611 % 2;
                }
            } else {
                aVar = (a) continuation2;
                if ((aVar.f56305s0 & Integer.MIN_VALUE) != 0) {
                    int i710 = i69 ^ 113;
                    int i711 = ((i69 & 113) | i710) << 1;
                    int i712 = -i710;
                    int i713 = (i711 & i712) + (i712 | i711);
                    f56292i = i713 % 128;
                    int i714 = i713 % 2;
                    int i715 = aVar.f56305s0;
                    int iIdentityHashCode2 = System.identityHashCode(hyVar4);
                    int i716 = -(~(-(-(i715 * (-396)))));
                    int i717 = ((i716 << 1) - i716) - 1;
                    int i718 = ~iIdentityHashCode2;
                    int i810 = i718 & (i718 | iIdentityHashCode2);
                    int i811 = ~i810;
                    int i812 = (Integer.MAX_VALUE & i811) | (i810 & Integer.MIN_VALUE);
                    int i813 = Integer.MAX_VALUE & i810;
                    int i814 = (i812 ^ i813) | (i812 & i813);
                    int i815 = ~i814;
                    int i816 = i815 & (i814 | i815);
                    int i817 = Integer.MAX_VALUE ^ i715;
                    int i818 = Integer.MAX_VALUE & i715;
                    int i819 = (i817 ^ i818) | (i817 & i818);
                    int i910 = ~i819;
                    int i911 = i910 & (i819 | i910);
                    int i912 = i816 & i911;
                    int i913 = (i816 | i911) & (~i912);
                    int i914 = (i913 & i912) | (i913 ^ i912);
                    int i915 = ~i715;
                    int i916 = ~((i810 & i915) | (i811 & i715) | (i810 & i715));
                    int i917 = -(-(((i914 & i916) | (i914 ^ i916)) * (-397)));
                    int i918 = i717 & i917;
                    int i919 = -(-((i917 ^ i717) | i918));
                    int i1010 = (i918 & i919) + (i919 | i918);
                    int i1011 = (~i818) & (Integer.MAX_VALUE | i715);
                    int i1012 = ~((i1011 & i818) | (i1011 ^ i818));
                    int i1013 = -(-(i1012 * (-397)));
                    int i1014 = i1010 & i1013;
                    int i1015 = (i1013 ^ i1010) | i1014;
                    int i1016 = ((i1014 | i1015) << 1) - (i1015 ^ i1014);
                    int i1017 = (i1012 & iIdentityHashCode2) | (iIdentityHashCode2 ^ i1012);
                    int i1018 = i915 & (i915 | i715);
                    int i1019 = i1018 & Integer.MIN_VALUE;
                    int i118 = (i1018 | Integer.MIN_VALUE) & (~i1019);
                    int i119 = ~((i118 & i1019) | (i118 ^ i1019));
                    int i1110 = ((i1017 & i119) | ((~i119) & i1017) | ((~i1017) & i119)) * 397;
                    int i1111 = i1016 ^ i1110;
                    aVar.f56305s0 = (((i1110 & i1016) | i1111) << 1) - i1111;
                    int i1112 = f56291h;
                    int i1113 = i1112 ^ 105;
                    int i1114 = (((i1112 & 105) | i1113) << 1) - i1113;
                    f56292i = i1114 % 128;
                    int i1115 = i1114 % 2;
                } else {
                    aVar = hyVar4.new a(continuation2);
                    int i613 = f56292i;
                    int i614 = ((i613 ^ 59) - (~((i613 & 59) << 1))) - 1;
                    f56291h = i614 % 128;
                    int i615 = i614 % 2;
                }
            }
        }
        Object compoundDrawableTintBlendMode3 = aVar.f56303q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i120 = aVar.f56305s0;
        if (i120 == 0) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode3);
            setTextKeepState settextkeepstate = hyVar4.f56294b;
            aVar.f56302p0 = hyVar4;
            aVar.f56305s0 = 1;
            compoundDrawableTintBlendMode3 = setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate, aVar}, -1083100835, 1083100838, System.identityHashCode(settextkeepstate));
            if (compoundDrawableTintBlendMode3 == coroutine_suspended) {
                int i121 = f56292i;
                int i122 = i121 & 77;
                int i123 = ((i121 | 77) & (~i122)) + (i122 << 1);
                f56291h = i123 % 128;
                if (i123 % 2 != 0) {
                    throw null;
                }
            }
            return coroutine_suspended;
        }
        if (i120 == 1) {
            hyVar4 = aVar.f56302p0;
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode3);
            int i124 = f56291h;
            int i125 = ((i124 | 33) << 1) - (i124 ^ 33);
            f56292i = i125 % 128;
            int i126 = i125 % 2;
        } else {
            if (i120 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode3);
            int i127 = f56292i;
            int i128 = i127 & 61;
            int i129 = -(-((i127 ^ 61) | i128));
            int i130 = (i128 & i129) + (i129 | i128);
            f56291h = i130 % 128;
            int i131 = i130 % 2;
        }
        int i132 = f56292i;
        i13 = (((i132 | 68) << 1) - (i132 ^ 68)) - 1;
        f56291h = i13 % 128;
        if (i13 % 2 == 0) {
            return compoundDrawableTintBlendMode3;
        }
        throw null;
        com.mypinpad.tsdk.isolation.a aVar3 = (com.mypinpad.tsdk.isolation.a) compoundDrawableTintBlendMode3;
        int i133 = setCompoundDrawableTintBlendMode.setX[((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar3}, -298445589, 298445592, System.identityHashCode(aVar3))).ordinal()];
        if (i133 == 1) {
            fkVar = (fk) setX(new Object[]{hyVar4}, 1512576706, -1512576703, System.identityHashCode(hyVar4));
            int i134 = f56291h + 105;
            f56292i = i134 % 128;
            int i135 = i134 % 2;
        } else {
            if (i133 != 2) {
                if (i133 != 3) {
                    throw new fh(32, ((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar3}, -298445589, 298445592, System.identityHashCode(aVar3))).toString());
                }
                aVar.f56302p0 = null;
                aVar.f56305s0 = 2;
                compoundDrawableTintBlendMode3 = setX(new Object[]{hyVar4, aVar3, aVar}, 1091698055, -1091698053, System.identityHashCode(hyVar4));
                if (compoundDrawableTintBlendMode3 == coroutine_suspended) {
                    int i136 = f56291h;
                    int i137 = ((i136 | 23) << 1) - (i136 ^ 23);
                    f56292i = i137 % 128;
                    int i138 = i137 % 2;
                    int i139 = i136 & 5;
                    int i140 = i136 | 5;
                    int i141 = (i139 ^ i140) + ((i140 & i139) << 1);
                    f56292i = i141 % 128;
                    if (i141 % 2 == 0) {
                        int i142 = 47 / 0;
                    }
                    return coroutine_suspended;
                }
                int i1310 = f56292i;
                i13 = (((i1310 | 68) << 1) - (i1310 ^ 68)) - 1;
                f56291h = i13 % 128;
                if (i13 % 2 == 0) {
                    return compoundDrawableTintBlendMode3;
                }
                throw null;
            }
            fkVar = (fk) setX(new Object[]{hyVar4}, -1249727476, 1249727476, System.identityHashCode(hyVar4));
            int i143 = f56292i;
            int i144 = (i143 & 51) + (i143 | 51);
            f56291h = i144 % 128;
            int i145 = i144 % 2;
        }
        return fkVar;
    }

    @Nullable
    public final Object setOnFocusChangeListener(@NotNull Continuation<? super fk> continuation) {
        return setX(new Object[]{this, continuation}, 1769335038, -1769335037, System.identityHashCode(this));
    }
}
