package androidx.compose.material.ripple;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JI\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/Indication;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationInstance;", "rememberUpdatedInstance", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/IndicationInstance;", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance", "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "<init>", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,355:1\n76#2:356\n646#3:357\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n*L\n117#1:356\n119#1:357\n*E\n"})
public abstract class Ripple implements Indication {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final State<Color> f8946c;

    /* JADX INFO: compiled from: Ripple.kt */
    @DebugMetadata(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f8947p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f8948q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f8949r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ RippleIndicationInstance f8950s0;

        /* JADX INFO: renamed from: androidx.compose.material.ripple.Ripple$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Ripple.kt */
        public static final class C0047a implements FlowCollector<Interaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ RippleIndicationInstance f8951p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f8952q0;

            public C0047a(RippleIndicationInstance rippleIndicationInstance, CoroutineScope coroutineScope) {
                this.f8951p0 = rippleIndicationInstance;
                this.f8952q0 = coroutineScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Interaction interaction, Continuation continuation) {
                Interaction interaction2 = interaction;
                boolean z10 = interaction2 instanceof PressInteraction.Press;
                CoroutineScope coroutineScope = this.f8952q0;
                RippleIndicationInstance rippleIndicationInstance = this.f8951p0;
                if (z10) {
                    rippleIndicationInstance.addRipple((PressInteraction.Press) interaction2, coroutineScope);
                } else if (interaction2 instanceof PressInteraction.Release) {
                    rippleIndicationInstance.removeRipple(((PressInteraction.Release) interaction2).getPress());
                } else if (interaction2 instanceof PressInteraction.Cancel) {
                    rippleIndicationInstance.removeRipple(((PressInteraction.Cancel) interaction2).getPress());
                } else {
                    rippleIndicationInstance.updateStateLayer$material_ripple_release(interaction2, coroutineScope);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8949r0 = interactionSource;
            this.f8950s0 = rippleIndicationInstance;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f8949r0, this.f8950s0, continuation);
            aVar.f8948q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f8947p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f8948q0;
                Flow<Interaction> interactions = this.f8949r0.getInteractions();
                C0047a c0047a = new C0047a(this.f8950s0, coroutineScope);
                this.f8947p0 = 1;
                if (interactions.collect(c0047a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public Ripple() {
        throw null;
    }

    public Ripple(boolean z10, float f6, State color, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f8944a = z10;
        this.f8945b = f6;
        this.f8946c = color;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) other;
        return this.f8944a == ripple.f8944a && Dp.m4394equalsimpl0(this.f8945b, ripple.f8945b) && Intrinsics.areEqual(this.f8946c, ripple.f8946c);
    }

    public int hashCode() {
        return this.f8946c.hashCode() + u.a(this.f8945b, (this.f8944a ? 1231 : 1237) * 31, 31);
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    @NotNull
    public final IndicationInstance rememberUpdatedInstance(@NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 988743187)) {
            ComposerKt.traceEventStart(988743187, i10, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:113)");
        }
        RippleTheme rippleTheme = (RippleTheme) composer.consume(RippleThemeKt.getLocalRippleTheme());
        composer.startReplaceableGroup(-1524341038);
        State<Color> state = this.f8946c;
        long jM2518unboximpl = state.getValue().m2518unboximpl() != Color.INSTANCE.m2544getUnspecified0d7_KjU() ? state.getValue().m2518unboximpl() : rippleTheme.mo901defaultColorWaAFU9c(composer, 0);
        composer.endReplaceableGroup();
        RippleIndicationInstance rippleIndicationInstanceMo893rememberUpdatedRippleInstance942rkJo = mo893rememberUpdatedRippleInstance942rkJo(interactionSource, this.f8944a, this.f8945b, SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(jM2518unboximpl), composer, 0), SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0), composer, (i10 & 14) | ((i10 << 12) & 458752));
        EffectsKt.LaunchedEffect(rippleIndicationInstanceMo893rememberUpdatedRippleInstance942rkJo, interactionSource, new a(interactionSource, rippleIndicationInstanceMo893rememberUpdatedRippleInstance942rkJo, null), composer, ((i10 << 3) & 112) | 520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rippleIndicationInstanceMo893rememberUpdatedRippleInstance942rkJo;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo893rememberUpdatedRippleInstance942rkJo(@NotNull InteractionSource interactionSource, boolean z10, float f6, @NotNull State<Color> state, @NotNull State<RippleAlpha> state2, @Nullable Composer composer, int i10);
}
