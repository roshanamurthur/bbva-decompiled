package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LifecycleEffect.kt */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0007\u001a\u00020\u00062\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0086\bR\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "onPauseOrDisposeEffect", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "onPauseOrDispose", "Landroidx/lifecycle/Lifecycle;", "p0", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "lifecycle-runtime-compose_release"}, k = 1, mv = {1, 8, 0})
public final class LifecycleResumePauseEffectScope implements LifecycleOwner {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lifecycle lifecycle;

    public LifecycleResumePauseEffectScope(@NotNull Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @NotNull
    public final LifecyclePauseOrDisposeEffectResult onPauseOrDispose(@NotNull final Function1<? super LifecycleOwner, Unit> onPauseOrDisposeEffect) {
        return new LifecyclePauseOrDisposeEffectResult() { // from class: androidx.lifecycle.compose.LifecycleResumePauseEffectScope.onPauseOrDispose.1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                onPauseOrDisposeEffect.invoke(this);
            }
        };
    }
}
