package mx.openpay.library.data.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.data.datasource.remote.model.response.TaxesResponseDto;
import mx.openpay.library.domain.model.Taxes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TaxesMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0005"}, d2 = {"mapToLocalTaxes", "Lmx/openpay/library/domain/model/Taxes;", "Lmx/openpay/library/data/datasource/remote/model/response/TaxesResponseDto;", "mapToLocalTaxesList", "", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTaxesMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxesMapper.kt\nmx/openpay/library/data/mapper/TaxesMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,14:1\n1549#2:15\n1620#2,3:16\n*S KotlinDebug\n*F\n+ 1 TaxesMapper.kt\nmx/openpay/library/data/mapper/TaxesMapperKt\n*L\n13#1:15\n13#1:16,3\n*E\n"})
public final class TaxesMapperKt {
    @NotNull
    public static final Taxes mapToLocalTaxes(@NotNull TaxesResponseDto taxesResponseDto) {
        Intrinsics.checkNotNullParameter(taxesResponseDto, "<this>");
        return new Taxes(taxesResponseDto.getAmount(), taxesResponseDto.getDescription());
    }

    @NotNull
    public static final List<Taxes> mapToLocalTaxesList(@NotNull List<TaxesResponseDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<TaxesResponseDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLocalTaxes((TaxesResponseDto) it.next()));
        }
        return arrayList;
    }
}
