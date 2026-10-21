package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.ReverseRequestDto;
import mx.openpay.library.domain.model.eglobal.ReverseRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReverseChargeMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToReverseRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/ReverseRequestDto;", "Lmx/openpay/library/domain/model/eglobal/ReverseRequest;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ReverseChargeMapperKt {
    @NotNull
    public static final ReverseRequestDto mapToReverseRequestDto(@NotNull ReverseRequest reverseRequest) {
        Intrinsics.checkNotNullParameter(reverseRequest, "<this>");
        return new ReverseRequestDto(reverseRequest.getOrderId(), reverseRequest.getCapture(), reverseRequest.getReasonReverse());
    }
}
