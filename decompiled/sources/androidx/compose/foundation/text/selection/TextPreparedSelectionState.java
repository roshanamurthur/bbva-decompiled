package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "", "", "resetCachedX", "", "a", "Ljava/lang/Float;", "getCachedX", "()Ljava/lang/Float;", "setCachedX", "(Ljava/lang/Float;)V", "cachedX", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class TextPreparedSelectionState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Float cachedX;

    @Nullable
    public final Float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = null;
    }

    public final void setCachedX(@Nullable Float f6) {
        this.cachedX = f6;
    }
}
