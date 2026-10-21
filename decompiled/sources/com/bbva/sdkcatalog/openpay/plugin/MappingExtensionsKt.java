package com.bbva.sdkcatalog.openpay.plugin;

import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.sdkcatalog.openpay.plugin.data.response.ChargeTransactionResponse;
import com.bbva.sdkcatalog.openpay.plugin.data.response.PaymentLinkListingResponse;
import com.bbva.sdkcatalog.openpay.plugin.data.response.PaymentLinkResponse;
import com.bbva.sdkcatalog.openpay.plugin.data.response.TransactionDetails;
import com.bbva.sdkcatalog.openpay.plugin.data.response.TransactionResponse;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import mx.openpay.library.core.model.OpenPayCustomer;
import mx.openpay.library.core.model.OpenPayPaymentLink;
import mx.openpay.library.core.model.OpenPayPaymentLinkStatus;
import mx.openpay.library.core.model.OpenPayProductType;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.core.model.extra.ChargeTransaction;
import mx.openpay.library.core.model.extra.PaymentLinkStatusFilter;
import mx.openpay.library.core.model.extra.PaymentMethod;
import mx.openpay.library.core.model.extra.StatusFilter;
import mx.openpay.library.core.model.extra.TransactionDTO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MappingExtensions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\u0005\u001a\u00020\b*\u00020\t\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000b\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u000b\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u000b\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u000b¨\u0006\u0015"}, d2 = {"toPaymentLinkResponse", "Lcom/bbva/sdkcatalog/openpay/plugin/data/response/PaymentLinkResponse;", "Lmx/openpay/library/core/model/OpenPayPaymentLink;", "toPaymentLinkListingResponse", "Lcom/bbva/sdkcatalog/openpay/plugin/data/response/PaymentLinkListingResponse;", "toTransactionResponse", "Lcom/bbva/sdkcatalog/openpay/plugin/data/response/TransactionResponse;", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "Lcom/bbva/sdkcatalog/openpay/plugin/data/response/ChargeTransactionResponse;", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "toStatus", "", "Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;", "toPaymentMethod", "Lmx/openpay/library/core/model/extra/PaymentMethod;", "toStatusFilter", "Lmx/openpay/library/core/model/extra/StatusFilter;", "toPaymentLinkStatusFilter", "Lmx/openpay/library/core/model/extra/PaymentLinkStatusFilter;", "toProductType", "Lmx/openpay/library/core/model/OpenPayProductType;", "openpay-plugin_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MappingExtensionsKt {

    /* JADX INFO: compiled from: MappingExtensions.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenPayPaymentLinkStatus.values().length];
            try {
                iArr[OpenPayPaymentLinkStatus.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenPayPaymentLinkStatus.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenPayPaymentLinkStatus.PROCESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OpenPayPaymentLinkStatus.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final PaymentLinkListingResponse toPaymentLinkListingResponse(@NotNull OpenPayPaymentLink openPayPaymentLink) {
        String upperCase;
        TransactionDetails transactionDetails;
        String status;
        Intrinsics.checkNotNullParameter(openPayPaymentLink, "<this>");
        String id = openPayPaymentLink.getId();
        double amount = openPayPaymentLink.getAmount();
        String description = openPayPaymentLink.getDescription();
        String orderId = openPayPaymentLink.getOrderId();
        String currency = openPayPaymentLink.getCurrency();
        String iva = openPayPaymentLink.getIva();
        OpenPayPaymentLinkStatus status2 = openPayPaymentLink.getStatus();
        String status3 = status2 != null ? toStatus(status2) : null;
        if (status3 == null) {
            status3 = "";
        }
        String checkoutLink = openPayPaymentLink.getCheckoutLink();
        String creationDate = openPayPaymentLink.getCreationDate();
        String expirationDate = openPayPaymentLink.getExpirationDate();
        OpenPayCustomer customer = openPayPaymentLink.getCustomer();
        if (openPayPaymentLink.getTransaction() == null) {
            customer = customer;
            transactionDetails = null;
        } else {
            OpenPayTransaction transaction = openPayPaymentLink.getTransaction();
            Double dValueOf = transaction != null ? Double.valueOf(transaction.getAmount()) : null;
            OpenPayTransaction transaction2 = openPayPaymentLink.getTransaction();
            String authorization = transaction2 != null ? transaction2.getAuthorization() : null;
            OpenPayTransaction transaction3 = openPayPaymentLink.getTransaction();
            String method = transaction3 != null ? transaction3.getMethod() : null;
            OpenPayTransaction transaction4 = openPayPaymentLink.getTransaction();
            if (transaction4 == null || (status = transaction4.getStatus()) == null) {
                upperCase = null;
            } else {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                upperCase = status.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            }
            OpenPayTransaction transaction5 = openPayPaymentLink.getTransaction();
            String id2 = transaction5 != null ? transaction5.getId() : null;
            OpenPayTransaction transaction6 = openPayPaymentLink.getTransaction();
            String creationDate2 = transaction6 != null ? transaction6.getCreationDate() : null;
            OpenPayTransaction transaction7 = openPayPaymentLink.getTransaction();
            String description2 = transaction7 != null ? transaction7.getDescription() : null;
            OpenPayTransaction transaction8 = openPayPaymentLink.getTransaction();
            String errorMessage = transaction8 != null ? transaction8.getErrorMessage() : null;
            OpenPayTransaction transaction9 = openPayPaymentLink.getTransaction();
            String orderId2 = transaction9 != null ? transaction9.getOrderId() : null;
            OpenPayTransaction transaction10 = openPayPaymentLink.getTransaction();
            transactionDetails = new TransactionDetails(dValueOf, authorization, method, upperCase, id2, creationDate2, description2, errorMessage, orderId2, transaction10 != null ? Double.valueOf(transaction10.getIva()) : null);
        }
        return new PaymentLinkListingResponse(id, amount, description, orderId, currency, iva, status3, checkoutLink, creationDate, expirationDate, customer, transactionDetails);
    }

    @NotNull
    public static final PaymentLinkResponse toPaymentLinkResponse(@NotNull OpenPayPaymentLink openPayPaymentLink) {
        Intrinsics.checkNotNullParameter(openPayPaymentLink, "<this>");
        String id = openPayPaymentLink.getId();
        double amount = openPayPaymentLink.getAmount();
        String description = openPayPaymentLink.getDescription();
        String orderId = openPayPaymentLink.getOrderId();
        String currency = openPayPaymentLink.getCurrency();
        String iva = openPayPaymentLink.getIva();
        OpenPayPaymentLinkStatus status = openPayPaymentLink.getStatus();
        String status2 = status != null ? toStatus(status) : null;
        if (status2 == null) {
            status2 = "";
        }
        return new PaymentLinkResponse(id, amount, description, orderId, currency, iva, status2, openPayPaymentLink.getCheckoutLink(), openPayPaymentLink.getCreationDate(), openPayPaymentLink.getExpirationDate(), openPayPaymentLink.getCustomer());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final PaymentLinkStatusFilter toPaymentLinkStatusFilter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strReplace$default = l.replace$default(lowerCase, PushConstants.GE_PARAMS_SEPARATOR, "", false, 4, (Object) null);
        switch (strReplace$default.hashCode()) {
            case -1309235419:
                if (strReplace$default.equals("expired")) {
                    return PaymentLinkStatusFilter.EXPIRED;
                }
                return null;
            case -1094759602:
                if (strReplace$default.equals("processed")) {
                    return PaymentLinkStatusFilter.PROCESSED;
                }
                return null;
            case -733902135:
                if (strReplace$default.equals("available")) {
                    return PaymentLinkStatusFilter.AVAILABLE;
                }
                return null;
            case 476588369:
                if (strReplace$default.equals("cancelled")) {
                    return PaymentLinkStatusFilter.CANCELLED;
                }
                return null;
            default:
                return null;
        }
    }

    @Nullable
    public static final PaymentMethod toPaymentMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strReplace$default = l.replace$default(lowerCase, PushConstants.GE_PARAMS_SEPARATOR, "", false, 4, (Object) null);
        int iHashCode = strReplace$default.hashCode();
        if (iHashCode != -1620752775) {
            if (iHashCode != -1413780565) {
                if (iHashCode != 3617) {
                    if (iHashCode == 3046160 && strReplace$default.equals(ValidationConstantsKt.Card)) {
                        return PaymentMethod.CARD;
                    }
                } else if (strReplace$default.equals("qr")) {
                    return PaymentMethod.QR;
                }
            } else if (strReplace$default.equals("cardpresent")) {
                return PaymentMethod.CARD_PRESENT;
            }
        } else if (strReplace$default.equals("linkcobro")) {
            return PaymentMethod.LINK_COBRO;
        }
        return null;
    }

    @Nullable
    public static final OpenPayProductType toProductType(@NotNull String str) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            objM5535constructorimpl = Result.m5535constructorimpl(OpenPayProductType.valueOf(upperCase));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (OpenPayProductType) objM5535constructorimpl;
    }

    @NotNull
    public static final String toStatus(@NotNull OpenPayPaymentLinkStatus openPayPaymentLinkStatus) {
        String str;
        Intrinsics.checkNotNullParameter(openPayPaymentLinkStatus, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[openPayPaymentLinkStatus.ordinal()];
        if (i10 == 1) {
            str = "available";
        } else if (i10 == 2) {
            str = "cancelled";
        } else if (i10 != 3) {
            str = i10 != 4 ? "" : "expired";
        } else {
            str = "processed";
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final StatusFilter toStatusFilter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strReplace$default = l.replace$default(lowerCase, PushConstants.GE_PARAMS_SEPARATOR, "", false, 4, (Object) null);
        switch (strReplace$default.hashCode()) {
            case -1402931637:
                if (strReplace$default.equals("completed")) {
                    return StatusFilter.COMPLETED;
                }
                return null;
            case -1281977283:
                if (strReplace$default.equals("failed")) {
                    return StatusFilter.FAILED;
                }
                return null;
            case 96784904:
                if (strReplace$default.equals("error")) {
                    return StatusFilter.ERROR;
                }
                return null;
            case 182629475:
                if (strReplace$default.equals("chargepending")) {
                    return StatusFilter.CHARGE_PENDING;
                }
                return null;
            case 476588369:
                if (strReplace$default.equals("cancelled")) {
                    return StatusFilter.CANCELLED;
                }
                return null;
            default:
                return null;
        }
    }

    @NotNull
    public static final TransactionResponse toTransactionResponse(@NotNull TransactionDTO transactionDTO) {
        Intrinsics.checkNotNullParameter(transactionDTO, "<this>");
        return new TransactionResponse(transactionDTO.getId(), transactionDTO.getOrderId(), transactionDTO.getDescription(), transactionDTO.getStatus(), Double.valueOf(transactionDTO.getAmount()), transactionDTO.getCurrency(), transactionDTO.getOperationDate(), transactionDTO.getAuthorization(), null, transactionDTO.getReadMode(), false, transactionDTO.getOperationType(), transactionDTO.getMethod(), transactionDTO.getTransactionType(), transactionDTO.getPaymentMethodName(), transactionDTO.getGatewayCardPresent(), transactionDTO.getCard(), transactionDTO.getCreationDate(), transactionDTO.getErrorMessage(), transactionDTO.getOriginChannelName(), transactionDTO.getRefunds(), transactionDTO.getFee(), transactionDTO.getPaymentPlan(), transactionDTO.getProductType());
    }

    @NotNull
    public static final ChargeTransactionResponse toTransactionResponse(@NotNull ChargeTransaction chargeTransaction) {
        Intrinsics.checkNotNullParameter(chargeTransaction, "<this>");
        return new ChargeTransactionResponse(chargeTransaction.getAuthorizationCod(), chargeTransaction.getBankCod(), chargeTransaction.getTransactionDate(), chargeTransaction.getBin(), chargeTransaction.getSpan(), chargeTransaction.getBankName(), chargeTransaction.getType(), chargeTransaction.getBrand(), chargeTransaction.getCardNumber(), chargeTransaction.getId(), chargeTransaction.getGatewayCardPresent(), chargeTransaction.getReadMode(), chargeTransaction.getPaymentPlan());
    }
}
