package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
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

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/SelectableChipElevation;", "", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "tonalElevation$material3_release", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "tonalElevation", "shadowElevation$material3_release", "shadowElevation", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2104:1\n25#2:2105\n50#2:2112\n49#2:2113\n25#2:2120\n1114#3,6:2106\n1114#3,6:2114\n1114#3,6:2121\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipElevation\n*L\n1655#1:2105\n1656#1:2112\n1656#1:2113\n1707#1:2120\n1655#1:2106,6\n1656#1:2114,6\n1707#1:2121,6\n*E\n"})
public final class SelectableChipElevation {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f11250f;

    /* JADX INFO: compiled from: Chip.kt */
    @DebugMetadata(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$1$1", f = "Chip.kt", i = {}, l = {1657}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f11251p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f11252q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Interaction> f11253r0;

        /* JADX INFO: renamed from: androidx.compose.material3.SelectableChipElevation$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Chip.kt */
        public static final class C0052a implements FlowCollector<Interaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<Interaction> f11254p0;

            public C0052a(SnapshotStateList<Interaction> snapshotStateList) {
                this.f11254p0 = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Interaction interaction, Continuation continuation) {
                Interaction interaction2 = interaction;
                boolean z10 = interaction2 instanceof HoverInteraction.Enter;
                SnapshotStateList<Interaction> snapshotStateList = this.f11254p0;
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
                } else if (interaction2 instanceof DragInteraction.Start) {
                    snapshotStateList.add(interaction2);
                } else if (interaction2 instanceof DragInteraction.Stop) {
                    snapshotStateList.remove(((DragInteraction.Stop) interaction2).getCom.adobe.marketing.mobile.EventDataKeys.Lifecycle.LIFECYCLE_START java.lang.String());
                } else if (interaction2 instanceof DragInteraction.Cancel) {
                    snapshotStateList.remove(((DragInteraction.Cancel) interaction2).getCom.adobe.marketing.mobile.EventDataKeys.Lifecycle.LIFECYCLE_START java.lang.String());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f11252q0 = interactionSource;
            this.f11253r0 = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f11252q0, this.f11253r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f11251p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Interaction> interactions = this.f11252q0.getInteractions();
                C0052a c0052a = new C0052a(this.f11253r0);
                this.f11251p0 = 1;
                if (interactions.collect(c0052a, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Chip.kt */
    @DebugMetadata(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2", f = "Chip.kt", i = {}, l = {1711}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f11255p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Dp, AnimationVector1D> f11256q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f11257r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable<Dp, AnimationVector1D> animatable, float f6, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f11256q0 = animatable;
            this.f11257r0 = f6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f11256q0, this.f11257r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f11255p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Dp dpM4387boximpl = Dp.m4387boximpl(this.f11257r0);
                this.f11255p0 = 1;
                if (this.f11256q0.snapTo(dpM4387boximpl, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Chip.kt */
    @DebugMetadata(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$3", f = "Chip.kt", i = {}, l = {1721}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f11258p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Dp, AnimationVector1D> f11259q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SelectableChipElevation f11260r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f11261s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Interaction f11262t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Animatable<Dp, AnimationVector1D> animatable, SelectableChipElevation selectableChipElevation, float f6, Interaction interaction, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f11259q0 = animatable;
            this.f11260r0 = selectableChipElevation;
            this.f11261s0 = f6;
            this.f11262t0 = interaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f11259q0, this.f11260r0, this.f11261s0, this.f11262t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f11258p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Dp, AnimationVector1D> animatable = this.f11259q0;
                float fM4403unboximpl = animatable.getTargetValue().m4403unboximpl();
                SelectableChipElevation selectableChipElevation = this.f11260r0;
                Interaction start = null;
                if (Dp.m4394equalsimpl0(fM4403unboximpl, selectableChipElevation.f11246b)) {
                    start = new PressInteraction.Press(Offset.INSTANCE.m2291getZeroF1C5BW0(), null);
                } else if (Dp.m4394equalsimpl0(fM4403unboximpl, selectableChipElevation.f11248d)) {
                    start = new HoverInteraction.Enter();
                } else if (Dp.m4394equalsimpl0(fM4403unboximpl, selectableChipElevation.f11247c)) {
                    start = new FocusInteraction.Focus();
                } else if (Dp.m4394equalsimpl0(fM4403unboximpl, selectableChipElevation.f11249e)) {
                    start = new DragInteraction.Start();
                }
                this.f11258p0 = 1;
                if (ElevationKt.m1094animateElevationrAjV9yQ(animatable, this.f11261s0, start, this.f11262t0, this) == coroutine_suspended) {
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

    public SelectableChipElevation(float f6, float f10, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this.f11245a = f6;
        this.f11246b = f10;
        this.f11247c = f11;
        this.f11248d = f12;
        this.f11249e = f13;
        this.f11250f = f14;
    }

    @Composable
    public final State<Dp> a(boolean z10, InteractionSource interactionSource, Composer composer, int i10) {
        float f6;
        composer.startReplaceableGroup(664514136);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(664514136, i10, -1, "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:1650)");
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
        int i11 = (i10 >> 3) & 14;
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
        if (!z10) {
            f6 = this.f11250f;
        } else if (interaction instanceof PressInteraction.Press) {
            f6 = this.f11246b;
        } else if (interaction instanceof HoverInteraction.Enter) {
            f6 = this.f11248d;
        } else if (interaction instanceof FocusInteraction.Focus) {
            f6 = this.f11247c;
        } else {
            f6 = interaction instanceof DragInteraction.Start ? this.f11249e : this.f11245a;
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
        if (z10) {
            composer.startReplaceableGroup(-699481799);
            EffectsKt.LaunchedEffect(Dp.m4387boximpl(f10), new c(animatable, this, f10, interaction, null), composer, 64);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-699481942);
            EffectsKt.LaunchedEffect(Dp.m4387boximpl(f10), new b(animatable, f10, null), composer, 64);
            composer.endReplaceableGroup();
        }
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
        if (other == null || !(other instanceof SelectableChipElevation)) {
            return false;
        }
        SelectableChipElevation selectableChipElevation = (SelectableChipElevation) other;
        return Dp.m4394equalsimpl0(this.f11245a, selectableChipElevation.f11245a) && Dp.m4394equalsimpl0(this.f11246b, selectableChipElevation.f11246b) && Dp.m4394equalsimpl0(this.f11247c, selectableChipElevation.f11247c) && Dp.m4394equalsimpl0(this.f11248d, selectableChipElevation.f11248d) && Dp.m4394equalsimpl0(this.f11250f, selectableChipElevation.f11250f);
    }

    public int hashCode() {
        return Dp.m4395hashCodeimpl(this.f11250f) + androidx.camera.camera2.internal.compat.u.a(this.f11248d, androidx.camera.camera2.internal.compat.u.a(this.f11247c, androidx.camera.camera2.internal.compat.u.a(this.f11246b, Dp.m4395hashCodeimpl(this.f11245a) * 31, 31), 31), 31);
    }

    @Composable
    @NotNull
    public final State<Dp> shadowElevation$material3_release(boolean z10, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, -1888175651)) {
            ComposerKt.traceEventStart(-1888175651, i10, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:1642)");
        }
        State<Dp> stateA = a(z10, interactionSource, composer, (i10 & 896) | (i10 & 14) | (i10 & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateA;
    }

    @Composable
    @NotNull
    public final State<Dp> tonalElevation$material3_release(boolean z10, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, -93383461)) {
            ComposerKt.traceEventStart(-93383461, i10, -1, "androidx.compose.material3.SelectableChipElevation.tonalElevation (Chip.kt:1623)");
        }
        State<Dp> stateA = a(z10, interactionSource, composer, (i10 & 896) | (i10 & 14) | (i10 & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateA;
    }
}
