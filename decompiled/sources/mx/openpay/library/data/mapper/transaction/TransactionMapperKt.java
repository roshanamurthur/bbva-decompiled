package mx.openpay.library.data.mapper.transaction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.data.datasource.remote.model.response.TaxesResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.TransactionResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.CardPointsResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.CardResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.FeeResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.RefundResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.paymentlink.CustomerResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.transaction.PaymentPlanResponseDto;
import mx.openpay.library.data.mapper.RefundMapperKt;
import mx.openpay.library.data.mapper.TaxesMapperKt;
import mx.openpay.library.data.mapper.eglobal.CardMapperKt;
import mx.openpay.library.data.mapper.eglobal.CardPointsMapperKt;
import mx.openpay.library.data.mapper.eglobal.FeeMapperKt;
import mx.openpay.library.data.mapper.eglobal.PaymentPlanMapperKt;
import mx.openpay.library.data.mapper.paymentlink.CustomerMapperKt;
import mx.openpay.library.domain.model.Card;
import mx.openpay.library.domain.model.CardPoints;
import mx.openpay.library.domain.model.Refund;
import mx.openpay.library.domain.model.Taxes;
import mx.openpay.library.domain.model.eglobal.Fee;
import mx.openpay.library.domain.model.eglobal.PaymentPlan;
import mx.openpay.library.domain.model.eglobal.PaymentType;
import mx.openpay.library.domain.model.link.Customer;
import mx.openpay.library.domain.model.transaction.ProductType;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.model.transaction.VoucherType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t*\b\u0012\u0004\u0012\u00020\u00070\t\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u0002¨\u0006\f"}, d2 = {"mapToLocalPaymentType", "Lmx/openpay/library/domain/model/eglobal/PaymentType;", "", "mapToLocalProductType", "Lmx/openpay/library/domain/model/transaction/ProductType;", "mapToLocalTransaction", "Lmx/openpay/library/domain/model/transaction/Transaction;", "Lmx/openpay/library/data/datasource/remote/model/response/TransactionResponseDto;", "mapToLocalTransactionList", "", "mapToLocalVoucherType", "Lmx/openpay/library/domain/model/transaction/VoucherType;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionMapper.kt\nmx/openpay/library/data/mapper/transaction/TransactionMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1549#2:84\n1620#2,3:85\n*S KotlinDebug\n*F\n+ 1 TransactionMapper.kt\nmx/openpay/library/data/mapper/transaction/TransactionMapperKt\n*L\n57#1:84\n57#1:85,3\n*E\n"})
public final class TransactionMapperKt {
    @NotNull
    public static final PaymentType mapToLocalPaymentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (Intrinsics.areEqual(upperCase, "WITH_INTEREST")) {
            return PaymentType.WITH_INTEREST;
        }
        return Intrinsics.areEqual(upperCase, "WITHOUT_INTEREST") ? PaymentType.WITHOUT_INTEREST : PaymentType.WITHOUT_INTEREST;
    }

    @NotNull
    public static final ProductType mapToLocalProductType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -2080587734) {
            if (iHashCode != 2373319) {
                if (iHashCode == 1849647795 && upperCase.equals("PAYMENT_LINK")) {
                    return ProductType.PAYMENT_LINK;
                }
            } else if (upperCase.equals("MPOS")) {
                return ProductType.MPOS;
            }
        } else if (upperCase.equals("TAP_ON_PHONE")) {
            return ProductType.TAP_ON_PHONE;
        }
        return ProductType.MPOS;
    }

    @NotNull
    public static final Transaction mapToLocalTransaction(@NotNull TransactionResponseDto transactionResponseDto) {
        List<Refund> listEmptyList;
        List<Taxes> listEmptyList2;
        Intrinsics.checkNotNullParameter(transactionResponseDto, "<this>");
        String id = transactionResponseDto.getId();
        String authorization = transactionResponseDto.getAuthorization();
        if (authorization == null) {
            authorization = "";
        }
        String operationType = transactionResponseDto.getOperationType();
        if (operationType == null) {
            operationType = "";
        }
        String transactionType = transactionResponseDto.getTransactionType();
        if (transactionType == null) {
            transactionType = "";
        }
        String status = transactionResponseDto.getStatus();
        Boolean conciliated = transactionResponseDto.getConciliated();
        boolean zBooleanValue = conciliated != null ? conciliated.booleanValue() : false;
        String creationDate = transactionResponseDto.getCreationDate();
        String operationDate = transactionResponseDto.getOperationDate();
        if (operationDate == null) {
            operationDate = "";
        }
        String description = transactionResponseDto.getDescription();
        if (description == null) {
            description = "";
        }
        String errorMessage = transactionResponseDto.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "";
        }
        String customerId = transactionResponseDto.getCustomerId();
        if (customerId == null) {
            customerId = "";
        }
        String dueDate = transactionResponseDto.getDueDate();
        if (dueDate == null) {
            dueDate = "";
        }
        String orderId = transactionResponseDto.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        double amount = transactionResponseDto.getAmount();
        CustomerResponseDto customer = transactionResponseDto.getCustomer();
        Customer customerMapToLocalCustomer = customer != null ? CustomerMapperKt.mapToLocalCustomer(customer) : null;
        String currency = transactionResponseDto.getCurrency();
        if (currency == null) {
            currency = "";
        }
        String method = transactionResponseDto.getMethod();
        List<RefundResponseDto> refunds = transactionResponseDto.getRefunds();
        if (refunds == null || (listEmptyList = RefundMapperKt.mapToLocalRefundList(refunds)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        RefundResponseDto refund = transactionResponseDto.getRefund();
        Refund refundMapToLocalRefund = refund != null ? RefundMapperKt.mapToLocalRefund(refund) : null;
        String gatewayCardPresent = transactionResponseDto.getGatewayCardPresent();
        if (gatewayCardPresent == null) {
            gatewayCardPresent = "";
        }
        CardResponseDto card = transactionResponseDto.getCard();
        Card cardMapToLocalCard = card != null ? CardMapperKt.mapToLocalCard(card) : null;
        String readMode = transactionResponseDto.getReadMode();
        if (readMode == null) {
            readMode = "";
        }
        Double iva = transactionResponseDto.getIva();
        double dDoubleValue = iva != null ? iva.doubleValue() : 0.0d;
        CardPointsResponseDto cardPoints = transactionResponseDto.getCardPoints();
        CardPoints cardPointsMapToLocalCardPoints = cardPoints != null ? CardPointsMapperKt.mapToLocalCardPoints(cardPoints) : null;
        FeeResponseDto fee = transactionResponseDto.getFee();
        Fee feeMapToLocalFee = fee != null ? FeeMapperKt.mapToLocalFee(fee) : null;
        String originChannelName = transactionResponseDto.getOriginChannelName();
        if (originChannelName == null) {
            originChannelName = "";
        }
        String paymentMethodName = transactionResponseDto.getPaymentMethodName();
        if (paymentMethodName == null) {
            paymentMethodName = "";
        }
        Integer errorCode = transactionResponseDto.getErrorCode();
        List<TaxesResponseDto> taxes = transactionResponseDto.getTaxes();
        if (taxes == null || (listEmptyList2 = TaxesMapperKt.mapToLocalTaxesList(taxes)) == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        List<Taxes> list = listEmptyList2;
        String voucherType = transactionResponseDto.getVoucherType();
        VoucherType voucherTypeMapToLocalVoucherType = voucherType != null ? mapToLocalVoucherType(voucherType) : null;
        PaymentPlanResponseDto paymentPlan = transactionResponseDto.getPaymentPlan();
        PaymentPlan paymentPlanMapToLocalPaymentPlan = paymentPlan != null ? PaymentPlanMapperKt.mapToLocalPaymentPlan(paymentPlan) : null;
        String productType = transactionResponseDto.getProductType();
        return new Transaction(id, authorization, operationType, transactionType, status, zBooleanValue, creationDate, operationDate, description, errorMessage, customerId, dueDate, orderId, amount, customerMapToLocalCustomer, currency, method, listEmptyList, refundMapToLocalRefund, gatewayCardPresent, cardMapToLocalCard, paymentPlanMapToLocalPaymentPlan, readMode, dDoubleValue, cardPointsMapToLocalCardPoints, feeMapToLocalFee, originChannelName, paymentMethodName, errorCode, list, voucherTypeMapToLocalVoucherType, false, null, null, null, null, productType != null ? mapToLocalProductType(productType) : null, Integer.MIN_VALUE, 15, null);
    }

    @NotNull
    public static final List<Transaction> mapToLocalTransactionList(@NotNull List<TransactionResponseDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<TransactionResponseDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLocalTransaction((TransactionResponseDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final VoucherType mapToLocalVoucherType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        switch (upperCase.hashCode()) {
            case -1881484424:
                if (upperCase.equals("REFUND")) {
                    return VoucherType.REFUND;
                }
                return null;
            case -1769016063:
                if (upperCase.equals("PURCHASE")) {
                    return VoucherType.PURCHASE;
                }
                return null;
            case -453767074:
                if (upperCase.equals("PREAUTHORIZED")) {
                    return VoucherType.PREAUTHORIZED;
                }
                return null;
            case -8331914:
                if (upperCase.equals("ANNULMENT")) {
                    return VoucherType.ANNULMENT;
                }
                return null;
            default:
                return null;
        }
    }
}
