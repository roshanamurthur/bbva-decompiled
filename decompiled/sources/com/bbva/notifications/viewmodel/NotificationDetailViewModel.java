package com.bbva.notifications.viewmodel;

import android.util.Base64;
import androidx.camera.core.imagecapture.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import bk.p;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.dm.settings.AppSettingsResultExtensionsKt;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.DeeplinkConfigModel;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.channels.CellsDeepLinkChannels;
import com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcher;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import com.bbva.glomohybrid.base.handler.DeepLinkHandler;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.notifications.AnalyticsMapper;
import com.bbva.notifications.DeepLinkConstants;
import com.bbva.notifications.NotificationType;
import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import com.bbva.notifications.activity.NotificationNoCommercialContract;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.notifications.delegate.LogEventDelegate;
import com.bbva.notifications.delegate.PushDataProcessorDelegate;
import com.bbva.notifications.extensions.HashMapExtensionsKt;
import com.bbva.notifications.extensions.SalesforceDeepLinkModelExtensionsKt;
import com.bbva.notifications.model.EventDialer;
import com.bbva.notifications.model.NotificationDetailItem;
import com.bbva.notifications.model.NotificationNoCommercialData;
import com.bbva.notifications.model.NotificationNoCommercialDataKt;
import com.bbva.notifications.model.NotificationShortcutItemModel;
import com.bbva.notifications.model.NotificationView;
import com.bbva.notifications.model.ShortcutAction;
import com.bbva.notifications.model.Timer;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.notifications.presentation.behaviours.TimerBehaviour;
import com.bbva.notifications.usecase.CreateNotificationNonCommercialUseCase;
import com.bbva.notifications.usecase.GetNotificationOperativesNonCommercialUseCase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: NotificationDetailViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0006\u0010\u0003\u001a\u00020\u0002J2\u0010\t\u001a\u00020\u00022*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u0007J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005J?\u0010\u0011\u001a\u00020\u00022*\u0010\u0010\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013R\u001a\u0010\u000e\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130!8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0!8F¢\u0006\u0006\u001a\u0004\b*\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/bbva/notifications/viewmodel/NotificationDetailViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "", "setUpObservers", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "notificationMap", "getNotificationData", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$Intent;", "intent", "setIntent", "sendCloseNotificationMessage", "id", "handleShortcut", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "navigateNoCommercialDeepLink", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "status", "sendIsPageReadyStatus", "r0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State;", "K0", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "Landroidx/lifecycle/LiveData;", "Lcom/bbva/notifications/model/NotificationView;", "getNotificationView", "()Landroidx/lifecycle/LiveData;", "notificationView", "getDeeplinkRead", "deeplinkRead", "Lcom/bbva/glomohybrid/base/models/common/Event;", "Lcom/bbva/glomohybrid/base/router/Route;", "getScreenNavigation", "screenNavigation", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNotificationDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDetailViewModel.kt\ncom/bbva/notifications/viewmodel/NotificationDetailViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,372:1\n56#2,6:373\n56#2,6:379\n56#2,6:385\n41#2,6:407\n47#2:414\n41#2,6:416\n47#2:423\n41#2,6:425\n47#2:432\n29#3,4:391\n29#3,4:395\n29#3,4:399\n29#3,4:403\n133#4:413\n133#4:422\n133#4:431\n107#5:415\n107#5:424\n107#5:433\n1#6:434\n288#7,2:435\n*S KotlinDebug\n*F\n+ 1 NotificationDetailViewModel.kt\ncom/bbva/notifications/viewmodel/NotificationDetailViewModel\n*L\n81#1:373,6\n83#1:379,6\n85#1:385,6\n73#1:407,6\n73#1:414\n76#1:416,6\n76#1:423\n79#1:425,6\n79#1:432\n87#1:391,4\n89#1:395,4\n97#1:399,4\n118#1:403,4\n73#1:413\n76#1:422\n79#1:431\n73#1:415\n76#1:424\n79#1:433\n329#1:435,2\n*E\n"})
public final class NotificationDetailViewModel extends BaseViewModel {

    @NotNull
    public static final String ID = "notification-detail-view-model";

