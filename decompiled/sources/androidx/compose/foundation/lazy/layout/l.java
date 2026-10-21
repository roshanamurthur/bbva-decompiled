package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Lambda implements Function0<LazyLayoutItemProvider> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<Function0<LazyLayoutItemProvider>> f5101p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(State<? extends Function0<? extends LazyLayoutItemProvider>> state) {
        super(0);
        this.f5101p0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LazyLayoutItemProvider invoke() {
        return this.f5101p0.getValue().invoke();
    }
}
