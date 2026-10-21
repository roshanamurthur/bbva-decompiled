package com.bbva.glomohybrid.login.presentation.viewmodel;

import android.annotation.SuppressLint;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModelKt;
import com.bbva.appsflyer.AppsFlyerAdapter;
import com.bbva.appsflyer.AppsFlyerController;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.component.ui.login.model.LoginResult;
import com.bbva.component.ui.modal.list.model.Item;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.usecase.LoginData;
import com.bbva.glomo.user.domain.usecase.StoreIsPnnUseCase;
import com.bbva.glomo.user.domain.usecase.StoreLoginDataUseCase;
import com.bbva.glomo.user.repository.datasource.FlowmeterDataSource;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.constants.CountryRouteConstants;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.cells.channels.AppStartReadyChannel;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.channels.EnrollmentChannels;
import com.bbva.glomohybrid.base.cells.channels.LoginChannels;
import com.bbva.glomohybrid.base.cells.components.ZipAction;
import com.bbva.glomohybrid.base.cells.components.ZipActionKt;
import com.bbva.glomohybrid.base.cells.components.ZipActionsComponent;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.base.session.SessionClosedException;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagRepositoryExtensionKt;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.login.channels.LegacyDataChannels;
import com.bbva.glomohybrid.login.data.model.MagicLogData;
import com.bbva.glomohybrid.login.data.repository.LegacyDataSource;
import com.bbva.glomohybrid.login.domain.constants.AppsFlyerConstants;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.glomohybrid.login.domain.mapper.CountryErrorModals;
import com.bbva.glomohybrid.login.domain.mapper.CountryLoginErrorMapperFactory;
import com.bbva.glomohybrid.login.domain.model.ClientStatus;
import com.bbva.glomohybrid.login.domain.model.CountryLoginErrorType;
import com.bbva.glomohybrid.login.domain.model.CustomerIndicatorsLogins;
import com.bbva.glomohybrid.login.domain.model.CustomerIndicatorsLoginsKt;
import com.bbva.glomohybrid.login.domain.model.DeviceAccessPayload;
import com.bbva.glomohybrid.login.domain.model.NativeLinkPage;
import com.bbva.glomohybrid.login.domain.model.UserCredentials;
import com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase;
import com.bbva.glomohybrid.login.extensions.UserCredentialsExtensionKt;
import com.bbva.glomohybrid.login.model.constants.ActionConstants;
import com.bbva.glomohybrid.login.model.enums.LoaderState;
import com.bbva.glomohybrid.login.presentation.reactions.LoginModals;
import com.bbva.glomohybrid.login.presentation.view.LoginContract;
import com.bbva.glomohybrid.login.presentation.viewmodel.handler.CountryLoginAnalyticsHandler;
import com.bbva.glomoutils.CustomerExtensionsKt;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import u9.f;
import u9.g;
import u9.h;

