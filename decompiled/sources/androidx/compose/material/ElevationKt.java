package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Elevation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aG\u0010\t\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/Dp;", "target", "Landroidx/compose/foundation/interaction/Interaction;", "from", TypedValues.TransitionType.S_TO, "", "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateElevation", "material_release"}, k = 2, mv = {1, 8, 0})
public final class ElevationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Dp> f7134a = new TweenSpec<>(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Dp> f7135b = new TweenSpec<>(150, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Dp> f7136c = new TweenSpec<>(120, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    @Nullable
    /* JADX INFO: renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m758animateElevationrAjV9yQ(@NotNull Animatable<Dp, ?> animatable, float f6, @Nullable Interaction interaction, @Nullable Interaction interaction2, @NotNull Continuation<? super Unit> continuation) {
        TweenSpec tweenSpec = null;
        if (interaction2 != null) {
            Intrinsics.checkNotNullParameter(interaction2, "interaction");
            if ((interaction2 instanceof PressInteraction.Press) || (interaction2 instanceof DragInteraction.Start) || (interaction2 instanceof HoverInteraction.Enter) || (interaction2 instanceof FocusInteraction.Focus)) {
                tweenSpec = f7134a;
            }
        } else if (interaction != null) {
            Intrinsics.checkNotNullParameter(interaction, "interaction");
            if ((interaction instanceof PressInteraction.Press) || (interaction instanceof DragInteraction.Start)) {
                tweenSpec = f7135b;
            } else if (interaction instanceof HoverInteraction.Enter) {
                tweenSpec = f7136c;
            } else if (interaction instanceof FocusInteraction.Focus) {
                tweenSpec = f7135b;
            }
        }
        TweenSpec tweenSpec2 = tweenSpec;
        if (tweenSpec2 != null) {
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, Dp.m4387boximpl(f6), tweenSpec2, null, null, continuation, 12, null);
            return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
        }
        Object objSnapTo = animatable.snapTo(Dp.m4387boximpl(f6), continuation);
        return objSnapTo == ek.a.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m759animateElevationrAjV9yQ$default(Animatable animatable, float f6, Interaction interaction, Interaction interaction2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interaction = null;
        }
        if ((i10 & 4) != 0) {
            interaction2 = null;
        }
        return m758animateElevationrAjV9yQ(animatable, f6, interaction, interaction2, continuation);
    }
}
