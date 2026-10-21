package p5;

import com.bbva.cells.componentkit.dsl.ViewKt;
import com.bbva.component.ui.login.credentials.LoginCredentialsView;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginCredentialsView.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.ui.login.credentials.LoginCredentialsView$observeState$2", f = "LoginCredentialsView.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92564p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoginCredentialsView f92565q0;

    /* JADX INFO: compiled from: LoginCredentialsView.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LoginCredentialsView f92566p0;

        public a(LoginCredentialsView loginCredentialsView) {
            this.f92566p0 = loginCredentialsView;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            LoginCredentialsView loginCredentialsView = this.f92566p0;
            if (zBooleanValue) {
                loginCredentialsView.getViewModel().onButtonLoginEnabled();
            }
            ViewKt.enable(loginCredentialsView.getLoginButton(), Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LoginCredentialsView loginCredentialsView, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f92565q0 = loginCredentialsView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d(this.f92565q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f92564p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LoginCredentialsView loginCredentialsView = this.f92565q0;
            StateFlow<Boolean> stateFlowIsFormValid = loginCredentialsView.getViewModel().isFormValid();
            a aVar = new a(loginCredentialsView);
            this.f92564p0 = 1;
            if (stateFlowIsFormValid.collect(aVar, this) == coroutine_suspended) {
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
