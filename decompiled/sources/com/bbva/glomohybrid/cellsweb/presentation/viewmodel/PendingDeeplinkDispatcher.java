package com.bbva.glomohybrid.cellsweb.presentation.viewmodel;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.webcontroller.WebState;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PendingDeeplinkDispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/PendingDeeplinkDispatcher;", "", "Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeViewModelDelegate;", "delegate", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebGlobalViewModel;", "viewModel", "", "setOnPendingIntentSenderListener", "(Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeViewModelDelegate;Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebGlobalViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "messageDispatcher", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class PendingDeeplinkDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MessageDispatcher f31858a;

    /* JADX INFO: compiled from: PendingDeeplinkDispatcher.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.PendingDeeplinkDispatcher", f = "PendingDeeplinkDispatcher.kt", i = {}, l = {15}, m = "setOnPendingIntentSenderListener", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f31859p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f31861r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31859p0 = obj;
            this.f31861r0 |= Integer.MIN_VALUE;
            return PendingDeeplinkDispatcher.this.setOnPendingIntentSenderListener(null, null, this);
        }
    }

    /* JADX INFO: compiled from: PendingDeeplinkDispatcher.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.PendingDeeplinkDispatcher$setOnPendingIntentSenderListener$2", f = "PendingDeeplinkDispatcher.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31862p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UserTypeViewModelDelegate f31864r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CellsWebGlobalViewModel f31865s0;

        /* JADX INFO: compiled from: PendingDeeplinkDispatcher.kt */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ UserTypeViewModelDelegate f31866p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ CellsWebGlobalViewModel f31867q0;

            public a(UserTypeViewModelDelegate userTypeViewModelDelegate, CellsWebGlobalViewModel cellsWebGlobalViewModel) {
                this.f31866p0 = userTypeViewModelDelegate;
                this.f31867q0 = cellsWebGlobalViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                WebState webState = (WebState) obj;
                UserTypeViewModelDelegate userTypeViewModelDelegate = this.f31866p0;
                DeepLinkModel pendingDeeplink = userTypeViewModelDelegate.getPendingDeeplink();
                if (pendingDeeplink != null && webState == WebState.READY) {
                    boolean zIsGemaLink = DeepLinkExtensionsKt.isGemaLink(pendingDeeplink);
                    CellsWebGlobalViewModel cellsWebGlobalViewModel = this.f31867q0;
                    if (zIsGemaLink) {
                        cellsWebGlobalViewModel.handleGemaLink(pendingDeeplink);
                    } else {
                        cellsWebGlobalViewModel.handlePrivateDeepLink(pendingDeeplink);
                    }
                    userTypeViewModelDelegate.setPendingDeeplink(null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserTypeViewModelDelegate userTypeViewModelDelegate, CellsWebGlobalViewModel cellsWebGlobalViewModel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f31864r0 = userTypeViewModelDelegate;
            this.f31865s0 = cellsWebGlobalViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PendingDeeplinkDispatcher.this.new b(this.f31864r0, this.f31865s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31862p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<WebState> state = PendingDeeplinkDispatcher.this.f31858a.getState();
                a aVar = new a(this.f31864r0, this.f31865s0);
                this.f31862p0 = 1;
                if (state.collect(aVar, this) == coroutine_suspended) {
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

    public PendingDeeplinkDispatcher(@NotNull MessageDispatcher messageDispatcher) {
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        this.f31858a = messageDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setOnPendingIntentSenderListener(@NotNull UserTypeViewModelDelegate userTypeViewModelDelegate, @NotNull CellsWebGlobalViewModel cellsWebGlobalViewModel, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f31861r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31861r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f31859p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f31861r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            b bVar = new b(userTypeViewModelDelegate, cellsWebGlobalViewModel, null);
            aVar.f31861r0 = 1;
            if (CoroutineScopeKt.coroutineScope(bVar, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
