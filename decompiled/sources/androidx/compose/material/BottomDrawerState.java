package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.plugin.push.command.TrackMessageOpenedCommand;
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

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB'\b\u0007\u0012\u0006\u0010C\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140D¢\u0006\u0004\bE\u0010FJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ%\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u0016R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u00101\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u00105\u001a\u00020\u00028F¢\u0006\f\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0004R\u0011\u00107\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b6\u00100R\u001a\u0010:\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010\u0004R\u0011\u0010;\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b=\u0010<R\u0011\u0010>\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0014\u0010@\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010<R\u0014\u0010B\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006H"}, d2 = {"Landroidx/compose/material/BottomDrawerState;", "", "", "requireOffset$material_release", "()F", "requireOffset", "", TrackMessageOpenedCommand.ACTION, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", HearingDisabilitiesConstants.CLOSE_MODAL, "expand", "Landroidx/compose/material/BottomDrawerValue;", "target", "velocity", "animateTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "", "trySnapTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;)Z", "trySnapTo", "value", "confirmStateChange$material_release", "confirmStateChange", "Landroidx/compose/material/AnchoredDraggableState;", "a", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "b", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/unit/Density;", "c", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "getTargetValue", "()Landroidx/compose/material/BottomDrawerValue;", "targetValue", "getOffset", "getOffset$annotations", "()V", TypedValues.CycleType.S_WAVE_OFFSET, "getCurrentValue", "currentValue", "getProgress", "getProgress$annotations", "progress", "isOpen", "()Z", "isClosed", "isExpanded", "isAnimationRunning$material_release", "isAnimationRunning", "getLastVelocity$material_release", "lastVelocity", "initialValue", "Lkotlin/Function1;", "<init>", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
public final class BottomDrawerState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NestedScrollConnection nestedScrollConnection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Density density;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0007J.\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\f"}, d2 = {"Landroidx/compose/material/BottomDrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "density", "Landroidx/compose/ui/unit/Density;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Drawer.kt */
        public static final class a extends Lambda implements Function2<SaverScope, BottomDrawerState, BottomDrawerValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f6784p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final BottomDrawerValue invoke(SaverScope saverScope, BottomDrawerState bottomDrawerState) {
                SaverScope Saver = saverScope;
                BottomDrawerState it = bottomDrawerState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getAnchoredDraggableState$material_release().getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: Drawer.kt */
        public static final class b extends Lambda implements Function1<BottomDrawerValue, BottomDrawerState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Density f6785p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1<BottomDrawerValue, Boolean> f6786q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Density density, Function1<? super BottomDrawerValue, Boolean> function1) {
                super(1);
                this.f6785p0 = density;
                this.f6786q0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BottomDrawerState invoke(BottomDrawerValue bottomDrawerValue) {
                BottomDrawerValue it = bottomDrawerValue;
                Intrinsics.checkNotNullParameter(it, "it");
                return DrawerKt.BottomDrawerState(it, this.f6785p0, this.f6786q0);
            }
        }

        /* JADX INFO: compiled from: Drawer.kt */
        public static final class c extends Lambda implements Function2<SaverScope, BottomDrawerState, BottomDrawerValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final c f6787p0 = new c(2);

            @Override // kotlin.jvm.functions.Function2
            public final BottomDrawerValue invoke(SaverScope saverScope, BottomDrawerState bottomDrawerState) {
                SaverScope Saver = saverScope;
                BottomDrawerState it = bottomDrawerState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getAnchoredDraggableState$material_release().getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: Drawer.kt */
        public static final class d extends Lambda implements Function1<BottomDrawerValue, BottomDrawerState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<BottomDrawerValue, Boolean> f6788p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(Function1<? super BottomDrawerValue, Boolean> function1) {
                super(1);
                this.f6788p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BottomDrawerState invoke(BottomDrawerValue bottomDrawerValue) {
                BottomDrawerValue it = bottomDrawerValue;
                Intrinsics.checkNotNullParameter(it, "it");
                return new BottomDrawerState(it, this.f6788p0);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(@NotNull Density density, @NotNull Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(a.f6784p0, new b(density, confirmStateChange));
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(density, confirmValueChange)", imports = {}))
        @NotNull
        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(@NotNull Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(c.f6787p0, new d(confirmStateChange));
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    public static final class a extends Lambda implements Function1<BottomDrawerValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6789p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BottomDrawerValue bottomDrawerValue) {
            BottomDrawerValue it = bottomDrawerValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/BottomDrawerState$anchoredDraggableState$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,956:1\n1#2:957\n*E\n"})
    public static final class b extends Lambda implements Function1<Float, Float> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            f6.floatValue();
            return Float.valueOf(BottomDrawerState.access$requireDensity(BottomDrawerState.this).mo415toPx0680j_4(DrawerKt.f7062b));
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/BottomDrawerState$anchoredDraggableState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,956:1\n1#2:957\n*E\n"})
    public static final class c extends Lambda implements Function0<Float> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(BottomDrawerState.access$requireDensity(BottomDrawerState.this).mo415toPx0680j_4(DrawerKt.f7063c));
        }
    }

    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            BottomDrawerState(\n                initialValue = initialValue,\n                density =,\n                confirmStateChange = confirmStateChange\n            )\n            ", imports = {}))
    public BottomDrawerState(@NotNull BottomDrawerValue initialValue, @NotNull Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState = new AnchoredDraggableState<>(initialValue, new b(), new c(), DrawerKt.f7064d, confirmStateChange);
        this.anchoredDraggableState = anchoredDraggableState;
        this.nestedScrollConnection = DrawerKt.access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(anchoredDraggableState);
    }

    public static final Density access$requireDensity(BottomDrawerState bottomDrawerState) {
        Density density = bottomDrawerState.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BottomDrawerState (" + bottomDrawerState + ") was not set. Did you use BottomDrawer with the BottomDrawer composable?").toString());
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomDrawerState bottomDrawerState, BottomDrawerValue bottomDrawerValue, float f6, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f6 = bottomDrawerState.anchoredDraggableState.getLastVelocity();
        }
        return bottomDrawerState.animateTo$material_release(bottomDrawerValue, f6, continuation);
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull BottomDrawerValue bottomDrawerValue, float f6, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomDrawerValue, f6, continuation);
        return objAnimateTo == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Closed, 0.0f, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public final boolean confirmStateChange$material_release(@NotNull BottomDrawerValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.anchoredDraggableState.getConfirmValueChange$material_release().invoke(value).booleanValue();
    }

    @Nullable
    public final Object expand(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState<BottomDrawerValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @NotNull
    public final BottomDrawerValue getCurrentValue() {
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

    @NotNull
    /* JADX INFO: renamed from: getNestedScrollConnection$material_release, reason: from getter */
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    @NotNull
    public final BottomDrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning$material_release() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Closed;
    }

    public final boolean isExpanded() {
        return this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Expanded;
    }

    public final boolean isOpen() {
        return this.anchoredDraggableState.getCurrentValue() != BottomDrawerValue.Closed;
    }

    @Nullable
    public final Object open(@NotNull Continuation<? super Unit> continuation) {
        BottomDrawerValue bottomDrawerValue = BottomDrawerValue.Open;
        if (!this.anchoredDraggableState.hasAnchorForValue(bottomDrawerValue)) {
            bottomDrawerValue = BottomDrawerValue.Expanded;
        }
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, bottomDrawerValue, 0.0f, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density) {
        this.density = density;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull BottomDrawerValue bottomDrawerValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomDrawerValue, continuation);
        return objSnapTo == ek.a.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public final boolean trySnapTo$material_release(@NotNull BottomDrawerValue target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return this.anchoredDraggableState.trySnapTo$material_release(target);
    }

    public /* synthetic */ BottomDrawerState(BottomDrawerValue bottomDrawerValue, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomDrawerValue, (i10 & 2) != 0 ? a.f6789p0 : function1);
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }
}
