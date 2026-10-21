package mx.openpay.library.data.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.FeeResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.RefundResponseDto;
import mx.openpay.library.data.mapper.eglobal.FeeMapperKt;
import mx.openpay.library.domain.model.Refund;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RefundMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0005"}, d2 = {"mapToLocalRefund", "Lmx/openpay/library/domain/model/Refund;", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/RefundResponseDto;", "mapToLocalRefundList", "", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRefundMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefundMapper.kt\nmx/openpay/library/data/mapper/RefundMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1549#2:28\n1620#2,3:29\n*S KotlinDebug\n*F\n+ 1 RefundMapper.kt\nmx/openpay/library/data/mapper/RefundMapperKt\n*L\n26#1:28\n26#1:29,3\n*E\n"})
public final class RefundMapperKt {
    @NotNull
    public static final Refund mapToLocalRefund(@NotNull RefundResponseDto refundResponseDto) {
        Intrinsics.checkNotNullParameter(refundResponseDto, "<this>");
        String id = refundResponseDto.getId();
        String operationDate = refundResponseDto.getOperationDate();
        String authorization = refundResponseDto.getAuthorization();
        double amount = refundResponseDto.getAmount();
        String operationType = refundResponseDto.getOperationType();
        String method = refundResponseDto.getMethod();
        String transactionType = refundResponseDto.getTransactionType();
        String status = refundResponseDto.getStatus();
        boolean conciliated = refundResponseDto.getConciliated();
        String customerId = refundResponseDto.getCustomerId();
        if (customerId == null) {
            customerId = "";
        }
        String currency = refundResponseDto.getCurrency();
        String creationDate = refundResponseDto.getCreationDate();
        String description = refundResponseDto.getDescription();
        FeeResponseDto fee = refundResponseDto.getFee();
        return new Refund(id, operationDate, authorization, amount, operationType, method, transactionType, status, conciliated, customerId, currency, creationDate, description, fee != null ? FeeMapperKt.mapToLocalFee(fee) : null);
    }

    @NotNull
    public static final List<Refund> mapToLocalRefundList(@NotNull List<RefundResponseDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<RefundResponseDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLocalRefund((RefundResponseDto) it.next()));
        }
        return arrayList;
    }
}
