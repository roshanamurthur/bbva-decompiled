package com.bbva.glomohybrid.landing.presentation.view;

import com.bbva.component.ui.modal.halfmodal.HalfModalEvent;
import com.bbva.component.ui.modal.halfmodal.HalfModalViewModel;
import com.bbva.component.ui.modal.halfmodal.views.HalfModalView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingChangeUserModalsView.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.view.LandingChangeUserModalsView$observeModalsEvents$1", f = "LandingChangeUserModalsView.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f33112p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ HalfModalView f33113q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingChangeUserModalsView f33114r0;

    /* JADX INFO: compiled from: LandingChangeUserModalsView.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LandingChangeUserModalsView f33115p0;

        public a(LandingChangeUserModalsView landingChangeUserModalsView) {
            this.f33115p0 = landingChangeUserModalsView;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            if (((HalfModalEvent) obj) instanceof HalfModalEvent.OnPrimaryButtonTaped) {
                LandingChangeUserModalsView.access$emitPositiveIntent(this.f33115p0, LandingChangeUserModalsView.Intent.ConfirmChangeUser.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HalfModalView halfModalView, LandingChangeUserModalsView landingChangeUserModalsView, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f33113q0 = halfModalView;
        this.f33114r0 = landingChangeUserModalsView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d(this.f33113q0, this.f33114r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        HalfModalViewModel viewModel;
        Flow<HalfModalEvent> onEvents;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f33112p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            HalfModalView halfModalView = this.f33113q0;
            if (halfModalView != null && (viewModel = halfModalView.getViewModel()) != null && (onEvents = viewModel.getOnEvents()) != null) {
                a aVar = new a(this.f33114r0);
                this.f33112p0 = 1;
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
