package mx.openpay.library.core.feature;

import androidx.annotation.Keep;
import com.bbva.notifications.constants.PushConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.core.model.OpenPayCreatePaymentLink;
import mx.openpay.library.core.model.OpenPayPaymentLink;
import mx.openpay.library.core.model.OpenPayPaymentLinkFilter;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.core.model.OpenPayUpdatePaymentLink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000f0\u00032\u0006\u0010\u0015\u001a\u00020\u0016H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u001a\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001b\u001a\u00020\u001cH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lmx/openpay/library/core/feature/PaymentLinkController;", "", "cancelPaymentLink", "Lmx/openpay/library/core/model/OpenPayResult;", "Lmx/openpay/library/core/model/OpenPayPaymentLink;", "paymentLinkId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPaymentLink", "createPayLink", "createPaymentLink", "Lmx/openpay/library/core/model/OpenPayCreatePaymentLink;", "(Lmx/openpay/library/core/model/OpenPayCreatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expirePaymentLink", "getAllPaymentLinks", "", "openPayPaymentLinkFilter", "Lmx/openpay/library/core/model/OpenPayPaymentLinkFilter;", "(Lmx/openpay/library/core/model/OpenPayPaymentLinkFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlans", "", PushConstants.AMOUNT, "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refundPaymentLink", "Lmx/openpay/library/core/model/OpenPayTransaction;", "transactionId", "updatePaymentLink", "Lmx/openpay/library/core/model/OpenPayUpdatePaymentLink;", "(Lmx/openpay/library/core/model/OpenPayUpdatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PaymentLinkController {
    @Nullable
    Object cancelPaymentLink(@NotNull String str, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation);

    @Nullable
    Object checkPaymentLink(@NotNull String str, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation);

    @Nullable
    Object createPayLink(@NotNull OpenPayCreatePaymentLink openPayCreatePaymentLink, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation);

    @Nullable
    Object expirePaymentLink(@NotNull String str, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation);

    @Nullable
    Object getAllPaymentLinks(@NotNull OpenPayPaymentLinkFilter openPayPaymentLinkFilter, @NotNull Continuation<? super OpenPayResult<? extends List<OpenPayPaymentLink>>> continuation);

    @Nullable
    Object getPaymentPlans(double d2, @NotNull Continuation<? super OpenPayResult<? extends List<Integer>>> continuation);

    @Nullable
    Object refundPaymentLink(@NotNull String str, @NotNull Continuation<? super OpenPayResult<OpenPayTransaction>> continuation);

    @Nullable
    Object updatePaymentLink(@NotNull OpenPayUpdatePaymentLink openPayUpdatePaymentLink, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation);
}
