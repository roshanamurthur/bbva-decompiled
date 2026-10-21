package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.GetMerchantRequestDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.MerchantResponseDto;
import mx.openpay.library.domain.model.eglobal.GetMerchant;
import mx.openpay.library.domain.model.eglobal.Merchant;
import mx.openpay.library.domain.model.eglobal.SlotKey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MechantMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"mapToGetMerchantDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/GetMerchantRequestDto;", "Lmx/openpay/library/domain/model/eglobal/GetMerchant;", "mapToLocalMerchant", "Lmx/openpay/library/domain/model/eglobal/Merchant;", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/MerchantResponseDto;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MechantMapperKt {
    @NotNull
    public static final GetMerchantRequestDto mapToGetMerchantDto(@NotNull GetMerchant getMerchant) {
        Intrinsics.checkNotNullParameter(getMerchant, "<this>");
        return new GetMerchantRequestDto(getMerchant.getBinesCount(), getMerchant.getVersion(), getMerchant.getSerialNumber());
    }

    @NotNull
    public static final Merchant mapToLocalMerchant(@NotNull MerchantResponseDto merchantResponseDto) {
        Intrinsics.checkNotNullParameter(merchantResponseDto, "<this>");
        return new Merchant(merchantResponseDto.getMerchantName(), new SlotKey(merchantResponseDto.getSlotKey().getKeyName(), merchantResponseDto.getSlotKey().getProcessor(), merchantResponseDto.getSlotKey().getSlotKey()), merchantResponseDto.getUpdateBines(), merchantResponseDto.getUpdateVersion(), merchantResponseDto.getFirmwareVersion());
    }
}
