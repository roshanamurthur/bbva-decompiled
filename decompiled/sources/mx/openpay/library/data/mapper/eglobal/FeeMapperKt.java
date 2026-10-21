package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.FeeResponseDto;
import mx.openpay.library.domain.model.eglobal.Fee;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FeeMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToLocalFee", "Lmx/openpay/library/domain/model/eglobal/Fee;", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FeeMapperKt {
    @NotNull
    public static final Fee mapToLocalFee(@NotNull FeeResponseDto feeResponseDto) {
        Intrinsics.checkNotNullParameter(feeResponseDto, "<this>");
        return new Fee(feeResponseDto.getAmount(), feeResponseDto.getCurrency(), feeResponseDto.getTax());
    }
}
