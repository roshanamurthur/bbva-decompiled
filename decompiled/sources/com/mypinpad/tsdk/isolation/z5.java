package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/bz;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/bz;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class z5 extends Lambda implements Function1<bz, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z5 f62275p0 = new z5();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f62276q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f62277r0 = 1;

    static {
        int i10 = f62276q0;
        int i11 = i10 & 15;
        int i12 = i11 + ((i10 ^ 15) | i11);
        f62277r0 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 75 / 0;
        }
    }

    public z5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        if ((((~((~i10) | i11)) | (~(i11 | i13))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559)) == 1) {
            z5 z5Var = (z5) objArr[0];
            Object obj = objArr[1];
            int i14 = f62276q0;
            int i15 = i14 & 87;
            int i16 = ((i14 | 87) & (~i15)) + (i15 << 1);
            f62277r0 = i16 % 128;
            int i17 = i16 % 2;
            a(new Object[]{z5Var, (bz) obj}, 1793712375, -1793712375, System.identityHashCode(z5Var));
            Unit unit = Unit.INSTANCE;
            int i18 = f62277r0;
            int i19 = ((i18 | 3) << 1) - (i18 ^ 3);
            f62276q0 = i19 % 128;
            if (i19 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        bz bzVar = (bz) objArr[1];
        int i20 = f62276q0;
        int i21 = i20 & 11;
        int i22 = (((i20 ^ 11) | i21) << 1) - ((i20 | 11) & (~i21));
        f62277r0 = i22 % 128;
        if (i22 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bzVar, "");
            bz.setY(new Object[]{bzVar, Byte.valueOf(by.UNRECOGNISED_CVM.setDividerPadding())}, 881254746, -881254746, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, cb.ALWAYS}, -478987183, 478987185, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, ce.setDividerPadding}, 2141338749, -2141338746, System.identityHashCode(bzVar));
            return null;
        }
        Intrinsics.checkNotNullParameter(bzVar, "");
        bz.setY(new Object[]{bzVar, Byte.valueOf(by.UNRECOGNISED_CVM.setDividerPadding())}, 881254746, -881254746, System.identityHashCode(bzVar));
        bz.setY(new Object[]{bzVar, cb.ALWAYS}, -478987183, 478987185, System.identityHashCode(bzVar));
        bz.setY(new Object[]{bzVar, ce.setDividerPadding}, 2141338749, -2141338746, System.identityHashCode(bzVar));
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(bz bzVar) {
        return a(new Object[]{this, bzVar}, -1438665835, 1438665836, System.identityHashCode(this));
    }
}
