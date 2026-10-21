package com.bbva.glomohybrid.cellsweb.presentation.view;

import androidx.fragment.app.FragmentActivity;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.component.ui.modal.halfmodal.HalfModalEvent;
import com.bbva.component.ui.modal.halfmodal.HalfModalViewModel;
import com.bbva.component.ui.modal.halfmodal.views.HalfModalView;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomoconfig.factory.HalfModalComponentFactory;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.cellsweb.presentation.model.ModalsContract;
import com.bbva.glomohybrid.cellsweb.provider.modal.FullModalProvider;
import com.bbva.glomohybrid.ui.modals.FullScreenModal;
import com.bbva.glomohybrid.ui.modals.changeuser.FullScreenModalFactory;
import k8.f;
import k8.g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SingleAppModalsView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B)\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0004J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006*"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/view/SingleAppModalsView;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/glomohybrid/cellsweb/presentation/view/ModalsView;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "modal", "", "show", "showFullModal", "showHalfModal", "Lcom/bbva/component/ui/modal/halfmodal/views/HalfModalView;", "halfModalView", "observeModalsEvents", "Landroidx/fragment/app/FragmentActivity;", "p0", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;", "s0", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;", "getHalfModalComponent", "()Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;", "halfModalComponent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalsContract$Intent;", "v0", "Lkotlinx/coroutines/flow/Flow;", "getIntents", "()Lkotlinx/coroutines/flow/Flow;", "intents", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/glomohybrid/ui/modals/changeuser/FullScreenModalFactory;", "fullModalFactory", "Lcom/bbva/glomohybrid/cellsweb/provider/modal/FullModalProvider;", "fullModalProvider", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/bbva/glomohybrid/ui/modals/changeuser/FullScreenModalFactory;Lcom/bbva/glomohybrid/cellsweb/provider/modal/FullModalProvider;Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;)V", "Companion", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class SingleAppModalsView implements CoroutineScope, ModalsView {
    public static final int SSO_ERROR_MAX_ATTEMPTS = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FragmentActivity activity;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final FullScreenModalFactory f31750q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final FullModalProvider f31751r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HalfModalComponent halfModalComponent;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f31753t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Channel<ModalsContract.Intent> f31754u0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final Flow<ModalsContract.Intent> intents;

    /* JADX INFO: compiled from: SingleAppModalsView.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.view.SingleAppModalsView$observeModalsEvents$1", f = "SingleAppModalsView.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31755p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ HalfModalView f31756q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ModalType f31757r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SingleAppModalsView f31758s0;

        /* JADX INFO: renamed from: com.bbva.glomohybrid.cellsweb.presentation.view.SingleAppModalsView$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SingleAppModalsView.kt */
        public static final class C0131a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ ModalType f31759p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ SingleAppModalsView f31760q0;

            public C0131a(SingleAppModalsView singleAppModalsView, ModalType modalType) {
                this.f31759p0 = modalType;
                this.f31760q0 = singleAppModalsView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                if (((HalfModalEvent) obj) instanceof HalfModalEvent.OnPrimaryButtonTaped) {
                    ModalType modalType = this.f31759p0;
                    boolean z10 = modalType instanceof ModalType.ErrorSSO;
                    SingleAppModalsView singleAppModalsView = this.f31760q0;
                    if (z10) {
                        Object objSend = singleAppModalsView.f31754u0.send(new ModalsContract.Intent.ConfirmClick(ModalType.ChangeUserRetry.INSTANCE), continuation);
                        return objSend == ek.a.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
                    }
                    if (modalType instanceof ModalType.ChangeUser) {
                        Object objSend2 = singleAppModalsView.f31754u0.send(new ModalsContract.Intent.ConfirmClick(new ModalType.ChangeUser(null, false, 3, null)), continuation);
                        return objSend2 == ek.a.getCOROUTINE_SUSPENDED() ? objSend2 : Unit.INSTANCE;
                    }
                    if (modalType instanceof ModalType.ErrorSSONoPhone) {
                        Object objSend3 = singleAppModalsView.f31754u0.send(new ModalsContract.Intent.ConfirmClick(new ModalType.ErrorSSONoPhone(((ModalType.ErrorSSONoPhone) modalType).getAttemps() + 1)), continuation);
                        return objSend3 == ek.a.getCOROUTINE_SUSPENDED() ? objSend3 : Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HalfModalView halfModalView, ModalType modalType, SingleAppModalsView singleAppModalsView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31756q0 = halfModalView;
            this.f31757r0 = modalType;
            this.f31758s0 = singleAppModalsView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f31756q0, this.f31757r0, this.f31758s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HalfModalViewModel viewModel;
            Flow<HalfModalEvent> onEvents;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31755p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                HalfModalView halfModalView = this.f31756q0;
                if (halfModalView != null && (viewModel = halfModalView.getViewModel()) != null && (onEvents = viewModel.getOnEvents()) != null) {
                    C0131a c0131a = new C0131a(this.f31758s0, this.f31757r0);
                    this.f31755p0 = 1;
                    if (onEvents.collect(c0131a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: compiled from: SingleAppModalsView.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ModalType f31762q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ModalType modalType) {
            super(0);
            this.f31762q0 = modalType;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SingleAppModalsView.access$emitPositiveIntent(SingleAppModalsView.this, this.f31762q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SingleAppModalsView.kt */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ModalType f31764q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ModalType modalType) {
            super(0);
            this.f31764q0 = modalType;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SingleAppModalsView.access$emitCancelIntent(SingleAppModalsView.this, this.f31764q0);
            return Unit.INSTANCE;
        }
    }

    public SingleAppModalsView(@NotNull FragmentActivity activity, @NotNull FullScreenModalFactory fullModalFactory, @NotNull FullModalProvider fullModalProvider, @NotNull HalfModalComponent halfModalComponent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fullModalFactory, "fullModalFactory");
        Intrinsics.checkNotNullParameter(fullModalProvider, "fullModalProvider");
        Intrinsics.checkNotNullParameter(halfModalComponent, "halfModalComponent");
        this.activity = activity;
        this.f31750q0 = fullModalFactory;
        this.f31751r0 = fullModalProvider;
        this.halfModalComponent = halfModalComponent;
        this.f31753t0 = CoroutineScopeKt.MainScope();
        Channel<ModalsContract.Intent> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f31754u0 = channelChannel$default;
        this.intents = FlowKt.consumeAsFlow(channelChannel$default);
    }

    public static final void access$emitCancelIntent(SingleAppModalsView singleAppModalsView, ModalType modalType) {
        singleAppModalsView.getClass();
        BuildersKt__Builders_commonKt.launch$default(singleAppModalsView, null, null, new f(singleAppModalsView, modalType, null), 3, null);
    }

    public static final void access$emitPositiveIntent(SingleAppModalsView singleAppModalsView, ModalType modalType) {
        singleAppModalsView.getClass();
        BuildersKt__Builders_commonKt.launch$default(singleAppModalsView, null, null, new g(singleAppModalsView, modalType, null), 3, null);
    }

    @NotNull
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f31753t0.getCoroutineContext();
    }

    @NotNull
    public final HalfModalComponent getHalfModalComponent() {
        return this.halfModalComponent;
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.view.ModalsView
    @NotNull
    public Flow<ModalsContract.Intent> getIntents() {
        return this.intents;
    }

    public final void observeModalsEvents(@Nullable HalfModalView halfModalView, @NotNull ModalType modal) {
        Intrinsics.checkNotNullParameter(modal, "modal");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(halfModalView, modal, this, null), 3, null);
    }

    public void show(@Nullable ModalType modal) {
        if (modal != null) {
            if (modal instanceof ModalType.ChangeProfileRequestByDeeplink) {
                showFullModal(modal);
            } else {
                showHalfModal(modal);
            }
        }
    }

    public final void showFullModal(@NotNull ModalType modal) {
        Intrinsics.checkNotNullParameter(modal, "modal");
        FullScreenModalFactory fullScreenModalFactory = this.f31750q0;
        FragmentActivity fragmentActivity = this.activity;
        FullScreenModal.FullScreenModalConfig fullScreenModalConfigCreate = fullScreenModalFactory.create(fragmentActivity, modal);
        if (fullScreenModalConfigCreate != null) {
            FullScreenModal fullModalProvider = this.f31751r0.getInstance(fullScreenModalConfigCreate);
            fullModalProvider.setConfirmListener(new b(modal));
            fullModalProvider.setCancelListener(new c(modal));
            fullModalProvider.show(fragmentActivity.getSupportFragmentManager(), fullScreenModalConfigCreate.getId());
        }
    }

    public void showHalfModal(@NotNull ModalType modal) {
        Intrinsics.checkNotNullParameter(modal, "modal");
        boolean z10 = modal instanceof ModalType.ChangeUser;
        FragmentActivity fragmentActivity = this.activity;
        HalfModalComponent halfModalComponent = this.halfModalComponent;
        if (z10) {
            observeModalsEvents(halfModalComponent.configure(HalfModalComponentFactory.INSTANCE.changeUser(((ModalType.ChangeUser) modal).getUserName())).show(fragmentActivity), modal);
        } else if ((modal instanceof ModalType.ErrorSSO) || (modal instanceof ModalType.ErrorSSONoPhone)) {
            observeModalsEvents(halfModalComponent.configure(HalfModalComponentFactory.INSTANCE.changeProfileError()).show(fragmentActivity), modal);
        } else {
            halfModalComponent.configure(HalfModalComponentFactory.INSTANCE.technicalError()).show(fragmentActivity);
        }
    }

    public /* synthetic */ SingleAppModalsView(FragmentActivity fragmentActivity, FullScreenModalFactory fullScreenModalFactory, FullModalProvider fullModalProvider, HalfModalComponent halfModalComponent, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, fullScreenModalFactory, (i10 & 4) != 0 ? new FullModalProvider() : fullModalProvider, halfModalComponent);
    }
}
