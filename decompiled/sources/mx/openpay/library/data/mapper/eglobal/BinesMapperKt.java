package mx.openpay.library.data.mapper.eglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.data.datasource.local.database.entity.BinEntity;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.BinResponseDto;
import mx.openpay.library.domain.model.eglobal.Bin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BinesMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0004\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00040\u0006¨\u0006\u0007"}, d2 = {"mapToDataBaseBin", "Lmx/openpay/library/data/datasource/local/database/entity/BinEntity;", "Lmx/openpay/library/domain/model/eglobal/Bin;", "mapToLocalBin", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/BinResponseDto;", "mapToLocalBinList", "", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBinesMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinesMapper.kt\nmx/openpay/library/data/mapper/eglobal/BinesMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1549#2:50\n1620#2,3:51\n*S KotlinDebug\n*F\n+ 1 BinesMapper.kt\nmx/openpay/library/data/mapper/eglobal/BinesMapperKt\n*L\n28#1:50\n28#1:51,3\n*E\n"})
public final class BinesMapperKt {
    @NotNull
    public static final BinEntity mapToDataBaseBin(@NotNull Bin bin) {
        Intrinsics.checkNotNullParameter(bin, "<this>");
        return new BinEntity(0, bin.getIdBin(), bin.getBin(), bin.getAllows6DigitMasking(), bin.getAllows8DigitMasking(), bin.getBank(), bin.getBankCode(), bin.getBankId(), bin.getBankName(), bin.getBbvaWallet(), bin.getBrand(), bin.getCategory(), bin.getLevel(), bin.getPointsType(), bin.getProduct(), bin.getProvider(), bin.getType(), 1, null);
    }

    @NotNull
    public static final Bin mapToLocalBin(@NotNull BinResponseDto binResponseDto) {
        Intrinsics.checkNotNullParameter(binResponseDto, "<this>");
        return new Bin(binResponseDto.getAllows6DigitMasking(), binResponseDto.getAllows8DigitMasking(), binResponseDto.getBank(), binResponseDto.getBankCode(), binResponseDto.getBankId(), binResponseDto.getBankName(), binResponseDto.getBbvaWallet(), binResponseDto.getBin(), binResponseDto.getBrand(), binResponseDto.getCategory(), binResponseDto.getIdBin(), binResponseDto.getLevel(), binResponseDto.getPointsType(), binResponseDto.getProduct(), binResponseDto.getProvider(), binResponseDto.getType());
    }

    @NotNull
    public static final List<Bin> mapToLocalBinList(@NotNull List<BinResponseDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<BinResponseDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLocalBin((BinResponseDto) it.next()));
        }
        return arrayList;
    }
}
