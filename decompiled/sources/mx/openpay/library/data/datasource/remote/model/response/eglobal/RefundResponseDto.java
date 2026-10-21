package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.google.gson.annotations.SerializedName;
import com.noknok.android.client.appsdk.AppSDKException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RefundResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J£\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00106\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018¨\u0006;"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/RefundResponseDto;", "", "id", "", "operationDate", "authorization", PushConstants.AMOUNT, "", AppSDKException.KEY_OPERATION_TYPE, "method", "transactionType", "status", "conciliated", "", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "currency", Constants.creationDate, "description", "fee", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;)V", "getAmount", "()D", "getAuthorization", "()Ljava/lang/String;", "getConciliated", "()Z", "getCreationDate", "getCurrency", "getCustomerId", "getDescription", "getFee", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;", "getId", "getMethod", "getOperationDate", "getOperationType", "getStatus", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RefundResponseDto {

    @SerializedName(PushConstants.AMOUNT)
    private final double amount;

    @SerializedName("authorization")
    @NotNull
    private final String authorization;

    @SerializedName("conciliated")
    private final boolean conciliated;

    @SerializedName("creation_date")
    @Nullable
    private final String creationDate;

    @SerializedName("currency")
    @NotNull
    private final String currency;

    @SerializedName("customer_id")
    @Nullable
    private final String customerId;

    @SerializedName("description")
    @Nullable
    private final String description;

    @SerializedName("fee")
    @Nullable
    private final FeeResponseDto fee;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("method")
    @Nullable
    private final String method;

    @SerializedName("operation_date")
    @NotNull
    private final String operationDate;

    @SerializedName("operation_type")
    @Nullable
    private final String operationType;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName(SqlContracts.BulletEntry.TRANSACTION_TYPE)
    @Nullable
    private final String transactionType;

    public RefundResponseDto(@NotNull String id, @NotNull String operationDate, @NotNull String authorization, double d2, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String status, boolean z10, @Nullable String str4, @NotNull String currency, @Nullable String str5, @Nullable String str6, @Nullable FeeResponseDto feeResponseDto) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(status, "status");
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
        this.customerId = str4;
        this.currency = currency;
        this.creationDate = str5;
        this.description = str6;
        this.fee = feeResponseDto;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
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
    public final FeeResponseDto getFee() {
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
    public final RefundResponseDto copy(@NotNull String id, @NotNull String operationDate, @NotNull String authorization, double amount, @Nullable String operationType, @Nullable String method, @Nullable String transactionType, @NotNull String status, boolean conciliated, @Nullable String customerId, @NotNull String currency, @Nullable String creationDate, @Nullable String description, @Nullable FeeResponseDto fee) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new RefundResponseDto(id, operationDate, authorization, amount, operationType, method, transactionType, status, conciliated, customerId, currency, creationDate, description, fee);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefundResponseDto)) {
            return false;
        }
        RefundResponseDto refundResponseDto = (RefundResponseDto) other;
        return Intrinsics.areEqual(this.id, refundResponseDto.id) && Intrinsics.areEqual(this.operationDate, refundResponseDto.operationDate) && Intrinsics.areEqual(this.authorization, refundResponseDto.authorization) && Double.compare(this.amount, refundResponseDto.amount) == 0 && Intrinsics.areEqual(this.operationType, refundResponseDto.operationType) && Intrinsics.areEqual(this.method, refundResponseDto.method) && Intrinsics.areEqual(this.transactionType, refundResponseDto.transactionType) && Intrinsics.areEqual(this.status, refundResponseDto.status) && this.conciliated == refundResponseDto.conciliated && Intrinsics.areEqual(this.customerId, refundResponseDto.customerId) && Intrinsics.areEqual(this.currency, refundResponseDto.currency) && Intrinsics.areEqual(this.creationDate, refundResponseDto.creationDate) && Intrinsics.areEqual(this.description, refundResponseDto.description) && Intrinsics.areEqual(this.fee, refundResponseDto.fee);
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

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final FeeResponseDto getFee() {
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
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v35 */
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
        int i11 = (iC2 + r3) * 31;
        String str4 = this.customerId;
        int iC3 = n1.c(this.currency, (i11 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.creationDate;
        int iHashCode3 = (iC3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int iHashCode4 = (iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        FeeResponseDto feeResponseDto = this.fee;
        return iHashCode4 + (feeResponseDto != null ? feeResponseDto.hashCode() : 0);
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
        FeeResponseDto feeResponseDto = this.fee;
        StringBuilder sbC = a.c("RefundResponseDto(id=", str, ", operationDate=", str2, ", authorization=");
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
        sbC.append(feeResponseDto);
        sbC.append(")");
        return sbC.toString();
    }
}
