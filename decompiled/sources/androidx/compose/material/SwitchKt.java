package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u001d\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0016\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u001d\u0010\u0019\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!²\u0006\u000e\u0010\u001a\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u001a\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u001d8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u001d8\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SwitchColors;", "colors", "Switch", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getTrackWidth", "()F", "TrackWidth", "b", "getTrackStrokeWidth", "TrackStrokeWidth", "c", "getThumbDiameter", "ThumbDiameter", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "Landroidx/compose/ui/graphics/Color;", "trackColor", "thumbColor", "resolvedThumbColor", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,421:1\n25#2:422\n25#2:431\n36#2:439\n67#2,3:446\n66#2:449\n83#2,3:456\n50#2:465\n49#2:466\n456#2,8:491\n464#2,3:505\n36#2:509\n467#2,3:516\n25#2:521\n50#2:528\n49#2:529\n36#2:536\n36#2:546\n1097#3,6:423\n1097#3,6:432\n1097#3,6:440\n1097#3,6:450\n1097#3,6:459\n1097#3,6:467\n1097#3,6:510\n1097#3,6:522\n1097#3,6:530\n1097#3,6:537\n1097#3,6:547\n76#4:429\n76#4:438\n76#4:473\n76#4:543\n76#4:544\n1#5:430\n66#6,6:474\n72#6:508\n76#6:520\n78#7,11:480\n91#7:519\n4144#8,6:499\n51#9:545\n58#9:566\n81#10:553\n107#10,2:554\n81#10:556\n81#10:557\n81#10:558\n81#10:559\n81#10:560\n154#11:561\n154#11:562\n154#11:563\n154#11:564\n154#11:565\n154#11:567\n154#11:568\n154#11:569\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n*L\n100#1:422\n109#1:431\n111#1:439\n121#1:446,3\n121#1:449\n124#1:456,3\n133#1:465\n133#1:466\n153#1:491,8\n153#1:505,3\n178#1:509\n153#1:516,3\n220#1:521\n222#1:528\n222#1:529\n245#1:536\n261#1:546\n100#1:423,6\n109#1:432,6\n111#1:440,6\n121#1:450,6\n124#1:459,6\n133#1:467,6\n178#1:510,6\n220#1:522,6\n222#1:530,6\n245#1:537,6\n261#1:547,6\n104#1:429\n110#1:438\n138#1:473\n249#1:543\n250#1:544\n153#1:474,6\n153#1:508\n153#1:520\n153#1:480,11\n153#1:519\n153#1:499,6\n250#1:545\n292#1:566\n109#1:553\n109#1:554,2\n119#1:556\n120#1:557\n241#1:558\n248#1:559\n251#1:560\n283#1:561\n284#1:562\n285#1:563\n287#1:564\n289#1:565\n296#1:567\n297#1:568\n420#1:569\n*E\n"})
public final class SwitchKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f7972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f7973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f7974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f7975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f7976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f7977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Float> f7978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f7979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f7980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f7981l;

    /* JADX INFO: compiled from: Switch.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<Boolean> f7982p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f7983q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AnchoredDraggableState anchoredDraggableState, float f6) {
            super(0);
            this.f7982p0 = anchoredDraggableState;
            this.f7983q0 = f6;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AnchoredDraggableState.updateAnchors$material_release$default(this.f7982p0, bk.q.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(0.0f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(this.f7983q0))), null, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    @DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$3$1", f = "Switch.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f7984p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<Boolean> f7985q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f7986r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Boolean, Unit>> f7987s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f7988t0;

        /* JADX INFO: compiled from: Switch.kt */
        public static final class a extends Lambda implements Function0<Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<Boolean> f7989p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AnchoredDraggableState<Boolean> anchoredDraggableState) {
                super(0);
                this.f7989p0 = anchoredDraggableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return this.f7989p0.getCurrentValue();
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material.SwitchKt$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Switch.kt */
        @DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$3$1$2", f = "Switch.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0046b extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ boolean f7990p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ State<Boolean> f7991q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ State<Function1<Boolean, Unit>> f7992r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f7993s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0046b(State<Boolean> state, State<? extends Function1<? super Boolean, Unit>> state2, MutableState<Boolean> mutableState, Continuation<? super C0046b> continuation) {
                super(2, continuation);
                this.f7991q0 = state;
                this.f7992r0 = state2;
                this.f7993s0 = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0046b c0046b = new C0046b(this.f7991q0, this.f7992r0, this.f7993s0, continuation);
                c0046b.f7990p0 = ((Boolean) obj).booleanValue();
                return c0046b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return ((C0046b) create(Boolean.valueOf(bool.booleanValue()), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                boolean z10 = this.f7990p0;
                if (SwitchKt.access$Switch$lambda$8(this.f7991q0) != z10) {
                    Function1 function1Access$Switch$lambda$7 = SwitchKt.access$Switch$lambda$7(this.f7992r0);
                    if (function1Access$Switch$lambda$7 != null) {
                        function1Access$Switch$lambda$7.invoke(Boxing.boxBoolean(z10));
                    }
                    MutableState<Boolean> mutableState = this.f7993s0;
                    SwitchKt.access$Switch$lambda$4(mutableState, !SwitchKt.access$Switch$lambda$3(mutableState));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(AnchoredDraggableState<Boolean> anchoredDraggableState, State<Boolean> state, State<? extends Function1<? super Boolean, Unit>> state2, MutableState<Boolean> mutableState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f7985q0 = anchoredDraggableState;
            this.f7986r0 = state;
            this.f7987s0 = state2;
            this.f7988t0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f7985q0, this.f7986r0, this.f7987s0, this.f7988t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f7984p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new a(this.f7985q0));
                C0046b c0046b = new C0046b(this.f7986r0, this.f7987s0, this.f7988t0, null);
                this.f7984p0 = 1;
                if (FlowKt.collectLatest(flowSnapshotFlow, c0046b, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Switch.kt */
    @DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$4$1", f = "Switch.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f7994p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f7995q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<Boolean> f7996r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, AnchoredDraggableState<Boolean> anchoredDraggableState, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f7995q0 = z10;
            this.f7996r0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f7995q0, this.f7996r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f7994p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean zBooleanValue = this.f7996r0.getCurrentValue().booleanValue();
                boolean z10 = this.f7995q0;
                if (z10 != zBooleanValue) {
                    AnchoredDraggableState<Boolean> anchoredDraggableState = this.f7996r0;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(z10);
                    this.f7994p0 = 1;
                    if (AnchoredDraggableKt.animateTo$default(anchoredDraggableState, boolBoxBoolean, 0.0f, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: compiled from: Switch.kt */
    public static final class d extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<Boolean> f7997p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AnchoredDraggableState<Boolean> anchoredDraggableState) {
            super(0);
            this.f7997p0 = anchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f7997p0.requireOffset());
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f7998p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f7999q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f8000r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f8001s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f8002t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ SwitchColors f8003u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f8004w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z11, MutableInteractionSource mutableInteractionSource, SwitchColors switchColors, int i10, int i11) {
            super(2);
            this.f7998p0 = z10;
            this.f7999q0 = function1;
            this.f8000r0 = modifier;
            this.f8001s0 = z11;
            this.f8002t0 = mutableInteractionSource;
            this.f8003u0 = switchColors;
            this.v0 = i10;
            this.f8004w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SwitchKt.Switch(this.f7998p0, this.f7999q0, this.f8000r0, this.f8001s0, this.f8002t0, this.f8003u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f8004w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    public static final class f extends Lambda implements Function1<Float, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f8005p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            return Float.valueOf(f6.floatValue() * 0.7f);
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    public static final class g extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f8006p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f6) {
            super(0);
            this.f8006p0 = f6;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f8006p0);
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    @DebugMetadata(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f8007p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f8008q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Interaction> f8009r0;

        /* JADX INFO: compiled from: Switch.kt */
        public static final class a implements FlowCollector<Interaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<Interaction> f8010p0;

            public a(SnapshotStateList<Interaction> snapshotStateList) {
                this.f8010p0 = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Interaction interaction, Continuation continuation) {
                Interaction interaction2 = interaction;
                boolean z10 = interaction2 instanceof PressInteraction.Press;
                SnapshotStateList<Interaction> snapshotStateList = this.f8010p0;
                if (z10) {
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
        public h(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f8008q0 = interactionSource;
            this.f8009r0 = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.f8008q0, this.f8009r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f8007p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Interaction> interactions = this.f8008q0.getInteractions();
                a aVar = new a(this.f8009r0);
                this.f8007p0 = 1;
                if (interactions.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Switch.kt */
    public static final class i extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f8011p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(State<Color> state) {
            super(1);
            this.f8011p0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            SwitchKt.m844access$drawTrackRPmYEkk(Canvas, SwitchKt.access$SwitchImpl$lambda$16(this.f8011p0), Canvas.mo415toPx0680j_4(SwitchKt.getTrackWidth()), Canvas.mo415toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    public static final class j extends Lambda implements Function1<Density, IntOffset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f8012p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0<Float> function0) {
            super(1);
            this.f8012p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(Density density) {
            Density offset = density;
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(mk.c.roundToInt(this.f8012p0.invoke().floatValue()), 0));
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f8013p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f8014q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f8015r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SwitchColors f8016s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f8017t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f8018u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(BoxScope boxScope, boolean z10, boolean z11, SwitchColors switchColors, Function0<Float> function0, InteractionSource interactionSource, int i10) {
            super(2);
            this.f8013p0 = boxScope;
            this.f8014q0 = z10;
            this.f8015r0 = z11;
            this.f8016s0 = switchColors;
            this.f8017t0 = function0;
            this.f8018u0 = interactionSource;
            this.v0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SwitchKt.a(this.f8013p0, this.f8014q0, this.f8015r0, this.f8016s0, this.f8017t0, this.f8018u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1));
            return Unit.INSTANCE;
        }
    }

    static {
        float fM4389constructorimpl = Dp.m4389constructorimpl(34);
        f7970a = fM4389constructorimpl;
        f7971b = Dp.m4389constructorimpl(14);
        float fM4389constructorimpl2 = Dp.m4389constructorimpl(20);
        f7972c = fM4389constructorimpl2;
        f7973d = Dp.m4389constructorimpl(24);
        f7974e = Dp.m4389constructorimpl(2);
        f7975f = fM4389constructorimpl;
        f7976g = fM4389constructorimpl2;
        f7977h = Dp.m4389constructorimpl(fM4389constructorimpl - fM4389constructorimpl2);
        f7978i = new TweenSpec<>(100, 0, null, 6, null);
        f7979j = Dp.m4389constructorimpl(1);
        f7980k = Dp.m4389constructorimpl(6);
        f7981l = Dp.m4389constructorimpl(125);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0160  */
    /* JADX WARN: Code duplicated, block: B:103:0x0186  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:111:0x021b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0221  */
    /* JADX WARN: Code duplicated, block: B:116:0x024b A[LOOP:0: B:115:0x0249->B:116:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x025d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0265  */
    /* JADX WARN: Code duplicated, block: B:124:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:135:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:136:0x0302  */
    /* JADX WARN: Code duplicated, block: B:139:0x0310 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x0315  */
    /* JADX WARN: Code duplicated, block: B:144:0x0361  */
    /* JADX WARN: Code duplicated, block: B:147:0x036d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0371  */
    /* JADX WARN: Code duplicated, block: B:151:0x0382  */
    /* JADX WARN: Code duplicated, block: B:153:0x0390  */
    /* JADX WARN: Code duplicated, block: B:156:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:161:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:166:0x0407  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    /* JADX WARN: Code duplicated, block: B:97:0x014e  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Switch(boolean z10, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z11, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable SwitchColors switchColors, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        SwitchColors switchColors2;
        Modifier modifier3;
        boolean z13;
        MutableInteractionSource mutableInteractionSource3;
        int i17;
        Modifier modifier4;
        boolean z14;
        MutableInteractionSource mutableInteractionSource4;
        SwitchColors switchColorsM843colorsSQMK_m0;
        Object objRememberedValue;
        float fMo415toPx0680j_4;
        Object objRememberedValue2;
        Composer.Companion companion;
        MutableState mutableState;
        float fMo415toPx0680j_5;
        boolean zChanged;
        Object objRememberedValue3;
        AnchoredDraggableState anchoredDraggableState;
        State stateRememberUpdatedState;
        State stateRememberUpdatedState2;
        boolean zChanged2;
        Object objRememberedValue4;
        int i18;
        Object[] objArr;
        int i19;
        boolean zChanged3;
        Object objRememberedValue5;
        boolean zChanged4;
        Object objRememberedValue6;
        boolean z15;
        Modifier modifierM462toggleableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        boolean z16;
        Composer composer2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        boolean zChanged5;
        Object objRememberedValue7;
        MutableInteractionSource mutableInteractionSource5;
        SwitchColors switchColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(25866825);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i20 = i11 & 4;
        if (i20 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z11;
                    if (composerStartRestartGroup.changed(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 458752) == 0) {
                        if ((i11 & 32) == 0) {
                            switchColors2 = switchColors;
                            int i21 = composerStartRestartGroup.changed(switchColors2) ? 131072 : 65536;
                            i12 |= i21;
                        } else {
                            switchColors2 = switchColors;
                        }
                        i12 |= i21;
                    } else {
                        switchColors2 = switchColors;
                    }
                    if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 32) != 0) {
                                modifier4 = modifier3;
                                z14 = z13;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                                i17 = i12 & (-458753);
                            } else {
                                i17 = i12;
                                modifier4 = modifier3;
                                z14 = z13;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                switchColorsM843colorsSQMK_m0 = switchColors2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            i17 = i12;
                            z14 = z12;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                            modifier4 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                        }
                        fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                        Float fValueOf = Float.valueOf(fMo415toPx0680j_5);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(fValueOf);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                        int i22 = i17 >> 3;
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i22 & 14);
                        int i23 = i17 & 14;
                        stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i23);
                        Float fValueOf2 = Float.valueOf(0.0f);
                        Float fValueOf3 = Float.valueOf(fMo415toPx0680j_4);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(fValueOf2) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf3);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                        objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i19 = 0;
                        zChanged3 = false;
                        for (i18 = 4; i19 < i18; i18 = 4) {
                            zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                            i19++;
                        }
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        Boolean boolValueOf2 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                        Boolean boolValueOf3 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged4 = composerStartRestartGroup.changed(boolValueOf3) | composerStartRestartGroup.changed(anchoredDraggableState);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) objRememberedValue6, composerStartRestartGroup, i23 | 512);
                        if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (function1 != null) {
                            modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                        } else {
                            modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                        }
                        if (function1 != null) {
                            modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                        }
                        Modifier modifierThen = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                        Orientation orientation = Orientation.Horizontal;
                        if (z14 || function1 == null) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        Modifier modifierAnchoredDraggable = AnchoredDraggableKt.anchoredDraggable(modifierThen, anchoredDraggableState, orientation, z16, z15, mutableInteractionSource4);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Modifier modifierM329requiredSizeVpY3zN4 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable, companion2.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composer2, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
                        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        boolean zBooleanValue = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                        composer2.startReplaceableGroup(1157296644);
                        zChanged5 = composer2.changed(anchoredDraggableState);
                        objRememberedValue7 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new d(anchoredDraggableState);
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifier5 = modifier4;
                        a(boxScopeInstance, zBooleanValue, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i22 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                        if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier5;
                        z12 = z14;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        switchColors3 = switchColorsM843colorsSQMK_m0;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        switchColors3 = switchColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, function1, modifier2, z12, mutableInteractionSource5, switchColors3, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i12 |= i21;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i12 |= i21;
                } else {
                    switchColors2 = switchColors;
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                    Float fValueOf4 = Float.valueOf(fMo415toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i24 = i17 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i24 & 14);
                    int i25 = i17 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i25);
                    Float fValueOf5 = Float.valueOf(0.0f);
                    Float fValueOf6 = Float.valueOf(fMo415toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf5) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf6);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i19 = 0;
                    zChanged3 = false;
                    while (i19 < i18) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                        i19++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf4 = Boolean.valueOf(z10);
                    Boolean boolValueOf5 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                    Boolean boolValueOf6 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged4 = composerStartRestartGroup.changed(boolValueOf6) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf4, boolValueOf5, (Function2) objRememberedValue6, composerStartRestartGroup, i25 | 512);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (function1 != null) {
                        modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen2 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                    Orientation orientation2 = Orientation.Horizontal;
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    Modifier modifierAnchoredDraggable2 = AnchoredDraggableKt.anchoredDraggable(modifierThen2, anchoredDraggableState, orientation2, z16, z15, mutableInteractionSource4);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Modifier modifierM329requiredSizeVpY3zN5 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable2, companion4.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion4, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN5);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion5, composerM2074constructorimpl, measurePolicyC2, composerM2074constructorimpl, currentCompositionLocalMap2);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue2 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged5 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier6 = modifier4;
                    a(boxScopeInstance2, zBooleanValue2, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i24 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier6;
                    z12 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM843colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                    Float fValueOf7 = Float.valueOf(fMo415toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf7);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i26 = i17 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i26 & 14);
                    int i27 = i17 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i27);
                    Float fValueOf8 = Float.valueOf(0.0f);
                    Float fValueOf9 = Float.valueOf(fMo415toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf8) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf9);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i19 = 0;
                    zChanged3 = false;
                    while (i19 < i18) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                        i19++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf7 = Boolean.valueOf(z10);
                    Boolean boolValueOf8 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                    Boolean boolValueOf9 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged4 = composerStartRestartGroup.changed(boolValueOf9) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf7, boolValueOf8, (Function2) objRememberedValue6, composerStartRestartGroup, i27 | 512);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (function1 != null) {
                        modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen3 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                    Orientation orientation3 = Orientation.Horizontal;
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    Modifier modifierAnchoredDraggable3 = AnchoredDraggableKt.anchoredDraggable(modifierThen3, anchoredDraggableState, orientation3, z16, z15, mutableInteractionSource4);
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    Modifier modifierM329requiredSizeVpY3zN6 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable3, companion6.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion6, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN6);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion7, composerM2074constructorimpl, measurePolicyC3, composerM2074constructorimpl, currentCompositionLocalMap3);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue3 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged5 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier7 = modifier4;
                    a(boxScopeInstance3, zBooleanValue3, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i26 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier7;
                    z12 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM843colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, function1, modifier2, z12, mutableInteractionSource5, switchColors3, i10, i11));
            }
            i12 |= 3072;
            z12 = z11;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i12 |= i21;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i12 |= i21;
                } else {
                    switchColors2 = switchColors;
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                    Float fValueOf10 = Float.valueOf(fMo415toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf10);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i28 = i17 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i28 & 14);
                    int i29 = i17 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i29);
                    Float fValueOf11 = Float.valueOf(0.0f);
                    Float fValueOf12 = Float.valueOf(fMo415toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf11) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf12);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i19 = 0;
                    zChanged3 = false;
                    while (i19 < i18) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                        i19++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf10 = Boolean.valueOf(z10);
                    Boolean boolValueOf11 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                    Boolean boolValueOf12 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged4 = composerStartRestartGroup.changed(boolValueOf12) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf10, boolValueOf11, (Function2) objRememberedValue6, composerStartRestartGroup, i29 | 512);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (function1 != null) {
                        modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen4 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                    Orientation orientation4 = Orientation.Horizontal;
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    Modifier modifierAnchoredDraggable4 = AnchoredDraggableKt.anchoredDraggable(modifierThen4, anchoredDraggableState, orientation4, z16, z15, mutableInteractionSource4);
                    Alignment.Companion companion8 = Alignment.INSTANCE;
                    Modifier modifierM329requiredSizeVpY3zN7 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable4, companion8.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC4 = androidx.databinding.f.c(companion8, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN7);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion9, composerM2074constructorimpl, measurePolicyC4, composerM2074constructorimpl, currentCompositionLocalMap4);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue4 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged5 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier8 = modifier4;
                    a(boxScopeInstance4, zBooleanValue4, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i28 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier8;
                    z12 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM843colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                    Float fValueOf13 = Float.valueOf(fMo415toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf13);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i210 = i17 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i210 & 14);
                    int i211 = i17 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i211);
                    Float fValueOf14 = Float.valueOf(0.0f);
                    Float fValueOf15 = Float.valueOf(fMo415toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf14) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf15);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i19 = 0;
                    zChanged3 = false;
                    while (i19 < i18) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                        i19++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf13 = Boolean.valueOf(z10);
                    Boolean boolValueOf14 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                    Boolean boolValueOf15 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged4 = composerStartRestartGroup.changed(boolValueOf15) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf13, boolValueOf14, (Function2) objRememberedValue6, composerStartRestartGroup, i211 | 512);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (function1 != null) {
                        modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen5 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                    Orientation orientation5 = Orientation.Horizontal;
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    Modifier modifierAnchoredDraggable5 = AnchoredDraggableKt.anchoredDraggable(modifierThen5, anchoredDraggableState, orientation5, z16, z15, mutableInteractionSource4);
                    Alignment.Companion companion10 = Alignment.INSTANCE;
                    Modifier modifierM329requiredSizeVpY3zN8 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable5, companion10.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC5 = androidx.databinding.f.c(companion10, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN8);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion11, composerM2074constructorimpl, measurePolicyC5, composerM2074constructorimpl, currentCompositionLocalMap5);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue5 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged5 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier9 = modifier4;
                    a(boxScopeInstance5, zBooleanValue5, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i210 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier9;
                    z12 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM843colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, function1, modifier2, z12, mutableInteractionSource5, switchColors3, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i12 |= i21;
                } else {
                    switchColors2 = switchColors;
                }
                i12 |= i21;
            } else {
                switchColors2 = switchColors;
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                Float fValueOf16 = Float.valueOf(fMo415toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf16);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i212 = i17 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i212 & 14);
                int i213 = i17 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i213);
                Float fValueOf17 = Float.valueOf(0.0f);
                Float fValueOf18 = Float.valueOf(fMo415toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf17) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf18);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i19 = 0;
                zChanged3 = false;
                while (i19 < i18) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                    i19++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf16 = Boolean.valueOf(z10);
                Boolean boolValueOf17 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                Boolean boolValueOf18 = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged4 = composerStartRestartGroup.changed(boolValueOf18) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf16, boolValueOf17, (Function2) objRememberedValue6, composerStartRestartGroup, i213 | 512);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (function1 != null) {
                    modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                } else {
                    modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen6 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                Orientation orientation6 = Orientation.Horizontal;
                if (z14) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                Modifier modifierAnchoredDraggable6 = AnchoredDraggableKt.anchoredDraggable(modifierThen6, anchoredDraggableState, orientation6, z16, z15, mutableInteractionSource4);
                Alignment.Companion companion12 = Alignment.INSTANCE;
                Modifier modifierM329requiredSizeVpY3zN9 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable6, companion12.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC6 = androidx.databinding.f.c(companion12, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                constructor = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN9);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion13, composerM2074constructorimpl, measurePolicyC6, composerM2074constructorimpl, currentCompositionLocalMap6);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue6 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged5 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged5) {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier10 = modifier4;
                a(boxScopeInstance6, zBooleanValue6, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i212 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier10;
                z12 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM843colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                Float fValueOf19 = Float.valueOf(fMo415toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf19);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i214 = i17 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i214 & 14);
                int i215 = i17 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i215);
                Float fValueOf110 = Float.valueOf(0.0f);
                Float fValueOf111 = Float.valueOf(fMo415toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf110) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf111);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i19 = 0;
                zChanged3 = false;
                while (i19 < i18) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                    i19++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf19 = Boolean.valueOf(z10);
                Boolean boolValueOf110 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                Boolean boolValueOf111 = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged4 = composerStartRestartGroup.changed(boolValueOf111) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf19, boolValueOf110, (Function2) objRememberedValue6, composerStartRestartGroup, i215 | 512);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (function1 != null) {
                    modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                } else {
                    modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen7 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                Orientation orientation7 = Orientation.Horizontal;
                if (z14) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                Modifier modifierAnchoredDraggable7 = AnchoredDraggableKt.anchoredDraggable(modifierThen7, anchoredDraggableState, orientation7, z16, z15, mutableInteractionSource4);
                Alignment.Companion companion14 = Alignment.INSTANCE;
                Modifier modifierM329requiredSizeVpY3zN10 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable7, companion14.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC7 = androidx.databinding.f.c(companion14, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN10);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion15, composerM2074constructorimpl, measurePolicyC7, composerM2074constructorimpl, currentCompositionLocalMap7);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue7 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged5 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged5) {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier11 = modifier4;
                a(boxScopeInstance7, zBooleanValue7, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i214 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier11;
                z12 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM843colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, function1, modifier2, z12, mutableInteractionSource5, switchColors3, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z12 = z11;
                if (composerStartRestartGroup.changed(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i12 |= i21;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i12 |= i21;
                } else {
                    switchColors2 = switchColors;
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                    Float fValueOf112 = Float.valueOf(fMo415toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf112);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i216 = i17 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i216 & 14);
                    int i217 = i17 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i217);
                    Float fValueOf113 = Float.valueOf(0.0f);
                    Float fValueOf114 = Float.valueOf(fMo415toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf113) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf114);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i19 = 0;
                    zChanged3 = false;
                    while (i19 < i18) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                        i19++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf112 = Boolean.valueOf(z10);
                    Boolean boolValueOf113 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                    Boolean boolValueOf114 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged4 = composerStartRestartGroup.changed(boolValueOf114) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf112, boolValueOf113, (Function2) objRememberedValue6, composerStartRestartGroup, i217 | 512);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (function1 != null) {
                        modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen8 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                    Orientation orientation8 = Orientation.Horizontal;
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    Modifier modifierAnchoredDraggable8 = AnchoredDraggableKt.anchoredDraggable(modifierThen8, anchoredDraggableState, orientation8, z16, z15, mutableInteractionSource4);
                    Alignment.Companion companion16 = Alignment.INSTANCE;
                    Modifier modifierM329requiredSizeVpY3zN11 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable8, companion16.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC8 = androidx.databinding.f.c(companion16, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                    constructor = companion17.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN11);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion17, composerM2074constructorimpl, measurePolicyC8, composerM2074constructorimpl, currentCompositionLocalMap8);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf8, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue8 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged5 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier12 = modifier4;
                    a(boxScopeInstance8, zBooleanValue8, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i216 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier12;
                    z12 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM843colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i17 = i12 & (-458753);
                        } else {
                            i17 = i12;
                            modifier4 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM843colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                    Float fValueOf115 = Float.valueOf(fMo415toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf115);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i218 = i17 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i218 & 14);
                    int i219 = i17 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i219);
                    Float fValueOf116 = Float.valueOf(0.0f);
                    Float fValueOf117 = Float.valueOf(fMo415toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf116) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf117);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i19 = 0;
                    zChanged3 = false;
                    while (i19 < i18) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                        i19++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf115 = Boolean.valueOf(z10);
                    Boolean boolValueOf116 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                    Boolean boolValueOf117 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged4 = composerStartRestartGroup.changed(boolValueOf117) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf115, boolValueOf116, (Function2) objRememberedValue6, composerStartRestartGroup, i219 | 512);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (function1 != null) {
                        modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen9 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                    Orientation orientation9 = Orientation.Horizontal;
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    Modifier modifierAnchoredDraggable9 = AnchoredDraggableKt.anchoredDraggable(modifierThen9, anchoredDraggableState, orientation9, z16, z15, mutableInteractionSource4);
                    Alignment.Companion companion18 = Alignment.INSTANCE;
                    Modifier modifierM329requiredSizeVpY3zN12 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable9, companion18.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC9 = androidx.databinding.f.c(companion18, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN12);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion19, composerM2074constructorimpl, measurePolicyC9, composerM2074constructorimpl, currentCompositionLocalMap9);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf9, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue9 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged5 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new d(anchoredDraggableState);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier13 = modifier4;
                    a(boxScopeInstance9, zBooleanValue9, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i218 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier13;
                    z12 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM843colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, function1, modifier2, z12, mutableInteractionSource5, switchColors3, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i12 |= i21;
                } else {
                    switchColors2 = switchColors;
                }
                i12 |= i21;
            } else {
                switchColors2 = switchColors;
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                Float fValueOf118 = Float.valueOf(fMo415toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf118);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i2110 = i17 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i2110 & 14);
                int i2111 = i17 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i2111);
                Float fValueOf119 = Float.valueOf(0.0f);
                Float fValueOf1110 = Float.valueOf(fMo415toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf119) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf1110);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i19 = 0;
                zChanged3 = false;
                while (i19 < i18) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                    i19++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf118 = Boolean.valueOf(z10);
                Boolean boolValueOf119 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                Boolean boolValueOf1110 = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged4 = composerStartRestartGroup.changed(boolValueOf1110) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf118, boolValueOf119, (Function2) objRememberedValue6, composerStartRestartGroup, i2111 | 512);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (function1 != null) {
                    modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                } else {
                    modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen10 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                Orientation orientation10 = Orientation.Horizontal;
                if (z14) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                Modifier modifierAnchoredDraggable10 = AnchoredDraggableKt.anchoredDraggable(modifierThen10, anchoredDraggableState, orientation10, z16, z15, mutableInteractionSource4);
                Alignment.Companion companion110 = Alignment.INSTANCE;
                Modifier modifierM329requiredSizeVpY3zN13 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable10, companion110.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC10 = androidx.databinding.f.c(companion110, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                constructor = companion111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN13);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion111, composerM2074constructorimpl, measurePolicyC10, composerM2074constructorimpl, currentCompositionLocalMap10);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf10, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue10 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged5 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged5) {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier14 = modifier4;
                a(boxScopeInstance10, zBooleanValue10, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i2110 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier14;
                z12 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM843colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                Float fValueOf1111 = Float.valueOf(fMo415toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf1111);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i2112 = i17 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i2112 & 14);
                int i2113 = i17 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i2113);
                Float fValueOf1112 = Float.valueOf(0.0f);
                Float fValueOf1113 = Float.valueOf(fMo415toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf1112) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf1113);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i19 = 0;
                zChanged3 = false;
                while (i19 < i18) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                    i19++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf1111 = Boolean.valueOf(z10);
                Boolean boolValueOf1112 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                Boolean boolValueOf1113 = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged4 = composerStartRestartGroup.changed(boolValueOf1113) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf1111, boolValueOf1112, (Function2) objRememberedValue6, composerStartRestartGroup, i2113 | 512);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (function1 != null) {
                    modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                } else {
                    modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen11 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                Orientation orientation11 = Orientation.Horizontal;
                if (z14) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                Modifier modifierAnchoredDraggable11 = AnchoredDraggableKt.anchoredDraggable(modifierThen11, anchoredDraggableState, orientation11, z16, z15, mutableInteractionSource4);
                Alignment.Companion companion112 = Alignment.INSTANCE;
                Modifier modifierM329requiredSizeVpY3zN14 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable11, companion112.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC11 = androidx.databinding.f.c(companion112, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN14);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion113, composerM2074constructorimpl, measurePolicyC11, composerM2074constructorimpl, currentCompositionLocalMap11);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf11, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue11 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged5 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged5) {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier15 = modifier4;
                a(boxScopeInstance11, zBooleanValue11, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i2112 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier15;
                z12 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM843colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, function1, modifier2, z12, mutableInteractionSource5, switchColors3, i10, i11));
        }
        i12 |= 3072;
        z12 = z11;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i12 |= i21;
                } else {
                    switchColors2 = switchColors;
                }
                i12 |= i21;
            } else {
                switchColors2 = switchColors;
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                Float fValueOf1114 = Float.valueOf(fMo415toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf1114);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i2114 = i17 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i2114 & 14);
                int i2115 = i17 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i2115);
                Float fValueOf1115 = Float.valueOf(0.0f);
                Float fValueOf1116 = Float.valueOf(fMo415toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf1115) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf1116);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i19 = 0;
                zChanged3 = false;
                while (i19 < i18) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                    i19++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf1114 = Boolean.valueOf(z10);
                Boolean boolValueOf1115 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                Boolean boolValueOf1116 = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged4 = composerStartRestartGroup.changed(boolValueOf1116) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf1114, boolValueOf1115, (Function2) objRememberedValue6, composerStartRestartGroup, i2115 | 512);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (function1 != null) {
                    modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                } else {
                    modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen12 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                Orientation orientation12 = Orientation.Horizontal;
                if (z14) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                Modifier modifierAnchoredDraggable12 = AnchoredDraggableKt.anchoredDraggable(modifierThen12, anchoredDraggableState, orientation12, z16, z15, mutableInteractionSource4);
                Alignment.Companion companion114 = Alignment.INSTANCE;
                Modifier modifierM329requiredSizeVpY3zN15 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable12, companion114.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC12 = androidx.databinding.f.c(companion114, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                constructor = companion115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN15);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion115, composerM2074constructorimpl, measurePolicyC12, composerM2074constructorimpl, currentCompositionLocalMap12);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf12, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue12 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged5 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged5) {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier16 = modifier4;
                a(boxScopeInstance12, zBooleanValue12, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i2114 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier16;
                z12 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM843colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i17 = i12 & (-458753);
                    } else {
                        i17 = i12;
                        modifier4 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM843colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
                Float fValueOf1117 = Float.valueOf(fMo415toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf1117);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i2116 = i17 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i2116 & 14);
                int i2117 = i17 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i2117);
                Float fValueOf1118 = Float.valueOf(0.0f);
                Float fValueOf1119 = Float.valueOf(fMo415toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf1118) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf1119);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i19 = 0;
                zChanged3 = false;
                while (i19 < i18) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                    i19++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf1117 = Boolean.valueOf(z10);
                Boolean boolValueOf1118 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                Boolean boolValueOf1119 = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged4 = composerStartRestartGroup.changed(boolValueOf1119) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf1117, boolValueOf1118, (Function2) objRememberedValue6, composerStartRestartGroup, i2117 | 512);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (function1 != null) {
                    modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
                } else {
                    modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen13 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
                Orientation orientation13 = Orientation.Horizontal;
                if (z14) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                Modifier modifierAnchoredDraggable13 = AnchoredDraggableKt.anchoredDraggable(modifierThen13, anchoredDraggableState, orientation13, z16, z15, mutableInteractionSource4);
                Alignment.Companion companion116 = Alignment.INSTANCE;
                Modifier modifierM329requiredSizeVpY3zN16 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable13, companion116.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC13 = androidx.databinding.f.c(companion116, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN16);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion117, composerM2074constructorimpl, measurePolicyC13, composerM2074constructorimpl, currentCompositionLocalMap13);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf13, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue13 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged5 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged5) {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new d(anchoredDraggableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier17 = modifier4;
                a(boxScopeInstance13, zBooleanValue13, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i2116 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier17;
                z12 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM843colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, function1, modifier2, z12, mutableInteractionSource5, switchColors3, i10, i11));
        }
        i12 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                switchColors2 = switchColors;
                if (composerStartRestartGroup.changed(switchColors2)) {
                }
                i12 |= i21;
            } else {
                switchColors2 = switchColors;
            }
            i12 |= i21;
        } else {
            switchColors2 = switchColors;
        }
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    modifier4 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i17 = i12 & (-458753);
                } else {
                    i17 = i12;
                    modifier4 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM843colorsSQMK_m0 = switchColors2;
                }
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    modifier4 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i17 = i12 & (-458753);
                } else {
                    i17 = i12;
                    modifier4 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM843colorsSQMK_m0 = switchColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
            }
            fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
            Float fValueOf11110 = Float.valueOf(fMo415toPx0680j_5);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(fValueOf11110);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
            int i2118 = i17 >> 3;
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i2118 & 14);
            int i2119 = i17 & 14;
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i2119);
            Float fValueOf11111 = Float.valueOf(0.0f);
            Float fValueOf11112 = Float.valueOf(fMo415toPx0680j_4);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged2 = composerStartRestartGroup.changed(fValueOf11111) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf11112);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
            objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i19 = 0;
            zChanged3 = false;
            while (i19 < i18) {
                zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                i19++;
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
            Boolean boolValueOf11110 = Boolean.valueOf(z10);
            Boolean boolValueOf11111 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
            Boolean boolValueOf11112 = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged4 = composerStartRestartGroup.changed(boolValueOf11112) | composerStartRestartGroup.changed(anchoredDraggableState);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf11110, boolValueOf11111, (Function2) objRememberedValue6, composerStartRestartGroup, i2119 | 512);
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (function1 != null) {
                modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
            } else {
                modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
            }
            if (function1 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierThen14 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
            Orientation orientation14 = Orientation.Horizontal;
            if (z14) {
                z16 = false;
            } else {
                z16 = false;
            }
            Modifier modifierAnchoredDraggable14 = AnchoredDraggableKt.anchoredDraggable(modifierThen14, anchoredDraggableState, orientation14, z16, z15, mutableInteractionSource4);
            Alignment.Companion companion118 = Alignment.INSTANCE;
            Modifier modifierM329requiredSizeVpY3zN17 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable14, companion118.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC14 = androidx.databinding.f.c(companion118, false, composer2, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
            constructor = companion119.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN17);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
            function2C = com.google.android.gms.measurement.internal.a.c(companion119, composerM2074constructorimpl, measurePolicyC14, composerM2074constructorimpl, currentCompositionLocalMap14);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf14, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
            boolean zBooleanValue14 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
            composer2.startReplaceableGroup(1157296644);
            zChanged5 = composer2.changed(anchoredDraggableState);
            objRememberedValue7 = composer2.rememberedValue();
            if (zChanged5) {
                objRememberedValue7 = new d(anchoredDraggableState);
                composer2.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new d(anchoredDraggableState);
                composer2.updateRememberedValue(objRememberedValue7);
            }
            composer2.endReplaceableGroup();
            Modifier modifier18 = modifier4;
            a(boxScopeInstance14, zBooleanValue14, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i2118 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier18;
            z12 = z14;
            mutableInteractionSource5 = mutableInteractionSource4;
            switchColors3 = switchColorsM843colorsSQMK_m0;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    modifier4 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i17 = i12 & (-458753);
                } else {
                    i17 = i12;
                    modifier4 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM843colorsSQMK_m0 = switchColors2;
                }
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    modifier4 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM843colorsSQMK_m0 = SwitchDefaults.INSTANCE.m843colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i17 = i12 & (-458753);
                } else {
                    i17 = i12;
                    modifier4 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM843colorsSQMK_m0 = switchColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(25866825, i17, -1, "androidx.compose.material.Switch (Switch.kt:94)");
            }
            fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7977h);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            fMo415toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f7981l);
            Float fValueOf11113 = Float.valueOf(fMo415toPx0680j_5);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(fValueOf11113);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z10), f.f8005p0, new g(fMo415toPx0680j_5), f7978i, null, 16, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
            int i21110 = i17 >> 3;
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i21110 & 14);
            int i21111 = i17 & 14;
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composerStartRestartGroup, i21111);
            Float fValueOf11114 = Float.valueOf(0.0f);
            Float fValueOf11115 = Float.valueOf(fMo415toPx0680j_4);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged2 = composerStartRestartGroup.changed(fValueOf11114) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf11115);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new a(anchoredDraggableState, fMo415toPx0680j_4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
            objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i19 = 0;
            zChanged3 = false;
            while (i19 < i18) {
                zChanged3 |= composerStartRestartGroup.changed(objArr[i19]);
                i19++;
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new b(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
            Boolean boolValueOf11113 = Boolean.valueOf(z10);
            Boolean boolValueOf11114 = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
            Boolean boolValueOf11115 = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged4 = composerStartRestartGroup.changed(boolValueOf11115) | composerStartRestartGroup.changed(anchoredDraggableState);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new c(z10, anchoredDraggableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf11113, boolValueOf11114, (Function2) objRememberedValue6, composerStartRestartGroup, i21111 | 512);
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (function1 != null) {
                modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, null, z14, Role.m3825boximpl(Role.INSTANCE.m3836getSwitcho7Vup1c()), function1);
            } else {
                modifierM462toggleableO2vRcR0 = Modifier.INSTANCE;
            }
            if (function1 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierThen15 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM462toggleableO2vRcR0);
            Orientation orientation15 = Orientation.Horizontal;
            if (z14) {
                z16 = false;
            } else {
                z16 = false;
            }
            Modifier modifierAnchoredDraggable15 = AnchoredDraggableKt.anchoredDraggable(modifierThen15, anchoredDraggableState, orientation15, z16, z15, mutableInteractionSource4);
            Alignment.Companion companion1110 = Alignment.INSTANCE;
            Modifier modifierM329requiredSizeVpY3zN18 = SizeKt.m329requiredSizeVpY3zN4(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable15, companion1110.getCenter(), false, 2, null), f7974e), f7975f, f7976g);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC15 = androidx.databinding.f.c(companion1110, false, composer2, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM329requiredSizeVpY3zN18);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
            function2C = com.google.android.gms.measurement.internal.a.c(companion1111, composerM2074constructorimpl, measurePolicyC15, composerM2074constructorimpl, currentCompositionLocalMap15);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf15, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            boolean zBooleanValue15 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
            composer2.startReplaceableGroup(1157296644);
            zChanged5 = composer2.changed(anchoredDraggableState);
            objRememberedValue7 = composer2.rememberedValue();
            if (zChanged5) {
                objRememberedValue7 = new d(anchoredDraggableState);
                composer2.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new d(anchoredDraggableState);
                composer2.updateRememberedValue(objRememberedValue7);
            }
            composer2.endReplaceableGroup();
            Modifier modifier19 = modifier4;
            a(boxScopeInstance15, zBooleanValue15, z14, switchColorsM843colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i21110 & 896) | 6 | ((i17 >> 6) & 7168) | ((i17 << 3) & 458752));
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier19;
            z12 = z14;
            mutableInteractionSource5 = mutableInteractionSource4;
            switchColors3 = switchColorsM843colorsSQMK_m0;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, function1, modifier2, z12, mutableInteractionSource5, switchColors3, i10, i11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(BoxScope boxScope, boolean z10, boolean z11, SwitchColors switchColors, Function0<Float> function0, InteractionSource interactionSource, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(70908914);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70908914, i11, -1, "androidx.compose.material.SwitchImpl (Switch.kt:212)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i12 = (i11 >> 15) & 14;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new h(interactionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i12 | 64);
            float f6 = snapshotStateList.isEmpty() ^ true ? f7980k : f7979j;
            int i13 = ((i11 >> 6) & 14) | (i11 & 112) | ((i11 >> 3) & 896);
            State<Color> stateTrackColor = switchColors.trackColor(z11, z10, composerStartRestartGroup, i13);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion2, companion3.getCenter()), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(stateTrackColor);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new i(stateTrackColor);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            State<Color> stateThumbColor = switchColors.thumbColor(z11, z10, composerStartRestartGroup, i13);
            ElevationOverlay elevationOverlay = (ElevationOverlay) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float fM4389constructorimpl = Dp.m4389constructorimpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl() + f6);
            composerStartRestartGroup.startReplaceableGroup(-539243578);
            long jM2518unboximpl = (!Color.m2509equalsimpl0(stateThumbColor.getValue().m2518unboximpl(), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU()) || elevationOverlay == null) ? stateThumbColor.getValue().m2518unboximpl() : elevationOverlay.mo760apply7g2Lkgo(stateThumbColor.getValue().m2518unboximpl(), fM4389constructorimpl, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl, null, null, null, composerStartRestartGroup, 0, 14);
            Modifier modifierAlign = boxScope.align(companion2, companion3.getCenterStart());
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged3 = composer2.changed(function0);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new j(function0);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m121backgroundbw27NRU(ShadowKt.m2202shadows4CzXII$default(SizeKt.m327requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue4), interactionSource, RippleKt.m900rememberRipple9IZ8Weo(false, f7973d, 0L, composer2, 54, 4)), f7972c), f6, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), stateM58animateColorAsStateeuL9pac.getValue().m2518unboximpl(), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new k(boxScope, z10, z11, switchColors, function0, interactionSource, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean access$Switch$lambda$3(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void access$Switch$lambda$4(MutableState mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    public static final Function1 access$Switch$lambda$7(State state) {
        return (Function1) state.getValue();
    }

    public static final boolean access$Switch$lambda$8(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final long access$SwitchImpl$lambda$16(State state) {
        return ((Color) state.getValue()).m2518unboximpl();
    }

    /* JADX INFO: renamed from: access$drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m844access$drawTrackRPmYEkk(DrawScope drawScope, long j10, float f6, float f10) {
        float f11 = f10 / 2;
        a1.b.C(drawScope, j10, androidx.compose.ui.geometry.OffsetKt.Offset(f11, Offset.m2276getYimpl(drawScope.mo2908getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f6 - f11, Offset.m2276getYimpl(drawScope.mo2908getCenterF1C5BW0())), f10, StrokeCap.INSTANCE.m2809getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getThumbDiameter() {
        return f7972c;
    }

    public static final float getTrackStrokeWidth() {
        return f7971b;
    }

    public static final float getTrackWidth() {
        return f7970a;
    }
}
