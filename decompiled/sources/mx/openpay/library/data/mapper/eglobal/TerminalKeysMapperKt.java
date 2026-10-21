package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.TerminalKeysRequestDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.TerminalKeysResponseDto;
import mx.openpay.library.domain.model.eglobal.TerminalKeysRequest;
import mx.openpay.library.domain.model.eglobal.TerminalKeysResponse;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TerminalKeysMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"mapToLocalTerminalKeys", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/TerminalKeysResponseDto;", "mapToTerminalKeysRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/TerminalKeysRequestDto;", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TerminalKeysMapperKt {
    @NotNull
    public static final TerminalKeysResponse mapToLocalTerminalKeys(@NotNull TerminalKeysResponseDto terminalKeysResponseDto) {
        Intrinsics.checkNotNullParameter(terminalKeysResponseDto, "<this>");
        return new TerminalKeysResponse(terminalKeysResponseDto.getNewKey(), terminalKeysResponseDto.getKsn(), terminalKeysResponseDto.getCrc32(), terminalKeysResponseDto.getOriginalCheckValue(), terminalKeysResponseDto.getCheckValue());
    }

    @NotNull
    public static final TerminalKeysRequestDto mapToTerminalKeysRequestDto(@NotNull TerminalKeysRequest terminalKeysRequest) {
        Intrinsics.checkNotNullParameter(terminalKeysRequest, "<this>");
        return new TerminalKeysRequestDto(terminalKeysRequest.getTokenEs(), terminalKeysRequest.getTokenEw(), terminalKeysRequest.getSlotKey());
    }
}
