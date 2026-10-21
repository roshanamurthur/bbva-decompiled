package mx.openpay.library.domain.usecase.transaction;

import ek.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.repository.TransactionRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UpdateTransactionUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lmx/openpay/library/domain/usecase/transaction/UpdateTransactionUseCaseImpl;", "Lmx/openpay/library/domain/usecase/transaction/UpdateTransactionUseCase;", "Lmx/openpay/library/domain/model/CreateCharge;", "chargeRequest", "", "idTransaction", "", "invoke", "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/TransactionRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/TransactionRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class UpdateTransactionUseCaseImpl implements UpdateTransactionUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TransactionRepository f84308a;

    public UpdateTransactionUseCaseImpl(@NotNull TransactionRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84308a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.transaction.UpdateTransactionUseCase
    @Nullable
    public Object invoke(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateTransaction = this.f84308a.updateTransaction(createCharge, str, continuation);
        return objUpdateTransaction == a.getCOROUTINE_SUSPENDED() ? objUpdateTransaction : Unit.INSTANCE;
    }
}
