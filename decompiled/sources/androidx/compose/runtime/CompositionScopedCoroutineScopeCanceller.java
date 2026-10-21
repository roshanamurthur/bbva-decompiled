package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import m0.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;", "Landroidx/compose/runtime/RememberObserver;", "", "onRemembered", "onForgotten", "onAbandoned", "Lkotlinx/coroutines/CoroutineScope;", "p0", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@PublishedApi
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineScope coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(@NotNull CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        CoroutineScopeKt.cancel(this.coroutineScope, new m());
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        CoroutineScopeKt.cancel(this.coroutineScope, new m());
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
