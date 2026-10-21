package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8 X \u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0001\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/ExitTransition;", "", HearingDisabilitiesConstants.EXIT_VIDEO_CALL, "plus", "other", "", "equals", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/animation/TransitionData;", "getData$animation_release", "()Landroidx/compose/animation/TransitionData;", "data", "<init>", "()V", "Companion", "Lr/f;", "animation_release"}, k = 1, mv = {1, 8, 0})
public abstract class ExitTransition {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r.f f2771a = new r.f(new TransitionData(null, null, null, null, 15, null));

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/ExitTransition$Companion;", "", "()V", "None", "Landroidx/compose/animation/ExitTransition;", "getNone", "()Landroidx/compose/animation/ExitTransition;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExitTransition getNone() {
            return ExitTransition.f2771a;
        }
    }

    public /* synthetic */ ExitTransition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof ExitTransition) && Intrinsics.areEqual(((ExitTransition) other).getData$animation_release(), getData$animation_release());
    }

    @NotNull
    public abstract TransitionData getData$animation_release();

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    @Stable
    @NotNull
    public final ExitTransition plus(@NotNull ExitTransition exit) {
        Intrinsics.checkNotNullParameter(exit, "exit");
        Fade fade = getData$animation_release().getFade();
        if (fade == null) {
            fade = exit.getData$animation_release().getFade();
        }
        Slide slide = getData$animation_release().getSlide();
        if (slide == null) {
            slide = exit.getData$animation_release().getSlide();
        }
        ChangeSize changeSize = getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = exit.getData$animation_release().getChangeSize();
        }
        Scale scale = getData$animation_release().getScale();
        if (scale == null) {
            scale = exit.getData$animation_release().getScale();
        }
        return new r.f(new TransitionData(fade, slide, changeSize, scale));
    }

    @NotNull
    public String toString() {
        if (Intrinsics.areEqual(this, f2771a)) {
            return "ExitTransition.None";
        }
        TransitionData data$animation_release = getData$animation_release();
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        Fade fade = data$animation_release.getFade();
        sb2.append(fade != null ? fade.toString() : null);
        sb2.append(",\nSlide - ");
        Slide slide = data$animation_release.getSlide();
        sb2.append(slide != null ? slide.toString() : null);
        sb2.append(",\nShrink - ");
        ChangeSize changeSize = data$animation_release.getChangeSize();
        sb2.append(changeSize != null ? changeSize.toString() : null);
        sb2.append(",\nScale - ");
        Scale scale = data$animation_release.getScale();
        sb2.append(scale != null ? scale.toString() : null);
        return sb2.toString();
    }

    public ExitTransition() {
    }
}
