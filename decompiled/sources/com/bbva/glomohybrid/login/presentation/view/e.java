package com.bbva.glomohybrid.login.presentation.view;

import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.component.ui.modal.halfmodal.HalfModalEvent;
import com.bbva.component.ui.modal.halfmodal.HalfModalViewModel;
import com.bbva.component.ui.modal.halfmodal.views.HalfModalView;
import com.bbva.glomoconfig.factory.HalfModalComponentFactory;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.view.LoginActivity$handleBiometricsServerError$1", f = "LoginActivity.kt", i = {}, l = {477}, m = "invokeSuspend", n = {}, s = {})
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public HalfModalView f33563p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f33564q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f33565r0;

    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LoginActivity f33566p0;

        public a(LoginActivity loginActivity) {
            this.f33566p0 = loginActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            HalfModalEvent halfModalEvent = (HalfModalEvent) obj;
            boolean z10 = halfModalEvent instanceof HalfModalEvent.OnCloseButtonTaped;
            LoginActivity loginActivity = this.f33566p0;
            if (z10 || Intrinsics.areEqual(halfModalEvent, HalfModalEvent.OnPrimaryButtonTaped.INSTANCE)) {
                loginActivity.j().setIntent(LoginContract.Intent.LoadUserRememberedBiometrics.INSTANCE);
            } else if (halfModalEvent instanceof HalfModalEvent.OnSecondaryButtonTaped) {
                loginActivity.j().setIntent(LoginContract.Intent.LoadUserRememberedCredentials.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LoginActivity loginActivity, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f33565r0 = loginActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new e(this.f33565r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        HalfModalViewModel viewModel;
        Flow<HalfModalEvent> onEvents;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f33564q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            HalfModalComponent halfModalComponentConfigure = HalfModalComponent.INSTANCE.getInstance().configure(HalfModalComponentFactory.INSTANCE.networkError());
            LoginActivity loginActivity = this.f33565r0;
            HalfModalView halfModalViewShow = halfModalComponentConfigure.show(loginActivity);
            if (halfModalViewShow != null && (viewModel = halfModalViewShow.getViewModel()) != null && (onEvents = viewModel.getOnEvents()) != null) {
                a aVar = new a(loginActivity);
                this.f33563p0 = halfModalViewShow;
                this.f33564q0 = 1;
                if (onEvents.collect(aVar, this) == coroutine_suspended) {
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
