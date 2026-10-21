package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayEmvTerminalData;
import mx.openpay.library.domain.model.eglobal.EmvTerminalData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToLibraryModel", "Lmx/openpay/library/core/model/OpenPayEmvTerminalData;", "Lmx/openpay/library/domain/model/eglobal/EmvTerminalData;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EmvTerminalDataMapperKt {
    @NotNull
    public static final OpenPayEmvTerminalData mapToLibraryModel(@NotNull EmvTerminalData emvTerminalData) {
        Intrinsics.checkNotNullParameter(emvTerminalData, "<this>");
        return new OpenPayEmvTerminalData(emvTerminalData.getAffiliationNumber(), emvTerminalData.getIssuerAuthData(), emvTerminalData.getIssuerScript71(), emvTerminalData.getIssuerScript72(), emvTerminalData.getRequiresNewKey());
    }
}
