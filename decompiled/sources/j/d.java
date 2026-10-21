package j;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f78729p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0<Boolean> f78730q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Ref.BooleanRef booleanRef, Function0<Boolean> function0) {
        super(0);
        this.f78729p0 = booleanRef;
        this.f78730q0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f78729p0.element = this.f78730q0.invoke().booleanValue();
        return Unit.INSTANCE;
    }
}
