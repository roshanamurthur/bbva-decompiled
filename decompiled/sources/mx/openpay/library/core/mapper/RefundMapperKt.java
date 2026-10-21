package mx.openpay.library.core.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.model.OpenPayFee;
import mx.openpay.library.core.model.OpenPayRefund;
import mx.openpay.library.core.model.extra.RefundResponseDTO;
import mx.openpay.library.domain.model.Refund;
import mx.openpay.library.domain.model.eglobal.Fee;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0001\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0004\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\t"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/Refund;", "Lmx/openpay/library/core/model/OpenPayRefund;", "mapToDomainModelList", "", "mapToLibraryModel", "Lmx/openpay/library/core/model/extra/RefundResponseDTO;", "mapToLibraryModelList", "mapToLibraryToRefundDTOModelList", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRefundMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefundMapper.kt\nmx/openpay/library/core/mapper/RefundMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1549#2:64\n1620#2,3:65\n1549#2:68\n1620#2,3:69\n1549#2:72\n1620#2,3:73\n*S KotlinDebug\n*F\n+ 1 RefundMapper.kt\nmx/openpay/library/core/mapper/RefundMapperKt\n*L\n26#1:64\n26#1:65,3\n47#1:68\n47#1:69,3\n50#1:72\n50#1:73,3\n*E\n"})
public final class RefundMapperKt {
    @NotNull
    public static final Refund mapToDomainModel(@NotNull OpenPayRefund openPayRefund) {
        Intrinsics.checkNotNullParameter(openPayRefund, "<this>");
        String id = openPayRefund.getId();
        String operationDate = openPayRefund.getOperationDate();
        String authorization = openPayRefund.getAuthorization();
        double amount = openPayRefund.getAmount();
        String operationType = openPayRefund.getOperationType();
        String method = openPayRefund.getMethod();
        String transactionType = openPayRefund.getTransactionType();
        String status = openPayRefund.getStatus();
        boolean conciliated = openPayRefund.getConciliated();
        String customerId = openPayRefund.getCustomerId();
        String currency = openPayRefund.getCurrency();
        String creationDate = openPayRefund.getCreationDate();
        String description = openPayRefund.getDescription();
        OpenPayFee fee = openPayRefund.getFee();
        return new Refund(id, operationDate, authorization, amount, operationType, method, transactionType, status, conciliated, customerId, currency, creationDate, description, fee != null ? FeeMapperKt.mapToDomainModel(fee) : null);
    }

    @NotNull
    public static final List<Refund> mapToDomainModelList(@NotNull List<OpenPayRefund> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToDomainModel((OpenPayRefund) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final OpenPayRefund mapToLibraryModel(@NotNull Refund refund) {
        Intrinsics.checkNotNullParameter(refund, "<this>");
        String id = refund.getId();
        String operationDate = refund.getOperationDate();
        String authorization = refund.getAuthorization();
        double amount = refund.getAmount();
        String operationType = refund.getOperationType();
        String method = refund.getMethod();
        String transactionType = refund.getTransactionType();
        String status = refund.getStatus();
        boolean conciliated = refund.getConciliated();
        String customerId = refund.getCustomerId();
        String currency = refund.getCurrency();
        String creationDate = refund.getCreationDate();
        String description = refund.getDescription();
        Fee fee = refund.getFee();
        return new OpenPayRefund(id, operationDate, authorization, amount, operationType, method, transactionType, status, conciliated, customerId, currency, creationDate, description, fee != null ? FeeMapperKt.mapToLibraryModel(fee) : null);
    }

    @NotNull
    public static final List<OpenPayRefund> mapToLibraryModelList(@NotNull List<Refund> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLibraryModel((Refund) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<RefundResponseDTO> mapToLibraryToRefundDTOModelList(@NotNull List<OpenPayRefund> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLibraryModel((OpenPayRefund) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final RefundResponseDTO mapToLibraryModel(@NotNull OpenPayRefund openPayRefund) {
        Intrinsics.checkNotNullParameter(openPayRefund, "<this>");
        String id = openPayRefund.getId();
        String operationDate = openPayRefund.getOperationDate();
        String authorization = openPayRefund.getAuthorization();
        double amount = openPayRefund.getAmount();
        String status = openPayRefund.getStatus();
        boolean conciliated = openPayRefund.getConciliated();
        String currency = openPayRefund.getCurrency();
        OpenPayFee fee = openPayRefund.getFee();
        return new RefundResponseDTO(id, operationDate, authorization, amount, status, conciliated, currency, fee != null ? FeeMapperKt.mapToLibraryModel(fee) : null);
    }
}
