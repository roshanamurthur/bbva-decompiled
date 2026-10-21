package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/z;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/z;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class v4 extends Lambda implements Function1<z, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v4 f61455p0 = new v4();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61456q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61457r0 = 1;

    static {
        int i10 = f61457r0;
        int i11 = ((-1) << 1) - ((-1) ^ ((i10 ^ 44) + ((i10 & 44) << 1)));
        f61456q0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public v4() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~(i10 | i12);
        int i17 = ((i15 | i16) * (-814)) + i13;
        int i18 = ~(i14 | (~i12));
        int i19 = ~i10;
        int i20 = ~(i19 | i11);
        if ((((~(i19 | i12)) | i20 | (~(i11 | i12))) * 407) + ((i18 | i20 | i16) * 407) + i17 == 1) {
            z zVar = (z) objArr[1];
            int i21 = f61457r0;
            int i22 = i21 & 5;
            int i23 = -(-((i21 ^ 5) | i22));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            f61456q0 = i24 % 128;
            int i25 = i24 % 2;
            Intrinsics.checkNotNullParameter(zVar, "");
            z.setY(new Object[]{zVar, Boolean.TRUE}, 1456680272, -1456680263, System.identityHashCode(zVar));
            int i26 = f61457r0 + 19;
            f61456q0 = i26 % 128;
            int i27 = i26 % 2;
            return null;
        }
        v4 v4Var = (v4) objArr[0];
        Object obj = objArr[1];
        int i28 = f61456q0;
        int i29 = (-2) - ((((i28 | 68) << 1) - (i28 ^ 68)) ^ (-1));
        f61457r0 = i29 % 128;
        int i30 = i29 % 2;
        a(new Object[]{v4Var, (z) obj}, 1905626164, -1905626163, System.identityHashCode(v4Var));
        Unit unit = Unit.INSTANCE;
        int i31 = f61456q0;
        int i32 = (i31 | 123) << 1;
        int i33 = -(i31 ^ 123);
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        f61457r0 = i34 % 128;
        int i35 = i34 % 2;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(z zVar) {
        return a(new Object[]{this, zVar}, 1731976712, -1731976712, System.identityHashCode(this));
    }
}
