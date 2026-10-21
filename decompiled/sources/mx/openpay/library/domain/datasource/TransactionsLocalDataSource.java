package mx.openpay.library.domain.datasource;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.eglobal.LocalTransaction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionsLocalDataSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lmx/openpay/library/domain/datasource/TransactionsLocalDataSource;", "", "deleteAllLocalTransaction", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalTransaction", "Lmx/openpay/library/domain/model/eglobal/LocalTransaction;", "insertTransaction", "", "chargeRequest", "Lmx/openpay/library/domain/model/CreateCharge;", "idTransaction", "", "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLocalTerminalCapacityDataSent", "updateTerminalCapacityData", "terminalCapacity", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTransaction", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TransactionsLocalDataSource {
    @Nullable
    Object deleteAllLocalTransaction(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getLocalTransaction(@NotNull Continuation<? super LocalTransaction> continuation);

    @Nullable
    Object insertTransaction(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateLocalTerminalCapacityDataSent(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateTerminalCapacityData(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateTransaction(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
