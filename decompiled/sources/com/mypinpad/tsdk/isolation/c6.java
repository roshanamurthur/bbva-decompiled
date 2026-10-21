package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setX", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class c6 extends Lambda implements Function1<dc, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c6 f54775p0 = new c6();

    static {
        int i10 = (1 ^ 81) + ((1 & 81) << 1);
        int i11 = i10 % 128;
        int i12 = i10 % 2;
    }

    public c6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i11 | i12) * 140) + (i11 * (-279)) + (i10 * 141);
        int i14 = (~i10) | i11;
        int i15 = ~i14;
        int i16 = ~i12;
        if ((((~(i10 | i16)) | (~((~i11) | i10)) | (~(i14 | i12))) * 140) + ((i15 | (~(i16 | i11))) * (-280)) + i13 != 1) {
            c6 c6Var = (c6) objArr[0];
            a(new Object[]{c6Var, (dc) objArr[1]}, 45565222, -45565221, System.identityHashCode(c6Var));
            return Unit.INSTANCE;
        }
        dc dcVar = (dc) objArr[1];
        Intrinsics.checkNotNullParameter(dcVar, "");
        dc.setDividerPadding(new Object[]{dcVar, Boolean.TRUE}, 1763882755, -1763882755, System.identityHashCode(dcVar));
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(dc dcVar) {
        return a(new Object[]{this, dcVar}, 1103871889, -1103871889, System.identityHashCode(this));
    }
}
