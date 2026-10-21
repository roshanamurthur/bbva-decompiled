package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HoverInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Enter", "Exit", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HoverInteraction extends Interaction {

    /* JADX INFO: compiled from: HoverInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/compose/foundation/interaction/HoverInteraction;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Enter implements HoverInteraction {
        public static final int $stable = 0;
    }

    /* JADX INFO: compiled from: HoverInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction$Exit;", "Landroidx/compose/foundation/interaction/HoverInteraction;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "a", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "getEnter", "()Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "enter", "<init>", "(Landroidx/compose/foundation/interaction/HoverInteraction$Enter;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Exit implements HoverInteraction {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Enter enter;

        public Exit(@NotNull Enter enter) {
            Intrinsics.checkNotNullParameter(enter, "enter");
            this.enter = enter;
        }

        @NotNull
        public final Enter getEnter() {
            return this.enter;
        }
    }
}
