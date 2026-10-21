package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.plugin.localstorage.util.ConstantKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DragInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", ConstantKt.BIOMETRIC_NEGATIVE_BUTTON, "Start", "Stop", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DragInteraction extends Interaction {

    /* JADX INFO: compiled from: DragInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Cancel;", "Landroidx/compose/foundation/interaction/DragInteraction;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "a", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "getStart", "()Landroidx/compose/foundation/interaction/DragInteraction$Start;", EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(Landroidx/compose/foundation/interaction/DragInteraction$Start;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Cancel implements DragInteraction {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Start start;

        public Cancel(@NotNull Start start) {
            Intrinsics.checkNotNullParameter(start, "start");
            this.start = start;
        }

        @NotNull
        public final Start getStart() {
            return this.start;
        }
    }

    /* JADX INFO: compiled from: DragInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Start;", "Landroidx/compose/foundation/interaction/DragInteraction;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Start implements DragInteraction {
        public static final int $stable = 0;
    }

    /* JADX INFO: compiled from: DragInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Stop;", "Landroidx/compose/foundation/interaction/DragInteraction;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "a", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "getStart", "()Landroidx/compose/foundation/interaction/DragInteraction$Start;", EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(Landroidx/compose/foundation/interaction/DragInteraction$Start;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Stop implements DragInteraction {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Start start;

        public Stop(@NotNull Start start) {
            Intrinsics.checkNotNullParameter(start, "start");
            this.start = start;
        }

        @NotNull
        public final Start getStart() {
            return this.start;
        }
    }
}
