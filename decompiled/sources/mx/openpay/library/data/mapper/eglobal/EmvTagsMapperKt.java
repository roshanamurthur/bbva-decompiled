package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.EmvTagsRequestDto;
import mx.openpay.library.domain.model.eglobal.EmvTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EmvTagsMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToEmvTagsRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EmvTagsRequestDto;", "Lmx/openpay/library/domain/model/eglobal/EmvTags;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EmvTagsMapperKt {
    @NotNull
    public static final EmvTagsRequestDto mapToEmvTagsRequestDto(@NotNull EmvTags emvTags) {
        Intrinsics.checkNotNullParameter(emvTags, "<this>");
        return new EmvTagsRequestDto(emvTags.getCardHolderVerification(), emvTags.getCryptoInfo(), emvTags.getCryptogram(), emvTags.getDedicatedFileName(), emvTags.getIssuerApplicationData(), emvTags.getSecuenceCounter(), emvTags.getTransactionCounter(), emvTags.getUnpredictableNumber(), emvTags.getVerificationResult(), emvTags.getInterchangeProfile(), emvTags.getCapabilities(), emvTags.getTerminalType(), emvTags.getVersionNumber(), emvTags.getSequenceNumber(), emvTags.getTransactionCurrencyCode(), emvTags.getTransactionDate(), emvTags.getTransactionType(), emvTags.getTransactionAmount(), emvTags.getAmountOther(), emvTags.getTerminalCountryCode(), emvTags.getInterfaceDevice(), emvTags.getTransactionCategoryCode(), emvTags.getIssuerScriptResult(), emvTags.getFormFactorIndicator(), emvTags.getDedicatedFileNameEglobal(), emvTags.getTerminalRiskManagementData());
    }
}
