package mx.openpay.library.domain.model.link;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Customer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003JA\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lmx/openpay/library/domain/model/link/Customer;", "", "", "component1", "component2", "component3", "component4", "component5", "name", "email", CustomerLoginsParser.LAST_NAME, "phoneNumber", "externalId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getEmail", "c", "getLastName", "d", "getPhoneNumber", "e", "getExternalId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Customer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String lastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String phoneNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String externalId;

    public Customer(@NotNull String name, @NotNull String email, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        this.name = name;
        this.email = email;
        this.lastName = str;
        this.phoneNumber = str2;
        this.externalId = str3;
    }

    public static /* synthetic */ Customer copy$default(Customer customer, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customer.name;
        }
        if ((i10 & 2) != 0) {
            str2 = customer.email;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = customer.lastName;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = customer.phoneNumber;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = customer.externalId;
        }
        return customer.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    @NotNull
    public final Customer copy(@NotNull String name, @NotNull String email, @Nullable String lastName, @Nullable String phoneNumber, @Nullable String externalId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        return new Customer(name, email, lastName, phoneNumber, externalId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) other;
        return Intrinsics.areEqual(this.name, customer.name) && Intrinsics.areEqual(this.email, customer.email) && Intrinsics.areEqual(this.lastName, customer.lastName) && Intrinsics.areEqual(this.phoneNumber, customer.phoneNumber) && Intrinsics.areEqual(this.externalId, customer.externalId);
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        int iC = n1.c(this.email, this.name.hashCode() * 31, 31);
        String str = this.lastName;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.externalId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Customer(name=");
        sb2.append(this.name);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", lastName=");
        sb2.append(this.lastName);
        sb2.append(", phoneNumber=");
        sb2.append(this.phoneNumber);
        sb2.append(", externalId=");
        return d.f(sb2, this.externalId, ")");
    }
}
