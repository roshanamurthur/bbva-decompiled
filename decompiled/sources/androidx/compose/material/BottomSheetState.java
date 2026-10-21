package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B7\b\u0007\u0012\u0006\u00107\u001a\u00020\b\u0012\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u000608\u0012\u0014\b\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110:¢\u0006\u0004\b<\u0010=J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J%\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010%\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010(\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010)R\u001a\u0010/\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u001a\u00102\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010,R\u0014\u00104\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010)R\u0014\u00106\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Landroidx/compose/material/BottomSheetState;", "", "", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collapse", "", "requireOffset", "Landroidx/compose/material/BottomSheetValue;", "target", "velocity", "animateTo$material_release", "(Landroidx/compose/material/BottomSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/BottomSheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "", "trySnapTo$material_release", "(Landroidx/compose/material/BottomSheetValue;)Z", "trySnapTo", "Landroidx/compose/material/AnchoredDraggableState;", "a", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/ui/unit/Density;", "b", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "getCurrentValue", "()Landroidx/compose/material/BottomSheetValue;", "currentValue", "getTargetValue", "targetValue", "isExpanded", "()Z", "isCollapsed", "getProgress", "()F", "getProgress$annotations", "()V", "progress", "getOffset", "getOffset$annotations", TypedValues.CycleType.S_WAVE_OFFSET, "isAnimationRunning$material_release", "isAnimationRunning", "getLastVelocity$material_release", "lastVelocity", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function1;", "confirmValueChange", "<init>", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
public final class BottomSheetState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnchoredDraggableState<BottomSheetValue> anchoredDraggableState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Density density;

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007J:\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/BottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Landroidx/compose/material/BottomSheetValue;", "", "density", "Landroidx/compose/ui/unit/Density;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: BottomSheetScaffold.kt */
        public static final class a extends Lambda implements Function2<SaverScope, BottomSheetState, BottomSheetValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f6894p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final BottomSheetValue invoke(SaverScope saverScope, BottomSheetState bottomSheetState) {
                SaverScope Saver = saverScope;
                BottomSheetState it = bottomSheetState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getAnchoredDraggableState$material_release().getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: BottomSheetScaffold.kt */
        public static final class b extends Lambda implements Function1<BottomSheetValue, BottomSheetState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Density f6895p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ AnimationSpec<Float> f6896q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Function1<BottomSheetValue, Boolean> f6897r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AnimationSpec animationSpec, Function1 function1, Density density) {
                super(1);
                this.f6895p0 = density;
                this.f6896q0 = animationSpec;
                this.f6897r0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BottomSheetState invoke(BottomSheetValue bottomSheetValue) {
                BottomSheetValue it = bottomSheetValue;
                Intrinsics.checkNotNullParameter(it, "it");
                return BottomSheetScaffoldKt.BottomSheetState(it, this.f6895p0, this.f6896q0, this.f6897r0);
            }
        }

        /* JADX INFO: compiled from: BottomSheetScaffold.kt */
        public static final class c extends Lambda implements Function2<SaverScope, BottomSheetState, BottomSheetValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final c f6898p0 = new c(2);

            @Override // kotlin.jvm.functions.Function2
            public final BottomSheetValue invoke(SaverScope saverScope, BottomSheetState bottomSheetState) {
                SaverScope Saver = saverScope;
                BottomSheetState it = bottomSheetState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getAnchoredDraggableState$material_release().getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: BottomSheetScaffold.kt */
        public static final class d extends Lambda implements Function1<BottomSheetValue, BottomSheetState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AnimationSpec<Float> f6899p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1<BottomSheetValue, Boolean> f6900q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(AnimationSpec<Float> animationSpec, Function1<? super BottomSheetValue, Boolean> function1) {
                super(1);
                this.f6899p0 = animationSpec;
                this.f6900q0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BottomSheetState invoke(BottomSheetValue bottomSheetValue) {
                BottomSheetValue it = bottomSheetValue;
                Intrinsics.checkNotNullParameter(it, "it");
                return new BottomSheetState(it, this.f6899p0, this.f6900q0);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<BottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> confirmStateChange, @NotNull Density density) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            Intrinsics.checkNotNullParameter(density, "density");
            return SaverKt.Saver(a.f6894p0, new b(animationSpec, confirmStateChange, density));
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(animationSpec, confirmStateChange, density)", imports = {}))
        @NotNull
        public final Saver<BottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(c.f6898p0, new d(animationSpec, confirmStateChange));
        }
    }

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class a extends Lambda implements Function1<BottomSheetValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6901p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BottomSheetValue bottomSheetValue) {
            BottomSheetValue it = bottomSheetValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class b extends Lambda implements Function1<Float, Float> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            f6.floatValue();
            return Float.valueOf(BottomSheetState.access$requireDensity(BottomSheetState.this).mo415toPx0680j_4(BottomSheetScaffoldKt.f6831b));
        }
    }

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class c extends Lambda implements Function0<Float> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(BottomSheetState.access$requireDensity(BottomSheetState.this).mo415toPx0680j_4(BottomSheetScaffoldKt.f6832c));
        }
    }

    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            BottomSheetState(\n                initialValue = initialValue,\n                density = LocalDensity.current,\n                animationSpec = animationSpec,\n                confirmValueChange = confirmValueChange\n            )\n            ", imports = {}))
    public BottomSheetState(@NotNull BottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> confirmValueChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        this.anchoredDraggableState = new AnchoredDraggableState<>(initialValue, new b(), new c(), animationSpec, confirmValueChange);
    }

    public static final Density access$requireDensity(BottomSheetState bottomSheetState) {
        Density density = bottomSheetState.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BottomSheetState (" + bottomSheetState + ") was not set. Did you use BottomSheetState with the BottomSheetScaffold composable?").toString());
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, float f6, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f6 = bottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return bottomSheetState.animateTo$material_release(bottomSheetValue, f6, continuation);
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull BottomSheetValue bottomSheetValue, float f6, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomSheetValue, f6, continuation);
        return objAnimateTo == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @Nullable
    public final Object collapse(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomSheetValue.Collapsed, 0.0f, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object expand(@NotNull Continuation<? super Unit> continuation) {
        BottomSheetValue bottomSheetValue = BottomSheetValue.Expanded;
        if (!this.anchoredDraggableState.hasAnchorForValue(bottomSheetValue)) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        }
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, bottomSheetValue, 0.0f, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState<BottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @NotNull
    public final BottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getDensity$material_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final float getLastVelocity$material_release() {
        return this.anchoredDraggableState.getLastVelocity();
    }

    public final float getOffset() {
        throw new IllegalStateException("Use requireOffset() to access the offset.".toString());
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    @NotNull
    public final BottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning$material_release() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isCollapsed() {
        return this.anchoredDraggableState.getCurrentValue() == BottomSheetValue.Collapsed;
    }

    public final boolean isExpanded() {
        return this.anchoredDraggableState.getCurrentValue() == BottomSheetValue.Expanded;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density) {
        this.density = density;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull BottomSheetValue bottomSheetValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomSheetValue, continuation);
        return objSnapTo == ek.a.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public final boolean trySnapTo$material_release(@NotNull BottomSheetValue target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return this.anchoredDraggableState.trySnapTo$material_release(target);
    }

    public /* synthetic */ BottomSheetState(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomSheetValue, (i10 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i10 & 4) != 0 ? a.f6901p0 : function1);
    }

    @Deprecated(message = "Use requireOffset() to access the offset.", replaceWith = @ReplaceWith(expression = "requireOffset()", imports = {}))
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }
}
