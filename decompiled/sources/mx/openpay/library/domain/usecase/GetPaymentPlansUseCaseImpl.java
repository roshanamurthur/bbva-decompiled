package mx.openpay.library.domain.usecase;

import com.bbva.notifications.constants.PushConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.repository.EglobalRepository;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetPaymentPlansUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lmx/openpay/library/domain/usecase/GetPaymentPlansUseCaseImpl;", "Lmx/openpay/library/domain/usecase/GetPaymentPlansUseCase;", "", "bin", "", PushConstants.AMOUNT, "Lmx/openpay/library/domain/util/Result;", "", "", "invoke", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/EglobalRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/EglobalRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class GetPaymentPlansUseCaseImpl implements GetPaymentPlansUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EglobalRepository f84196a;

    public GetPaymentPlansUseCaseImpl(@NotNull EglobalRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84196a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.GetPaymentPlansUseCase
    @Nullable
    public Object invoke(@NotNull String str, double d2, @NotNull Continuation<? super Result<? extends List<Integer>>> continuation) {
        return this.f84196a.getPaymentPlans(str, d2, continuation);
    }
}