/* JADX INFO: compiled from: LoginViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0019\u0012\u0006\u0010:\u001a\u000209\u0012\b\b\u0002\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J*\u0010\u000e\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u0016J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u001e\u0010\u0017\u001a\u00020\u00022\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016J\u0013\u0010\u0018\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\b\u0010\u001b\u001a\u00020\tH\u0014J\b\u0010\u001c\u001a\u00020\u0002H\u0014J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u0006\u0010\u001e\u001a\u00020\u0002J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020\u0002H\u0016J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020&J\b\u0010(\u001a\u00020\u0002H\u0016J\b\u0010)\u001a\u00020\u0002H\u0016J\u000e\u0010+\u001a\u00020\u00022\u0006\u0010 \u001a\u00020*R\u001b\u00101\u001a\u00020,8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00103\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/viewmodel/LoginViewModel;", "Lcom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel;", "", "onViewCreate", "initView", "Lcom/bbva/component/ui/modal/list/model/Item;", AnalyticsConstants.Key.ITEM, "setDocument", "openSelectorDocumentModal", "", "route", "", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "setNativeLinkPage", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "loginResponse", "onLoginSuccess", "Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "exception", "onLoginError", "nextStepLoginSuccess", "errors", "manageCustomerErrors", "sendLoginProfileToAnalytics", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendExternalDeviceIdToWeb", "getPostLoginWebRoute", "onCleared", "trackGoogleAssistantLoginScreen", "standInZipActionsCompleted", "Lcom/bbva/component/ui/login/model/LoginResult;", "data", "handleOnLoginButtonTaped", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "customer", "saveUserDataAndNotifyRememberedUser", "setupActions", "Lcom/bbva/glomohybrid/login/domain/model/CustomerIndicatorsLogins;", "saveUserDataAndNotifyRememberedUserCustomerLogins", "openWebDeviceActivation", "onRememberedPasswordTaped", "Lcom/bbva/glomohybrid/login/data/model/MagicLogData;", "handleMagicLogLogin", "Lcom/bbva/glomo/user/repository/datasource/FlowmeterDataSource;", "n1", "Lkotlin/Lazy;", "getFlowmeterDataSource", "()Lcom/bbva/glomo/user/repository/datasource/FlowmeterDataSource;", "flowmeterDataSource", "Lcom/bbva/glomohybrid/login/domain/model/ClientStatus;", "clientStatus", "Lcom/bbva/glomohybrid/login/domain/model/ClientStatus;", "getClientStatus", "()Lcom/bbva/glomohybrid/login/domain/model/ClientStatus;", "setClientStatus", "(Lcom/bbva/glomohybrid/login/domain/model/ClientStatus;)V", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/CountryLoginAnalyticsHandler;", "countryLoginAnalyticsHandler", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/CountryLoginAnalyticsHandler;)V", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n+ 5 Koin.kt\norg/koin/core/Koin\n*L\n1#1,552:1\n56#2,6:553\n56#2,6:559\n56#2,6:565\n56#2,6:571\n56#2,6:577\n56#2,6:583\n41#2,6:590\n47#2:597\n41#2,6:599\n47#2:606\n41#2,6:608\n47#2:615\n1#3:589\n133#4:596\n133#4:605\n133#4:614\n107#5:598\n107#5:607\n107#5:616\n*S KotlinDebug\n*F\n+ 1 LoginViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginViewModel\n*L\n91#1:553,6\n92#1:559,6\n93#1:565,6\n94#1:571,6\n101#1:577,6\n103#1:583,6\n374#1:590,6\n374#1:597\n381#1:599,6\n381#1:606\n400#1:608,6\n400#1:615\n374#1:596\n381#1:605\n400#1:614\n374#1:598\n381#1:607\n400#1:616\n*E\n"})
public final class LoginViewModel extends LoginGlobalViewModel {

    @NotNull
    public static final String AUTH_TYPE_BIOMETRIC = "106";

    @NotNull
    public static final String AUTH_TYPE_PASSWORD = "02";

    @NotNull
    public static final String ID = "login-view-model";

    @NotNull
    public static final String STANDIN = "standin";
    public ClientStatus clientStatus;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    @NotNull
    public final CountryLoginAnalyticsHandler f33705k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    @NotNull
    public final Lazy f33706l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    @NotNull
    public final Lazy f33707m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy flowmeterDataSource;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @NotNull
    public final Lazy f33709o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    public final Lazy f33710p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @NotNull
    public final Lazy f33711q1;

    @NotNull
    public final Lazy r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public boolean f33712s1;

    /* JADX INFO: compiled from: LoginViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserType.values().length];
            try {
                iArr[UserType.PERSONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserType.ENTERPRISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: LoginViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$handleMagicLogLogin$1", f = "LoginViewModel.kt", i = {}, l = {544}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33713p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MagicLogData f33715r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MagicLogData magicLogData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f33715r0 = magicLogData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginViewModel.this.new a(this.f33715r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33713p0;
            LoginViewModel loginViewModel = LoginViewModel.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MagicLogData magicLogData = this.f33715r0;
                loginViewModel.setUserValid(new UserCredentials(magicLogData.getContactNumber(), magicLogData.getPassword()));
                this.f33713p0 = 1;
                if (loginViewModel.configureProfile$Login_mexicoGoogleRelease(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CellsReactor.fire("login-view-model", ActionConstants.INSTANCE.getDO_LOGIN(), loginViewModel.getUserValid());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$saveUserDataAndNotifyRememberedUser$1", f = "LoginViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f33717q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f33717q0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginViewModel.this.new b(this.f33717q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LoginViewModel loginViewModel = LoginViewModel.this;
            StoreIsPnnUseCase storeIsPnnUseCaseAccess$getStoreIsPnnUseCase = LoginViewModel.access$getStoreIsPnnUseCase(loginViewModel);
            boolean z10 = this.f33717q0;
            storeIsPnnUseCaseAccess$getStoreIsPnnUseCase.execute(z10);
            MessageDispatcher messageDispatcher = loginViewModel.getMessageDispatcher();
            String name = LoginChannels.INSTANCE.getPhysicalPersonBusiness().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            messageDispatcher.sendMessage(name, Boxing.boxBoolean(z10));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$saveUserDataAndNotifyRememberedUserCustomerLogins$1", f = "LoginViewModel.kt", i = {}, l = {492, 498, TypedValues.PositionType.TYPE_PERCENT_X}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33718p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CustomerIndicatorsLogins f33720r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CustomerIndicatorsLogins customerIndicatorsLogins, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f33720r0 = customerIndicatorsLogins;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginViewModel.this.new c(this.f33720r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:23:0x00ba A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws SessionClosedException {
            Object rememberedUser;
            MessageDispatcher messageDispatcherAccess$getWebDispatcher;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33718p0;
            CustomerIndicatorsLogins customerIndicatorsLogins = this.f33720r0;
            LoginViewModel loginViewModel = LoginViewModel.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i10 == 2) {
                    ResultKt.throwOnFailure(obj);
                    rememberedUser = obj;
                    CellsReactor.fire("login-view-model", com.bbva.glomohybrid.base.cells.constants.ActionConstants.INSTANCE.getACTION_REMEMBER_USER_COMPLETED(), (RememberedUser) rememberedUser);
                    loginViewModel.getSession().initialize().setCustomerIndicatorsLogins(customerIndicatorsLogins);
                    messageDispatcherAccess$getWebDispatcher = LoginViewModel.access$getWebDispatcher(loginViewModel);
                    if (messageDispatcherAccess$getWebDispatcher != null) {
                        messageDispatcherAccess$getWebDispatcher.sendMessage(CellsChannels.NATIVE_LOGIN_SUCCESS_CHANNEL, customerIndicatorsLogins);
                    }
                    loginViewModel.f33705k1.trackEvent(AnalyticsEvent.LOGIN_SUCCESS);
                    this.f33718p0 = 3;
                    if (loginViewModel.sendLoginProfileToAnalytics(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LoginViewModel.access$getStoreIsPnnUseCase(loginViewModel).execute(CustomerIndicatorsLoginsKt.hasBusinessClassificationCustomer(customerIndicatorsLogins));
            MessageDispatcher messageDispatcher = loginViewModel.getMessageDispatcher();
            String name = LoginChannels.INSTANCE.getPhysicalPersonBusiness().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            messageDispatcher.sendMessage(name, Boxing.boxBoolean(CustomerIndicatorsLoginsKt.hasBusinessClassificationCustomer(customerIndicatorsLogins)));
            LoginViewModel loginViewModel2 = LoginViewModel.this;
            String firstName = customerIndicatorsLogins.getFirstName();
            Intrinsics.checkNotNull(firstName);
            String lastName = customerIndicatorsLogins.getLastName();
            String customerId = customerIndicatorsLogins.getCustomerId();
            this.f33718p0 = 1;
            if (LoginGlobalViewModel.storeRememberedUserData$default(loginViewModel2, firstName, lastName, false, customerId, null, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f33718p0 = 2;
            rememberedUser = loginViewModel.getRememberedUser(this);
            if (rememberedUser == coroutine_suspended) {
                return coroutine_suspended;
            }
            CellsReactor.fire("login-view-model", com.bbva.glomohybrid.base.cells.constants.ActionConstants.INSTANCE.getACTION_REMEMBER_USER_COMPLETED(), (RememberedUser) rememberedUser);
            loginViewModel.getSession().initialize().setCustomerIndicatorsLogins(customerIndicatorsLogins);
            messageDispatcherAccess$getWebDispatcher = LoginViewModel.access$getWebDispatcher(loginViewModel);
            if (messageDispatcherAccess$getWebDispatcher != null) {
                messageDispatcherAccess$getWebDispatcher.sendMessage(CellsChannels.NATIVE_LOGIN_SUCCESS_CHANNEL, customerIndicatorsLogins);
            }
            loginViewModel.f33705k1.trackEvent(AnalyticsEvent.LOGIN_SUCCESS);
            this.f33718p0 = 3;
            if (loginViewModel.sendLoginProfileToAnalytics(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$sendLoginProfileToAnalytics$2", f = "LoginViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String customerId;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LoginViewModel loginViewModel = LoginViewModel.this;
            AnalyticsEvent analyticsEvent = loginViewModel.getRememberedUser() == null ? AnalyticsEvent.LOGIN_PROFILE : AnalyticsEvent.LOGIN_CACHE_PROFILE;
            RememberedUser rememberedUser = loginViewModel.getRememberedUser();
            if (rememberedUser == null || (customerId = rememberedUser.getCustomerId()) == null) {
                customerId = "";
            }
            loginViewModel.f33705k1.addLoginAnalyticData(analyticsEvent, customerId);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginViewModel.kt */
    public static final class e extends Lambda implements Function0<MessageDispatcher> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f33722p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ViewModelComponentsProviders viewModelComponentsProviders) {
            super(0);
            this.f33722p0 = viewModelComponentsProviders;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MessageDispatcher invoke() {
            return (MessageDispatcher) this.f33722p0.provide("web-dispatcher");
        }
    }

    public /* synthetic */ LoginViewModel(ViewModelComponentsProviders viewModelComponentsProviders, CountryLoginAnalyticsHandler countryLoginAnalyticsHandler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new CountryLoginAnalyticsHandler(viewModelComponentsProviders) : countryLoginAnalyticsHandler);
    }

    public static final void access$addCustomerAction(LoginViewModel loginViewModel) {
        String id;
        ZipActionsComponent zipComponent = loginViewModel.getZipComponent();
        if (zipComponent != null) {
            ZipAction[] zipActionArr = new ZipAction[1];
            String[] strArr = new String[1];
            if (!loginViewModel.f33712s1 || FeatureFlagRepositoryExtensionKt.isLowCostDisabled((FeatureFlagsRepository) loginViewModel.f33706l1.getValue())) {
                id = CustomerDataManager.ACTION_GET_CUSTOMER_SUCCESS.getId();
                Intrinsics.checkNotNull(id);
            } else {
                id = GetCustomerLoginsUseCase.ACTION_GET_CUSTOMER_INDICATORS_LOGINS_SUCCESS.getId();
                Intrinsics.checkNotNull(id);
            }
            strArr[0] = id;
            zipActionArr[0] = ZipActionKt.allOf(strArr);
            zipComponent.addActions(zipActionArr);
        }
    }

    public static final void access$getCustomerIndicators(LoginViewModel loginViewModel) {
        loginViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(loginViewModel), null, null, new f(loginViewModel, null), 3, null);
    }

    public static final FeatureFlagsRepository access$getFeatureFlagsRepository(LoginViewModel loginViewModel) {
        return (FeatureFlagsRepository) loginViewModel.f33706l1.getValue();
    }

    public static final GetCustomerLoginsUseCase access$getGetCustomerLoginsUseCase(LoginViewModel loginViewModel) {
        return (GetCustomerLoginsUseCase) loginViewModel.f33711q1.getValue();
    }

    public static final StoreIsPnnUseCase access$getStoreIsPnnUseCase(LoginViewModel loginViewModel) {
        return (StoreIsPnnUseCase) loginViewModel.f33710p1.getValue();
    }

    public static final String access$getUserDocument(LoginViewModel loginViewModel) {
        String document;
        if (loginViewModel.isUserValidInitialized()) {
            return loginViewModel.getUserValid().getUser();
        }
        RememberedUser rememberedUser = loginViewModel.getRememberedUser();
        return (rememberedUser == null || (document = rememberedUser.getDocument()) == null) ? "" : document;
    }

    public static final MessageDispatcher access$getWebDispatcher(LoginViewModel loginViewModel) {
        return (MessageDispatcher) loginViewModel.r1.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void access$saveLoginDataWhenBiometric(LoginViewModel loginViewModel) {
        LoginData loginData = new LoginData(MainStorage.getString$default((MainStorage) loginViewModel.f33709o1.getValue(), "localStorageClientId", null, false, null, 14, null), ConfigConstantsKt.GLOMO_CONSUMER_ID, "106");
        ViewModelComponentsProviders provider = loginViewModel.getProvider();
        ((StoreLoginDataUseCase) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : androidx.camera.core.impl.utils.c.f(provider)).get(Reflection.getOrCreateKotlinClass(StoreLoginDataUseCase.class), null, null)).execute2(loginData);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x0096 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean d(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 2098:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_PIN_BLOCKED)) {
                        return true;
                    }
                    break;
                case 2129:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BRANCH)) {
                        return true;
                    }
                    break;
                case 2155:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS)) {
                        return true;
                    }
                    break;
                case 2206:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC)) {
                        return true;
                    }
                    break;
                case 2487:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_NEW_CLIENT)) {
                        return true;
                    }
                    break;
                case 2545:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_PA)) {
                        return true;
                    }
                    break;
                case 2546:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_USER_BLOCKED)) {
                        return true;
                    }
                    break;
                case 2549:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_PE)) {
                        return true;
                    }
                    break;
                case 2563:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_PS)) {
                        return true;
                    }
                    break;
                case 2625:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_TEMPORARY_SUSPENSION)) {
                        return true;
                    }
                    break;
                case 51664:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_ERASED)) {
                        return true;
                    }
                    break;
                case 51730:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_DEVICE_NOT_REGISTER)) {
                        return true;
                    }
                    break;
                case 52509:
                    if (str.equals("519")) {
                        return true;
                    }
                    break;
                case 141608544:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_REACTIVATE)) {
                        return true;
                    }
                    break;
                case 1631478849:
                    if (str.equals(LoginHelperConstants.CLIENT_STATUS_CANCELLED_LOGIN_ERROR)) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    @NotNull
    public final ClientStatus getClientStatus() {
        ClientStatus clientStatus = this.clientStatus;
        if (clientStatus != null) {
            return clientStatus;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clientStatus");
        return null;
    }

    @NotNull
    public final FlowmeterDataSource getFlowmeterDataSource() {
        return (FlowmeterDataSource) this.flowmeterDataSource.getValue();
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    @NotNull
    public String getPostLoginWebRoute() {
        if (!existValidNativeLinkRoute$Login_mexicoGoogleRelease()) {
            return getPostLoginRoute();
        }
        NativeLinkPage nativeLinkPage = getNativeLinkPage();
        String route = nativeLinkPage != null ? nativeLinkPage.getRoute() : null;
        Intrinsics.checkNotNull(route);
        setNativeLinkPage(null);
        return route;
    }

    public final void handleMagicLogLogin(@NotNull MagicLogData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(data, null), 3, null);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void handleOnLoginButtonTaped(@NotNull LoginResult data) {
        Intrinsics.checkNotNullParameter(data, "data");
        UserCredentials map = getUserCredentialsMapper$Login_mexicoGoogleRelease().map(data, getRememberedUser());
        if (map.getUser().length() > 0 && map.getUser().length() > 2) {
            getFlowmeterDataSource().persistLastNumber(StringsKt___StringsKt.takeLast(map.getUser(), 2));
        }
        if (FeatureFlagRepositoryExtensionKt.isStandInEnabled((FeatureFlagsRepository) this.f33706l1.getValue()) && getRememberedUser() == null) {
            get_modals().setValue(new ModalType.StandIn(CountryErrorModals.standIn));
        } else {
            super.handleOnLoginButtonTaped(data);
        }
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void initView() {
        ZipActionsComponent zipComponent;
        UserType userType = UserType.PERSONAL;
        setPostLoginRoute(RouteConstants.DASHBOARD);
        String id = AppStartReadyChannel.INSTANCE.getACTION_APP_READY().getId();
        int i10 = WhenMappings.$EnumSwitchMapping$0[userType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 && (zipComponent = getZipComponent()) != null) {
                Intrinsics.checkNotNull(id);
                zipComponent.removeAction(id);
                return;
            }
            return;
        }
        ZipActionsComponent zipComponent2 = getZipComponent();
        if (zipComponent2 != null) {
            Intrinsics.checkNotNull(id);
            zipComponent2.addAction(ZipActionKt.just(id));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        if (kotlin.text.l.equals$default(r11.getErrorCode(), com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants.ERROR_CODE_INVALID_CREDENTIAL, false, 2, null) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0113, code lost:
    
        if (kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r3, (java.lang.CharSequence) com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants.ERROR_CODE_TSECNULL, false, 2, (java.lang.Object) null) != false) goto L61;
     */
    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void manageCustomerErrors(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel.manageCustomerErrors(java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void nextStepLoginSuccess(@Nullable LoginResponse loginResponse) {
        sendUserId$Login_mexicoGoogleRelease();
        configureShortcuts();
        setLoginLoaderState(LoaderState.NEXT);
        sendExternalDeviceIdToWeb();
        if (loginResponse != null) {
            LoginData loginData = new LoginData(loginResponse.getPersonId(), ConfigConstantsKt.GLOMO_CONSUMER_ID, "02");
            ViewModelComponentsProviders provider = getProvider();
            ((StoreLoginDataUseCase) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : androidx.camera.core.impl.utils.c.f(provider)).get(Reflection.getOrCreateKotlinClass(StoreLoginDataUseCase.class), null, null)).execute2(loginData);
        }
        String legacySerialNumber = ((LegacyDataSource) this.f33707m1.getValue()).getLegacySerialNumber();
        if (legacySerialNumber != null) {
            MessageDispatcher messageDispatcher = getMessageDispatcher();
            String name = LegacyDataChannels.INSTANCE.getSerialNumber().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            messageDispatcher.sendMessage(name, legacySerialNumber);
        }
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        resetBiometricsSessionState();
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void onLoginError(@NotNull LoginException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (d(exception.getCode())) {
            LoginGlobalViewModel.openWeb$default(this, "digitalActivation", Animation.SlideRight.INSTANCE, null, 4, null);
            return;
        }
        CountryLoginErrorType countryLoginErrorTypeCreate = new CountryLoginErrorMapperFactory().create(exception);
        logLoginException(exception);
        CountryErrorModals countryErrorModals = (CountryErrorModals) getProvider().provide(LoginModals.ID);
        String modalId = countryErrorModals != null ? countryErrorModals.getModalId(countryLoginErrorTypeCreate) : null;
        get_modals().setValue(modalId != null ? new ModalType.ErrorById(modalId) : ModalType.ErrorGeneric.INSTANCE);
        setIntent(LoginContract.Intent.CredentialsErrorViewState.INSTANCE);
        LoginGlobalViewModel.trackLoginErrorAnalytic$default(this, exception, null, 2, null);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void onLoginSuccess(@Nullable LoginResponse loginResponse) {
        String document;
        int iHashCode;
        if (isUserValidInitialized()) {
            document = getUserValid().getUser();
        } else {
            RememberedUser rememberedUser = getRememberedUser();
            if (rememberedUser == null || (document = rememberedUser.getDocument()) == null) {
                document = "";
            }
        }
        if (UserCredentialsExtensionKt.isDummyUser(new UserCredentials(document, ""))) {
            getDeviceIdDataSource().persistDeviceId(UserCredentialsExtensionKt.DUMMY_DEVICE_ID);
        }
        setClientStatus(new ClientStatus(loginResponse != null ? loginResponse.getClientStatus() : null));
        Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new h(this, null), 3, null);
        String clientStatus = loginResponse != null ? loginResponse.getClientStatus() : null;
        if (clientStatus != null && ((iHashCode = clientStatus.hashCode()) == 2129 ? clientStatus.equals(LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BRANCH) : iHashCode == 2155 ? clientStatus.equals(LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS) : iHashCode == 2206 && clientStatus.equals(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC))) {
            get_modals().setValue(ModalType.DeviceActivation.INSTANCE);
            return;
        }
        if (FeatureFlagRepositoryExtensionKt.isStandInEnabled((FeatureFlagsRepository) this.f33706l1.getValue())) {
            if (!d(loginResponse != null ? loginResponse.getClientStatus() : null)) {
                standInZipActionsCompleted();
                nextStepLoginSuccess(loginResponse);
                MessageDispatcher messageDispatcher = (MessageDispatcher) this.r1.getValue();
                if (messageDispatcher != null) {
                    messageDispatcher.sendMessage(CellsChannels.NATIVE_LOGIN_SUCCESS_CHANNEL, Boolean.TRUE);
                    return;
                }
                return;
            }
        }
        validatePasswordQuality();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new u9.e(deferredAsync$default, this, null), 3, null);
        nextStepLoginSuccess(loginResponse);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void onRememberedPasswordTaped() {
        super.onRememberedPasswordTaped();
        LoginGlobalViewModel.openWeb$default(this, "keyRecovery", null, null, 6, null);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void onViewCreate() {
        trackEvent$Login_mexicoGoogleRelease(AnalyticsEvent.LOGIN_SCREEN);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void openWebDeviceActivation() {
        openWeb(CountryRouteConstants.DEVICE_ACCESS, Animation.SlideRight.INSTANCE, new DeviceAccessPayload(getUserValid().getUser(), getClientStatus().getStatus(), null));
        clearLoginLoaderState$Login_mexicoGoogleRelease();
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void saveUserDataAndNotifyRememberedUser(@NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(customer, "customer");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b(CustomerExtensionsKt.hasBusinessClassification(customer), null), 3, null);
        super.saveUserDataAndNotifyRememberedUser(customer);
    }

    public final void saveUserDataAndNotifyRememberedUserCustomerLogins(@NotNull CustomerIndicatorsLogins customer) {
        Intrinsics.checkNotNullParameter(customer, "customer");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(customer, null), 3, null);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    @SuppressLint({"MissingPermission"})
    public void sendExternalDeviceIdToWeb() {
        MessageDispatcher messageDispatcher = getMessageDispatcher();
        String name = EnrollmentChannels.INSTANCE.getDeviceAccessesDeviceId().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String deviceId = getDeviceIdDataSource().getDeviceId();
        if (deviceId == null) {
            deviceId = "";
        }
        messageDispatcher.sendMessage(name, deviceId);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    @Nullable
    public Object sendLoginProfileToAnalytics(@NotNull Continuation<? super Unit> continuation) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new d(null), 3, null);
        return Unit.INSTANCE;
    }

    public final void setClientStatus(@NotNull ClientStatus clientStatus) {
        Intrinsics.checkNotNullParameter(clientStatus, "<set-?>");
        this.clientStatus = clientStatus;
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void setDocument(@NotNull Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void setNativeLinkPage(@Nullable String route, @Nullable Map<String, ? extends Object> payload) {
        setNativeLinkPage(new NativeLinkPage(route, payload));
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void setupActions() {
        ZipActionsComponent zipComponent = getZipComponent();
        if (zipComponent != null) {
            String id = CustomerDataManager.ACTION_GET_CUSTOMER_ERROR.getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            String id2 = com.bbva.glomohybrid.base.cells.constants.ActionConstants.INSTANCE.getACTION_REMEMBER_USER_COMPLETED().getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            String id3 = AppStartReadyChannel.INSTANCE.getACTION_APP_READY().getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
            zipComponent.addActions(ZipActionKt.anyError(id), ZipActionKt.allOf(id2), ZipActionKt.just(id3));
        }
        configDeeplinkObservers();
    }

    public final void standInZipActionsCompleted() {
        manageCustomerSuccess();
        setPostLoginRoute("geolocation");
        preloadNavigation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void trackGoogleAssistantLoginScreen() {
        ViewModelComponentsProviders provider = getProvider();
        AppsFlyerAdapter appsFlyerAdapter = (AppsFlyerAdapter) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : androidx.camera.core.impl.utils.c.f(provider)).get(Reflection.getOrCreateKotlinClass(AppsFlyerController.class), null, null);
        HashMap map = new HashMap();
        map.put(AppsFlyerConstants.GOOGLE_ASSISTANT_TRACK_EVENT_PARAM_ADD_LOGIN, AppsFlyerConstants.GOOGLE_ASSISTANT_TRACK_EVENT);
        map.put("af_content_type", AppsFlyerConstants.GOOGLE_ASSISTANT_TRACK_EVENT_PARAM);
        appsFlyerAdapter.trackEvent(AppsFlyerConstants.GOOGLE_ASSISTANT_TRACK_EVENT, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LoginViewModel(@NotNull final ViewModelComponentsProviders provider, @NotNull CountryLoginAnalyticsHandler countryLoginAnalyticsHandler) {
        super(provider, countryLoginAnalyticsHandler);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(countryLoginAnalyticsHandler, "countryLoginAnalyticsHandler");
        this.f33705k1 = countryLoginAnalyticsHandler;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f33706l1 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FeatureFlagsRepository>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FeatureFlagsRepository invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f33707m1 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<LegacyDataSource>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.login.data.repository.LegacyDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LegacyDataSource invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(LegacyDataSource.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.flowmeterDataSource = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<FlowmeterDataSource>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.user.repository.datasource.FlowmeterDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FlowmeterDataSource invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(FlowmeterDataSource.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.f33709o1 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<MainStorage>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.storage.MainStorage, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MainStorage invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(MainStorage.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.f33710p1 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<StoreIsPnnUseCase>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.user.domain.usecase.StoreIsPnnUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StoreIsPnnUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(StoreIsPnnUseCase.class), objArr8, objArr9);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.f33711q1 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<GetCustomerLoginsUseCase>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetCustomerLoginsUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(GetCustomerLoginsUseCase.class), objArr10, objArr11);
            }
        });
        this.r1 = LazyKt__LazyJVMKt.lazy(new e(provider));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g(this, null), 3, null);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel
    public void openSelectorDocumentModal() {
    }
}
