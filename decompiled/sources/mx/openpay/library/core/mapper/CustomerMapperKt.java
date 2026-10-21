package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayCustomer;
import mx.openpay.library.domain.model.link.Customer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/link/Customer;", "Lmx/openpay/library/core/model/OpenPayCustomer;", "mapToLibraryModel", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CustomerMapperKt {
    @NotNull
    public static final Customer mapToDomainModel(@NotNull OpenPayCustomer openPayCustomer) {
        Intrinsics.checkNotNullParameter(openPayCustomer, "<this>");
        return new Customer(openPayCustomer.getName(), openPayCustomer.getEmail(), openPayCustomer.getLastName(), openPayCustomer.getPhoneNumber(), openPayCustomer.getExternalId());
    }

    @NotNull
    public static final OpenPayCustomer mapToLibraryModel(@NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(customer, "<this>");
        return new OpenPayCustomer(customer.getName(), customer.getEmail(), customer.getLastName(), customer.getPhoneNumber(), customer.getExternalId());
    }
}
