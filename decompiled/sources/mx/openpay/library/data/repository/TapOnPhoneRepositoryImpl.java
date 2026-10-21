package mx.openpay.library.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.datasource.TapOnPhoneDataSource;
import mx.openpay.library.domain.model.taponphone.RegisterSmartphoneRequest;
import mx.openpay.library.domain.repository.TapOnPhoneRepository;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapOnPhoneRepositoryImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/data/repository/TapOnPhoneRepositoryImpl;", "Lmx/openpay/library/domain/repository/TapOnPhoneRepository;", "tapOnPhoneDataSource", "Lmx/openpay/library/domain/datasource/TapOnPhoneDataSource;", "(Lmx/openpay/library/domain/datasource/TapOnPhoneDataSource;)V", "registerSmartphone", "Lmx/openpay/library/domain/util/Result;", "", "registerSmartphoneRequest", "Lmx/openpay/library/domain/model/taponphone/RegisterSmartphoneRequest;", "(Lmx/openpay/library/domain/model/taponphone/RegisterSmartphoneRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TapOnPhoneRepositoryImpl implements TapOnPhoneRepository {

    @NotNull
    private final TapOnPhoneDataSource tapOnPhoneDataSource;

    public TapOnPhoneRepositoryImpl(@NotNull TapOnPhoneDataSource tapOnPhoneDataSource) {
        Intrinsics.checkNotNullParameter(tapOnPhoneDataSource, "tapOnPhoneDataSource");
        this.tapOnPhoneDataSource = tapOnPhoneDataSource;
    }

    @Override // mx.openpay.library.domain.repository.TapOnPhoneRepository
    @Nullable
    public Object registerSmartphone(@NotNull RegisterSmartphoneRequest registerSmartphoneRequest, @NotNull Continuation<? super Result<Boolean>> continuation) {
        return this.tapOnPhoneDataSource.registerSmartphone(registerSmartphoneRequest, continuation);
    }
}
