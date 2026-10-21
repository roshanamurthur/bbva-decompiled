package mx.openpay.library.core.model.extra;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.core.impl.v;
import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.noknok.android.client.appsdk.AppSDKException;
import d.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import mx.openpay.library.core.model.OpenPayPaymentPlan;
import mx.openpay.library.core.model.OpenPayProductType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$¢\u0006\u0002\u0010%J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0012HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0012HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\tHÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\u009b\u0002\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$HÆ\u0001J\t\u0010c\u001a\u00020dHÖ\u0001J\u0013\u0010e\u001a\u00020\t2\b\u0010f\u001a\u0004\u0018\u00010gHÖ\u0003J\t\u0010h\u001a\u00020dHÖ\u0001J\t\u0010i\u001a\u00020\u0003HÖ\u0001J\u0019\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020dHÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0011\u0010\u001c\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010)R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010)¨\u0006o"}, d2 = {"Lmx/openpay/library/core/model/extra/TransactionDTO;", "Landroid/os/Parcelable;", "id", "", "authorization", AppSDKException.KEY_OPERATION_TYPE, "transactionType", "status", "conciliated", "", Constants.creationDate, "operationDate", "description", "errorMessage", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "dueDate", "orderId", PushConstants.AMOUNT, "", "currency", "method", "refunds", "", "Lmx/openpay/library/core/model/extra/RefundResponseDTO;", "gatewayCardPresent", ValidationConstantsKt.Card, "Lmx/openpay/library/core/model/extra/CardDTO;", "readMode", "iva", "fee", "Lmx/openpay/library/core/model/extra/FeeResponseDTO;", "originChannelName", "paymentMethodName", "paymentPlan", "Lmx/openpay/library/core/model/OpenPayPaymentPlan;", "productType", "Lmx/openpay/library/core/model/OpenPayProductType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lmx/openpay/library/core/model/extra/CardDTO;Ljava/lang/String;DLmx/openpay/library/core/model/extra/FeeResponseDTO;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayPaymentPlan;Lmx/openpay/library/core/model/OpenPayProductType;)V", "getAmount", "()D", "getAuthorization", "()Ljava/lang/String;", "getCard", "()Lmx/openpay/library/core/model/extra/CardDTO;", "getConciliated", "()Z", "getCreationDate", "getCurrency", "getCustomerId", "getDescription", "getDueDate", "getErrorMessage", "getFee", "()Lmx/openpay/library/core/model/extra/FeeResponseDTO;", "getGatewayCardPresent", "getId", "getIva", "getMethod", "getOperationDate", "getOperationType", "getOrderId", "getOriginChannelName", "getPaymentMethodName", "getPaymentPlan", "()Lmx/openpay/library/core/model/OpenPayPaymentPlan;", "getProductType", "()Lmx/openpay/library/core/model/OpenPayProductType;", "getReadMode", "getRefunds", "()Ljava/util/List;", "getStatus", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TransactionDTO implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<TransactionDTO> CREATOR = new Creator();
    private final double amount;

    @NotNull
    private final String authorization;

    @Nullable
    private final CardDTO card;
    private final boolean conciliated;

    @NotNull
    private final String creationDate;

    @NotNull
    private final String currency;

    @NotNull
    private final String customerId;

    @NotNull
    private final String description;

    @NotNull
    private final String dueDate;

    @NotNull
    private final String errorMessage;

    @Nullable
    private final FeeResponseDTO fee;

    @NotNull
    private final String gatewayCardPresent;

    @NotNull
    private final String id;
    private final double iva;

    @NotNull
    private final String method;

    @NotNull
    private final String operationDate;

    @NotNull
    private final String operationType;

    @NotNull
    private final String orderId;

    @NotNull
    private final String originChannelName;

    @NotNull
    private final String paymentMethodName;

    @Nullable
    private final OpenPayPaymentPlan paymentPlan;

    @Nullable
    private final OpenPayProductType productType;

    @NotNull
    private final String readMode;

    @NotNull
    private final List<RefundResponseDTO> refunds;

    @NotNull
    private final String status;

    @NotNull
    private final String transactionType;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransactionDTO> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TransactionDTO createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i10 = 0;
            boolean z10 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            double d2 = parcel.readDouble();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            while (i10 != i11) {
                arrayList.add(RefundResponseDTO.CREATOR.createFromParcel(parcel));
                i10++;
                i11 = i11;
            }
            return new TransactionDTO(string, string2, string3, string4, string5, z10, string6, string7, string8, string9, string10, string11, string12, d2, string13, string14, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : CardDTO.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readDouble(), parcel.readInt() == 0 ? null : FeeResponseDTO.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OpenPayPaymentPlan.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OpenPayProductType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TransactionDTO[] newArray(int i10) {
            return new TransactionDTO[i10];
        }
    }

    public TransactionDTO(@NotNull String id, @NotNull String authorization, @NotNull String operationType, @NotNull String transactionType, @NotNull String status, boolean z10, @NotNull String creationDate, @NotNull String operationDate, @NotNull String description, @NotNull String errorMessage, @NotNull String customerId, @NotNull String dueDate, @NotNull String orderId, double d2, @NotNull String currency, @NotNull String method, @NotNull List<RefundResponseDTO> refunds, @NotNull String gatewayCardPresent, @Nullable CardDTO cardDTO, @NotNull String readMode, double d3, @Nullable FeeResponseDTO feeResponseDTO, @NotNull String originChannelName, @NotNull String paymentMethodName, @Nullable OpenPayPaymentPlan openPayPaymentPlan, @Nullable OpenPayProductType openPayProductType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(refunds, "refunds");
        Intrinsics.checkNotNullParameter(gatewayCardPresent, "gatewayCardPresent");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        Intrinsics.checkNotNullParameter(originChannelName, "originChannelName");
        Intrinsics.checkNotNullParameter(paymentMethodName, "paymentMethodName");
        this.id = id;
        this.authorization = authorization;
        this.operationType = operationType;
        this.transactionType = transactionType;
        this.status = status;
        this.conciliated = z10;
        this.creationDate = creationDate;
        this.operationDate = operationDate;
        this.description = description;
        this.errorMessage = errorMessage;
        this.customerId = customerId;
        this.dueDate = dueDate;
        this.orderId = orderId;
        this.amount = d2;
        this.currency = currency;
        this.method = method;
        this.refunds = refunds;
        this.gatewayCardPresent = gatewayCardPresent;
        this.card = cardDTO;
        this.readMode = readMode;
        this.iva = d3;
        this.fee = feeResponseDTO;
        this.originChannelName = originChannelName;
        this.paymentMethodName = paymentMethodName;
        this.paymentPlan = openPayPaymentPlan;
        this.productType = openPayProductType;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final List<RefundResponseDTO> component17() {
        return this.refunds;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final CardDTO getCard() {
        return this.card;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getReadMode() {
        return this.readMode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final double getIva() {
        return this.iva;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final FeeResponseDTO getFee() {
        return this.fee;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getOriginChannelName() {
        return this.originChannelName;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final OpenPayPaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final OpenPayProductType getProductType() {
        return this.productType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOperationType() {
        return this.operationType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getConciliated() {
        return this.conciliated;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCreationDate() {
        return this.creationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOperationDate() {
        return this.operationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final TransactionDTO copy(@NotNull String id, @NotNull String authorization, @NotNull String operationType, @NotNull String transactionType, @NotNull String status, boolean conciliated, @NotNull String creationDate, @NotNull String operationDate, @NotNull String description, @NotNull String errorMessage, @NotNull String customerId, @NotNull String dueDate, @NotNull String orderId, double amount, @NotNull String currency, @NotNull String method, @NotNull List<RefundResponseDTO> refunds, @NotNull String gatewayCardPresent, @Nullable CardDTO card, @NotNull String readMode, double iva, @Nullable FeeResponseDTO fee, @NotNull String originChannelName, @NotNull String paymentMethodName, @Nullable OpenPayPaymentPlan paymentPlan, @Nullable OpenPayProductType productType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(refunds, "refunds");
        Intrinsics.checkNotNullParameter(gatewayCardPresent, "gatewayCardPresent");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        Intrinsics.checkNotNullParameter(originChannelName, "originChannelName");
        Intrinsics.checkNotNullParameter(paymentMethodName, "paymentMethodName");
        return new TransactionDTO(id, authorization, operationType, transactionType, status, conciliated, creationDate, operationDate, description, errorMessage, customerId, dueDate, orderId, amount, currency, method, refunds, gatewayCardPresent, card, readMode, iva, fee, originChannelName, paymentMethodName, paymentPlan, productType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionDTO)) {
            return false;
        }
        TransactionDTO transactionDTO = (TransactionDTO) other;
        return Intrinsics.areEqual(this.id, transactionDTO.id) && Intrinsics.areEqual(this.authorization, transactionDTO.authorization) && Intrinsics.areEqual(this.operationType, transactionDTO.operationType) && Intrinsics.areEqual(this.transactionType, transactionDTO.transactionType) && Intrinsics.areEqual(this.status, transactionDTO.status) && this.conciliated == transactionDTO.conciliated && Intrinsics.areEqual(this.creationDate, transactionDTO.creationDate) && Intrinsics.areEqual(this.operationDate, transactionDTO.operationDate) && Intrinsics.areEqual(this.description, transactionDTO.description) && Intrinsics.areEqual(this.errorMessage, transactionDTO.errorMessage) && Intrinsics.areEqual(this.customerId, transactionDTO.customerId) && Intrinsics.areEqual(this.dueDate, transactionDTO.dueDate) && Intrinsics.areEqual(this.orderId, transactionDTO.orderId) && Double.compare(this.amount, transactionDTO.amount) == 0 && Intrinsics.areEqual(this.currency, transactionDTO.currency) && Intrinsics.areEqual(this.method, transactionDTO.method) && Intrinsics.areEqual(this.refunds, transactionDTO.refunds) && Intrinsics.areEqual(this.gatewayCardPresent, transactionDTO.gatewayCardPresent) && Intrinsics.areEqual(this.card, transactionDTO.card) && Intrinsics.areEqual(this.readMode, transactionDTO.readMode) && Double.compare(this.iva, transactionDTO.iva) == 0 && Intrinsics.areEqual(this.fee, transactionDTO.fee) && Intrinsics.areEqual(this.originChannelName, transactionDTO.originChannelName) && Intrinsics.areEqual(this.paymentMethodName, transactionDTO.paymentMethodName) && Intrinsics.areEqual(this.paymentPlan, transactionDTO.paymentPlan) && this.productType == transactionDTO.productType;
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    public final CardDTO getCard() {
        return this.card;
    }

    public final boolean getConciliated() {
        return this.conciliated;
    }

    @NotNull
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

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDueDate() {
        return this.dueDate;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final FeeResponseDTO getFee() {
        return this.fee;
    }

    @NotNull
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final double getIva() {
        return this.iva;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final String getOperationDate() {
        return this.operationDate;
    }

    @NotNull
    public final String getOperationType() {
        return this.operationType;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getOriginChannelName() {
        return this.originChannelName;
    }

    @NotNull
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    public final OpenPayPaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    public final OpenPayProductType getProductType() {
        return this.productType;
    }

    @NotNull
    public final String getReadMode() {
        return this.readMode;
    }

    @NotNull
    public final List<RefundResponseDTO> getRefunds() {
        return this.refunds;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    public int hashCode() {
        int iA = a.a(this.status, a.a(this.transactionType, a.a(this.operationType, a.a(this.authorization, this.id.hashCode() * 31, 31), 31), 31), 31);
        boolean z10 = this.conciliated;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iA2 = a.a(this.orderId, a.a(this.dueDate, a.a(this.customerId, a.a(this.errorMessage, a.a(this.description, a.a(this.operationDate, a.a(this.creationDate, (iA + r3) * 31, 31), 31), 31), 31), 31), 31), 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iA3 = a.a(this.gatewayCardPresent, com.google.android.gms.measurement.internal.a.a(this.refunds, a.a(this.method, a.a(this.currency, (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + iA2) * 31, 31), 31), 31), 31);
        CardDTO cardDTO = this.card;
        int iA4 = a.a(this.readMode, (iA3 + (cardDTO == null ? 0 : cardDTO.hashCode())) * 31, 31);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.iva);
        int i10 = (((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32))) + iA4) * 31;
        FeeResponseDTO feeResponseDTO = this.fee;
        int iA5 = a.a(this.paymentMethodName, a.a(this.originChannelName, (i10 + (feeResponseDTO == null ? 0 : feeResponseDTO.hashCode())) * 31, 31), 31);
        OpenPayPaymentPlan openPayPaymentPlan = this.paymentPlan;
        int iHashCode = (iA5 + (openPayPaymentPlan == null ? 0 : openPayPaymentPlan.hashCode())) * 31;
        OpenPayProductType openPayProductType = this.productType;
        return iHashCode + (openPayProductType != null ? openPayProductType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.authorization;
        String str3 = this.operationType;
        String str4 = this.transactionType;
        String str5 = this.status;
        boolean z10 = this.conciliated;
        String str6 = this.creationDate;
        String str7 = this.operationDate;
        String str8 = this.description;
        String str9 = this.errorMessage;
        String str10 = this.customerId;
        String str11 = this.dueDate;
        String str12 = this.orderId;
        double d2 = this.amount;
        String str13 = this.currency;
        String str14 = this.method;
        List<RefundResponseDTO> list = this.refunds;
        String str15 = this.gatewayCardPresent;
        CardDTO cardDTO = this.card;
        String str16 = this.readMode;
        double d3 = this.iva;
        FeeResponseDTO feeResponseDTO = this.fee;
        String str17 = this.originChannelName;
        String str18 = this.paymentMethodName;
        OpenPayPaymentPlan openPayPaymentPlan = this.paymentPlan;
        OpenPayProductType openPayProductType = this.productType;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("TransactionDTO(id=", str, ", authorization=", str2, ", operationType=");
        k.e(sbC, str3, ", transactionType=", str4, ", status=");
        sbC.append(str5);
        sbC.append(", conciliated=");
        sbC.append(z10);
        sbC.append(", creationDate=");
        k.e(sbC, str6, ", operationDate=", str7, ", description=");
        k.e(sbC, str8, ", errorMessage=", str9, ", customerId=");
        k.e(sbC, str10, ", dueDate=", str11, ", orderId=");
        sbC.append(str12);
        sbC.append(", amount=");
        sbC.append(d2);
        k.e(sbC, ", currency=", str13, ", method=", str14);
        sbC.append(", refunds=");
        sbC.append(list);
        sbC.append(", gatewayCardPresent=");
        sbC.append(str15);
        sbC.append(", card=");
        sbC.append(cardDTO);
        sbC.append(", readMode=");
        sbC.append(str16);
        v.f(sbC, ", iva=", d3, ", fee=");
        sbC.append(feeResponseDTO);
        sbC.append(", originChannelName=");
        sbC.append(str17);
        sbC.append(", paymentMethodName=");
        sbC.append(str18);
        sbC.append(", paymentPlan=");
        sbC.append(openPayPaymentPlan);
        sbC.append(", productType=");
        sbC.append(openPayProductType);
        sbC.append(")");
        return sbC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.authorization);
        parcel.writeString(this.operationType);
        parcel.writeString(this.transactionType);
        parcel.writeString(this.status);
        parcel.writeInt(this.conciliated ? 1 : 0);
        parcel.writeString(this.creationDate);
        parcel.writeString(this.operationDate);
        parcel.writeString(this.description);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.customerId);
        parcel.writeString(this.dueDate);
        parcel.writeString(this.orderId);
        parcel.writeDouble(this.amount);
        parcel.writeString(this.currency);
        parcel.writeString(this.method);
        List<RefundResponseDTO> list = this.refunds;
        parcel.writeInt(list.size());
        Iterator<RefundResponseDTO> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.gatewayCardPresent);
        CardDTO cardDTO = this.card;
        if (cardDTO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardDTO.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.readMode);
        parcel.writeDouble(this.iva);
        FeeResponseDTO feeResponseDTO = this.fee;
        if (feeResponseDTO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeResponseDTO.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.originChannelName);
        parcel.writeString(this.paymentMethodName);
        OpenPayPaymentPlan openPayPaymentPlan = this.paymentPlan;
        if (openPayPaymentPlan == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            openPayPaymentPlan.writeToParcel(parcel, flags);
        }
        OpenPayProductType openPayProductType = this.productType;
        if (openPayProductType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(openPayProductType.name());
        }
    }

    public /* synthetic */ TransactionDTO(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, double d2, String str13, String str14, List list, String str15, CardDTO cardDTO, String str16, double d3, FeeResponseDTO feeResponseDTO, String str17, String str18, OpenPayPaymentPlan openPayPaymentPlan, OpenPayProductType openPayProductType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? "" : str3, str4, str5, (i10 & 32) != 0 ? false : z10, str6, (i10 & 128) != 0 ? "" : str7, str8, (i10 & 512) != 0 ? "" : str9, str10, str11, str12, d2, (i10 & 16384) != 0 ? "" : str13, str14, (65536 & i10) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (131072 & i10) != 0 ? "" : str15, (262144 & i10) != 0 ? null : cardDTO, (524288 & i10) != 0 ? "" : str16, (1048576 & i10) != 0 ? 0.0d : d3, (2097152 & i10) != 0 ? null : feeResponseDTO, str17, str18, (16777216 & i10) != 0 ? null : openPayPaymentPlan, (i10 & 33554432) != 0 ? null : openPayProductType);
    }
}
