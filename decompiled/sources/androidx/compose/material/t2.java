package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends Lambda implements Function2<DismissValue, DismissValue, ThresholdConfig> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<DismissDirection, ThresholdConfig> f9029p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t2(Function1<? super DismissDirection, ? extends ThresholdConfig> function1) {
        super(2);
        this.f9029p0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ThresholdConfig invoke(DismissValue dismissValue, DismissValue dismissValue2) {
        DismissValue from = dismissValue;
        DismissValue to = dismissValue2;
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        DismissDirection dismissDirectionAccess$getDismissDirection = SwipeToDismissKt.access$getDismissDirection(from, to);
        Intrinsics.checkNotNull(dismissDirectionAccess$getDismissDirection);
        return this.f9029p0.invoke(dismissDirectionAccess$getDismissDirection);
    }
}
