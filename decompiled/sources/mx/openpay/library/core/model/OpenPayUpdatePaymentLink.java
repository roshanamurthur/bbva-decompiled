package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J3\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010'R\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00060"}, d2 = {"Lmx/openpay/library/core/model/OpenPayUpdatePaymentLink;", "Landroid/os/Parcelable;", "", "component1", "Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;", "component2", "component3", "", "component4", "id", "status", "expirationDate", "sendEmail", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "q0", "Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;", "getStatus", "()Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;", "setStatus", "(Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;)V", "r0", "getExpirationDate", "setExpirationDate", "(Ljava/lang/String;)V", "s0", "Z", "getSendEmail", "()Z", "setSendEmail", "(Z)V", "<init>", "(Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;Ljava/lang/String;Z)V", "library_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OpenPayUpdatePaymentLink implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OpenPayUpdatePaymentLink> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public OpenPayPaymentLinkStatus status;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String expirationDate;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public boolean sendEmail;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayUpdatePaymentLink> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayUpdatePaymentLink createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayUpdatePaymentLink(parcel.readString(), parcel.readInt() == 0 ? null : OpenPayPaymentLinkStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayUpdatePaymentLink[] newArray(int i10) {
            return new OpenPayUpdatePaymentLink[i10];
        }
    }

    public OpenPayUpdatePaymentLink(@NotNull String id, @Nullable OpenPayPaymentLinkStatus openPayPaymentLinkStatus, @NotNull String expirationDate, boolean z10) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.id = id;
        this.status = openPayPaymentLinkStatus;
        this.expirationDate = expirationDate;
        this.sendEmail = z10;
    }

    public static /* synthetic */ OpenPayUpdatePaymentLink copy$default(OpenPayUpdatePaymentLink openPayUpdatePaymentLink, String str, OpenPayPaymentLinkStatus openPayPaymentLinkStatus, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = openPayUpdatePaymentLink.id;
        }
        if ((i10 & 2) != 0) {
            openPayPaymentLinkStatus = openPayUpdatePaymentLink.status;
        }
        if ((i10 & 4) != 0) {
            str2 = openPayUpdatePaymentLink.expirationDate;
        }
        if ((i10 & 8) != 0) {
            z10 = openPayUpdatePaymentLink.sendEmail;
        }
        return openPayUpdatePaymentLink.copy(str, openPayPaymentLinkStatus, str2, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OpenPayPaymentLinkStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    @NotNull
    public final OpenPayUpdatePaymentLink copy(@NotNull String id, @Nullable OpenPayPaymentLinkStatus status, @NotNull String expirationDate, boolean sendEmail) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        return new OpenPayUpdatePaymentLink(id, status, expirationDate, sendEmail);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayUpdatePaymentLink)) {
            return false;
        }
        OpenPayUpdatePaymentLink openPayUpdatePaymentLink = (OpenPayUpdatePaymentLink) other;
        return Intrinsics.areEqual(this.id, openPayUpdatePaymentLink.id) && this.status == openPayUpdatePaymentLink.status && Intrinsics.areEqual(this.expirationDate, openPayUpdatePaymentLink.expirationDate) && this.sendEmail == openPayUpdatePaymentLink.sendEmail;
    }

    @NotNull
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    @Nullable
    public final OpenPayPaymentLinkStatus getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        OpenPayPaymentLinkStatus openPayPaymentLinkStatus = this.status;
        int iA = a.a(this.expirationDate, (iHashCode + (openPayPaymentLinkStatus == null ? 0 : openPayPaymentLinkStatus.hashCode())) * 31, 31);
        boolean z10 = this.sendEmail;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iA + r1;
    }

    public final void setExpirationDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expirationDate = str;
    }

    public final void setSendEmail(boolean z10) {
        this.sendEmail = z10;
    }

    public final void setStatus(@Nullable OpenPayPaymentLinkStatus openPayPaymentLinkStatus) {
        this.status = openPayPaymentLinkStatus;
    }

    @NotNull
    public String toString() {
        return "OpenPayUpdatePaymentLink(id=" + this.id + ", status=" + this.status + ", expirationDate=" + this.expirationDate + ", sendEmail=" + this.sendEmail + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        OpenPayPaymentLinkStatus openPayPaymentLinkStatus = this.status;
        if (openPayPaymentLinkStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(openPayPaymentLinkStatus.name());
        }
        parcel.writeString(this.expirationDate);
        parcel.writeInt(this.sendEmail ? 1 : 0);
    }

    public /* synthetic */ OpenPayUpdatePaymentLink(String str, OpenPayPaymentLinkStatus openPayPaymentLinkStatus, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : openPayPaymentLinkStatus, str2, z10);
    }
}
