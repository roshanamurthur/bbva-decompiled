package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.EmvTerminalDataResponseDto;
import mx.openpay.library.domain.model.eglobal.EmvTerminalData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EmvTerminalDataMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToLocalEmvTerminalData", "Lmx/openpay/library/domain/model/eglobal/EmvTerminalData;", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/EmvTerminalDataResponseDto;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EmvTerminalDataMapperKt {
    @NotNull
    public static final EmvTerminalData mapToLocalEmvTerminalData(@NotNull EmvTerminalDataResponseDto emvTerminalDataResponseDto) {
        Intrinsics.checkNotNullParameter(emvTerminalDataResponseDto, "<this>");
        String affiliationNumber = emvTerminalDataResponseDto.getAffiliationNumber();
        String str = affiliationNumber == null ? "" : affiliationNumber;
        String issuerAuthData = emvTerminalDataResponseDto.getIssuerAuthData();
        String str2 = issuerAuthData == null ? "" : issuerAuthData;
        String issuerScript71 = emvTerminalDataResponseDto.getIssuerScript71();
        String str3 = issuerScript71 == null ? "" : issuerScript71;
        String issuerScript72 = emvTerminalDataResponseDto.getIssuerScript72();
        String str4 = issuerScript72 == null ? "" : issuerScript72;
        String requiresNewKey = emvTerminalDataResponseDto.getRequiresNewKey();
        if (requiresNewKey == null) {
            requiresNewKey = "";
        }
        return new EmvTerminalData(str, str2, str3, str4, requiresNewKey);
    }
}
