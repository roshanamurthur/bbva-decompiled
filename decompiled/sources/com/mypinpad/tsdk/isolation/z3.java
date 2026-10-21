package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/dc;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class z3 extends Lambda implements Function1<dc, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z3 f62267p0 = new z3();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f62268q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f62269r0 = 1;

    static {
        int i10 = f62268q0;
        int i11 = ((i10 ^ 63) | (i10 & 63)) << 1;
        int i12 = -(((~i10) & 63) | (i10 & (-64)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f62269r0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public z3() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        if ((((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058 == 1) {
            dc dcVar = (dc) objArr[1];
            int i13 = f62268q0 + 21;
            f62269r0 = i13 % 128;
            if (i13 % 2 == 0) {
                Intrinsics.checkNotNullParameter(dcVar, "");
                dc.setDividerPadding(new Object[]{dcVar, Boolean.FALSE}, 1763882755, -1763882755, System.identityHashCode(dcVar));
            } else {
                Intrinsics.checkNotNullParameter(dcVar, "");
                dc.setDividerPadding(new Object[]{dcVar, Boolean.TRUE}, 1763882755, -1763882755, System.identityHashCode(dcVar));
            }
            int i14 = f62269r0 + 103;
            f62268q0 = i14 % 128;
            if (i14 % 2 == 0) {
                return null;
            }
            throw null;
        }
        z3 z3Var = (z3) objArr[0];
        Object obj = objArr[1];
        int i15 = f62268q0;
        int i16 = i15 & 9;
        int i17 = -(-((i15 ^ 9) | i16));
        int i18 = (i16 & i17) + (i17 | i16);
        f62269r0 = i18 % 128;
        int i19 = i18 % 2;
        a(new Object[]{z3Var, (dc) obj}, -1443774861, 1443774862, System.identityHashCode(z3Var));
        Unit unit = Unit.INSTANCE;
        int i20 = f62269r0;
        int i21 = i20 & 111;
        int i22 = (i20 | 111) & (~i21);
        int i23 = i21 << 1;
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        f62268q0 = i24 % 128;
        int i25 = i24 % 2;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(dc dcVar) {
        return a(new Object[]{this, dcVar}, -1054308693, 1054308693, System.identityHashCode(this));
    }
}
