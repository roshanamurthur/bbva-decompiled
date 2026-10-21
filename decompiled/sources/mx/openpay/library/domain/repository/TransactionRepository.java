package mx.openpay.library.domain.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.eglobal.LocalTransaction;
import mx.openpay.library.domain.model.transaction.SendVoucher;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.model.transaction.TransactionFilter;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u0004\u0018\u00010\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u0018\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001e\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J!\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lmx/openpay/library/domain/repository/TransactionRepository;", "", "deleteAllLocalTransaction", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTransactions", "Lmx/openpay/library/domain/util/Result;", "", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transactionFilter", "Lmx/openpay/library/domain/model/transaction/TransactionFilter;", "(Lmx/openpay/library/domain/model/transaction/TransactionFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalTransaction", "Lmx/openpay/library/domain/model/eglobal/LocalTransaction;", "getTransaction", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTransaction", "", "chargeRequest", "Lmx/openpay/library/domain/model/CreateCharge;", "idTransaction", "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVoucher", "", "Lmx/openpay/library/domain/model/transaction/SendVoucher;", "(Lmx/openpay/library/domain/model/transaction/SendVoucher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLocalTerminalCapacityData", "terminalCapacity", "updateLocalTerminalCapacityDataSent", "updateTransaction", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TransactionRepository {
    @Nullable
    Object deleteAllLocalTransaction(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getAllTransactions(@NotNull TransactionFilter transactionFilter, @NotNull Continuation<? super Result<? extends List<Transaction>>> continuation);

    @Nullable
    Object getLocalTransaction(@NotNull Continuation<? super LocalTransaction> continuation);

    @Nullable
    Object getTransaction(@NotNull String str, @NotNull Continuation<? super Result<Transaction>> continuation);

    @Nullable
    Object insertTransaction(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sendVoucher(@NotNull SendVoucher sendVoucher, @NotNull Continuation<? super Result<Boolean>> continuation);

    @Nullable
    Object updateLocalTerminalCapacityData(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateLocalTerminalCapacityDataSent(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateTransaction(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
