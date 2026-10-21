package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setX", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class m6 extends Lambda implements Function1<dc, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m6 f57047p0 = new m6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57048q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57049r0 = 1;

    static {
        int i10 = f57048q0;
        int i11 = (i10 & 17) + (i10 | 17);
        f57049r0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public m6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15 | i12);
        int i17 = ~i12;
        int i18 = i15 | i17;
        if ((((~(i10 | i17)) | (~(i15 | i10)) | (~i18)) * 50) + ((i16 | (~(i18 | i10))) * 50) + i13 == 1) {
            m6 m6Var = (m6) objArr[0];
            Object obj = objArr[1];
            int i19 = f57049r0 + 8;
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            f57048q0 = i20 % 128;
            int i21 = i20 % 2;
            a(new Object[]{m6Var, (dc) obj}, 323661272, -323661272, System.identityHashCode(m6Var));
            Unit unit = Unit.INSTANCE;
            int i22 = f57049r0;
            int i23 = (-2) - (((i22 & 28) + (i22 | 28)) ^ (-1));
            f57048q0 = i23 % 128;
            int i24 = i23 % 2;
            return unit;
        }
        dc dcVar = (dc) objArr[1];
        int i25 = f57048q0;
        int i26 = (i25 ^ 69) + ((i25 & 69) << 1);
        f57049r0 = i26 % 128;
        int i27 = i26 % 2;
        Intrinsics.checkNotNullParameter(dcVar, "");
        dc.setDividerPadding(new Object[]{dcVar}, 1266704093, -1266704091, System.identityHashCode(dcVar));
        int i28 = f57049r0;
        int i29 = i28 ^ 35;
        int i30 = -(-((i28 & 35) << 1));
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        f57048q0 = i31 % 128;
        if (i31 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(dc dcVar) {
        return a(new Object[]{this, dcVar}, 448179410, -448179409, System.identityHashCode(this));
    }
}
