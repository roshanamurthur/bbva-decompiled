package com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cellscore.web.WebController;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.usecase.GetUserTypeUseCase;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.base.cells.channels.CellsDeepLinkChannels;
import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import com.bbva.glomohybrid.base.extensions.ShortcutExtensionKt;
import com.bbva.glomohybrid.base.handler.DeepLinkHandler;
import com.bbva.glomohybrid.base.handler.ShortcutHandler;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0016\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeepLinkWebViewModelDelegate;", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeepLinkWebViewModel;", "", "notifyDeepLink", "notifyShortcut", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", DeepLinkListenerAdapter.Constants.DEEP_LINK, "handlePrivateDeepLink", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "shortcut", "handlePrivateShortcut", "handlePublicDeepLink", "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "qr", "handleQRLink", "Lkotlinx/coroutines/CoroutineScope;", "scope", "configDeeplinkObservers", "handleGemaLink", "notifyGemaDeeplink", "processPrivateDeeplink", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeeplinkWebContract$Event;", "getDeeplinkEvents", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "deeplinkEvents", "", "isUserLogged$CellsWeb_mexicoRelease", "()Z", "isUserLogged", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class DeepLinkWebViewModelDelegate implements DeepLinkWebViewModel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f31890p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f31891q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Lazy f31892r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f31893s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f31894t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f31895u0;

    @NotNull
    public final MutableSharedFlow<DeeplinkWebContract.Event> v0;

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class a extends Lambda implements Function1<DeepLinkModel, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f31897q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineScope coroutineScope) {
            super(1);
            this.f31897q0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel deeplink = deepLinkModel;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            DeepLinkWebViewModelDelegate.this.processPrivateDeeplink(deeplink, this.f31897q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class b extends Lambda implements Function1<DeepLinkModel, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel deeplink = deepLinkModel;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            DeepLinkWebViewModelDelegate.this.handlePublicDeepLink(deeplink);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class c extends Lambda implements Function1<DeepLinkModel, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel deeplink = deepLinkModel;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            DeepLinkWebViewModelDelegate.this.handlePublicDeepLink(deeplink);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class d extends Lambda implements Function1<QRPayload, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(QRPayload qRPayload) {
            QRPayload qr = qRPayload;
            Intrinsics.checkNotNullParameter(qr, "qr");
            DeepLinkWebViewModelDelegate.this.handleQRLink(qr);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class e extends Lambda implements Function1<DeepLinkModel, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel deeplink = deepLinkModel;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            DeepLinkWebViewModelDelegate.this.handlePrivateDeepLink(deeplink);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class f extends Lambda implements Function1<ShortcutModel, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ShortcutModel shortcutModel) {
            ShortcutModel shortcut = shortcutModel;
            Intrinsics.checkNotNullParameter(shortcut, "shortcut");
            DeepLinkWebViewModelDelegate.this.handlePrivateShortcut(shortcut);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class g extends Lambda implements Function1<DeepLinkModel, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel deeplink = deepLinkModel;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            DeepLinkWebViewModelDelegate.this.handlePublicDeepLink(deeplink);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class h extends Lambda implements Function0<DeepLinkHandler> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f31904p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ViewModelComponentsProviders viewModelComponentsProviders) {
            super(0);
            this.f31904p0 = viewModelComponentsProviders;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DeepLinkHandler invoke() {
            return (DeepLinkHandler) this.f31904p0.provide(DeepLinkHandler.ID);
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    @SourceDebugExtension({"SMAP\nDeepLinkWebViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinkWebViewModel.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeepLinkWebViewModelDelegate$getUserTypeUseCase$2\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,241:1\n42#2,4:242\n120#3:246\n158#4:247\n*S KotlinDebug\n*F\n+ 1 DeepLinkWebViewModel.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeepLinkWebViewModelDelegate$getUserTypeUseCase$2\n*L\n69#1:242,4\n69#1:246\n69#1:247\n*E\n"})
    public static final class i extends Lambda implements Function0<GetUserTypeUseCase> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f31905p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ViewModelComponentsProviders viewModelComponentsProviders) {
            super(0);
            this.f31905p0 = viewModelComponentsProviders;
        }

        @Override // kotlin.jvm.functions.Function0
        public final GetUserTypeUseCase invoke() {
            return (GetUserTypeUseCase) androidx.camera.core.impl.utils.c.f(this.f31905p0).getOrNull(Reflection.getOrCreateKotlinClass(GetUserTypeUseCase.class), null, null);
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class j extends Lambda implements Function0<MessageDispatcher> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f31906p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ViewModelComponentsProviders viewModelComponentsProviders) {
            super(0);
            this.f31906p0 = viewModelComponentsProviders;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MessageDispatcher invoke() {
            return (MessageDispatcher) this.f31906p0.provide("web-dispatcher");
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class k extends Lambda implements Function1<DeepLinkModel, Unit> {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel it = deepLinkModel;
            Intrinsics.checkNotNullParameter(it, "it");
            MessageDispatcher messageDispatcherAccess$getMessageDispatcher = DeepLinkWebViewModelDelegate.access$getMessageDispatcher(DeepLinkWebViewModelDelegate.this);
            if (messageDispatcherAccess$getMessageDispatcher != null) {
                messageDispatcherAccess$getMessageDispatcher.sendMessage(CellsDeepLinkChannels.CELLS_DEEP_LINK_CHANNEL_NAME, it);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class l extends Lambda implements Function1<DeepLinkModel, Unit> {
        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeepLinkModel deepLinkModel) {
            MessageDispatcher messageDispatcherAccess$getMessageDispatcher;
            DeepLinkModel it = deepLinkModel;
            Intrinsics.checkNotNullParameter(it, "it");
            if (DeepLinkExtensionsKt.isGemaLink(it) && (messageDispatcherAccess$getMessageDispatcher = DeepLinkWebViewModelDelegate.access$getMessageDispatcher(DeepLinkWebViewModelDelegate.this)) != null) {
                messageDispatcherAccess$getMessageDispatcher.sendMessage(CellsDeepLinkChannels.GEMA_DEEP_LINK_CHANNEL_NAME, DeepLinkExtensionsKt.getRedirectToAsMap(it));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class m extends Lambda implements Function1<ShortcutModel, Unit> {
        public m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ShortcutModel shortcutModel) {
            ShortcutModel it = shortcutModel;
            Intrinsics.checkNotNullParameter(it, "it");
            MessageDispatcher messageDispatcherAccess$getMessageDispatcher = DeepLinkWebViewModelDelegate.access$getMessageDispatcher(DeepLinkWebViewModelDelegate.this);
            if (messageDispatcherAccess$getMessageDispatcher != null) {
                messageDispatcherAccess$getMessageDispatcher.sendMessage(CellsDeepLinkChannels.CELLS_DEEP_LINK_CHANNEL_NAME, ShortcutExtensionKt.toDeeplink(it));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModelDelegate$observeDeeplinkChannel$1", f = "DeepLinkWebViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f31910p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f31911q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableSharedFlow<Object> f31912r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function1<Object, Unit> function1, MutableSharedFlow<Object> mutableSharedFlow, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f31911q0 = function1;
            this.f31912r0 = mutableSharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            n nVar = new n(this.f31911q0, this.f31912r0, continuation);
            nVar.f31910p0 = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((n) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f31911q0.invoke(this.f31910p0);
            this.f31912r0.resetReplayCache();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModelDelegate$observeDeeplinkChannel$2", f = "DeepLinkWebViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function3<FlowCollector<Object>, Throwable, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Throwable f31913p0;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<Object> flowCollector, Throwable th2, Continuation<? super Unit> continuation) {
            o oVar = new o(3, continuation);
            oVar.f31913p0 = th2;
            return oVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LoggerKt.logError$default("[DeepLinkWebViewModel]: Error getting deeplink from channel ", this.f31913p0, null, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class p extends Lambda implements Function1<DeepLinkModel, Unit> {
        public p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel link = deepLinkModel;
            Intrinsics.checkNotNullParameter(link, "link");
            DeepLinkWebViewModelDelegate.this.handleGemaLink(link);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class q extends Lambda implements Function1<DeepLinkModel, Unit> {
        public q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel link = deepLinkModel;
            Intrinsics.checkNotNullParameter(link, "link");
            DeepLinkWebViewModelDelegate.this.handlePrivateDeepLink(link);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModelDelegate$processPrivateDeeplink$3", f = "DeepLinkWebViewModel.kt", i = {}, l = {211, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31916p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DeepLinkModel f31918r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<DeepLinkModel, Unit> f31919s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ UserType f31920t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(DeepLinkModel deepLinkModel, Function1<? super DeepLinkModel, Unit> function1, UserType userType, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f31918r0 = deepLinkModel;
            this.f31919s0 = function1;
            this.f31920t0 = userType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeepLinkWebViewModelDelegate.this.new r(this.f31918r0, this.f31919s0, this.f31920t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31916p0;
            DeepLinkWebViewModelDelegate deepLinkWebViewModelDelegate = DeepLinkWebViewModelDelegate.this;
            DeepLinkModel deepLinkModel = this.f31918r0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.f31916p0 = 1;
            obj = DeepLinkWebViewModelDelegate.access$canHandleLinkWithActualProfile(deepLinkWebViewModelDelegate, deepLinkModel, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                this.f31919s0.invoke(deepLinkModel);
            } else {
                this.f31916p0 = 2;
                if (DeepLinkWebViewModelDelegate.access$handleChangeProfileByDeeplink(deepLinkWebViewModelDelegate, this.f31920t0, deepLinkModel, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class s extends Lambda implements Function0<ShortcutHandler> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f31921p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ViewModelComponentsProviders viewModelComponentsProviders) {
            super(0);
            this.f31921p0 = viewModelComponentsProviders;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ShortcutHandler invoke() {
            return (ShortcutHandler) this.f31921p0.provide(ShortcutHandler.ID);
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class t extends Lambda implements Function0<UserStoredDatasource> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f31922p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ViewModelComponentsProviders viewModelComponentsProviders) {
            super(0);
            this.f31922p0 = viewModelComponentsProviders;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserStoredDatasource invoke() {
            return (UserStoredDatasource) this.f31922p0.provide(UserStoredDatasource.ID);
        }
    }

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    public static final class u extends Lambda implements Function0<WebController> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f31923p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ViewModelComponentsProviders viewModelComponentsProviders) {
            super(0);
            this.f31923p0 = viewModelComponentsProviders;
        }

        @Override // kotlin.jvm.functions.Function0
        public final WebController invoke() {
            return (WebController) this.f31923p0.provide(WebActions.ID);
        }
    }

    public DeepLinkWebViewModelDelegate(@NotNull ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f31890p0 = LazyKt__LazyJVMKt.lazy(new u(provider));
        this.f31891q0 = LazyKt__LazyJVMKt.lazy(new j(provider));
        this.f31892r0 = LazyKt__LazyJVMKt.lazy(new h(provider));
        this.f31893s0 = LazyKt__LazyJVMKt.lazy(new s(provider));
        this.f31894t0 = LazyKt__LazyJVMKt.lazy(new t(provider));
        this.f31895u0 = LazyKt__LazyJVMKt.lazy(new i(provider));
        this.v0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public static void a(CoroutineScope coroutineScope, MutableSharedFlow mutableSharedFlow, Function1 function1) {
        FlowKt.launchIn(FlowKt.m5982catch(FlowKt.onEach(mutableSharedFlow, new n(function1, mutableSharedFlow, null)), new o(3, null)), coroutineScope);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[PHI: r5
      0x0052: PHI (r5v2 com.bbva.glomohybrid.base.models.DeepLinkModel) = (r5v0 com.bbva.glomohybrid.base.models.DeepLinkModel), (r5v3 com.bbva.glomohybrid.base.models.DeepLinkModel) binds: [B:15:0x0041, B:20:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$canHandleLinkWithActualProfile(DeepLinkWebViewModelDelegate deepLinkWebViewModelDelegate, DeepLinkModel deepLinkModel, Continuation continuation) {
        com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.b bVar;
        UserType userType;
        deepLinkWebViewModelDelegate.getClass();
        if (continuation instanceof com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.b) {
            bVar = (com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.b) continuation;
            int i10 = bVar.f31992s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f31992s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.b(deepLinkWebViewModelDelegate, continuation);
            }
        } else {
            bVar = new com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.b(deepLinkWebViewModelDelegate, continuation);
        }
        Object objExecute = bVar.f31990q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f31992s0;
        boolean z10 = true;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute);
            GetUserTypeUseCase getUserTypeUseCase = (GetUserTypeUseCase) deepLinkWebViewModelDelegate.f31895u0.getValue();
            if (getUserTypeUseCase != null) {
                bVar.f31989p0 = deepLinkModel;
                bVar.f31992s0 = 1;
                objExecute = getUserTypeUseCase.execute(bVar);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                userType = UserType.PERSONAL;
            }
            if ((DeepLinkExtensionsKt.isGemaLink(deepLinkModel) || userType != UserType.ENTERPRISE) && (DeepLinkExtensionsKt.isGemaLink(deepLinkModel) || userType != UserType.PERSONAL)) {
            }
            return Boxing.boxBoolean(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        deepLinkModel = bVar.f31989p0;
        ResultKt.throwOnFailure(objExecute);
        userType = (UserType) objExecute;
        if (userType == null) {
            userType = UserType.PERSONAL;
        }
        z10 = DeepLinkExtensionsKt.isGemaLink(deepLinkModel) ? false : false;
        return Boxing.boxBoolean(z10);
    }

    public static final MessageDispatcher access$getMessageDispatcher(DeepLinkWebViewModelDelegate deepLinkWebViewModelDelegate) {
        return (MessageDispatcher) deepLinkWebViewModelDelegate.f31891q0.getValue();
    }

    public static final Object access$handleChangeProfileByDeeplink(DeepLinkWebViewModelDelegate deepLinkWebViewModelDelegate, UserType userType, DeepLinkModel deepLinkModel, Continuation continuation) {
        if (!deepLinkWebViewModelDelegate.isUserLogged$CellsWeb_mexicoRelease()) {
            return Unit.INSTANCE;
        }
        Object objEmit = deepLinkWebViewModelDelegate.v0.emit(new DeeplinkWebContract.Event.ShowNotificationChangeProfileRequest(deepLinkModel, userType), continuation);
        return objEmit == ek.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void configDeeplinkObservers(@NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        CellsDeepLinkChannels cellsDeepLinkChannels = CellsDeepLinkChannels.INSTANCE;
        a(scope, cellsDeepLinkChannels.getDeepLinkManager(), new a(scope));
        a(scope, cellsDeepLinkChannels.getDeepLinkToMgm(), new b());
        a(scope, cellsDeepLinkChannels.getDeepLinkToAtm(), new c());
        a(scope, cellsDeepLinkChannels.getQrLinkChannel(), new d());
        a(scope, cellsDeepLinkChannels.getGoogleAssistantActionChannel(), new e());
        a(scope, cellsDeepLinkChannels.getPrivateShortcutChannel(), new f());
        a(scope, cellsDeepLinkChannels.getDeepLinkManagerPublic(), new g());
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void handleGemaLink(@NotNull DeepLinkModel deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        if (isUserLogged$CellsWeb_mexicoRelease()) {
            MessageDispatcher messageDispatcher = (MessageDispatcher) this.f31891q0.getValue();
            if (messageDispatcher != null) {
                messageDispatcher.sendMessage(CellsDeepLinkChannels.GEMA_DEEP_LINK_CHANNEL_NAME, DeepLinkExtensionsKt.getRedirectToAsMap(deepLink));
                return;
            }
            return;
        }
        DeepLinkHandler deepLinkHandler = (DeepLinkHandler) this.f31892r0.getValue();
        if (deepLinkHandler == null) {
            return;
        }
        deepLinkHandler.setDeepLink(deepLink);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void handlePrivateDeepLink(@NotNull DeepLinkModel deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        DeepLinkHandler deepLinkHandler = (DeepLinkHandler) this.f31892r0.getValue();
        if (deepLinkHandler != null) {
            deepLinkHandler.setDeepLink(deepLink);
        }
        if (isUserLogged$CellsWeb_mexicoRelease()) {
            notifyDeepLink();
        }
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void handlePrivateShortcut(@NotNull ShortcutModel shortcut) {
        Intrinsics.checkNotNullParameter(shortcut, "shortcut");
        ShortcutHandler shortcutHandler = (ShortcutHandler) this.f31893s0.getValue();
        if (shortcutHandler != null) {
            shortcutHandler.setShortcut(shortcut);
        }
        if (isUserLogged$CellsWeb_mexicoRelease()) {
            notifyShortcut();
        }
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void handlePublicDeepLink(@NotNull DeepLinkModel deepLink) {
        WebController webController;
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Lazy lazy = this.f31892r0;
        DeepLinkHandler deepLinkHandler = (DeepLinkHandler) lazy.getValue();
        if (deepLinkHandler != null) {
            deepLinkHandler.setDeepLink(deepLink);
        }
        DeepLinkHandler deepLinkHandler2 = (DeepLinkHandler) lazy.getValue();
        if (deepLinkHandler2 == null || deepLinkHandler2.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.DEEP_LINK java.lang.String() == null || (webController = (WebController) this.f31890p0.getValue()) == null) {
            return;
        }
        webController.navigateTo(RouteConstants.CELLS_DEEPLINK_MANAGER, null);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void handleQRLink(@NotNull QRPayload qr) {
        Intrinsics.checkNotNullParameter(qr, "qr");
        WebController webController = (WebController) this.f31890p0.getValue();
        if (webController != null) {
            webController.navigateTo(RouteConstants.CARDS_WITHOUT_DATA, qr);
        }
    }

    public final boolean isUserLogged$CellsWeb_mexicoRelease() {
        UserStoredDatasource userStoredDatasource = (UserStoredDatasource) this.f31894t0.getValue();
        if (userStoredDatasource != null) {
            return userStoredDatasource.isLogged();
        }
        return false;
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void notifyDeepLink() {
        DeepLinkHandler deepLinkHandler = (DeepLinkHandler) this.f31892r0.getValue();
        if (deepLinkHandler != null) {
            deepLinkHandler.consume(new k());
        }
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void notifyGemaDeeplink() {
        DeepLinkHandler deepLinkHandler = (DeepLinkHandler) this.f31892r0.getValue();
        if (deepLinkHandler != null) {
            deepLinkHandler.consume(new l());
        }
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    public void notifyShortcut() {
        ShortcutHandler shortcutHandler = (ShortcutHandler) this.f31893s0.getValue();
        if (shortcutHandler != null) {
            shortcutHandler.consume(new m());
        }
    }

    public final void processPrivateDeeplink(@NotNull DeepLinkModel deepLink, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Pair pair = DeepLinkExtensionsKt.isGemaLink(deepLink) ? new Pair(UserType.ENTERPRISE, new p()) : new Pair(UserType.PERSONAL, new q());
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new r(deepLink, (Function1) pair.component2(), (UserType) pair.component1(), null), 3, null);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel
    @NotNull
    public MutableSharedFlow<DeeplinkWebContract.Event> getDeeplinkEvents() {
        return this.v0;
    }
}
