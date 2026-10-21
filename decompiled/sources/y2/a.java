package y2;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DropUnlessLifecycle.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f94731p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f94732q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f94733r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function0<Unit> function0) {
        super(0);
        this.f94731p0 = lifecycleOwner;
        this.f94732q0 = state;
        this.f94733r0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f94731p0.getLifecycle().getF21906d().isAtLeast(this.f94732q0)) {
            this.f94733r0.invoke();
        }
        return Unit.INSTANCE;
    }
}
