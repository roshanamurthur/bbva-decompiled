package mx.openpay.library.core.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.model.OpenPayCard;
import mx.openpay.library.core.model.OpenPayCardPoints;
import mx.openpay.library.core.model.OpenPayCustomer;
import mx.openpay.library.core.model.OpenPayFee;
import mx.openpay.library.core.model.OpenPayPaymentPlan;
import mx.openpay.library.core.model.OpenPayProductType;
import mx.openpay.library.core.model.OpenPayRefund;
import mx.openpay.library.core.model.OpenPayTaxes;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.core.model.OpenPayVoucherType;
import mx.openpay.library.core.model.extra.CardDTO;
import mx.openpay.library.core.model.extra.FeeResponseDTO;
import mx.openpay.library.core.model.extra.RefundResponseDTO;
import mx.openpay.library.core.model.extra.TransactionDTO;
import mx.openpay.library.domain.model.Card;
import mx.openpay.library.domain.model.CardPoints;
import mx.openpay.library.domain.model.Refund;
import mx.openpay.library.domain.model.eglobal.Fee;
import mx.openpay.library.domain.model.eglobal.PaymentPlan;
import mx.openpay.library.domain.model.link.Customer;
import mx.openpay.library.domain.model.link.Taxes;
import mx.openpay.library.domain.model.transaction.ProductType;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.model.transaction.VoucherType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0007*\u00020\b\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\b\u0012\u0004\u0012\u00020\f0\n\u001a\n\u0010\r\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\f\u001a\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n*\b\u0012\u0004\u0012\u00020\u00030\n\u001a\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\n*\b\u0012\u0004\u0012\u00020\u00040\n¨\u0006\u0011"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/transaction/ProductType;", "Lmx/openpay/library/core/model/OpenPayProductType;", "Lmx/openpay/library/domain/model/transaction/Transaction;", "Lmx/openpay/library/core/model/OpenPayTransaction;", "mapToLibraryModel", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "Lmx/openpay/library/core/model/OpenPayVoucherType;", "Lmx/openpay/library/domain/model/transaction/VoucherType;", "mapToLibraryTaxesList", "", "Lmx/openpay/library/core/model/OpenPayTaxes;", "Lmx/openpay/library/domain/model/link/Taxes;", "mapTransactionDTOToLibraryModel", "toLibraryTaxes", "toLibraryTransactionModelList", "toLibraryTransactionToDTOModelList", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionMapper.kt\nmx/openpay/library/core/mapper/TransactionMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1549#2:178\n1620#2,3:179\n1549#2:182\n1620#2,3:183\n1549#2:186\n1620#2,3:187\n*S KotlinDebug\n*F\n+ 1 TransactionMapper.kt\nmx/openpay/library/core/mapper/TransactionMapperKt\n*L\n50#1:178\n50#1:179,3\n86#1:182\n86#1:183,3\n148#1:186\n148#1:187,3\n*E\n"})
public final class TransactionMapperKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VoucherType.values().length];
            try {
                iArr[VoucherType.PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoucherType.REFUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoucherType.ANNULMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoucherType.PREAUTHORIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProductType.values().length];
            try {
                iArr2[ProductType.TAP_ON_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProductType.MPOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ProductType.PAYMENT_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OpenPayProductType.values().length];
            try {
                iArr3[OpenPayProductType.TAP_ON_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OpenPayProductType.MPOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OpenPayProductType.PAYMENT_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @NotNull
    public static final ProductType mapToDomainModel(@NotNull OpenPayProductType openPayProductType) {
        Intrinsics.checkNotNullParameter(openPayProductType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$2[openPayProductType.ordinal()];
        if (i10 == 1) {
            return ProductType.TAP_ON_PHONE;
        }
        if (i10 == 2) {
            return ProductType.MPOS;
        }
        if (i10 == 3) {
            return ProductType.PAYMENT_LINK;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final OpenPayProductType mapToLibraryModel(@NotNull ProductType productType) {
        Intrinsics.checkNotNullParameter(productType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[productType.ordinal()];
        if (i10 == 1) {
            return OpenPayProductType.TAP_ON_PHONE;
        }
        if (i10 == 2) {
            return OpenPayProductType.MPOS;
        }
        if (i10 == 3) {
            return OpenPayProductType.PAYMENT_LINK;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final List<OpenPayTaxes> mapToLibraryTaxesList(@NotNull List<Taxes> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toLibraryTaxes((Taxes) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final OpenPayTransaction mapTransactionDTOToLibraryModel(@NotNull TransactionDTO transactionDTO) {
        Intrinsics.checkNotNullParameter(transactionDTO, "<this>");
        String id = transactionDTO.getId();
        String authorization = transactionDTO.getAuthorization();
        String operationType = transactionDTO.getOperationType();
        String transactionType = transactionDTO.getTransactionType();
        String status = transactionDTO.getStatus();
        boolean conciliated = transactionDTO.getConciliated();
        String creationDate = transactionDTO.getCreationDate();
        String operationDate = transactionDTO.getOperationDate();
        String description = transactionDTO.getDescription();
        String errorMessage = transactionDTO.getErrorMessage();
        String customerId = transactionDTO.getCustomerId();
        String dueDate = transactionDTO.getDueDate();
        String orderId = transactionDTO.getOrderId();
        double amount = transactionDTO.getAmount();
        String currency = transactionDTO.getCurrency();
        String method = transactionDTO.getMethod();
        String gatewayCardPresent = transactionDTO.getGatewayCardPresent();
        CardDTO card = transactionDTO.getCard();
        OpenPayCard openPayCardMapToLibraryModel = card != null ? CardMapperKt.mapToLibraryModel(card) : null;
        String readMode = transactionDTO.getReadMode();
        double iva = transactionDTO.getIva();
        FeeResponseDTO fee = transactionDTO.getFee();
        return new OpenPayTransaction(id, authorization, operationType, transactionType, status, conciliated, creationDate, operationDate, description, errorMessage, customerId, dueDate, orderId, amount, null, currency, method, null, null, gatewayCardPresent, openPayCardMapToLibraryModel, readMode, iva, null, fee != null ? FeeMapperKt.mapDTOToLibraryModel(fee) : null, transactionDTO.getOriginChannelName(), transactionDTO.getPaymentMethodName(), -1, null, null, null, null, -259637248, null);
    }

    @NotNull
    public static final OpenPayTaxes toLibraryTaxes(@NotNull Taxes taxes) {
        Intrinsics.checkNotNullParameter(taxes, "<this>");
        return new OpenPayTaxes(taxes.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String(), taxes.getDescription());
    }

    @NotNull
    public static final List<OpenPayTransaction> toLibraryTransactionModelList(@NotNull List<Transaction> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLibraryModel((Transaction) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<TransactionDTO> toLibraryTransactionToDTOModelList(@NotNull List<OpenPayTransaction> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLibraryModel((OpenPayTransaction) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final Transaction mapToDomainModel(@NotNull OpenPayTransaction openPayTransaction) {
        List<mx.openpay.library.domain.model.Taxes> listEmptyList;
        Intrinsics.checkNotNullParameter(openPayTransaction, "<this>");
        String id = openPayTransaction.getId();
        String authorization = openPayTransaction.getAuthorization();
        String operationType = openPayTransaction.getOperationType();
        String transactionType = openPayTransaction.getTransactionType();
        String status = openPayTransaction.getStatus();
        boolean conciliated = openPayTransaction.getConciliated();
        String creationDate = openPayTransaction.getCreationDate();
        String operationDate = openPayTransaction.getOperationDate();
        String description = openPayTransaction.getDescription();
        String errorMessage = openPayTransaction.getErrorMessage();
        String customerId = openPayTransaction.getCustomerId();
        String dueDate = openPayTransaction.getDueDate();
        String orderId = openPayTransaction.getOrderId();
        double amount = openPayTransaction.getAmount();
        OpenPayCustomer customer = openPayTransaction.getCustomer();
        Customer customerMapToDomainModel = customer != null ? CustomerMapperKt.mapToDomainModel(customer) : null;
        String currency = openPayTransaction.getCurrency();
        String method = openPayTransaction.getMethod();
        List<Refund> listMapToDomainModelList = RefundMapperKt.mapToDomainModelList(openPayTransaction.getRefunds());
        OpenPayRefund refund = openPayTransaction.getRefund();
        Refund refundMapToDomainModel = refund != null ? RefundMapperKt.mapToDomainModel(refund) : null;
        String gatewayCardPresent = openPayTransaction.getGatewayCardPresent();
        OpenPayCard card = openPayTransaction.getCard();
        Card cardMapToDomainModel = card != null ? CardMapperKt.mapToDomainModel(card) : null;
        String readMode = openPayTransaction.getReadMode();
        double iva = openPayTransaction.getIva();
        OpenPayCardPoints cardPoints = openPayTransaction.getCardPoints();
        CardPoints cardPointsMapToDomainModel = cardPoints != null ? CardPointsMapperKt.mapToDomainModel(cardPoints) : null;
        OpenPayFee fee = openPayTransaction.getFee();
        Fee feeMapToDomainModel = fee != null ? FeeMapperKt.mapToDomainModel(fee) : null;
        String originChannelName = openPayTransaction.getOriginChannelName();
        String paymentMethodName = openPayTransaction.getPaymentMethodName();
        Integer errorCode = openPayTransaction.getErrorCode();
        List<OpenPayTaxes> taxes = openPayTransaction.getTaxes();
        if (taxes == null || (listEmptyList = TaxesMapperKt.mapToDomainTaxesList(taxes)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return new Transaction(id, authorization, operationType, transactionType, status, conciliated, creationDate, operationDate, description, errorMessage, customerId, dueDate, orderId, amount, customerMapToDomainModel, currency, method, listMapToDomainModelList, refundMapToDomainModel, gatewayCardPresent, cardMapToDomainModel, null, readMode, iva, cardPointsMapToDomainModel, feeMapToDomainModel, originChannelName, paymentMethodName, errorCode, listEmptyList, null, false, null, null, null, null, null, -1071644672, 31, null);
    }

    @NotNull
    public static final OpenPayTransaction mapToLibraryModel(@NotNull Transaction transaction) {
        List<OpenPayTaxes> listEmptyList;
        Intrinsics.checkNotNullParameter(transaction, "<this>");
        String id = transaction.getId();
        String authorization = transaction.getAuthorization();
        String operationType = transaction.getOperationType();
        String transactionType = transaction.getTransactionType();
        String status = transaction.getStatus();
        boolean conciliated = transaction.getConciliated();
        String creationDate = transaction.getCreationDate();
        String operationDate = transaction.getOperationDate();
        String description = transaction.getDescription();
        String errorMessage = transaction.getErrorMessage();
        String customerId = transaction.getCustomerId();
        String dueDate = transaction.getDueDate();
        String orderId = transaction.getOrderId();
        double amount = transaction.getAmount();
        Customer customer = transaction.getCustomer();
        OpenPayCustomer openPayCustomerMapToLibraryModel = customer != null ? CustomerMapperKt.mapToLibraryModel(customer) : null;
        String currency = transaction.getCurrency();
        String method = transaction.getMethod();
        List<OpenPayRefund> listMapToLibraryModelList = RefundMapperKt.mapToLibraryModelList(transaction.getRefunds());
        Refund refund = transaction.getRefund();
        OpenPayRefund openPayRefundMapToLibraryModel = refund != null ? RefundMapperKt.mapToLibraryModel(refund) : null;
        String gatewayCardPresent = transaction.getGatewayCardPresent();
        Card card = transaction.getCard();
        OpenPayCard openPayCardMapToLibraryModel = card != null ? CardMapperKt.mapToLibraryModel(card) : null;
        String readMode = transaction.getReadMode();
        double iva = transaction.getIva();
        CardPoints cardPoints = transaction.getCardPoints();
        OpenPayCardPoints openPayCardPointsMapToLibraryModel = cardPoints != null ? CardPointsMapperKt.mapToLibraryModel(cardPoints) : null;
        Fee fee = transaction.getFee();
        OpenPayFee openPayFeeMapToLibraryModel = fee != null ? FeeMapperKt.mapToLibraryModel(fee) : null;
        String originChannelName = transaction.getOriginChannelName();
        String paymentMethodName = transaction.getPaymentMethodName();
        Integer errorCode = transaction.getErrorCode();
        List<mx.openpay.library.domain.model.Taxes> taxes = transaction.getTaxes();
        if (taxes == null || (listEmptyList = TaxesMapperKt.mapToLibraryTaxesList(taxes)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        VoucherType voucherType = transaction.getVoucherType();
        OpenPayVoucherType openPayVoucherTypeMapToLibraryModel = voucherType != null ? mapToLibraryModel(voucherType) : null;
        PaymentPlan paymentPlan = transaction.getPaymentPlan();
        OpenPayPaymentPlan openPayPaymentPlanMapToLibraryModel = paymentPlan != null ? PaymentPlanMapperKt.mapToLibraryModel(paymentPlan) : null;
        ProductType productType = transaction.getProductType();
        return new OpenPayTransaction(id, authorization, operationType, transactionType, status, conciliated, creationDate, operationDate, description, errorMessage, customerId, dueDate, orderId, amount, openPayCustomerMapToLibraryModel, currency, method, listMapToLibraryModelList, openPayRefundMapToLibraryModel, gatewayCardPresent, openPayCardMapToLibraryModel, readMode, iva, openPayCardPointsMapToLibraryModel, openPayFeeMapToLibraryModel, originChannelName, paymentMethodName, errorCode, listEmptyList, openPayVoucherTypeMapToLibraryModel, openPayPaymentPlanMapToLibraryModel, productType != null ? mapToLibraryModel(productType) : null);
    }

    @NotNull
    public static final OpenPayVoucherType mapToLibraryModel(@NotNull VoucherType voucherType) {
        Intrinsics.checkNotNullParameter(voucherType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[voucherType.ordinal()];
        if (i10 == 1) {
            return OpenPayVoucherType.PURCHASE;
        }
        if (i10 == 2) {
            return OpenPayVoucherType.REFUND;
        }
        if (i10 == 3) {
            return OpenPayVoucherType.ANNULMENT;
        }
        if (i10 == 4) {
            return OpenPayVoucherType.PREAUTHORIZED;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final TransactionDTO mapToLibraryModel(@NotNull OpenPayTransaction openPayTransaction) {
        Intrinsics.checkNotNullParameter(openPayTransaction, "<this>");
        String id = openPayTransaction.getId();
        String authorization = openPayTransaction.getAuthorization();
        String operationType = openPayTransaction.getOperationType();
        String transactionType = openPayTransaction.getTransactionType();
        String status = openPayTransaction.getStatus();
        boolean conciliated = openPayTransaction.getConciliated();
        String creationDate = openPayTransaction.getCreationDate();
        String operationDate = openPayTransaction.getOperationDate();
        String description = openPayTransaction.getDescription();
        String errorMessage = openPayTransaction.getErrorMessage();
        String customerId = openPayTransaction.getCustomerId();
        String dueDate = openPayTransaction.getDueDate();
        String orderId = openPayTransaction.getOrderId();
        double amount = openPayTransaction.getAmount();
        String currency = openPayTransaction.getCurrency();
        String method = openPayTransaction.getMethod();
        List<RefundResponseDTO> listMapToLibraryToRefundDTOModelList = RefundMapperKt.mapToLibraryToRefundDTOModelList(openPayTransaction.getRefunds());
        String gatewayCardPresent = openPayTransaction.getGatewayCardPresent();
        OpenPayCard card = openPayTransaction.getCard();
        CardDTO cardDTOMapToLibraryModel = card != null ? CardMapperKt.mapToLibraryModel(card) : null;
        String readMode = openPayTransaction.getReadMode();
        double iva = openPayTransaction.getIva();
        OpenPayFee fee = openPayTransaction.getFee();
        return new TransactionDTO(id, authorization, operationType, transactionType, status, conciliated, creationDate, operationDate, description, errorMessage, customerId, dueDate, orderId, amount, currency, method, listMapToLibraryToRefundDTOModelList, gatewayCardPresent, cardDTOMapToLibraryModel, readMode, iva, fee != null ? FeeMapperKt.mapToLibraryModel(fee) : null, openPayTransaction.getOriginChannelName(), openPayTransaction.getPaymentMethodName(), openPayTransaction.getPaymentPlan(), openPayTransaction.getProductType());
    }
}
