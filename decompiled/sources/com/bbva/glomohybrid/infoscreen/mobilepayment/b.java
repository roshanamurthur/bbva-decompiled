package com.bbva.glomohybrid.infoscreen.mobilepayment;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentsInfoNotificationActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.mobilepayment.PaymentsInfoNotificationActivity$collectViewStates$1", f = "PaymentsInfoNotificationActivity.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f32354p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PaymentsInfoNotificationActivity f32355q0;

    /* JADX INFO: compiled from: PaymentsInfoNotificationActivity.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PaymentsInfoNotificationActivity f32356p0;

        public a(PaymentsInfoNotificationActivity paymentsInfoNotificationActivity) {
            this.f32356p0 = paymentsInfoNotificationActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            PaymentsInfoNotificationActivity.access$handleState(this.f32356p0, (PaymentsInfoContract.State) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PaymentsInfoNotificationActivity paymentsInfoNotificationActivity, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f32355q0 = paymentsInfoNotificationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f32355q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f32354p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentsInfoNotificationActivity paymentsInfoNotificationActivity = this.f32355q0;
            StateFlow<PaymentsInfoContract.State> state = paymentsInfoNotificationActivity.i().getState();
            a aVar = new a(paymentsInfoNotificationActivity);
            this.f32354p0 = 1;
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
