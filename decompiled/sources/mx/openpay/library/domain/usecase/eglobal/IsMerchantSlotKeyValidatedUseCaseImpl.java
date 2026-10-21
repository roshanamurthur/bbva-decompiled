package mx.openpay.library.domain.usecase.eglobal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.repository.EglobalRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IsMerchantSlotKeyValidatedUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/IsMerchantSlotKeyValidatedUseCaseImpl;", "Lmx/openpay/library/domain/usecase/eglobal/IsMerchantSlotKeyValidatedUseCase;", "", "serial", "", "slotKey", "", "invoke", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/EglobalRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/EglobalRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class IsMerchantSlotKeyValidatedUseCaseImpl implements IsMerchantSlotKeyValidatedUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EglobalRepository f84257a;

    public IsMerchantSlotKeyValidatedUseCaseImpl(@NotNull EglobalRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84257a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.eglobal.IsMerchantSlotKeyValidatedUseCase
    @Nullable
    public Object invoke(@NotNull String str, int i10, @NotNull Continuation<? super Boolean> continuation) {
        return this.f84257a.isMerchantSlotKeyValidated(str, i10, continuation);
    }
}
