package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class n4 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final n4 f57196p0 = new n4();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57197q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57198r0 = 1;

    static {
        int i10 = f57198r0;
        int i11 = ((i10 | 81) << 1) - (i10 ^ 81);
        f57197q0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public n4() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        if ((((~(i10 | i14 | i11)) | (~(i12 | i13)) | (~((~i10) | i13))) * 988) + ((i10 | i13) * (-988)) + (((~(i13 | i14 | i10)) | (~(i10 | i11 | i12))) * 988) + (i11 * (-987)) + (i10 * 989) != 1) {
            n4 n4Var = (n4) objArr[0];
            Object obj = objArr[1];
            int i15 = f57197q0;
            int i16 = (i15 | 47) << 1;
            int i17 = -(i15 ^ 47);
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            f57198r0 = i18 % 128;
            cv cvVar = (cv) obj;
            if (i18 % 2 == 0) {
                a(new Object[]{n4Var, cvVar}, 625380084, -625380083, System.identityHashCode(n4Var));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{n4Var, cvVar}, 625380084, -625380083, System.identityHashCode(n4Var));
            Unit unit2 = Unit.INSTANCE;
            int i19 = f57197q0 + 117;
            f57198r0 = i19 % 128;
            int i20 = i19 % 2;
            return unit2;
        }
        cv cvVar2 = (cv) objArr[1];
        int i21 = f57198r0;
        int i22 = i21 & 13;
        int i23 = (((i21 | 13) & (~i22)) - (~(-(-(i22 << 1))))) - 1;
        f57197q0 = i23 % 128;
        int i24 = i23 % 2;
        Intrinsics.checkNotNullParameter(cvVar2, "");
        cv.setDividerPadding(new Object[]{cvVar2, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar2));
        int i25 = f57198r0;
        int i26 = i25 ^ 3;
        int i27 = ((i25 & 3) | i26) << 1;
        int i28 = -i26;
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        f57197q0 = i29 % 128;
        if (i29 % 2 == 0) {
            return null;
        }
        int i30 = 35 / 0;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 731946643, -731946643, System.identityHashCode(this));
    }
}
