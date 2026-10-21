package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/CompositionLocalContext;", "", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "a", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocals$runtime_release", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "compositionLocals", "<init>", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class CompositionLocalContext {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PersistentCompositionLocalMap compositionLocals;

    public CompositionLocalContext(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.compositionLocals = persistentCompositionLocalMap;
    }

    @NotNull
    /* JADX INFO: renamed from: getCompositionLocals$runtime_release, reason: from getter */
    public final PersistentCompositionLocalMap getCompositionLocals() {
        return this.compositionLocals;
    }
}
