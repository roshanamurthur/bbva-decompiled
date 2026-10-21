package mx.openpay.library.domain.usecase.taponphone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.taponphone.TapOnPhonePinPadController;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IsApplicationInitAllowedUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"Lmx/openpay/library/domain/usecase/taponphone/IsApplicationInitAllowedUseCaseImpl;", "Lmx/openpay/library/domain/usecase/taponphone/IsApplicationInitAllowedUseCase;", "", "invoke", "Lmx/openpay/library/domain/taponphone/TapOnPhonePinPadController;", "tapOnPhonePinPadController", "<init>", "(Lmx/openpay/library/domain/taponphone/TapOnPhonePinPadController;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class IsApplicationInitAllowedUseCaseImpl implements IsApplicationInitAllowedUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TapOnPhonePinPadController f84298a;

    public IsApplicationInitAllowedUseCaseImpl(@NotNull TapOnPhonePinPadController tapOnPhonePinPadController) {
        Intrinsics.checkNotNullParameter(tapOnPhonePinPadController, "tapOnPhonePinPadController");
        this.f84298a = tapOnPhonePinPadController;
    }

    @Override // mx.openpay.library.domain.usecase.taponphone.IsApplicationInitAllowedUseCase
    public boolean invoke() {
        return this.f84298a.isApplicationInitAllowed();
    }
}
