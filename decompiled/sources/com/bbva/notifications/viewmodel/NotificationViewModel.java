package com.bbva.notifications.viewmodel;

import androidx.camera.core.imagecapture.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.base.behaviors.HandlerShortcutBehaviour;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.channels.CellsDeepLinkChannels;
import com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcherProvider;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.base.deeplink.model.LinkParams;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import com.bbva.glomohybrid.base.deeplink.usecase.DynamicLinkUseCase;
import com.bbva.glomohybrid.base.deeplink.usecase.result.Deeplink;
import com.bbva.glomohybrid.base.deeplink.usecase.result.DynamicLinkResult;
import com.bbva.glomohybrid.base.deeplink.usecase.result.QRCard;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.notifications.DeepLinkConstants;
import com.bbva.notifications.domain.IsActionAvailableInPublicZoneUseCase;
import com.bbva.notifications.domain.TrackShortcutEventUseCase;
import com.bbva.notifications.model.DeepLinkInfo;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: compiled from: NotificationViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB1\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/bbva/notifications/viewmodel/NotificationViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "params", "", "handleLink", "", "shortcutId", "handleShortcut", "q0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Landroidx/lifecycle/LiveData;", "Lcom/bbva/notifications/model/DeepLinkInfo;", "getDeeplinkInfo", "()Landroidx/lifecycle/LiveData;", "deeplinkInfo", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "", "notNavigableLinks", "Lcom/bbva/glomohybrid/base/deeplink/DeeplinkDispatcherProvider;", "dispatcher", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;[Ljava/lang/String;Lcom/bbva/glomohybrid/base/deeplink/DeeplinkDispatcherProvider;)V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNotificationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationViewModel.kt\ncom/bbva/notifications/viewmodel/NotificationViewModel\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,156:1\n29#2,4:157\n29#2,4:161\n29#2,4:165\n42#2,4:169\n120#3:173\n158#4:174\n*S KotlinDebug\n*F\n+ 1 NotificationViewModel.kt\ncom/bbva/notifications/viewmodel/NotificationViewModel\n*L\n43#1:157,4\n54#1:161,4\n59#1:165,4\n86#1:169,4\n86#1:173\n86#1:174\n*E\n"})
public final class NotificationViewModel extends BaseViewModel {

    @NotNull
    public static final String ID = "notification-view-model";

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f35528r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final String[] f35529s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final DeeplinkDispatcherProvider f35530t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f35531u0;

    @NotNull
    public final MutableLiveData<DeepLinkInfo> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f35532w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f35533x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Lazy f35534y0;

    /* JADX INFO: compiled from: NotificationViewModel.kt */
    @DebugMetadata(c = "com.bbva.notifications.viewmodel.NotificationViewModel$handleLink$1", f = "NotificationViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35535p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LinkParams f35536q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ NotificationViewModel f35537r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LinkParams linkParams, NotificationViewModel notificationViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35536q0 = linkParams;
            this.f35537r0 = notificationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f35536q0, this.f35537r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35535p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LinkParams linkParams = this.f35536q0;
                boolean z10 = linkParams instanceof LinkParams.SalesforceNotification;
                NotificationViewModel notificationViewModel = this.f35537r0;
                if (z10) {
                    notificationViewModel.b(((LinkParams.SalesforceNotification) linkParams).getDeeplink());
                } else if (linkParams instanceof LinkParams.UniversalNotification) {
                    notificationViewModel.b(((LinkParams.UniversalNotification) linkParams).getDeeplink());
                } else if (linkParams instanceof LinkParams.Deeplink) {
                    NotificationViewModel.access$handleDeeplink(notificationViewModel, ((LinkParams.Deeplink) linkParams).getDeeplink());
                } else if (linkParams instanceof LinkParams.DynamicLink) {
                    this.f35535p0 = 1;
                    if (NotificationViewModel.access$handleDynamicLink(notificationViewModel, (LinkParams.DynamicLink) linkParams, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (linkParams instanceof LinkParams.QRLink) {
                    notificationViewModel.a(((LinkParams.QRLink) linkParams).getPayload());
                } else if (linkParams instanceof LinkParams.GoogleAssistantLink) {
                    NotificationViewModel.access$handleGoogleAssistantDeepLink(notificationViewModel, ((LinkParams.GoogleAssistantLink) linkParams).getDeeplink());
                } else if (linkParams instanceof LinkParams.GoogleWallet) {
                    NotificationViewModel.access$handleGoogleWalletLink(notificationViewModel, ((LinkParams.GoogleWallet) linkParams).getDeeplink());
                } else if (linkParams instanceof LinkParams.OtherBanks) {
                    NotificationViewModel.access$dispatch(notificationViewModel, ((LinkParams.OtherBanks) linkParams).getArguments());
                } else if (linkParams instanceof LinkParams.OperationalNotification) {
                    notificationViewModel.v0.setValue(new DeepLinkInfo(false, false, 2, null));
                } else {
                    notificationViewModel.v0.setValue(new DeepLinkInfo(false, false, 2, null));
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

    /* JADX INFO: compiled from: NotificationViewModel.kt */
    public static final class b extends Lambda implements Function0<ParametersHolder> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(NotificationViewModel.this.f35528r0);
        }
    }

    /* JADX INFO: compiled from: NotificationViewModel.kt */
    public static final class c extends Lambda implements Function0<MessageDispatcher> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MessageDispatcher invoke() {
            return (MessageDispatcher) NotificationViewModel.this.f35528r0.provide("web-dispatcher");
        }
    }

    /* JADX INFO: compiled from: NotificationViewModel.kt */
    public static final class d extends Lambda implements Function0<ParametersHolder> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(NotificationViewModel.this.f35528r0);
        }
    }

