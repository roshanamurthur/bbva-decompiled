package mx.openpay.library.domain.usecase.eglobal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.eglobal.GetMerchant;
import mx.openpay.library.domain.model.eglobal.Merchant;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetMerchantUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/GetMerchantUseCase;", "", "invoke", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Merchant;", "merchant", "Lmx/openpay/library/domain/model/eglobal/GetMerchant;", "(Lmx/openpay/library/domain/model/eglobal/GetMerchant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GetMerchantUseCase {
    @Nullable
    Object invoke(@NotNull GetMerchant getMerchant, @NotNull Continuation<? super Result<Merchant>> continuation);
}
