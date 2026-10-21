package mx.openpay.library.data.datasource.remote.model.request.paymentlink;

import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.parser.a;
import com.adobe.marketing.mobile.UserProfileKeyConstants;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/paymentlink/CustomerRequestDto;", "", "name", "", CustomerLoginsParser.LAST_NAME, "phoneNumber", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getLastName", "getName", "getPhoneNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CustomerRequestDto {

    @SerializedName("email")
    @NotNull
    private final String email;

    @SerializedName(UserProfileKeyConstants.LAST_NAME)
    @Nullable
    private final String lastName;

    @SerializedName("name")
    @NotNull
    private final String name;

    @SerializedName("phone_number")
    @Nullable
    private final String phoneNumber;

    public CustomerRequestDto(@NotNull String name, @Nullable String str, @Nullable String str2, @NotNull String email) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        this.name = name;
        this.lastName = str;
        this.phoneNumber = str2;
        this.email = email;
    }

    public static /* synthetic */ CustomerRequestDto copy$default(CustomerRequestDto customerRequestDto, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customerRequestDto.name;
        }
        if ((i10 & 2) != 0) {
            str2 = customerRequestDto.lastName;
        }
        if ((i10 & 4) != 0) {
            str3 = customerRequestDto.phoneNumber;
        }
        if ((i10 & 8) != 0) {
            str4 = customerRequestDto.email;
        }
        return customerRequestDto.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final CustomerRequestDto copy(@NotNull String name, @Nullable String lastName, @Nullable String phoneNumber, @NotNull String email) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        return new CustomerRequestDto(name, lastName, phoneNumber, email);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerRequestDto)) {
            return false;
        }
        CustomerRequestDto customerRequestDto = (CustomerRequestDto) other;
        return Intrinsics.areEqual(this.name, customerRequestDto.name) && Intrinsics.areEqual(this.lastName, customerRequestDto.lastName) && Intrinsics.areEqual(this.phoneNumber, customerRequestDto.phoneNumber) && Intrinsics.areEqual(this.email, customerRequestDto.email);
    }

    @NotNull
    public final String getEmail() {
        return this.email;
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
        int iHashCode = this.name.hashCode() * 31;
        String str = this.lastName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneNumber;
        return this.email.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.lastName;
        return c.b(a.c("CustomerRequestDto(name=", str, ", lastName=", str2, ", phoneNumber="), this.phoneNumber, ", email=", this.email, ")");
    }
}
