package mx.openpay.library.core.model;

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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.noknok.android.client.appsdk.AppSDKException;
import d.a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0012\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0018\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/¢\u0006\u0002\u00100J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0012HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0012HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010#HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0002\u0010CJ\u0011\u0010t\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0018HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010+HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010/HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\tHÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003Jï\u0002\u0010\u007f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u00182\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/HÆ\u0001¢\u0006\u0003\u0010\u0080\u0001J\n\u0010\u0081\u0001\u001a\u00020'HÖ\u0001J\u0016\u0010\u0082\u0001\u001a\u00020\t2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001HÖ\u0003J\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001J\n\u0010\u0087\u0001\u001a\u00020'HÖ\u0001J\n\u0010\u0088\u0001\u001a\u00020\u0003HÖ\u0001J\u001e\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020'HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00104R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00104R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u00104R\u0015\u0010&\u001a\u0004\u0018\u00010'¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00104R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00104R\u0011\u0010\u001f\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bJ\u00102R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00104R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00104R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u00104R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u00104R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00104R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00104R\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u00104R\u0019\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b[\u0010YR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u00104R\u0013\u0010*\u001a\u0004\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^¨\u0006\u008e\u0001"}, d2 = {"Lmx/openpay/library/core/model/OpenPayTransaction;", "Landroid/os/Parcelable;", "id", "", "authorization", AppSDKException.KEY_OPERATION_TYPE, "transactionType", "status", "conciliated", "", Constants.creationDate, "operationDate", "description", "errorMessage", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "dueDate", "orderId", PushConstants.AMOUNT, "", "customer", "Lmx/openpay/library/core/model/OpenPayCustomer;", "currency", "method", "refunds", "", "Lmx/openpay/library/core/model/OpenPayRefund;", FirebaseAnalytics.Event.REFUND, "gatewayCardPresent", ValidationConstantsKt.Card, "Lmx/openpay/library/core/model/OpenPayCard;", "readMode", "iva", "cardPoints", "Lmx/openpay/library/core/model/OpenPayCardPoints;", "fee", "Lmx/openpay/library/core/model/OpenPayFee;", "originChannelName", "paymentMethodName", "errorCode", "", "taxes", "Lmx/openpay/library/core/model/OpenPayTaxes;", "voucherType", "Lmx/openpay/library/core/model/OpenPayVoucherType;", "paymentPlan", "Lmx/openpay/library/core/model/OpenPayPaymentPlan;", "productType", "Lmx/openpay/library/core/model/OpenPayProductType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLmx/openpay/library/core/model/OpenPayCustomer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmx/openpay/library/core/model/OpenPayRefund;Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayCard;Ljava/lang/String;DLmx/openpay/library/core/model/OpenPayCardPoints;Lmx/openpay/library/core/model/OpenPayFee;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lmx/openpay/library/core/model/OpenPayVoucherType;Lmx/openpay/library/core/model/OpenPayPaymentPlan;Lmx/openpay/library/core/model/OpenPayProductType;)V", "getAmount", "()D", "getAuthorization", "()Ljava/lang/String;", "getCard", "()Lmx/openpay/library/core/model/OpenPayCard;", "getCardPoints", "()Lmx/openpay/library/core/model/OpenPayCardPoints;", "getConciliated", "()Z", "getCreationDate", "getCurrency", "getCustomer", "()Lmx/openpay/library/core/model/OpenPayCustomer;", "getCustomerId", "getDescription", "getDueDate", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorMessage", "getFee", "()Lmx/openpay/library/core/model/OpenPayFee;", "getGatewayCardPresent", "getId", "getIva", "getMethod", "getOperationDate", "getOperationType", "getOrderId", "getOriginChannelName", "getPaymentMethodName", "getPaymentPlan", "()Lmx/openpay/library/core/model/OpenPayPaymentPlan;", "getProductType", "()Lmx/openpay/library/core/model/OpenPayProductType;", "getReadMode", "getRefund", "()Lmx/openpay/library/core/model/OpenPayRefund;", "getRefunds", "()Ljava/util/List;", "getStatus", "getTaxes", "getTransactionType", "getVoucherType", "()Lmx/openpay/library/core/model/OpenPayVoucherType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLmx/openpay/library/core/model/OpenPayCustomer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmx/openpay/library/core/model/OpenPayRefund;Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayCard;Ljava/lang/String;DLmx/openpay/library/core/model/OpenPayCardPoints;Lmx/openpay/library/core/model/OpenPayFee;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lmx/openpay/library/core/model/OpenPayVoucherType;Lmx/openpay/library/core/model/OpenPayPaymentPlan;Lmx/openpay/library/core/model/OpenPayProductType;)Lmx/openpay/library/core/model/OpenPayTransaction;", "describeContents", "equals", "other", "", "getFirstTaxesAmount", "Ljava/math/BigDecimal;", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayTransaction implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OpenPayTransaction> CREATOR = new Creator();
    private final double amount;

    @NotNull
    private final String authorization;

    @Nullable
    private final OpenPayCard card;

    @Nullable
    private final OpenPayCardPoints cardPoints;
    private final boolean conciliated;

    @NotNull
    private final String creationDate;

    @NotNull
    private final String currency;

    @Nullable
    private final OpenPayCustomer customer;

    @NotNull
    private final String customerId;

    @NotNull
    private final String description;

    @NotNull
    private final String dueDate;

    @Nullable
    private final Integer errorCode;

    @NotNull
    private final String errorMessage;

    @Nullable
    private final OpenPayFee fee;

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

    @Nullable
    private final OpenPayRefund refund;

    @NotNull
    private final List<OpenPayRefund> refunds;

    @NotNull
    private final String status;

    @Nullable
    private final List<OpenPayTaxes> taxes;

    @NotNull
    private final String transactionType;

    @Nullable
    private final OpenPayVoucherType voucherType;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayTransaction> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayTransaction createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            double d2 = parcel.readDouble();
            OpenPayCustomer openPayCustomerCreateFromParcel = parcel.readInt() == 0 ? null : OpenPayCustomer.CREATOR.createFromParcel(parcel);
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i10);
            int i11 = 0;
            while (i11 != i10) {
                arrayList2.add(OpenPayRefund.CREATOR.createFromParcel(parcel));
                i11++;
                i10 = i10;
            }
            OpenPayRefund openPayRefundCreateFromParcel = parcel.readInt() == 0 ? null : OpenPayRefund.CREATOR.createFromParcel(parcel);
            String string15 = parcel.readString();
            OpenPayCard openPayCardCreateFromParcel = parcel.readInt() == 0 ? null : OpenPayCard.CREATOR.createFromParcel(parcel);
            String string16 = parcel.readString();
            double d3 = parcel.readDouble();
            OpenPayCardPoints openPayCardPointsCreateFromParcel = parcel.readInt() == 0 ? null : OpenPayCardPoints.CREATOR.createFromParcel(parcel);
            OpenPayFee openPayFeeCreateFromParcel = parcel.readInt() == 0 ? null : OpenPayFee.CREATOR.createFromParcel(parcel);
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int i13 = 0;
                while (i13 != i12) {
                    arrayList3.add(OpenPayTaxes.CREATOR.createFromParcel(parcel));
                    i13++;
                    i12 = i12;
                }
                arrayList = arrayList3;
            }
            return new OpenPayTransaction(string, string2, string3, string4, string5, z10, string6, string7, string8, string9, string10, string11, string12, d2, openPayCustomerCreateFromParcel, string13, string14, arrayList2, openPayRefundCreateFromParcel, string15, openPayCardCreateFromParcel, string16, d3, openPayCardPointsCreateFromParcel, openPayFeeCreateFromParcel, string17, string18, numValueOf, arrayList, parcel.readInt() == 0 ? null : OpenPayVoucherType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : OpenPayPaymentPlan.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OpenPayProductType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayTransaction[] newArray(int i10) {
            return new OpenPayTransaction[i10];
        }
    }

    public OpenPayTransaction(@NotNull String id, @NotNull String authorization, @NotNull String operationType, @NotNull String transactionType, @NotNull String status, boolean z10, @NotNull String creationDate, @NotNull String operationDate, @NotNull String description, @NotNull String errorMessage, @NotNull String customerId, @NotNull String dueDate, @NotNull String orderId, double d2, @Nullable OpenPayCustomer openPayCustomer, @NotNull String currency, @NotNull String method, @NotNull List<OpenPayRefund> refunds, @Nullable OpenPayRefund openPayRefund, @NotNull String gatewayCardPresent, @Nullable OpenPayCard openPayCard, @NotNull String readMode, double d3, @Nullable OpenPayCardPoints openPayCardPoints, @Nullable OpenPayFee openPayFee, @NotNull String originChannelName, @NotNull String paymentMethodName, @Nullable Integer num, @Nullable List<OpenPayTaxes> list, @Nullable OpenPayVoucherType openPayVoucherType, @Nullable OpenPayPaymentPlan openPayPaymentPlan, @Nullable OpenPayProductType openPayProductType) {
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
        this.customer = openPayCustomer;
        this.currency = currency;
        this.method = method;
        this.refunds = refunds;
        this.refund = openPayRefund;
        this.gatewayCardPresent = gatewayCardPresent;
        this.card = openPayCard;
        this.readMode = readMode;
        this.iva = d3;
        this.cardPoints = openPayCardPoints;
        this.fee = openPayFee;
        this.originChannelName = originChannelName;
        this.paymentMethodName = paymentMethodName;
        this.errorCode = num;
        this.taxes = list;
        this.voucherType = openPayVoucherType;
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

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final OpenPayCustomer getCustomer() {
        return this.customer;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final List<OpenPayRefund> component18() {
        return this.refunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final OpenPayRefund getRefund() {
        return this.refund;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final OpenPayCard getCard() {
        return this.card;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getReadMode() {
        return this.readMode;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final double getIva() {
        return this.iva;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final OpenPayCardPoints getCardPoints() {
        return this.cardPoints;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final OpenPayFee getFee() {
        return this.fee;
    }

    @NotNull
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getOriginChannelName() {
        return this.originChannelName;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final List<OpenPayTaxes> component29() {
        return this.taxes;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOperationType() {
        return this.operationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final OpenPayVoucherType getVoucherType() {
        return this.voucherType;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final OpenPayPaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final OpenPayProductType getProductType() {
        return this.productType;
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
    public final OpenPayTransaction copy(@NotNull String id, @NotNull String authorization, @NotNull String operationType, @NotNull String transactionType, @NotNull String status, boolean conciliated, @NotNull String creationDate, @NotNull String operationDate, @NotNull String description, @NotNull String errorMessage, @NotNull String customerId, @NotNull String dueDate, @NotNull String orderId, double amount, @Nullable OpenPayCustomer customer, @NotNull String currency, @NotNull String method, @NotNull List<OpenPayRefund> refunds, @Nullable OpenPayRefund refund, @NotNull String gatewayCardPresent, @Nullable OpenPayCard card, @NotNull String readMode, double iva, @Nullable OpenPayCardPoints cardPoints, @Nullable OpenPayFee fee, @NotNull String originChannelName, @NotNull String paymentMethodName, @Nullable Integer errorCode, @Nullable List<OpenPayTaxes> taxes, @Nullable OpenPayVoucherType voucherType, @Nullable OpenPayPaymentPlan paymentPlan, @Nullable OpenPayProductType productType) {
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
        return new OpenPayTransaction(id, authorization, operationType, transactionType, status, conciliated, creationDate, operationDate, description, errorMessage, customerId, dueDate, orderId, amount, customer, currency, method, refunds, refund, gatewayCardPresent, card, readMode, iva, cardPoints, fee, originChannelName, paymentMethodName, errorCode, taxes, voucherType, paymentPlan, productType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayTransaction)) {
            return false;
        }
        OpenPayTransaction openPayTransaction = (OpenPayTransaction) other;
        return Intrinsics.areEqual(this.id, openPayTransaction.id) && Intrinsics.areEqual(this.authorization, openPayTransaction.authorization) && Intrinsics.areEqual(this.operationType, openPayTransaction.operationType) && Intrinsics.areEqual(this.transactionType, openPayTransaction.transactionType) && Intrinsics.areEqual(this.status, openPayTransaction.status) && this.conciliated == openPayTransaction.conciliated && Intrinsics.areEqual(this.creationDate, openPayTransaction.creationDate) && Intrinsics.areEqual(this.operationDate, openPayTransaction.operationDate) && Intrinsics.areEqual(this.description, openPayTransaction.description) && Intrinsics.areEqual(this.errorMessage, openPayTransaction.errorMessage) && Intrinsics.areEqual(this.customerId, openPayTransaction.customerId) && Intrinsics.areEqual(this.dueDate, openPayTransaction.dueDate) && Intrinsics.areEqual(this.orderId, openPayTransaction.orderId) && Double.compare(this.amount, openPayTransaction.amount) == 0 && Intrinsics.areEqual(this.customer, openPayTransaction.customer) && Intrinsics.areEqual(this.currency, openPayTransaction.currency) && Intrinsics.areEqual(this.method, openPayTransaction.method) && Intrinsics.areEqual(this.refunds, openPayTransaction.refunds) && Intrinsics.areEqual(this.refund, openPayTransaction.refund) && Intrinsics.areEqual(this.gatewayCardPresent, openPayTransaction.gatewayCardPresent) && Intrinsics.areEqual(this.card, openPayTransaction.card) && Intrinsics.areEqual(this.readMode, openPayTransaction.readMode) && Double.compare(this.iva, openPayTransaction.iva) == 0 && Intrinsics.areEqual(this.cardPoints, openPayTransaction.cardPoints) && Intrinsics.areEqual(this.fee, openPayTransaction.fee) && Intrinsics.areEqual(this.originChannelName, openPayTransaction.originChannelName) && Intrinsics.areEqual(this.paymentMethodName, openPayTransaction.paymentMethodName) && Intrinsics.areEqual(this.errorCode, openPayTransaction.errorCode) && Intrinsics.areEqual(this.taxes, openPayTransaction.taxes) && this.voucherType == openPayTransaction.voucherType && Intrinsics.areEqual(this.paymentPlan, openPayTransaction.paymentPlan) && this.productType == openPayTransaction.productType;
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    public final OpenPayCard getCard() {
        return this.card;
    }

    @Nullable
    public final OpenPayCardPoints getCardPoints() {
        return this.cardPoints;
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

    @Nullable
    public final OpenPayCustomer getCustomer() {
        return this.customer;
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

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final OpenPayFee getFee() {
        return this.fee;
    }

    @NotNull
    public final BigDecimal getFirstTaxesAmount() {
        OpenPayTaxes openPayTaxes;
        List<OpenPayTaxes> list = this.taxes;
        if (list != null && (openPayTaxes = (OpenPayTaxes) CollectionsKt___CollectionsKt.firstOrNull((List) list)) != null) {
            return new BigDecimal(String.valueOf(openPayTaxes.getAmount()));
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
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

    @Nullable
    public final OpenPayRefund getRefund() {
        return this.refund;
    }

    @NotNull
    public final List<OpenPayRefund> getRefunds() {
        return this.refunds;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<OpenPayTaxes> getTaxes() {
        return this.taxes;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    @Nullable
    public final OpenPayVoucherType getVoucherType() {
        return this.voucherType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    public int hashCode() {
        int iA = a.a(this.status, a.a(this.transactionType, a.a(this.operationType, a.a(this.authorization, this.id.hashCode() * 31, 31), 31), 31), 31);
        boolean z10 = this.conciliated;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iA2 = a.a(this.orderId, a.a(this.dueDate, a.a(this.customerId, a.a(this.errorMessage, a.a(this.description, a.a(this.operationDate, a.a(this.creationDate, (iA + r3) * 31, 31), 31), 31), 31), 31), 31), 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i10 = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + iA2) * 31;
        OpenPayCustomer openPayCustomer = this.customer;
        int iA3 = com.google.android.gms.measurement.internal.a.a(this.refunds, a.a(this.method, a.a(this.currency, (i10 + (openPayCustomer == null ? 0 : openPayCustomer.hashCode())) * 31, 31), 31), 31);
        OpenPayRefund openPayRefund = this.refund;
        int iA4 = a.a(this.gatewayCardPresent, (iA3 + (openPayRefund == null ? 0 : openPayRefund.hashCode())) * 31, 31);
        OpenPayCard openPayCard = this.card;
        int iA5 = a.a(this.readMode, (iA4 + (openPayCard == null ? 0 : openPayCard.hashCode())) * 31, 31);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.iva);
        int i11 = (((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32))) + iA5) * 31;
        OpenPayCardPoints openPayCardPoints = this.cardPoints;
        int iHashCode = (i11 + (openPayCardPoints == null ? 0 : openPayCardPoints.hashCode())) * 31;
        OpenPayFee openPayFee = this.fee;
        int iA6 = a.a(this.paymentMethodName, a.a(this.originChannelName, (iHashCode + (openPayFee == null ? 0 : openPayFee.hashCode())) * 31, 31), 31);
        Integer num = this.errorCode;
        int iHashCode2 = (iA6 + (num == null ? 0 : num.hashCode())) * 31;
        List<OpenPayTaxes> list = this.taxes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        OpenPayVoucherType openPayVoucherType = this.voucherType;
        int iHashCode4 = (iHashCode3 + (openPayVoucherType == null ? 0 : openPayVoucherType.hashCode())) * 31;
        OpenPayPaymentPlan openPayPaymentPlan = this.paymentPlan;
        int iHashCode5 = (iHashCode4 + (openPayPaymentPlan == null ? 0 : openPayPaymentPlan.hashCode())) * 31;
        OpenPayProductType openPayProductType = this.productType;
        return iHashCode5 + (openPayProductType != null ? openPayProductType.hashCode() : 0);
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
        OpenPayCustomer openPayCustomer = this.customer;
        String str13 = this.currency;
        String str14 = this.method;
        List<OpenPayRefund> list = this.refunds;
        OpenPayRefund openPayRefund = this.refund;
        String str15 = this.gatewayCardPresent;
        OpenPayCard openPayCard = this.card;
        String str16 = this.readMode;
        double d3 = this.iva;
        OpenPayCardPoints openPayCardPoints = this.cardPoints;
        OpenPayFee openPayFee = this.fee;
        String str17 = this.originChannelName;
        String str18 = this.paymentMethodName;
        Integer num = this.errorCode;
        List<OpenPayTaxes> list2 = this.taxes;
        OpenPayVoucherType openPayVoucherType = this.voucherType;
        OpenPayPaymentPlan openPayPaymentPlan = this.paymentPlan;
        OpenPayProductType openPayProductType = this.productType;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("OpenPayTransaction(id=", str, ", authorization=", str2, ", operationType=");
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
        sbC.append(", customer=");
        sbC.append(openPayCustomer);
        sbC.append(", currency=");
        sbC.append(str13);
        sbC.append(", method=");
        sbC.append(str14);
        sbC.append(", refunds=");
        sbC.append(list);
        sbC.append(", refund=");
        sbC.append(openPayRefund);
        sbC.append(", gatewayCardPresent=");
        sbC.append(str15);
        sbC.append(", card=");
        sbC.append(openPayCard);
        sbC.append(", readMode=");
        sbC.append(str16);
        v.f(sbC, ", iva=", d3, ", cardPoints=");
        sbC.append(openPayCardPoints);
        sbC.append(", fee=");
        sbC.append(openPayFee);
        sbC.append(", originChannelName=");
        k.e(sbC, str17, ", paymentMethodName=", str18, ", errorCode=");
        sbC.append(num);
        sbC.append(", taxes=");
        sbC.append(list2);
        sbC.append(", voucherType=");
        sbC.append(openPayVoucherType);
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
        OpenPayCustomer openPayCustomer = this.customer;
        if (openPayCustomer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            openPayCustomer.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.currency);
        parcel.writeString(this.method);
        List<OpenPayRefund> list = this.refunds;
        parcel.writeInt(list.size());
        Iterator<OpenPayRefund> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        OpenPayRefund openPayRefund = this.refund;
        if (openPayRefund == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            openPayRefund.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.gatewayCardPresent);
        OpenPayCard openPayCard = this.card;
        if (openPayCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            openPayCard.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.readMode);
        parcel.writeDouble(this.iva);
        OpenPayCardPoints openPayCardPoints = this.cardPoints;
        if (openPayCardPoints == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            openPayCardPoints.writeToParcel(parcel, flags);
        }
        OpenPayFee openPayFee = this.fee;
        if (openPayFee == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            openPayFee.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.originChannelName);
        parcel.writeString(this.paymentMethodName);
        Integer num = this.errorCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<OpenPayTaxes> list2 = this.taxes;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<OpenPayTaxes> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, flags);
            }
        }
        OpenPayVoucherType openPayVoucherType = this.voucherType;
        if (openPayVoucherType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(openPayVoucherType.name());
        }
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

    public /* synthetic */ OpenPayTransaction(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, double d2, OpenPayCustomer openPayCustomer, String str13, String str14, List list, OpenPayRefund openPayRefund, String str15, OpenPayCard openPayCard, String str16, double d3, OpenPayCardPoints openPayCardPoints, OpenPayFee openPayFee, String str17, String str18, Integer num, List list2, OpenPayVoucherType openPayVoucherType, OpenPayPaymentPlan openPayPaymentPlan, OpenPayProductType openPayProductType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? "" : str3, str4, str5, (i10 & 32) != 0 ? false : z10, str6, (i10 & 128) != 0 ? "" : str7, str8, (i10 & 512) != 0 ? "" : str9, str10, str11, str12, d2, (i10 & 16384) != 0 ? null : openPayCustomer, (32768 & i10) != 0 ? "" : str13, str14, (131072 & i10) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (262144 & i10) != 0 ? null : openPayRefund, (524288 & i10) != 0 ? "" : str15, (1048576 & i10) != 0 ? null : openPayCard, (2097152 & i10) != 0 ? "" : str16, (4194304 & i10) != 0 ? 0.0d : d3, (8388608 & i10) != 0 ? null : openPayCardPoints, (16777216 & i10) != 0 ? null : openPayFee, str17, str18, num, (268435456 & i10) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (536870912 & i10) != 0 ? null : openPayVoucherType, (1073741824 & i10) != 0 ? null : openPayPaymentPlan, (i10 & Integer.MIN_VALUE) != 0 ? null : openPayProductType);
    }
}
