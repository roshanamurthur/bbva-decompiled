package mx.openpay.library.data.mapper.eglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.RSAKeyResponseDto;
import mx.openpay.library.domain.model.eglobal.RSAKey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RSAKeyMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0003¨\u0006\u0005"}, d2 = {"mapToLocalKeysList", "", "Lmx/openpay/library/domain/model/eglobal/RSAKey;", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/RSAKeyResponseDto;", "mapToLocalModel", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRSAKeyMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RSAKeyMapper.kt\nmx/openpay/library/data/mapper/eglobal/RSAKeyMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,16:1\n1549#2:17\n1620#2,3:18\n*S KotlinDebug\n*F\n+ 1 RSAKeyMapper.kt\nmx/openpay/library/data/mapper/eglobal/RSAKeyMapperKt\n*L\n15#1:17\n15#1:18,3\n*E\n"})
public final class RSAKeyMapperKt {
    @NotNull
    public static final List<RSAKey> mapToLocalKeysList(@NotNull List<RSAKeyResponseDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<RSAKeyResponseDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLocalModel((RSAKeyResponseDto) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final RSAKey mapToLocalModel(@NotNull RSAKeyResponseDto rSAKeyResponseDto) {
        Intrinsics.checkNotNullParameter(rSAKeyResponseDto, "<this>");
        String keyName = rSAKeyResponseDto.getKeyName();
        String rsa = rSAKeyResponseDto.getRsa();
        if (rsa == null) {
            rsa = "";
        }
        Integer slotKey = rSAKeyResponseDto.getSlotKey();
        return new RSAKey(keyName, rsa, slotKey != null ? slotKey.intValue() : -1);
    }
}
