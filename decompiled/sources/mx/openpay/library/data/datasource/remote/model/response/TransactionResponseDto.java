package mx.openpay.library.data.datasource.remote.model.response;

import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.noknok.android.client.appsdk.AppSDKException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.CardPointsResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.CardResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.FeeResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.RefundResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.paymentlink.CustomerResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.transaction.PaymentPlanResponseDto;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bX\b\u0086\b\u0018\u00002\u00020\u0001B×\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0018\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010.J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0012HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010JJ\u000b\u0010n\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010s\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0018HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010,HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00108J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0090\u0003\u0010~\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u00182\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u007fJ\u0015\u0010\u0080\u0001\u001a\u00020\t2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0082\u0001\u001a\u00020'HÖ\u0001J\n\u0010\u0083\u0001\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00102R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00102R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00102R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u001a\u0010&\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0018\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00102R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00102R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\bI\u0010JR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00102R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00102R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00102R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00102R\u0018\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0018\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u00102R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u00102R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u00102R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010YR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u00102R\u0018\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u00102¨\u0006\u0084\u0001"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/TransactionResponseDto;", "", "id", "", "authorization", AppSDKException.KEY_OPERATION_TYPE, "transactionType", "status", "conciliated", "", Constants.creationDate, "operationDate", "description", "errorMessage", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "dueDate", "orderId", PushConstants.AMOUNT, "", "customer", "Lmx/openpay/library/data/datasource/remote/model/response/paymentlink/CustomerResponseDto;", "currency", "method", "refunds", "", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/RefundResponseDto;", FirebaseAnalytics.Event.REFUND, "gatewayCardPresent", ValidationConstantsKt.Card, "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardResponseDto;", "readMode", "iva", "cardPoints", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardPointsResponseDto;", "fee", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;", "originChannelName", "paymentMethodName", "errorCode", "", "taxes", "Lmx/openpay/library/data/datasource/remote/model/response/TaxesResponseDto;", "voucherType", "paymentPlan", "Lmx/openpay/library/data/datasource/remote/model/response/transaction/PaymentPlanResponseDto;", "productType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLmx/openpay/library/data/datasource/remote/model/response/paymentlink/CustomerResponseDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/RefundResponseDto;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardResponseDto;Ljava/lang/String;Ljava/lang/Double;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardPointsResponseDto;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/transaction/PaymentPlanResponseDto;Ljava/lang/String;)V", "getAmount", "()D", "getAuthorization", "()Ljava/lang/String;", "getCard", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardResponseDto;", "getCardPoints", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardPointsResponseDto;", "getConciliated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCreationDate", "getCurrency", "getCustomer", "()Lmx/openpay/library/data/datasource/remote/model/response/paymentlink/CustomerResponseDto;", "getCustomerId", "getDescription", "getDueDate", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorMessage", "getFee", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;", "getGatewayCardPresent", "getId", "getIva", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMethod", "getOperationDate", "getOperationType", "getOrderId", "getOriginChannelName", "getPaymentMethodName", "getPaymentPlan", "()Lmx/openpay/library/data/datasource/remote/model/response/transaction/PaymentPlanResponseDto;", "getProductType", "getReadMode", "getRefund", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/RefundResponseDto;", "getRefunds", "()Ljava/util/List;", "getStatus", "getTaxes", "getTransactionType", "getVoucherType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLmx/openpay/library/data/datasource/remote/model/response/paymentlink/CustomerResponseDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/RefundResponseDto;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardResponseDto;Ljava/lang/String;Ljava/lang/Double;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardPointsResponseDto;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/transaction/PaymentPlanResponseDto;Ljava/lang/String;)Lmx/openpay/library/data/datasource/remote/model/response/TransactionResponseDto;", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TransactionResponseDto {

    @SerializedName(PushConstants.AMOUNT)
    private final double amount;

    @SerializedName("authorization")
    @Nullable
    private final String authorization;

    @SerializedName(ValidationConstantsKt.Card)
    @Nullable
    private final CardResponseDto card;

    @SerializedName("card_points")
    @Nullable
    private final CardPointsResponseDto cardPoints;

    @SerializedName("conciliated")
    @Nullable
    private final Boolean conciliated;

    @SerializedName("creation_date")
    @NotNull
    private final String creationDate;

    @SerializedName("currency")
    @Nullable
    private final String currency;

    @SerializedName("customer")
    @Nullable
    private final CustomerResponseDto customer;

    @SerializedName("customer_id")
    @Nullable
    private final String customerId;

    @SerializedName("description")
    @Nullable
    private final String description;

    @SerializedName("due_date")
    @Nullable
    private final String dueDate;

    @SerializedName("error_code")
    @Nullable
    private final Integer errorCode;

    @SerializedName("error_message")
    @Nullable
    private final String errorMessage;

    @SerializedName("fee")
    @Nullable
    private final FeeResponseDto fee;

    @SerializedName("gateway_card_present")
    @Nullable
    private final String gatewayCardPresent;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("iva")
    @Nullable
    private final Double iva;

    @SerializedName("method")
    @NotNull
    private final String method;

    @SerializedName("operation_date")
    @Nullable
    private final String operationDate;

    @SerializedName("operation_type")
    @Nullable
    private final String operationType;

    @SerializedName("order_id")
    @Nullable
    private final String orderId;

    @SerializedName("origin_channel_name")
    @Nullable
    private final String originChannelName;

    @SerializedName("payment_method_name")
    @Nullable
    private final String paymentMethodName;

    @SerializedName("payment_plan")
    @Nullable
    private final PaymentPlanResponseDto paymentPlan;

    @SerializedName("product_type")
    @Nullable
    private final String productType;

    @SerializedName("read_mode")
    @Nullable
    private final String readMode;

    @SerializedName(FirebaseAnalytics.Event.REFUND)
    @Nullable
    private final RefundResponseDto refund;

    @SerializedName("refunds")
    @Nullable
    private final List<RefundResponseDto> refunds;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("taxes")
    @Nullable
    private final List<TaxesResponseDto> taxes;

    @SerializedName(SqlContracts.BulletEntry.TRANSACTION_TYPE)
    @Nullable
    private final String transactionType;

    @SerializedName("voucher_type")
    @Nullable
    private final String voucherType;

    public TransactionResponseDto(@NotNull String id, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String status, @Nullable Boolean bool, @NotNull String creationDate, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, double d2, @Nullable CustomerResponseDto customerResponseDto, @Nullable String str10, @NotNull String method, @Nullable List<RefundResponseDto> list, @Nullable RefundResponseDto refundResponseDto, @Nullable String str11, @Nullable CardResponseDto cardResponseDto, @Nullable String str12, @Nullable Double d3, @Nullable CardPointsResponseDto cardPointsResponseDto, @Nullable FeeResponseDto feeResponseDto, @Nullable String str13, @Nullable String str14, @Nullable Integer num, @Nullable List<TaxesResponseDto> list2, @Nullable String str15, @Nullable PaymentPlanResponseDto paymentPlanResponseDto, @Nullable String str16) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(method, "method");
        this.id = id;
        this.authorization = str;
        this.operationType = str2;
        this.transactionType = str3;
        this.status = status;
        this.conciliated = bool;
        this.creationDate = creationDate;
        this.operationDate = str4;
        this.description = str5;
        this.errorMessage = str6;
        this.customerId = str7;
        this.dueDate = str8;
        this.orderId = str9;
        this.amount = d2;
        this.customer = customerResponseDto;
        this.currency = str10;
        this.method = method;
        this.refunds = list;
        this.refund = refundResponseDto;
        this.gatewayCardPresent = str11;
        this.card = cardResponseDto;
        this.readMode = str12;
        this.iva = d3;
        this.cardPoints = cardPointsResponseDto;
        this.fee = feeResponseDto;
        this.originChannelName = str13;
        this.paymentMethodName = str14;
        this.errorCode = num;
        this.taxes = list2;
        this.voucherType = str15;
        this.paymentPlan = paymentPlanResponseDto;
        this.productType = str16;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    @Nullable
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
    public final CustomerResponseDto getCustomer() {
        return this.customer;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final List<RefundResponseDto> component18() {
        return this.refunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final RefundResponseDto getRefund() {
        return this.refund;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final CardResponseDto getCard() {
        return this.card;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getReadMode() {
        return this.readMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Double getIva() {
        return this.iva;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final CardPointsResponseDto getCardPoints() {
        return this.cardPoints;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final FeeResponseDto getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getOriginChannelName() {
        return this.originChannelName;
    }

    @Nullable
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
    public final List<TaxesResponseDto> component29() {
        return this.taxes;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOperationType() {
        return this.operationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getVoucherType() {
        return this.voucherType;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final PaymentPlanResponseDto getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getConciliated() {
        return this.conciliated;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCreationDate() {
        return this.creationDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOperationDate() {
        return this.operationDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final TransactionResponseDto copy(@NotNull String id, @Nullable String authorization, @Nullable String operationType, @Nullable String transactionType, @NotNull String status, @Nullable Boolean conciliated, @NotNull String creationDate, @Nullable String operationDate, @Nullable String description, @Nullable String errorMessage, @Nullable String customerId, @Nullable String dueDate, @Nullable String orderId, double amount, @Nullable CustomerResponseDto customer, @Nullable String currency, @NotNull String method, @Nullable List<RefundResponseDto> refunds, @Nullable RefundResponseDto refund, @Nullable String gatewayCardPresent, @Nullable CardResponseDto card, @Nullable String readMode, @Nullable Double iva, @Nullable CardPointsResponseDto cardPoints, @Nullable FeeResponseDto fee, @Nullable String originChannelName, @Nullable String paymentMethodName, @Nullable Integer errorCode, @Nullable List<TaxesResponseDto> taxes, @Nullable String voucherType, @Nullable PaymentPlanResponseDto paymentPlan, @Nullable String productType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(method, "method");
        return new TransactionResponseDto(id, authorization, operationType, transactionType, status, conciliated, creationDate, operationDate, description, errorMessage, customerId, dueDate, orderId, amount, customer, currency, method, refunds, refund, gatewayCardPresent, card, readMode, iva, cardPoints, fee, originChannelName, paymentMethodName, errorCode, taxes, voucherType, paymentPlan, productType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionResponseDto)) {
            return false;
        }
        TransactionResponseDto transactionResponseDto = (TransactionResponseDto) other;
        return Intrinsics.areEqual(this.id, transactionResponseDto.id) && Intrinsics.areEqual(this.authorization, transactionResponseDto.authorization) && Intrinsics.areEqual(this.operationType, transactionResponseDto.operationType) && Intrinsics.areEqual(this.transactionType, transactionResponseDto.transactionType) && Intrinsics.areEqual(this.status, transactionResponseDto.status) && Intrinsics.areEqual(this.conciliated, transactionResponseDto.conciliated) && Intrinsics.areEqual(this.creationDate, transactionResponseDto.creationDate) && Intrinsics.areEqual(this.operationDate, transactionResponseDto.operationDate) && Intrinsics.areEqual(this.description, transactionResponseDto.description) && Intrinsics.areEqual(this.errorMessage, transactionResponseDto.errorMessage) && Intrinsics.areEqual(this.customerId, transactionResponseDto.customerId) && Intrinsics.areEqual(this.dueDate, transactionResponseDto.dueDate) && Intrinsics.areEqual(this.orderId, transactionResponseDto.orderId) && Double.compare(this.amount, transactionResponseDto.amount) == 0 && Intrinsics.areEqual(this.customer, transactionResponseDto.customer) && Intrinsics.areEqual(this.currency, transactionResponseDto.currency) && Intrinsics.areEqual(this.method, transactionResponseDto.method) && Intrinsics.areEqual(this.refunds, transactionResponseDto.refunds) && Intrinsics.areEqual(this.refund, transactionResponseDto.refund) && Intrinsics.areEqual(this.gatewayCardPresent, transactionResponseDto.gatewayCardPresent) && Intrinsics.areEqual(this.card, transactionResponseDto.card) && Intrinsics.areEqual(this.readMode, transactionResponseDto.readMode) && Intrinsics.areEqual((Object) this.iva, (Object) transactionResponseDto.iva) && Intrinsics.areEqual(this.cardPoints, transactionResponseDto.cardPoints) && Intrinsics.areEqual(this.fee, transactionResponseDto.fee) && Intrinsics.areEqual(this.originChannelName, transactionResponseDto.originChannelName) && Intrinsics.areEqual(this.paymentMethodName, transactionResponseDto.paymentMethodName) && Intrinsics.areEqual(this.errorCode, transactionResponseDto.errorCode) && Intrinsics.areEqual(this.taxes, transactionResponseDto.taxes) && Intrinsics.areEqual(this.voucherType, transactionResponseDto.voucherType) && Intrinsics.areEqual(this.paymentPlan, transactionResponseDto.paymentPlan) && Intrinsics.areEqual(this.productType, transactionResponseDto.productType);
    }

    public final double getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    public final CardResponseDto getCard() {
        return this.card;
    }

    @Nullable
    public final CardPointsResponseDto getCardPoints() {
        return this.cardPoints;
    }

    @Nullable
    public final Boolean getConciliated() {
        return this.conciliated;
    }

    @NotNull
    public final String getCreationDate() {
        return this.creationDate;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final CustomerResponseDto getCustomer() {
        return this.customer;
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
    public final String getDueDate() {
        return this.dueDate;
    }

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final FeeResponseDto getFee() {
        return this.fee;
    }

    @Nullable
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Double getIva() {
        return this.iva;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getOperationDate() {
        return this.operationDate;
    }

    @Nullable
    public final String getOperationType() {
        return this.operationType;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getOriginChannelName() {
        return this.originChannelName;
    }

    @Nullable
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    public final PaymentPlanResponseDto getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    public final String getReadMode() {
        return this.readMode;
    }

    @Nullable
    public final RefundResponseDto getRefund() {
        return this.refund;
    }

    @Nullable
    public final List<RefundResponseDto> getRefunds() {
        return this.refunds;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<TaxesResponseDto> getTaxes() {
        return this.taxes;
    }

    @Nullable
    public final String getTransactionType() {
        return this.transactionType;
    }

    @Nullable
    public final String getVoucherType() {
        return this.voucherType;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.authorization;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operationType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transactionType;
        int iC = n1.c(this.status, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Boolean bool = this.conciliated;
        int iC2 = n1.c(this.creationDate, (iC + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str4 = this.operationDate;
        int iHashCode4 = (iC2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.errorMessage;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.customerId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dueDate;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.orderId;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i10 = (((iHashCode8 + iHashCode9) * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        CustomerResponseDto customerResponseDto = this.customer;
        int iHashCode10 = (i10 + (customerResponseDto == null ? 0 : customerResponseDto.hashCode())) * 31;
        String str10 = this.currency;
        int iC3 = n1.c(this.method, (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31, 31);
        List<RefundResponseDto> list = this.refunds;
        int iHashCode11 = (iC3 + (list == null ? 0 : list.hashCode())) * 31;
        RefundResponseDto refundResponseDto = this.refund;
        int iHashCode12 = (iHashCode11 + (refundResponseDto == null ? 0 : refundResponseDto.hashCode())) * 31;
        String str11 = this.gatewayCardPresent;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        CardResponseDto cardResponseDto = this.card;
        int iHashCode14 = (iHashCode13 + (cardResponseDto == null ? 0 : cardResponseDto.hashCode())) * 31;
        String str12 = this.readMode;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Double d2 = this.iva;
        int iHashCode16 = (iHashCode15 + (d2 == null ? 0 : d2.hashCode())) * 31;
        CardPointsResponseDto cardPointsResponseDto = this.cardPoints;
        int iHashCode17 = (iHashCode16 + (cardPointsResponseDto == null ? 0 : cardPointsResponseDto.hashCode())) * 31;
        FeeResponseDto feeResponseDto = this.fee;
        int iHashCode18 = (iHashCode17 + (feeResponseDto == null ? 0 : feeResponseDto.hashCode())) * 31;
        String str13 = this.originChannelName;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.paymentMethodName;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num = this.errorCode;
        int iHashCode21 = (iHashCode20 + (num == null ? 0 : num.hashCode())) * 31;
        List<TaxesResponseDto> list2 = this.taxes;
        int iHashCode22 = (iHashCode21 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str15 = this.voucherType;
        int iHashCode23 = (iHashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        PaymentPlanResponseDto paymentPlanResponseDto = this.paymentPlan;
        int iHashCode24 = (iHashCode23 + (paymentPlanResponseDto == null ? 0 : paymentPlanResponseDto.hashCode())) * 31;
        String str16 = this.productType;
        return iHashCode24 + (str16 != null ? str16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.authorization;
        String str3 = this.operationType;
        String str4 = this.transactionType;
        String str5 = this.status;
        Boolean bool = this.conciliated;
        String str6 = this.creationDate;
        String str7 = this.operationDate;
        String str8 = this.description;
        String str9 = this.errorMessage;
        String str10 = this.customerId;
        String str11 = this.dueDate;
        String str12 = this.orderId;
        double d2 = this.amount;
        CustomerResponseDto customerResponseDto = this.customer;
        String str13 = this.currency;
        String str14 = this.method;
        List<RefundResponseDto> list = this.refunds;
        RefundResponseDto refundResponseDto = this.refund;
        String str15 = this.gatewayCardPresent;
        CardResponseDto cardResponseDto = this.card;
        String str16 = this.readMode;
        Double d3 = this.iva;
        CardPointsResponseDto cardPointsResponseDto = this.cardPoints;
        FeeResponseDto feeResponseDto = this.fee;
        String str17 = this.originChannelName;
        String str18 = this.paymentMethodName;
        Integer num = this.errorCode;
        List<TaxesResponseDto> list2 = this.taxes;
        String str19 = this.voucherType;
        PaymentPlanResponseDto paymentPlanResponseDto = this.paymentPlan;
        String str20 = this.productType;
        StringBuilder sbC = a.c("TransactionResponseDto(id=", str, ", authorization=", str2, ", operationType=");
        k.e(sbC, str3, ", transactionType=", str4, ", status=");
        sbC.append(str5);
        sbC.append(", conciliated=");
        sbC.append(bool);
        sbC.append(", creationDate=");
        k.e(sbC, str6, ", operationDate=", str7, ", description=");
        k.e(sbC, str8, ", errorMessage=", str9, ", customerId=");
        k.e(sbC, str10, ", dueDate=", str11, ", orderId=");
        sbC.append(str12);
        sbC.append(", amount=");
        sbC.append(d2);
        sbC.append(", customer=");
        sbC.append(customerResponseDto);
        sbC.append(", currency=");
        sbC.append(str13);
        sbC.append(", method=");
        sbC.append(str14);
        sbC.append(", refunds=");
        sbC.append(list);
        sbC.append(", refund=");
        sbC.append(refundResponseDto);
        sbC.append(", gatewayCardPresent=");
        sbC.append(str15);
        sbC.append(", card=");
        sbC.append(cardResponseDto);
        sbC.append(", readMode=");
        sbC.append(str16);
        sbC.append(", iva=");
        sbC.append(d3);
        sbC.append(", cardPoints=");
        sbC.append(cardPointsResponseDto);
        sbC.append(", fee=");
        sbC.append(feeResponseDto);
        sbC.append(", originChannelName=");
        sbC.append(str17);
        sbC.append(", paymentMethodName=");
        sbC.append(str18);
        sbC.append(", errorCode=");
        sbC.append(num);
        sbC.append(", taxes=");
        sbC.append(list2);
        sbC.append(", voucherType=");
        sbC.append(str19);
        sbC.append(", paymentPlan=");
        sbC.append(paymentPlanResponseDto);
        sbC.append(", productType=");
        sbC.append(str20);
        sbC.append(")");
        return sbC.toString();
    }

    public /* synthetic */ TransactionResponseDto(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, String str12, double d2, CustomerResponseDto customerResponseDto, String str13, String str14, List list, RefundResponseDto refundResponseDto, String str15, CardResponseDto cardResponseDto, String str16, Double d3, CardPointsResponseDto cardPointsResponseDto, FeeResponseDto feeResponseDto, String str17, String str18, Integer num, List list2, String str19, PaymentPlanResponseDto paymentPlanResponseDto, String str20, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? "" : str5, bool, str6, str7, (i10 & 256) != 0 ? null : str8, str9, str10, str11, str12, d2, (i10 & 16384) != 0 ? null : customerResponseDto, str13, str14, (131072 & i10) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, refundResponseDto, str15, (1048576 & i10) != 0 ? null : cardResponseDto, str16, d3, cardPointsResponseDto, feeResponseDto, str17, str18, num, (268435456 & i10) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, str19, (1073741824 & i10) != 0 ? null : paymentPlanResponseDto, (i10 & Integer.MIN_VALUE) != 0 ? null : str20);
    }
}
