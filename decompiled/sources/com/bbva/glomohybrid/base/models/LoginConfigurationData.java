package com.bbva.glomohybrid.base.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.i;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingEnterpriseProfileConditionFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginConfigurationData.kt */
/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u0006\u0010\u0003\u001a\u00020\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003Ja\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\u0019\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u000f\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b\u0012\u0010'R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010'R\u0011\u00102\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u0010$R\u0011\u00104\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b3\u0010$¨\u00067"}, d2 = {"Lcom/bbva/glomohybrid/base/models/LoginConfigurationData;", "Landroid/os/Parcelable;", "", "isNotEmpty", "", "component3", "component4", "component5", "Lcom/bbva/glomo/user/domain/model/UserType;", "component6", "component7", "component8", "user", "document", "userLastName", LocalStorageConstantsKt.IS_BUSINESS_USER_KEY, CustomerIdInterceptor.FAKE_CUSTOMER_ID, "userType", LandingEnterpriseProfileConditionFilter.ID, "simplifiedView", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "r0", "Ljava/lang/String;", "getUserLastName", "()Ljava/lang/String;", "s0", "Z", "()Z", "t0", "getCustomerId", "u0", "Lcom/bbva/glomo/user/domain/model/UserType;", "getUserType", "()Lcom/bbva/glomo/user/domain/model/UserType;", "v0", "w0", "getSimplifiedView", "getUserName", "userName", "getUserDocument", "userDocument", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/bbva/glomo/user/domain/model/UserType;ZZ)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LoginConfigurationData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoginConfigurationData> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final String f31444p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final String f31445q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String userLastName;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final boolean isBusinessUser;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String customerId;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UserType userType;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public final boolean isEnterpriseProfileAvailable;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public final boolean simplifiedView;

    /* JADX INFO: compiled from: LoginConfigurationData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LoginConfigurationData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LoginConfigurationData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoginConfigurationData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), UserType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LoginConfigurationData[] newArray(int i10) {
            return new LoginConfigurationData[i10];
        }
    }

    public LoginConfigurationData() {
        this(null, null, null, false, null, null, false, false, 255, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserLastName() {
        return this.userLastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsBusinessUser() {
        return this.isBusinessUser;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserType getUserType() {
        return this.userType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsEnterpriseProfileAvailable() {
        return this.isEnterpriseProfileAvailable;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSimplifiedView() {
        return this.simplifiedView;
    }

    @NotNull
    public final LoginConfigurationData copy(@Nullable String user, @Nullable String document, @Nullable String userLastName, boolean isBusinessUser, @Nullable String customerId, @NotNull UserType userType, boolean isEnterpriseProfileAvailable, boolean simplifiedView) {
        Intrinsics.checkNotNullParameter(userType, "userType");
        return new LoginConfigurationData(user, document, userLastName, isBusinessUser, customerId, userType, isEnterpriseProfileAvailable, simplifiedView);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginConfigurationData)) {
            return false;
        }
        LoginConfigurationData loginConfigurationData = (LoginConfigurationData) other;
        return Intrinsics.areEqual(this.f31444p0, loginConfigurationData.f31444p0) && Intrinsics.areEqual(this.f31445q0, loginConfigurationData.f31445q0) && Intrinsics.areEqual(this.userLastName, loginConfigurationData.userLastName) && this.isBusinessUser == loginConfigurationData.isBusinessUser && Intrinsics.areEqual(this.customerId, loginConfigurationData.customerId) && this.userType == loginConfigurationData.userType && this.isEnterpriseProfileAvailable == loginConfigurationData.isEnterpriseProfileAvailable && this.simplifiedView == loginConfigurationData.simplifiedView;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    public final boolean getSimplifiedView() {
        return this.simplifiedView;
    }

    @NotNull
    public final String getUserDocument() {
        String str = this.f31445q0;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getUserLastName() {
        return this.userLastName;
    }

    @NotNull
    public final String getUserName() {
        String str = this.f31444p0;
        return str == null ? "" : str;
    }

    @NotNull
    public final UserType getUserType() {
        return this.userType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        String str = this.f31444p0;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31445q0;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userLastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z10 = this.isBusinessUser;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iHashCode3 + r3) * 31;
        String str4 = this.customerId;
        int iHashCode4 = (this.userType.hashCode() + ((i10 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31;
        boolean z11 = this.isEnterpriseProfileAvailable;
        ?? r1 = z11;
        if (z11) {
            r1 = 1;
        }
        int i11 = (iHashCode4 + r1) * 31;
        boolean z12 = this.simplifiedView;
        return i11 + (z12 ? 1 : z12);
    }

    public final boolean isBusinessUser() {
        return this.isBusinessUser;
    }

    public final boolean isEnterpriseProfileAvailable() {
        return this.isEnterpriseProfileAvailable;
    }

    public final boolean isNotEmpty() {
        return this.f31444p0 != null;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoginConfigurationData(user=");
        sb2.append(this.f31444p0);
        sb2.append(", document=");
        sb2.append(this.f31445q0);
        sb2.append(", userLastName=");
        sb2.append(this.userLastName);
        sb2.append(", isBusinessUser=");
        sb2.append(this.isBusinessUser);
        sb2.append(", customerId=");
        sb2.append(this.customerId);
        sb2.append(", userType=");
        sb2.append(this.userType);
        sb2.append(", isEnterpriseProfileAvailable=");
        sb2.append(this.isEnterpriseProfileAvailable);
        sb2.append(", simplifiedView=");
        return i.c(sb2, this.simplifiedView, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f31444p0);
        parcel.writeString(this.f31445q0);
        parcel.writeString(this.userLastName);
        parcel.writeInt(this.isBusinessUser ? 1 : 0);
        parcel.writeString(this.customerId);
        parcel.writeString(this.userType.name());
        parcel.writeInt(this.isEnterpriseProfileAvailable ? 1 : 0);
        parcel.writeInt(this.simplifiedView ? 1 : 0);
    }

    public LoginConfigurationData(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @Nullable String str4, @NotNull UserType userType, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(userType, "userType");
        this.f31444p0 = str;
        this.f31445q0 = str2;
        this.userLastName = str3;
        this.isBusinessUser = z10;
        this.customerId = str4;
        this.userType = userType;
        this.isEnterpriseProfileAvailable = z11;
        this.simplifiedView = z12;
    }

    public /* synthetic */ LoginConfigurationData(String str, String str2, String str3, boolean z10, String str4, UserType userType, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) == 0 ? str4 : null, (i10 & 32) != 0 ? UserType.PERSONAL : userType, (i10 & 64) != 0 ? false : z11, (i10 & 128) == 0 ? z12 : false);
    }
}
