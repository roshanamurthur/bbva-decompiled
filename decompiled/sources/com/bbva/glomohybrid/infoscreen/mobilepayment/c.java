package com.bbva.glomohybrid.infoscreen.mobilepayment;

import com.bbva.glomohybrid.mobilepayment.commons.model.PaymentInfoType;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentsInfoNotificationViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.mobilepayment.PaymentsInfoNotificationViewModel$handleButtonClick$1", f = "PaymentsInfoNotificationViewModel.kt", i = {}, l = {111, 113, 115}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f32357p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PaymentsInfoNotificationViewModel f32358q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PaymentsInfoNotificationViewModel paymentsInfoNotificationViewModel, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f32358q0 = paymentsInfoNotificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f32358q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f32357p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentsInfoNotificationViewModel paymentsInfoNotificationViewModel = this.f32358q0;
            if (l.equals$default(paymentsInfoNotificationViewModel.f32339q0, PaymentInfoType.AUTHENTICATION_REQUIRED.getType(), false, 2, null)) {
                Map mapAccess$getAuthenticationUiModel = PaymentsInfoNotificationViewModel.access$getAuthenticationUiModel(paymentsInfoNotificationViewModel);
                Channel channel = paymentsInfoNotificationViewModel.v0;
                PaymentsInfoContract.Event.Authentication authentication = new PaymentsInfoContract.Event.Authentication(mapAccess$getAuthenticationUiModel);
                this.f32357p0 = 1;
                if (channel.send(authentication, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (l.equals$default(paymentsInfoNotificationViewModel.f32339q0, PaymentInfoType.INSECURE_DEVICE.getType(), false, 2, null)) {
                Channel channel2 = paymentsInfoNotificationViewModel.v0;
                PaymentsInfoContract.Event.SecuritySettings securitySettings = PaymentsInfoContract.Event.SecuritySettings.INSTANCE;
                this.f32357p0 = 2;
                if (channel2.send(securitySettings, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Channel channel3 = paymentsInfoNotificationViewModel.v0;
                PaymentsInfoContract.Event.CloseScreen closeScreen = PaymentsInfoContract.Event.CloseScreen.INSTANCE;
                this.f32357p0 = 3;
                if (channel3.send(closeScreen, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
