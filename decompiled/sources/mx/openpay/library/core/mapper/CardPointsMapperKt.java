package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayCardPoints;
import mx.openpay.library.domain.model.CardPoints;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/CardPoints;", "Lmx/openpay/library/core/model/OpenPayCardPoints;", "mapToLibraryModel", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CardPointsMapperKt {
    @NotNull
    public static final CardPoints mapToDomainModel(@NotNull OpenPayCardPoints openPayCardPoints) {
        Intrinsics.checkNotNullParameter(openPayCardPoints, "<this>");
        return new CardPoints(openPayCardPoints.getAmount(), openPayCardPoints.getRemaining(), openPayCardPoints.getUsed());
    }

    @NotNull
    public static final OpenPayCardPoints mapToLibraryModel(@NotNull CardPoints cardPoints) {
        Intrinsics.checkNotNullParameter(cardPoints, "<this>");
        return new OpenPayCardPoints(cardPoints.getAmount(), cardPoints.getRemaining(), cardPoints.getUsed());
    }
}
