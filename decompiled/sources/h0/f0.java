package h0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material.ElevationKt;
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
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,618:1\n25#2:619\n50#2:626\n49#2:627\n25#2:634\n1097#3,6:620\n1097#3,6:628\n1097#3,6:635\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n*L\n507#1:619\n508#1:626\n508#1:627\n549#1:634\n507#1:620,6\n508#1:628,6\n549#1:635,6\n*E\n"})
public final class f0 implements ButtonElevation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f68745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f68746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f68747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f68748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f68749e;

    /* JADX INFO: compiled from: Button.kt */
    @DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", f = "Button.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f68750p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f68751q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Interaction> f68752r0;

        /* JADX INFO: renamed from: h0.f0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Button.kt */
        public static final class C0286a implements FlowCollector<Interaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<Interaction> f68753p0;

            public C0286a(SnapshotStateList<Interaction> snapshotStateList) {
                this.f68753p0 = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Interaction interaction, Continuation continuation) {
                Interaction interaction2 = interaction;
                boolean z10 = interaction2 instanceof HoverInteraction.Enter;
                SnapshotStateList<Interaction> snapshotStateList = this.f68753p0;
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
            this.f68751q0 = interactionSource;
            this.f68752r0 = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f68751q0, this.f68752r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f68750p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Interaction> interactions = this.f68751q0.getInteractions();
                C0286a c0286a = new C0286a(this.f68752r0);
                this.f68750p0 = 1;
                if (interactions.collect(c0286a, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Button.kt */
    @DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$2", f = "Button.kt", i = {}, l = {554}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f68754p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Dp, AnimationVector1D> f68755q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f68756r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable<Dp, AnimationVector1D> animatable, float f6, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f68755q0 = animatable;
            this.f68756r0 = f6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f68755q0, this.f68756r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f68754p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Dp dpM4387boximpl = Dp.m4387boximpl(this.f68756r0);
                this.f68754p0 = 1;
                if (this.f68755q0.snapTo(dpM4387boximpl, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Button.kt */
    @DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$3", f = "Button.kt", i = {}, l = {564}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f68757p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Dp, AnimationVector1D> f68758q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ f0 f68759r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f68760s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Interaction f68761t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Animatable<Dp, AnimationVector1D> animatable, f0 f0Var, float f6, Interaction interaction, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f68758q0 = animatable;
            this.f68759r0 = f0Var;
            this.f68760s0 = f6;
            this.f68761t0 = interaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f68758q0, this.f68759r0, this.f68760s0, this.f68761t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f68757p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Dp, AnimationVector1D> animatable = this.f68758q0;
                float fM4403unboximpl = animatable.getTargetValue().m4403unboximpl();
                f0 f0Var = this.f68759r0;
                Interaction focus = null;
                if (Dp.m4394equalsimpl0(fM4403unboximpl, f0Var.f68746b)) {
                    focus = new PressInteraction.Press(Offset.INSTANCE.m2291getZeroF1C5BW0(), null);
                } else if (Dp.m4394equalsimpl0(fM4403unboximpl, f0Var.f68748d)) {
                    focus = new HoverInteraction.Enter();
                } else if (Dp.m4394equalsimpl0(fM4403unboximpl, f0Var.f68749e)) {
                    focus = new FocusInteraction.Focus();
                }
                this.f68757p0 = 1;
                if (ElevationKt.m758animateElevationrAjV9yQ(animatable, this.f68760s0, focus, this.f68761t0, this) == coroutine_suspended) {
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

    public f0(float f6, float f10, float f11, float f12, float f13) {
        this.f68745a = f6;
        this.f68746b = f10;
        this.f68747c = f11;
        this.f68748d = f12;
        this.f68749e = f13;
    }

    @Override // androidx.compose.material.ButtonElevation
    @Composable
    @NotNull
    public final State<Dp> elevation(boolean z10, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        float f6;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, -1588756907)) {
            ComposerKt.traceEventStart(-1588756907, i10, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:505)");
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
            f6 = this.f68747c;
        } else if (interaction instanceof PressInteraction.Press) {
            f6 = this.f68746b;
        } else if (interaction instanceof HoverInteraction.Enter) {
            f6 = this.f68748d;
        } else {
            f6 = interaction instanceof FocusInteraction.Focus ? this.f68749e : this.f68745a;
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
            composer.startReplaceableGroup(-1598807146);
            EffectsKt.LaunchedEffect(Dp.m4387boximpl(f10), new c(animatable, this, f10, interaction, null), composer, 64);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1598807317);
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
}
