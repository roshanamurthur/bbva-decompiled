package mx.openpay.library.data.mapper.eglobal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.PlanResponseDto;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlanMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"mapToLocalPlan", "", "", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/PlanResponseDto;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PlanMapperKt {
    @NotNull
    public static final List<Integer> mapToLocalPlan(@NotNull PlanResponseDto planResponseDto) {
        Intrinsics.checkNotNullParameter(planResponseDto, "<this>");
        List<Integer> data = planResponseDto.getData();
        return data == null ? CollectionsKt__CollectionsKt.emptyList() : data;
    }
}
