package mx.openpay.library.data.datasource.local;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.datasource.AuthTokenLocalDataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InMemoryTokenDataSourceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0006\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmx/openpay/library/data/datasource/local/InMemoryTokenDataSourceImpl;", "Lmx/openpay/library/domain/datasource/AuthTokenLocalDataSource;", "()V", "authRefundToken", "", "authToken", "getRefundToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getToken", "saveRefundToken", "", "token", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveToken", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InMemoryTokenDataSourceImpl implements AuthTokenLocalDataSource {

    @NotNull
    private String authToken = "";

    @NotNull
    private String authRefundToken = "";

    @Override // mx.openpay.library.domain.datasource.AuthTokenLocalDataSource
    @Nullable
    public Object getRefundToken(@NotNull Continuation<? super String> continuation) {
        return this.authRefundToken;
    }

    @Override // mx.openpay.library.domain.datasource.AuthTokenLocalDataSource
    @Nullable
    public Object getToken(@NotNull Continuation<? super String> continuation) {
        return this.authToken;
    }

    @Override // mx.openpay.library.domain.datasource.AuthTokenLocalDataSource
    @Nullable
    public Object saveRefundToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        this.authRefundToken = str;
        return Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.datasource.AuthTokenLocalDataSource
    @Nullable
    public Object saveToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        this.authToken = str;
        return Unit.INSTANCE;
    }
}
