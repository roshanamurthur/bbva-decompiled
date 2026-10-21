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
import androidx.compose.runtime.MutableState;
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

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/CardElevation;", "", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "tonalElevation$material3_release", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "tonalElevation", "shadowElevation$material3_release", "shadowElevation", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,772:1\n25#2:773\n25#2:780\n25#2:787\n50#2:794\n49#2:795\n25#2:802\n1114#3,6:774\n1114#3,6:781\n1114#3,6:788\n1114#3,6:796\n1114#3,6:803\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n*L\n585#1:773\n607#1:780\n617#1:787\n618#1:794\n618#1:795\n670#1:802\n585#1:774,6\n607#1:781,6\n617#1:788,6\n618#1:796,6\n670#1:803,6\n*E\n"})
public final class CardElevation {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9554f;

    /* JADX INFO: compiled from: Card.kt */
    @DebugMetadata(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", i = {}, l = {619}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f9555p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f9556q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Interaction> f9557r0;

        /* JADX INFO: renamed from: androidx.compose.material3.CardElevation$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Card.kt */
        public static final class C0049a implements FlowCollector<Interaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<Interaction> f9558p0;

            public C0049a(SnapshotStateList<Interaction> snapshotStateList) {
                this.f9558p0 = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Interaction interaction, Continuation continuation) {
                Interaction interaction2 = interaction;
                boolean z10 = interaction2 instanceof HoverInteraction.Enter;
                SnapshotStateList<Interaction> snapshotStateList = this.f9558p0;
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
            this.f9556q0 = interactionSource;
            this.f9557r0 = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f9556q0, this.f9557r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f9555p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Interaction> interactions = this.f9556q0.getInteractions();
                C0049a c0049a = new C0049a(this.f9557r0);
                this.f9555p0 = 1;
                if (interactions.collect(c0049a, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Card.kt */
    @DebugMetadata(c = "androidx.compose.material3.CardElevation$animateElevation$2", f = "Card.kt", i = {}, l = {681, 688}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f9559p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f9560q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Dp, AnimationVector1D> f9561r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CardElevation f9562s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f9563t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Interaction f9564u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, Animatable<Dp, AnimationVector1D> animatable, CardElevation cardElevation, float f6, Interaction interaction, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f9560q0 = z10;
            this.f9561r0 = animatable;
            this.f9562s0 = cardElevation;
            this.f9563t0 = f6;
            this.f9564u0 = interaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f9560q0, this.f9561r0, this.f9562s0, this.f9563t0, this.f9564u0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f9559p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z10 = this.f9560q0;
                float f6 = this.f9563t0;
                Animatable<Dp, AnimationVector1D> animatable = this.f9561r0;
                if (z10) {
                    float fM4403unboximpl = animatable.getTargetValue().m4403unboximpl();
                    CardElevation cardElevation = this.f9562s0;
                    Interaction start = null;
                    if (Dp.m4394equalsimpl0(fM4403unboximpl, cardElevation.f9550b)) {
                        start = new PressInteraction.Press(Offset.INSTANCE.m2291getZeroF1C5BW0(), null);
                    } else if (Dp.m4394equalsimpl0(fM4403unboximpl, cardElevation.f9552d)) {
                        start = new HoverInteraction.Enter();
                    } else if (Dp.m4394equalsimpl0(fM4403unboximpl, cardElevation.f9551c)) {
                        start = new FocusInteraction.Focus();
                    } else if (Dp.m4394equalsimpl0(fM4403unboximpl, cardElevation.f9553e)) {
                        start = new DragInteraction.Start();
                    }
                    this.f9559p0 = 1;
                    if (ElevationKt.m1094animateElevationrAjV9yQ(animatable, f6, start, this.f9564u0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Dp dpM4387boximpl = Dp.m4387boximpl(f6);
                    this.f9559p0 = 2;
                    if (animatable.snapTo(dpM4387boximpl, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public CardElevation(float f6, float f10, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this.f9549a = f6;
        this.f9550b = f10;
        this.f9551c = f11;
        this.f9552d = f12;
        this.f9553e = f13;
        this.f9554f = f14;
    }

    @Composable
    public final State<Dp> a(boolean z10, InteractionSource interactionSource, Composer composer, int i10) {
        float f6;
        composer.startReplaceableGroup(-1421890746);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1421890746, i10, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:612)");
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
            f6 = this.f9554f;
        } else if (interaction instanceof PressInteraction.Press) {
            f6 = this.f9550b;
        } else if (interaction instanceof HoverInteraction.Enter) {
            f6 = this.f9552d;
        } else if (interaction instanceof FocusInteraction.Focus) {
            f6 = this.f9551c;
        } else {
            f6 = interaction instanceof DragInteraction.Start ? this.f9553e : this.f9549a;
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
        EffectsKt.LaunchedEffect(Dp.m4387boximpl(f10), new b(z10, animatable, this, f10, interaction, null), composer, 64);
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
        if (other == null || !(other instanceof CardElevation)) {
            return false;
        }
        CardElevation cardElevation = (CardElevation) other;
        return Dp.m4394equalsimpl0(this.f9549a, cardElevation.f9549a) && Dp.m4394equalsimpl0(this.f9550b, cardElevation.f9550b) && Dp.m4394equalsimpl0(this.f9551c, cardElevation.f9551c) && Dp.m4394equalsimpl0(this.f9552d, cardElevation.f9552d) && Dp.m4394equalsimpl0(this.f9554f, cardElevation.f9554f);
    }

    public int hashCode() {
        return Dp.m4395hashCodeimpl(this.f9554f) + androidx.camera.camera2.internal.compat.u.a(this.f9552d, androidx.camera.camera2.internal.compat.u.a(this.f9551c, androidx.camera.camera2.internal.compat.u.a(this.f9550b, Dp.m4395hashCodeimpl(this.f9549a) * 31, 31), 31), 31);
    }

    @Composable
    @NotNull
    public final State<Dp> shadowElevation$material3_release(boolean z10, @Nullable InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1763481333);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763481333, i10, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:601)");
        }
        composer.startReplaceableGroup(-1409180589);
        if (interactionSource != null) {
            composer.endReplaceableGroup();
            State<Dp> stateA = a(z10, interactionSource, composer, (i10 & 896) | (i10 & 14) | (i10 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return stateA;
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Dp.m4387boximpl(this.f9549a), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    @NotNull
    public final State<Dp> tonalElevation$material3_release(boolean z10, @Nullable InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1757792649);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1757792649, i10, -1, "androidx.compose.material3.CardElevation.tonalElevation (Card.kt:579)");
        }
        composer.startReplaceableGroup(603878391);
        if (interactionSource != null) {
            composer.endReplaceableGroup();
            State<Dp> stateA = a(z10, interactionSource, composer, (i10 & 896) | (i10 & 14) | (i10 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return stateA;
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Dp.m4387boximpl(this.f9549a), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
