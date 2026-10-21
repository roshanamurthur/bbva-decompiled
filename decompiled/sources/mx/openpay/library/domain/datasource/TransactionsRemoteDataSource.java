package mx.openpay.library.domain.datasource;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.transaction.SendVoucher;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.model.transaction.TransactionFilter;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionsRemoteDataSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\r\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lmx/openpay/library/domain/datasource/TransactionsRemoteDataSource;", "", "getAllTransactions", "Lmx/openpay/library/domain/util/Result;", "", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transactionFilter", "Lmx/openpay/library/domain/model/transaction/TransactionFilter;", "(Lmx/openpay/library/domain/model/transaction/TransactionFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransaction", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVoucher", "", "Lmx/openpay/library/domain/model/transaction/SendVoucher;", "(Lmx/openpay/library/domain/model/transaction/SendVoucher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TransactionsRemoteDataSource {
    @Nullable
    Object getAllTransactions(@NotNull TransactionFilter transactionFilter, @NotNull Continuation<? super Result<? extends List<Transaction>>> continuation);

    @Nullable
    Object getTransaction(@NotNull String str, @NotNull Continuation<? super Result<Transaction>> continuation);

    @Nullable
    Object sendVoucher(@NotNull SendVoucher sendVoucher, @NotNull Continuation<? super Result<Boolean>> continuation);
}
