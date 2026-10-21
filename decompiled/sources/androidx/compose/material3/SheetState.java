package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.plugin.showinfo.command.HideCommand;
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

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B9\u0012\u0006\u0010\u001e\u001a\u00020\u0013\u0012\b\b\u0002\u00106\u001a\u00020\n\u0012\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001307\u0012\b\b\u0002\u0010!\u001a\u00020\u0013¢\u0006\u0004\b9\u0010:J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0013\u0010\t\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J%\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR(\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010,\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u0010.\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b.\u0010\u001dR\u0011\u00100\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b/\u0010\u001dR\u0011\u00102\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b1\u0010\u001dR\u0016\u00105\u001a\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Landroidx/compose/material3/SheetState;", "", "", "requireOffset", "", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "partialExpand", "show", HideCommand.ID, "Landroidx/compose/material3/SheetValue;", "targetValue", "velocity", "animateTo$material3_release", "(Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material3_release", "(Landroidx/compose/material3/SheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "", "trySnapTo$material3_release", "(Landroidx/compose/material3/SheetValue;)Z", "trySnapTo", "settle$material3_release", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settle", "a", "Z", "getSkipPartiallyExpanded$material3_release", "()Z", "skipPartiallyExpanded", "b", "getSkipHiddenState$material3_release", "skipHiddenState", "Landroidx/compose/material3/SwipeableV2State;", "c", "Landroidx/compose/material3/SwipeableV2State;", "getSwipeableState$material3_release", "()Landroidx/compose/material3/SwipeableV2State;", "setSwipeableState$material3_release", "(Landroidx/compose/material3/SwipeableV2State;)V", "swipeableState", "getCurrentValue", "()Landroidx/compose/material3/SheetValue;", "currentValue", "getTargetValue", "isVisible", "getHasExpandedState", "hasExpandedState", "getHasPartiallyExpandedState", "hasPartiallyExpandedState", "getOffset$material3_release", "()Ljava/lang/Float;", TypedValues.CycleType.S_WAVE_OFFSET, "initialValue", "Lkotlin/Function1;", "confirmValueChange", "<init>", "(ZLandroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;Z)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SheetState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean skipPartiallyExpanded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean skipHiddenState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public SwipeableV2State<SheetValue> swipeableState;

    /* JADX INFO: compiled from: SheetDefaults.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/SheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SheetState;", "Landroidx/compose/material3/SheetValue;", "skipPartiallyExpanded", "", "confirmValueChange", "Lkotlin/Function1;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: SheetDefaults.kt */
        public static final class a extends Lambda implements Function2<SaverScope, SheetState, SheetValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f11293p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final SheetValue invoke(SaverScope saverScope, SheetState sheetState) {
                SaverScope Saver = saverScope;
                SheetState it = sheetState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: SheetDefaults.kt */
        public static final class b extends Lambda implements Function1<SheetValue, SheetState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ boolean f11294p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1<SheetValue, Boolean> f11295q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(boolean z10, Function1<? super SheetValue, Boolean> function1) {
                super(1);
                this.f11294p0 = z10;
                this.f11295q0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final SheetState invoke(SheetValue sheetValue) {
                SheetValue savedValue = sheetValue;
                Intrinsics.checkNotNullParameter(savedValue, "savedValue");
                return new SheetState(this.f11294p0, savedValue, this.f11295q0, false, 8, null);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<SheetState, SheetValue> Saver(boolean skipPartiallyExpanded, @NotNull Function1<? super SheetValue, Boolean> confirmValueChange) {
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            return SaverKt.Saver(a.f11293p0, new b(skipPartiallyExpanded, confirmValueChange));
        }
    }

    /* JADX INFO: compiled from: SheetDefaults.kt */
    public static final class a extends Lambda implements Function1<SheetValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f11296p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(SheetValue sheetValue) {
            SheetValue it = sheetValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public SheetState(boolean z10, @NotNull SheetValue initialValue, @NotNull Function1<? super SheetValue, Boolean> confirmValueChange, boolean z11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        this.skipPartiallyExpanded = z10;
        this.skipHiddenState = z11;
        if (z10 && initialValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
        }
        if (z11 && initialValue == SheetValue.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
        }
        this.swipeableState = new SwipeableV2State<>(initialValue, SwipeableV2Defaults.INSTANCE.getAnimationSpec(), confirmValueChange, null, 0.0f, 24, null);
    }

    public static /* synthetic */ Object animateTo$material3_release$default(SheetState sheetState, SheetValue sheetValue, float f6, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f6 = sheetState.swipeableState.getLastVelocity();
        }
        return sheetState.animateTo$material3_release(sheetValue, f6, continuation);
    }

    @Nullable
    public final Object animateTo$material3_release(@NotNull SheetValue sheetValue, float f6, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objAnimateTo = this.swipeableState.animateTo(sheetValue, f6, continuation);
        return objAnimateTo == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @Nullable
    public final Object expand(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = SwipeableV2State.animateTo$default(this.swipeableState, SheetValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @NotNull
    public final SheetValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    public final boolean getHasExpandedState() {
        return this.swipeableState.hasAnchorForValue(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.swipeableState.hasAnchorForValue(SheetValue.PartiallyExpanded);
    }

    @Nullable
    public final Float getOffset$material3_release() {
        return this.swipeableState.getOffset();
    }

    /* JADX INFO: renamed from: getSkipHiddenState$material3_release, reason: from getter */
    public final boolean getSkipHiddenState() {
        return this.skipHiddenState;
    }

    /* JADX INFO: renamed from: getSkipPartiallyExpanded$material3_release, reason: from getter */
    public final boolean getSkipPartiallyExpanded() {
        return this.skipPartiallyExpanded;
    }

    @NotNull
    public final SwipeableV2State<SheetValue> getSwipeableState$material3_release() {
        return this.swipeableState;
    }

    @NotNull
    public final SheetValue getTargetValue() {
        return this.swipeableState.getTargetValue();
    }

    @Nullable
    public final Object hide(@NotNull Continuation<? super Unit> continuation) {
        if (!(!this.skipHiddenState)) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.Hidden, 0.0f, continuation, 2, null);
        return objAnimateTo$material3_release$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$material3_release$default : Unit.INSTANCE;
    }

    public final boolean isVisible() {
        return this.swipeableState.getCurrentValue() != SheetValue.Hidden;
    }

    @Nullable
    public final Object partialExpand(@NotNull Continuation<? super Unit> continuation) {
        if (!(!this.skipPartiallyExpanded)) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.PartiallyExpanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material3_release$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$material3_release$default : Unit.INSTANCE;
    }

    public final float requireOffset() {
        return this.swipeableState.requireOffset();
    }

    public final void setSwipeableState$material3_release(@NotNull SwipeableV2State<SheetValue> swipeableV2State) {
        Intrinsics.checkNotNullParameter(swipeableV2State, "<set-?>");
        this.swipeableState = swipeableV2State;
    }

    @Nullable
    public final Object settle$material3_release(float f6, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object obj = this.swipeableState.settle(f6, continuation);
        return obj == ek.a.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }

    @Nullable
    public final Object show(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, getHasPartiallyExpandedState() ? SheetValue.PartiallyExpanded : SheetValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material3_release$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$material3_release$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo$material3_release(@NotNull SheetValue sheetValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo = this.swipeableState.snapTo(sheetValue, continuation);
        return objSnapTo == ek.a.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public final boolean trySnapTo$material3_release(@NotNull SheetValue targetValue) {
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        return this.swipeableState.trySnapTo$material3_release(targetValue);
    }

    public /* synthetic */ SheetState(boolean z10, SheetValue sheetValue, Function1 function1, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? SheetValue.Hidden : sheetValue, (i10 & 4) != 0 ? a.f11296p0 : function1, (i10 & 8) != 0 ? false : z11);
    }
}
