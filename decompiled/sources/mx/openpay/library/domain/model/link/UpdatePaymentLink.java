package mx.openpay.library.domain.model.link;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentLink.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ<\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\t¨\u0006$"}, d2 = {"Lmx/openpay/library/domain/model/link/UpdatePaymentLink;", "", "", "component1", "Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "component2", "component3", "", "component4", "()Ljava/lang/Boolean;", "id", "status", "expirationDate", "sendEmail", "copy", "(Ljava/lang/String;Lmx/openpay/library/domain/model/link/PaymentLinkStatus;Ljava/lang/String;Ljava/lang/Boolean;)Lmx/openpay/library/domain/model/link/UpdatePaymentLink;", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "getStatus", "()Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "c", "getExpirationDate", "d", "Ljava/lang/Boolean;", "getSendEmail", "<init>", "(Ljava/lang/String;Lmx/openpay/library/domain/model/link/PaymentLinkStatus;Ljava/lang/String;Ljava/lang/Boolean;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class UpdatePaymentLink {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PaymentLinkStatus status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String expirationDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean sendEmail;

    public UpdatePaymentLink(@NotNull String id, @Nullable PaymentLinkStatus paymentLinkStatus, @NotNull String expirationDate, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.id = id;
        this.status = paymentLinkStatus;
        this.expirationDate = expirationDate;
        this.sendEmail = bool;
    }

    public static /* synthetic */ UpdatePaymentLink copy$default(UpdatePaymentLink updatePaymentLink, String str, PaymentLinkStatus paymentLinkStatus, String str2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updatePaymentLink.id;
        }
        if ((i10 & 2) != 0) {
            paymentLinkStatus = updatePaymentLink.status;
        }
        if ((i10 & 4) != 0) {
            str2 = updatePaymentLink.expirationDate;
        }
        if ((i10 & 8) != 0) {
            bool = updatePaymentLink.sendEmail;
        }
        return updatePaymentLink.copy(str, paymentLinkStatus, str2, bool);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentLinkStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSendEmail() {
        return this.sendEmail;
    }

    @NotNull
    public final UpdatePaymentLink copy(@NotNull String id, @Nullable PaymentLinkStatus status, @NotNull String expirationDate, @Nullable Boolean sendEmail) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        return new UpdatePaymentLink(id, status, expirationDate, sendEmail);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePaymentLink)) {
            return false;
        }
        UpdatePaymentLink updatePaymentLink = (UpdatePaymentLink) other;
        return Intrinsics.areEqual(this.id, updatePaymentLink.id) && this.status == updatePaymentLink.status && Intrinsics.areEqual(this.expirationDate, updatePaymentLink.expirationDate) && Intrinsics.areEqual(this.sendEmail, updatePaymentLink.sendEmail);
    }

    @NotNull
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getSendEmail() {
        return this.sendEmail;
    }

    @Nullable
    public final PaymentLinkStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        PaymentLinkStatus paymentLinkStatus = this.status;
        int iC = n1.c(this.expirationDate, (iHashCode + (paymentLinkStatus == null ? 0 : paymentLinkStatus.hashCode())) * 31, 31);
        Boolean bool = this.sendEmail;
        return iC + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UpdatePaymentLink(id=" + this.id + ", status=" + this.status + ", expirationDate=" + this.expirationDate + ", sendEmail=" + this.sendEmail + ")";
    }

    public /* synthetic */ UpdatePaymentLink(String str, PaymentLinkStatus paymentLinkStatus, String str2, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : paymentLinkStatus, str2, (i10 & 8) != 0 ? null : bool);
    }
}
