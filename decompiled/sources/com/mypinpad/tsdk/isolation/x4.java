package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/z;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/z;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class x4 extends Lambda implements Function1<z, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x4 f61740p0 = new x4();

    static {
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~iCurrentTimeMillis;
        int i11 = ~((-1752743152) | i10);
        int i12 = (i11 & 676331558) | (676331558 ^ i11);
        int i13 = 2105458415 & iCurrentTimeMillis;
        int i14 = (~i13) & (2105458415 | iCurrentTimeMillis);
        int i15 = ~((i13 & i14) | (i14 ^ i13));
        int i16 = i12 & i15;
        int i17 = -(-((((i12 | i15) & (~i16)) | i16) * (-252)));
        int i18 = (((-581773375) ^ i17) | ((-581773375) & i17)) << 1;
        int i19 = -((i17 & 581773374) | ((-581773375) & (~i17)));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        int i21 = ((i20 & 2000424124) - (~(-(-(2000424124 | i20))))) - 1;
        int i22 = ((~i10) & (-1752743152)) | (1752743151 & i10);
        int i23 = i10 & (-1752743152);
        int i24 = (i23 & i22) | (i22 ^ i23);
        int i25 = ((-1029046823) & i24) | ((~i24) & 1029046822);
        int i26 = i24 & 1029046822;
        int i27 = ~((i26 & i25) | (i25 ^ i26));
        int i28 = ~((iCurrentTimeMillis & 2105458415) | (2105458415 ^ iCurrentTimeMillis));
        int i29 = i27 & i28;
        int i30 = -(-((((i28 | i27) & (~i29)) | i29) * 252));
        int i31 = i21 & i30;
        int i32 = (((i30 | i21) & (~i31)) - (~(-(-(i31 << 1))))) - 1;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i33 = iCurrentTimeMillis2 ^ (-2143256128);
        int i34 = (-2143256128) & iCurrentTimeMillis2;
        int i35 = (i34 & i33) | (i33 ^ i34);
        int i36 = i35 ^ 1217530400;
        int i37 = i35 & 1217530400;
        int i38 = ((i37 & i36) | (i36 ^ i37)) * 376;
        int i39 = ((1869530647 & i38) - (~(i38 | 1869530647))) - 1;
        int i40 = ~iCurrentTimeMillis2;
        int i41 = i40 & (-1589017135);
        int i42 = ~(((i40 | (-1589017135)) & (~i41)) | i41);
        int i43 = ((-1217530401) & i42) | ((~i42) & 1217530400);
        int i44 = i42 & 1217530400;
        int i45 = -(-(((i44 & i43) | (i43 ^ i44)) * (-376)));
        int i46 = (i39 ^ i45) + ((i45 & i39) << 1);
        int i47 = 1589017134 ^ iCurrentTimeMillis2;
        int i48 = iCurrentTimeMillis2 & 1589017134;
        int i49 = ~((i48 & i47) | (i47 ^ i48));
        int i50 = ((~i49) & (-1771769394)) | (1771769393 & i49);
        int i51 = i49 & (-1771769394);
        int i52 = i46 - (~(-(-(((i51 & i50) | (i50 ^ i51)) * 376))));
        if (i32 > (i52 ^ (-1)) + (i52 << 1)) {
            throw null;
        }
    }

    public x4() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11) {
        int i12 = (i11 * 702) + (i10 * (-700));
        int i13 = ~i10;
        int i14 = ~i11;
        if ((i14 * 701) + ((i13 | i11) * (-701)) + ((~(i13 | i14)) * 701) + i12 != 1) {
            z zVar = (z) objArr[1];
            Intrinsics.checkNotNullParameter(zVar, "");
            z.setY(new Object[]{zVar, Boolean.TRUE}, 1802544043, -1802544040, System.identityHashCode(zVar));
            return null;
        }
        x4 x4Var = (x4) objArr[0];
        Object[] objArr2 = {x4Var, (z) objArr[1]};
        System.identityHashCode(x4Var);
        a(objArr2, -687606348, 687606348);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(z zVar) {
        Object[] objArr = {this, zVar};
        System.identityHashCode(this);
        return a(objArr, 1375250540, -1375250539);
    }
}
