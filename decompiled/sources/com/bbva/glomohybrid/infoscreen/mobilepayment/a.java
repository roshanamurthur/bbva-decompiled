package com.bbva.glomohybrid.infoscreen.mobilepayment;

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

/* JADX INFO: compiled from: PaymentsInfoNotificationActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.mobilepayment.PaymentsInfoNotificationActivity$collectEvents$1", f = "PaymentsInfoNotificationActivity.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f32351p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PaymentsInfoNotificationActivity f32352q0;

    /* JADX INFO: renamed from: com.bbva.glomohybrid.infoscreen.mobilepayment.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PaymentsInfoNotificationActivity.kt */
    public static final class C0135a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PaymentsInfoNotificationActivity f32353p0;

        public C0135a(PaymentsInfoNotificationActivity paymentsInfoNotificationActivity) {
            this.f32353p0 = paymentsInfoNotificationActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            PaymentsInfoNotificationActivity.access$handleEvent(this.f32353p0, (PaymentsInfoContract.Event) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PaymentsInfoNotificationActivity paymentsInfoNotificationActivity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f32352q0 = paymentsInfoNotificationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f32352q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f32351p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentsInfoNotificationActivity paymentsInfoNotificationActivity = this.f32352q0;
            Flow<PaymentsInfoContract.Event> events = paymentsInfoNotificationActivity.i().getEvents();
            C0135a c0135a = new C0135a(paymentsInfoNotificationActivity);
            this.f32351p0 = 1;
            if (events.collect(c0135a, this) == coroutine_suspended) {
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
