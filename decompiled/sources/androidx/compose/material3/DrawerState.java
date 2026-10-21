package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.plugin.push.command.TrackMessageOpenedCommand;
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

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B%\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170)¢\u0006\u0004\b+\u0010,J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u00068F¢\u0006\f\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\u00178F¢\u0006\f\u0012\u0004\b \u0010\u0015\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068F¢\u0006\f\u0012\u0004\b\"\u0010\u0015\u001a\u0004\b!\u0010\u001cR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0#8F¢\u0006\f\u0012\u0004\b&\u0010\u0015\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/material3/DrawerState;", "", "", TrackMessageOpenedCommand.ACTION, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", HearingDisabilitiesConstants.CLOSE_MODAL, "Landroidx/compose/material3/DrawerValue;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material3/DrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/SwipeableState;", "a", "Landroidx/compose/material3/SwipeableState;", "getSwipeableState$material3_release", "()Landroidx/compose/material3/SwipeableState;", "getSwipeableState$material3_release$annotations", "()V", "swipeableState", "", "isOpen", "()Z", "isClosed", "getCurrentValue", "()Landroidx/compose/material3/DrawerValue;", "getCurrentValue$annotations", "currentValue", "isAnimationRunning", "isAnimationRunning$annotations", "getTargetValue", "getTargetValue$annotations", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "getOffset$annotations", TypedValues.CycleType.S_WAVE_OFFSET, "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DrawerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SwipeableState<DrawerValue> swipeableState;

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DrawerState;", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: NavigationDrawer.kt */
        public static final class a extends Lambda implements Function2<SaverScope, DrawerState, DrawerValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f10208p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final DrawerValue invoke(SaverScope saverScope, DrawerState drawerState) {
                SaverScope Saver = saverScope;
                DrawerState it = drawerState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: NavigationDrawer.kt */
        public static final class b extends Lambda implements Function1<DrawerValue, DrawerState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<DrawerValue, Boolean> f10209p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super DrawerValue, Boolean> function1) {
                super(1);
                this.f10209p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawerState invoke(DrawerValue drawerValue) {
                DrawerValue it = drawerValue;
                Intrinsics.checkNotNullParameter(it, "it");
                return new DrawerState(it, this.f10209p0);
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
            return SaverKt.Saver(a.f10208p0, new b(confirmStateChange));
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class a extends Lambda implements Function1<DrawerValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f10210p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DrawerValue drawerValue) {
            DrawerValue it = drawerValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public DrawerState(@NotNull DrawerValue initialValue, @NotNull Function1<? super DrawerValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.swipeableState = new SwipeableState<>(initialValue, NavigationDrawerKt.f10762c, confirmStateChange);
    }

    @Nullable
    public final Object animateTo(@NotNull DrawerValue drawerValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$material3_release = this.swipeableState.animateTo$material3_release(drawerValue, animationSpec, continuation);
        return objAnimateTo$material3_release == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$material3_release : Unit.INSTANCE;
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo = animateTo(DrawerValue.Closed, NavigationDrawerKt.f10762c, continuation);
        return objAnimateTo == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @NotNull
    public final DrawerValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    @NotNull
    public final State<Float> getOffset() {
        return this.swipeableState.getOffset();
    }

    @NotNull
    public final SwipeableState<DrawerValue> getSwipeableState$material3_release() {
        return this.swipeableState;
    }

    @NotNull
    public final DrawerValue getTargetValue() {
        return this.swipeableState.getTargetValue$material3_release();
    }

    public final boolean isAnimationRunning() {
        return this.swipeableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    @Nullable
    public final Object open(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo = animateTo(DrawerValue.Open, NavigationDrawerKt.f10762c, continuation);
        return objAnimateTo == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo(@NotNull DrawerValue drawerValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo$material3_release = this.swipeableState.snapTo$material3_release(drawerValue, continuation);
        return objSnapTo$material3_release == ek.a.getCOROUTINE_SUSPENDED() ? objSnapTo$material3_release : Unit.INSTANCE;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i10 & 2) != 0 ? a.f10210p0 : function1);
    }

    public static /* synthetic */ void getCurrentValue$annotations() {
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    public static /* synthetic */ void getSwipeableState$material3_release$annotations() {
    }

    public static /* synthetic */ void getTargetValue$annotations() {
    }

    public static /* synthetic */ void isAnimationRunning$annotations() {
    }
}
