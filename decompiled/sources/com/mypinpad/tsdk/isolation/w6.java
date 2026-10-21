package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class w6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final w6 f61605p0 = new w6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61606q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61607r0 = 1;

    static {
        int i10 = f61606q0;
        int i11 = ((i10 | 70) << 1) - (i10 ^ 70);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f61607r0 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 80 / 0;
        }
    }

    public w6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
        int i14 = (~i12) | i10;
        if ((((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13 == 1) {
            w6 w6Var = (w6) objArr[0];
            Object obj = objArr[1];
            int i15 = f61606q0 + 36;
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            f61607r0 = i16 % 128;
            cv cvVar = (cv) obj;
            if (i16 % 2 != 0) {
                a(new Object[]{w6Var, cvVar}, -383954464, 383954464, System.identityHashCode(w6Var));
                return Unit.INSTANCE;
            }
            a(new Object[]{w6Var, cvVar}, -383954464, 383954464, System.identityHashCode(w6Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        cv cvVar2 = (cv) objArr[1];
        int i17 = f61607r0;
        int i18 = i17 & 107;
        int i19 = -(-((i17 ^ 107) | i18));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        f61606q0 = i20 % 128;
        if (i20 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cvVar2, "");
            cv.setDividerPadding(new Object[]{cvVar2, Boolean.FALSE}, -2106531481, 2106531485, System.identityHashCode(cvVar2));
            return null;
        }
        Intrinsics.checkNotNullParameter(cvVar2, "");
        cv.setDividerPadding(new Object[]{cvVar2, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar2));
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 277481127, -277481126, System.identityHashCode(this));
    }
}
