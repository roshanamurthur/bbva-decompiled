package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/RememberObserverHolder;", "", "Landroidx/compose/runtime/RememberObserver;", "a", "Landroidx/compose/runtime/RememberObserver;", "getWrapped", "()Landroidx/compose/runtime/RememberObserver;", "setWrapped", "(Landroidx/compose/runtime/RememberObserver;)V", "wrapped", "Landroidx/compose/runtime/Anchor;", "b", "Landroidx/compose/runtime/Anchor;", "getAfter", "()Landroidx/compose/runtime/Anchor;", "setAfter", "(Landroidx/compose/runtime/Anchor;)V", "after", "<init>", "(Landroidx/compose/runtime/RememberObserver;Landroidx/compose/runtime/Anchor;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class RememberObserverHolder {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public RememberObserver wrapped;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Anchor after;

    public RememberObserverHolder(@NotNull RememberObserver rememberObserver, @Nullable Anchor anchor) {
        this.wrapped = rememberObserver;
        this.after = anchor;
    }

    @Nullable
    public final Anchor getAfter() {
        return this.after;
    }

    @NotNull
    public final RememberObserver getWrapped() {
        return this.wrapped;
    }

    public final void setAfter(@Nullable Anchor anchor) {
        this.after = anchor;
    }

    public final void setWrapped(@NotNull RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