    @NotNull
    public final Lazy E0;

    @NotNull
    public final MutableLiveData<Boolean> F0;

    @NotNull
    public final MutableLiveData<Event<Route>> G0;

    @Nullable
    public HashMap<String, String> H0;

    @Nullable
    public List<NotificationShortcutItemModel> I0;

    @NotNull
    public final MutableStateFlow<NotificationNoCommercialContract.State> J0;

    @NotNull
    public final MutableStateFlow K0;
    public boolean L0;

    @NotNull
    public final Lazy M0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f35475q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f35477s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f35478t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f35479u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f35480w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f35481x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<NotificationView> f35482y0;

    /* JADX INFO: compiled from: NotificationDetailViewModel.kt */
    public static final class a extends Lambda implements Function0<DeepLinkHandler> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DeepLinkHandler invoke() {
            return (DeepLinkHandler) NotificationDetailViewModel.this.f35475q0.provide(DeepLinkHandler.ID);
        }
    }

    /* JADX INFO: compiled from: NotificationDetailViewModel.kt */
    @DebugMetadata(c = "com.bbva.notifications.viewmodel.NotificationDetailViewModel$getNotificationData$1", f = "NotificationDetailViewModel.kt", i = {1, 1, 1, 2}, l = {158, 172, 177}, m = "invokeSuspend", n = {"$this$launch", "listParameter", "headerParameter", "$this$launch"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f35484p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public NotificationNoCommercialData f35485q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public List f35486r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f35487s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f35488t0;
        public final /* synthetic */ HashMap<String, Object> v0;

        /* JADX INFO: compiled from: NotificationDetailViewModel.kt */
        @DebugMetadata(c = "com.bbva.notifications.viewmodel.NotificationDetailViewModel$getNotificationData$1$deferred$1", f = "NotificationDetailViewModel.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f35490p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ NotificationDetailViewModel f35491q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ HashMap<String, String> f35492r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationDetailViewModel notificationDetailViewModel, HashMap<String, String> map, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f35491q0 = notificationDetailViewModel;
                this.f35492r0 = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f35491q0, this.f35492r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f35490p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    NotificationDetailViewModel notificationDetailViewModel = this.f35491q0;
                    PushDataProcessorDelegate pushDataProcessorDelegateAccess$getPushProcessorData = NotificationDetailViewModel.access$getPushProcessorData(notificationDetailViewModel);
                    HashMap<String, Object> mapTransformToPayloadData = pushDataProcessorDelegateAccess$getPushProcessorData != null ? pushDataProcessorDelegateAccess$getPushProcessorData.transformToPayloadData(this.f35492r0) : null;
                    this.f35490p0 = 1;
                    if (notificationDetailViewModel.navigateNoCommercialDeepLink(mapTransformToPayloadData, this) == coroutine_suspended) {
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
        public b(HashMap<String, Object> map, Continuation<? super b> continuation) {
            super(2, continuation);
            this.v0 = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = NotificationDetailViewModel.this.new b(this.v0, continuation);
            bVar.f35488t0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:53:0x0117 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:54:0x0118  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HashMap<String, String> mapAccess$getNotificationFromBackground;
            Object objExecute2;
            CoroutineScope coroutineScope;
            NotificationNoCommercialData notificationNoCommercialData;
            List list;
            Object objAccess$getShortcutActions;
            List list2;
            NotificationDetailViewModel notificationDetailViewModel;
            LogEventDelegate logEventDelegateAccess$getLogEventDelegate;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35487s0;
            Unit unit = null;
            HashMap<String, Object> map = this.v0;
            NotificationDetailViewModel notificationDetailViewModel2 = NotificationDetailViewModel.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f35488t0;
                PushDataProcessorDelegate pushDataProcessorDelegateAccess$getPushProcessorData = NotificationDetailViewModel.access$getPushProcessorData(notificationDetailViewModel2);
                HashMap<String, String> pushIntentExtra = pushDataProcessorDelegateAccess$getPushProcessorData != null ? pushDataProcessorDelegateAccess$getPushProcessorData.getPushIntentExtra(map) : null;
                notificationDetailViewModel2.J0.setValue(NotificationNoCommercialContract.State.Loading.INSTANCE);
                NotificationNoCommercialContract.State.TimerExpired timerExpiredAccess$checkTimerBehavior = NotificationDetailViewModel.access$checkTimerBehavior(notificationDetailViewModel2, map);
                if (timerExpiredAccess$checkTimerBehavior != null) {
                    notificationDetailViewModel2.J0.setValue(timerExpiredAccess$checkTimerBehavior);
                    return Unit.INSTANCE;
                }
                LogEventDelegate logEventDelegateAccess$getLogEventDelegate2 = NotificationDetailViewModel.access$getLogEventDelegate(notificationDetailViewModel2);
                if (logEventDelegateAccess$getLogEventDelegate2 != null) {
                    logEventDelegateAccess$getLogEventDelegate2.storeSelectPushAction(map);
                }
                HashMap mapAccess$getNotificationIntentExtras = NotificationDetailViewModel.access$getNotificationIntentExtras(notificationDetailViewModel2, map);
                NotificationNoCommercialData notificationNoCommercialData2 = mapAccess$getNotificationIntentExtras != null ? NotificationNoCommercialDataKt.toNotificationNoCommercialData(mapAccess$getNotificationIntentExtras) : null;
                Object obj2 = map != null ? map.get(NotificationNoCommercialActivity.NOTIFICATION_INTENT_DETAIL) : null;
                if (pushIntentExtra != null) {
                    Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(notificationDetailViewModel2), null, null, new a(notificationDetailViewModel2, pushIntentExtra, null), 3, null);
                    this.f35487s0 = 1;
                    if (deferredAsync$default.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (notificationNoCommercialData2 != null) {
                    mapAccess$getNotificationFromBackground = NotificationDetailViewModel.access$getNotificationIntentExtras(notificationDetailViewModel2, map);
                } else if (NotificationDetailViewModel.access$getNotificationFromBackground(notificationDetailViewModel2, map) != null) {
                    mapAccess$getNotificationFromBackground = NotificationDetailViewModel.access$getNotificationFromBackground(notificationDetailViewModel2, map);
                    HashMap mapAccess$getNotificationFromBackground2 = NotificationDetailViewModel.access$getNotificationFromBackground(notificationDetailViewModel2, map);
                    notificationNoCommercialData2 = mapAccess$getNotificationFromBackground2 != null ? NotificationNoCommercialDataKt.toNotificationNoCommercialData(mapAccess$getNotificationFromBackground2) : null;
                } else if (obj2 != null) {
                    String string = obj2.toString();
                    HashMap<String, String> mapJsonStringToHashMap = StringExtensionsKt.jsonStringToHashMap(string);
                    notificationNoCommercialData2 = com.bbva.notifications.extensions.StringExtensionsKt.toNotificationNoCommercialData(string);
                    mapAccess$getNotificationFromBackground = mapJsonStringToHashMap;
                } else {
                    mapAccess$getNotificationFromBackground = null;
                    notificationNoCommercialData2 = null;
                }
                CreateNotificationNonCommercialUseCase createNotificationNonCommercialUseCaseAccess$getGetCreateNotificationNonCommercialUseCase = NotificationDetailViewModel.access$getGetCreateNotificationNonCommercialUseCase(notificationDetailViewModel2);
                this.f35488t0 = coroutineScope2;
                this.f35484p0 = mapAccess$getNotificationFromBackground;
                this.f35485q0 = notificationNoCommercialData2;
                this.f35487s0 = 2;
                objExecute2 = createNotificationNonCommercialUseCaseAccess$getGetCreateNotificationNonCommercialUseCase.execute2(mapAccess$getNotificationFromBackground, (Continuation<? super List<NotificationDetailItem>>) this);
                if (objExecute2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                notificationNoCommercialData = notificationNoCommercialData2;
                list = (List) objExecute2;
                notificationDetailViewModel2.H0 = mapAccess$getNotificationFromBackground;
                this.f35488t0 = coroutineScope;
                this.f35484p0 = notificationDetailViewModel2;
                this.f35485q0 = notificationNoCommercialData;
                this.f35486r0 = list;
                this.f35487s0 = 3;
                objAccess$getShortcutActions = NotificationDetailViewModel.access$getShortcutActions(notificationDetailViewModel2, mapAccess$getNotificationFromBackground, this);
                if (objAccess$getShortcutActions == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                notificationDetailViewModel = notificationDetailViewModel2;
            } else {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i10 == 2) {
                    notificationNoCommercialData = this.f35485q0;
                    HashMap<String, String> map2 = (HashMap) this.f35484p0;
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.f35488t0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope3;
                    mapAccess$getNotificationFromBackground = map2;
                    objExecute2 = obj;
                    list = (List) objExecute2;
                    notificationDetailViewModel2.H0 = mapAccess$getNotificationFromBackground;
                    this.f35488t0 = coroutineScope;
                    this.f35484p0 = notificationDetailViewModel2;
                    this.f35485q0 = notificationNoCommercialData;
                    this.f35486r0 = list;
                    this.f35487s0 = 3;
                    objAccess$getShortcutActions = NotificationDetailViewModel.access$getShortcutActions(notificationDetailViewModel2, mapAccess$getNotificationFromBackground, this);
                    if (objAccess$getShortcutActions == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = list;
                    notificationDetailViewModel = notificationDetailViewModel2;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = this.f35486r0;
                    notificationNoCommercialData = this.f35485q0;
                    NotificationDetailViewModel notificationDetailViewModel3 = (NotificationDetailViewModel) this.f35484p0;
                    ResultKt.throwOnFailure(obj);
                    notificationDetailViewModel = notificationDetailViewModel3;
                    objAccess$getShortcutActions = obj;
                }
            }
            List list3 = (List) objAccess$getShortcutActions;
            TimerBehaviour timerBehaviourAccess$getTimerBehaviour = NotificationDetailViewModel.access$getTimerBehaviour(notificationDetailViewModel2);
            NotificationView notificationViewAccess$createNotificationView = NotificationDetailViewModel.access$createNotificationView(notificationDetailViewModel, notificationNoCommercialData, list2, list3, timerBehaviourAccess$getTimerBehaviour != null ? timerBehaviourAccess$getTimerBehaviour.compute(map) : null);
            if (notificationViewAccess$createNotificationView != null) {
                notificationDetailViewModel2.f35482y0.setValue(notificationViewAccess$createNotificationView);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                notificationDetailViewModel2.J0.setValue(NotificationNoCommercialContract.State.Error.INSTANCE);
            }
            NotificationDetailViewModel.access$trackScreen(notificationDetailViewModel2, notificationViewAccess$createNotificationView);
            if (notificationViewAccess$createNotificationView != null && (logEventDelegateAccess$getLogEventDelegate = NotificationDetailViewModel.access$getLogEventDelegate(notificationDetailViewModel2)) != null) {
                logEventDelegateAccess$getLogEventDelegate.storeVisualizePushAction(map);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NotificationDetailViewModel.kt */
    @DebugMetadata(c = "com.bbva.notifications.viewmodel.NotificationDetailViewModel$handleShortcut$1$2$1", f = "NotificationDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ NotificationShortcutItemModel f35494q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NotificationShortcutItemModel notificationShortcutItemModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f35494q0 = notificationShortcutItemModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return NotificationDetailViewModel.this.new c(this.f35494q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            NotificationShortcutItemModel notificationShortcutItemModel = this.f35494q0;
            NotificationDetailViewModel notificationDetailViewModel = NotificationDetailViewModel.this;
            notificationDetailViewModel.a(NotificationDetailViewModel.access$createDeepLink(notificationDetailViewModel, notificationShortcutItemModel));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NotificationDetailViewModel.kt */
    @DebugMetadata(c = "com.bbva.notifications.viewmodel.NotificationDetailViewModel", f = "NotificationDetailViewModel.kt", i = {0, 0, 0}, l = {279}, m = "navigateNoCommercialDeepLink", n = {"this", "notification", "action"}, s = {"L$0", "L$1", "L$2"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public NotificationDetailViewModel f35495p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public HashMap f35496q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f35497r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f35498s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f35500u0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35498s0 = obj;
            this.f35500u0 |= Integer.MIN_VALUE;
            return NotificationDetailViewModel.this.navigateNoCommercialDeepLink(null, this);
        }
    }

    /* JADX INFO: compiled from: NotificationDetailViewModel.kt */
    @DebugMetadata(c = "com.bbva.notifications.viewmodel.NotificationDetailViewModel$navigateTo$1", f = "NotificationDetailViewModel.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35501p0;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return NotificationDetailViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35501p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = NotificationDetailViewModel.this.J0;
                NotificationNoCommercialContract.State.Loading loading = NotificationNoCommercialContract.State.Loading.INSTANCE;
                this.f35501p0 = 1;
                if (mutableStateFlow.emit(loading, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: NotificationDetailViewModel.kt */
    @DebugMetadata(c = "com.bbva.notifications.viewmodel.NotificationDetailViewModel$setUpObservers$1", f = "NotificationDetailViewModel.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35503p0;

        /* JADX INFO: compiled from: NotificationDetailViewModel.kt */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ NotificationDetailViewModel f35505p0;

            public a(NotificationDetailViewModel notificationDetailViewModel) {
                this.f35505p0 = notificationDetailViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                this.f35505p0.sendIsPageReadyStatus(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return NotificationDetailViewModel.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35503p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Boolean> webReadyToExecuteDeeplinkFlow = CellsDeepLinkChannels.INSTANCE.getWebReadyToExecuteDeeplinkFlow();
                a aVar = new a(NotificationDetailViewModel.this);
                this.f35503p0 = 1;
                if (webReadyToExecuteDeeplinkFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationDetailViewModel(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f35475q0 = provider;
        this.id = ID;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f35477s0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<NavigateDispatcher>() { // from class: com.bbva.notifications.viewmodel.NotificationDetailViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.bridge.navigate.NavigateDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigateDispatcher invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(NavigateDispatcher.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f35478t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeeplinkDispatcher>() { // from class: com.bbva.notifications.viewmodel.NotificationDetailViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeeplinkDispatcher invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(DeeplinkDispatcher.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f35479u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.notifications.viewmodel.NotificationDetailViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.analytics.AnalyticsManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnalyticsManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(AnalyticsManager.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(new Function0<AnalyticsMapper>() { // from class: com.bbva.notifications.viewmodel.NotificationDetailViewModel$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.notifications.AnalyticsMapper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final AnalyticsMapper invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(AnalyticsMapper.class), objArr6, objArr7);
            }
        });
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.f35480w0 = LazyKt__LazyJVMKt.lazy(new Function0<TimerBehaviour>() { // from class: com.bbva.notifications.viewmodel.NotificationDetailViewModel$special$$inlined$injectOrNull$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.notifications.presentation.behaviours.TimerBehaviour, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final TimerBehaviour invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(TimerBehaviour.class), objArr8, objArr9);
            }
        });
        this.f35481x0 = LazyKt__LazyJVMKt.lazy(new a());
        this.f35482y0 = new MutableLiveData<>();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.E0 = LazyKt__LazyJVMKt.lazy(new Function0<LogEventDelegate>() { // from class: com.bbva.notifications.viewmodel.NotificationDetailViewModel$special$$inlined$injectOrNull$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.notifications.delegate.LogEventDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final LogEventDelegate invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(LogEventDelegate.class), objArr10, objArr11);
            }
        });
        this.F0 = new MutableLiveData<>();
        this.G0 = new MutableLiveData<>();
        MutableStateFlow<NotificationNoCommercialContract.State> MutableStateFlow = StateFlowKt.MutableStateFlow(NotificationNoCommercialContract.State.Loading.INSTANCE);
        this.J0 = MutableStateFlow;
        this.K0 = MutableStateFlow;
        this.L0 = CellsDeepLinkChannels.INSTANCE.getWebReadyToExecuteDeeplinkFlow().getValue().booleanValue();
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.M0 = LazyKt__LazyJVMKt.lazy(new Function0<PushDataProcessorDelegate>() { // from class: com.bbva.notifications.viewmodel.NotificationDetailViewModel$special$$inlined$injectOrNull$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.notifications.delegate.PushDataProcessorDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final PushDataProcessorDelegate invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(PushDataProcessorDelegate.class), objArr12, objArr13);
            }
        });
    }

    public static final NotificationNoCommercialContract.State.TimerExpired access$checkTimerBehavior(NotificationDetailViewModel notificationDetailViewModel, HashMap map) {
        TimerBehaviour timerBehaviour = (TimerBehaviour) notificationDetailViewModel.f35480w0.getValue();
        if (timerBehaviour == null || !timerBehaviour.isExpired(map)) {
            return null;
        }
        return NotificationNoCommercialContract.State.TimerExpired.INSTANCE;
    }

    public static final DeepLinkModel access$createDeepLink(NotificationDetailViewModel notificationDetailViewModel, NotificationShortcutItemModel notificationShortcutItemModel) {
        String jsonString;
        notificationDetailViewModel.getClass();
        byte[] bytes = null;
        String str = Intrinsics.areEqual(notificationShortcutItemModel.getNavigationType(), "public") ? DeepLinkExtensionsKt.PUBLIC_NOTIFICATION_MANAGER_DEEP_LINK_KEY : null;
        String route = notificationShortcutItemModel.getRoute();
        HashMap<String, String> map = notificationDetailViewModel.H0;
        if (map != null && (jsonString = NotificationNoCommercialDataKt.toJsonString(map)) != null) {
            bytes = jsonString.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        }
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return new DeepLinkModel(str, route, null, p.mapOf(TuplesKt.to(SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, strEncodeToString)), 4, null);
    }

    public static final NotificationView access$createNotificationView(NotificationDetailViewModel notificationDetailViewModel, NotificationNoCommercialData notificationNoCommercialData, List list, List list2, Timer timer) {
        notificationDetailViewModel.getClass();
        if (notificationNoCommercialData != null) {
            return new NotificationView(notificationNoCommercialData, list, list2, timer);
        }
        return null;
    }

    public static final Object access$fetchAppSettings(NotificationDetailViewModel notificationDetailViewModel, Continuation continuation) {
        notificationDetailViewModel.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new xa.a(notificationDetailViewModel, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CreateNotificationNonCommercialUseCase access$getGetCreateNotificationNonCommercialUseCase(NotificationDetailViewModel notificationDetailViewModel) {
        ViewModelComponentsProviders viewModelComponentsProviders = notificationDetailViewModel.f35475q0;
        return (CreateNotificationNonCommercialUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(CreateNotificationNonCommercialUseCase.class), null, null);
    }

    public static final LogEventDelegate access$getLogEventDelegate(NotificationDetailViewModel notificationDetailViewModel) {
        return (LogEventDelegate) notificationDetailViewModel.E0.getValue();
    }

    public static final HashMap access$getNotificationFromBackground(NotificationDetailViewModel notificationDetailViewModel, HashMap map) {
        notificationDetailViewModel.getClass();
        if (map == null) {
            map = null;
        }
        if (map == null || !map.containsKey(PushConstants.NOTIFICATION_TYPE)) {
            return null;
        }
        return map;
    }

    public static final HashMap access$getNotificationIntentExtras(NotificationDetailViewModel notificationDetailViewModel, HashMap map) {
        notificationDetailViewModel.getClass();
        Object obj = map != null ? map.get(NotificationNoCommercialActivity.NOTIFICATION_INTENT_DATA) : null;
        if (obj instanceof HashMap) {
            return (HashMap) obj;
        }
        return null;
    }

    public static final PushDataProcessorDelegate access$getPushProcessorData(NotificationDetailViewModel notificationDetailViewModel) {
        return (PushDataProcessorDelegate) notificationDetailViewModel.M0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object access$getShortcutActions(NotificationDetailViewModel notificationDetailViewModel, HashMap map, Continuation continuation) {
        xa.b bVar;
        NotificationDetailViewModel notificationDetailViewModel2;
        notificationDetailViewModel.getClass();
        if (continuation instanceof xa.b) {
            bVar = (xa.b) continuation;
            int i10 = bVar.f94505t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f94505t0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new xa.b(notificationDetailViewModel, continuation);
            }
        } else {
            bVar = new xa.b(notificationDetailViewModel, continuation);
        }
        Object objExecute2 = bVar.f94503r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f94505t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute2);
            ViewModelComponentsProviders viewModelComponentsProviders = notificationDetailViewModel.f35475q0;
            GetNotificationOperativesNonCommercialUseCase getNotificationOperativesNonCommercialUseCase = (GetNotificationOperativesNonCommercialUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(GetNotificationOperativesNonCommercialUseCase.class), null, null);
            bVar.f94501p0 = notificationDetailViewModel;
            bVar.f94502q0 = notificationDetailViewModel;
            bVar.f94505t0 = 1;
            objExecute2 = getNotificationOperativesNonCommercialUseCase.execute2((HashMap<String, String>) map, (Continuation<? super List<NotificationShortcutItemModel>>) bVar);
            if (objExecute2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            notificationDetailViewModel2 = notificationDetailViewModel;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            notificationDetailViewModel = bVar.f94502q0;
            notificationDetailViewModel2 = bVar.f94501p0;
            ResultKt.throwOnFailure(objExecute2);
        }
        notificationDetailViewModel.I0 = (List) objExecute2;
        return notificationDetailViewModel2.I0;
    }

    public static final TimerBehaviour access$getTimerBehaviour(NotificationDetailViewModel notificationDetailViewModel) {
        return (TimerBehaviour) notificationDetailViewModel.f35480w0.getValue();
    }

    public static final NavigateDispatcher access$getWebNavigationDispatcher(NotificationDetailViewModel notificationDetailViewModel) {
        return (NavigateDispatcher) notificationDetailViewModel.f35477s0.getValue();
    }

    public static final void access$trackScreen(NotificationDetailViewModel notificationDetailViewModel, NotificationView notificationView) {
        NotificationNoCommercialData header;
        String category;
        AnalyticsMapper analyticsMapper;
        AnalyticsEvent map;
        notificationDetailViewModel.getClass();
        if (notificationView == null || (header = notificationView.getHeader()) == null || (category = header.getCategory()) == null || (analyticsMapper = (AnalyticsMapper) notificationDetailViewModel.v0.getValue()) == null || (map = analyticsMapper.map(category)) == null) {
            return;
        }
        ((AnalyticsManager) notificationDetailViewModel.f35479u0.getValue()).trackEvent(map);
    }

    public final void a(DeepLinkModel deepLinkModel) {
        boolean z10 = this.L0;
        Lazy lazy = this.f35481x0;
        if (!z10) {
            DeepLinkHandler deepLinkHandler = (DeepLinkHandler) lazy.getValue();
            if (deepLinkHandler != null) {
                deepLinkHandler.setDeepLink(deepLinkModel);
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e(null), 3, null);
            return;
        }
        if (!DeepLinkExtensionsKt.isPublicManagerDeepLink(deepLinkModel)) {
            ((DeeplinkDispatcher) this.f35478t0.getValue()).dispatch(ID, deepLinkModel);
            this.F0.setValue(Boolean.TRUE);
        } else {
            DeepLinkHandler deepLinkHandler2 = (DeepLinkHandler) lazy.getValue();
            if (deepLinkHandler2 != null) {
                deepLinkHandler2.setDeepLink(deepLinkModel);
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new xa.c(this, null), 3, null);
        }
    }

    @NotNull
    public final LiveData<Boolean> getDeeplinkRead() {
        return this.F0;
    }

    @Override // com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return this.id;
    }

    public final void getNotificationData(@Nullable HashMap<String, Object> notificationMap) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b(notificationMap, null), 3, null);
    }

    @NotNull
    public final LiveData<NotificationView> getNotificationView() {
        return this.f35482y0;
    }

    @NotNull
    public final LiveData<Event<Route>> getScreenNavigation() {
        return this.G0;
    }

    @NotNull
    public final StateFlow<NotificationNoCommercialContract.State> getState() {
        return this.K0;
    }

    public final void handleShortcut(@NotNull String id) {
        NotificationShortcutItemModel notificationShortcutItemModel;
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        List<NotificationShortcutItemModel> list = this.I0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((NotificationShortcutItemModel) next).getRoute(), id));
            notificationShortcutItemModel = (NotificationShortcutItemModel) next;
        } else {
            notificationShortcutItemModel = null;
        }
        if (notificationShortcutItemModel != null) {
            ShortcutAction navigationAction = notificationShortcutItemModel.getNavigationAction();
            if (navigationAction == null) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(notificationShortcutItemModel, null), 3, null);
            } else if (navigationAction instanceof ShortcutAction.ActionCall) {
                this.G0.postValue(new EventDialer(((ShortcutAction.ActionCall) navigationAction).getPhone()));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object navigateNoCommercialDeepLink(@Nullable HashMap<String, Object> map, @NotNull Continuation<? super Unit> continuation) {
        d dVar;
        HashMap<String, String> map2;
        String str;
        NotificationDetailViewModel notificationDetailViewModel;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f35500u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f35500u0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f35498s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f35500u0;
        String str2 = null;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            HashMap<String, String> notification = HashMapExtensionsKt.getNotification(map);
            String str3 = notification != null ? notification.get(DeepLinkConstants.INSTANCE.getDEEPLINK_NOTIFICATION()) : null;
            dVar.f35495p0 = this;
            dVar.f35496q0 = notification;
            dVar.f35497r0 = str3;
            dVar.f35500u0 = 1;
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new xa.a(this, null), dVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            map2 = notification;
            str = str3;
            obj = objWithContext;
            notificationDetailViewModel = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = dVar.f35497r0;
            map2 = dVar.f35496q0;
            notificationDetailViewModel = dVar.f35495p0;
            ResultKt.throwOnFailure(obj);
            str = str4;
        }
        DeeplinkConfigModel deeplinkConfig = AppSettingsResultExtensionsKt.getDeeplinkConfig((AppSettingsResult) obj, String.valueOf(str));
        if (deeplinkConfig != null && deeplinkConfig.getPublic()) {
            str2 = DeepLinkExtensionsKt.PUBLIC_NOTIFICATION_MANAGER_DEEP_LINK_KEY;
        }
        notificationDetailViewModel.a(new DeepLinkModel(str2, str, null, p.mapOf(TuplesKt.to(SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, HashMapExtensionsKt.toJsonBase64(map2))), 4, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sendCloseNotificationMessage() {
        ViewModelComponentsProviders viewModelComponentsProviders = this.f35475q0;
        ((MessageDispatcher) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), null, null)).notifyEvent(CellsChannels.CLOSE_NOTIFICATION_CHANNEL);
    }

    public final void sendIsPageReadyStatus(boolean status) {
        DeepLinkModel deepLinkModel;
        this.L0 = status;
        Lazy lazy = this.f35481x0;
        DeepLinkHandler deepLinkHandler = (DeepLinkHandler) lazy.getValue();
        if (deepLinkHandler == null || (deepLinkModel = deepLinkHandler.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.DEEP_LINK java.lang.String()) == null) {
            return;
        }
        DeepLinkHandler deepLinkHandler2 = (DeepLinkHandler) lazy.getValue();
        if (deepLinkHandler2 != null) {
            deepLinkHandler2.setDeepLink(null);
        }
        a(deepLinkModel);
    }

    public final void setIntent(@NotNull NotificationNoCommercialContract.Intent intent) {
        AnalyticsEvent map;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof NotificationNoCommercialContract.Intent.SendAnalytics) {
            NotificationNoCommercialContract.Intent.SendAnalytics sendAnalytics = (NotificationNoCommercialContract.Intent.SendAnalytics) intent;
            NotificationType type = sendAnalytics.getType();
            String data = sendAnalytics.getData();
            AnalyticsMapper analyticsMapper = (AnalyticsMapper) this.v0.getValue();
            if (analyticsMapper == null || (map = analyticsMapper.map(type, data)) == null) {
                return;
            }
            ((AnalyticsManager) this.f35479u0.getValue()).trackEvent(map);
        }
    }

    public final void setUpObservers() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f(null), 3, null);
    }
}
