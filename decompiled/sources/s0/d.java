package s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Unit> f93120p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Unit> f93121q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        super(1);
        this.f93120p0 = function1;
        this.f93121q0 = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.f93120p0.invoke(obj);
        this.f93121q0.invoke(obj);
        return Unit.INSTANCE;
    }
}
