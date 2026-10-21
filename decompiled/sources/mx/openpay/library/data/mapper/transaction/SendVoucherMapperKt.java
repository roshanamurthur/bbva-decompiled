package mx.openpay.library.data.mapper.transaction;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.transaction.SendVoucherRequestDto;
import mx.openpay.library.domain.model.transaction.SendVoucher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SendVoucherMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToSendVoucherRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/transaction/SendVoucherRequestDto;", "Lmx/openpay/library/domain/model/transaction/SendVoucher;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SendVoucherMapperKt {
    @NotNull
    public static final SendVoucherRequestDto mapToSendVoucherRequestDto(@NotNull SendVoucher sendVoucher) {
        Intrinsics.checkNotNullParameter(sendVoucher, "<this>");
        return new SendVoucherRequestDto(sendVoucher.getTransactionId(), sendVoucher.getEmail());
    }
}
