package com.bbva.component.ui.login;

import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.component.ui.login.credentials.LoginCredentialsFormViewModel;
import com.bbva.component.ui.login.credentials.LoginEvent;
import com.bbva.component.ui.login.model.LoginState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginViewViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bbva/component/ui/login/LoginViewViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/ui/login/model/LoginState;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/component/ui/login/credentials/LoginEvent;", "loginEvents", "", "mergeEvents", "w0", "Lkotlinx/coroutines/flow/Flow;", "getOnEvents", "()Lkotlinx/coroutines/flow/Flow;", "onEvents", "<init>", "()V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final class LoginViewViewModel extends ViewModel<LoginState> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<LoginEvent> onEvents;

    /* JADX INFO: compiled from: LoginViewViewModel.kt */
    @DebugMetadata(c = "com.bbva.component.ui.login.LoginViewViewModel$mergeEvents$1", f = "LoginViewViewModel.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f28470p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Flow<LoginEvent> f28471q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LoginViewViewModel f28472r0;

        /* JADX INFO: renamed from: com.bbva.component.ui.login.LoginViewViewModel$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LoginViewViewModel.kt */
        public static final class C0121a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LoginViewViewModel f28473p0;

            public C0121a(LoginViewViewModel loginViewViewModel) {
                this.f28473p0 = loginViewViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                ActionSpec<LoginEvent> loginEvent = LoginCredentialsFormViewModel.INSTANCE.getLoginEvent();
                this.f28473p0.fire(loginEvent, (LoginEvent) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Flow<? extends LoginEvent> flow, LoginViewViewModel loginViewViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28471q0 = flow;
            this.f28472r0 = loginViewViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f28471q0, this.f28472r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f28470p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C0121a c0121a = new C0121a(this.f28472r0);
                this.f28470p0 = 1;
                if (this.f28471q0.collect(c0121a, this) == coroutine_suspended) {
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

    public LoginViewViewModel() {
        super(new JsonDeserializer(LoginState.INSTANCE.serializer()));
        this.onEvents = events(LoginCredentialsFormViewModel.INSTANCE.getLoginEvent());
    }

    @NotNull
    public final Flow<LoginEvent> getOnEvents() {
        return this.onEvents;
    }

    public final void mergeEvents(@NotNull Flow<? extends LoginEvent> loginEvents) {
        Intrinsics.checkNotNullParameter(loginEvents, "loginEvents");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(loginEvents, this, null), 3, null);
    }
}
