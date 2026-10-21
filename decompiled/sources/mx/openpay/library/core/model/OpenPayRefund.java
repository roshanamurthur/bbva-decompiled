package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.noknok.android.client.appsdk.AppSDKException;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J¡\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\t\u00106\u001a\u000207HÖ\u0001J\u0013\u00108\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u000207HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u000207HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018¨\u0006B"}, d2 = {"Lmx/openpay/library/core/model/OpenPayRefund;", "Landroid/os/Parcelable;", "id", "", "operationDate", "authorization", PushConstants.AMOUNT, "", AppSDKException.KEY_OPERATION_TYPE, "method", "transactionType", "status", "conciliated", "", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "currency", Constants.creationDate, "description", "fee", "Lmx/openpay/library/core/model/OpenPayFee;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayFee;)V", "getAmount", "()D", "getAuthorization", "()Ljava/lang/String;", "getConciliated", "()Z", "getCreationDate", "getCurrency", "getCustomerId", "getDescription", "getFee", "()Lmx/openpay/library/core/model/OpenPayFee;", "getId", "getMethod", "getOperationDate", "getOperationType", "getStatus", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayRefund implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OpenPayRefund> CREATOR = new Creator();
    private final double amount;

    @NotNull
    private final String authorization;
    private final boolean conciliated;

    @Nullable
    private final String creationDate;

    @NotNull
    private final String currency;

    @NotNull
    private final String customerId;

    @Nullable
    private final String description;

    @Nullable
    private final OpenPayFee fee;

    @NotNull
    private final String id;

    @Nullable
    private final String method;

    @NotNull
    private final String operationDate;

    @Nullable
    private final String operationType;

    @NotNull
    private final String status;

    @Nullable
    private final String transactionType;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayRefund> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayRefund createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayRefund(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OpenPayFee.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayRefund[] newArray(int i10) {
            return new OpenPayRefund[i10];
        }
    }

    public OpenPayRefund(@NotNull String id, @NotNull String operationDate, @NotNull String authorization, double d2, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String status, boolean z10, @NotNull String customerId, @NotNull String currency, @Nullable String str4, @Nullable String str5, @Nullable OpenPayFee openPayFee) {
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
        this.fee = openPayFee;
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
    public final OpenPayFee getFee() {
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
    public final OpenPayRefund copy(@NotNull String id, @NotNull String operationDate, @NotNull String authorization, double amount, @Nullable String operationType, @Nullable String method, @Nullable String transactionType, @NotNull String status, boolean conciliated, @NotNull String customerId, @NotNull String currency, @Nullable String creationDate, @Nullable String description, @Nullable OpenPayFee fee) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new OpenPayRefund(id, operationDate, authorization, amount, operationType, method, transactionType, status, conciliated, customerId, currency, creationDate, description, fee);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayRefund)) {
            return false;
        }
        OpenPayRefund openPayRefund = (OpenPayRefund) other;
        return Intrinsics.areEqual(this.id, openPayRefund.id) && Intrinsics.areEqual(this.operationDate, openPayRefund.operationDate) && Intrinsics.areEqual(this.authorization, openPayRefund.authorization) && Double.compare(this.amount, openPayRefund.amount) == 0 && Intrinsics.areEqual(this.operationType, openPayRefund.operationType) && Intrinsics.areEqual(this.method, openPayRefund.method) && Intrinsics.areEqual(this.transactionType, openPayRefund.transactionType) && Intrinsics.areEqual(this.status, openPayRefund.status) && this.conciliated == openPayRefund.conciliated && Intrinsics.areEqual(this.customerId, openPayRefund.customerId) && Intrinsics.areEqual(this.currency, openPayRefund.currency) && Intrinsics.areEqual(this.creationDate, openPayRefund.creationDate) && Intrinsics.areEqual(this.description, openPayRefund.description) && Intrinsics.areEqual(this.fee, openPayRefund.fee);
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
    public final OpenPayFee getFee() {
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
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    public int hashCode() {
        int iA = a.a(this.authorization, a.a(this.operationDate, this.id.hashCode() * 31, 31), 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i10 = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + iA) * 31;
        String str = this.operationType;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.method;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transactionType;
        int iA2 = a.a(this.status, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        boolean z10 = this.conciliated;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iA3 = a.a(this.currency, a.a(this.customerId, (iA2 + r3) * 31, 31), 31);
        String str4 = this.creationDate;
        int iHashCode3 = (iA3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        OpenPayFee openPayFee = this.fee;
        return iHashCode4 + (openPayFee != null ? openPayFee.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.operationDate;
        String str3 = this.authorization;
        double d2 = this.amount;
        String str4 = this.operationType;
        String str5 = this.method;
        String str6 = this.transactionType;
        String str7 = this.status;
        boolean z10 = this.conciliated;
        String str8 = this.customerId;
        String str9 = this.currency;
        String str10 = this.creationDate;
        String str11 = this.description;
        OpenPayFee openPayFee = this.fee;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("OpenPayRefund(id=", str, ", operationDate=", str2, ", authorization=");
        sbC.append(str3);
        sbC.append(", amount=");
        sbC.append(d2);
        k.e(sbC, ", operationType=", str4, ", method=", str5);
        k.e(sbC, ", transactionType=", str6, ", status=", str7);
        sbC.append(", conciliated=");
        sbC.append(z10);
        sbC.append(", customerId=");
        sbC.append(str8);
        k.e(sbC, ", currency=", str9, ", creationDate=", str10);
        sbC.append(", description=");
        sbC.append(str11);
        sbC.append(", fee=");
        sbC.append(openPayFee);
        sbC.append(")");
        return sbC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.operationDate);
        parcel.writeString(this.authorization);
        parcel.writeDouble(this.amount);
        parcel.writeString(this.operationType);
        parcel.writeString(this.method);
        parcel.writeString(this.transactionType);
        parcel.writeString(this.status);
        parcel.writeInt(this.conciliated ? 1 : 0);
        parcel.writeString(this.customerId);
        parcel.writeString(this.currency);
        parcel.writeString(this.creationDate);
        parcel.writeString(this.description);
        OpenPayFee openPayFee = this.fee;
        if (openPayFee == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            openPayFee.writeToParcel(parcel, flags);
        }
    }
}
