package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
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

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB?\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/material/BackdropScaffoldState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/BackdropValue;", "", "reveal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "conceal", "Landroidx/compose/material/SnackbarHostState;", "q", "Landroidx/compose/material/SnackbarHostState;", "getSnackbarHostState", "()Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "r", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "", "isRevealed", "()Z", "isConcealed", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
@Stable
@ExperimentalMaterialApi
public final class BackdropScaffoldState extends SwipeableState<BackdropValue> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SnackbarHostState snackbarHostState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NestedScrollConnection nestedScrollConnection;

    /* JADX INFO: compiled from: BackdropScaffold.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BackdropScaffoldState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Landroidx/compose/material/BackdropValue;", "", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: BackdropScaffold.kt */
        public static final class a extends Lambda implements Function2<SaverScope, BackdropScaffoldState, BackdropValue> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f6752p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final BackdropValue invoke(SaverScope saverScope, BackdropScaffoldState backdropScaffoldState) {
                SaverScope Saver = saverScope;
                BackdropScaffoldState it = backdropScaffoldState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: BackdropScaffold.kt */
        public static final class b extends Lambda implements Function1<BackdropValue, BackdropScaffoldState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AnimationSpec<Float> f6753p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1<BackdropValue, Boolean> f6754q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ SnackbarHostState f6755r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState) {
                super(1);
                this.f6753p0 = animationSpec;
                this.f6754q0 = function1;
                this.f6755r0 = snackbarHostState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BackdropScaffoldState invoke(BackdropValue backdropValue) {
                BackdropValue it = backdropValue;
                Intrinsics.checkNotNullParameter(it, "it");
                return new BackdropScaffoldState(it, this.f6753p0, this.f6754q0, this.f6755r0);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<BackdropScaffoldState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BackdropValue, Boolean> confirmStateChange, @NotNull SnackbarHostState snackbarHostState) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
            return SaverKt.Saver(a.f6752p0, new b(animationSpec, confirmStateChange, snackbarHostState));
        }
    }

    /* JADX INFO: compiled from: BackdropScaffold.kt */
    public static final class a extends Lambda implements Function1<BackdropValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6756p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BackdropValue backdropValue) {
            BackdropValue it = backdropValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(backdropValue, (i10 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i10 & 4) != 0 ? a.f6756p0 : function1, (i10 & 8) != 0 ? new SnackbarHostState() : snackbarHostState);
    }

    @Nullable
    public final Object conceal(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, BackdropValue.Concealed, null, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getNestedScrollConnection$material_release, reason: from getter */
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @NotNull
    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }

    public final boolean isConcealed() {
        return getCurrentValue() == BackdropValue.Concealed;
    }

    public final boolean isRevealed() {
        return getCurrentValue() == BackdropValue.Revealed;
    }

    @Nullable
    public final Object reveal(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, BackdropValue.Revealed, null, continuation, 2, null);
        return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldState(@NotNull BackdropValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BackdropValue, Boolean> confirmStateChange, @NotNull SnackbarHostState snackbarHostState) {
        super(initialValue, animationSpec, confirmStateChange);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.snackbarHostState = snackbarHostState;
        this.nestedScrollConnection = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }
}
