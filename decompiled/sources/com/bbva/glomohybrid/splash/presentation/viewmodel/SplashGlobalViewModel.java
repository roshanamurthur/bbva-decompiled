package com.bbva.glomohybrid.splash.presentation.viewmodel;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.imagecapture.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricSplashViewModel;
import com.bbva.component.dm.biometriclogin.presentation.viewmodel.DefaultBiometricSplashViewModel;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.dm.settings.AppSettingsDataManager;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.usecase.FetchSettingsUseCase;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.component.dm.storage.PrefsStorageDataManager;
import com.bbva.component.root.checker.RootCheckerComponent;
import com.bbva.component.root.checker.model.RootModalType;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.usecase.MigrateRememberedUserUseCase;
import com.bbva.glomo.user.domain.usecase.PersistMobileServicesUseCase;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import com.bbva.glomohybrid.base.datasource.RootDataSource;
import com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcher;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.base.deeplink.model.LinkParams;
import com.bbva.glomohybrid.base.deeplink.usecase.result.Deeplink;
import com.bbva.glomohybrid.base.deeplink.usecase.result.QRCard;
import com.bbva.glomohybrid.base.inappupdate.usecase.InstallFlexibleUpdateUseCase;
import com.bbva.glomohybrid.base.session.Session;
import com.bbva.glomohybrid.base.session.SessionTokenGenerator;
import com.bbva.glomohybrid.base.shortcuts.ShortcutActions;
import com.bbva.glomohybrid.base.shortcuts.ShortcutComponentLauncher;
import com.bbva.glomohybrid.base.shortcuts.ShortcutController;
import com.bbva.glomohybrid.base.viewmodel.Action;
import com.bbva.glomohybrid.base.viewmodel.ActionKt;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.base.viewmodel.OnCompleteAction;
import com.bbva.glomohybrid.base.viewmodel.PerformedAction;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.base.viewmodel.ZipActionsFlow;
import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.domain.model.StorePolicy;
import com.bbva.glomohybrid.featureflags.domain.usecase.SyncFeatureFlagsUseCase;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomohybrid.splash.model.NetworkException;
import com.bbva.glomohybrid.splash.model.constants.ActionConstants;
import com.bbva.glomohybrid.splash.presentation.view.SplashContract;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.localstorage.LocalStorage;
import com.bbva.localstorage.storage.Storage;
import com.bbva.networkmonitor.component.NetworkMonitorDataManager;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: SplashGlobalViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001UB!\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u00109\u001a\u000204\u0012\b\b\u0002\u0010R\u001a\u00020Q¢\u0006\u0004\bS\u0010TJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096\u0001J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001J\b\u0010\u0010\u001a\u00020\bH\u0016J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011J\u0013\u0010\u0014\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\u0019\u001a\u00020\bH\u0016J\u001d\u0010\u001a\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0015J\u0013\u0010\u001d\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0015J\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fJ\u001a\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010#J\u0015\u0010&\u001a\u0004\u0018\u00010%H\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0015J\b\u0010'\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020\bH\u0016J\b\u0010)\u001a\u00020\u001fH\u0016J\u0013\u0010*\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0015J\u0010\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0006H\u0016J\u0013\u0010-\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b-\u0010\u0015R\u001a\u00103\u001a\u00020.8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00109\u001a\u0002048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R(\u0010B\u001a\b\u0012\u0004\u0012\u00020;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020D0C8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006V"}, d2 = {"Lcom/bbva/glomohybrid/splash/presentation/viewmodel/SplashGlobalViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "Lcom/bbva/component/dm/biometriclogin/presentation/viewmodel/BiometricSplashViewModel;", "", "Lcom/bbva/glomohybrid/base/viewmodel/Action;", "biometricActionsFlow", "", Constants.backendRequestUserId, "", "checkAuthentication", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "setActivity", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "biometricAuthState", "updateBiometricAuthentication", "setupActions", "Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Intent;", "intent", "setIntent", "migrateRememberedUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "params", "runSplashFlow", "loadRememberedUser", "fetchAppSettings", "(Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFeatureFlags", "fetchProfiling", "fetchNonRestrictiveScreenShown", "", "value", "setNonRestrictiveRootScreenShown", "action", "", "markAsPerformed", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "getRememberedUser", "makeAnonymousLogin", "logActivityEvent", "isNetworkModalEnabled", "installUpdate", "shortcutId", "trackShortcutEvent", "onNewSession", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "q0", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "getProvider", "()Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;", "r0", "Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;", "getZipActionsFlow", "()Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;", "zipActionsFlow", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bbva/component/root/checker/model/RootModalType;", "H0", "Landroidx/lifecycle/MutableLiveData;", "getShouldShowRootFragment", "()Landroidx/lifecycle/MutableLiveData;", "setShouldShowRootFragment", "(Landroidx/lifecycle/MutableLiveData;)V", "shouldShowRootFragment", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Event;", "J0", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "events", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "getDispatchers", "()Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "Lcom/bbva/glomohybrid/base/deeplink/DeeplinkDispatcher;", "dispatcher", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;Lcom/bbva/glomohybrid/base/deeplink/DeeplinkDispatcher;)V", "Companion", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSplashGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashGlobalViewModel.kt\ncom/bbva/glomohybrid/splash/presentation/viewmodel/SplashGlobalViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Either.kt\ncom/bbva/glomoutils/EitherKt\n*L\n1#1,379:1\n56#2,6:380\n56#2,6:386\n56#2,6:392\n56#2,6:398\n56#2,6:408\n41#2,6:414\n47#2:421\n41#2,6:423\n47#2:430\n41#2,6:432\n47#2:439\n41#2,6:450\n47#2:457\n41#2,6:459\n47#2:466\n41#2,6:468\n47#2:475\n41#2,6:477\n47#2:484\n29#3,4:404\n133#4:420\n133#4:429\n133#4:438\n133#4:456\n133#4:465\n133#4:474\n133#4:483\n107#5:422\n107#5:431\n107#5:440\n107#5:458\n107#5:467\n107#5:476\n107#5:485\n25#6,3:441\n53#6,3:444\n32#6,3:447\n*S KotlinDebug\n*F\n+ 1 SplashGlobalViewModel.kt\ncom/bbva/glomohybrid/splash/presentation/viewmodel/SplashGlobalViewModel\n*L\n92#1:380,6\n94#1:386,6\n96#1:392,6\n98#1:398,6\n103#1:408,6\n88#1:414,6\n88#1:421\n195#1:423,6\n195#1:430\n221#1:432,6\n221#1:439\n244#1:450,6\n244#1:457\n252#1:459,6\n252#1:466\n270#1:468,6\n270#1:475\n302#1:477,6\n302#1:484\n101#1:404,4\n88#1:420\n195#1:429\n221#1:438\n244#1:456\n252#1:465\n270#1:474\n302#1:483\n88#1:422\n195#1:431\n221#1:440\n244#1:458\n252#1:467\n270#1:476\n302#1:485\n223#1:441,3\n232#1:444,3\n233#1:447,3\n*E\n"})
public abstract class SplashGlobalViewModel extends BaseViewModel implements BiometricSplashViewModel {

