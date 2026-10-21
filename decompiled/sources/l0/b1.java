package l0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f82438p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f82439q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b1(Function1<? super Integer, Unit> function1, int i10) {
        super(0);
        this.f82438p0 = function1;
        this.f82439q0 = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f82438p0.invoke(Integer.valueOf(this.f82439q0));
        return Unit.INSTANCE;
    }
}
