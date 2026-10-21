package mx.openpay.library.domain.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.noknok.android.client.appsdk.AppSDKException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.eglobal.Fee;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Refund.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bL\u0010MJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J¡\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\t\u0010#\u001a\u00020\u0002HÖ\u0001J\t\u0010%\u001a\u00020$HÖ\u0001J\u0013\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b9\u0010+R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u0010+R\u0017\u0010\u001c\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010)\u001a\u0004\bA\u0010+R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010)\u001a\u0004\bC\u0010+R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010)\u001a\u0004\bE\u0010+R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010)\u001a\u0004\bG\u0010+R\u0019\u0010!\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lmx/openpay/library/domain/model/Refund;", "", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", "", "component9", "component10", "component11", "component12", "component13", "Lmx/openpay/library/domain/model/eglobal/Fee;", "component14", "id", "operationDate", "authorization", PushConstants.AMOUNT, AppSDKException.KEY_OPERATION_TYPE, "method", "transactionType", "status", "conciliated", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "currency", Constants.creationDate, "description", "fee", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getOperationDate", "c", "getAuthorization", "d", "D", "getAmount", "()D", "e", "getOperationType", "f", "getMethod", "g", "getTransactionType", "h", "getStatus", "i", "Z", "getConciliated", "()Z", "j", "getCustomerId", "k", "getCurrency", "l", "getCreationDate", "m", "getDescription", "n", "Lmx/openpay/library/domain/model/eglobal/Fee;", "getFee", "()Lmx/openpay/library/domain/model/eglobal/Fee;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/Fee;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Refund {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String operationDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String authorization;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final double amount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String operationType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String method;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String transactionType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String status;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final boolean conciliated;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String customerId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currency;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String creationDate;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final String description;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Fee fee;

    public Refund(@NotNull String id, @NotNull String operationDate, @NotNull String authorization, double d2, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String status, boolean z10, @NotNull String customerId, @NotNull String currency, @Nullable String str4, @Nullable String str5, @Nullable Fee fee) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.id = id;
        this.operationDate = operationDate;
        this.authorization = authorization;
        this.amount = d2;
        this.operationType = str;
        this.method = str2;
        this.transactionType = str3;
        this.status = status;
        this.conciliated = z10;
        this.customerId = customerId;
        this.currency = currency;
        this.creationDate = str4;
        this.description = str5;
        this.fee = fee;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCreationDate() {
        return this.creationDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Fee getFee() {
        return this.fee;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOperationDate() {
        return this.operationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOperationType() {
        return this.operationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getConciliated() {
        return this.conciliated;
    }

    @NotNull
    public final Refund copy(@NotNull String id, @NotNull String operationDate, @NotNull String authorization, double amount, @Nullable String operationType, @Nullable String method, @Nullable String transactionType, @NotNull String status, boolean conciliated, @NotNull String customerId, @NotNull String currency, @Nullable String creationDate, @Nullable String description, @Nullable Fee fee) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new Refund(id, operationDate, authorization, amount, operationType, method, transactionType, status, conciliated, customerId, currency, creationDate, description, fee);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Refund)) {
            return false;
        }
        Refund refund = (Refund) other;
        return Intrinsics.areEqual(this.id, refund.id) && Intrinsics.areEqual(this.operationDate, refund.operationDate) && Intrinsics.areEqual(this.authorization, refund.authorization) && Double.compare(this.amount, refund.amount) == 0 && Intrinsics.areEqual(this.operationType, refund.operationType) && Intrinsics.areEqual(this.method, refund.method) && Intrinsics.areEqual(this.transactionType, refund.transactionType) && Intrinsics.areEqual(this.status, refund.status) && this.conciliated == refund.conciliated && Intrinsics.areEqual(this.customerId, refund.customerId) && Intrinsics.areEqual(this.currency, refund.currency) && Intrinsics.areEqual(this.creationDate, refund.creationDate) && Intrinsics.areEqual(this.description, refund.description) && Intrinsics.areEqual(this.fee, refund.fee);
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getAuthorization() {
        return this.authorization;
    }

    public final boolean getConciliated() {
        return this.conciliated;
    }

    @Nullable
    public final String getCreationDate() {
        return this.creationDate;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Fee getFee() {
        return this.fee;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final String getOperationDate() {
        return this.operationDate;
    }

    @Nullable
    public final String getOperationType() {
        return this.operationType;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTransactionType() {
        return this.transactionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v26 */
    public int hashCode() {
        int iC = n1.c(this.authorization, n1.c(this.operationDate, this.id.hashCode() * 31, 31), 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i10 = (iC + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        String str = this.operationType;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.method;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transactionType;
        int iC2 = n1.c(this.status, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        boolean z10 = this.conciliated;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iC3 = n1.c(this.currency, n1.c(this.customerId, (iC2 + r3) * 31, 31), 31);
        String str4 = this.creationDate;
        int iHashCode3 = (iC3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Fee fee = this.fee;
        return iHashCode4 + (fee != null ? fee.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Refund(id=" + this.id + ", operationDate=" + this.operationDate + ", authorization=" + this.authorization + ", amount=" + this.amount + ", operationType=" + this.operationType + ", method=" + this.method + ", transactionType=" + this.transactionType + ", status=" + this.status + ", conciliated=" + this.conciliated + ", customerId=" + this.customerId + ", currency=" + this.currency + ", creationDate=" + this.creationDate + ", description=" + this.description + ", fee=" + this.fee + ")";
    }
}
