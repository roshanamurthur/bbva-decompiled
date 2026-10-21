package u9;

import com.bbva.component.ui.login.model.LoginViewType;
import com.bbva.component.ui.login.model.RememberedUserType;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import com.bbva.glomohybrid.login.domain.model.LoginAccessStateParam;
import com.bbva.glomohybrid.login.domain.usecase.FetchLoginAccessStateUseCase;
import com.bbva.glomohybrid.login.presentation.view.LoginContract;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginGlobalViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$initializeRememberedUserCredentialsState$1", f = "LoginGlobalViewModel.kt", i = {0}, l = {371}, m = "invokeSuspend", n = {"rememberedUser"}, s = {"L$1"})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public LoginGlobalViewModel f93748p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RememberedUser f93749q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f93750r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ LoginGlobalViewModel f93751s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LoginGlobalViewModel loginGlobalViewModel, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f93751s0 = loginGlobalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f93751s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LoginGlobalViewModel loginGlobalViewModel;
        RememberedUser rememberedUser;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93750r0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            loginGlobalViewModel = this.f93751s0;
            RememberedUser rememberedUser2 = loginGlobalViewModel.getRememberedUser();
            if (rememberedUser2 != null) {
                UserType userType = loginGlobalViewModel.getUserType();
                this.f93748p0 = loginGlobalViewModel;
                this.f93749q0 = rememberedUser2;
                this.f93750r0 = 1;
                Object objFetchHeader = loginGlobalViewModel.fetchHeader(rememberedUser2, userType, this);
                if (objFetchHeader == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rememberedUser = rememberedUser2;
                obj = objFetchHeader;
            }
            return Unit.INSTANCE;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rememberedUser = this.f93749q0;
        loginGlobalViewModel = this.f93748p0;
        ResultKt.throwOnFailure(obj);
        loginGlobalViewModel.f33572d1.tryEmit(new LoginContract.State.Ready(((FetchLoginAccessStateUseCase) loginGlobalViewModel.Z0.getValue()).execute(new LoginAccessStateParam(LoginViewType.REMEMBERED_USER, rememberedUser, (UserAvatarModel) obj, RememberedUserType.BIOMETRICS))));
        return Unit.INSTANCE;
    }
}
