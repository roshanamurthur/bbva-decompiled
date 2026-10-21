package mx.openpay.library.domain.usecase.taponphone;

import android.app.Application;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.taponphone.TapOnPhoneController;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CreatedTsdkManualInitializerUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/domain/usecase/taponphone/CreatedTsdkManualInitializerUseCaseImpl;", "Lmx/openpay/library/domain/usecase/taponphone/CreatedTsdkManualInitializerUseCase;", "()V", "invoke", "Lmx/openpay/library/domain/util/Result;", "", Constants.APPLICATION, "Landroid/app/Application;", "tapOnPhoneController", "Lmx/openpay/library/domain/taponphone/TapOnPhoneController;", "(Landroid/app/Application;Lmx/openpay/library/domain/taponphone/TapOnPhoneController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CreatedTsdkManualInitializerUseCaseImpl implements CreatedTsdkManualInitializerUseCase {
    @Override // mx.openpay.library.domain.usecase.taponphone.CreatedTsdkManualInitializerUseCase
    @Nullable
    public Object invoke(@NotNull Application application, @NotNull TapOnPhoneController tapOnPhoneController, @NotNull Continuation<? super Result<Boolean>> continuation) {
        return tapOnPhoneController.createdTsdkManualInitializer(application, continuation);
    }
}