    @NotNull
    public static final String ACTION_DEEPLINK_NOT_READ = "action-deeplink-not-read";

    @NotNull
    public static final String ACTION_DEEPLINK_READ = "action-deeplink-read";

    @NotNull
    public static final String ACTION_FETCH_FEATURE_FLAGS = "action-fetch-feature-flags";

    @NotNull
    public static final String ACTION_SESSION_CREATED = "action-create-session";

    @NotNull
    public static final String ID = "splash-view-model";

    @NotNull
    public final Lazy E0;

    @NotNull
    public final Lazy F0;
    public boolean G0;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<RootModalType> shouldShowRootFragment;

    @NotNull
    public final Channel<SplashContract.Event> I0;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @NotNull
    public final Flow<SplashContract.Event> events;

    @NotNull
    public final Lazy K0;

    @NotNull
    public final Lazy L0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewModelComponentsProviders provider;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ZipActionsFlow zipActionsFlow;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final DeeplinkDispatcher f34538s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ DefaultBiometricSplashViewModel f34539t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f34540u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f34541w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f34542x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Lazy f34543y0;

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    public static final class a extends Lambda implements Function1<PerformedAction, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PerformedAction performedAction) {
            PerformedAction actionFire = performedAction;
            Intrinsics.checkNotNullParameter(actionFire, "actionFire");
            String action = actionFire.getAction();
            boolean zAreEqual = Intrinsics.areEqual(action, RootCheckerComponent.ACTION_NOT_ROOTED);
            SplashGlobalViewModel splashGlobalViewModel = SplashGlobalViewModel.this;
            if (zAreEqual) {
                SplashGlobalViewModel.access$shouldShowRootFragment(splashGlobalViewModel, false);
            } else if (Intrinsics.areEqual(action, SplashGlobalViewModel.ACTION_DEEPLINK_READ)) {
                SplashGlobalViewModel.access$handleEvents(splashGlobalViewModel, SplashContract.Event.DeepLinkHandled.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    public static final class b extends Lambda implements Function1<OnCompleteAction, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OnCompleteAction onCompleteAction) {
            OnCompleteAction it = onCompleteAction;
            Intrinsics.checkNotNullParameter(it, "it");
            SplashGlobalViewModel.access$handleEvents(SplashGlobalViewModel.this, SplashContract.Event.Navigate.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    public static final class c extends Lambda implements Function1<String, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean zAreEqual = Intrinsics.areEqual(it, RootCheckerComponent.ACTION_ROOTED);
            SplashGlobalViewModel splashGlobalViewModel = SplashGlobalViewModel.this;
            if (zAreEqual) {
                SplashGlobalViewModel.access$shouldShowRootFragment(splashGlobalViewModel, true);
            } else {
                SplashGlobalViewModel.markAsPerformed$default(splashGlobalViewModel, it, null, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel", f = "SplashGlobalViewModel.kt", i = {0, 0}, l = {222}, m = "fetchAppSettings", n = {"this", "params"}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SplashGlobalViewModel f34547p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LinkParams f34548q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f34549r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f34551t0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34549r0 = obj;
            this.f34551t0 |= Integer.MIN_VALUE;
            return SplashGlobalViewModel.this.fetchAppSettings(null, this);
        }
    }

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel", f = "SplashGlobalViewModel.kt", i = {0}, l = {245}, m = "fetchFeatureFlags", n = {"this"}, s = {"L$0"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SplashGlobalViewModel f34552p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f34553q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f34555s0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34553q0 = obj;
            this.f34555s0 |= Integer.MIN_VALUE;
            return SplashGlobalViewModel.this.fetchFeatureFlags(this);
        }
    }

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    public static final class f extends Lambda implements Function0<ParametersHolder> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(SplashGlobalViewModel.this.getProvider());
        }
    }

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel", f = "SplashGlobalViewModel.kt", i = {}, l = {365}, m = "installUpdate", n = {}, s = {})
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f34557p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f34559r0;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34557p0 = obj;
            this.f34559r0 |= Integer.MIN_VALUE;
            return SplashGlobalViewModel.this.installUpdate(this);
        }
    }

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$loadRememberedUser$1", f = "SplashGlobalViewModel.kt", i = {}, l = {ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f34560p0;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SplashGlobalViewModel.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0039  */
        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0041  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            RememberedUser rememberedUser;
            String document;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f34560p0;
            SplashGlobalViewModel splashGlobalViewModel = SplashGlobalViewModel.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                rememberedUser = (RememberedUser) obj;
                if (rememberedUser != null) {
                    document = rememberedUser.getDocument();
                } else {
                    document = null;
                }
                if (document == null) {
                    document = "";
                }
                splashGlobalViewModel.checkAuthentication(document);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.f34560p0 = 1;
            if (splashGlobalViewModel.migrateRememberedUser(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f34560p0 = 2;
            obj = splashGlobalViewModel.getRememberedUser(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            rememberedUser = (RememberedUser) obj;
            if (rememberedUser != null) {
                document = rememberedUser.getDocument();
            } else {
                document = null;
            }
            if (document == null) {
                document = "";
            }
            splashGlobalViewModel.checkAuthentication(document);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    public static final class i extends Lambda implements Function0<MessageDispatcher> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MessageDispatcher invoke() {
            return (MessageDispatcher) SplashGlobalViewModel.this.getProvider().provide("web-dispatcher");
        }
    }

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel", f = "SplashGlobalViewModel.kt", i = {0}, l = {375}, m = "onNewSession$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SplashGlobalViewModel f34563p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f34564q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f34566s0;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34564q0 = obj;
            this.f34566s0 |= Integer.MIN_VALUE;
            return SplashGlobalViewModel.c(SplashGlobalViewModel.this, this);
        }
    }

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    public static final class k extends Lambda implements Function0<RootDataSource> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RootDataSource invoke() {
            Object objProvide = SplashGlobalViewModel.this.getProvider().provide(RootDataSource.ID);
            if (objProvide != null) {
                return (RootDataSource) objProvide;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$runSplashFlow$1", f = "SplashGlobalViewModel.kt", i = {}, l = {ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f34568p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f34569q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Activity f34571s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ LinkParams f34572t0;

        /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$runSplashFlow$1$1", f = "SplashGlobalViewModel.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f34573p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ SplashGlobalViewModel f34574q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ LinkParams f34575r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SplashGlobalViewModel splashGlobalViewModel, LinkParams linkParams, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f34574q0 = splashGlobalViewModel;
                this.f34575r0 = linkParams;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f34574q0, this.f34575r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f34573p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f34573p0 = 1;
                    if (this.f34574q0.fetchAppSettings(this.f34575r0, this) == coroutine_suspended) {
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

        /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$runSplashFlow$1$2", f = "SplashGlobalViewModel.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f34576p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ SplashGlobalViewModel f34577q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SplashGlobalViewModel splashGlobalViewModel, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f34577q0 = splashGlobalViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f34577q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f34576p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f34576p0 = 1;
                    if (this.f34577q0.fetchFeatureFlags(this) == coroutine_suspended) {
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

        /* JADX INFO: compiled from: SplashGlobalViewModel.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$runSplashFlow$1$3", f = "SplashGlobalViewModel.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f34578p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ SplashGlobalViewModel f34579q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SplashGlobalViewModel splashGlobalViewModel, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f34579q0 = splashGlobalViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.f34579q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f34578p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f34578p0 = 1;
                    if (this.f34579q0.fetchProfiling(this) == coroutine_suspended) {
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
        public l(Activity activity, LinkParams linkParams, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f34571s0 = activity;
            this.f34572t0 = linkParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            l lVar = SplashGlobalViewModel.this.new l(this.f34571s0, this.f34572t0, continuation);
            lVar.f34569q0 = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f34568p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f34569q0;
                Activity activity = this.f34571s0;
                SplashGlobalViewModel splashGlobalViewModel = SplashGlobalViewModel.this;
                splashGlobalViewModel.setActivity(activity);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(splashGlobalViewModel, this.f34572t0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(splashGlobalViewModel, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(splashGlobalViewModel, null), 3, null);
                SplashGlobalViewModel.access$setLightAccessConfig(splashGlobalViewModel);
                SplashGlobalViewModel.access$persistMobileServices(splashGlobalViewModel);
                splashGlobalViewModel.loadRememberedUser();
                this.f34568p0 = 1;
                if (splashGlobalViewModel.onNewSession(this) == coroutine_suspended) {
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

    public /* synthetic */ SplashGlobalViewModel(ViewModelComponentsProviders viewModelComponentsProviders, ZipActionsFlow zipActionsFlow, DeeplinkDispatcher deeplinkDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, zipActionsFlow, (i10 & 4) != 0 ? new DeeplinkDispatcher() : deeplinkDispatcher);
    }

    public static final void access$handleEvents(SplashGlobalViewModel splashGlobalViewModel, SplashContract.Event event) {
        splashGlobalViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(splashGlobalViewModel), null, null, new ga.b(splashGlobalViewModel, event, null), 3, null);
    }

    public static final void access$notifyDynamicLink(SplashGlobalViewModel splashGlobalViewModel, Deeplink deeplink) {
        splashGlobalViewModel.f34538s0.dispatch(splashGlobalViewModel.getId(), DeepLinkExtensionsKt.parseDeepLink(deeplink.getData(), DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER));
        markAsPerformed$default(splashGlobalViewModel, ACTION_DEEPLINK_READ, null, 2, null);
    }

    public static final void access$notifyQRLink(SplashGlobalViewModel splashGlobalViewModel, QRCard qRCard) {
        splashGlobalViewModel.f34538s0.dispatchQrDeeplink(qRCard.getData());
        markAsPerformed$default(splashGlobalViewModel, ACTION_DEEPLINK_READ, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void access$persistMobileServices(SplashGlobalViewModel splashGlobalViewModel) {
        ViewModelComponentsProviders viewModelComponentsProviders = splashGlobalViewModel.provider;
        ((PersistMobileServicesUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(PersistMobileServicesUseCase.class), null, null)).execute2();
    }

    public static final void access$setLightAccessConfig(SplashGlobalViewModel splashGlobalViewModel) {
        ((Session) splashGlobalViewModel.F0.getValue()).setComeFromSplash(true);
    }

    public static final void access$shouldShowRootFragment(SplashGlobalViewModel splashGlobalViewModel, boolean z10) {
        RootModalType rootModalType;
        ((RootDataSource) splashGlobalViewModel.L0.getValue()).setRoot(z10);
        boolean z11 = false;
        boolean z12 = z10 && splashGlobalViewModel.f34540u0;
        if (z10 && !splashGlobalViewModel.f34540u0 && !splashGlobalViewModel.G0) {
            z11 = true;
        }
        MutableLiveData<RootModalType> mutableLiveData = splashGlobalViewModel.shouldShowRootFragment;
        if (z12) {
            rootModalType = RootModalType.Restrictive.INSTANCE;
        } else {
            rootModalType = z11 ? RootModalType.NonRestrictive.INSTANCE : RootModalType.None.INSTANCE;
        }
        mutableLiveData.setValue(rootModalType);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(SplashGlobalViewModel splashGlobalViewModel, Continuation<? super Unit> continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i10 = jVar.f34566s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f34566s0 = i10 - Integer.MIN_VALUE;
            } else {
                jVar = splashGlobalViewModel.new j(continuation);
            }
        } else {
            jVar = splashGlobalViewModel.new j(continuation);
        }
        Object obj = jVar.f34564q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = jVar.f34566s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            SessionTokenGenerator sessionTokenGenerator = (SessionTokenGenerator) splashGlobalViewModel.f34542x0.getValue();
            UserType userType = UserType.PERSONAL;
            jVar.f34563p0 = splashGlobalViewModel;
            jVar.f34566s0 = 1;
            if (sessionTokenGenerator.generate(userType, jVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            splashGlobalViewModel = jVar.f34563p0;
            ResultKt.throwOnFailure(obj);
        }
        markAsPerformed$default(splashGlobalViewModel, ACTION_SESSION_CREATED, null, 2, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void markAsPerformed$default(SplashGlobalViewModel splashGlobalViewModel, String str, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsPerformed");
        }
        if ((i10 & 2) != 0) {
            obj = null;
        }
        splashGlobalViewModel.markAsPerformed(str, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        StringQualifier stringQualifierNamed = QualifierKt.named(RootDataSource.KEY_CHECK);
        ViewModelComponentsProviders viewModelComponentsProviders = this.provider;
        if (!((Boolean) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(Boolean.class), stringQualifierNamed, null)).booleanValue() || (!this.f34540u0 && this.G0)) {
            markAsPerformed$default(this, RootCheckerComponent.ACTION_NOT_ROOTED, null, 2, null);
        } else {
            ((RootCheckerComponent) this.f34541w0.getValue()).checkLocalRoot(new c());
        }
    }

    public final void b(LinkParams linkParams) {
        if (linkParams instanceof LinkParams.DynamicLink) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ga.a(this, (LinkParams.DynamicLink) linkParams, null), 3, null);
        } else {
            markAsPerformed$default(this, ACTION_DEEPLINK_NOT_READ, null, 2, null);
        }
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricSplashViewModel
    @NotNull
    public List<Action> biometricActionsFlow() {
        return this.f34539t0.biometricActionsFlow();
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricSplashViewModel
    public void checkAuthentication(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f34539t0.checkAuthentication(userId);
    }

    public final void d(AppSettingsResult appSettingsResult) {
        List<Integer> listEmptyList;
        NetworkMonitorDataManager networkMonitorDataManager = (NetworkMonitorDataManager) this.provider.provide(NetworkMonitorDataManager.ID);
        if (networkMonitorDataManager == null || (listEmptyList = networkMonitorDataManager.getNetworkProblems()) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (!listEmptyList.isEmpty()) {
            ((Crashlytics) this.v0.getValue()).recordException(new NetworkException(appSettingsResult, listEmptyList));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object fetchAppSettings(@Nullable LinkParams linkParams, @NotNull Continuation<? super Unit> continuation) {
        d dVar;
        SplashGlobalViewModel splashGlobalViewModel;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f34551t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f34551t0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objExecute2 = dVar.f34549r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f34551t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute2);
            ViewModelComponentsProviders viewModelComponentsProviders = this.provider;
            FetchSettingsUseCase fetchSettingsUseCase = (FetchSettingsUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(FetchSettingsUseCase.class), null, null);
            SettingsPolicy settingsPolicy = SettingsPolicy.Remote;
            dVar.f34547p0 = this;
            dVar.f34548q0 = linkParams;
            dVar.f34551t0 = 1;
            objExecute2 = fetchSettingsUseCase.execute(settingsPolicy, (Continuation<? super Either<? extends Throwable, ? extends AppSettingsResult>>) dVar);
            if (objExecute2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            splashGlobalViewModel = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkParams = dVar.f34548q0;
            splashGlobalViewModel = dVar.f34547p0;
            ResultKt.throwOnFailure(objExecute2);
        }
        Either eitherLeft = (Either) objExecute2;
        if (eitherLeft instanceof Either.Right) {
            AppSettingsResult appSettingsResult = (AppSettingsResult) ((Either.Right) eitherLeft).getValue();
            splashGlobalViewModel.d(appSettingsResult);
            Boolean boolIsRestrictiveModeON = appSettingsResult.getData().isRestrictiveModeON();
            splashGlobalViewModel.f34540u0 = boolIsRestrictiveModeON != null ? boolIsRestrictiveModeON.booleanValue() : false;
            splashGlobalViewModel.a();
            String id = AppSettingsDataManager.ACTION_GET_SETTINGS_SUCCESS.getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            markAsPerformed$default(splashGlobalViewModel, id, null, 2, null);
            splashGlobalViewModel.b(linkParams);
            LoggerKt.logDebug$default(h0.b("TAG[", splashGlobalViewModel.getClass().getSimpleName(), "-GLOBAL] AppSettings SUCCESS"), null, 2, null);
            eitherLeft = EitherKt.right(Unit.INSTANCE);
        } else if (!(eitherLeft instanceof Either.Left)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(eitherLeft instanceof Either.Right)) {
            if (!(eitherLeft instanceof Either.Left)) {
                throw new NoWhenBranchMatchedException();
            }
            eitherLeft = EitherKt.left(new AppSettingsResult.ErrorResult(new Exception((Throwable) ((Either.Left) eitherLeft).getError()), -1));
        }
        if (!(eitherLeft instanceof Either.Right)) {
            if (!(eitherLeft instanceof Either.Left)) {
                throw new NoWhenBranchMatchedException();
            }
            splashGlobalViewModel.d((AppSettingsResult.ErrorResult) ((Either.Left) eitherLeft).getError());
            splashGlobalViewModel.a();
            String id2 = AppSettingsDataManager.ACTION_GET_SETTINGS_ERROR.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            markAsPerformed$default(splashGlobalViewModel, id2, null, 2, null);
            splashGlobalViewModel.b(linkParams);
            LoggerKt.logError$default(h0.b("TAG[", splashGlobalViewModel.getClass().getSimpleName(), "-GLOBAL] AppSettings ERROR"), null, null, 6, null);
            EitherKt.left(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object fetchFeatureFlags(@NotNull Continuation<? super Unit> continuation) {
        e eVar;
        SplashGlobalViewModel splashGlobalViewModel;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f34555s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f34555s0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f34553q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f34555s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            ViewModelComponentsProviders viewModelComponentsProviders = this.provider;
            SyncFeatureFlagsUseCase syncFeatureFlagsUseCase = (SyncFeatureFlagsUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(SyncFeatureFlagsUseCase.class), null, null);
            StorePolicy storePolicy = StorePolicy.Remote;
            eVar.f34552p0 = this;
            eVar.f34555s0 = 1;
            if (syncFeatureFlagsUseCase.execute(storePolicy, (Continuation<? super FeatureFlags>) eVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            splashGlobalViewModel = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            splashGlobalViewModel = eVar.f34552p0;
            ResultKt.throwOnFailure(obj);
        }
        markAsPerformed$default(splashGlobalViewModel, ACTION_FETCH_FEATURE_FLAGS, null, 2, null);
        return Unit.INSTANCE;
    }

    public final void fetchNonRestrictiveScreenShown() {
        Boolean boolean$default = Storage.DefaultImpls.getBoolean$default(LocalStorage.INSTANCE.getStorage(), LocalStorageConstantsKt.KEY_IS_NON_RESTRICTIVE_ROOT_SCREEN_ALREADY_SHOWN, false, false, 4, null);
        this.G0 = boolean$default != null ? boolean$default.booleanValue() : false;
    }

    @Nullable
    public Object fetchProfiling(@NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ThreadDispatchers getDispatchers() {
        ViewModelComponentsProviders viewModelComponentsProviders = this.provider;
        return (ThreadDispatchers) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(ThreadDispatchers.class), null, null);
    }

    @NotNull
    public final Flow<SplashContract.Event> getEvents() {
        return this.events;
    }

    @Override // com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return "splash-view-model";
    }

    @NotNull
    public final ViewModelComponentsProviders getProvider() {
        return this.provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object getRememberedUser(@NotNull Continuation<? super RememberedUser> continuation) {
        ViewModelComponentsProviders viewModelComponentsProviders = this.provider;
        return ((SuspendGetRememberedUserUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(SuspendGetRememberedUserUseCase.class), null, null)).execute(continuation);
    }

    @NotNull
    public final MutableLiveData<RootModalType> getShouldShowRootFragment() {
        return this.shouldShowRootFragment;
    }

    @NotNull
    public final ZipActionsFlow getZipActionsFlow() {
        return this.zipActionsFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object installUpdate(@NotNull Continuation<? super Boolean> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f34559r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f34559r0 = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objExecute = gVar.f34557p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f34559r0;
        boolean z10 = false;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute);
            InstallFlexibleUpdateUseCase installFlexibleUpdateUseCase = (InstallFlexibleUpdateUseCase) this.E0.getValue();
            if (installFlexibleUpdateUseCase != null) {
                gVar.f34559r0 = 1;
                objExecute = installFlexibleUpdateUseCase.execute(gVar);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objExecute);
        if (((Boolean) objExecute).booleanValue()) {
            z10 = true;
        }
        return Boxing.boxBoolean(z10);
    }

    public boolean isNetworkModalEnabled() {
        return true;
    }

    public void loadRememberedUser() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h(null), 3, null);
    }

    public final void markAsPerformed(@NotNull String action, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.zipActionsFlow.markAsPerformed(action, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object migrateRememberedUser(@NotNull Continuation<? super Unit> continuation) {
        ViewModelComponentsProviders viewModelComponentsProviders = this.provider;
        Object objExecute = ((MigrateRememberedUserUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(MigrateRememberedUserUseCase.class), null, null)).execute(continuation);
        return objExecute == ek.a.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    @Nullable
    public Object onNewSession(@NotNull Continuation<? super Unit> continuation) {
        return c(this, continuation);
    }

    public final void runSplashFlow(@Nullable LinkParams params, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l(activity, params, null), 3, null);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricSplashViewModel
    public void setActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f34539t0.setActivity(activity);
    }

    public final void setIntent(@NotNull SplashContract.Intent intent) {
        ShortcutComponentLauncher shortcutComponentLauncher;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent, SplashContract.Intent.Started.INSTANCE)) {
            ((SharedPreferences) this.f34543y0.getValue()).edit().putBoolean("user-is-logged", false).apply();
            return;
        }
        if (intent instanceof SplashContract.Intent.ShortcutWebMessage) {
            SplashContract.Intent.ShortcutWebMessage shortcutWebMessage = (SplashContract.Intent.ShortcutWebMessage) intent;
            String channelWebName = shortcutWebMessage.getChannelWebName();
            ShortcutActions actions = shortcutWebMessage.getActions();
            if (Build.VERSION.SDK_INT >= 25 && (shortcutComponentLauncher = (ShortcutComponentLauncher) this.provider.provide(ShortcutController.ID)) != null) {
                shortcutComponentLauncher.setAction(actions);
            }
            MessageDispatcher messageDispatcher = (MessageDispatcher) this.K0.getValue();
            if (messageDispatcher != null) {
                messageDispatcher.sendMessage(channelWebName, actions.getRoute());
            }
        }
    }

    public final void setNonRestrictiveRootScreenShown(boolean value) {
        Storage.DefaultImpls.set$default(LocalStorage.INSTANCE.getStorage(), LocalStorageConstantsKt.KEY_IS_NON_RESTRICTIVE_ROOT_SCREEN_ALREADY_SHOWN, true, false, 4, (Object) null);
    }

    public final void setShouldShowRootFragment(@NotNull MutableLiveData<RootModalType> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.shouldShowRootFragment = mutableLiveData;
    }

    public void setupActions() {
        String id = AppSettingsDataManager.ACTION_GET_SETTINGS_SUCCESS.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        String id2 = AppSettingsDataManager.ACTION_GET_SETTINGS_ERROR.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
        this.zipActionsFlow.addActions(ActionKt.justAction(ActionConstants.ACTION_SCREEN_LOADED), ActionKt.justAction(ACTION_FETCH_FEATURE_FLAGS), ActionKt.justAction(ACTION_SESSION_CREATED), ActionKt.anyOfAction(id, id2), ActionKt.anyOfAction(RootCheckerComponent.ACTION_ROOTED, RootCheckerComponent.ACTION_NOT_ROOTED), ActionKt.anyOfAction(ACTION_DEEPLINK_READ, ACTION_DEEPLINK_NOT_READ));
    }

    public void trackShortcutEvent(@NotNull String shortcutId) {
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricSplashViewModel
    public void updateBiometricAuthentication(@NotNull BiometryAuthState biometricAuthState) {
        Intrinsics.checkNotNullParameter(biometricAuthState, "biometricAuthState");
        this.f34539t0.updateBiometricAuthentication(biometricAuthState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SplashGlobalViewModel(@NotNull final ViewModelComponentsProviders provider, @NotNull ZipActionsFlow zipActionsFlow, @NotNull DeeplinkDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(zipActionsFlow, "zipActionsFlow");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.provider = provider;
        this.zipActionsFlow = zipActionsFlow;
        this.f34538s0 = dispatcher;
        this.f34539t0 = new DefaultBiometricSplashViewModel(provider, zipActionsFlow);
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<Crashlytics>() { // from class: com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomoutils.mobileservices.craslytics.Crashlytics, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Crashlytics invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(Crashlytics.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f34541w0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<RootCheckerComponent>() { // from class: com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.root.checker.RootCheckerComponent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RootCheckerComponent invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(RootCheckerComponent.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f34542x0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<SessionTokenGenerator>() { // from class: com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.session.SessionTokenGenerator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SessionTokenGenerator invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(SessionTokenGenerator.class), objArr4, objArr5);
            }
        });
        final StringQualifier stringQualifierNamed = QualifierKt.named(PrefsStorageDataManager.ID);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        this.f34543y0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<SharedPreferences>() { // from class: com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SharedPreferences invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(SharedPreferences.class), stringQualifierNamed, objArr6);
            }
        });
        final f fVar = new f();
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.E0 = LazyKt__LazyJVMKt.lazy(new Function0<InstallFlexibleUpdateUseCase>() { // from class: com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.base.inappupdate.usecase.InstallFlexibleUpdateUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final InstallFlexibleUpdateUseCase invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(InstallFlexibleUpdateUseCase.class), objArr7, fVar);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.F0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<Session>() { // from class: com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.session.Session, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Session invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(Session.class), objArr8, objArr9);
            }
        });
        this.shouldShowRootFragment = new MutableLiveData<>();
        Channel<SplashContract.Event> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.I0 = channelChannel$default;
        this.events = FlowKt.receiveAsFlow(channelChannel$default);
        this.K0 = LazyKt__LazyJVMKt.lazy(new i());
        this.L0 = LazyKt__LazyJVMKt.lazy(new k());
        zipActionsFlow.onActionPerformed(new a());
        zipActionsFlow.onComplete(new b());
    }

    public void logActivityEvent() {
    }

    public void makeAnonymousLogin() {
    }
}
