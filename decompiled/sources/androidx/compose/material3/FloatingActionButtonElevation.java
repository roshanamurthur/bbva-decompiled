package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
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
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B,\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevation;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "shadowElevation$material3_release", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "shadowElevation", "tonalElevation$material3_release", "tonalElevation", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,619:1\n25#2:620\n50#2:627\n49#2:628\n25#2:635\n1114#3,6:621\n1114#3,6:629\n1114#3,6:636\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n*L\n507#1:620\n509#1:627\n509#1:628\n546#1:635\n507#1:621,6\n509#1:629,6\n546#1:636,6\n*E\n"})
public class FloatingActionButtonElevation {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10289d;

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    @DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", i = {}, l = {TypedValues.PositionType.TYPE_POSITION_TYPE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f10290p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f10291q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Interaction> f10292r0;

        /* JADX INFO: renamed from: androidx.compose.material3.FloatingActionButtonElevation$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FloatingActionButton.kt */
        public static final class C0051a implements FlowCollector<Interaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<Interaction> f10293p0;

            public C0051a(SnapshotStateList<Interaction> snapshotStateList) {
                this.f10293p0 = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Interaction interaction, Continuation continuation) {
                Interaction interaction2 = interaction;
                boolean z10 = interaction2 instanceof HoverInteraction.Enter;
                SnapshotStateList<Interaction> snapshotStateList = this.f10293p0;
                if (z10) {
                    snapshotStateList.add(interaction2);
                } else if (interaction2 instanceof HoverInteraction.Exit) {
                    snapshotStateList.remove(((HoverInteraction.Exit) interaction2).getEnter());
                } else if (interaction2 instanceof FocusInteraction.Focus) {
                    snapshotStateList.add(interaction2);
                } else if (interaction2 instanceof FocusInteraction.Unfocus) {
                    snapshotStateList.remove(((FocusInteraction.Unfocus) interaction2).getFocus());
                } else if (interaction2 instanceof PressInteraction.Press) {
                    snapshotStateList.add(interaction2);
                } else if (interaction2 instanceof PressInteraction.Release) {
                    snapshotStateList.remove(((PressInteraction.Release) interaction2).getPress());
                } else if (interaction2 instanceof PressInteraction.Cancel) {
                    snapshotStateList.remove(((PressInteraction.Cancel) interaction2).getPress());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f10291q0 = interactionSource;
            this.f10292r0 = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f10291q0, this.f10292r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f10290p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Interaction> interactions = this.f10291q0.getInteractions();
                C0051a c0051a = new C0051a(this.f10292r0);
                this.f10290p0 = 1;
                if (interactions.collect(c0051a, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    @DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2", f = "FloatingActionButton.kt", i = {}, l = {555}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f10294p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Dp, AnimationVector1D> f10295q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FloatingActionButtonElevation f10296r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f10297s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Interaction f10298t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable<Dp, AnimationVector1D> animatable, FloatingActionButtonElevation floatingActionButtonElevation, float f6, Interaction interaction, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f10295q0 = animatable;
            this.f10296r0 = floatingActionButtonElevation;
            this.f10297s0 = f6;
            this.f10298t0 = interaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f10295q0, this.f10296r0, this.f10297s0, this.f10298t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f10294p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Dp, AnimationVector1D> animatable = this.f10295q0;
                float fM4403unboximpl = animatable.getTargetValue().m4403unboximpl();
                FloatingActionButtonElevation floatingActionButtonElevation = this.f10296r0;
                Interaction focus = null;
                if (Dp.m4394equalsimpl0(fM4403unboximpl, floatingActionButtonElevation.f10287b)) {
                    focus = new PressInteraction.Press(Offset.INSTANCE.m2291getZeroF1C5BW0(), null);
                } else if (Dp.m4394equalsimpl0(fM4403unboximpl, floatingActionButtonElevation.f10289d)) {
                    focus = new HoverInteraction.Enter();
                } else if (Dp.m4394equalsimpl0(fM4403unboximpl, floatingActionButtonElevation.f10288c)) {
                    focus = new FocusInteraction.Focus();
                }
                this.f10294p0 = 1;
                if (ElevationKt.m1094animateElevationrAjV9yQ(animatable, this.f10297s0, focus, this.f10298t0, this) == coroutine_suspended) {
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

    public FloatingActionButtonElevation(float f6, float f10, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this.f10286a = f6;
        this.f10287b = f10;
        this.f10288c = f11;
        this.f10289d = f12;
    }

    @Composable
    public final State<Dp> a(InteractionSource interactionSource, Composer composer, int i10) {
        float f6;
        composer.startReplaceableGroup(-1845106002);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1845106002, i10, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:505)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        int i11 = i10 & 14;
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(interactionSource) | composer.changed(snapshotStateList);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, i11 | 64);
        Interaction interaction = (Interaction) CollectionsKt___CollectionsKt.lastOrNull((List) snapshotStateList);
        if (interaction instanceof PressInteraction.Press) {
            f6 = this.f10287b;
        } else if (interaction instanceof HoverInteraction.Enter) {
            f6 = this.f10289d;
        } else {
            f6 = interaction instanceof FocusInteraction.Focus ? this.f10288c : this.f10286a;
        }
        float f10 = f6;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Animatable(Dp.m4387boximpl(f10), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), null, null, 12, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue3;
        EffectsKt.LaunchedEffect(Dp.m4387boximpl(f10), new b(animatable, this, f10, interaction, null), composer, 64);
        State<Dp> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) other;
        return Dp.m4394equalsimpl0(this.f10286a, floatingActionButtonElevation.f10286a) && Dp.m4394equalsimpl0(this.f10287b, floatingActionButtonElevation.f10287b) && Dp.m4394equalsimpl0(this.f10288c, floatingActionButtonElevation.f10288c) && Dp.m4394equalsimpl0(this.f10289d, floatingActionButtonElevation.f10289d);
    }

    public int hashCode() {
        return Dp.m4395hashCodeimpl(this.f10289d) + androidx.camera.camera2.internal.compat.u.a(this.f10288c, androidx.camera.camera2.internal.compat.u.a(this.f10287b, Dp.m4395hashCodeimpl(this.f10286a) * 31, 31), 31);
    }

    @Composable
    @NotNull
    public final State<Dp> shadowElevation$material3_release(@NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, -424810125)) {
            ComposerKt.traceEventStart(-424810125, i10, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:495)");
        }
        State<Dp> stateA = a(interactionSource, composer, (i10 & 112) | (i10 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateA;
    }

    @Composable
    @NotNull
    public final State<Dp> tonalElevation$material3_release(@NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, -550096911)) {
            ComposerKt.traceEventStart(-550096911, i10, -1, "androidx.compose.material3.FloatingActionButtonElevation.tonalElevation (FloatingActionButton.kt:500)");
        }
        State<Dp> stateA = a(interactionSource, composer, (i10 & 112) | (i10 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateA;
    }
}
