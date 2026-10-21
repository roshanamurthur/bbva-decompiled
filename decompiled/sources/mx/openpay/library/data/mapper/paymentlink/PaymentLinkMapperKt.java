package mx.openpay.library.data.mapper.paymentlink;

import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.data.datasource.remote.model.request.paymentlink.CreatePaymentLinkRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.paymentlink.CustomerRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.paymentlink.UpdatePaymentLinkRequestDto;
import mx.openpay.library.data.datasource.remote.model.response.TransactionResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.paymentlink.PaymentLinkResponseDto;
import mx.openpay.library.data.mapper.eglobal.PaymentPlanMapperKt;
import mx.openpay.library.data.mapper.transaction.TransactionMapperKt;
import mx.openpay.library.domain.model.IntegratorTags;
import mx.openpay.library.domain.model.eglobal.PaymentPlanLink;
import mx.openpay.library.domain.model.link.CreatePaymentLink;
import mx.openpay.library.domain.model.link.Customer;
import mx.openpay.library.domain.model.link.PaymentLink;
import mx.openpay.library.domain.model.link.PaymentLinkStatus;
import mx.openpay.library.domain.model.link.UpdatePaymentLink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentLinkMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t*\b\u0012\u0004\u0012\u00020\u00070\t\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u000f¨\u0006\u0010"}, d2 = {"mapToCreatePaymentLinkRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/paymentlink/CreatePaymentLinkRequestDto;", "Lmx/openpay/library/domain/model/link/CreatePaymentLink;", k.a.f65040g, "Lmx/openpay/library/domain/model/IntegratorTags;", "mapToLocalPaymentLink", "Lmx/openpay/library/domain/model/link/PaymentLink;", "Lmx/openpay/library/data/datasource/remote/model/response/paymentlink/PaymentLinkResponseDto;", "mapToLocalPaymentLinkList", "", "mapToLocalPaymentLinkStatus", "Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "", "mapToUpdatePaymentLinkRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/paymentlink/UpdatePaymentLinkRequestDto;", "Lmx/openpay/library/domain/model/link/UpdatePaymentLink;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaymentLinkMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLinkMapper.kt\nmx/openpay/library/data/mapper/paymentlink/PaymentLinkMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n1549#2:65\n1620#2,3:66\n*S KotlinDebug\n*F\n+ 1 PaymentLinkMapper.kt\nmx/openpay/library/data/mapper/paymentlink/PaymentLinkMapperKt\n*L\n48#1:65\n48#1:66,3\n*E\n"})
public final class PaymentLinkMapperKt {
    @NotNull
    public static final CreatePaymentLinkRequestDto mapToCreatePaymentLinkRequestDto(@NotNull CreatePaymentLink createPaymentLink, @NotNull IntegratorTags tags) {
        Intrinsics.checkNotNullParameter(createPaymentLink, "<this>");
        Intrinsics.checkNotNullParameter(tags, "tags");
        String strValueOf = String.valueOf(createPaymentLink.getAmount());
        String description = createPaymentLink.getDescription();
        String orderId = createPaymentLink.getOrderId();
        String currency = createPaymentLink.getCurrency();
        String iva = createPaymentLink.getIva();
        String redirectUrl = createPaymentLink.getRedirectUrl();
        String expirationDate = createPaymentLink.getExpirationDate();
        boolean sendEmail = createPaymentLink.getSendEmail();
        CustomerRequestDto customerRequestDtoMapToCustomerRequestDto = CustomerMapperKt.mapToCustomerRequestDto(createPaymentLink.getCustomer());
        String origin = tags.getOrigin();
        String productTypePL = tags.getProductTypePL();
        PaymentPlanLink paymentPlan = createPaymentLink.getPaymentPlan();
        return new CreatePaymentLinkRequestDto(strValueOf, description, orderId, currency, iva, origin, productTypePL, redirectUrl, expirationDate, sendEmail, customerRequestDtoMapToCustomerRequestDto, paymentPlan != null ? PaymentPlanMapperKt.mapToPaymentPlanRequestDto(paymentPlan) : null);
    }

    @NotNull
    public static final PaymentLink mapToLocalPaymentLink(@NotNull PaymentLinkResponseDto paymentLinkResponseDto) {
        Intrinsics.checkNotNullParameter(paymentLinkResponseDto, "<this>");
        String id = paymentLinkResponseDto.getId();
        double amount = paymentLinkResponseDto.getAmount();
        String description = paymentLinkResponseDto.getDescription();
        String orderId = paymentLinkResponseDto.getOrderId();
        String currency = paymentLinkResponseDto.getCurrency();
        String iva = paymentLinkResponseDto.getIva();
        PaymentLinkStatus paymentLinkStatusMapToLocalPaymentLinkStatus = mapToLocalPaymentLinkStatus(paymentLinkResponseDto.getStatus());
        String checkoutLink = paymentLinkResponseDto.getCheckoutLink();
        String creationDate = paymentLinkResponseDto.getCreationDate();
        String expirationDate = paymentLinkResponseDto.getExpirationDate();
        if (expirationDate == null) {
            expirationDate = "";
        }
        Customer customerMapToLocalCustomer = CustomerMapperKt.mapToLocalCustomer(paymentLinkResponseDto.getCustomer());
        TransactionResponseDto transaction = paymentLinkResponseDto.getTransaction();
        return new PaymentLink(id, amount, description, orderId, currency, iva, null, paymentLinkStatusMapToLocalPaymentLinkStatus, checkoutLink, creationDate, expirationDate, null, customerMapToLocalCustomer, null, transaction != null ? TransactionMapperKt.mapToLocalTransaction(transaction) : null, 10304, null);
    }

    @NotNull
    public static final List<PaymentLink> mapToLocalPaymentLinkList(@NotNull List<PaymentLinkResponseDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<PaymentLinkResponseDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLocalPaymentLink((PaymentLinkResponseDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final PaymentLinkStatus mapToLocalPaymentLinkStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        switch (upperCase.hashCode()) {
            case -1031784143:
                if (upperCase.equals("CANCELLED")) {
                    return PaymentLinkStatus.CANCELLED;
                }
                return null;
            case -591252731:
                if (upperCase.equals("EXPIRED")) {
                    return PaymentLinkStatus.EXPIRED;
                }
                return null;
            case 1691835182:
                if (upperCase.equals("PROCESSED")) {
                    return PaymentLinkStatus.PROCESSED;
                }
                return null;
            case 2052692649:
                if (upperCase.equals("AVAILABLE")) {
                    return PaymentLinkStatus.AVAILABLE;
                }
                return null;
            default:
                return null;
        }
    }

    @NotNull
    public static final UpdatePaymentLinkRequestDto mapToUpdatePaymentLinkRequestDto(@NotNull UpdatePaymentLink updatePaymentLink) {
        Intrinsics.checkNotNullParameter(updatePaymentLink, "<this>");
        String expirationDate = updatePaymentLink.getExpirationDate();
        Boolean sendEmail = updatePaymentLink.getSendEmail();
        return new UpdatePaymentLinkRequestDto(expirationDate, sendEmail != null ? sendEmail.booleanValue() : false);
    }
}
