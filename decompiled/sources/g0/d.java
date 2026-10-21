package g0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectionMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68555p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f68556q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ State<Offset> f68557r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Animatable<Offset, AnimationVector2D> f68558s0;

    /* JADX INFO: compiled from: SelectionMagnifier.kt */
    public static final class a extends Lambda implements Function0<Offset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Offset> f68559p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(State<Offset> state) {
            super(0);
            this.f68559p0 = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Offset invoke() {
            return Offset.m2264boximpl(SelectionMagnifierKt.access$rememberAnimatedMagnifierPosition$lambda$1(this.f68559p0));
        }
    }

    /* JADX INFO: compiled from: SelectionMagnifier.kt */
    public static final class b implements FlowCollector<Offset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Offset, AnimationVector2D> f68560p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f68561q0;

        public b(Animatable<Offset, AnimationVector2D> animatable, CoroutineScope coroutineScope) {
            this.f68560p0 = animatable;
            this.f68561q0 = coroutineScope;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Offset offset, Continuation continuation) {
            long f15533a = offset.getF15533a();
            Animatable<Offset, AnimationVector2D> animatable = this.f68560p0;
            if (OffsetKt.m2294isSpecifiedk4lQ0M(animatable.getValue().getF15533a()) && OffsetKt.m2294isSpecifiedk4lQ0M(f15533a) && Offset.m2276getYimpl(animatable.getValue().getF15533a()) != Offset.m2276getYimpl(f15533a)) {
                BuildersKt__Builders_commonKt.launch$default(this.f68561q0, null, null, new e(animatable, f15533a, null), 3, null);
                return Unit.INSTANCE;
            }
            Object objSnapTo = animatable.snapTo(Offset.m2264boximpl(f15533a), continuation);
            return objSnapTo == ek.a.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f68557r0 = state;
        this.f68558s0 = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        d dVar = new d(this.f68557r0, this.f68558s0, continuation);
        dVar.f68556q0 = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68555p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f68556q0;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new a(this.f68557r0));
            b bVar = new b(this.f68558s0, coroutineScope);
            this.f68555p0 = 1;
            if (flowSnapshotFlow.collect(bVar, this) == coroutine_suspended) {
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
