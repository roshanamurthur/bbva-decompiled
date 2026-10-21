package mx.openpay.library.data.repository;

import ek.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.datasource.TransactionsLocalDataSource;
import mx.openpay.library.domain.datasource.TransactionsRemoteDataSource;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.eglobal.LocalTransaction;
import mx.openpay.library.domain.model.transaction.SendVoucher;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.model.transaction.TransactionFilter;
import mx.openpay.library.domain.repository.TransactionRepository;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionRepositoryImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\u0006\u0010\u001d\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0011\u0010#\u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ!\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lmx/openpay/library/data/repository/TransactionRepositoryImpl;", "Lmx/openpay/library/domain/repository/TransactionRepository;", "transactionsRemoteDataSource", "Lmx/openpay/library/domain/datasource/TransactionsRemoteDataSource;", "transactionsLocalDataSource", "Lmx/openpay/library/domain/datasource/TransactionsLocalDataSource;", "(Lmx/openpay/library/domain/datasource/TransactionsRemoteDataSource;Lmx/openpay/library/domain/datasource/TransactionsLocalDataSource;)V", "deleteAllLocalTransaction", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTransactions", "Lmx/openpay/library/domain/util/Result;", "", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transactionFilter", "Lmx/openpay/library/domain/model/transaction/TransactionFilter;", "(Lmx/openpay/library/domain/model/transaction/TransactionFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalTransaction", "Lmx/openpay/library/domain/model/eglobal/LocalTransaction;", "getTransaction", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTransaction", "", "chargeRequest", "Lmx/openpay/library/domain/model/CreateCharge;", "idTransaction", "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVoucher", "", "Lmx/openpay/library/domain/model/transaction/SendVoucher;", "(Lmx/openpay/library/domain/model/transaction/SendVoucher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLocalTerminalCapacityData", "terminalCapacity", "updateLocalTerminalCapacityDataSent", "updateTransaction", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionRepositoryImpl implements TransactionRepository {

    @NotNull
    private final TransactionsLocalDataSource transactionsLocalDataSource;

    @NotNull
    private final TransactionsRemoteDataSource transactionsRemoteDataSource;

    public TransactionRepositoryImpl(@NotNull TransactionsRemoteDataSource transactionsRemoteDataSource, @NotNull TransactionsLocalDataSource transactionsLocalDataSource) {
        Intrinsics.checkNotNullParameter(transactionsRemoteDataSource, "transactionsRemoteDataSource");
        Intrinsics.checkNotNullParameter(transactionsLocalDataSource, "transactionsLocalDataSource");
        this.transactionsRemoteDataSource = transactionsRemoteDataSource;
        this.transactionsLocalDataSource = transactionsLocalDataSource;
    }

    @Override // mx.openpay.library.domain.repository.TransactionRepository
    @Nullable
    public Object deleteAllLocalTransaction(@NotNull Continuation<? super Integer> continuation) {
        return this.transactionsLocalDataSource.deleteAllLocalTransaction(continuation);
    }

    @Override // mx.openpay.library.domain.repository.TransactionRepository
    @Nullable
    public Object getAllTransactions(@NotNull TransactionFilter transactionFilter, @NotNull Continuation<? super Result<? extends List<Transaction>>> continuation) {
        return this.transactionsRemoteDataSource.getAllTransactions(transactionFilter, continuation);
    }

    @Override // mx.openpay.library.domain.repository.TransactionRepository
    @Nullable
    public Object getLocalTransaction(@NotNull Continuation<? super LocalTransaction> continuation) {
        return this.transactionsLocalDataSource.getLocalTransaction(continuation);
    }

    @Override // mx.openpay.library.domain.repository.TransactionRepository
    @Nullable
    public Object getTransaction(@NotNull String str, @NotNull Continuation<? super Result<Transaction>> continuation) {
        return this.transactionsRemoteDataSource.getTransaction(str, continuation);
    }

    @Override // mx.openpay.library.domain.repository.TransactionRepository
    @Nullable
    public Object insertTransaction(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertTransaction = this.transactionsLocalDataSource.insertTransaction(createCharge, str, continuation);
        return objInsertTransaction == a.getCOROUTINE_SUSPENDED() ? objInsertTransaction : Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.repository.TransactionRepository
    @Nullable
    public Object sendVoucher(@NotNull SendVoucher sendVoucher, @NotNull Continuation<? super Result<Boolean>> continuation) {
        return this.transactionsRemoteDataSource.sendVoucher(sendVoucher, continuation);
    }

    @Override // mx.openpay.library.domain.repository.TransactionRepository
    @Nullable
    public Object updateLocalTerminalCapacityData(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateTerminalCapacityData = this.transactionsLocalDataSource.updateTerminalCapacityData(str, continuation);
        return objUpdateTerminalCapacityData == a.getCOROUTINE_SUSPENDED() ? objUpdateTerminalCapacityData : Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.repository.TransactionRepository
    @Nullable
    public Object updateLocalTerminalCapacityDataSent(@NotNull Continuation<? super Unit> continuation) {
        Object objUpdateLocalTerminalCapacityDataSent = this.transactionsLocalDataSource.updateLocalTerminalCapacityDataSent(continuation);
        return objUpdateLocalTerminalCapacityDataSent == a.getCOROUTINE_SUSPENDED() ? objUpdateLocalTerminalCapacityDataSent : Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.repository.TransactionRepository
    @Nullable
    public Object updateTransaction(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateTransaction = this.transactionsLocalDataSource.updateTransaction(createCharge, str, continuation);
        return objUpdateTransaction == a.getCOROUTINE_SUSPENDED() ? objUpdateTransaction : Unit.INSTANCE;
    }
}
