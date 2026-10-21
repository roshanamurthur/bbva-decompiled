package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/z;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/z;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class h4 extends Lambda implements Function1<z, Unit> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f56137w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f56138x0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ fd f56139p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ getY f56140q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Boolean f56141r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ setScrollBarDefaultDelayBeforeFade f56142s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Boolean f56143t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Byte f56144u0;
    public final /* synthetic */ setTransitionVisibility v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(fd fdVar, getY gety, Boolean bool, setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, Boolean bool2, Byte b10, setTransitionVisibility settransitionvisibility) {
        super(1);
        this.f56139p0 = fdVar;
        this.f56140q0 = gety;
        this.f56141r0 = bool;
        this.f56142s0 = setscrollbardefaultdelaybeforefade;
        this.f56143t0 = bool2;
        this.f56144u0 = b10;
        this.v0 = settransitionvisibility;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i14 = ~i10;
        if ((((~(i14 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i14) * (-420)) + i13 != 1) {
            h4 h4Var = (h4) objArr[0];
            Object obj = objArr[1];
            int i15 = f56138x0;
            int i16 = (i15 ^ 81) + ((i15 & 81) << 1);
            f56137w0 = i16 % 128;
            int i17 = i16 % 2;
            a(new Object[]{h4Var, (z) obj}, 607062650, -607062649, System.identityHashCode(h4Var));
            Unit unit = Unit.INSTANCE;
            int i18 = f56138x0;
            int i19 = i18 & 1;
            int i20 = -(-(i18 | 1));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f56137w0 = i21 % 128;
            if (i21 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        h4 h4Var2 = (h4) objArr[0];
        z zVar = (z) objArr[1];
        int i22 = f56137w0;
        int i23 = ((i22 & 40) + (i22 | 40)) - 1;
        f56138x0 = i23 % 128;
        int i24 = i23 % 2;
        Intrinsics.checkNotNullParameter(zVar, "");
        z.setY(new Object[]{zVar, h4Var2.f56139p0}, -1362792018, 1362792029, System.identityHashCode(zVar));
        z.setY(new Object[]{zVar, h4Var2.f56140q0}, 1653459763, -1653459744, System.identityHashCode(zVar));
        Boolean bool = h4Var2.f56141r0;
        if (bool == null) {
            int i25 = f56138x0;
            int i26 = (i25 & 95) + (i25 | 95);
            f56137w0 = i26 % 128;
            zBooleanValue = i26 % 2 != 0;
            int i27 = i25 & 3;
            int i28 = (i25 ^ 3) | i27;
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            f56137w0 = i29 % 128;
            int i30 = i29 % 2;
        } else {
            zBooleanValue = bool.booleanValue();
            int i31 = f56137w0;
            int i32 = ((i31 ^ 58) + ((i31 & 58) << 1)) - 1;
            f56138x0 = i32 % 128;
            int i33 = i32 % 2;
        }
        z.setY(new Object[]{zVar, Boolean.valueOf(zBooleanValue)}, 1802544043, -1802544040, System.identityHashCode(zVar));
        if (bool == null) {
            int i34 = f56137w0;
            int i35 = (i34 & 93) + (i34 | 93);
            f56138x0 = i35 % 128;
            zBooleanValue2 = i35 % 2 != 0;
            int i36 = i34 ^ 7;
            int i37 = ((i34 & 7) | i36) << 1;
            int i38 = -i36;
            int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
            f56138x0 = i39 % 128;
            int i40 = i39 % 2;
        } else {
            zBooleanValue2 = bool.booleanValue();
            int i41 = f56138x0;
            int i42 = (i41 ^ 22) + ((i41 & 22) << 1);
            int i43 = (i42 ^ (-1)) + (i42 << 1);
            f56137w0 = i43 % 128;
            int i44 = i43 % 2;
        }
        if (!(!zBooleanValue2)) {
            int i45 = f56138x0;
            int i46 = i45 & 73;
            int i47 = (i45 ^ 73) | i46;
            int i48 = (i46 & i47) + (i47 | i46);
            f56137w0 = i48 % 128;
            int i49 = i48 % 2;
            z10 = false;
        } else {
            int i50 = f56138x0 + 86;
            int i51 = (i50 ^ (-1)) + (i50 << 1);
            f56137w0 = i51 % 128;
            z10 = !(i51 % 2 != 0);
        }
        z.setY(new Object[]{zVar, Boolean.valueOf(z10)}, 1456680272, -1456680263, System.identityHashCode(zVar));
        TransactionFailed indeterminateDrawableTiled = setAnimation.setIndeterminateDrawableTiled();
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = h4Var2.f56142s0;
        if (((getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, indeterminateDrawableTiled}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade))) != null) {
            int i52 = (-2) - ((f56137w0 + 8) ^ (-1));
            int i53 = i52 % 128;
            f56138x0 = i53;
            int i54 = i52 % 2;
            int i55 = (i53 & (-108)) | ((~i53) & 107);
            int i56 = (i53 & 107) << 1;
            int i57 = (i55 & i56) + (i55 | i56);
            f56137w0 = i57 % 128;
            int i58 = i57 % 2;
            z11 = true;
        } else {
            int i59 = f56138x0;
            int i60 = i59 & 59;
            int i61 = -(-((i59 ^ 59) | i60));
            int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
            f56137w0 = i62 % 128;
            int i63 = i62 % 2;
            z11 = false;
        }
        z.setY(new Object[]{zVar, Boolean.valueOf(z11)}, 1618972104, -1618972098, System.identityHashCode(zVar));
        if (((getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], -731579319, 731579502, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade))) != null) {
            int i64 = f56138x0;
            int i65 = i64 & 107;
            int i66 = -(-((i64 ^ 107) | i65));
            int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
            f56137w0 = i67 % 128;
            int i68 = i67 % 2;
            z12 = true;
        } else {
            int i69 = f56138x0;
            int i70 = i69 ^ 47;
            int i71 = -(-((i69 & 47) << 1));
            int i72 = (i70 & i71) + (i71 | i70);
            f56137w0 = i72 % 128;
            int i73 = i72 % 2;
            z12 = false;
        }
        z.setY(new Object[]{zVar, Boolean.valueOf(z12)}, 2127853437, -2127853420, System.identityHashCode(zVar));
        Boolean bool2 = h4Var2.f56143t0;
        if (bool2 != null) {
            int i74 = f56138x0 + 75;
            f56137w0 = i74 % 128;
            int i75 = i74 % 2;
            z.setY(new Object[]{zVar, Boolean.valueOf(bool2.booleanValue())}, -699002700, 699002705, System.identityHashCode(zVar));
            int i76 = f56138x0;
            int i77 = ((i76 | 35) << 1) - (i76 ^ 35);
            f56137w0 = i77 % 128;
            int i78 = i77 % 2;
        }
        Byte b10 = h4Var2.f56144u0;
        if (b10 != null) {
            int i79 = f56138x0;
            int i80 = i79 & 119;
            int i81 = ((i79 ^ 119) | i80) << 1;
            int i82 = -((i79 | 119) & (~i80));
            int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
            f56137w0 = i83 % 128;
            int i84 = i83 % 2;
            z.setY(new Object[]{zVar, Byte.valueOf(b10.byteValue())}, -48425587, 48425602, System.identityHashCode(zVar));
            int i85 = f56138x0 + 31;
            f56137w0 = i85 % 128;
            int i86 = i85 % 2;
        }
        setTransitionVisibility settransitionvisibility = h4Var2.v0;
        if (settransitionvisibility != null) {
            int i87 = f56138x0;
            int i88 = i87 & 67;
            int i89 = (((i87 | 67) & (~i88)) - (~(-(-(i88 << 1))))) - 1;
            f56137w0 = i89 % 128;
            int i90 = i89 % 2;
            z.setY(new Object[]{zVar, settransitionvisibility}, 1357340711, -1357340703, System.identityHashCode(zVar));
            int i91 = f56137w0 + 67;
            f56138x0 = i91 % 128;
            int i92 = i91 % 2;
        }
        int i93 = f56137w0;
        int i94 = i93 & 83;
        int i95 = (i93 ^ 83) | i94;
        int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
        f56138x0 = i96 % 128;
        if (i96 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(z zVar) {
        return a(new Object[]{this, zVar}, 1591609099, -1591609099, System.identityHashCode(this));
    }
}
