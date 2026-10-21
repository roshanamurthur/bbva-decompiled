package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0017R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "", ConstantsKt.TRANSITION_EXTRA_ID, "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getTransition$annotations", "()V", "getTransition", "()Landroidx/compose/animation/core/Transition;", "animateEnterExit", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", HearingDisabilitiesConstants.EXIT_VIDEO_CALL, "Landroidx/compose/animation/ExitTransition;", "label", "", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,863:1\n135#2:864\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n666#1:864\n*E\n"})
public interface AnimatedVisibilityScope {

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedVisibilityScope$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public final /* synthetic */ class CC {

        /* JADX INFO: renamed from: androidx.compose.animation.AnimatedVisibilityScope$-CC$a */
        /* JADX INFO: compiled from: AnimatedVisibility.kt */
        public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AnimatedVisibilityScope f2688p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ EnterTransition f2689q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ ExitTransition f2690r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ String f2691s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
                super(3);
                this.f2688p0 = animatedVisibilityScope;
                this.f2689q0 = enterTransition;
                this.f2690r0 = exitTransition;
                this.f2691s0 = str;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                Modifier modifier2 = modifier;
                Composer composer2 = composer;
                int iA = ci.a.a(num, modifier2, "$this$composed", composer2, 1840112047);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1840112047, iA, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:671)");
                }
                Modifier modifierThen = modifier2.then(EnterExitTransitionKt.createModifier(this.f2688p0.getTransition(), this.f2689q0, this.f2690r0, this.f2691s0, composer2, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                return modifierThen;
            }
        }

        @ExperimentalAnimationApi
        @NotNull
        public static Modifier a(AnimatedVisibilityScope animatedVisibilityScope, @NotNull Modifier modifier, @NotNull final EnterTransition enter, @NotNull final ExitTransition exit, @NotNull final String label) {
            Intrinsics.checkNotNullParameter(modifier, "<this>");
            Intrinsics.checkNotNullParameter(enter, "enter");
            Intrinsics.checkNotNullParameter(exit, "exit");
            Intrinsics.checkNotNullParameter(label, "label");
            return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                    androidx.activity.a.c(inspectorInfo, "$this$null", "animateEnterExit").set("enter", enter);
                    inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set(HearingDisabilitiesConstants.EXIT_VIDEO_CALL, exit);
                    inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("label", label);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return Unit.INSTANCE;
                }
            } : InspectableValueKt.getNoInspectorInfo(), new a(animatedVisibilityScope, enter, exit, label));
        }

        public static /* synthetic */ Modifier c(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
            }
            if ((i10 & 1) != 0) {
                enterTransition = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            }
            if ((i10 & 2) != 0) {
                exitTransition = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
            }
            if ((i10 & 4) != 0) {
                str = "animateEnterExit";
            }
            return animatedVisibilityScope.animateEnterExit(modifier, enterTransition, exitTransition, str);
        }
    }

    @ExperimentalAnimationApi
    @NotNull
    Modifier animateEnterExit(@NotNull Modifier modifier, @NotNull EnterTransition enterTransition, @NotNull ExitTransition exitTransition, @NotNull String str);

    @ExperimentalAnimationApi
    @NotNull
    Transition<EnterExitState> getTransition();

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ExperimentalAnimationApi
        @Deprecated
        @NotNull
        public static Modifier animateEnterExit(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @NotNull Modifier receiver, @NotNull EnterTransition enter, @NotNull ExitTransition exit, @NotNull String label) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(enter, "enter");
            Intrinsics.checkNotNullParameter(exit, "exit");
            Intrinsics.checkNotNullParameter(label, "label");
            return CC.a(animatedVisibilityScope, receiver, enter, exit, label);
        }

        @ExperimentalAnimationApi
        public static /* synthetic */ void getTransition$annotations() {
        }
    }
}
