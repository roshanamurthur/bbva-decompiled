package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import com.bbva.plugin.showinfo.command.HideCommand;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB?\b\u0007\u0012\u0006\u0010D\u001a\u00020\n\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001b\u0012\b\b\u0002\u0010%\u001a\u00020\u0014\u0012\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0004\bG\u0010HB3\b\u0017\u0012\u0006\u0010D\u001a\u00020\n\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001b\u0012\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0004\bG\u0010IJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\b\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004J\u0013\u0010\t\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0004J%\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010+\u001a\b\u0012\u0004\u0012\u00020\n0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u00103\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u00106\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00108\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b7\u00105R\u001a\u0010<\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u0019R\u0011\u0010=\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b=\u0010$R\u0014\u0010?\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010$R\u0014\u0010A\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0019R\u0014\u0010C\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "", "", "show", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "halfExpand$material_release", "halfExpand", "expand$material_release", "expand", HideCommand.ID, "Landroidx/compose/material/ModalBottomSheetValue;", "target", "", "velocity", "animateTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "", "trySnapTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;)Z", "trySnapTo", "requireOffset$material_release", "()F", "requireOffset", "Landroidx/compose/animation/core/AnimationSpec;", "a", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "b", "Z", "isSkipHalfExpanded$material_release", "()Z", "isSkipHalfExpanded", "Landroidx/compose/material/AnchoredDraggableState;", "c", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/ui/unit/Density;", "d", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "getCurrentValue", "()Landroidx/compose/material/ModalBottomSheetValue;", "currentValue", "getTargetValue", "targetValue", "getProgress", "getProgress$annotations", "()V", "progress", "isVisible", "getHasHalfExpandedState$material_release", "hasHalfExpandedState", "getLastVelocity$material_release", "lastVelocity", "isAnimationRunning$material_release", "isAnimationRunning", "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;)V", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
public final class ModalBottomSheetState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnimationSpec<Float> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isSkipHalfExpanded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnchoredDraggableState<ModalBottomSheetValue> anchoredDraggableState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Density density;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\fH\u0007JB\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ<\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/ModalBottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "", "skipHalfExpanded", "density", "Landroidx/compose/ui/unit/Density;", "confirmStateChange", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: ModalBottomSheet.kt */
        public static final class a extends Lambda implements Function2<SaverScope, ModalBottomSheetState, ModalBottomSheetValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f7359p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final ModalBottomSheetValue invoke(SaverScope saverScope, ModalBottomSheetState modalBottomSheetState) {
                SaverScope Saver = saverScope;
                ModalBottomSheetState it = modalBottomSheetState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: ModalBottomSheet.kt */
        public static final class b extends Lambda implements Function1<ModalBottomSheetValue, ModalBottomSheetState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Density f7360p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ AnimationSpec<Float> f7361q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Function1<ModalBottomSheetValue, Boolean> f7362r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ boolean f7363s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AnimationSpec animationSpec, Function1 function1, boolean z10, Density density) {
                super(1);
                this.f7360p0 = density;
                this.f7361q0 = animationSpec;
                this.f7362r0 = function1;
                this.f7363s0 = z10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ModalBottomSheetState invoke(ModalBottomSheetValue modalBottomSheetValue) {
                ModalBottomSheetValue it = modalBottomSheetValue;
                Intrinsics.checkNotNullParameter(it, "it");
                return ModalBottomSheetKt.ModalBottomSheetState(it, this.f7360p0, this.f7361q0, this.f7362r0, this.f7363s0);
            }
        }

        /* JADX INFO: compiled from: ModalBottomSheet.kt */
        public static final class c extends Lambda implements Function2<SaverScope, ModalBottomSheetState, ModalBottomSheetValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final c f7364p0 = new c(2);

            @Override // kotlin.jvm.functions.Function2
            public final ModalBottomSheetValue invoke(SaverScope saverScope, ModalBottomSheetState modalBottomSheetState) {
                SaverScope Saver = saverScope;
                ModalBottomSheetState it = modalBottomSheetState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: ModalBottomSheet.kt */
        public static final class d extends Lambda implements Function1<ModalBottomSheetValue, ModalBottomSheetState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AnimationSpec<Float> f7365p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1<ModalBottomSheetValue, Boolean> f7366q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ boolean f7367r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z10) {
                super(1);
                this.f7365p0 = animationSpec;
                this.f7366q0 = function1;
                this.f7367r0 = z10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ModalBottomSheetState invoke(ModalBottomSheetValue modalBottomSheetValue) {
                ModalBottomSheetValue it = modalBottomSheetValue;
                Intrinsics.checkNotNullParameter(it, "it");
                return ModalBottomSheetKt.ModalBottomSheetState(it, this.f7365p0, this.f7366q0, this.f7367r0);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, boolean skipHalfExpanded, @NotNull Density density) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(density, "density");
            return SaverKt.Saver(a.f7359p0, new b(animationSpec, confirmValueChange, skipHalfExpanded, density));
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(animationSpec, confirmValueChange, density, skipHalfExpanded)", imports = {}))
        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, boolean skipHalfExpanded) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            return SaverKt.Saver(c.f7364p0, new d(animationSpec, confirmValueChange, skipHalfExpanded));
        }

        @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "Saver(animationSpec, confirmStateChange, skipHalfExpanded)", imports = {}))
        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, boolean skipHalfExpanded, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return Saver(animationSpec, confirmStateChange, skipHalfExpanded);
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    public static final class a extends Lambda implements Function1<Float, Float> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            f6.floatValue();
            return Float.valueOf(ModalBottomSheetState.access$requireDensity(ModalBottomSheetState.this).mo415toPx0680j_4(ModalBottomSheetKt.f7312a));
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    @SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetState$anchoredDraggableState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,831:1\n1#2:832\n*E\n"})
    public static final class b extends Lambda implements Function0<Float> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(ModalBottomSheetState.access$requireDensity(ModalBottomSheetState.this).mo415toPx0680j_4(ModalBottomSheetKt.f7313b));
        }
    }

    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, isSkipHalfExpanded)", imports = {}))
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, boolean z10, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.isSkipHalfExpanded = z10;
        this.anchoredDraggableState = new AnchoredDraggableState<>(initialValue, new a(), new b(), animationSpec, confirmStateChange);
        if (z10 && initialValue == ModalBottomSheetValue.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
        }
    }

    public static final Density access$requireDensity(ModalBottomSheetState modalBottomSheetState) {
        Density density = modalBottomSheetState.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on ModalBottomSheetState (" + modalBottomSheetState + ") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?").toString());
    }

    public static /* synthetic */ Object animateTo$material_release$default(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f6, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f6 = modalBottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f6, continuation);
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull ModalBottomSheetValue modalBottomSheetValue, float f6, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, modalBottomSheetValue, f6, continuation);
        return objAnimateTo == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @Nullable
    public final Object expand$material_release(@NotNull Continuation<? super Unit> continuation) {
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        if (!this.anchoredDraggableState.hasAnchorForValue(modalBottomSheetValue)) {
            return Unit.INSTANCE;
        }
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$material_release$default : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState<ModalBottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    @NotNull
    public final ModalBottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getDensity$material_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return this.anchoredDraggableState.hasAnchorForValue(ModalBottomSheetValue.HalfExpanded);
    }

    public final float getLastVelocity$material_release() {
        return this.anchoredDraggableState.getLastVelocity();
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    @NotNull
    public final ModalBottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    @Nullable
    public final Object halfExpand$material_release(@NotNull Continuation<? super Unit> continuation) {
        if (!getHasHalfExpandedState$material_release()) {
            return Unit.INSTANCE;
        }
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.HalfExpanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$material_release$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object hide(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.Hidden, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$material_release$default : Unit.INSTANCE;
    }

    public final boolean isAnimationRunning$material_release() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    /* JADX INFO: renamed from: isSkipHalfExpanded$material_release, reason: from getter */
    public final boolean getIsSkipHalfExpanded() {
        return this.isSkipHalfExpanded;
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != ModalBottomSheetValue.Hidden;
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density) {
        this.density = density;
    }

    @Nullable
    public final Object show(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, getHasHalfExpandedState$material_release() ? ModalBottomSheetValue.HalfExpanded : ModalBottomSheetValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$material_release$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull ModalBottomSheetValue modalBottomSheetValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, modalBottomSheetValue, continuation);
        return objSnapTo == ek.a.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public final boolean trySnapTo$material_release(@NotNull ModalBottomSheetValue target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return this.anchoredDraggableState.trySnapTo$material_release(target);
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, boolean z10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(modalBottomSheetValue, (i10 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i10 & 4) != 0 ? false : z10, function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
        this(initialValue, animationSpec, false, confirmStateChange);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }
}
