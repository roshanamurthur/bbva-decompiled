package mx.openpay.library.domain.usecase.eglobal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.eglobal.TerminalKeysRequest;
import mx.openpay.library.domain.model.eglobal.TerminalKeysResponse;
import mx.openpay.library.domain.repository.EglobalRepository;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InitializeKeysUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096Bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/InitializeKeysUseCaseImpl;", "Lmx/openpay/library/domain/usecase/eglobal/InitializeKeysUseCase;", "", "serial", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;", "terminalKeysRequest", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;", "invoke", "(Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/EglobalRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/EglobalRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class InitializeKeysUseCaseImpl implements InitializeKeysUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EglobalRepository f84242a;

    public InitializeKeysUseCaseImpl(@NotNull EglobalRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84242a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.eglobal.InitializeKeysUseCase
    @Nullable
    public Object invoke(@NotNull String str, @NotNull TerminalKeysRequest terminalKeysRequest, @NotNull Continuation<? super Result<TerminalKeysResponse>> continuation) {
        return this.f84242a.initializeKeys(str, terminalKeysRequest, continuation);
    }
}
