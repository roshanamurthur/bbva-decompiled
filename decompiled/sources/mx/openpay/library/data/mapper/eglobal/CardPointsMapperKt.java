package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.CardPointsResponseDto;
import mx.openpay.library.domain.model.CardPoints;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CardPointsMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToLocalCardPoints", "Lmx/openpay/library/domain/model/CardPoints;", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardPointsResponseDto;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CardPointsMapperKt {
    @NotNull
    public static final CardPoints mapToLocalCardPoints(@NotNull CardPointsResponseDto cardPointsResponseDto) {
        Intrinsics.checkNotNullParameter(cardPointsResponseDto, "<this>");
        return new CardPoints(cardPointsResponseDto.getAmount(), cardPointsResponseDto.getRemaining(), cardPointsResponseDto.getUsed());
    }
}
