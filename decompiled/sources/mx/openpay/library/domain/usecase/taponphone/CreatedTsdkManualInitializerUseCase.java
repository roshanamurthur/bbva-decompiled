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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦Bø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/usecase/taponphone/CreatedTsdkManualInitializerUseCase;", "", "invoke", "Lmx/openpay/library/domain/util/Result;", "", Constants.APPLICATION, "Landroid/app/Application;", "tapOnPhoneController", "Lmx/openpay/library/domain/taponphone/TapOnPhoneController;", "(Landroid/app/Application;Lmx/openpay/library/domain/taponphone/TapOnPhoneController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CreatedTsdkManualInitializerUseCase {
    @Nullable
    Object invoke(@NotNull Application application, @NotNull TapOnPhoneController tapOnPhoneController, @NotNull Continuation<? super Result<Boolean>> continuation);
}
