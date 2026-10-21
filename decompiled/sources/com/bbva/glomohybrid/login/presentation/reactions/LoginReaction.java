package com.bbva.glomohybrid.login.presentation.reactions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import androidx.camera.camera2.internal.h0;
import androidx.datastore.preferences.protobuf.q;
import bk.d;
import com.bbva.actionlauncher.AndroidActionLauncher;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.reactor.GlobalReaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.navigation.Dispatcher;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.datamanager.LoginDataManager;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.component.ui.loader.LoaderViewModel;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.component.ui.toolbar.ToolbarViewModel;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.AppStartReadyChannel;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.components.ZipActionsComponent;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.base.extensions.PageDelegatorExtensionsKt;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.base.shortcuts.ShortcutActions;
import com.bbva.glomohybrid.base.shortcuts.ShortcutComponentLauncher;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import com.bbva.glomohybrid.infoscreen.biometric.RetryBiometricAuthActivity;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.domain.mapper.CountryErrorModals;
import com.bbva.glomohybrid.login.domain.model.UserCredentials;
import com.bbva.glomohybrid.login.model.constants.ActionConstants;
import com.bbva.glomohybrid.login.model.enums.LoaderState;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import com.bbva.glomohybrid.logs.LogHandlers;
import com.bbva.glomohybrid.logs.LoggerKt;
import i8.e;
import i8.f;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import w4.k;
import w4.l;
import w4.r;

