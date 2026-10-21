package mx.openpay.library.domain.taponphone;

import android.app.Application;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.model.taponphone.InitResult;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneCallback;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneChargeRequest;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapOnPhoneController.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ/\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u001b\u001a\u00020\u001cH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lmx/openpay/library/domain/taponphone/TapOnPhoneController;", "", "cancelProcess", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCharge", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "tapOnPhoneChargeRequest", "Lmx/openpay/library/domain/model/taponphone/TapOnPhoneChargeRequest;", "tapOnPhoneCallback", "Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;", "(Lmx/openpay/library/domain/model/taponphone/TapOnPhoneChargeRequest;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChargePlansStep", "Lmx/openpay/library/domain/model/CreateCharge;", "selectedPlan", "", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChargePointsStep", "withPoints", "", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChargeSignStep", "encodedImage", "", "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createdTsdkManualInitializer", Constants.APPLICATION, "Landroid/app/Application;", "(Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRefundCharge", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transaction", "(Lmx/openpay/library/domain/model/transaction/Transaction;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initTapOnPhone", "Lmx/openpay/library/domain/model/taponphone/InitResult;", "initTsdkManualInitializer", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TapOnPhoneController {
    @Nullable
    Object cancelProcess(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object createCharge(@NotNull TapOnPhoneChargeRequest tapOnPhoneChargeRequest, @NotNull TapOnPhoneCallback tapOnPhoneCallback, @NotNull Continuation<? super Result<Charge>> continuation);

    @Nullable
    Object createChargePlansStep(@NotNull CreateCharge createCharge, @NotNull TapOnPhoneCallback tapOnPhoneCallback, int i10, @NotNull Continuation<? super Result<Charge>> continuation);

    @Nullable
    Object createChargePointsStep(@NotNull CreateCharge createCharge, @NotNull TapOnPhoneCallback tapOnPhoneCallback, boolean z10, @NotNull Continuation<? super Result<Charge>> continuation);

    @Nullable
    Object createChargeSignStep(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Result<Charge>> continuation);

    @Nullable
    Object createdTsdkManualInitializer(@NotNull Application application, @NotNull Continuation<? super Result<Boolean>> continuation);

    @Nullable
    Object executeRefundCharge(@NotNull Transaction transaction, @NotNull TapOnPhoneCallback tapOnPhoneCallback, @NotNull Continuation<? super Result<Transaction>> continuation);

    @Nullable
    Object initTapOnPhone(@NotNull Continuation<? super Result<InitResult>> continuation);

    @Nullable
    Object initTsdkManualInitializer(@NotNull Continuation<? super Result<Boolean>> continuation);
}
