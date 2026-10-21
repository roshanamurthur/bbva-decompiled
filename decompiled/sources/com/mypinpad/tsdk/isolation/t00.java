package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.callbacks.UiMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/sa;", "p0", "", "setY", "(Lcom/mypinpad/tsdk/i/sa;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class t00 extends Lambda implements Function1<sa, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ xc f60966p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<UiMessage, Unit> f60967q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t00(xc xcVar, Function1<? super UiMessage, Unit> function1) {
        super(1);
        this.f60966p0 = xcVar;
        this.f60967q0 = function1;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ((i10 | i13) * 983) + (i11 * 984) + (i10 * (-1965));
        int i15 = ~i10;
        int i16 = ~i12;
        if ((((~(i15 | i11)) | (~(i16 | i15))) * 983) + (((~(i13 | i16)) | i15) * (-983)) + i14 != 1) {
            t00 t00Var = (t00) objArr[0];
            a(new Object[]{t00Var, (sa) objArr[1]}, -1481199153, 1481199154, System.identityHashCode(t00Var));
            return Unit.INSTANCE;
        }
        t00 t00Var2 = (t00) objArr[0];
        sa saVar = (sa) objArr[1];
        Intrinsics.checkNotNullParameter(saVar, "");
        vd vdVar = vd.INSTANCE;
        vd.setDividerPadding(new Object[]{new s00(t00Var2.f60966p0, t00Var2.f60967q0, saVar)}, 1115627770, -1115627770, (int) System.currentTimeMillis());
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(sa saVar) {
        return a(new Object[]{this, saVar}, -1282558706, 1282558706, System.identityHashCode(this));
    }
}
