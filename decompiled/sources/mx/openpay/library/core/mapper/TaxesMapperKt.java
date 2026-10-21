package mx.openpay.library.core.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.model.OpenPayTaxes;
import mx.openpay.library.domain.model.Taxes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0001\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0007"}, d2 = {"mapToDomainTaxes", "Lmx/openpay/library/domain/model/Taxes;", "Lmx/openpay/library/core/model/OpenPayTaxes;", "mapToDomainTaxesList", "", "mapToLibraryTaxes", "mapToLibraryTaxesList", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTaxesMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxesMapper.kt\nmx/openpay/library/core/mapper/TaxesMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1549#2:24\n1620#2,3:25\n1549#2:28\n1620#2,3:29\n*S KotlinDebug\n*F\n+ 1 TaxesMapper.kt\nmx/openpay/library/core/mapper/TaxesMapperKt\n*L\n13#1:24\n13#1:25,3\n22#1:28\n22#1:29,3\n*E\n"})
public final class TaxesMapperKt {
    @NotNull
    public static final Taxes mapToDomainTaxes(@NotNull OpenPayTaxes openPayTaxes) {
        Intrinsics.checkNotNullParameter(openPayTaxes, "<this>");
        return new Taxes(openPayTaxes.getAmount(), openPayTaxes.getDescription());
    }

    @NotNull
    public static final List<Taxes> mapToDomainTaxesList(@NotNull List<OpenPayTaxes> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToDomainTaxes((OpenPayTaxes) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final OpenPayTaxes mapToLibraryTaxes(@NotNull Taxes taxes) {
        Intrinsics.checkNotNullParameter(taxes, "<this>");
        return new OpenPayTaxes(taxes.getAmount(), taxes.getDescription());
    }

    @NotNull
    public static final List<OpenPayTaxes> mapToLibraryTaxesList(@NotNull List<Taxes> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLibraryTaxes((Taxes) it.next()));
        }
        return arrayList;
    }
}
