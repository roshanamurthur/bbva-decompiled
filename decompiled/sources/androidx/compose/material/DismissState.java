package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tJ\u0011\u0010\u0011\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/DismissState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/DismissValue;", "initialValue", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;)V", "dismissDirection", "Landroidx/compose/material/DismissDirection;", "getDismissDirection", "()Landroidx/compose/material/DismissDirection;", "dismiss", "", "direction", "(Landroidx/compose/material/DismissDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDismissed", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
public final class DismissState extends SwipeableState<DismissValue> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/DismissState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DismissState;", "Landroidx/compose/material/DismissValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: SwipeToDismiss.kt */
        public static final class a extends Lambda implements Function2<SaverScope, DismissState, DismissValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f7043p0 = new a(2);

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
            public final /* synthetic */ Function1<DismissValue, Boolean> f7044p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super DismissValue, Boolean> function1) {
                super(1);
                this.f7044p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final DismissState invoke(DismissValue dismissValue) {
                DismissValue it = dismissValue;
                Intrinsics.checkNotNullParameter(it, "it");
                return new DismissState(it, this.f7044p0);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<DismissState, DismissValue> Saver(@NotNull Function1<? super DismissValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(a.f7043p0, new b(confirmStateChange));
        }
    }

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    public static final class a extends Lambda implements Function1<DismissValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7045p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DismissValue dismissValue) {
            DismissValue it = dismissValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ DismissState(DismissValue dismissValue, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dismissValue, (i10 & 2) != 0 ? a.f7045p0 : function1);
    }

    @Nullable
    public final Object dismiss(@NotNull DismissDirection dismissDirection, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, dismissDirection == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart, null, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Nullable
    public final DismissDirection getDismissDirection() {
        if (getOffset().getValue().floatValue() == 0.0f) {
            return null;
        }
        return getOffset().getValue().floatValue() > 0.0f ? DismissDirection.StartToEnd : DismissDirection.EndToStart;
    }

    public final boolean isDismissed(@NotNull DismissDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return getCurrentValue() == (direction == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart);
    }

    @Nullable
    public final Object reset(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, DismissValue.Default, null, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissState(@NotNull DismissValue initialValue, @NotNull Function1<? super DismissValue, Boolean> confirmStateChange) {
        super(initialValue, null, confirmStateChange, 2, null);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
    }
}
