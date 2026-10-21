package la;

import com.bbva.glomohybrid.welcome.model.domain.WelcomeContract;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomeActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivity$collectViewStates$1", f = "WelcomeActivity.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83148p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ WelcomeActivity f83149q0;

    /* JADX INFO: compiled from: WelcomeActivity.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WelcomeActivity f83150p0;

        public a(WelcomeActivity welcomeActivity) {
            this.f83150p0 = welcomeActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            WelcomeActivity.access$handleStates(this.f83150p0, (WelcomeContract.State) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WelcomeActivity welcomeActivity, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f83149q0 = welcomeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f83149q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83148p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            WelcomeActivity welcomeActivity = this.f83149q0;
            Flow<WelcomeContract.State> state = WelcomeActivity.access$getViewModel(welcomeActivity).getState();
            a aVar = new a(welcomeActivity);
            this.f83148p0 = 1;
            if (state.collect(aVar, this) == coroutine_suspended) {
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
