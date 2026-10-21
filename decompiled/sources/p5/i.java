package p5;

import com.bbva.component.ui.login.credentials.LoginCredentialsView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginCredentialsView.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.ui.login.credentials.LoginCredentialsView$updateLoginButton$1$1$1", f = "LoginCredentialsView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoginCredentialsView f92577p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(LoginCredentialsView loginCredentialsView, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f92577p0 = loginCredentialsView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new i(this.f92577p0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f92577p0.getViewModel().onLoginButtonTaped();
        return Unit.INSTANCE;
    }
}