    public /* synthetic */ NotificationViewModel(String str, ViewModelComponentsProviders viewModelComponentsProviders, String[] strArr, DeeplinkDispatcherProvider deeplinkDispatcherProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ID : str, viewModelComponentsProviders, (i10 & 4) != 0 ? DeepLinkConstants.INSTANCE.getNOT_NAVIGABLE_LINKS() : strArr, deeplinkDispatcherProvider);
    }

    public static final void access$handleDeeplink(NotificationViewModel notificationViewModel, DeepLinkModel deepLinkModel) {
        notificationViewModel.getClass();
        if (ArraysKt___ArraysKt.contains(notificationViewModel.f35529s0, deepLinkModel.getAction())) {
            notificationViewModel.v0.setValue(new DeepLinkInfo(false, false, 2, null));
            return;
        }
        IsActionAvailableInPublicZoneUseCase isActionAvailableInPublicZoneUseCase = (IsActionAvailableInPublicZoneUseCase) notificationViewModel.f35533x0.getValue();
        if (isActionAvailableInPublicZoneUseCase != null) {
            DeepLinkModel deepLinkModelCopy$default = DeepLinkModel.copy$default(deepLinkModel, isActionAvailableInPublicZoneUseCase.execute(deepLinkModel.getAction()).booleanValue() ? DeepLinkExtensionsKt.PUBLIC_NOTIFICATION_MANAGER_DEEP_LINK_KEY : deepLinkModel.getKey(), null, null, null, 14, null);
            if (deepLinkModelCopy$default != null) {
                deepLinkModel = deepLinkModelCopy$default;
            }
        }
        notificationViewModel.b(deepLinkModel);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$handleDynamicLink(NotificationViewModel notificationViewModel, LinkParams.DynamicLink dynamicLink, Continuation continuation) {
        xa.d dVar;
        DynamicLinkResult dynamicLinkResult;
        notificationViewModel.getClass();
        if (continuation instanceof xa.d) {
            dVar = (xa.d) continuation;
            int i10 = dVar.f94512s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f94512s0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new xa.d(notificationViewModel, continuation);
            }
        } else {
            dVar = new xa.d(notificationViewModel, continuation);
        }
        Object objExecute = dVar.f94510q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f94512s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute);
            DynamicLinkUseCase dynamicLinkUseCase = (DynamicLinkUseCase) androidx.camera.core.impl.utils.c.f(notificationViewModel.f35528r0).getOrNull(Reflection.getOrCreateKotlinClass(DynamicLinkUseCase.class), null, null);
            if (dynamicLinkUseCase != null) {
                dVar.f94509p0 = notificationViewModel;
                dVar.f94512s0 = 1;
                objExecute = dynamicLinkUseCase.execute(dynamicLink, (Continuation<? super DynamicLinkResult>) dVar);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                dynamicLinkResult = null;
            }
            if (dynamicLinkResult instanceof Deeplink) {
                notificationViewModel.b(DeepLinkExtensionsKt.parseDeepLink(((Deeplink) dynamicLinkResult).getData(), DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER));
            } else if (dynamicLinkResult instanceof QRCard) {
                notificationViewModel.a(((QRCard) dynamicLinkResult).getData());
            } else {
                notificationViewModel.v0.setValue(new DeepLinkInfo(false, false, 2, null));
            }
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        notificationViewModel = dVar.f94509p0;
        ResultKt.throwOnFailure(objExecute);
        dynamicLinkResult = (DynamicLinkResult) objExecute;
        if (dynamicLinkResult instanceof Deeplink) {
            notificationViewModel.b(DeepLinkExtensionsKt.parseDeepLink(((Deeplink) dynamicLinkResult).getData(), DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER));
        } else if (dynamicLinkResult instanceof QRCard) {
            notificationViewModel.a(((QRCard) dynamicLinkResult).getData());
        } else {
            notificationViewModel.v0.setValue(new DeepLinkInfo(false, false, 2, null));
        }
        return Unit.INSTANCE;
    }

    public static final void access$handleGoogleAssistantDeepLink(NotificationViewModel notificationViewModel, DeepLinkModel deepLinkModel) {
        notificationViewModel.f35530t0.dispatch(notificationViewModel.getId(), deepLinkModel);
        notificationViewModel.v0.setValue(new DeepLinkInfo(true, false, 2, null));
    }

    public static final void access$handleGoogleWalletLink(NotificationViewModel notificationViewModel, DeepLinkModel deepLinkModel) {
        notificationViewModel.b(deepLinkModel);
        notificationViewModel.v0.setValue(new DeepLinkInfo(false, true));
    }

    public final void a(QRPayload qRPayload) {
        MessageDispatcher messageDispatcher = (MessageDispatcher) this.f35532w0.getValue();
        if (messageDispatcher != null) {
            messageDispatcher.sendMessage(CellsDeepLinkChannels.NATIVE_CAMERA_QR_READER_CHANNEL_NAME, qRPayload.getQr());
        }
        this.f35530t0.dispatchQrDeeplink(qRPayload);
        this.v0.setValue(new DeepLinkInfo(true, false, 2, null));
    }

    public final void b(DeepLinkModel deepLinkModel) {
        this.f35530t0.dispatch(getId(), deepLinkModel);
        this.v0.setValue(new DeepLinkInfo(true, false, 2, null));
    }

    @NotNull
    public final LiveData<DeepLinkInfo> getDeeplinkInfo() {
        return this.v0;
    }

    @Override // com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return this.id;
    }

    public final void handleLink(@NotNull LinkParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(params, this, null), 3, null);
    }

    public final void handleShortcut(@NotNull String shortcutId) {
        ShortcutModel shortcutModelHandle;
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        HandlerShortcutBehaviour handlerShortcutBehaviour = (HandlerShortcutBehaviour) this.f35531u0.getValue();
        if (handlerShortcutBehaviour == null || (shortcutModelHandle = handlerShortcutBehaviour.handle(shortcutId)) == null) {
            return;
        }
        TrackShortcutEventUseCase trackShortcutEventUseCase = (TrackShortcutEventUseCase) this.f35534y0.getValue();
        if (trackShortcutEventUseCase != null) {
            trackShortcutEventUseCase.execute(shortcutId);
        }
        this.f35530t0.dispatch(shortcutModelHandle);
        this.v0.setValue(new DeepLinkInfo(true, false, 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationViewModel(@NotNull String id, @NotNull final ViewModelComponentsProviders provider, @NotNull String[] notNavigableLinks, @NotNull DeeplinkDispatcherProvider dispatcher) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(notNavigableLinks, "notNavigableLinks");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.id = id;
        this.f35528r0 = provider;
        this.f35529s0 = notNavigableLinks;
        this.f35530t0 = dispatcher;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f35531u0 = LazyKt__LazyJVMKt.lazy(new Function0<HandlerShortcutBehaviour>() { // from class: com.bbva.notifications.viewmodel.NotificationViewModel$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.base.behaviors.HandlerShortcutBehaviour, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final HandlerShortcutBehaviour invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(HandlerShortcutBehaviour.class), qualifier, objArr);
            }
        });
        this.v0 = new MutableLiveData<>();
        this.f35532w0 = LazyKt__LazyJVMKt.lazy(new c());
        final b bVar = new b();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.f35533x0 = LazyKt__LazyJVMKt.lazy(new Function0<IsActionAvailableInPublicZoneUseCase>() { // from class: com.bbva.notifications.viewmodel.NotificationViewModel$special$$inlined$injectOrNull$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.notifications.domain.IsActionAvailableInPublicZoneUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final IsActionAvailableInPublicZoneUseCase invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(IsActionAvailableInPublicZoneUseCase.class), objArr2, bVar);
            }
        });
        final d dVar = new d();
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f35534y0 = LazyKt__LazyJVMKt.lazy(new Function0<TrackShortcutEventUseCase>() { // from class: com.bbva.notifications.viewmodel.NotificationViewModel$special$$inlined$injectOrNull$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.notifications.domain.TrackShortcutEventUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final TrackShortcutEventUseCase invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(TrackShortcutEventUseCase.class), objArr3, dVar);
            }
        });
    }

    public static final void access$dispatch(NotificationViewModel notificationViewModel, Map map) {
        MessageDispatcher messageDispatcher = (MessageDispatcher) notificationViewModel.f35532w0.getValue();
        if (messageDispatcher != null) {
            messageDispatcher.sendMessage(CellsChannels.OTHER_BANKS_CHANNEL, map);
        }
        notificationViewModel.v0.setValue(new DeepLinkInfo(true, false, 2, null));
    }
}
