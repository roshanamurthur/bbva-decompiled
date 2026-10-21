package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/ud;", "p0", "", "setY", "(Lcom/mypinpad/tsdk/i/ud;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class k9 extends Lambda implements Function1<ud, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f56765p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(Function0<Unit> function0) {
        super(1);
        this.f56765p0 = function0;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        if ((((~(i14 | i15)) | i13) * 68) + ((~(i11 | i13 | i15)) * (-68)) + (((~(i10 | i11)) | (~(i13 | i14 | i15)) | (~(i12 | i11))) * (-68)) + (i11 * (-67)) + (i10 * 69) != 1) {
            k9 k9Var = (k9) objArr[0];
            a(new Object[]{k9Var, (ud) objArr[1]}, 347757911, -347757910, System.identityHashCode(k9Var));
            return Unit.INSTANCE;
        }
        k9 k9Var2 = (k9) objArr[0];
        Intrinsics.checkNotNullParameter((ud) objArr[1], "");
        k9Var2.f56765p0.invoke();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ud udVar) {
        return a(new Object[]{this, udVar}, -1796154896, 1796154896, System.identityHashCode(this));
    }
}
