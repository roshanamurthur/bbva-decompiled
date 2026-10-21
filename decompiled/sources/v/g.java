package v;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function1<Float, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f93924p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f93925q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Ref.FloatRef floatRef, Function1<? super Float, Unit> function1) {
        super(1);
        this.f93924p0 = floatRef;
        this.f93925q0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f6) {
        float fFloatValue = f6.floatValue();
        Ref.FloatRef floatRef = this.f93924p0;
        float f10 = floatRef.element - fFloatValue;
        floatRef.element = f10;
        this.f93925q0.invoke(Float.valueOf(f10));
        return Unit.INSTANCE;
    }
}
