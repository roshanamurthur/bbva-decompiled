package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.local.database.entity.TransactionEntity;
import mx.openpay.library.domain.model.eglobal.LocalTransaction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TransactionMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToLocalTransaction", "Lmx/openpay/library/domain/model/eglobal/LocalTransaction;", "Lmx/openpay/library/data/datasource/local/database/entity/TransactionEntity;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransactionMapperKt {
    @NotNull
    public static final LocalTransaction mapToLocalTransaction(@NotNull TransactionEntity transactionEntity) {
        Intrinsics.checkNotNullParameter(transactionEntity, "<this>");
        return new LocalTransaction(transactionEntity.getIdTransaction(), transactionEntity.getTransactionData(), transactionEntity.getTc(), transactionEntity.getTcDataSent());
    }
}
