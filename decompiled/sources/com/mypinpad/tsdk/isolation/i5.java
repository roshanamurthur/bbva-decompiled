package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/bz;", "", "setX", "(Lcom/mypinpad/tsdk/i/bz;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class i5 extends Lambda implements Function1<bz, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i5 f56340p0 = new i5();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f56341q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56342r0 = 1;

    static {
        int i10 = f56342r0;
        int i11 = i10 & 83;
        int i12 = ((i10 ^ 83) | i11) << 1;
        int i13 = -((i10 | 83) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f56341q0 = i14 % 128;
        int i15 = i14 % 2;
    }

    public i5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i10 | i12)) * 216) + (i11 * (-215)) + (i10 * 217);
        int i14 = (~i11) | i10;
        int i15 = ~i12;
        if ((((~(i10 | i15)) | i11) * 216) + ((i14 | i15) * (-216)) + i13 == 1) {
            i5 i5Var = (i5) objArr[0];
            Object obj = objArr[1];
            int i16 = f56342r0;
            int i17 = i16 & 87;
            int i18 = ((i16 | 87) & (~i17)) + (i17 << 1);
            f56341q0 = i18 % 128;
            bz bzVar = (bz) obj;
            if (i18 % 2 == 0) {
                a(new Object[]{i5Var, bzVar}, -500513098, 500513098, System.identityHashCode(i5Var));
                return Unit.INSTANCE;
            }
            a(new Object[]{i5Var, bzVar}, -500513098, 500513098, System.identityHashCode(i5Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        bz bzVar2 = (bz) objArr[1];
        int i19 = (-2) - ((f56341q0 + 116) ^ (-1));
        f56342r0 = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(bzVar2, "");
        bz.setY(new Object[]{bzVar2, (byte) 63}, 881254746, -881254746, System.identityHashCode(bzVar2));
        bz.setY(new Object[]{bzVar2, cb.ALWAYS}, -478987183, 478987185, System.identityHashCode(bzVar2));
        bz.setY(new Object[]{bzVar2, ce.setDividerPadding}, 2141338749, -2141338746, System.identityHashCode(bzVar2));
        int i21 = f56342r0;
        int i22 = i21 & 19;
        int i23 = (i21 | 19) & (~i22);
        int i24 = i22 << 1;
        int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
        f56341q0 = i25 % 128;
        if (i25 % 2 == 0) {
            return null;
        }
        int i26 = 49 / 0;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(bz bzVar) {
        return a(new Object[]{this, bzVar}, 1368063376, -1368063375, System.identityHashCode(this));
    }
}
