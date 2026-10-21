package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u0001:\u00010BU\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060%\u0012.\b\u0002\u0010-\u001a(\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00020'¢\u0006\u0002\b,¢\u0006\u0004\b.\u0010/J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010 \u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010#\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/compose/material3/DismissState;", "", "", "requireOffset", "Landroidx/compose/material3/DismissDirection;", "direction", "", "isDismissed", "Landroidx/compose/material3/DismissValue;", "targetValue", "", "snapTo", "(Landroidx/compose/material3/DismissValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "(Landroidx/compose/material3/DismissDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/SwipeableV2State;", "a", "Landroidx/compose/material3/SwipeableV2State;", "getSwipeableState$material3_release", "()Landroidx/compose/material3/SwipeableV2State;", "swipeableState", "getOffset$material3_release", "()Ljava/lang/Float;", TypedValues.CycleType.S_WAVE_OFFSET, "getCurrentValue", "()Landroidx/compose/material3/DismissValue;", "currentValue", "getTargetValue", "getProgress", "()F", "progress", "getDismissDirection", "()Landroidx/compose/material3/DismissDirection;", "dismissDirection", "initialValue", "Lkotlin/Function1;", "confirmValueChange", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ParameterName;", "name", "totalDistance", "Lkotlin/ExtensionFunctionType;", "positionalThreshold", "<init>", "(Landroidx/compose/material3/DismissValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DismissState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SwipeableV2State<DismissValue> swipeableState;

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2,\u0010\n\u001a(\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/DismissState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DismissState;", "Landroidx/compose/material3/DismissValue;", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "Lkotlin/ExtensionFunctionType;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: SwipeToDismiss.kt */
        public static final class a extends Lambda implements Function2<SaverScope, DismissState, DismissValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f10182p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final DismissValue invoke(SaverScope saverScope, DismissState dismissState) {
                SaverScope Saver = saverScope;
                DismissState it = dismissState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: SwipeToDismiss.kt */
        public static final class b extends Lambda implements Function1<DismissValue, DismissState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<DismissValue, Boolean> f10183p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function2<Density, Float, Float> f10184q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super DismissValue, Boolean> function1, Function2<? super Density, ? super Float, Float> function2) {
                super(1);
                this.f10183p0 = function1;
                this.f10184q0 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final DismissState invoke(DismissValue dismissValue) {
                DismissValue it = dismissValue;
                Intrinsics.checkNotNullParameter(it, "it");
                return new DismissState(it, this.f10183p0, this.f10184q0);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<DismissState, DismissValue> Saver(@NotNull Function1<? super DismissValue, Boolean> confirmValueChange, @NotNull Function2<? super Density, ? super Float, Float> positionalThreshold) {
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
            return SaverKt.Saver(a.f10182p0, new b(confirmValueChange, positionalThreshold));
        }
    }

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    public static final class a extends Lambda implements Function1<DismissValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f10185p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DismissValue dismissValue) {
            DismissValue it = dismissValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public DismissState(@NotNull DismissValue initialValue, @NotNull Function1<? super DismissValue, Boolean> confirmValueChange, @NotNull Function2<? super Density, ? super Float, Float> positionalThreshold) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        this.swipeableState = new SwipeableV2State<>(initialValue, null, confirmValueChange, positionalThreshold, SwipeToDismissKt.f11702a, 2, null);
    }

    @Nullable
    public final Object dismiss(@NotNull DismissDirection dismissDirection, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = SwipeableV2State.animateTo$default(this.swipeableState, dismissDirection == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart, 0.0f, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @NotNull
    public final DismissValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    @Nullable
    public final DismissDirection getDismissDirection() {
        if (Intrinsics.areEqual(getOffset$material3_release(), 0.0f) || getOffset$material3_release() == null) {
            return null;
        }
        Float offset$material3_release = getOffset$material3_release();
        Intrinsics.checkNotNull(offset$material3_release);
        return offset$material3_release.floatValue() > 0.0f ? DismissDirection.StartToEnd : DismissDirection.EndToStart;
    }

    @Nullable
    public final Float getOffset$material3_release() {
        return this.swipeableState.getOffset();
    }

    public final float getProgress() {
        return this.swipeableState.getProgress();
    }

    @NotNull
    public final SwipeableV2State<DismissValue> getSwipeableState$material3_release() {
        return this.swipeableState;
    }

    @NotNull
    public final DismissValue getTargetValue() {
        return this.swipeableState.getTargetValue();
    }

    public final boolean isDismissed(@NotNull DismissDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return getCurrentValue() == (direction == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart);
    }

    public final float requireOffset() {
        return this.swipeableState.requireOffset();
    }

    @Nullable
    public final Object reset(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = SwipeableV2State.animateTo$default(this.swipeableState, DismissValue.Default, 0.0f, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo(@NotNull DismissValue dismissValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo = this.swipeableState.snapTo(dismissValue, continuation);
        return objSnapTo == ek.a.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public /* synthetic */ DismissState(DismissValue dismissValue, Function1 function1, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dismissValue, (i10 & 2) != 0 ? a.f10185p0 : function1, (i10 & 4) != 0 ? SwipeToDismissDefaults.INSTANCE.getFixedPositionalThreshold() : function2);
    }
}
