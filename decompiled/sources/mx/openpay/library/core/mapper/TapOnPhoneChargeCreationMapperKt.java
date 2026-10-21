package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayTerminalChargeCreation;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneChargeRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToTapOnPhoneChargeRequest", "Lmx/openpay/library/domain/model/taponphone/TapOnPhoneChargeRequest;", "Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TapOnPhoneChargeCreationMapperKt {
    @NotNull
    public static final TapOnPhoneChargeRequest mapToTapOnPhoneChargeRequest(@NotNull OpenPayTerminalChargeCreation openPayTerminalChargeCreation) {
        Intrinsics.checkNotNullParameter(openPayTerminalChargeCreation, "<this>");
        return new TapOnPhoneChargeRequest(openPayTerminalChargeCreation.getAmount(), openPayTerminalChargeCreation.getDescription(), openPayTerminalChargeCreation.getOrderId());
    }
}
