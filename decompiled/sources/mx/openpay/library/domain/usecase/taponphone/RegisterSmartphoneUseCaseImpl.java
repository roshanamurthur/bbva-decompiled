package mx.openpay.library.domain.usecase.taponphone;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.taponphone.RegisterSmartphoneRequest;
import mx.openpay.library.domain.repository.TapOnPhoneRepository;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RegisterSmartphoneUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lmx/openpay/library/domain/usecase/taponphone/RegisterSmartphoneUseCaseImpl;", "Lmx/openpay/library/domain/usecase/taponphone/RegisterSmartphoneUseCase;", "Lmx/openpay/library/domain/model/taponphone/RegisterSmartphoneRequest;", "registerSmartphoneRequest", "Lmx/openpay/library/domain/util/Result;", "", "invoke", "(Lmx/openpay/library/domain/model/taponphone/RegisterSmartphoneRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/TapOnPhoneRepository;", "tapOnPhoneRepository", "<init>", "(Lmx/openpay/library/domain/repository/TapOnPhoneRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class RegisterSmartphoneUseCaseImpl implements RegisterSmartphoneUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TapOnPhoneRepository f84299a;

    public RegisterSmartphoneUseCaseImpl(@NotNull TapOnPhoneRepository tapOnPhoneRepository) {
        Intrinsics.checkNotNullParameter(tapOnPhoneRepository, "tapOnPhoneRepository");
        this.f84299a = tapOnPhoneRepository;
    }

    @Override // mx.openpay.library.domain.usecase.taponphone.RegisterSmartphoneUseCase
    @Nullable
    public Object invoke(@NotNull RegisterSmartphoneRequest registerSmartphoneRequest, @NotNull Continuation<? super Result<Boolean>> continuation) {
        return this.f84299a.registerSmartphone(registerSmartphoneRequest, continuation);
    }
}
