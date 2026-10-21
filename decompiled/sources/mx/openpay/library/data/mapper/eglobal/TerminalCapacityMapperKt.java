package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.TerminalCapacityRequestDto;
import mx.openpay.library.domain.model.eglobal.TerminalCapacity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TerminalCapacityMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToTerminalCapacityRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/TerminalCapacityRequestDto;", "Lmx/openpay/library/domain/model/eglobal/TerminalCapacity;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TerminalCapacityMapperKt {
    @NotNull
    public static final TerminalCapacityRequestDto mapToTerminalCapacityRequestDto(@NotNull TerminalCapacity terminalCapacity) {
        Intrinsics.checkNotNullParameter(terminalCapacity, "<this>");
        return new TerminalCapacityRequestDto(terminalCapacity.getTransactionId(), terminalCapacity.getTc());
    }
}
