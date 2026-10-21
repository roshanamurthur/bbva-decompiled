package mx.openpay.library.domain.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.repository.AuthTokenRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetAuthTokenUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lmx/openpay/library/domain/usecase/GetAuthTokenUseCaseImpl;", "Lmx/openpay/library/domain/usecase/GetAuthTokenUseCase;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/AuthTokenRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/AuthTokenRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class GetAuthTokenUseCaseImpl implements GetAuthTokenUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AuthTokenRepository f84195a;

    public GetAuthTokenUseCaseImpl(@NotNull AuthTokenRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84195a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.GetAuthTokenUseCase
    @Nullable
    public Object invoke(@NotNull Continuation<? super String> continuation) {
        return this.f84195a.getLastJwtToken(continuation);
    }
}
