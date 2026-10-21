package u;

import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class n extends SuspendLambda implements Function3<CoroutineScope, Velocity, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ long f93682p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableState<NestedScrollDispatcher> f93683q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ State<ScrollingLogic> f93684r0;

    /* JADX INFO: compiled from: Scrollable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", f = "Scrollable.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f93685p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<ScrollingLogic> f93686q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f93687r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(State<ScrollingLogic> state, long j10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f93686q0 = state;
            this.f93687r0 = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f93686q0, this.f93687r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f93685p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollingLogic value = this.f93686q0.getValue();
                this.f93685p0 = 1;
                if (value.c(this.f93687r0, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MutableState<NestedScrollDispatcher> mutableState, State<ScrollingLogic> state, Continuation<? super n> continuation) {
        super(3, continuation);
        this.f93683q0 = mutableState;
        this.f93684r0 = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, Velocity velocity, Continuation<? super Unit> continuation) {
        long f18328a = velocity.getF18328a();
        n nVar = new n(this.f93683q0, this.f93684r0, continuation);
        nVar.f93682p0 = f18328a;
        return nVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default(this.f93683q0.getValue().getCoroutineScope(), null, null, new a(this.f93684r0, this.f93682p0, null), 3, null);
        return Unit.INSTANCE;
    }
}
