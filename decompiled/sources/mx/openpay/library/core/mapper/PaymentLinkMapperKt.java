package mx.openpay.library.core.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.model.OpenPayCreatePaymentLink;
import mx.openpay.library.core.model.OpenPayCustomer;
import mx.openpay.library.core.model.OpenPayPaymentLink;
import mx.openpay.library.core.model.OpenPayPaymentLinkStatus;
import mx.openpay.library.core.model.OpenPayUpdatePaymentLink;
import mx.openpay.library.domain.model.eglobal.PaymentPlanLink;
import mx.openpay.library.domain.model.eglobal.PaymentType;
import mx.openpay.library.domain.model.link.CreatePaymentLink;
import mx.openpay.library.domain.model.link.PaymentLink;
import mx.openpay.library.domain.model.link.PaymentLinkStatus;
import mx.openpay.library.domain.model.link.UpdatePaymentLink;
import mx.openpay.library.domain.model.transaction.Transaction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\b0\u0006\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\t\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\n\u001a\n\u0010\u0005\u001a\u00020\u0007*\u00020\b¨\u0006\u000b"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/link/CreatePaymentLink;", "Lmx/openpay/library/core/model/OpenPayCreatePaymentLink;", "Lmx/openpay/library/domain/model/link/UpdatePaymentLink;", "Lmx/openpay/library/core/model/OpenPayUpdatePaymentLink;", "mapToLibraryModel", "", "Lmx/openpay/library/core/model/OpenPayPaymentLink;", "Lmx/openpay/library/domain/model/link/PaymentLink;", "Lmx/openpay/library/core/model/PaymentLink;", "Lmx/openpay/library/core/model/extra/UpdatePaymentLink;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaymentLinkMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLinkMapper.kt\nmx/openpay/library/core/mapper/PaymentLinkMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1549#2:77\n1620#2,3:78\n*S KotlinDebug\n*F\n+ 1 PaymentLinkMapper.kt\nmx/openpay/library/core/mapper/PaymentLinkMapperKt\n*L\n53#1:77\n53#1:78,3\n*E\n"})
public final class PaymentLinkMapperKt {
    @NotNull
    public static final CreatePaymentLink mapToDomainModel(@NotNull OpenPayCreatePaymentLink openPayCreatePaymentLink) {
        Intrinsics.checkNotNullParameter(openPayCreatePaymentLink, "<this>");
        return new CreatePaymentLink(openPayCreatePaymentLink.getAmount(), openPayCreatePaymentLink.getDescription(), openPayCreatePaymentLink.getOrderId(), openPayCreatePaymentLink.getCurrency(), openPayCreatePaymentLink.getIva(), openPayCreatePaymentLink.getRedirectUrl(), openPayCreatePaymentLink.getExpirationDate(), openPayCreatePaymentLink.getSendEmail(), CustomerMapperKt.mapToDomainModel(openPayCreatePaymentLink.getCustomer()), openPayCreatePaymentLink.getPlan().isEmpty() ^ true ? new PaymentPlanLink(CollectionsKt___CollectionsKt.joinToString$default(openPayCreatePaymentLink.getPlan(), ",", null, null, 0, null, null, 62, null), PaymentType.WITHOUT_INTEREST) : null);
    }

    @NotNull
    public static final List<OpenPayPaymentLink> mapToLibraryModel(@NotNull List<PaymentLink> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLibraryModel((PaymentLink) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final UpdatePaymentLink mapToDomainModel(@NotNull OpenPayUpdatePaymentLink openPayUpdatePaymentLink) {
        Intrinsics.checkNotNullParameter(openPayUpdatePaymentLink, "<this>");
        String id = openPayUpdatePaymentLink.getId();
        OpenPayPaymentLinkStatus status = openPayUpdatePaymentLink.getStatus();
        return new UpdatePaymentLink(id, status != null ? PaymentLinkStatusMapperKt.mapToDomainModel(status) : null, openPayUpdatePaymentLink.getExpirationDate(), Boolean.valueOf(openPayUpdatePaymentLink.getSendEmail()));
    }

    @NotNull
    public static final OpenPayCreatePaymentLink mapToLibraryModel(@NotNull mx.openpay.library.core.model.PaymentLink paymentLink) {
        Intrinsics.checkNotNullParameter(paymentLink, "<this>");
        return new OpenPayCreatePaymentLink(paymentLink.getAmount(), paymentLink.getDescription(), paymentLink.getOrderId(), paymentLink.getCurrency(), paymentLink.getIva(), paymentLink.getRedirectUrl(), paymentLink.getExpirationDate(), paymentLink.getSendEmail(), paymentLink.getCustomer(), paymentLink.getPlan());
    }

    @NotNull
    public static final OpenPayPaymentLink mapToLibraryModel(@NotNull PaymentLink paymentLink) {
        Intrinsics.checkNotNullParameter(paymentLink, "<this>");
        String id = paymentLink.getId();
        double amount = paymentLink.getAmount();
        String description = paymentLink.getDescription();
        String orderId = paymentLink.getOrderId();
        String currency = paymentLink.getCurrency();
        String iva = paymentLink.getIva();
        String redirectUrl = paymentLink.getRedirectUrl();
        PaymentLinkStatus status = paymentLink.getStatus();
        OpenPayPaymentLinkStatus openPayPaymentLinkStatusMapToLibraryModel = status != null ? PaymentLinkStatusMapperKt.mapToLibraryModel(status) : null;
        String checkoutLink = paymentLink.getCheckoutLink();
        String creationDate = paymentLink.getCreationDate();
        String expirationDate = paymentLink.getExpirationDate();
        Boolean sendEmail = paymentLink.getSendEmail();
        boolean zBooleanValue = sendEmail != null ? sendEmail.booleanValue() : false;
        OpenPayCustomer openPayCustomerMapToLibraryModel = CustomerMapperKt.mapToLibraryModel(paymentLink.getCustomer());
        Integer plan = paymentLink.getPlan();
        Transaction transaction = paymentLink.getTransaction();
        return new OpenPayPaymentLink(id, amount, description, orderId, currency, iva, redirectUrl, openPayPaymentLinkStatusMapToLibraryModel, checkoutLink, creationDate, expirationDate, zBooleanValue, openPayCustomerMapToLibraryModel, plan, transaction != null ? TransactionMapperKt.mapToLibraryModel(transaction) : null);
    }

    @NotNull
    public static final OpenPayUpdatePaymentLink mapToLibraryModel(@NotNull mx.openpay.library.core.model.extra.UpdatePaymentLink updatePaymentLink) {
        Intrinsics.checkNotNullParameter(updatePaymentLink, "<this>");
        return new OpenPayUpdatePaymentLink(updatePaymentLink.getId(), PaymentLinkStatusMapperKt.mapStringToStatusLibraryModel(updatePaymentLink.getStatus()), updatePaymentLink.getExpirationDate(), updatePaymentLink.getSendEmail());
    }
}
