package mx.openpay.library.core.model;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, d2 = {"Lmx/openpay/library/core/model/OpenPayCustomer;", "Landroid/os/Parcelable;", "name", "", "email", CustomerLoginsParser.LAST_NAME, "phoneNumber", "externalId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getExternalId", "getLastName", "getName", "getPhoneNumber", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayCustomer implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OpenPayCustomer> CREATOR = new Creator();

    @NotNull
    private final String email;

    @Nullable
    private final String externalId;

    @Nullable
    private final String lastName;

    @NotNull
    private final String name;

    @Nullable
    private final String phoneNumber;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayCustomer> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayCustomer createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayCustomer(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayCustomer[] newArray(int i10) {
            return new OpenPayCustomer[i10];
        }
    }

    public OpenPayCustomer(@NotNull String name, @NotNull String email, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        this.name = name;
        this.email = email;
        this.lastName = str;
        this.phoneNumber = str2;
        this.externalId = str3;
    }

    public static /* synthetic */ OpenPayCustomer copy$default(OpenPayCustomer openPayCustomer, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = openPayCustomer.name;
        }
        if ((i10 & 2) != 0) {
            str2 = openPayCustomer.email;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = openPayCustomer.lastName;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = openPayCustomer.phoneNumber;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = openPayCustomer.externalId;
        }
        return openPayCustomer.copy(str, str6, str7, str8, str5);
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
    public final OpenPayCustomer copy(@NotNull String name, @NotNull String email, @Nullable String lastName, @Nullable String phoneNumber, @Nullable String externalId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        return new OpenPayCustomer(name, email, lastName, phoneNumber, externalId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayCustomer)) {
            return false;
        }
        OpenPayCustomer openPayCustomer = (OpenPayCustomer) other;
        return Intrinsics.areEqual(this.name, openPayCustomer.name) && Intrinsics.areEqual(this.email, openPayCustomer.email) && Intrinsics.areEqual(this.lastName, openPayCustomer.lastName) && Intrinsics.areEqual(this.phoneNumber, openPayCustomer.phoneNumber) && Intrinsics.areEqual(this.externalId, openPayCustomer.externalId);
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
        int iA = a.a(this.email, this.name.hashCode() * 31, 31);
        String str = this.lastName;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.externalId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.email;
        String str3 = this.lastName;
        String str4 = this.phoneNumber;
        String str5 = this.externalId;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("OpenPayCustomer(name=", str, ", email=", str2, ", lastName=");
        k.e(sbC, str3, ", phoneNumber=", str4, ", externalId=");
        return d.f(sbC, str5, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.email);
        parcel.writeString(this.lastName);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.externalId);
    }

    public /* synthetic */ OpenPayCustomer(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
