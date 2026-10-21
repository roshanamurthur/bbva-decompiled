package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class o8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o8 f57427p0 = new o8();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57428q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57429r0 = 1;

    static {
        int i10 = f57428q0 + 87;
        f57429r0 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 71 / 0;
        }
    }

    public o8() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ((~((~i12) | i13 | i10)) * 130) + (i11 * 131) + (i10 * (-129));
        int i15 = i13 | i10;
        if ((((~((~i10) | i11)) | (~(i15 | i12))) * 130) + ((~i15) * (-260)) + i14 == 1) {
            o8 o8Var = (o8) objArr[0];
            Object obj = objArr[1];
            int i16 = f57428q0;
            int i17 = ((((i16 ^ 53) | (i16 & 53)) << 1) - (~(-(((~i16) & 53) | (i16 & (-54)))))) - 1;
            f57429r0 = i17 % 128;
            int i18 = i17 % 2;
            a(new Object[]{o8Var, (mo) obj}, 1967280411, -1967280411, System.identityHashCode(o8Var));
            Unit unit = Unit.INSTANCE;
            int i19 = f57428q0 + 75;
            f57429r0 = i19 % 128;
            if (i19 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        mo moVar = (mo) objArr[1];
        int i20 = f57428q0;
        int i21 = i20 ^ 31;
        int i22 = ((((i20 & 31) | i21) << 1) - (~(-i21))) - 1;
        f57429r0 = i22 % 128;
        if (i22 % 2 == 0) {
            Intrinsics.checkNotNullParameter(moVar, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(moVar, "");
        int i23 = f57429r0;
        int i24 = ((i23 & 77) - (~(-(-(i23 | 77))))) - 1;
        f57428q0 = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) {
        return a(new Object[]{this, moVar}, -1098930188, 1098930189, System.identityHashCode(this));
    }
}
