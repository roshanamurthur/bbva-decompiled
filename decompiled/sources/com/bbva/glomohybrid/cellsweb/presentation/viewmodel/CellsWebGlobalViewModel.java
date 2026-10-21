package com.bbva.glomohybrid.cellsweb.presentation.viewmodel;

import androidx.camera.core.imagecapture.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.WebViewBuilder;
import com.bbva.cellscore.web.WebController;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.dm.storage.PrefsStorageDataManager;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.model.UserTypeKt;
import com.bbva.glomo.user.domain.usecase.GetUserTypeUseCase;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import com.bbva.glomohybrid.base.delegates.EventsModalDelegate;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import com.bbva.glomohybrid.base.file.viewmodel.FileManagerComponent;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.session.Session;
import com.bbva.glomohybrid.base.session.SessionTokenGenerator;
import com.bbva.glomohybrid.base.snackbar.DefaultSnackBarDelegate;
import com.bbva.glomohybrid.base.snackbar.SnackBarDelegate;
import com.bbva.glomohybrid.base.snackbar.SnackbarSpec;
import com.bbva.glomohybrid.base.snackbar.SnackbarState;
import com.bbva.glomohybrid.base.usecase.UseCaseConstants;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.cellsweb.presentation.CellsWebContract;
import com.bbva.glomohybrid.cellsweb.presentation.livedata.NetworkMonitorLiveData;
import com.bbva.glomohybrid.cellsweb.presentation.model.ModalsContract;
import com.bbva.glomohybrid.cellsweb.presentation.model.ScreenStateKt;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModelDelegate;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeeplinkWebContract;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import com.bbva.networkmonitor.component.NetworkMonitorDataManager;
import com.bbva.slidemenuview.data.MenuType;
import com.bbva.slidemenuview.domain.model.MenuClickAction;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.slidemenuview.presentation.CustomMenuItemClickDelegate;
import com.bbva.slidemenuview.presentation.MenuDelegate;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
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

/* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 x2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001xB\u0017\u0012\u0006\u0010t\u001a\u00020s\u0012\u0006\u0010u\u001a\u00020\u0004¢\u0006\u0004\bv\u0010wJ\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001J\t\u0010\u0015\u001a\u00020\bH\u0096\u0001J\t\u0010\u0016\u001a\u00020\bH\u0096\u0001J\t\u0010\u0017\u001a\u00020\bH\u0096\u0001J\t\u0010\u0018\u001a\u00020\bH\u0096\u0001J\u0015\u0010\u001b\u001a\u00020\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0001J\u001f\u0010!\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u0002` 0\u001cH\u0096\u0001J!\u0010#\u001a\u00020\b2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u0002` H\u0096\u0001J\b\u0010$\u001a\u00020\bH\u0016J\b\u0010%\u001a\u00020\bH\u0016J\u000e\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001fJ\u000e\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001fJ\u0006\u0010*\u001a\u00020\bJ\u000e\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020+J\u0006\u0010.\u001a\u00020\bJ\u0013\u0010/\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u00100J\b\u00102\u001a\u000201H\u0016J\u000e\u00104\u001a\u00020\b2\u0006\u00103\u001a\u00020\u001eJ\u000e\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001cH\u0016J\u0010\u00109\u001a\u00020\b2\u0006\u00108\u001a\u000207H\u0016J\b\u0010:\u001a\u00020\bH\u0016J\u0010\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H\u0016J\u0010\u0010>\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u0002050\u001cH\u0004J\u0010\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020@H\u0004J\u0006\u0010C\u001a\u00020\bR \u0010I\u001a\b\u0012\u0004\u0012\u0002050D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010M\u001a\b\u0012\u0004\u0012\u00020J0D8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010HR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020J0\u001c8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR#\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0S0\u001c8\u0006¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010QR\u001d\u0010\\\u001a\u0004\u0018\u00010W8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001d\u0010a\u001a\u0004\u0018\u00010]8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010`R\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020c0b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001e\u0010l\u001a\u0004\u0018\u00010g8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010o\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006y"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebGlobalViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeepLinkWebViewModel;", "Lcom/bbva/glomohybrid/base/snackbar/SnackBarDelegate;", "Lcom/bbva/slidemenuview/presentation/MenuDelegate;", "Lcom/bbva/glomohybrid/base/delegates/EventsModalDelegate;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "configDeeplinkObservers", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", DeepLinkListenerAdapter.Constants.DEEP_LINK, "handleGemaLink", "handlePrivateDeepLink", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "shortcut", "handlePrivateShortcut", "handlePublicDeepLink", "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "qr", "handleQRLink", "notifyDeepLink", "notifyGemaDeeplink", "notifyShortcut", "onItemClicked", "Lcom/bbva/slidemenuview/domain/model/MenuClickAction;", AnalyticsConstants.Key.ITEM, "onStoreItemClicked", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "", "", "Lcom/bbva/slidemenuview/presentation/MenuItemConsumed;", "refreshMenuObserver", "menuItemConsumed", "updateFeaturedItem", "initView", "onCloseSession", "isOpened", "sendIsOpenedEvent", "storeKey", "saveStoreKey", "onRateApp", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Intent;", "intent", "setIntent", "notifyRememberedUser", "updateMenu", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "computeUserType", "params", "onUserLifePoints", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "snackBarObserver", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "snackbarSpec", "showSnackBar", "hideSnackBar", "Lcom/bbva/glomohybrid/base/models/ModalType;", "modal", "onModalConfirmClick", "onModalCancelClick", "networkLiveData", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Event;", "event", "sendEvent", "notifyDeeplinkAfterLoadedPage", "Landroidx/lifecycle/MediatorLiveData;", "u0", "Landroidx/lifecycle/MediatorLiveData;", "getSnackbarLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "snackbarLiveData", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "v0", "get_userMenu", "_userMenu", "w0", "Landroidx/lifecycle/LiveData;", "getUserMenuLiveData", "()Landroidx/lifecycle/LiveData;", "userMenuLiveData", "Lcom/bbva/glomohybrid/base/models/common/Event;", "y0", "getEvents", "events", "Lcom/bbva/cellscore/web/WebController;", "I0", "Lkotlin/Lazy;", "getController$CellsWeb_mexicoRelease", "()Lcom/bbva/cellscore/web/WebController;", "controller", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/PendingDeeplinkDispatcher;", "L0", "getPendingDeeplinkListener", "()Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/PendingDeeplinkDispatcher;", "pendingDeeplinkListener", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeeplinkWebContract$Event;", "getDeeplinkEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "deeplinkEvents", "Lcom/bbva/slidemenuview/presentation/CustomMenuItemClickDelegate;", "getDelegate", "()Lcom/bbva/slidemenuview/presentation/CustomMenuItemClickDelegate;", "setDelegate", "(Lcom/bbva/slidemenuview/presentation/CustomMenuItemClickDelegate;)V", "delegate", "getId", "()Ljava/lang/String;", "id", "isUserLogged$CellsWeb_mexicoRelease", "()Z", "isUserLogged", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "menuDelegate", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/slidemenuview/presentation/MenuDelegate;)V", "Companion", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCellsWebGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsWebGlobalViewModel.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebGlobalViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,299:1\n56#2,6:300\n56#2,6:310\n56#2,6:320\n29#3,4:306\n29#3,4:316\n45#3:326\n120#4:327\n158#5:328\n*S KotlinDebug\n*F\n+ 1 CellsWebGlobalViewModel.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebGlobalViewModel\n*L\n99#1:300,6\n123#1:310,6\n127#1:320,6\n105#1:306,4\n125#1:316,4\n176#1:326\n176#1:327\n176#1:328\n*E\n"})
public class CellsWebGlobalViewModel extends BaseViewModel implements DeepLinkWebViewModel, SnackBarDelegate, MenuDelegate, EventsModalDelegate {

    @NotNull
    public static final String ID = "cells-web-view-model";

    @NotNull
    public final Lazy E0;

    @NotNull
    public final Lazy F0;

    @NotNull
    public final Lazy G0;

    @NotNull
    public final Lazy H0;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @NotNull
    public final Lazy controller;

    @NotNull
    public final Lazy J0;

    @NotNull
    public final Lazy K0;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @NotNull
    public final Lazy pendingDeeplinkListener;

    @NotNull
    public final Lazy M0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f31765q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ DeepLinkWebViewModelDelegate f31766r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MenuDelegate f31767s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f31768t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MediatorLiveData<SnackbarState> snackbarLiveData;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final MediatorLiveData<UserMenu> _userMenu;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final MediatorLiveData f31770w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Event<CellsWebContract.Event>> f31771x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f31772y0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ActionSpec<Object> N0 = new ActionSpec<>("user-type-modal-change-user-action");

    @NotNull
    public static final ActionSpec<Object> O0 = new ActionSpec<>("user-type-modal-gt-error-action");

    @NotNull
    public static final ActionSpec<WebViewBuilder> P0 = new ActionSpec<>("user-type-switch-web");

    @NotNull
    public static final ActionSpec<Void> Q0 = new ActionSpec<>("clean-web-ready-channel");

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebGlobalViewModel$Companion;", "", "()V", "CHANGE_USER", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "getCHANGE_USER", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "CLEAN_WEB_READY_CHANNEL", "Ljava/lang/Void;", "getCLEAN_WEB_READY_CHANNEL", "GT_ERROR", "getGT_ERROR", "ID", "", "SWITCH_WEB", "Lcom/bbva/cellscore/app/WebViewBuilder;", "getSWITCH_WEB", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Object> getCHANGE_USER() {
            return CellsWebGlobalViewModel.N0;
        }

        @NotNull
        public final ActionSpec<Void> getCLEAN_WEB_READY_CHANNEL() {
            return CellsWebGlobalViewModel.Q0;
        }

        @NotNull
        public final ActionSpec<Object> getGT_ERROR() {
            return CellsWebGlobalViewModel.O0;
        }

        @NotNull
        public final ActionSpec<WebViewBuilder> getSWITCH_WEB() {
            return CellsWebGlobalViewModel.P0;
        }
    }

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public a(Object obj) {
            super(1, obj, CellsWebGlobalViewModel.class, "updateUserLifePoints", "updateUserLifePoints(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            CellsWebGlobalViewModel.access$updateUserLifePoints((CellsWebGlobalViewModel) this.receiver, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    public static final class b extends Lambda implements Function0<WebController> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final WebController invoke() {
            return (WebController) CellsWebGlobalViewModel.this.f31765q0.provide(WebActions.ID);
        }
    }

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    public static final class c extends Lambda implements Function0<MessageDispatcher> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MessageDispatcher invoke() {
            Object objProvide = CellsWebGlobalViewModel.this.f31765q0.provide("web-dispatcher");
            if (objProvide != null) {
                return (MessageDispatcher) objProvide;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$notifyDeeplinkAfterLoadedPage$1", f = "CellsWebGlobalViewModel.kt", i = {1}, l = {286, 287, 288}, m = "invokeSuspend", n = {"isGema"}, s = {"I$0"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31775p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f31776q0;

        /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$notifyDeeplinkAfterLoadedPage$1$1", f = "CellsWebGlobalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ boolean f31778p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ CellsWebGlobalViewModel f31779q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CellsWebGlobalViewModel cellsWebGlobalViewModel, Continuation continuation, boolean z10) {
                super(2, continuation);
                this.f31778p0 = z10;
                this.f31779q0 = cellsWebGlobalViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f31779q0, continuation, this.f31778p0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                boolean z10 = this.f31778p0;
                CellsWebGlobalViewModel cellsWebGlobalViewModel = this.f31779q0;
                if (z10) {
                    cellsWebGlobalViewModel.notifyGemaDeeplink();
                } else {
                    cellsWebGlobalViewModel.notifyDeepLink();
                }
                return Unit.INSTANCE;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebGlobalViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0047  */
        /* JADX WARN: Code duplicated, block: B:23:0x0054 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x005d  */
        /* JADX WARN: Code duplicated, block: B:29:0x006a A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i10;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = this.f31776q0;
            CellsWebGlobalViewModel cellsWebGlobalViewModel = CellsWebGlobalViewModel.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i11 == 2) {
                    i10 = this.f31775p0;
                    ResultKt.throwOnFailure(obj);
                    main = Dispatchers.getMain();
                    aVar = new a(cellsWebGlobalViewModel, null, i10 != 0);
                    this.f31776q0 = 3;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (cellsWebGlobalViewModel instanceof UserTypeViewModelDelegate) {
                GetUserTypeUseCase getUserTypeUseCase = ((UserTypeViewModelDelegate) cellsWebGlobalViewModel).getGetUserTypeUseCase();
                this.f31776q0 = 1;
                obj = getUserTypeUseCase.execute(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                i10 = 0;
            }
            this.f31775p0 = i10;
            this.f31776q0 = 2;
            if (DelayKt.delay(400L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            main = Dispatchers.getMain();
            aVar = new a(cellsWebGlobalViewModel, null, i10 != 0);
            this.f31776q0 = 3;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            if (obj == UserType.ENTERPRISE) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f31775p0 = i10;
            this.f31776q0 = 2;
            if (DelayKt.delay(400L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            main = Dispatchers.getMain();
            aVar = new a(cellsWebGlobalViewModel, null, i10 != 0);
            this.f31776q0 = 3;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$notifyRememberedUser$1", f = "CellsWebGlobalViewModel.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31780p0;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebGlobalViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31780p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f31780p0 = 1;
                if (CellsWebGlobalViewModel.this.updateMenu(this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$onCloseSession$1", f = "CellsWebGlobalViewModel.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31782p0;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebGlobalViewModel.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31782p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CellsWebGlobalViewModel cellsWebGlobalViewModel = CellsWebGlobalViewModel.this;
                CellsWebGlobalViewModel.access$getSessionTokenGenerator(cellsWebGlobalViewModel).clearCache();
                SessionTokenGenerator sessionTokenGeneratorAccess$getSessionTokenGenerator = CellsWebGlobalViewModel.access$getSessionTokenGenerator(cellsWebGlobalViewModel);
                UserType userType = UserType.PERSONAL;
                this.f31782p0 = 1;
                if (sessionTokenGeneratorAccess$getSessionTokenGenerator.generate(userType, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    public static final class g extends Lambda implements Function0<PrefsStorageDataManager> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PrefsStorageDataManager invoke() {
            Object objProvide = CellsWebGlobalViewModel.this.f31765q0.provide(PrefsStorageDataManager.ID);
            if (objProvide != null) {
                return (PrefsStorageDataManager) objProvide;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    public static final class h implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f31785a;

        public h(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f31785a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f31785a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f31785a;
        }

        public final int hashCode() {
            return this.f31785a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31785a.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$sendIsOpenedEvent$1", f = "CellsWebGlobalViewModel.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31786p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f31788r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Continuation continuation, boolean z10) {
            super(2, continuation);
            this.f31788r0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebGlobalViewModel.this.new i(continuation, this.f31788r0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31786p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f31786p0 = 1;
                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CellsWebGlobalViewModel.access$getMessageDispatcher(CellsWebGlobalViewModel.this).sendMessage(CellsChannels.NATIVE_WEBVIEW_OPENED, Boxing.boxBoolean(this.f31788r0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    public static final class j extends Lambda implements Function1<SnackbarState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MediatorLiveData<SnackbarState> f31789p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MediatorLiveData<SnackbarState> mediatorLiveData) {
            super(1);
            this.f31789p0 = mediatorLiveData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SnackbarState snackbarState) {
            this.f31789p0.setValue(snackbarState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel", f = "CellsWebGlobalViewModel.kt", i = {0, 1, 1, 2, 2, 2}, l = {174, 175, 178}, m = "updateMenu", n = {"this", "this", "rememberedUser", "this", "rememberedUser", "isActive"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "I$0"})
    public static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CellsWebGlobalViewModel f31790p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public RememberedUser f31791q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f31792r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f31793s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f31795u0;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31793s0 = obj;
            this.f31795u0 |= Integer.MIN_VALUE;
            return CellsWebGlobalViewModel.this.updateMenu(this);
        }
    }

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    public static final class l extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RememberedUser f31796p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(RememberedUser rememberedUser) {
            super(0);
            this.f31796p0 = rememberedUser;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(this.f31796p0);
        }
    }

    /* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
    public static final class m extends Lambda implements Function0<UserStoredDatasource> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserStoredDatasource invoke() {
            return (UserStoredDatasource) CellsWebGlobalViewModel.this.f31765q0.provide(UserStoredDatasource.ID);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CellsWebGlobalViewModel(@NotNull final ViewModelComponentsProviders provider, @NotNull MenuDelegate menuDelegate) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(menuDelegate, "menuDelegate");
        this.f31765q0 = provider;
        this.f31766r0 = new DeepLinkWebViewModelDelegate(provider);
        new DefaultSnackBarDelegate();
        this.f31767s0 = menuDelegate;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.f31768t0 = mutableLiveData;
        MediatorLiveData<SnackbarState> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(networkLiveData(), new h(new j(mediatorLiveData)));
        this.snackbarLiveData = mediatorLiveData;
        MediatorLiveData<UserMenu> mediatorLiveData2 = new MediatorLiveData<>();
        mediatorLiveData2.addSource(mutableLiveData, new h(new a(this)));
        this._userMenu = mediatorLiveData2;
        this.f31770w0 = mediatorLiveData2;
        MutableLiveData<Event<CellsWebContract.Event>> mutableLiveData2 = new MutableLiveData<>();
        this.f31771x0 = mutableLiveData2;
        this.f31772y0 = mutableLiveData2;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.E0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SuspendGetRememberedUserUseCase>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SuspendGetRememberedUserUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(SuspendGetRememberedUserUseCase.class), qualifier, objArr);
            }
        });
        this.F0 = LazyKt__LazyJVMKt.lazy(new m());
        final StringQualifier stringQualifierNamed = QualifierKt.named(UserTypeKt.SHOW_USERTYPE_SELECTOR_USECASE_NAME);
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.G0 = LazyKt__LazyJVMKt.lazy(new Function0<SuspendUseCase<Boolean>>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomoutils.usecase.SuspendUseCase<java.lang.Boolean>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final SuspendUseCase<Boolean> invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(SuspendUseCase.class), stringQualifierNamed, objArr2);
            }
        });
        this.H0 = LazyKt__LazyJVMKt.lazy(new g());
        this.controller = LazyKt__LazyJVMKt.lazy(new b());
        this.J0 = LazyKt__LazyJVMKt.lazy(new c());
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr3 = 0 == true ? 1 : 0;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.K0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<Session>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$special$$inlined$inject$default$2
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
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(Session.class), objArr3, objArr4);
            }
        });
        final Object[] objArr5 = 0 == true ? 1 : 0;
        final Object[] objArr6 = 0 == true ? 1 : 0;
        this.pendingDeeplinkListener = LazyKt__LazyJVMKt.lazy(new Function0<PendingDeeplinkDispatcher>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$special$$inlined$injectOrNull$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.cellsweb.presentation.viewmodel.PendingDeeplinkDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final PendingDeeplinkDispatcher invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(PendingDeeplinkDispatcher.class), objArr5, objArr6);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr7 = 0 == true ? 1 : 0;
        final Object[] objArr8 = 0 == true ? 1 : 0;
        this.M0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<SessionTokenGenerator>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$special$$inlined$inject$default$3
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
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(SessionTokenGenerator.class), objArr7, objArr8);
            }
        });
        configDeeplinkObservers(ViewModelKt.getViewModelScope(this));
        FlowKt.launchIn(FlowKt.onEach(getDeeplinkEvents(), new l8.b(this, null)), ViewModelKt.getViewModelScope(this));
    }

    public static final MessageDispatcher access$getMessageDispatcher(CellsWebGlobalViewModel cellsWebGlobalViewModel) {
        return (MessageDispatcher) cellsWebGlobalViewModel.J0.getValue();
    }

    public static final SessionTokenGenerator access$getSessionTokenGenerator(CellsWebGlobalViewModel cellsWebGlobalViewModel) {
        return (SessionTokenGenerator) cellsWebGlobalViewModel.M0.getValue();
    }

    public static final void access$updateUserLifePoints(CellsWebGlobalViewModel cellsWebGlobalViewModel, int i10) {
        MediatorLiveData<UserMenu> mediatorLiveData = cellsWebGlobalViewModel._userMenu;
        UserMenu value = mediatorLiveData.getValue();
        if (value != null) {
            mediatorLiveData.setValue(UserMenu.copy$default(value, null, null, false, null, false, i10, 31, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ModalsContract.Intent intent) {
        if ((intent.getModal() instanceof ModalType.ChangeProfileRequestByDeeplink) && (this instanceof UserTypeViewModelDelegate)) {
            if (intent instanceof ModalsContract.Intent.ConfirmClick) {
                ((UserTypeViewModelDelegate) this).confirmChangeProfile(((ModalType.ChangeProfileRequestByDeeplink) intent.getModal()).getTarget());
            } else {
                ((UserTypeViewModelDelegate) this).cancelChangeProfile();
            }
        }
    }

    @NotNull
    public String computeUserType() {
        return UserType.PERSONAL.getValue();
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void configDeeplinkObservers(@NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f31766r0.configDeeplinkObservers(scope);
    }

    @Nullable
    public final WebController getController$CellsWeb_mexicoRelease() {
        return (WebController) this.controller.getValue();
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    @NotNull
    public SharedFlow<DeeplinkWebContract.Event> getDeeplinkEvents() {
        return this.f31766r0.getDeeplinkEvents();
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    @Nullable
    public CustomMenuItemClickDelegate getDelegate() {
        return this.f31767s0.getDelegate();
    }

    @NotNull
    public final LiveData<Event<CellsWebContract.Event>> getEvents() {
        return this.f31772y0;
    }

    @Override // com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return "cells-web-view-model";
    }

    @Nullable
    public final PendingDeeplinkDispatcher getPendingDeeplinkListener() {
        return (PendingDeeplinkDispatcher) this.pendingDeeplinkListener.getValue();
    }

    @NotNull
    public MediatorLiveData<SnackbarState> getSnackbarLiveData() {
        return this.snackbarLiveData;
    }

    @NotNull
    public final LiveData<UserMenu> getUserMenuLiveData() {
        return this.f31770w0;
    }

    @NotNull
    public final MediatorLiveData<UserMenu> get_userMenu() {
        return this._userMenu;
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void handleGemaLink(@NotNull DeepLinkModel deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.f31766r0.handleGemaLink(deepLink);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void handlePrivateDeepLink(@NotNull DeepLinkModel deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.f31766r0.handlePrivateDeepLink(deepLink);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void handlePrivateShortcut(@NotNull ShortcutModel shortcut) {
        Intrinsics.checkNotNullParameter(shortcut, "shortcut");
        this.f31766r0.handlePrivateShortcut(shortcut);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void handlePublicDeepLink(@NotNull DeepLinkModel deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.f31766r0.handlePublicDeepLink(deepLink);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void handleQRLink(@NotNull QRPayload qr) {
        Intrinsics.checkNotNullParameter(qr, "qr");
        this.f31766r0.handleQRLink(qr);
    }

    @Override // com.bbva.glomohybrid.base.snackbar.SnackBarDelegate
    public void hideSnackBar() {
        SnackBarDelegate.DefaultImpls.hideSnackBar(this);
        getSnackbarLiveData().setValue(SnackbarState.Hide.INSTANCE);
    }

    public final boolean isUserLogged$CellsWeb_mexicoRelease() {
        UserStoredDatasource userStoredDatasource = (UserStoredDatasource) this.F0.getValue();
        if (userStoredDatasource != null) {
            return userStoredDatasource.isLogged();
        }
        return false;
    }

    @NotNull
    public final LiveData<SnackbarState> networkLiveData() {
        return new NetworkMonitorLiveData((NetworkMonitorDataManager) this.f31765q0.provide(NetworkMonitorDataManager.ID)).toLiveData();
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void notifyDeepLink() {
        this.f31766r0.notifyDeepLink();
    }

    public final void notifyDeeplinkAfterLoadedPage() {
        if (isUserLogged$CellsWeb_mexicoRelease()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(null), 2, null);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void notifyGemaDeeplink() {
        this.f31766r0.notifyGemaDeeplink();
    }

    public final void notifyRememberedUser() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e(null), 3, null);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void notifyShortcut() {
        this.f31766r0.notifyShortcut();
    }

    public void onCloseSession() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f(null), 3, null);
        ((Session) this.K0.getValue()).close();
        CellsReactor.fire("cells-web-view-model", FileManagerComponent.INSTANCE.getACTION_CLOSE_SESSION(), Boolean.TRUE);
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    public void onItemClicked() {
        this.f31767s0.onItemClicked();
    }

    @Override // com.bbva.glomohybrid.base.delegates.EventsModalDelegate
    public void onModalCancelClick(@NotNull ModalType modal) {
        Intrinsics.checkNotNullParameter(modal, "modal");
        EventsModalDelegate.DefaultImpls.onModalCancelClick(this, modal);
        if (modal instanceof ModalType.ChangeProfileRequestByDeeplink) {
            a(new ModalsContract.Intent.CancelClick(modal));
        }
    }

    @Override // com.bbva.glomohybrid.base.delegates.EventsModalDelegate
    public void onModalConfirmClick(@NotNull ModalType modal) {
        Intrinsics.checkNotNullParameter(modal, "modal");
        EventsModalDelegate.DefaultImpls.onModalConfirmClick(this, modal);
        if (modal instanceof ModalType.ChangeProfileRequestByDeeplink) {
            a(new ModalsContract.Intent.ConfirmClick(modal));
        }
    }

    public final void onRateApp() {
        CellsReactor.fire$default("cells-web-view-model", ActionConstants.INSTANCE.getACTION_RATE_APP(), null, 4, null);
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    public void onStoreItemClicked(@Nullable MenuClickAction item) {
        this.f31767s0.onStoreItemClicked(item);
    }

    public final void onUserLifePoints(int params) {
        this.f31768t0.setValue(Integer.valueOf(params));
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    @NotNull
    public LiveData<Pair<Integer, Boolean>> refreshMenuObserver() {
        return this.f31767s0.refreshMenuObserver();
    }

    public final void saveStoreKey(boolean storeKey) {
        ((PrefsStorageDataManager) this.H0.getValue()).save("user-is-logged", Boolean.valueOf(storeKey));
    }

    public final void sendEvent(@NotNull CellsWebContract.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f31771x0.setValue(new Event<>(event));
    }

    public final void sendIsOpenedEvent(boolean isOpened) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new i(null, isOpened), 3, null);
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    public void setDelegate(@Nullable CustomMenuItemClickDelegate customMenuItemClickDelegate) {
        this.f31767s0.setDelegate(customMenuItemClickDelegate);
    }

    public final void setIntent(@NotNull CellsWebContract.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent, CellsWebContract.Intent.CloseScreen.INSTANCE)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l8.a(this, null), 3, null);
        } else if (intent instanceof CellsWebContract.Intent.ScreenStateChange) {
            ((MessageDispatcher) this.J0.getValue()).sendMessage("web_view_visibility", ScreenStateKt.toMap(((CellsWebContract.Intent.ScreenStateChange) intent).getScreenState()));
        }
    }

    @Override // com.bbva.glomohybrid.base.snackbar.SnackBarDelegate
    public void showSnackBar(@NotNull SnackbarSpec snackbarSpec) {
        Intrinsics.checkNotNullParameter(snackbarSpec, "snackbarSpec");
        getSnackbarLiveData().setValue(new SnackbarState.Show(snackbarSpec));
    }

    @Override // com.bbva.glomohybrid.base.snackbar.SnackBarDelegate
    @NotNull
    public LiveData<SnackbarState> snackBarObserver() {
        return getSnackbarLiveData();
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    public void updateFeaturedItem(@NotNull Pair<Integer, Boolean> menuItemConsumed) {
        Intrinsics.checkNotNullParameter(menuItemConsumed, "menuItemConsumed");
        this.f31767s0.updateFeaturedItem(menuItemConsumed);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v29 */
    @Nullable
    public final Object updateMenu(@NotNull Continuation<? super Unit> continuation) {
        k kVar;
        CellsWebGlobalViewModel cellsWebGlobalViewModel;
        RememberedUser rememberedUser;
        boolean zBooleanValue;
        RememberedUser rememberedUser2;
        CellsWebGlobalViewModel cellsWebGlobalViewModel2;
        SuspendUseCase suspendUseCase;
        boolean zBooleanValue2;
        Object objExecute;
        int i10;
        CellsWebGlobalViewModel cellsWebGlobalViewModel3;
        RememberedUser rememberedUser3;
        ?? r1;
        String username;
        String strCapitalizeSentence$default;
        boolean z10;
        Integer value;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f31795u0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f31795u0 = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objExecute2 = kVar.f31793s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i12 = kVar.f31795u0;
        if (i12 != 0) {
            if (i12 == 1) {
                cellsWebGlobalViewModel = kVar.f31790p0;
                ResultKt.throwOnFailure(objExecute2);
            } else {
                if (i12 == 2) {
                    rememberedUser2 = kVar.f31791q0;
                    cellsWebGlobalViewModel2 = kVar.f31790p0;
                    ResultKt.throwOnFailure(objExecute2);
                    CellsWebGlobalViewModel cellsWebGlobalViewModel4 = cellsWebGlobalViewModel2;
                    rememberedUser = rememberedUser2;
                    cellsWebGlobalViewModel = cellsWebGlobalViewModel4;
                    zBooleanValue = ((Boolean) objExecute2).booleanValue();
                    suspendUseCase = (SuspendUseCase) androidx.camera.core.impl.utils.c.f(cellsWebGlobalViewModel.f31765q0).getOrNull(Reflection.getOrCreateKotlinClass(SuspendUseCase.class), QualifierKt.named(UseCaseConstants.isTokenActiveUseCase), new l(rememberedUser));
                    if (suspendUseCase != null) {
                        kVar.f31790p0 = cellsWebGlobalViewModel;
                        kVar.f31791q0 = rememberedUser;
                        kVar.f31792r0 = zBooleanValue ? 1 : 0;
                        kVar.f31795u0 = 3;
                        objExecute = suspendUseCase.execute(kVar);
                        if (objExecute == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i10 = zBooleanValue ? 1 : 0;
                        objExecute2 = objExecute;
                        cellsWebGlobalViewModel3 = cellsWebGlobalViewModel;
                        rememberedUser3 = rememberedUser;
                    } else {
                        zBooleanValue2 = false;
                        r1 = zBooleanValue;
                    }
                    MediatorLiveData<UserMenu> mediatorLiveData = cellsWebGlobalViewModel._userMenu;
                    if (rememberedUser != null) {
                        username = rememberedUser.getUsername();
                    } else {
                        username = null;
                    }
                    strCapitalizeSentence$default = StringExtensionsKt.capitalizeSentence$default(username, null, 1, null);
                    if (strCapitalizeSentence$default == null) {
                        strCapitalizeSentence$default = "";
                    }
                    String str = strCapitalizeSentence$default;
                    MenuType menuType = MenuType.PRIVATE;
                    if (r1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String strComputeUserType = cellsWebGlobalViewModel.computeUserType();
                    value = cellsWebGlobalViewModel.f31768t0.getValue();
                    if (value == null) {
                        value = Boxing.boxInt(0);
                    }
                    mediatorLiveData.setValue(new UserMenu(str, menuType, z10, strComputeUserType, zBooleanValue2, value.intValue()));
                    return Unit.INSTANCE;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = kVar.f31792r0;
                rememberedUser3 = kVar.f31791q0;
                cellsWebGlobalViewModel3 = kVar.f31790p0;
                ResultKt.throwOnFailure(objExecute2);
            }
            zBooleanValue2 = ((Boolean) objExecute2).booleanValue();
            r1 = i10;
            rememberedUser = rememberedUser3;
            cellsWebGlobalViewModel = cellsWebGlobalViewModel3;
            MediatorLiveData<UserMenu> mediatorLiveData2 = cellsWebGlobalViewModel._userMenu;
            if (rememberedUser != null) {
                username = rememberedUser.getUsername();
            } else {
                username = null;
            }
            strCapitalizeSentence$default = StringExtensionsKt.capitalizeSentence$default(username, null, 1, null);
            if (strCapitalizeSentence$default == null) {
                strCapitalizeSentence$default = "";
            }
            String str2 = strCapitalizeSentence$default;
            MenuType menuType2 = MenuType.PRIVATE;
            if (r1 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            String strComputeUserType2 = cellsWebGlobalViewModel.computeUserType();
            value = cellsWebGlobalViewModel.f31768t0.getValue();
            if (value == null) {
                value = Boxing.boxInt(0);
            }
            mediatorLiveData2.setValue(new UserMenu(str2, menuType2, z10, strComputeUserType2, zBooleanValue2, value.intValue()));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objExecute2);
        SuspendGetRememberedUserUseCase suspendGetRememberedUserUseCase = (SuspendGetRememberedUserUseCase) this.E0.getValue();
        kVar.f31790p0 = this;
        kVar.f31795u0 = 1;
        objExecute2 = suspendGetRememberedUserUseCase.execute(kVar);
        if (objExecute2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        cellsWebGlobalViewModel = this;
        RememberedUser rememberedUser4 = (RememberedUser) objExecute2;
        SuspendUseCase suspendUseCase2 = (SuspendUseCase) cellsWebGlobalViewModel.G0.getValue();
        if (suspendUseCase2 != null) {
            kVar.f31790p0 = cellsWebGlobalViewModel;
            kVar.f31791q0 = rememberedUser4;
            kVar.f31795u0 = 2;
            Object objExecute3 = suspendUseCase2.execute(kVar);
            if (objExecute3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            CellsWebGlobalViewModel cellsWebGlobalViewModel5 = cellsWebGlobalViewModel;
            rememberedUser2 = rememberedUser4;
            objExecute2 = objExecute3;
            cellsWebGlobalViewModel2 = cellsWebGlobalViewModel5;
            CellsWebGlobalViewModel cellsWebGlobalViewModel6 = cellsWebGlobalViewModel2;
            rememberedUser = rememberedUser2;
            cellsWebGlobalViewModel = cellsWebGlobalViewModel6;
            zBooleanValue = ((Boolean) objExecute2).booleanValue();
        } else {
            rememberedUser = rememberedUser4;
            zBooleanValue = false;
        }
        suspendUseCase = (SuspendUseCase) androidx.camera.core.impl.utils.c.f(cellsWebGlobalViewModel.f31765q0).getOrNull(Reflection.getOrCreateKotlinClass(SuspendUseCase.class), QualifierKt.named(UseCaseConstants.isTokenActiveUseCase), new l(rememberedUser));
        if (suspendUseCase != null) {
            kVar.f31790p0 = cellsWebGlobalViewModel;
            kVar.f31791q0 = rememberedUser;
            kVar.f31792r0 = zBooleanValue ? 1 : 0;
            kVar.f31795u0 = 3;
            objExecute = suspendUseCase.execute(kVar);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            i10 = zBooleanValue ? 1 : 0;
            objExecute2 = objExecute;
            cellsWebGlobalViewModel3 = cellsWebGlobalViewModel;
            rememberedUser3 = rememberedUser;
            zBooleanValue2 = ((Boolean) objExecute2).booleanValue();
            r1 = i10;
            rememberedUser = rememberedUser3;
            cellsWebGlobalViewModel = cellsWebGlobalViewModel3;
        } else {
            zBooleanValue2 = false;
            r1 = zBooleanValue;
        }
        MediatorLiveData<UserMenu> mediatorLiveData3 = cellsWebGlobalViewModel._userMenu;
        if (rememberedUser != null) {
            username = rememberedUser.getUsername();
        } else {
            username = null;
        }
        strCapitalizeSentence$default = StringExtensionsKt.capitalizeSentence$default(username, null, 1, null);
        if (strCapitalizeSentence$default == null) {
            strCapitalizeSentence$default = "";
        }
        String str3 = strCapitalizeSentence$default;
        MenuType menuType3 = MenuType.PRIVATE;
        if (r1 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        String strComputeUserType3 = cellsWebGlobalViewModel.computeUserType();
        value = cellsWebGlobalViewModel.f31768t0.getValue();
        if (value == null) {
            value = Boxing.boxInt(0);
        }
        mediatorLiveData3.setValue(new UserMenu(str3, menuType3, z10, strComputeUserType3, zBooleanValue2, value.intValue()));
        return Unit.INSTANCE;
    }

    public void initView() {
    }
}
