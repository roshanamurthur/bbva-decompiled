package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.plugin.push.command.TrackMessageOpenedCommand;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
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
@Stable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B%\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0/¢\u0006\u0004\b1\u00102J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0011\u0010&\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b'\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010%R\u001a\u0010-\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Landroidx/compose/material/DrawerState;", "", "", TrackMessageOpenedCommand.ACTION, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", HearingDisabilitiesConstants.CLOSE_MODAL, "Landroidx/compose/material/DrawerValue;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material/DrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireOffset$material_release", "()F", "requireOffset", "Landroidx/compose/material/AnchoredDraggableState;", "a", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/ui/unit/Density;", "b", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "", "isOpen", "()Z", "isClosed", "getCurrentValue", "()Landroidx/compose/material/DrawerValue;", "currentValue", "isAnimationRunning", "getTargetValue", "getTargetValue$annotations", "()V", "getOffset", "getOffset$annotations", TypedValues.CycleType.S_WAVE_OFFSET, "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
public final class DrawerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnchoredDraggableState<DrawerValue> anchoredDraggableState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Density density;

    /* JADX INFO: compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DrawerState;", "Landroidx/compose/material/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Drawer.kt */
        public static final class a extends Lambda implements Function2<SaverScope, DrawerState, DrawerValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f7125p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final DrawerValue invoke(SaverScope saverScope, DrawerState drawerState) {
                SaverScope Saver = saverScope;
                DrawerState it = drawerState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: Drawer.kt */
        public static final class b extends Lambda implements Function1<DrawerValue, DrawerState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<DrawerValue, Boolean> f7126p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super DrawerValue, Boolean> function1) {
                super(1);
                this.f7126p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawerState invoke(DrawerValue drawerValue) {
                DrawerValue it = drawerValue;
                Intrinsics.checkNotNullParameter(it, "it");
                return new DrawerState(it, this.f7126p0);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<DrawerState, DrawerValue> Saver(@NotNull Function1<? super DrawerValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(a.f7125p0, new b(confirmStateChange));
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    public static final class a extends Lambda implements Function1<DrawerValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7127p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DrawerValue drawerValue) {
            DrawerValue it = drawerValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerState$anchoredDraggableState$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,956:1\n1#2:957\n*E\n"})
    public static final class b extends Lambda implements Function1<Float, Float> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            f6.floatValue();
            return Float.valueOf(DrawerState.access$requireDensity(DrawerState.this).mo415toPx0680j_4(DrawerKt.f7062b));
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerState$anchoredDraggableState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,956:1\n1#2:957\n*E\n"})
    public static final class c extends Lambda implements Function0<Float> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(DrawerState.access$requireDensity(DrawerState.this).mo415toPx0680j_4(DrawerKt.f7063c));
        }
    }

    public DrawerState(@NotNull DrawerValue initialValue, @NotNull Function1<? super DrawerValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.anchoredDraggableState = new AnchoredDraggableState<>(initialValue, new b(), new c(), DrawerKt.f7064d, confirmStateChange);
    }

    public static final Density access$requireDensity(DrawerState drawerState) {
        Density density = drawerState.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + drawerState + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @ExperimentalMaterialApi
    @Nullable
    public final Object animateTo(@NotNull DrawerValue drawerValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, drawerValue, 0.0f, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Closed, 0.0f, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @NotNull
    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getDensity$material_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    @ExperimentalMaterialApi
    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    @ExperimentalMaterialApi
    @NotNull
    public final DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    @Nullable
    public final Object open(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Open, 0.0f, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density) {
        this.density = density;
    }

    @Nullable
    public final Object snapTo(@NotNull DrawerValue drawerValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, continuation);
        return objSnapTo == ek.a.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i10 & 2) != 0 ? a.f7127p0 : function1);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }
}
