package e;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f68210a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1) {
        super(1);
        this.f68210a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f68210a.invoke((Error) obj);
        return Unit.INSTANCE;
    }
}
