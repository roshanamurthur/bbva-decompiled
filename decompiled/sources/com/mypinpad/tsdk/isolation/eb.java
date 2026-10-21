package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mypinpad.tsdk.isolation.fb;
import com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade;
import ek.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class eb<D extends setScrollBarDefaultDelayBeforeFade, O extends fb<D>> extends ec<D, O> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55335g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55336h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f55337f;

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[setRotationY.values().length];
            iArr[setRotationY.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            iArr[setRotationY.setDividerPadding.ordinal()] = 2;
            setY = iArr;
            int i10 = 47 % 128;
            if (47 % 2 == 0) {
                int i11 = 64 / 0;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(@NotNull D d2, @NotNull setTextKeepState settextkeepstate, @NotNull O o2, @NotNull getValue getvalue) {
        super(d2, settextkeepstate, o2);
        Intrinsics.checkNotNullParameter(d2, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(o2, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f55337f = getvalue;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:31:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x0234 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0236  */
    /* JADX WARN: Code duplicated, block: B:42:0x024c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0252  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        r3 r3Var;
        int i13;
        int i14;
        Object compoundDrawableTintBlendMode;
        Object coroutine_suspended;
        int i15;
        setRotationX setrotationx;
        int i16;
        int i17 = (i11 * 246) + (i10 * (-244));
        int i18 = ~i11;
        int i19 = (((~((~i12) | i18)) | (~(i18 | i10))) * (-245)) + i17;
        int i20 = ~(i18 | i12);
        int i21 = ((i10 | i20) * 245) + (i20 * (-245)) + i19;
        if (i21 != 1) {
            if (i21 == 2) {
                eb ebVar = (eb) objArr[0];
                int i22 = f55335g;
                int i23 = i22 & 41;
                int i24 = (i22 ^ 41) | i23;
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                f55336h = i25 % 128;
                int i26 = i25 % 2;
                getValue getvalue = ebVar.f55337f;
                if (i26 == 0) {
                    throw null;
                }
                int i27 = (i22 & (-50)) | ((~i22) & 49);
                int i28 = -(-((i22 & 49) << 1));
                int i29 = (i27 & i28) + (i28 | i27);
                f55336h = i29 % 128;
                int i30 = i29 % 2;
                return getvalue;
            }
            eb ebVar2 = (eb) objArr[0];
            Continuation continuation = (Continuation) objArr[1];
            int i31 = f55336h;
            int i32 = i31 & 27;
            int i33 = ((i31 ^ 27) | i32) << 1;
            int i34 = -((i31 | 27) & (~i32));
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            f55335g = i35 % 128;
            if (i35 % 2 != 0) {
                setY(new Object[]{ebVar2, continuation}, -79897080, 79897081, (int) System.currentTimeMillis());
                throw null;
            }
            Object y7 = setY(new Object[]{ebVar2, continuation}, -79897080, 79897081, (int) System.currentTimeMillis());
            int i36 = f55336h;
            int i37 = i36 & 89;
            int i38 = (i37 - (~((i36 ^ 89) | i37))) - 1;
            f55335g = i38 % 128;
            if (i38 % 2 == 0) {
                return y7;
            }
            throw null;
        }
        eb ebVar3 = (eb) objArr[0];
        Continuation continuation2 = (Continuation) objArr[1];
        int i39 = f55336h;
        int i40 = (i39 & (-44)) | ((~i39) & 43);
        int i41 = -(-((i39 & 43) << 1));
        int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
        int i43 = i42 % 128;
        f55335g = i43;
        if (i42 % 2 == 0) {
            if (continuation2 instanceof r3) {
                int i44 = ((i43 | 79) << 1) - (i43 ^ 79);
                f55336h = i44 % 128;
                int i45 = i44 % 2;
                r3Var = (r3) continuation2;
                i13 = r3Var.f58060s0;
                i14 = i13 & Integer.MIN_VALUE;
                if (i14 != 0) {
                    int i46 = i43 + 91;
                    f55336h = i46 % 128;
                    int i47 = i46 % 2;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i48 = -(-(i13 * (-317)));
                    int i49 = ((Integer.MIN_VALUE | i48) << 1) - (i48 ^ Integer.MIN_VALUE);
                    int i50 = ~i13;
                    int i51 = (i50 | i13) & i50;
                    int i52 = Integer.MAX_VALUE | iCurrentTimeMillis;
                    int i53 = ~i52;
                    int i54 = (i52 | i53) & i53;
                    int i55 = (((i51 & i54) | (i51 ^ i54)) * (-318)) + i49;
                    int i56 = ~((i50 ^ iCurrentTimeMillis) | (i50 & iCurrentTimeMillis));
                    int i57 = ~iCurrentTimeMillis;
                    int i58 = i57 & (i57 | iCurrentTimeMillis);
                    int i59 = i58 & Integer.MIN_VALUE;
                    int i60 = (~i59) & (i58 | Integer.MIN_VALUE);
                    int i61 = (i59 & i60) | (i60 ^ i59);
                    int i62 = i61 ^ i13;
                    int i63 = i61 & i13;
                    int i64 = (i63 & i62) | (i62 ^ i63);
                    int i65 = ~i64;
                    int i66 = (i64 | i65) & i65;
                    int i67 = ((i56 & i66) | (i56 ^ i66)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                    int i68 = ((((~i67) & i55) | ((~i55) & i67)) - (~((i67 & i55) << 1))) - 1;
                    int i69 = (i50 & i58) | (i50 ^ i58);
                    int i70 = i69 & Integer.MIN_VALUE;
                    int i71 = (i69 | Integer.MIN_VALUE) & (~i70);
                    int i72 = ~((i71 & i70) | (i71 ^ i70));
                    int i73 = (i13 ^ Integer.MIN_VALUE) | i14;
                    int i74 = i73 & iCurrentTimeMillis;
                    int i75 = ((iCurrentTimeMillis | i73) & (~i74)) | i74;
                    int i76 = ~i75;
                    int i77 = (i75 | i76) & i76;
                    int i78 = ((~i77) & i72) | ((~i72) & i77);
                    int i79 = i77 & i72;
                    int i80 = -(~(-(-(((i79 & i78) | (i78 ^ i79)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))));
                    r3Var.f58060s0 = (((i68 | i80) << 1) - (i80 ^ i68)) - 1;
                    int i81 = f55335g;
                    int i82 = i81 & 115;
                    int i83 = (i81 | 115) & (~i82);
                    int i84 = -(-(i82 << 1));
                    int i85 = ((i83 | i84) << 1) - (i83 ^ i84);
                    f55336h = i85 % 128;
                    int i86 = i85 % 2;
                }
            }
            compoundDrawableTintBlendMode = r3Var.f58058q0;
            coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            i15 = r3Var.f58060s0;
            if (i15 == 0) {
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                getValue getvalue2 = (getValue) setY(new Object[]{ebVar3}, -288529477, 288529479, System.identityHashCode(ebVar3));
                r3Var.f58057p0 = ebVar3;
                r3Var.f58060s0 = 1;
                compoundDrawableTintBlendMode = getvalue2.setCompoundDrawableTintBlendMode(r3Var);
                if (compoundDrawableTintBlendMode == coroutine_suspended) {
                    int i87 = f55335g;
                    int i88 = i87 & 125;
                    int i89 = (i87 ^ 125) | i88;
                    int i90 = (i88 ^ i89) + ((i88 & i89) << 1);
                    f55336h = i90 % 128;
                    int i91 = i90 % 2;
                    int i92 = i87 & 79;
                    int i93 = -(-((i87 ^ 79) | i92));
                    int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
                    f55336h = i94 % 128;
                    int i95 = i94 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ebVar3 = r3Var.f58057p0;
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i96 = f55335g;
                int i97 = i96 & 65;
                int i98 = -(-((i96 ^ 65) | i97));
                int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                f55336h = i99 % 128;
                int i100 = i99 % 2;
            }
            setrotationx = (setRotationX) compoundDrawableTintBlendMode;
            i16 = setY.setY[((setRotationY) setRotationX.setX(new Object[]{setrotationx}, 1897018363, -1897018360, System.identityHashCode(setrotationx))).ordinal()];
            if (i16 != 1) {
                if (i16 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fk x4 = ebVar3.setX(setrotationx);
                int i101 = f55335g;
                int i102 = i101 ^ 61;
                int i103 = ((((i101 & 61) | i102) << 1) - (~(-i102))) - 1;
                f55336h = i103 % 128;
                int i104 = i103 % 2;
                return x4;
            }
            fk y10 = ebVar3.setY(setrotationx);
            int i105 = f55336h;
            int i106 = i105 & 79;
            int i107 = (i105 | 79) & (~i106);
            int i108 = i106 << 1;
            int i109 = (i107 & i108) + (i107 | i108);
            f55335g = i109 % 128;
            int i110 = i109 % 2;
            return y10;
        }
        int i111 = 39 / 0;
        if (continuation2 instanceof r3) {
            int i410 = ((i43 | 79) << 1) - (i43 ^ 79);
            f55336h = i410 % 128;
            int i411 = i410 % 2;
            r3Var = (r3) continuation2;
            i13 = r3Var.f58060s0;
            i14 = i13 & Integer.MIN_VALUE;
            if (i14 != 0) {
                int i412 = i43 + 91;
                f55336h = i412 % 128;
                int i413 = i412 % 2;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i414 = -(-(i13 * (-317)));
                int i415 = ((Integer.MIN_VALUE | i414) << 1) - (i414 ^ Integer.MIN_VALUE);
                int i510 = ~i13;
                int i511 = (i510 | i13) & i510;
                int i512 = Integer.MAX_VALUE | iCurrentTimeMillis2;
                int i513 = ~i512;
                int i514 = (i512 | i513) & i513;
                int i515 = (((i511 & i514) | (i511 ^ i514)) * (-318)) + i415;
                int i516 = ~((i510 ^ iCurrentTimeMillis2) | (i510 & iCurrentTimeMillis2));
                int i517 = ~iCurrentTimeMillis2;
                int i518 = i517 & (i517 | iCurrentTimeMillis2);
                int i519 = i518 & Integer.MIN_VALUE;
                int i610 = (~i519) & (i518 | Integer.MIN_VALUE);
                int i611 = (i519 & i610) | (i610 ^ i519);
                int i612 = i611 ^ i13;
                int i613 = i611 & i13;
                int i614 = (i613 & i612) | (i612 ^ i613);
                int i615 = ~i614;
                int i616 = (i614 | i615) & i615;
                int i617 = ((i516 & i616) | (i516 ^ i616)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                int i618 = ((((~i617) & i515) | ((~i515) & i617)) - (~((i617 & i515) << 1))) - 1;
                int i619 = (i510 & i518) | (i510 ^ i518);
                int i710 = i619 & Integer.MIN_VALUE;
                int i711 = (i619 | Integer.MIN_VALUE) & (~i710);
                int i712 = ~((i711 & i710) | (i711 ^ i710));
                int i713 = (i13 ^ Integer.MIN_VALUE) | i14;
                int i714 = i713 & iCurrentTimeMillis2;
                int i715 = ((iCurrentTimeMillis2 | i713) & (~i714)) | i714;
                int i716 = ~i715;
                int i717 = (i715 | i716) & i716;
                int i718 = ((~i717) & i712) | ((~i712) & i717);
                int i719 = i717 & i712;
                int i810 = -(~(-(-(((i719 & i718) | (i718 ^ i719)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))));
                r3Var.f58060s0 = (((i618 | i810) << 1) - (i810 ^ i618)) - 1;
                int i811 = f55335g;
                int i812 = i811 & 115;
                int i813 = (i811 | 115) & (~i812);
                int i814 = -(-(i812 << 1));
                int i815 = ((i813 | i814) << 1) - (i813 ^ i814);
                f55336h = i815 % 128;
                int i816 = i815 % 2;
            }
        }
        compoundDrawableTintBlendMode = r3Var.f58058q0;
        coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        i15 = r3Var.f58060s0;
        if (i15 == 0) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            getValue getvalue3 = (getValue) setY(new Object[]{ebVar3}, -288529477, 288529479, System.identityHashCode(ebVar3));
            r3Var.f58057p0 = ebVar3;
            r3Var.f58060s0 = 1;
            compoundDrawableTintBlendMode = getvalue3.setCompoundDrawableTintBlendMode(r3Var);
            if (compoundDrawableTintBlendMode == coroutine_suspended) {
                int i817 = f55335g;
                int i818 = i817 & 125;
                int i819 = (i817 ^ 125) | i818;
                int i910 = (i818 ^ i819) + ((i818 & i819) << 1);
                f55336h = i910 % 128;
                int i911 = i910 % 2;
                int i912 = i817 & 79;
                int i913 = -(-((i817 ^ 79) | i912));
                int i914 = (i912 ^ i913) + ((i913 & i912) << 1);
                f55336h = i914 % 128;
                int i915 = i914 % 2;
                return coroutine_suspended;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ebVar3 = r3Var.f58057p0;
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i916 = f55335g;
            int i917 = i916 & 65;
            int i918 = -(-((i916 ^ 65) | i917));
            int i919 = ((i917 | i918) << 1) - (i918 ^ i917);
            f55336h = i919 % 128;
            int i1010 = i919 % 2;
        }
        setrotationx = (setRotationX) compoundDrawableTintBlendMode;
        i16 = setY.setY[((setRotationY) setRotationX.setX(new Object[]{setrotationx}, 1897018363, -1897018360, System.identityHashCode(setrotationx))).ordinal()];
        if (i16 != 1) {
            if (i16 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fk x6 = ebVar3.setX(setrotationx);
            int i1011 = f55335g;
            int i1012 = i1011 ^ 61;
            int i1013 = ((((i1011 & 61) | i1012) << 1) - (~(-i1012))) - 1;
            f55336h = i1013 % 128;
            int i1014 = i1013 % 2;
            return x6;
        }
        fk y11 = ebVar3.setY(setrotationx);
        int i1015 = f55336h;
        int i1016 = i1015 & 79;
        int i1017 = (i1015 | 79) & (~i1016);
        int i1018 = i1016 << 1;
        int i1019 = (i1017 & i1018) + (i1017 | i1018);
        f55335g = i1019 % 128;
        int i112 = i1019 % 2;
        return y11;
        r3Var = new r3(ebVar3, continuation2);
        int i113 = f55335g;
        int i114 = i113 | 7;
        int i115 = i114 << 1;
        int i116 = -((~(i113 & 7)) & i114);
        int i117 = (i115 & i116) + (i116 | i115);
        f55336h = i117 % 128;
        int i118 = i117 % 2;
        compoundDrawableTintBlendMode = r3Var.f58058q0;
        coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        i15 = r3Var.f58060s0;
        if (i15 == 0) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            getValue getvalue4 = (getValue) setY(new Object[]{ebVar3}, -288529477, 288529479, System.identityHashCode(ebVar3));
            r3Var.f58057p0 = ebVar3;
            r3Var.f58060s0 = 1;
            compoundDrawableTintBlendMode = getvalue4.setCompoundDrawableTintBlendMode(r3Var);
            if (compoundDrawableTintBlendMode == coroutine_suspended) {
                int i8110 = f55335g;
                int i8111 = i8110 & 125;
                int i8112 = (i8110 ^ 125) | i8111;
                int i9110 = (i8111 ^ i8112) + ((i8111 & i8112) << 1);
                f55336h = i9110 % 128;
                int i9111 = i9110 % 2;
                int i9112 = i8110 & 79;
                int i9113 = -(-((i8110 ^ 79) | i9112));
                int i9114 = (i9112 ^ i9113) + ((i9113 & i9112) << 1);
                f55336h = i9114 % 128;
                int i9115 = i9114 % 2;
                return coroutine_suspended;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ebVar3 = r3Var.f58057p0;
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i9116 = f55335g;
            int i9117 = i9116 & 65;
            int i9118 = -(-((i9116 ^ 65) | i9117));
            int i9119 = ((i9117 | i9118) << 1) - (i9118 ^ i9117);
            f55336h = i9119 % 128;
            int i10110 = i9119 % 2;
        }
        setrotationx = (setRotationX) compoundDrawableTintBlendMode;
        i16 = setY.setY[((setRotationY) setRotationX.setX(new Object[]{setrotationx}, 1897018363, -1897018360, System.identityHashCode(setrotationx))).ordinal()];
        if (i16 != 1) {
            if (i16 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fk x7 = ebVar3.setX(setrotationx);
            int i10111 = f55335g;
            int i10112 = i10111 ^ 61;
            int i10113 = ((((i10111 & 61) | i10112) << 1) - (~(-i10112))) - 1;
            f55336h = i10113 % 128;
            int i10114 = i10113 % 2;
            return x7;
        }
        fk y12 = ebVar3.setY(setrotationx);
        int i10115 = f55336h;
        int i10116 = i10115 & 79;
        int i10117 = (i10115 | 79) & (~i10116);
        int i10118 = i10116 << 1;
        int i10119 = (i10117 & i10118) + (i10117 | i10118);
        f55335g = i10119 % 128;
        int i119 = i10119 % 2;
        return y12;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setY(new Object[]{this, continuation}, 1523929732, -1523929732, System.identityHashCode(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public fk setX(@NotNull setRotationX setrotationx) {
        int i10 = f55335g;
        int i11 = ((i10 ^ 40) + ((i10 & 40) << 1)) - 1;
        f55336h = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setrotationx, "");
            return ((fb) ec.setCompoundDrawableTintBlendMode(new Object[]{this}, 356425760, -356425757, System.identityHashCode(this))).setCompoundDrawableTintBlendMode((setScrollBarDefaultDelayBeforeFade) ec.setCompoundDrawableTintBlendMode(new Object[]{this}, -1396275124, 1396275124, System.identityHashCode(this)), (setTextKeepState) ec.setCompoundDrawableTintBlendMode(new Object[]{this}, 1001493365, -1001493364, System.identityHashCode(this)));
        }
        Intrinsics.checkNotNullParameter(setrotationx, "");
        int i12 = 82 / 0;
        return ((fb) ec.setCompoundDrawableTintBlendMode(new Object[]{this}, 356425760, -356425757, System.identityHashCode(this))).setCompoundDrawableTintBlendMode((setScrollBarDefaultDelayBeforeFade) ec.setCompoundDrawableTintBlendMode(new Object[]{this}, -1396275124, 1396275124, System.identityHashCode(this)), (setTextKeepState) ec.setCompoundDrawableTintBlendMode(new Object[]{this}, 1001493365, -1001493364, System.identityHashCode(this)));
    }

    @NotNull
    public abstract fk setY(@NotNull setRotationX setrotationx);

    @NotNull
    public final getValue setY() {
        return (getValue) setY(new Object[]{this}, -288529477, 288529479, System.identityHashCode(this));
    }
}
