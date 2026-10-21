package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/FocusInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Focus", "Unfocus", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FocusInteraction extends Interaction {

    /* JADX INFO: compiled from: FocusInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "Landroidx/compose/foundation/interaction/FocusInteraction;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Focus implements FocusInteraction {
        public static final int $stable = 0;
    }

    /* JADX INFO: compiled from: FocusInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/interaction/FocusInteraction$Unfocus;", "Landroidx/compose/foundation/interaction/FocusInteraction;", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "a", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "getFocus", "()Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "focus", "<init>", "(Landroidx/compose/foundation/interaction/FocusInteraction$Focus;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Unfocus implements FocusInteraction {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Focus focus;

        public Unfocus(@NotNull Focus focus) {
            Intrinsics.checkNotNullParameter(focus, "focus");
            this.focus = focus;
        }

        @NotNull
        public final Focus getFocus() {
            return this.focus;
        }
    }
}
