package mx.openpay.library.core.mapper;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayTerminalChargeCreation;
import mx.openpay.library.domain.model.common.ChargeRequest;
import mx.openpay.library.domain.model.eglobal.EglobalChargeRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/common/ChargeRequest;", "Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TerminalChargeCreationMapperKt {
    @NotNull
    public static final ChargeRequest mapToDomainModel(@NotNull OpenPayTerminalChargeCreation openPayTerminalChargeCreation) {
        Intrinsics.checkNotNullParameter(openPayTerminalChargeCreation, "<this>");
        BigDecimal amount = openPayTerminalChargeCreation.getAmount();
        String description = openPayTerminalChargeCreation.getDescription();
        String orderId = openPayTerminalChargeCreation.getOrderId();
        Integer plan = openPayTerminalChargeCreation.getPlan();
        return new EglobalChargeRequest(amount, description, orderId, plan != null ? plan.intValue() : 0);
    }
}
