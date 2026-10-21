package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.EmvTagsRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.EncryptedCardRequestDto;
import mx.openpay.library.domain.model.eglobal.EmvTags;
import mx.openpay.library.domain.model.eglobal.EncryptedCard;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EncryptedCardMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToEncryptedCardRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EncryptedCardRequestDto;", "Lmx/openpay/library/domain/model/eglobal/EncryptedCard;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EncryptedCardMapperKt {
    @NotNull
    public static final EncryptedCardRequestDto mapToEncryptedCardRequestDto(@NotNull EncryptedCard encryptedCard) {
        Intrinsics.checkNotNullParameter(encryptedCard, "<this>");
        EmvTags emvTags = encryptedCard.getEmvTags();
        EmvTagsRequestDto emvTagsRequestDtoMapToEmvTagsRequestDto = emvTags != null ? EmvTagsMapperKt.mapToEmvTagsRequestDto(emvTags) : null;
        String holderName = encryptedCard.getHolderName();
        String model = encryptedCard.getModel();
        String pinStatus = encryptedCard.getPinStatus();
        String readMode = encryptedCard.getReadMode();
        String serialKey = encryptedCard.getSerialKey();
        String tokenES = encryptedCard.getTokenES();
        String tokenEZ = encryptedCard.getTokenEZ();
        String track2Op = encryptedCard.getTrack2Op();
        String version = encryptedCard.getVersion();
        String versionName = encryptedCard.getVersionName();
        String tokenEY = encryptedCard.getTokenEY();
        String tokenCZ = encryptedCard.getTokenCZ();
        Double longitude = encryptedCard.getLongitude();
        double dDoubleValue = longitude != null ? longitude.doubleValue() : 0.0d;
        Double latitude = encryptedCard.getLatitude();
        double dDoubleValue2 = latitude != null ? latitude.doubleValue() : 0.0d;
        String hexSign = encryptedCard.getHexSign();
        String realCounter = encryptedCard.getRealCounter();
        String str = realCounter == null ? "" : realCounter;
        String track2Length = encryptedCard.getTrack2Length();
        String str2 = track2Length == null ? "" : track2Length;
        String track2 = encryptedCard.getTrack2();
        String str3 = track2 == null ? "" : track2;
        String track2Crc = encryptedCard.getTrack2Crc();
        String str4 = track2Crc == null ? "" : track2Crc;
        String tokenR1 = encryptedCard.getTokenR1();
        String str5 = tokenR1 == null ? "" : tokenR1;
        String cardBin = encryptedCard.getCardBin();
        return new EncryptedCardRequestDto(emvTagsRequestDtoMapToEmvTagsRequestDto, holderName, model, pinStatus, readMode, serialKey, tokenES, tokenEZ, track2Op, version, versionName, tokenEY, tokenCZ, dDoubleValue, dDoubleValue2, hexSign, str, str2, str3, str4, str5, cardBin == null ? "" : cardBin, encryptedCard.getSerial(), encryptedCard.getApplicationPreferredName(), encryptedCard.getApplicationLabel());
    }
}
