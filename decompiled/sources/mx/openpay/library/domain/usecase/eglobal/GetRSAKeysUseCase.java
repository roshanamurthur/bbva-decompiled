package mx.openpay.library.domain.usecase.eglobal;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.eglobal.RSAKey;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetRSAKeysUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/GetRSAKeysUseCase;", "", "invoke", "Lmx/openpay/library/domain/util/Result;", "", "Lmx/openpay/library/domain/model/eglobal/RSAKey;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GetRSAKeysUseCase {
    @Nullable
    Object invoke(@NotNull Continuation<? super Result<? extends List<RSAKey>>> continuation);
}
