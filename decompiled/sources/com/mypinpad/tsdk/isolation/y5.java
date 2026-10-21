package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/bz;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/bz;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class y5 extends Lambda implements Function1<bz, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y5 f61993p0 = new y5();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61994q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61995r0 = 1;

    static {
        int i10 = f61995r0;
        int i11 = i10 & 13;
        int i12 = i10 | 13;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f61994q0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public y5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i10 | i12)) * 216) + (i11 * (-215)) + (i10 * 217);
        int i14 = (~i11) | i10;
        int i15 = ~i12;
        if ((((~(i10 | i15)) | i11) * 216) + ((i14 | i15) * (-216)) + i13 == 1) {
            bz bzVar = (bz) objArr[1];
            int i16 = f61995r0;
            int i17 = (i16 & 117) + (i16 | 117);
            f61994q0 = i17 % 128;
            int i18 = i17 % 2;
            Intrinsics.checkNotNullParameter(bzVar, "");
            bz.setY(new Object[]{bzVar, Byte.valueOf(by.UNRECOGNISED_CVM.setDividerPadding())}, 881254746, -881254746, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, cb.ALWAYS}, -478987183, 478987185, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, ce.setOnFocusChangeListener}, 2141338749, -2141338746, System.identityHashCode(bzVar));
            int i19 = f61994q0;
            int i20 = ((i19 ^ 66) + ((i19 & 66) << 1)) - 1;
            f61995r0 = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        y5 y5Var = (y5) objArr[0];
        Object obj = objArr[1];
        int i22 = f61994q0;
        int i23 = ((i22 ^ 65) | (i22 & 65)) << 1;
        int i24 = -(((~i22) & 65) | (i22 & (-66)));
        int i25 = (i23 & i24) + (i24 | i23);
        f61995r0 = i25 % 128;
        bz bzVar2 = (bz) obj;
        if (i25 % 2 == 0) {
            a(new Object[]{y5Var, bzVar2}, 2121489671, -2121489670, System.identityHashCode(y5Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        a(new Object[]{y5Var, bzVar2}, 2121489671, -2121489670, System.identityHashCode(y5Var));
        Unit unit2 = Unit.INSTANCE;
        int i26 = f61994q0;
        int i27 = i26 & 71;
        int i28 = (i27 - (~(-(-((i26 ^ 71) | i27))))) - 1;
        f61995r0 = i28 % 128;
        int i29 = i28 % 2;
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(bz bzVar) {
        return a(new Object[]{this, bzVar}, -1394735022, 1394735022, System.identityHashCode(this));
    }
}
