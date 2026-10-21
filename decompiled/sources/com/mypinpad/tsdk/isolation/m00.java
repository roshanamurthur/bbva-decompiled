package com.mypinpad.tsdk.isolation;

import android.os.Messenger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/sa;", "p0", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/sa;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class m00 extends Lambda implements Function1<sa, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ IsolatedService f57030p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Messenger f57031q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(IsolatedService isolatedService, Messenger messenger) {
        super(1);
        this.f57030p0 = isolatedService;
        this.f57031q0 = messenger;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = ~((~i10) | (~i11));
        int i14 = ~i12;
        if (((i10 | i11 | i12) * 220) + (((~(i14 | i11)) | i10) * (-440)) + ((i13 | (~(i14 | i10 | i11))) * 220) + (i11 * (-219)) + (i10 * 221) == 1) {
            m00 m00Var = (m00) objArr[0];
            a(new Object[]{m00Var, (sa) objArr[1]}, -398125009, 398125009, System.identityHashCode(m00Var));
            return Unit.INSTANCE;
        }
        m00 m00Var2 = (m00) objArr[0];
        sa saVar = (sa) objArr[1];
        Intrinsics.checkNotNullParameter(saVar, "");
        IsolatedService.setOnFocusChangeListener(new Object[]{m00Var2.f57030p0, m00Var2.f57031q0, new xj(saVar)}, -2024684754, 2024684762, (int) System.currentTimeMillis());
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(sa saVar) {
        return a(new Object[]{this, saVar}, -1757894596, 1757894597, System.identityHashCode(this));
    }
}
