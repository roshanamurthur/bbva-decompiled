package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.Terminal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setCompoundDrawableTintBlendMode", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class w00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Terminal, rl, Unit> f61592p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w00(Function2<? super Terminal, ? super rl, Unit> function2) {
        super(0);
        this.f61592p0 = function2;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        if (((i10 | (~(i11 | (~i12)))) * 56) + ((~(i10 | i11)) * (-56)) + (((~(i10 | i12)) | i11) * 56) + (i11 * (-55)) + (i10 * (-55)) != 1) {
            ((w00) objArr[0]).f61592p0.invoke(new xf(null, 1, null), null);
            return null;
        }
        w00 w00Var = (w00) objArr[0];
        a(new Object[]{w00Var}, 1550507752, -1550507752, System.identityHashCode(w00Var));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, -801316392, 801316393, System.identityHashCode(this));
    }
}