/* JADX INFO: compiled from: LoginReaction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0015J\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/reactions/LoginReaction;", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "", "onStop", "configure", "configureWebViewReactions", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;", "halfModalComponent", "<init>", "(Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;)V", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginReaction.kt\ncom/bbva/glomohybrid/login/presentation/reactions/LoginReaction\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,393:1\n67#2,5:394\n25#2,8:399\n82#2:407\n67#2,5:408\n25#2,8:413\n82#2:421\n25#2,8:422\n25#2,8:430\n59#2,7:438\n25#2,8:445\n30#2,3:453\n25#2,8:456\n25#2,8:464\n25#2,8:472\n25#2,8:480\n25#2,8:488\n25#2,8:496\n25#2,8:504\n25#2,8:512\n25#2,8:520\n*S KotlinDebug\n*F\n+ 1 LoginReaction.kt\ncom/bbva/glomohybrid/login/presentation/reactions/LoginReaction\n*L\n165#1:394,5\n165#1:399,8\n165#1:407\n177#1:408,5\n177#1:413,8\n177#1:421\n317#1:422,8\n320#1:430,8\n325#1:438,7\n328#1:445,8\n333#1:453,3\n338#1:456,8\n343#1:464,8\n348#1:472,8\n358#1:480,8\n363#1:488,8\n372#1:496,8\n377#1:504,8\n383#1:512,8\n389#1:520,8\n*E\n"})
public final class LoginReaction extends BaseReaction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public final HalfModalComponent H0;
    public boolean I0;

    @NotNull
    public final Lazy J0;

    @NotNull
    public final Lazy K0;

    @NotNull
    public final Lazy L0;

    @NotNull
    public final Lazy M0;

    /* JADX INFO: compiled from: LoginReaction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/reactions/LoginReaction$Companion;", "", "()V", "LIST_MODAL_ID", "", "LOG_TAG", "UNAUTHORIZED_MODAL", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LoginReaction.kt */
    public static final class a extends Lambda implements Function0<AndroidActionLauncher> {
        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final AndroidActionLauncher invoke() {
            Application application = ((GlobalReaction) LoginReaction.this).mActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            return new AndroidActionLauncher(application, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: LoginReaction.kt */
    public static final class b extends Lambda implements Function0<CountryLoginReaction> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CountryLoginReaction invoke() {
            LoginReaction loginReaction = LoginReaction.this;
            Activity activity = ((GlobalReaction) loginReaction).mActivity;
            Intrinsics.checkNotNullExpressionValue(activity, "access$getMActivity$p$s-996350830(...)");
            return new CountryLoginReaction(loginReaction, activity);
        }
    }

    /* JADX INFO: compiled from: LoginReaction.kt */
    public static final class c extends Lambda implements Function0<CountryErrorModals> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CountryErrorModals invoke() {
            LoginReaction loginReaction = LoginReaction.this;
            return new CountryErrorModals(loginReaction, loginReaction.H0);
        }
    }

    /* JADX INFO: compiled from: LoginReaction.kt */
    public static final class d extends Lambda implements Function0<List<? extends PageReactionDelegator>> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends PageReactionDelegator> invoke() {
            LoginReaction loginReaction = LoginReaction.this;
            return CollectionsKt__CollectionsKt.listOf((Object[]) new PageReactionDelegator[]{LoginReaction.access$getCountryLoginReaction(loginReaction), new LoginRememberedUserReaction(loginReaction), new SnackbarReactions(loginReaction)});
        }
    }

    public LoginReaction(@NotNull HalfModalComponent halfModalComponent) {
        Intrinsics.checkNotNullParameter(halfModalComponent, "halfModalComponent");
        this.H0 = halfModalComponent;
        this.I0 = true;
        this.J0 = LazyKt__LazyJVMKt.lazy(new b());
        this.K0 = LazyKt__LazyJVMKt.lazy(new c());
        this.L0 = LazyKt__LazyJVMKt.lazy(new a());
        this.M0 = LazyKt__LazyJVMKt.lazy(new d());
    }

    public static final CountryLoginReaction access$getCountryLoginReaction(LoginReaction loginReaction) {
        return (CountryLoginReaction) loginReaction.J0.getValue();
    }

    public static void e(LoginReaction this$0, Router router, Route route) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(router);
        Activity mActivity = this$0.mActivity;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        Router.navigate$default(router, mActivity, route.getRoute(), Animation.SlideUp.INSTANCE, null, null, false, 56, null);
    }

    public static ReactorCoreBuilder.AndReactionBuilder f(ReactorCoreBuilder.ReactionBuilder reactionBuilder, final boolean z10) {
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilder.inside("login", LoginActivity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$setLoginActivityLoadingIsAnimating$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((LoginActivity) p4).setIsLoadingAnimating$Login_mexicoGoogleRelease(z10);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.base.cells.BaseReaction, com.bbva.cellscore.reactor.GlobalReaction
    @SuppressLint({"NewApi"})
    public void configure() {
        super.configure();
        LoginModals loginModals = (LoginModals) this.K0.getValue();
        addComponent(loginModals);
        loginModals.configure();
        int i10 = 1;
        addComponent(ZipActionsComponent.ID, new ZipActionsComponent(null, i10, 0 == true ? 1 : 0));
        CellsChannels cellsChannels = CellsChannels.INSTANCE;
        WriteOnBuilder.WritableActionBuilder writableActionBuilderWhen = writeOn(cellsChannels.getUserIdChannel()).when("login-view-model");
        ActionConstants actionConstants = ActionConstants.INSTANCE;
        writableActionBuilderWhen.doAction(actionConstants.getSEND_USER_ID());
        reactTo(cellsChannels.getNativeRateAppChannel()).then().inside("login", LoginActivity.class).doReactionAndCleanChannel(new e(i10));
        reactTo(AppStartReadyChannel.INSTANCE.getInstance()).then().inside("login-view-model", LoginViewModel.class).doReactionAndCleanChannel(new f(i10));
        PageDelegatorExtensionsKt.configureAll((List) this.M0.getValue());
        configureWebViewReactions();
        WebActions webActions = WebActions.INSTANCE;
        Activity mActivity = this.mActivity;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        webActions.configureWebActions(this, mActivity);
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = whenever("login-view-model").doAction(actionConstants.getDO_LOGIN()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilderThen.inside(LoginDataManager.ID, LoginDataManager.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$doLogin$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, UserCredentials userCredentials) {
                Intrinsics.checkNotNull(p4);
                UserCredentials userCredentials2 = userCredentials;
                LoggerKt.logDebug(h0.b("TAG[LoginReaction] doLoginReaction[", userCredentials2.getUser(), Constant.BRACKET_CLOSE), d.listOf(LogHandlers.Default));
                ((LoginDataManager) p4).fetchLogin(userCredentials2.getUser(), userCredentials2.getPassword());
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd = andReactionBuilderDoReaction.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd, "and(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction2 = reactionBuilderAnd.inside("login-view-model", LoginViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$sendDeeplinkFlag$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, UserCredentials userCredentials) {
                Intrinsics.checkNotNull(p4);
                ((LoginViewModel) p4).sendGlobalProcessingDeepLink();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction2, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd2 = andReactionBuilderDoReaction2.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd2, "and(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction3 = reactionBuilderAnd2.inside("login", LoginActivity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$hideKeyboard$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((LoginActivity) p4).hideKeyboard$Login_mexicoGoogleRelease();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction3, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd3 = andReactionBuilderDoReaction3.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd3, "and(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd4 = f(reactionBuilderAnd3, true).and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd4, "and(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction4 = reactionBuilderAnd4.inside("login-view-model", LoginViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$showLoader$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((LoginViewModel) p4).setLoginLoaderState(LoaderState.SHOW);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction4, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd5 = andReactionBuilderDoReaction4.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd5, "and(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd5.inside(Router.ID, Router.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$denyHideLoader$$inlined$react$default$1
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Router router, Object obj) {
                this.f33499p0.I0 = false;
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = whenever(R.id.loginToolbar).doAction(ToolbarViewModel.INSTANCE.getACTION_BACK_BUTTON_CLICK()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2.inside("login", LoginActivity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$backToCredentials$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((LoginActivity) p4).onBackPressed();
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen3 = whenever(LoginDataManager.ID).doAction(LoginDataManager.ACTION_LOGIN_SUCCESS).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3.inside("login-view-model", LoginGlobalViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$onLoginDataManagerSuccess$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, LoginResponse loginResponse) {
                Intrinsics.checkNotNull(p4);
                LoginResponse loginResponse2 = loginResponse;
                LoggerKt.logDebug$default(h0.b("TAG[LoginReaction] onLoginDataManagerSuccessReaction[", loginResponse2.getPersonId(), Constant.BRACKET_CLOSE), null, 2, null);
                ((LoginGlobalViewModel) p4).onLoginSuccess(loginResponse2);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen4 = whenever(LoginDataManager.ID).doAction(LoginDataManager.ACTION_LOGIN_ERROR).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen4, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction5 = reactionBuilderThen4.inside("login-view-model", LoginViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$hideLoader$$inlined$reactIn$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((LoginViewModel) p4).setLoginLoaderState(LoaderState.HIDE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction5, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd6 = andReactionBuilderDoReaction5.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd6, "and(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction6 = reactionBuilderAnd6.inside("login-view-model", LoginGlobalViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$handleLoginError$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, LoginException loginException) {
                Intrinsics.checkNotNull(p4);
                ((LoginGlobalViewModel) p4).onLoginError(loginException);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction6, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd7 = andReactionBuilderDoReaction6.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd7, "and(...)");
        f(reactionBuilderAnd7, false);
        whenever("login-view-model").doAction(com.bbva.glomohybrid.base.cells.constants.ActionConstants.INSTANCE.getACTION_REMEMBER_USER_COMPLETED()).then().inside("login-view-model", LoginGlobalViewModel.class).doReaction(new u4.f(3));
        whenever(CustomerDataManager.ID).doAction(CustomerDataManager.ACTION_GET_CUSTOMER_ERROR).then().inside("login-view-model", LoginGlobalViewModel.class).doReaction(new androidx.appcompat.widget.c()).and().inside(LoginDataManager.ID, LoginDataManager.class).doReaction(new k(1));
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever = whenever(ZipActionsComponent.ID);
        ZipActionsComponent.Companion companion = ZipActionsComponent.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen5 = plainActionBuilderWhenever.doAction(companion.getACTION_COMPLETED()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen5, "then(...)");
        final LoggerLevel loggerLevel = LoggerLevel.VERBOSE;
        final Exception exc = null;
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction7 = reactionBuilderThen5.inside(Router.ID, Router.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$configure$$inlined$log$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Map<String, ? extends Object> map) {
                Intrinsics.checkNotNull(p4);
                int i11 = LoginReaction$configure$$inlined$log$default$1$1$wm$CellsReactor$WhenMappings.$EnumSwitchMapping$0[loggerLevel.ordinal()];
                Exception exc2 = exc;
                switch (i11) {
                    case 1:
                        LoggerKt.logVerbose$default("[ZipActionsComponent][Login] - Completed", null, 2, null);
                        break;
                    case 2:
                        LoggerKt.logDebug$default("[ZipActionsComponent][Login] - Completed", null, 2, null);
                        break;
                    case 3:
                        LoggerKt.logWarning$default("[ZipActionsComponent][Login] - Completed", null, 2, null);
                        break;
                    case 4:
                        LoggerKt.logInfo$default("[ZipActionsComponent][Login] - Completed", null, 2, null);
                        break;
                    case 5:
                        LoggerKt.logCritical$default("[ZipActionsComponent][Login] - Completed", exc2, null, 4, null);
                        break;
                    case 6:
                        LoggerKt.logError$default("[ZipActionsComponent][Login] - Completed", exc2, null, 4, null);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction7, "doReaction(...)");
        andReactionBuilderDoReaction7.and().inside("login-view-model", LoginGlobalViewModel.class).doReactionAndCleanChannel(new i8.a(1));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen6 = whenever(ZipActionsComponent.ID).doAction(companion.getACTION_PERFORMED()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen6, "then(...)");
        final Exception exc2 = null;
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen6.inside(Router.ID, Router.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$configure$$inlined$log$default$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                String strD = androidx.camera.core.processing.f.d("[ZipActionsComponent][Login] - ", str);
                int i11 = LoginReaction$configure$$inlined$log$default$2$1$wm$CellsReactor$WhenMappings.$EnumSwitchMapping$0[loggerLevel.ordinal()];
                Exception exc3 = exc2;
                switch (i11) {
                    case 1:
                        LoggerKt.logVerbose$default(strD, null, 2, null);
                        break;
                    case 2:
                        LoggerKt.logDebug$default(strD, null, 2, null);
                        break;
                    case 3:
                        LoggerKt.logWarning$default(strD, null, 2, null);
                        break;
                    case 4:
                        LoggerKt.logInfo$default(strD, null, 2, null);
                        break;
                    case 5:
                        LoggerKt.logCritical$default(strD, exc3, null, 4, null);
                        break;
                    case 6:
                        LoggerKt.logError$default(strD, exc3, null, 4, null);
                        break;
                }
            }
        }), "doReaction(...)");
        int i11 = 2;
        whenever(ZipActionsComponent.ID).doAction(companion.getACTION_ERROR()).then().inside("login-view-model", LoginGlobalViewModel.class).doReactionAndCleanChannel(new l(i11));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen7 = whenever(R.id.loaderView).doAction(LoaderViewModel.ACTION_LAST_STEP_FINISH).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen7, "then(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd8 = f(reactionBuilderThen7, false).and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd8, "and(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction8 = reactionBuilderAnd8.inside(Router.ID, Router.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$denyHideLoader$$inlined$react$default$1
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Router router, Object obj) {
                this.f33499p0.I0 = false;
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction8, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd9 = andReactionBuilderDoReaction8.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd9, "and(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction9 = reactionBuilderAnd9.inside("login-view-model", LoginGlobalViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$navigateToWeb$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((LoginGlobalViewModel) p4).openMainWebScreen();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction9, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd10 = andReactionBuilderDoReaction9.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd10, "and(...)");
        closeScreen(reactionBuilderAnd10);
        whenever("login-view-model").doAction(Router.INSTANCE.getACTION_NAVIGATE()).then().inside(Router.ID, Router.class).doReaction(new r(this, 1));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf = whenever(ShortcutComponentLauncher.ID).doAction(ShortcutComponentLauncher.INSTANCE.getACTION_SHORTCUT_CLICKED()).then().onlyIf(new z0.b(4));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf, "onlyIf(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction10 = reactionBuilderOnlyIf.inside("login-view-model", LoginGlobalViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$navigateToATM$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                LoginGlobalViewModel.openWeb$default((LoginGlobalViewModel) p4, RouteConstants.ATM, null, null, 6, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction10, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd11 = andReactionBuilderDoReaction10.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd11, "and(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd11.inside(ShortcutComponentLauncher.ID, ShortcutComponentLauncher.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginReaction$resetShortcutComponent$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, ShortcutActions shortcutActions) {
                Intrinsics.checkNotNull(p4);
                ((ShortcutComponentLauncher) p4).reset();
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever2 = whenever("login");
        LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf2 = plainActionBuilderWhenever2.doAction(companion2.getACTION_SCREEN_STOPPED()).then().onlyIf(new bc.org.bouncycastle.math.ec.a());
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf2, "onlyIf(...)");
        shortcutReady(reactionBuilderOnlyIf2, false);
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen8 = whenever("login").doAction(companion2.getACTION_SCREEN_STOPPED()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen8, "then(...)");
        cleanChannel(reactionBuilderThen8, cellsChannels.getOnCloseSessionSuccess());
        whenever(CustomerDataManager.ID).doAction(CustomerDataManager.ACTION_GET_CUSTOMER_SUCCESS).then().inside("login-view-model", LoginGlobalViewModel.class).doReaction(new c8.b(i11));
        int i12 = 1;
        reactTo(WebController.ON_WEB_READY_CHANNEL).then().inside(ZipActionsComponent.ID, ZipActionsComponent.class).doReaction(new i8.d(i12));
        whenever("biometry-error-retry").doAction(RetryBiometricAuthActivity.INSTANCE.getACTION_RETRY_AUTH_CLOSE()).then().inside("login-view-model", LoginGlobalViewModel.class).doReaction(new j4.a(i12));
        whenever("biometry-error-retry").doAction(RetryBiometricAuthActivity.ACTION_RETRY_AUTH).then().inside("login-view-model", LoginGlobalViewModel.class).doReaction(new j4.b(i11));
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever3 = whenever("biometry-error");
        InfoScreenActivity.Companion companion3 = InfoScreenActivity.INSTANCE;
        plainActionBuilderWhenever3.doAction(companion3.getACTION_CLOSE_BUTTON()).then().inside("login-view-model", LoginGlobalViewModel.class).doReaction(new x8.c(1));
        whenever("biometry-friendly-fraud").doAction(companion3.getACTION_CLOSE_BUTTON()).then().inside("login-view-model", LoginGlobalViewModel.class).doReaction(new com.google.android.gms.internal.mlkit_common.a());
    }

    public final void configureWebViewReactions() {
        whenever(WebActions.ID).doAction(WebController.ON_WEB_MESSAGE).then().onlyIf(new b2.a(4)).inside(Dispatcher.ID, Dispatcher.class).doNavigationAndCleanChannel(new q());
    }

    @Override // com.bbva.cellscore.reactor.PageReaction
    public void onStop() {
        if (this.I0) {
            ((LoaderViewModel) getComponent(R.id.loaderView)).hide();
        }
        super.onStop();
    }
}
