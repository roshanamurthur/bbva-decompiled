package mx.openpay.library.data.repository;

import ek.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.datasource.AuthTokenLocalDataSource;
import mx.openpay.library.domain.repository.AuthTokenRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AuthTokenRepositoryImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmx/openpay/library/data/repository/AuthTokenRepositoryImpl;", "Lmx/openpay/library/domain/repository/AuthTokenRepository;", "localTokenDataSource", "Lmx/openpay/library/domain/datasource/AuthTokenLocalDataSource;", "(Lmx/openpay/library/domain/datasource/AuthTokenLocalDataSource;)V", "getLastJwtRefundToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastJwtToken", "saveJwtRefundToken", "", "token", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveJwtToken", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AuthTokenRepositoryImpl implements AuthTokenRepository {

    @NotNull
    private final AuthTokenLocalDataSource localTokenDataSource;

    public AuthTokenRepositoryImpl(@NotNull AuthTokenLocalDataSource localTokenDataSource) {
        Intrinsics.checkNotNullParameter(localTokenDataSource, "localTokenDataSource");
        this.localTokenDataSource = localTokenDataSource;
    }

    @Override // mx.openpay.library.domain.repository.AuthTokenRepository
    @Nullable
    public Object getLastJwtRefundToken(@NotNull Continuation<? super String> continuation) {
        return this.localTokenDataSource.getRefundToken(continuation);
    }

    @Override // mx.openpay.library.domain.repository.AuthTokenRepository
    @Nullable
    public Object getLastJwtToken(@NotNull Continuation<? super String> continuation) {
        return this.localTokenDataSource.getToken(continuation);
    }

    @Override // mx.openpay.library.domain.repository.AuthTokenRepository
    @Nullable
    public Object saveJwtRefundToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objSaveRefundToken = this.localTokenDataSource.saveRefundToken(str, continuation);
        return objSaveRefundToken == a.getCOROUTINE_SUSPENDED() ? objSaveRefundToken : Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.repository.AuthTokenRepository
    @Nullable
    public Object saveJwtToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objSaveToken = this.localTokenDataSource.saveToken(str, continuation);
        return objSaveToken == a.getCOROUTINE_SUSPENDED() ? objSaveToken : Unit.INSTANCE;
    }
}
