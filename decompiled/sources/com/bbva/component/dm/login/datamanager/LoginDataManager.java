package com.bbva.component.dm.login.datamanager;

import androidx.autofill.HintConstants;
import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.component.dm.login.data.datasource.AsoDataSource;
import com.bbva.component.dm.login.data.datasource.GlobalLoginDataSource;
import com.bbva.component.dm.login.data.datasource.JwtLoginDataSource;
import com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract;
import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.data.repository.LoginRepository;
import com.bbva.component.dm.login.datamanager.LoginDataManager;
import com.bbva.component.dm.login.datamanager.config.GlobalLoginConfig;
import com.bbva.component.dm.login.datamanager.config.JwtLoginConfig;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.component.dm.login.domain.boundary.LoginBoundary;
import com.bbva.component.dm.login.domain.model.LoginCredentials;
import com.bbva.component.dm.login.domain.model.LoginResult;
import com.bbva.component.dm.login.domain.usecase.DoAnonymousLoginUseCase;
import com.bbva.component.dm.login.domain.usecase.DoLogOutUseCase;
import com.bbva.component.dm.login.domain.usecase.DoLoginUseCase;
import com.bbva.ethermobilesdk.sharedstorage.ConstantsKt;
import com.bbva.network.NetworkWorker;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 F2\u00020\u0001:\u0001FB\u000f\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J+\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0002J\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0002J\u001b\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\"\u0010\u0014\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!RC\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\"8P@PX\u0090\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*RC\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\"8P@PX\u0090\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*RC\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\"8P@PX\u0090\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R+\u0010:\u001a\u0002042\u0006\u0010$\u001a\u0002048P@PX\u0090\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010&\u001a\u0004\b6\u00107\"\u0004\b8\u00109R+\u0010A\u001a\u00020;2\u0006\u0010$\u001a\u00020;8P@PX\u0090\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010&\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lcom/bbva/component/dm/login/datamanager/LoginDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "onPropertiesBound", "", HintConstants.AUTOFILL_HINT_USERNAME, "password", "fetchLogin", "Lcom/bbva/component/dm/login/domain/model/LoginResult;", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "getLogin", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAnonymousLogin", "getAnonymousLogin", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchLogout", "Ljava/lang/Void;", "getLogout", "getId", "dispose", "type", "Ljava/lang/String;", "getType$component_dm_login_release", "()Ljava/lang/String;", "setType$component_dm_login_release", "(Ljava/lang/String;)V", "", "", "config", "Ljava/util/Map;", "getConfig$component_dm_login_release", "()Ljava/util/Map;", "setConfig$component_dm_login_release", "(Ljava/util/Map;)V", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/login/domain/model/LoginCredentials;", "<set-?>", "q0", "Lkotlin/properties/ReadWriteProperty;", "getLoginUseCase$component_dm_login_release", "()Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "setLoginUseCase$component_dm_login_release", "(Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;)V", "loginUseCase", "r0", "getAnonymousLoginUseCase$component_dm_login_release", "setAnonymousLoginUseCase$component_dm_login_release", "anonymousLoginUseCase", "s0", "getLogoutUseCase$component_dm_login_release", "setLogoutUseCase$component_dm_login_release", "logoutUseCase", "Lcom/bbva/component/dm/login/domain/boundary/LoginBoundary;", "t0", "getLoginRepository$component_dm_login_release", "()Lcom/bbva/component/dm/login/domain/boundary/LoginBoundary;", "setLoginRepository$component_dm_login_release", "(Lcom/bbva/component/dm/login/domain/boundary/LoginBoundary;)V", "loginRepository", "Lcom/bbva/component/dm/login/data/datasource/contract/LoginDataSourceContract;", "u0", "getLoginDataSource$component_dm_login_release", "()Lcom/bbva/component/dm/login/data/datasource/contract/LoginDataSourceContract;", "setLoginDataSource$component_dm_login_release", "(Lcom/bbva/component/dm/login/data/datasource/contract/LoginDataSourceContract;)V", "loginDataSource", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "Companion", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public class LoginDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-dm-login";
    public Map<String, ? extends Object> config;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27710p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReadWriteProperty loginUseCase;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReadWriteProperty anonymousLoginUseCase;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReadWriteProperty logoutUseCase;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReadWriteProperty loginRepository;
    public String type;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReadWriteProperty loginDataSource;
    public static final /* synthetic */ KProperty<Object>[] v0 = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(LoginDataManager.class), "loginUseCase", "getLoginUseCase$component_dm_login_release()Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(LoginDataManager.class), "anonymousLoginUseCase", "getAnonymousLoginUseCase$component_dm_login_release()Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(LoginDataManager.class), "logoutUseCase", "getLogoutUseCase$component_dm_login_release()Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(LoginDataManager.class), "loginRepository", "getLoginRepository$component_dm_login_release()Lcom/bbva/component/dm/login/domain/boundary/LoginBoundary;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(LoginDataManager.class), "loginDataSource", "getLoginDataSource$component_dm_login_release()Lcom/bbva/component/dm/login/data/datasource/contract/LoginDataSourceContract;"))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final ActionSpec<LoginResponse> ACTION_LOGIN_SUCCESS = new ActionSpec<>("login-success");

    @JvmField
    @NotNull
    public static final ActionSpec<LoginException> ACTION_LOGIN_ERROR = new ActionSpec<>("login-error");

    @JvmField
    @NotNull
    public static final ActionSpec<LoginResponse> ACTION_ANONYMOUS_LOGIN_SUCCESS = new ActionSpec<>("anonymous-login-success");

    @JvmField
    @NotNull
    public static final ActionSpec<LoginException> ACTION_ANONYMOUS_LOGIN_ERROR = new ActionSpec<>("anonymous-login-error");

    @JvmField
    @NotNull
    public static final ActionSpec<Void> ACTION_LOGOUT_SUCCESS = new ActionSpec<>("logout-success");

    /* JADX INFO: compiled from: LoginDataManager.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/dm/login/datamanager/LoginDataManager$Companion;", "", "()V", "ACTION_ANONYMOUS_LOGIN_ERROR", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "ACTION_ANONYMOUS_LOGIN_SUCCESS", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "ACTION_LOGIN_ERROR", "ACTION_LOGIN_SUCCESS", "ACTION_LOGOUT_SUCCESS", "Ljava/lang/Void;", "ID", "", "component-dm-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LoginDataManager.kt */
    public static final class a<T> implements UseCase.UseCaseSuccessCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<LoginResult<LoginResponse>> f27716a;

        public a(SafeContinuation safeContinuation) {
            this.f27716a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Object obj) {
            this.f27716a.resumeWith(Result.m5535constructorimpl(new LoginResult.Success((LoginResponse) obj)));
        }
    }

    /* JADX INFO: compiled from: LoginDataManager.kt */
    public static final class b implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<LoginResult<LoginResponse>> f27717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LoginDataManager f27718b;

        public b(SafeContinuation safeContinuation, LoginDataManager loginDataManager) {
            this.f27717a = safeContinuation;
            this.f27718b = loginDataManager;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this.f27717a.resumeWith(Result.m5535constructorimpl(new LoginResult.Failure(LoginDataManager.access$asLoginException(this.f27718b, it))));
        }
    }

    /* JADX INFO: compiled from: LoginDataManager.kt */
    public static final class c<T> implements UseCase.UseCaseSuccessCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<LoginResult<LoginResponse>> f27719a;

        public c(SafeContinuation safeContinuation) {
            this.f27719a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Object obj) {
            this.f27719a.resumeWith(Result.m5535constructorimpl(new LoginResult.Success((LoginResponse) obj)));
        }
    }

    /* JADX INFO: compiled from: LoginDataManager.kt */
    public static final class d implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<LoginResult<LoginResponse>> f27720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LoginDataManager f27721b;

        public d(SafeContinuation safeContinuation, LoginDataManager loginDataManager) {
            this.f27720a = safeContinuation;
            this.f27721b = loginDataManager;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this.f27720a.resumeWith(Result.m5535constructorimpl(new LoginResult.Failure(LoginDataManager.access$asLoginException(this.f27721b, it))));
        }
    }

    /* JADX INFO: compiled from: LoginDataManager.kt */
    public static final class e<T> implements UseCase.UseCaseSuccessCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<LoginResult<Void>> f27722a;

        public e(SafeContinuation safeContinuation) {
            this.f27722a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Object obj) {
            this.f27722a.resumeWith(Result.m5535constructorimpl(new LoginResult.Success(null)));
        }
    }

    /* JADX INFO: compiled from: LoginDataManager.kt */
    public static final class f implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<LoginResult<Void>> f27723a;

        public f(SafeContinuation safeContinuation) {
            this.f27723a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable th2) {
            this.f27723a.resumeWith(Result.m5535constructorimpl(new LoginResult.Success(null)));
        }
    }

    public LoginDataManager(@NotNull NetworkWorker networkWorker) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        this.f27710p0 = networkWorker;
        Delegates delegates = Delegates.INSTANCE;
        this.loginUseCase = delegates.notNull();
        this.anonymousLoginUseCase = delegates.notNull();
        this.logoutUseCase = delegates.notNull();
        this.loginRepository = delegates.notNull();
        this.loginDataSource = delegates.notNull();
        newProperty("type", new Consumer() { // from class: a5.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f204p0.type = (String) obj;
            }
        });
        newProperty("config", new d4.a(this, 1));
    }

    public static LoginException a(Throwable th2) {
        LoginException loginException = th2 instanceof LoginException ? (LoginException) th2 : null;
        return loginException == null ? new LoginException(th2, (String) null, (LoginException.ErrorCategory) null, 6, (DefaultConstructorMarker) null) : loginException;
    }

    public static final /* synthetic */ LoginException access$asLoginException(LoginDataManager loginDataManager, Throwable th2) {
        loginDataManager.getClass();
        return a(th2);
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        super.dispose();
        getLoginUseCase$component_dm_login_release().dispose();
        getAnonymousLoginUseCase$component_dm_login_release().dispose();
        getLogoutUseCase$component_dm_login_release().dispose();
    }

    public final void fetchAnonymousLogin() {
        getAnonymousLoginUseCase$component_dm_login_release().execute(Unit.INSTANCE, new UseCase.UseCaseSuccessCallback() { // from class: a5.a
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                LoginDataManager.Companion companion = LoginDataManager.INSTANCE;
                LoginDataManager this$0 = this.f198a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.fire(LoginDataManager.ACTION_ANONYMOUS_LOGIN_SUCCESS, (LoginResponse) obj);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: a5.b
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable it) {
                LoginDataManager.Companion companion = LoginDataManager.INSTANCE;
                LoginDataManager this$0 = this.f199a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ActionSpec<LoginException> actionSpec = LoginDataManager.ACTION_ANONYMOUS_LOGIN_ERROR;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this$0.getClass();
                this$0.fire(actionSpec, LoginDataManager.a(it));
            }
        });
    }

    public final void fetchLogin(@NotNull String username, @NotNull String password) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        getLoginUseCase$component_dm_login_release().execute(new LoginCredentials(username, password), new UseCase.UseCaseSuccessCallback() { // from class: a5.c
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                LoginDataManager.Companion companion = LoginDataManager.INSTANCE;
                LoginDataManager this$0 = this.f200a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.fire(LoginDataManager.ACTION_LOGIN_SUCCESS, (LoginResponse) obj);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: a5.d
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable it) {
                LoginDataManager.Companion companion = LoginDataManager.INSTANCE;
                LoginDataManager this$0 = this.f201a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ActionSpec<LoginException> actionSpec = LoginDataManager.ACTION_LOGIN_ERROR;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this$0.getClass();
                this$0.fire(actionSpec, LoginDataManager.a(it));
            }
        });
    }

    public final void fetchLogout() {
        getLogoutUseCase$component_dm_login_release().execute(Unit.INSTANCE, new UseCase.UseCaseSuccessCallback() { // from class: a5.e
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                LoginDataManager.Companion companion = LoginDataManager.INSTANCE;
                LoginDataManager this$0 = this.f202a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.fire(LoginDataManager.ACTION_LOGOUT_SUCCESS);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: a5.f
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                LoginDataManager.Companion companion = LoginDataManager.INSTANCE;
                LoginDataManager this$0 = this.f203a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.fire(LoginDataManager.ACTION_LOGOUT_SUCCESS);
            }
        });
    }

    @Nullable
    public final Object getAnonymousLogin(@NotNull Continuation<? super LoginResult<LoginResponse>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        getAnonymousLoginUseCase$component_dm_login_release().execute(Unit.INSTANCE, new a(safeContinuation), new b(safeContinuation, this));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @NotNull
    public UseCase<LoginResponse, Unit> getAnonymousLoginUseCase$component_dm_login_release() {
        return (UseCase) this.anonymousLoginUseCase.getValue(this, v0[1]);
    }

    @NotNull
    public final Map<String, Object> getConfig$component_dm_login_release() {
        Map<String, ? extends Object> map = this.config;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("config");
        throw null;
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }

    @Nullable
    public final Object getLogin(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super LoginResult<LoginResponse>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        getLoginUseCase$component_dm_login_release().execute(new LoginCredentials(str, str2), new c(safeContinuation), new d(safeContinuation, this));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @NotNull
    public LoginDataSourceContract getLoginDataSource$component_dm_login_release() {
        return (LoginDataSourceContract) this.loginDataSource.getValue(this, v0[4]);
    }

    @NotNull
    public LoginBoundary getLoginRepository$component_dm_login_release() {
        return (LoginBoundary) this.loginRepository.getValue(this, v0[3]);
    }

    @NotNull
    public UseCase<LoginResponse, LoginCredentials> getLoginUseCase$component_dm_login_release() {
        return (UseCase) this.loginUseCase.getValue(this, v0[0]);
    }

    @Nullable
    public final Object getLogout(@NotNull Continuation<? super LoginResult<Void>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        getLogoutUseCase$component_dm_login_release().execute(Unit.INSTANCE, new e(safeContinuation), new f(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @NotNull
    public UseCase<Unit, Unit> getLogoutUseCase$component_dm_login_release() {
        return (UseCase) this.logoutUseCase.getValue(this, v0[2]);
    }

    @NotNull
    public final String getType$component_dm_login_release() {
        String str = this.type;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        throw null;
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
        LoginDataSourceContract globalLoginDataSource;
        String type$component_dm_login_release = getType$component_dm_login_release();
        int iHashCode = type$component_dm_login_release.hashCode();
        NetworkWorker networkWorker = this.f27710p0;
        if (iHashCode == -1243020381) {
            if (type$component_dm_login_release.equals(ConstantsKt.SCOPE_DEFAULT)) {
                globalLoginDataSource = new GlobalLoginDataSource(networkWorker, new GlobalLoginConfig(getConfig$component_dm_login_release()));
                setLoginDataSource$component_dm_login_release(globalLoginDataSource);
                setLoginRepository$component_dm_login_release(new LoginRepository(getLoginDataSource$component_dm_login_release()));
                setLoginUseCase$component_dm_login_release(new DoLoginUseCase(getLoginRepository$component_dm_login_release()));
                setAnonymousLoginUseCase$component_dm_login_release(new DoAnonymousLoginUseCase(getLoginRepository$component_dm_login_release()));
                setLogoutUseCase$component_dm_login_release(new DoLogOutUseCase(getLoginRepository$component_dm_login_release()));
                return;
            }
            throw new IllegalStateException("Unknown login type.");
        }
        if (iHashCode == 96893) {
            if (type$component_dm_login_release.equals("aso")) {
                globalLoginDataSource = new AsoDataSource(networkWorker, new GlobalLoginConfig(getConfig$component_dm_login_release()));
                setLoginDataSource$component_dm_login_release(globalLoginDataSource);
                setLoginRepository$component_dm_login_release(new LoginRepository(getLoginDataSource$component_dm_login_release()));
                setLoginUseCase$component_dm_login_release(new DoLoginUseCase(getLoginRepository$component_dm_login_release()));
                setAnonymousLoginUseCase$component_dm_login_release(new DoAnonymousLoginUseCase(getLoginRepository$component_dm_login_release()));
                setLogoutUseCase$component_dm_login_release(new DoLogOutUseCase(getLoginRepository$component_dm_login_release()));
                return;
            }
            throw new IllegalStateException("Unknown login type.");
        }
        if (iHashCode == 105671 && type$component_dm_login_release.equals(AccessToken.TYPE_JWT)) {
            globalLoginDataSource = new JwtLoginDataSource(networkWorker, new JwtLoginConfig(getConfig$component_dm_login_release()));
            setLoginDataSource$component_dm_login_release(globalLoginDataSource);
            setLoginRepository$component_dm_login_release(new LoginRepository(getLoginDataSource$component_dm_login_release()));
            setLoginUseCase$component_dm_login_release(new DoLoginUseCase(getLoginRepository$component_dm_login_release()));
            setAnonymousLoginUseCase$component_dm_login_release(new DoAnonymousLoginUseCase(getLoginRepository$component_dm_login_release()));
            setLogoutUseCase$component_dm_login_release(new DoLogOutUseCase(getLoginRepository$component_dm_login_release()));
            return;
        }
        throw new IllegalStateException("Unknown login type.");
    }

    public void setAnonymousLoginUseCase$component_dm_login_release(@NotNull UseCase<LoginResponse, Unit> useCase) {
        Intrinsics.checkNotNullParameter(useCase, "<set-?>");
        this.anonymousLoginUseCase.setValue(this, v0[1], useCase);
    }

    public final void setConfig$component_dm_login_release(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.config = map;
    }

    public void setLoginDataSource$component_dm_login_release(@NotNull LoginDataSourceContract loginDataSourceContract) {
        Intrinsics.checkNotNullParameter(loginDataSourceContract, "<set-?>");
        this.loginDataSource.setValue(this, v0[4], loginDataSourceContract);
    }

    public void setLoginRepository$component_dm_login_release(@NotNull LoginBoundary loginBoundary) {
        Intrinsics.checkNotNullParameter(loginBoundary, "<set-?>");
        this.loginRepository.setValue(this, v0[3], loginBoundary);
    }

    public void setLoginUseCase$component_dm_login_release(@NotNull UseCase<LoginResponse, LoginCredentials> useCase) {
        Intrinsics.checkNotNullParameter(useCase, "<set-?>");
        this.loginUseCase.setValue(this, v0[0], useCase);
    }

    public void setLogoutUseCase$component_dm_login_release(@NotNull UseCase<Unit, Unit> useCase) {
        Intrinsics.checkNotNullParameter(useCase, "<set-?>");
        this.logoutUseCase.setValue(this, v0[2], useCase);
    }

    public final void setType$component_dm_login_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }
}
