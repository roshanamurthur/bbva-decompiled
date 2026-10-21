package mx.openpay.library.data.datasource.local;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.local.database.dao.TransactionDao;
import mx.openpay.library.data.datasource.local.database.entity.TransactionEntity;
import mx.openpay.library.data.mapper.eglobal.TransactionMapperKt;
import mx.openpay.library.domain.datasource.TransactionsLocalDataSource;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.eglobal.LocalTransaction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionsLocalDataSourceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lmx/openpay/library/data/datasource/local/TransactionsLocalDataSourceImpl;", "Lmx/openpay/library/domain/datasource/TransactionsLocalDataSource;", "transactionDao", "Lmx/openpay/library/data/datasource/local/database/dao/TransactionDao;", "(Lmx/openpay/library/data/datasource/local/database/dao/TransactionDao;)V", "deleteAllLocalTransaction", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalTransaction", "Lmx/openpay/library/domain/model/eglobal/LocalTransaction;", "insertTransaction", "", "chargeRequest", "Lmx/openpay/library/domain/model/CreateCharge;", "idTransaction", "", "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLocalTerminalCapacityDataSent", "updateTerminalCapacityData", "terminalCapacity", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTransaction", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionsLocalDataSourceImpl implements TransactionsLocalDataSource {

    @NotNull
    private final TransactionDao transactionDao;

    public TransactionsLocalDataSourceImpl(@NotNull TransactionDao transactionDao) {
        Intrinsics.checkNotNullParameter(transactionDao, "transactionDao");
        this.transactionDao = transactionDao;
    }

    @Override // mx.openpay.library.domain.datasource.TransactionsLocalDataSource
    @Nullable
    public Object deleteAllLocalTransaction(@NotNull Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.transactionDao.deleteAll());
    }

    @Override // mx.openpay.library.domain.datasource.TransactionsLocalDataSource
    @Nullable
    public Object getLocalTransaction(@NotNull Continuation<? super LocalTransaction> continuation) {
        TransactionEntity localTransaction = this.transactionDao.getLocalTransaction();
        if (localTransaction != null) {
            return TransactionMapperKt.mapToLocalTransaction(localTransaction);
        }
        return null;
    }

    @Override // mx.openpay.library.domain.datasource.TransactionsLocalDataSource
    @Nullable
    public Object insertTransaction(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        String json = new Gson().toJson(createCharge);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(chargeRequest)");
        this.transactionDao.insertTransaction(new TransactionEntity(str, json, "", false));
        return Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.datasource.TransactionsLocalDataSource
    @Nullable
    public Object updateLocalTerminalCapacityDataSent(@NotNull Continuation<? super Unit> continuation) {
        this.transactionDao.updateLocalTerminalCapacityDataSent();
        return Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.datasource.TransactionsLocalDataSource
    @Nullable
    public Object updateTerminalCapacityData(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        this.transactionDao.updateTerminalCapacityData(str);
        return Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.datasource.TransactionsLocalDataSource
    @Nullable
    public Object updateTransaction(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        TransactionDao transactionDao = this.transactionDao;
        String json = new Gson().toJson(createCharge);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(chargeRequest)");
        transactionDao.updateTransaction(json, str);
        return Unit.INSTANCE;
    }
}
