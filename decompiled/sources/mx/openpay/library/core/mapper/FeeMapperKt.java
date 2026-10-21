package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayFee;
import mx.openpay.library.core.model.extra.FeeResponseDTO;
import mx.openpay.library.domain.model.eglobal.Fee;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¨\u0006\u0006"}, d2 = {"mapDTOToLibraryModel", "Lmx/openpay/library/core/model/OpenPayFee;", "Lmx/openpay/library/core/model/extra/FeeResponseDTO;", "mapToDomainModel", "Lmx/openpay/library/domain/model/eglobal/Fee;", "mapToLibraryModel", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FeeMapperKt {
    @NotNull
    public static final OpenPayFee mapDTOToLibraryModel(@NotNull FeeResponseDTO feeResponseDTO) {
        Intrinsics.checkNotNullParameter(feeResponseDTO, "<this>");
        return new OpenPayFee(feeResponseDTO.getAmount(), feeResponseDTO.getCurrency(), feeResponseDTO.getTax());
    }

    @NotNull
    public static final Fee mapToDomainModel(@NotNull OpenPayFee openPayFee) {
        Intrinsics.checkNotNullParameter(openPayFee, "<this>");
        return new Fee(openPayFee.getAmount(), openPayFee.getCurrency(), openPayFee.getTax());
    }

    @NotNull
    public static final OpenPayFee mapToLibraryModel(@NotNull Fee fee) {
        Intrinsics.checkNotNullParameter(fee, "<this>");
        return new OpenPayFee(fee.getAmount(), fee.getCurrency(), fee.getTax());
    }

    @NotNull
    public static final FeeResponseDTO mapToLibraryModel(@NotNull OpenPayFee openPayFee) {
        Intrinsics.checkNotNullParameter(openPayFee, "<this>");
        return new FeeResponseDTO(openPayFee.getAmount(), openPayFee.getCurrency(), openPayFee.getTax());
    }
}
