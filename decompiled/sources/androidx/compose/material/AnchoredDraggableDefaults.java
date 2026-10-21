package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\u0012J1\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\tR&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00148GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R5\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\f0\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/compose/material/AnchoredDraggableDefaults;", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/material/AnchoredDraggableState;", "state", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "ReconcileAnimationOnAnchorChangedCallback$material_release", "(Landroidx/compose/material/AnchoredDraggableState;Lkotlinx/coroutines/CoroutineScope;)Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "ReconcileAnimationOnAnchorChangedCallback", "Landroidx/compose/animation/core/SpringSpec;", "", "a", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec$annotations", "()V", "AnimationSpec", "Lkotlin/Function0;", "getVelocityThreshold", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$annotations", "velocityThreshold", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "totalDistance", "getPositionalThreshold", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "getPositionalThreshold$annotations", "positionalThreshold", "<init>", "material_release"}, k = 1, mv = {1, 8, 0})
@Stable
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,710:1\n76#2:711\n76#2:720\n1#3:712\n36#4:713\n36#4:721\n1097#5,6:714\n1097#5,6:722\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableDefaults\n*L\n655#1:711\n664#1:720\n655#1:713\n665#1:721\n655#1:714,6\n665#1:722,6\n*E\n"})
public final class AnchoredDraggableDefaults {

    @NotNull
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class a<T> implements AnchoredDraggableState.AnchorChangedCallback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f6535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f6536b;

        /* JADX INFO: renamed from: androidx.compose.material.AnchoredDraggableDefaults$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$1", f = "AnchoredDraggable.kt", i = {}, l = {686}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0044a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f6537p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f6538q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ T f6539r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0044a(AnchoredDraggableState<T> anchoredDraggableState, T t10, Continuation<? super C0044a> continuation) {
                super(2, continuation);
                this.f6538q0 = anchoredDraggableState;
                this.f6539r0 = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0044a(this.f6538q0, this.f6539r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0044a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f6537p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AnchoredDraggableState<T> anchoredDraggableState = this.f6538q0;
                    float lastVelocity = anchoredDraggableState.getLastVelocity();
                    this.f6537p0 = 1;
                    if (AnchoredDraggableKt.animateTo(anchoredDraggableState, this.f6539r0, lastVelocity, this) == coroutine_suspended) {
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

        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$2", f = "AnchoredDraggable.kt", i = {}, l = {690}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f6540p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f6541q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Map<T, Float> f6542r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AnchoredDraggableState<T> anchoredDraggableState, Map<T, Float> map, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f6541q0 = anchoredDraggableState;
                this.f6542r0 = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f6541q0, this.f6542r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f6540p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AnchoredDraggableState<T> anchoredDraggableState = this.f6541q0;
                    Object objA = AnchoredDraggableKt.a(this.f6542r0, anchoredDraggableState.requireOffset(), false);
                    this.f6540p0 = 1;
                    if (AnchoredDraggableKt.snapTo(anchoredDraggableState, objA, this) == coroutine_suspended) {
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

        public a(AnchoredDraggableState anchoredDraggableState, CoroutineScope coroutineScope) {
            this.f6535a = coroutineScope;
            this.f6536b = anchoredDraggableState;
        }

        @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
        public final void onAnchorsChanged(T t10, @NotNull Map<T, Float> previousAnchors, @NotNull Map<T, Float> newAnchors) {
            Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
            Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
            Float f6 = previousAnchors.get(t10);
            Float f10 = newAnchors.get(t10);
            if (Intrinsics.areEqual(f6, f10)) {
                return;
            }
            AnchoredDraggableState<T> anchoredDraggableState = this.f6536b;
            if (f10 != null) {
                BuildersKt__Builders_commonKt.launch$default(this.f6535a, null, null, new C0044a(anchoredDraggableState, t10, null), 3, null);
            } else {
                BuildersKt__Builders_commonKt.launch$default(this.f6535a, null, null, new b(anchoredDraggableState, newAnchors, null), 3, null);
            }
        }
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableDefaults$positionalThreshold$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,710:1\n154#2:711\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableDefaults$positionalThreshold$1$1$1\n*L\n665#1:711\n*E\n"})
    public static final class b extends Lambda implements Function1<Float, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Density f6543p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Density density) {
            super(1);
            this.f6543p0 = density;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            f6.floatValue();
            return Float.valueOf(this.f6543p0.mo415toPx0680j_4(Dp.m4389constructorimpl(56)));
        }
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableDefaults$velocityThreshold$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,710:1\n154#2:711\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableDefaults$velocityThreshold$1$1$1\n*L\n655#1:711\n*E\n"})
    public static final class c extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Density f6544p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Density density) {
            super(0);
            this.f6544p0 = density;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f6544p0.mo415toPx0680j_4(Dp.m4389constructorimpl(125)));
        }
    }

    @ExperimentalMaterialApi
    @NotNull
    public final <T> AnchoredDraggableState.AnchorChangedCallback<T> ReconcileAnimationOnAnchorChangedCallback$material_release(@NotNull AnchoredDraggableState<T> state, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new a(state, scope);
    }

    @ExperimentalMaterialApi
    @NotNull
    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    @JvmName(name = "getPositionalThreshold")
    @NotNull
    @Composable
    @ExperimentalMaterialApi
    public final Function1<Float, Float> getPositionalThreshold(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(82866976);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(82866976, i10, -1, "androidx.compose.material.AnchoredDraggableDefaults.<get-positionalThreshold> (AnchoredDraggable.kt:663)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new b(density);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function1<Float, Float> function1 = (Function1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function1;
    }

    @JvmName(name = "getVelocityThreshold")
    @NotNull
    @Composable
    @ExperimentalMaterialApi
    public final Function0<Float> getVelocityThreshold(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(2030704141);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030704141, i10, -1, "androidx.compose.material.AnchoredDraggableDefaults.<get-velocityThreshold> (AnchoredDraggable.kt:654)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new c(density);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function0<Float> function0 = (Function0) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function0;
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getAnimationSpec$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getPositionalThreshold$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getVelocityThreshold$annotations() {
    }
}
