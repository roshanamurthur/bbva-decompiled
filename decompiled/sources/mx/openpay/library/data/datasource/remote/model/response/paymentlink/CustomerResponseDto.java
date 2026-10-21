package mx.openpay.library.data.datasource.remote.model.response.paymentlink;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.adobe.marketing.mobile.UserProfileKeyConstants;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/paymentlink/CustomerResponseDto;", "", "name", "", "email", CustomerLoginsParser.LAST_NAME, "phoneNumber", "externalId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getExternalId", "getLastName", "getName", "getPhoneNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CustomerResponseDto {

    @SerializedName("email")
    @NotNull
    private final String email;

    @SerializedName("external_id")
    @Nullable
    private final String externalId;

    @SerializedName(UserProfileKeyConstants.LAST_NAME)
    @NotNull
    private final String lastName;

    @SerializedName("name")
    @NotNull
    private final String name;

    @SerializedName("phone_number")
    @NotNull
    private final String phoneNumber;

    public CustomerResponseDto(@NotNull String name, @NotNull String email, @NotNull String lastName, @NotNull String phoneNumber, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.externalId = str;
    }

    public static /* synthetic */ CustomerResponseDto copy$default(CustomerResponseDto customerResponseDto, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customerResponseDto.name;
        }
        if ((i10 & 2) != 0) {
            str2 = customerResponseDto.email;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = customerResponseDto.lastName;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = customerResponseDto.phoneNumber;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = customerResponseDto.externalId;
        }
        return customerResponseDto.copy(str, str6, str7, str8, str5);
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

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
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
    public final CustomerResponseDto copy(@NotNull String name, @NotNull String email, @NotNull String lastName, @NotNull String phoneNumber, @Nullable String externalId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return new CustomerResponseDto(name, email, lastName, phoneNumber, externalId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerResponseDto)) {
            return false;
        }
        CustomerResponseDto customerResponseDto = (CustomerResponseDto) other;
        return Intrinsics.areEqual(this.name, customerResponseDto.name) && Intrinsics.areEqual(this.email, customerResponseDto.email) && Intrinsics.areEqual(this.lastName, customerResponseDto.lastName) && Intrinsics.areEqual(this.phoneNumber, customerResponseDto.phoneNumber) && Intrinsics.areEqual(this.externalId, customerResponseDto.externalId);
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getExternalId() {
        return this.externalId;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        int iC = n1.c(this.phoneNumber, n1.c(this.lastName, n1.c(this.email, this.name.hashCode() * 31, 31), 31), 31);
        String str = this.externalId;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.email;
        String str3 = this.lastName;
        String str4 = this.phoneNumber;
        String str5 = this.externalId;
        StringBuilder sbC = a.c("CustomerResponseDto(name=", str, ", email=", str2, ", lastName=");
        k.e(sbC, str3, ", phoneNumber=", str4, ", externalId=");
        return d.f(sbC, str5, ")");
    }

    public /* synthetic */ CustomerResponseDto(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, str5);
    }
}
