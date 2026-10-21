package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPaySendVoucher;
import mx.openpay.library.core.model.extra.SendVoucherRequestDTO;
import mx.openpay.library.domain.model.transaction.SendVoucher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0004¨\u0006\u0005"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/transaction/SendVoucher;", "Lmx/openpay/library/core/model/OpenPaySendVoucher;", "mapToLibraryModel", "Lmx/openpay/library/core/model/extra/SendVoucherRequestDTO;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SendVoucherMapperKt {
    @NotNull
    public static final SendVoucher mapToDomainModel(@NotNull OpenPaySendVoucher openPaySendVoucher) {
        Intrinsics.checkNotNullParameter(openPaySendVoucher, "<this>");
        return new SendVoucher(openPaySendVoucher.getTransactionId(), openPaySendVoucher.getEmail());
    }

    @NotNull
    public static final OpenPaySendVoucher mapToLibraryModel(@NotNull SendVoucherRequestDTO sendVoucherRequestDTO) {
        Intrinsics.checkNotNullParameter(sendVoucherRequestDTO, "<this>");
        return new OpenPaySendVoucher(sendVoucherRequestDTO.getTransactionId(), sendVoucherRequestDTO.getEmail());
    }
}
