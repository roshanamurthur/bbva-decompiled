package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class r6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r6 f58064p0 = new r6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f58065q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f58066r0 = 1;

    static {
        int i10 = f58065q0 + 91;
        f58066r0 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public r6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        if ((((~(i11 | (~i12))) | (~(i13 | i11))) * Opcodes.ATHROW) + ((i10 | (~(i11 | i12))) * Opcodes.ATHROW) + (i13 * (-191)) + (i11 * 192) + (i10 * (-381)) == 1) {
            cv cvVar = (cv) objArr[1];
            int i14 = f58066r0 + 95;
            f58065q0 = i14 % 128;
            int i15 = i14 % 2;
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar}, -193104396, 193104406, System.identityHashCode(cvVar));
            int i16 = f58065q0;
            int i17 = (i16 & 88) + (i16 | 88);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            f58066r0 = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }
        r6 r6Var = (r6) objArr[0];
        Object obj = objArr[1];
        int i20 = f58066r0;
        int i21 = (i20 ^ 43) + ((i20 & 43) << 1);
        f58065q0 = i21 % 128;
        int i22 = i21 % 2;
        a(new Object[]{r6Var, (cv) obj}, -1642679290, 1642679291, System.identityHashCode(r6Var));
        Unit unit = Unit.INSTANCE;
        int i23 = f58066r0;
        int i24 = i23 & 95;
        int i25 = i24 + ((i23 ^ 95) | i24);
        f58065q0 = i25 % 128;
        if (i25 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 577108299, -577108299, System.identityHashCode(this));
    }
}
