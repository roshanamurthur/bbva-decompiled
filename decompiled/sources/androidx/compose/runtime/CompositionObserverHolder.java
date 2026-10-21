package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeRuntimeApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/CompositionObserverHolder;", "", "Landroidx/compose/runtime/tooling/CompositionObserver;", "a", "Landroidx/compose/runtime/tooling/CompositionObserver;", "getObserver", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "setObserver", "(Landroidx/compose/runtime/tooling/CompositionObserver;)V", "observer", "", "b", "Z", "getRoot", "()Z", "setRoot", "(Z)V", "root", "<init>", "(Landroidx/compose/runtime/tooling/CompositionObserver;Z)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class CompositionObserverHolder {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CompositionObserver observer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean root;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionObserverHolder() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final CompositionObserver getObserver() {
        return this.observer;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final void setObserver(@Nullable CompositionObserver compositionObserver) {
        this.observer = compositionObserver;
    }

    public final void setRoot(boolean z10) {
        this.root = z10;
    }

    public CompositionObserverHolder(@Nullable CompositionObserver compositionObserver, boolean z10) {
        this.observer = compositionObserver;
        this.root = z10;
    }

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : compositionObserver, (i10 & 2) != 0 ? false : z10);
    }
}
