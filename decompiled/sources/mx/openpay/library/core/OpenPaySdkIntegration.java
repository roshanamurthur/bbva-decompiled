package mx.openpay.library.core;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mx.openpay.library.core.feature.TapOnPhoneController;
import mx.openpay.library.core.model.OpenPayConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lmx/openpay/library/core/OpenPaySdkIntegration;", "", "tapOnPhoneController", "Lmx/openpay/library/core/feature/TapOnPhoneController;", "getTapOnPhoneController", "()Lmx/openpay/library/core/feature/TapOnPhoneController;", "initOpenPay", "", "context", "Landroid/content/Context;", "configuration", "Lmx/openpay/library/core/model/OpenPayConfiguration;", "setAuthRefundToken", "newToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAuthToken", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface OpenPaySdkIntegration {
    @NotNull
    TapOnPhoneController getTapOnPhoneController();

    void initOpenPay(@NotNull Context context, @NotNull OpenPayConfiguration configuration);

    @Nullable
    Object setAuthRefundToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setAuthToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
