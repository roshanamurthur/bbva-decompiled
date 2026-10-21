package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.plugin.localstorage.util.ConstantKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PressInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", ConstantKt.BIOMETRIC_NEGATIVE_BUTTON, "Press", "Release", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PressInteraction extends Interaction {

    /* JADX INFO: compiled from: PressInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Cancel;", "Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "a", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getPress", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;", "press", "<init>", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Cancel implements PressInteraction {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Press press;

        public Cancel(@NotNull Press press) {
            Intrinsics.checkNotNullParameter(press, "press");
            this.press = press;
        }

        @NotNull
        public final Press getPress() {
            return this.press;
        }
    }

    /* JADX INFO: compiled from: PressInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/ui/geometry/Offset;", "a", "J", "getPressPosition-F1C5BW0", "()J", "pressPosition", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Press implements PressInteraction {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long pressPosition;

        public Press(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this.pressPosition = j10;
        }

        /* JADX INFO: renamed from: getPressPosition-F1C5BW0, reason: not valid java name and from getter */
        public final long getPressPosition() {
            return this.pressPosition;
        }
    }

    /* JADX INFO: compiled from: PressInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Release;", "Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "a", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getPress", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;", "press", "<init>", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Release implements PressInteraction {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Press press;

        public Release(@NotNull Press press) {
            Intrinsics.checkNotNullParameter(press, "press");
            this.press = press;
        }

        @NotNull
        public final Press getPress() {
            return this.press;
        }
    }
}
