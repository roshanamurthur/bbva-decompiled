package com.mypinpad.tsdk.isolation;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class hl {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f56198f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f56199g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final gv f56200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f56201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ex f56202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final getValue f56203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final et f56204e;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f56205t0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f56206u0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public hl f56207p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f56208q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f56210s0;

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
            int i10 = f56206u0;
            int i11 = ((i10 & 70) + (i10 | 70)) - 1;
            f56205t0 = i11 % 128;
            int i12 = i11 % 2;
            aVar.f56208q0 = obj2;
            int i13 = aVar.f56210s0;
            int i14 = (Integer.MAX_VALUE & i13) | ((~i13) & Integer.MIN_VALUE);
            int i15 = i13 & Integer.MIN_VALUE;
            aVar.f56210s0 = (i15 & i14) | (i14 ^ i15);
            hl hlVar = hl.this;
            Object compoundDrawableTintBlendMode = hl.setCompoundDrawableTintBlendMode(new Object[]{hlVar, aVar}, -1704422784, 1704422786, System.identityHashCode(hlVar));
            int i16 = f56205t0 + 55;
            f56206u0 = i16 % 128;
            int i17 = i16 % 2;
            return compoundDrawableTintBlendMode;
        }
    }

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setOnFocusChangeListener;
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[setTextLocales.values().length];
            iArr[setTextLocales.setY.ordinal()] = 1;
            iArr[setTextLocales.setCompoundDrawableTintBlendMode.ordinal()] = 2;
            setOnFocusChangeListener = iArr;
            int[] iArr2 = new int[setRotationY.values().length];
            iArr2[setRotationY.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            iArr2[setRotationY.setDividerPadding.ordinal()] = 2;
            setY = iArr2;
            int i10 = ((-1) << 1) - (((1 & 84) + (1 | 84)) ^ (-1));
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    public hl(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue, @NotNull et etVar) {
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(etVar, "");
        this.f56200a = gvVar;
        this.f56201b = settextkeepstate;
        this.f56202c = exVar;
        this.f56203d = getvalue;
        this.f56204e = etVar;
    }

    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x021e  */
    /* JADX WARN: Code duplicated, block: B:55:0x02f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x032d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0333  */
    /* JADX WARN: Code duplicated, block: B:67:0x0394  */
    /* JADX WARN: Code duplicated, block: B:70:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x03a3 A[PHI: r0 r1
      0x03a3: PHI (r0v45 com.mypinpad.tsdk.i.hl) = (r0v31 com.mypinpad.tsdk.i.hl), (r0v31 com.mypinpad.tsdk.i.hl), (r0v72 com.mypinpad.tsdk.i.hl) binds: [B:66:0x0392, B:63:0x037d, B:42:0x026f] A[DONT_GENERATE, DONT_INLINE]
      0x03a3: PHI (r1v86 java.lang.Object) = (r1v72 java.lang.Object), (r1v75 java.lang.Object), (r1v62 java.lang.Object) binds: [B:66:0x0392, B:63:0x037d, B:42:0x026f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x03c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x040a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0424  */
    /* JADX WARN: Code duplicated, block: B:86:0x044b  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Exception {
        a aVar;
        int i13;
        int i14;
        com.mypinpad.tsdk.isolation.a aVar2;
        int i15;
        fk fkVar;
        int i16;
        setRotationX setrotationx;
        int i17;
        ex exVar;
        gv gvVar;
        setTextKeepState settextkeepstate;
        fd fdVar;
        getY gety;
        setItemChecked setitemchecked;
        setContentCaptureSession setcontentcapturesession;
        setDrawSelectorOnTop setdrawselectorontop;
        Byte b10;
        boolean z10;
        int i18;
        int i19 = (~i10) | i11;
        int i20 = ~i19;
        int i21 = ~i12;
        int i22 = (((~(i10 | i21)) | (~((~i11) | i10)) | (~(i19 | i12))) * 140) + ((i20 | (~(i21 | i11))) * (-280)) + ((i11 | i12) * 140) + (i11 * (-279)) + (i10 * 141);
        if (i22 == 1) {
            hl hlVar = (hl) objArr[0];
            setRotationX setrotationx2 = (setRotationX) objArr[1];
            int i23 = f56198f;
            int i24 = i23 & 23;
            int i25 = (((i23 | 23) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
            f56199g = i25 % 128;
            int i26 = i25 % 2;
            if (!((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue()) {
                int i27 = f56199g + 29;
                f56198f = i27 % 128;
                int i28 = i27 % 2;
                fk fkVar2 = fk.setX;
                int i29 = f56199g;
                int i30 = ((i29 ^ 83) | (i29 & 83)) << 1;
                int i31 = -(((~i29) & 83) | (i29 & (-84)));
                int i32 = (i30 & i31) + (i31 | i30);
                f56198f = i32 % 128;
                if (i32 % 2 == 0) {
                    return fkVar2;
                }
                throw null;
            }
            if (((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2))).length == 9) {
                int i33 = f56199g;
                int i34 = (i33 & 121) + (i33 | 121);
                f56198f = i34 % 128;
                int i35 = i34 % 2;
                if (((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2)))[0] == -97) {
                    int i36 = f56198f;
                    int i37 = ((i36 ^ 78) + ((i36 & 78) << 1)) - 1;
                    f56199g = i37 % 128;
                    int i38 = i37 % 2;
                    if (((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2)))[1] == 80) {
                        int i39 = f56199g;
                        int i40 = (i39 | 117) << 1;
                        int i41 = -(i39 ^ 117);
                        int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                        f56198f = i42 % 128;
                        int i43 = i42 % 2;
                        if (((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2)))[2] == 6) {
                            int i44 = f56199g + 9;
                            f56198f = i44 % 128;
                            if (i44 % 2 != 0) {
                                gv gvVar2 = hlVar.f56200a;
                                setAnimation setanimation = setAnimation.INSTANCE;
                                throw null;
                            }
                            gv gvVar3 = hlVar.f56200a;
                            setAnimation setanimation2 = setAnimation.INSTANCE;
                            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, (TransactionFailed) setAnimation.setY(new Object[0], -889535337, 889535345, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar3));
                            if (getbeeponfailure != null) {
                                int i45 = f56198f + 94;
                                int i46 = (i45 ^ (-1)) + (i45 << 1);
                                f56199g = i46 % 128;
                                int i47 = i46 % 2;
                                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, ArraysKt___ArraysKt.sliceArray((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2)), c.until(3, 9))}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure));
                                int i48 = f56199g;
                                int i49 = (i48 ^ 79) + ((i48 & 79) << 1);
                                f56198f = i49 % 128;
                                int i50 = i49 % 2;
                            }
                        }
                    }
                }
            }
            fk fkVar3 = fk.setX;
            int i51 = f56198f;
            int i52 = (i51 ^ 33) + ((i51 & 33) << 1);
            f56199g = i52 % 128;
            if (i52 % 2 != 0) {
                return fkVar3;
            }
            throw null;
        }
        if (i22 != 2) {
            if (i22 != 3) {
                if (i22 == 4) {
                    hl hlVar2 = (hl) objArr[0];
                    Continuation continuation = (Continuation) objArr[1];
                    int i53 = f56199g + 20;
                    int i54 = (i53 ^ (-1)) + (i53 << 1);
                    f56198f = i54 % 128;
                    if (i54 % 2 == 0) {
                        return setCompoundDrawableTintBlendMode(new Object[]{hlVar2, continuation}, -1704422784, 1704422786, System.identityHashCode(hlVar2));
                    }
                    setCompoundDrawableTintBlendMode(new Object[]{hlVar2, continuation}, -1704422784, 1704422786, System.identityHashCode(hlVar2));
                    throw null;
                }
                hl hlVar3 = (hl) objArr[0];
                setRotationX setrotationx3 = (setRotationX) objArr[1];
                int i55 = f56199g;
                int i56 = i55 & 25;
                int i57 = (i56 - (~(-(-((i55 ^ 25) | i56))))) - 1;
                f56198f = i57 % 128;
                int i58 = i57 % 2;
                et etVar = hlVar3.f56204e;
                et.setDividerPadding(new Object[]{hlVar3.f56200a}, 338249870, -338249868, (int) System.currentTimeMillis());
                ex exVar2 = hlVar3.f56202c;
                gv gvVar4 = hlVar3.f56200a;
                setTextKeepState settextkeepstate2 = hlVar3.f56201b;
                activateSession activatesession = activateSession.PRESENT_CARD_AGAIN;
                fk dividerPadding = ex.setDividerPadding(exVar2, gvVar4, settextkeepstate2, activatesession, ValueQualifier.setOnFocusChangeListener, new byte[]{0, 0, 0}, fd.END_APPLICATION, getY.setOnFocusChangeListener, Boolean.FALSE, activatesession, (setItemChecked) setRotationX.setX(new Object[]{setrotationx3}, 2020716727, -2020716721, System.identityHashCode(setrotationx3)), null, null, null, null, null, null, null, null, false, false, 4193280);
                int i59 = f56199g;
                int i60 = i59 & 71;
                int i61 = i60 + ((i59 ^ 71) | i60);
                f56198f = i61 % 128;
                int i62 = i61 % 2;
                return dividerPadding;
            }
            hl hlVar4 = (hl) objArr[0];
            int i63 = f56199g + 31;
            f56198f = i63 % 128;
            if (i63 % 2 != 0) {
                et etVar2 = hlVar4.f56204e;
                et.setDividerPadding(new Object[]{hlVar4.f56200a}, 338249870, -338249868, (int) System.currentTimeMillis());
                exVar = hlVar4.f56202c;
                gvVar = hlVar4.f56200a;
                settextkeepstate = hlVar4.f56201b;
                fdVar = fd.END_APPLICATION;
                gety = null;
                setitemchecked = null;
                setcontentcapturesession = null;
                setdrawselectorontop = setDrawSelectorOnTop.setOnFocusChangeListener;
                b10 = null;
                z10 = false;
                i18 = 2783;
            } else {
                et etVar3 = hlVar4.f56204e;
                et.setDividerPadding(new Object[]{hlVar4.f56200a}, 338249870, -338249868, (int) System.currentTimeMillis());
                exVar = hlVar4.f56202c;
                gvVar = hlVar4.f56200a;
                settextkeepstate = hlVar4.f56201b;
                fdVar = fd.END_APPLICATION;
                gety = null;
                setitemchecked = null;
                setcontentcapturesession = null;
                setdrawselectorontop = setDrawSelectorOnTop.setOnFocusChangeListener;
                b10 = null;
                z10 = false;
                i18 = 184;
            }
            fk compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode(exVar, gvVar, settextkeepstate, fdVar, gety, setitemchecked, setcontentcapturesession, setdrawselectorontop, b10, z10, i18);
            int i64 = f56198f + 93;
            f56199g = i64 % 128;
            if (i64 % 2 != 0) {
                return compoundDrawableTintBlendMode;
            }
            throw null;
        }
        hl hlVar5 = (hl) objArr[0];
        Continuation continuation2 = (Continuation) objArr[1];
        int i65 = f56198f;
        int i66 = (i65 & 83) + (i65 | 83);
        int i67 = i66 % 128;
        f56199g = i67;
        if (i66 % 2 == 0) {
            boolean z11 = continuation2 instanceof a;
            throw null;
        }
        if (!(continuation2 instanceof a)) {
            aVar = hlVar5.new a(continuation2);
            int i68 = f56199g - (-97);
            f56198f = i68 % 128;
            int i69 = i68 % 2;
        } else {
            aVar = (a) continuation2;
            int i70 = aVar.f56210s0;
            if ((i70 & Integer.MIN_VALUE) != 0) {
                int i71 = i67 & 33;
                int i72 = (~i71) & (i67 | 33);
                int i73 = -(-(i71 << 1));
                int i74 = (i72 & i73) + (i73 | i72);
                f56198f = i74 % 128;
                int i75 = i74 % 2;
                int iIdentityHashCode = System.identityHashCode(hlVar5);
                int i76 = -(-(i70 * (-858)));
                int i77 = -(-(((Integer.MIN_VALUE ^ iIdentityHashCode) | (Integer.MIN_VALUE & iIdentityHashCode)) * (-859)));
                int i78 = i76 & i77;
                int i79 = i78 + ((i76 ^ i77) | i78);
                int i80 = ~iIdentityHashCode;
                int i81 = (i80 | iIdentityHashCode) & i80;
                int i82 = i81 & Integer.MIN_VALUE;
                int i83 = ~(((i81 | Integer.MIN_VALUE) & (~i82)) | i82);
                int i84 = ~i70;
                int i85 = Integer.MAX_VALUE & i84;
                int i86 = (~i85) & (Integer.MAX_VALUE | i84);
                int i87 = (i86 & i85) | (i86 ^ i85);
                int i88 = i87 & iIdentityHashCode;
                int i89 = ((iIdentityHashCode | i87) & (~i88)) | i88;
                int i90 = ~i89;
                int i91 = (i89 | i90) & i90;
                int i92 = i83 & i91;
                int i93 = (i91 | i83) & (~i92);
                int i94 = -(-(((i93 & i92) | (i93 ^ i92)) * 859));
                int i95 = ((i79 | i94) << 1) - (i94 ^ i79);
                int i96 = (i84 | i70) & i84;
                int i97 = i96 & i80;
                int i98 = (i96 | i80) & (~i97);
                int i99 = (i98 & i97) | (i98 ^ i97);
                int i100 = ~i99;
                int i101 = (i99 | i100) & i100;
                int i102 = ~((i84 ^ Integer.MIN_VALUE) | (i84 & Integer.MIN_VALUE));
                int i103 = ((i101 & i102) | (i101 ^ i102)) * 859;
                int i104 = ((~i103) & i95) | ((~i95) & i103);
                int i105 = (i103 & i95) << 1;
                aVar.f56210s0 = (i104 & i105) + (i105 | i104);
                int i106 = f56198f;
                int i107 = (i106 & 34) + (i106 | 34);
                int i108 = (i107 ^ (-1)) + (i107 << 1);
                f56199g = i108 % 128;
                int i109 = i108 % 2;
            } else {
                aVar = hlVar5.new a(continuation2);
                int i610 = f56199g - (-97);
                f56198f = i610 % 128;
                int i611 = i610 % 2;
            }
        }
        Object compoundDrawableTintBlendMode2 = aVar.f56208q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i110 = aVar.f56210s0;
        if (i110 != 0) {
            if (i110 == 1) {
                hlVar5 = aVar.f56207p0;
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode2);
                int i111 = f56199g + 85;
                f56198f = i111 % 128;
                int i112 = i111 % 2;
                aVar2 = (com.mypinpad.tsdk.isolation.a) compoundDrawableTintBlendMode2;
                i15 = setY.setOnFocusChangeListener[((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).ordinal()];
                if (i15 == 1) {
                    fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{hlVar5}, 978896359, -978896356, System.identityHashCode(hlVar5));
                    int i113 = f56199g;
                    int i114 = i113 & 109;
                    int i115 = i113 | 109;
                    i16 = (i114 & i115) + (i115 | i114);
                    f56198f = i16 % 128;
                    if (i16 % 2 == 0) {
                        return fkVar;
                    }
                    throw null;
                }
                if (i15 != 2) {
                    throw new fh(32, ((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).toString());
                }
                aVar.f56207p0 = null;
                aVar.f56210s0 = 2;
                compoundDrawableTintBlendMode2 = setCompoundDrawableTintBlendMode(new Object[]{hlVar5, aVar}, -1093605985, 1093605989, System.identityHashCode(hlVar5));
                if (compoundDrawableTintBlendMode2 == coroutine_suspended) {
                    int i116 = f56198f;
                    int i117 = i116 + 120;
                    int i118 = (i117 ^ (-1)) + (i117 << 1);
                    f56199g = i118 % 128;
                    int i119 = i118 % 2;
                    int i120 = i116 & 71;
                    int i121 = -(-(i116 | 71));
                    i14 = (i120 ^ i121) + ((i121 & i120) << 1);
                    f56199g = i14 % 128;
                    int i122 = i14 % 2;
                }
            } else {
                if (i110 != 2) {
                    if (i110 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hlVar5 = aVar.f56207p0;
                    ResultKt.throwOnFailure(compoundDrawableTintBlendMode2);
                    int i123 = f56199g;
                    int i124 = (i123 & 85) + (i123 | 85);
                    f56198f = i124 % 128;
                    int i125 = i124 % 2;
                    setrotationx = (setRotationX) compoundDrawableTintBlendMode2;
                    i17 = setY.setY[((setRotationY) setRotationX.setX(new Object[]{setrotationx}, 1897018363, -1897018360, System.identityHashCode(setrotationx))).ordinal()];
                    if (i17 != 1) {
                        fk fkVar4 = (fk) setCompoundDrawableTintBlendMode(new Object[]{hlVar5, setrotationx}, -1296239968, 1296239969, System.identityHashCode(hlVar5));
                        int i126 = f56198f + 46;
                        int i127 = (i126 ^ (-1)) + (i126 << 1);
                        f56199g = i127 % 128;
                        int i128 = i127 % 2;
                        return fkVar4;
                    }
                    if (i17 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fk fkVar5 = (fk) setCompoundDrawableTintBlendMode(new Object[]{hlVar5, setrotationx}, -1055797438, 1055797438, System.identityHashCode(hlVar5));
                    int i129 = f56198f;
                    int i130 = ((i129 ^ 17) | (i129 & 17)) << 1;
                    int i131 = -(((~i129) & 17) | (i129 & (-18)));
                    int i132 = ((i130 | i131) << 1) - (i131 ^ i130);
                    f56199g = i132 % 128;
                    int i133 = i132 % 2;
                    return fkVar5;
                }
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode2);
                int i134 = f56198f;
                int i135 = i134 ^ 11;
                int i136 = -(-((i134 & 11) << 1));
                int i137 = ((i135 | i136) << 1) - (i136 ^ i135);
                f56199g = i137 % 128;
                int i138 = i137 % 2;
            }
            int i139 = f56198f + 103;
            f56199g = i139 % 128;
            int i140 = i139 % 2;
            return compoundDrawableTintBlendMode2;
        }
        ResultKt.throwOnFailure(compoundDrawableTintBlendMode2);
        setTextKeepState settextkeepstate3 = hlVar5.f56201b;
        if (!((Boolean) setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate3}, 11951396, -11951391, System.identityHashCode(settextkeepstate3))).booleanValue()) {
            aVar.f56207p0 = hlVar5;
            aVar.f56210s0 = 3;
            compoundDrawableTintBlendMode2 = hlVar5.f56203d.setCompoundDrawableTintBlendMode(aVar);
            if (compoundDrawableTintBlendMode2 == coroutine_suspended) {
                int i141 = f56199g;
                int i142 = ((i141 ^ 85) | (i141 & 85)) << 1;
                int i143 = -((i141 & (-86)) | ((~i141) & 85));
                int i144 = ((i142 | i143) << 1) - (i142 ^ i143);
                f56198f = i144 % 128;
                if (i144 % 2 != 0) {
                    int i145 = 95 / 0;
                }
                int i146 = i141 ^ 33;
                int i147 = -(-((i141 & 33) << 1));
                i14 = (i146 & i147) + (i147 | i146);
                f56198f = i14 % 128;
                int i1210 = i14 % 2;
            }
            setrotationx = (setRotationX) compoundDrawableTintBlendMode2;
            i17 = setY.setY[((setRotationY) setRotationX.setX(new Object[]{setrotationx}, 1897018363, -1897018360, System.identityHashCode(setrotationx))).ordinal()];
            if (i17 != 1) {
                fk fkVar6 = (fk) setCompoundDrawableTintBlendMode(new Object[]{hlVar5, setrotationx}, -1296239968, 1296239969, System.identityHashCode(hlVar5));
                int i1211 = f56198f + 46;
                int i1212 = (i1211 ^ (-1)) + (i1211 << 1);
                f56199g = i1212 % 128;
                int i1213 = i1212 % 2;
                return fkVar6;
            }
            if (i17 == 2) {
                throw new NoWhenBranchMatchedException();
            }
            fk fkVar7 = (fk) setCompoundDrawableTintBlendMode(new Object[]{hlVar5, setrotationx}, -1055797438, 1055797438, System.identityHashCode(hlVar5));
            int i1214 = f56198f;
            int i1310 = ((i1214 ^ 17) | (i1214 & 17)) << 1;
            int i1311 = -(((~i1214) & 17) | (i1214 & (-18)));
            int i1312 = ((i1310 | i1311) << 1) - (i1311 ^ i1310);
            f56199g = i1312 % 128;
            int i1313 = i1312 % 2;
            return fkVar7;
        }
        int i148 = f56198f + 27;
        f56199g = i148 % 128;
        int i149 = i148 % 2;
        setTextKeepState settextkeepstate4 = hlVar5.f56201b;
        if (i149 == 0) {
            aVar.f56207p0 = hlVar5;
            aVar.f56210s0 = 1;
            compoundDrawableTintBlendMode2 = setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate4, aVar}, -1083100835, 1083100838, System.identityHashCode(settextkeepstate4));
            if (compoundDrawableTintBlendMode2 != coroutine_suspended) {
                aVar2 = (com.mypinpad.tsdk.isolation.a) compoundDrawableTintBlendMode2;
                i15 = setY.setOnFocusChangeListener[((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).ordinal()];
                if (i15 == 1) {
                    fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{hlVar5}, 978896359, -978896356, System.identityHashCode(hlVar5));
                    int i1110 = f56199g;
                    int i1111 = i1110 & 109;
                    int i1112 = i1110 | 109;
                    i16 = (i1111 & i1112) + (i1112 | i1111);
                    f56198f = i16 % 128;
                    if (i16 % 2 == 0) {
                        return fkVar;
                    }
                    throw null;
                }
                if (i15 != 2) {
                    throw new fh(32, ((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).toString());
                }
                aVar.f56207p0 = null;
                aVar.f56210s0 = 2;
                compoundDrawableTintBlendMode2 = setCompoundDrawableTintBlendMode(new Object[]{hlVar5, aVar}, -1093605985, 1093605989, System.identityHashCode(hlVar5));
                if (compoundDrawableTintBlendMode2 == coroutine_suspended) {
                    int i1113 = f56198f;
                    int i1114 = i1113 + 120;
                    int i1115 = (i1114 ^ (-1)) + (i1114 << 1);
                    f56199g = i1115 % 128;
                    int i1116 = i1115 % 2;
                    int i1215 = i1113 & 71;
                    int i1216 = -(-(i1113 | 71));
                    i14 = (i1215 ^ i1216) + ((i1216 & i1215) << 1);
                    f56199g = i14 % 128;
                    int i1217 = i14 % 2;
                }
                int i1314 = f56198f + 103;
                f56199g = i1314 % 128;
                int i1410 = i1314 % 2;
                return compoundDrawableTintBlendMode2;
            }
            i13 = f56198f + 93;
            f56199g = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        } else {
            aVar.f56207p0 = hlVar5;
            aVar.f56210s0 = 1;
            compoundDrawableTintBlendMode2 = setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate4, aVar}, -1083100835, 1083100838, System.identityHashCode(settextkeepstate4));
            if (compoundDrawableTintBlendMode2 != coroutine_suspended) {
                aVar2 = (com.mypinpad.tsdk.isolation.a) compoundDrawableTintBlendMode2;
                i15 = setY.setOnFocusChangeListener[((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).ordinal()];
                if (i15 == 1) {
                    fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{hlVar5}, 978896359, -978896356, System.identityHashCode(hlVar5));
                    int i1117 = f56199g;
                    int i1118 = i1117 & 109;
                    int i1119 = i1117 | 109;
                    i16 = (i1118 & i1119) + (i1119 | i1118);
                    f56198f = i16 % 128;
                    if (i16 % 2 == 0) {
                        return fkVar;
                    }
                    throw null;
                }
                if (i15 != 2) {
                    throw new fh(32, ((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).toString());
                }
                aVar.f56207p0 = null;
                aVar.f56210s0 = 2;
                compoundDrawableTintBlendMode2 = setCompoundDrawableTintBlendMode(new Object[]{hlVar5, aVar}, -1093605985, 1093605989, System.identityHashCode(hlVar5));
                if (compoundDrawableTintBlendMode2 == coroutine_suspended) {
                    int i11110 = f56198f;
                    int i11111 = i11110 + 120;
                    int i11112 = (i11111 ^ (-1)) + (i11111 << 1);
                    f56199g = i11112 % 128;
                    int i11113 = i11112 % 2;
                    int i1218 = i11110 & 71;
                    int i1219 = -(-(i11110 | 71));
                    i14 = (i1218 ^ i1219) + ((i1219 & i1218) << 1);
                    f56199g = i14 % 128;
                    int i12110 = i14 % 2;
                }
                int i1315 = f56198f + 103;
                f56199g = i1315 % 128;
                int i1411 = i1315 % 2;
                return compoundDrawableTintBlendMode2;
            }
            i13 = f56198f + 93;
            f56199g = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }
        return coroutine_suspended;
    }

    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setCompoundDrawableTintBlendMode(new Object[]{this, continuation}, -1704422784, 1704422786, System.identityHashCode(this));
    }
}
