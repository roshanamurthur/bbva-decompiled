package mx.openpay.library.core.feature;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.OpenPaySendVoucher;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.core.model.OpenPayTransactionFilter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmx/openpay/library/core/feature/TransactionController;", "", "getTransactions", "Lmx/openpay/library/core/model/OpenPayResult;", "", "Lmx/openpay/library/core/model/OpenPayTransaction;", "openPayTransactionFilter", "Lmx/openpay/library/core/model/OpenPayTransactionFilter;", "(Lmx/openpay/library/core/model/OpenPayTransactionFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVoucher", "", "openPaySendVoucher", "Lmx/openpay/library/core/model/OpenPaySendVoucher;", "(Lmx/openpay/library/core/model/OpenPaySendVoucher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TransactionController {
    @Nullable
    Object getTransactions(@NotNull OpenPayTransactionFilter openPayTransactionFilter, @NotNull Continuation<? super OpenPayResult<? extends List<OpenPayTransaction>>> continuation);

    @Nullable
    Object sendVoucher(@NotNull OpenPaySendVoucher openPaySendVoucher, @NotNull Continuation<? super OpenPayResult<Boolean>> continuation);
}
