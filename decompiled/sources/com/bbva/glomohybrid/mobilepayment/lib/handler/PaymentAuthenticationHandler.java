package com.bbva.glomohybrid.mobilepayment.lib.handler;

import android.content.Context;
import com.bbva.glomohybrid.mobilepayment.commons.PaymentEnrollHandler;
import com.bbva.glomohybrid.mobilepayment.commons.PaymentUnrollHandler;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib;
import com.bbva.gp2.android.product.trustdevice.library.TrustResult;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentAuthenticationHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/lib/handler/PaymentAuthenticationHandler;", "Lcom/bbva/glomohybrid/mobilepayment/commons/PaymentEnrollHandler;", "Lcom/bbva/glomohybrid/mobilepayment/commons/PaymentUnrollHandler;", "", "unroll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authenticated", "", "checkEnabled", "Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentLib;", "mobilePayment", "Lcom/bbva/gp2/android/product/trustdevice/library/TrustDeviceLib;", "trustDevice", "Landroid/content/Context;", "context", "<init>", "(Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentLib;Lcom/bbva/gp2/android/product/trustdevice/library/TrustDeviceLib;Landroid/content/Context;)V", "library_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class PaymentAuthenticationHandler implements PaymentEnrollHandler, PaymentUnrollHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MobilePaymentLib f33794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TrustDeviceLib f33795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f33796c;

    public PaymentAuthenticationHandler(@NotNull MobilePaymentLib mobilePayment, @NotNull TrustDeviceLib trustDevice, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(mobilePayment, "mobilePayment");
        Intrinsics.checkNotNullParameter(trustDevice, "trustDevice");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33794a = mobilePayment;
        this.f33795b = trustDevice;
        this.f33796c = context;
    }

    @Override // com.bbva.glomohybrid.mobilepayment.commons.PaymentEnrollHandler
    public void authenticated() {
        MobilePaymentLib.Companion companion = MobilePaymentLib.INSTANCE;
        Context context = this.f33796c;
        companion.init(context);
        this.f33794a.paymentAuthenticated(context);
    }

    @Override // com.bbva.glomohybrid.mobilepayment.commons.PaymentEnrollHandler
    public boolean checkEnabled() {
        TrustDeviceLib.INSTANCE.init(this.f33796c);
        TrustResult<Boolean> trustResultIsRegistered = this.f33795b.isRegistered();
        if (trustResultIsRegistered instanceof TrustResult.Result) {
            return ((Boolean) ((TrustResult.Result) trustResultIsRegistered).getValue()).booleanValue();
        }
        return false;
    }

    @Override // com.bbva.glomohybrid.mobilepayment.commons.PaymentUnrollHandler
    @Nullable
    public Object unroll(@NotNull Continuation<? super Unit> continuation) {
        try {
            Result.Companion companion = Result.INSTANCE;
            MobilePaymentLib.Companion companion2 = MobilePaymentLib.INSTANCE;
            Context context = this.f33796c;
            companion2.init(context);
            TrustDeviceLib.INSTANCE.init(context);
            this.f33795b.deleteDeviceLocal();
            Result.m5535constructorimpl(this.f33794a.deleteDeviceLocal());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }
}
