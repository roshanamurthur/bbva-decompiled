package t9;

import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.view.LoginActivity$setUpObservers$1", f = "LoginActivity.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93482p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f93483q0;

    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LoginActivity f93484p0;

        public a(LoginActivity loginActivity) {
            this.f93484p0 = loginActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            LoginActivity loginActivity = this.f93484p0;
            if (zBooleanValue) {
                LoginActivity.access$getLoaderViewModel(loginActivity).showSecondaryMessage();
            } else {
                LoginActivity.access$getLoaderViewModel(loginActivity).hideSecondaryMessage();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LoginActivity loginActivity, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f93483q0 = loginActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f(this.f93483q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93482p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LoginActivity loginActivity = this.f93483q0;
            StateFlow<Boolean> stateFlowIsLowConnection = loginActivity.j().isLowConnection();
            a aVar = new a(loginActivity);
            this.f93482p0 = 1;
            if (stateFlowIsLowConnection.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
