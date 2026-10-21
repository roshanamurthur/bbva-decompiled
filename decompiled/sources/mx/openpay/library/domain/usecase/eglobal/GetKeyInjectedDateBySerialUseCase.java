package mx.openpay.library.domain.usecase.eglobal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetKeyInjectedDateBySerialUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/GetKeyInjectedDateBySerialUseCase;", "", "invoke", "", "serial", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GetKeyInjectedDateBySerialUseCase {
    @Nullable
    Object invoke(@NotNull String str, @NotNull Continuation<? super String> continuation);
}
