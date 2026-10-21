package mx.openpay.library.domain.model.link;

import androidx.camera.camera2.internal.n1;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.notifications.constants.PushConstants;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.noknok.android.client.appsdk.AppSDKException;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.Card;
import mx.openpay.library.domain.model.CardPoints;
import mx.openpay.library.domain.model.Refund;
import mx.openpay.library.domain.model.eglobal.Fee;
import mx.openpay.library.domain.model.eglobal.PaymentPlan;
import mx.openpay.library.domain.model.transaction.ProductType;
import mx.openpay.library.domain.model.transaction.VoucherType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Transaction.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0082\u0001\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0002\u0012\u0006\u00103\u001a\u00020\u0004\u0012\u0006\u00104\u001a\u00020\u0004\u0012\b\b\u0002\u00105\u001a\u00020\u0004\u0012\u0006\u00106\u001a\u00020\u0004\u0012\u0006\u00107\u001a\u00020\u0004\u0012\b\b\u0002\u00108\u001a\u00020\n\u0012\u0006\u00109\u001a\u00020\u0004\u0012\b\b\u0002\u0010:\u001a\u00020\u0004\u0012\u0006\u0010;\u001a\u00020\u0004\u0012\b\b\u0002\u0010<\u001a\u00020\u0004\u0012\u0006\u0010=\u001a\u00020\u0004\u0012\u0006\u0010>\u001a\u00020\u0004\u0012\u0006\u0010?\u001a\u00020\u0004\u0012\u0006\u0010@\u001a\u00020\u0013\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010B\u001a\u00020\u0004\u0012\u0006\u0010C\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010F\u001a\u00020\u0004\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010H\u001a\u00020\u0004\u0012\b\b\u0002\u0010I\u001a\u00020\u0013\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010$\u0012\u0006\u0010L\u001a\u00020\u0004\u0012\u0006\u0010M\u001a\u00020\u0004\u0012\b\u0010N\u001a\u0004\u0018\u00010(\u0012\u0010\b\u0002\u0010O\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0019\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u000101¢\u0006\u0006\b±\u0001\u0010²\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0013HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\u0012\u0010)\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0019HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010/HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u000101HÆ\u0003Jð\u0002\u0010S\u001a\u00020\u00002\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\n2\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020\u00042\b\b\u0002\u0010@\u001a\u00020\u00132\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010B\u001a\u00020\u00042\b\b\u0002\u0010C\u001a\u00020\u00042\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010F\u001a\u00020\u00042\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u00132\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010L\u001a\u00020\u00042\b\b\u0002\u0010M\u001a\u00020\u00042\n\b\u0002\u0010N\u001a\u0004\u0018\u00010(2\u0010\b\u0002\u0010O\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00192\n\b\u0002\u0010P\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010R\u001a\u0004\u0018\u000101HÆ\u0001¢\u0006\u0004\bS\u0010TJ\t\u0010U\u001a\u00020\u0004HÖ\u0001J\t\u0010V\u001a\u00020(HÖ\u0001J\u0013\u0010X\u001a\u00020\n2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b]\u0010Z\u001a\u0004\b^\u0010\\R\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010Z\u001a\u0004\b`\u0010\\R\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010Z\u001a\u0004\bb\u0010\\R\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010Z\u001a\u0004\bd\u0010\\R\u0017\u00108\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bi\u0010Z\u001a\u0004\bj\u0010\\R\u0017\u0010:\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bk\u0010Z\u001a\u0004\bl\u0010\\R\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010Z\u001a\u0004\bn\u0010\\R\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010Z\u001a\u0004\bp\u0010\\R\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bq\u0010Z\u001a\u0004\br\u0010\\R\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bs\u0010Z\u001a\u0004\bt\u0010\\R\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bu\u0010Z\u001a\u0004\bv\u0010\\R\u0017\u0010@\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0019\u0010A\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0018\u0010B\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b\u007f\u0010Z\u001a\u0005\b\u0080\u0001\u0010\\R\u0019\u0010C\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010Z\u001a\u0005\b\u0082\u0001\u0010\\R!\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001d\u0010E\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010F\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010Z\u001a\u0005\b\u008c\u0001\u0010\\R\u001d\u0010G\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010H\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010Z\u001a\u0005\b\u0092\u0001\u0010\\R\u0019\u0010I\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010x\u001a\u0005\b\u0094\u0001\u0010zR\u001d\u0010J\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001d\u0010K\u001a\u0004\u0018\u00010$8\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010L\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010Z\u001a\u0005\b\u009e\u0001\u0010\\R\u0019\u0010M\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010Z\u001a\u0005\b \u0001\u0010\\R\u001c\u0010N\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000f\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0005\b£\u0001\u0010*R#\u0010O\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00198\u0006¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u0084\u0001\u001a\u0006\b¥\u0001\u0010\u0086\u0001R\u001c\u0010P\u001a\u0004\u0018\u00010-8\u0006¢\u0006\u000f\n\u0005\bx\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\u001d\u0010Q\u001a\u0004\u0018\u00010/8\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u001d\u0010R\u001a\u0004\u0018\u0001018\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001¨\u0006³\u0001"}, d2 = {"Lmx/openpay/library/domain/model/link/Transaction;", "", "Ljava/math/BigDecimal;", "getFirstTaxesAmount", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "", "component14", "Lmx/openpay/library/domain/model/link/Customer;", "component15", "component16", "component17", "", "Lmx/openpay/library/domain/model/Refund;", "component18", "component19", "component20", "Lmx/openpay/library/domain/model/Card;", "component21", "component22", "component23", "Lmx/openpay/library/domain/model/CardPoints;", "component24", "Lmx/openpay/library/domain/model/eglobal/Fee;", "component25", "component26", "component27", "", "component28", "()Ljava/lang/Integer;", "Lmx/openpay/library/domain/model/Taxes;", "component29", "Lmx/openpay/library/domain/model/transaction/VoucherType;", "component30", "Lmx/openpay/library/domain/model/eglobal/PaymentPlan;", "component31", "Lmx/openpay/library/domain/model/transaction/ProductType;", "component32", "id", "authorization", AppSDKException.KEY_OPERATION_TYPE, "transactionType", "status", "conciliated", Constants.creationDate, "operationDate", "description", "errorMessage", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "dueDate", "orderId", PushConstants.AMOUNT, "customer", "currency", "method", "refunds", FirebaseAnalytics.Event.REFUND, "gatewayCardPresent", ValidationConstantsKt.Card, "readMode", "iva", "cardPoints", "fee", "originChannelName", "paymentMethodName", "errorCode", "taxes", "voucherType", "paymentPlan", "productType", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLmx/openpay/library/domain/model/link/Customer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmx/openpay/library/domain/model/Refund;Ljava/lang/String;Lmx/openpay/library/domain/model/Card;Ljava/lang/String;DLmx/openpay/library/domain/model/CardPoints;Lmx/openpay/library/domain/model/eglobal/Fee;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lmx/openpay/library/domain/model/transaction/VoucherType;Lmx/openpay/library/domain/model/eglobal/PaymentPlan;Lmx/openpay/library/domain/model/transaction/ProductType;)Lmx/openpay/library/domain/model/link/Transaction;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getAuthorization", "c", "getOperationType", "d", "getTransactionType", "e", "getStatus", "f", "Z", "getConciliated", "()Z", "g", "getCreationDate", "h", "getOperationDate", "i", "getDescription", "j", "getErrorMessage", "k", "getCustomerId", "l", "getDueDate", "m", "getOrderId", "n", "D", "getAmount", "()D", "o", "Lmx/openpay/library/domain/model/link/Customer;", "getCustomer", "()Lmx/openpay/library/domain/model/link/Customer;", "p", "getCurrency", "q", "getMethod", "r", "Ljava/util/List;", "getRefunds", "()Ljava/util/List;", "s", "Lmx/openpay/library/domain/model/Refund;", "getRefund", "()Lmx/openpay/library/domain/model/Refund;", "t", "getGatewayCardPresent", "u", "Lmx/openpay/library/domain/model/Card;", "getCard", "()Lmx/openpay/library/domain/model/Card;", SharedPrefsStorage.VERSION_KEY, "getReadMode", "w", "getIva", "x", "Lmx/openpay/library/domain/model/CardPoints;", "getCardPoints", "()Lmx/openpay/library/domain/model/CardPoints;", "y", "Lmx/openpay/library/domain/model/eglobal/Fee;", "getFee", "()Lmx/openpay/library/domain/model/eglobal/Fee;", "z", "getOriginChannelName", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getPaymentMethodName", "B", "Ljava/lang/Integer;", "getErrorCode", "C", "getTaxes", "Lmx/openpay/library/domain/model/transaction/VoucherType;", "getVoucherType", "()Lmx/openpay/library/domain/model/transaction/VoucherType;", ExifInterface.LONGITUDE_EAST, "Lmx/openpay/library/domain/model/eglobal/PaymentPlan;", "getPaymentPlan", "()Lmx/openpay/library/domain/model/eglobal/PaymentPlan;", "F", "Lmx/openpay/library/domain/model/transaction/ProductType;", "getProductType", "()Lmx/openpay/library/domain/model/transaction/ProductType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLmx/openpay/library/domain/model/link/Customer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmx/openpay/library/domain/model/Refund;Ljava/lang/String;Lmx/openpay/library/domain/model/Card;Ljava/lang/String;DLmx/openpay/library/domain/model/CardPoints;Lmx/openpay/library/domain/model/eglobal/Fee;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lmx/openpay/library/domain/model/transaction/VoucherType;Lmx/openpay/library/domain/model/eglobal/PaymentPlan;Lmx/openpay/library/domain/model/transaction/ProductType;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Transaction {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final String paymentMethodName;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public final Integer errorCode;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public final List<mx.openpay.library.domain.model.Taxes> taxes;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public final VoucherType voucherType;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public final PaymentPlan paymentPlan;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public final ProductType productType;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String authorization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String operationType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String transactionType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String status;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean conciliated;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String creationDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String operationDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String errorMessage;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String customerId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String dueDate;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final double amount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Customer customer;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currency;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String method;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Refund> refunds;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Refund refund;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String gatewayCardPresent;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Card card;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String readMode;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final double iva;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CardPoints cardPoints;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Fee fee;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String originChannelName;

    public Transaction(@NotNull String id, @NotNull String authorization, @NotNull String operationType, @NotNull String transactionType, @NotNull String status, boolean z10, @NotNull String creationDate, @NotNull String operationDate, @NotNull String description, @NotNull String errorMessage, @NotNull String customerId, @NotNull String dueDate, @NotNull String orderId, double d2, @Nullable Customer customer, @NotNull String currency, @NotNull String method, @NotNull List<Refund> refunds, @Nullable Refund refund, @NotNull String gatewayCardPresent, @Nullable Card card, @NotNull String readMode, double d3, @Nullable CardPoints cardPoints, @Nullable Fee fee, @NotNull String originChannelName, @NotNull String paymentMethodName, @Nullable Integer num, @Nullable List<mx.openpay.library.domain.model.Taxes> list, @Nullable VoucherType voucherType, @Nullable PaymentPlan paymentPlan, @Nullable ProductType productType) {
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
        this.customer = customer;
        this.currency = currency;
        this.method = method;
        this.refunds = refunds;
        this.refund = refund;
        this.gatewayCardPresent = gatewayCardPresent;
        this.card = card;
        this.readMode = readMode;
        this.iva = d3;
        this.cardPoints = cardPoints;
        this.fee = fee;
        this.originChannelName = originChannelName;
        this.paymentMethodName = paymentMethodName;
        this.errorCode = num;
        this.taxes = list;
        this.voucherType = voucherType;
        this.paymentPlan = paymentPlan;
        this.productType = productType;
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
    public final Customer getCustomer() {
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
    public final List<Refund> component18() {
        return this.refunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Refund getRefund() {
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
    public final Card getCard() {
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
    public final CardPoints getCardPoints() {
        return this.cardPoints;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Fee getFee() {
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
    public final List<mx.openpay.library.domain.model.Taxes> component29() {
        return this.taxes;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOperationType() {
        return this.operationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final VoucherType getVoucherType() {
        return this.voucherType;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final PaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final ProductType getProductType() {
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
    public final Transaction copy(@NotNull String id, @NotNull String authorization, @NotNull String operationType, @NotNull String transactionType, @NotNull String status, boolean conciliated, @NotNull String creationDate, @NotNull String operationDate, @NotNull String description, @NotNull String errorMessage, @NotNull String customerId, @NotNull String dueDate, @NotNull String orderId, double amount, @Nullable Customer customer, @NotNull String currency, @NotNull String method, @NotNull List<Refund> refunds, @Nullable Refund refund, @NotNull String gatewayCardPresent, @Nullable Card card, @NotNull String readMode, double iva, @Nullable CardPoints cardPoints, @Nullable Fee fee, @NotNull String originChannelName, @NotNull String paymentMethodName, @Nullable Integer errorCode, @Nullable List<mx.openpay.library.domain.model.Taxes> taxes, @Nullable VoucherType voucherType, @Nullable PaymentPlan paymentPlan, @Nullable ProductType productType) {
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
        return new Transaction(id, authorization, operationType, transactionType, status, conciliated, creationDate, operationDate, description, errorMessage, customerId, dueDate, orderId, amount, customer, currency, method, refunds, refund, gatewayCardPresent, card, readMode, iva, cardPoints, fee, originChannelName, paymentMethodName, errorCode, taxes, voucherType, paymentPlan, productType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) other;
        return Intrinsics.areEqual(this.id, transaction.id) && Intrinsics.areEqual(this.authorization, transaction.authorization) && Intrinsics.areEqual(this.operationType, transaction.operationType) && Intrinsics.areEqual(this.transactionType, transaction.transactionType) && Intrinsics.areEqual(this.status, transaction.status) && this.conciliated == transaction.conciliated && Intrinsics.areEqual(this.creationDate, transaction.creationDate) && Intrinsics.areEqual(this.operationDate, transaction.operationDate) && Intrinsics.areEqual(this.description, transaction.description) && Intrinsics.areEqual(this.errorMessage, transaction.errorMessage) && Intrinsics.areEqual(this.customerId, transaction.customerId) && Intrinsics.areEqual(this.dueDate, transaction.dueDate) && Intrinsics.areEqual(this.orderId, transaction.orderId) && Double.compare(this.amount, transaction.amount) == 0 && Intrinsics.areEqual(this.customer, transaction.customer) && Intrinsics.areEqual(this.currency, transaction.currency) && Intrinsics.areEqual(this.method, transaction.method) && Intrinsics.areEqual(this.refunds, transaction.refunds) && Intrinsics.areEqual(this.refund, transaction.refund) && Intrinsics.areEqual(this.gatewayCardPresent, transaction.gatewayCardPresent) && Intrinsics.areEqual(this.card, transaction.card) && Intrinsics.areEqual(this.readMode, transaction.readMode) && Double.compare(this.iva, transaction.iva) == 0 && Intrinsics.areEqual(this.cardPoints, transaction.cardPoints) && Intrinsics.areEqual(this.fee, transaction.fee) && Intrinsics.areEqual(this.originChannelName, transaction.originChannelName) && Intrinsics.areEqual(this.paymentMethodName, transaction.paymentMethodName) && Intrinsics.areEqual(this.errorCode, transaction.errorCode) && Intrinsics.areEqual(this.taxes, transaction.taxes) && this.voucherType == transaction.voucherType && Intrinsics.areEqual(this.paymentPlan, transaction.paymentPlan) && this.productType == transaction.productType;
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    public final Card getCard() {
        return this.card;
    }

    @Nullable
    public final CardPoints getCardPoints() {
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
    public final Customer getCustomer() {
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
    public final Fee getFee() {
        return this.fee;
    }

    @NotNull
    public final BigDecimal getFirstTaxesAmount() {
        mx.openpay.library.domain.model.Taxes taxes;
        List<mx.openpay.library.domain.model.Taxes> list = this.taxes;
        if (list != null && (taxes = (mx.openpay.library.domain.model.Taxes) CollectionsKt___CollectionsKt.firstOrNull((List) list)) != null) {
            return new BigDecimal(String.valueOf(taxes.getAmount()));
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
    public final PaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    public final ProductType getProductType() {
        return this.productType;
    }

    @NotNull
    public final String getReadMode() {
        return this.readMode;
    }

    @Nullable
    public final Refund getRefund() {
        return this.refund;
    }

    @NotNull
    public final List<Refund> getRefunds() {
        return this.refunds;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<mx.openpay.library.domain.model.Taxes> getTaxes() {
        return this.taxes;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    @Nullable
    public final VoucherType getVoucherType() {
        return this.voucherType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    public int hashCode() {
        int iC = n1.c(this.status, n1.c(this.transactionType, n1.c(this.operationType, n1.c(this.authorization, this.id.hashCode() * 31, 31), 31), 31), 31);
        boolean z10 = this.conciliated;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iC2 = n1.c(this.orderId, n1.c(this.dueDate, n1.c(this.customerId, n1.c(this.errorMessage, n1.c(this.description, n1.c(this.operationDate, n1.c(this.creationDate, (iC + r3) * 31, 31), 31), 31), 31), 31), 31), 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i10 = (iC2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        Customer customer = this.customer;
        int iA = a.a(this.refunds, n1.c(this.method, n1.c(this.currency, (i10 + (customer == null ? 0 : customer.hashCode())) * 31, 31), 31), 31);
        Refund refund = this.refund;
        int iC3 = n1.c(this.gatewayCardPresent, (iA + (refund == null ? 0 : refund.hashCode())) * 31, 31);
        Card card = this.card;
        int iC4 = n1.c(this.readMode, (iC3 + (card == null ? 0 : card.hashCode())) * 31, 31);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.iva);
        int i11 = (iC4 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2))) * 31;
        CardPoints cardPoints = this.cardPoints;
        int iHashCode = (i11 + (cardPoints == null ? 0 : cardPoints.hashCode())) * 31;
        Fee fee = this.fee;
        int iC5 = n1.c(this.paymentMethodName, n1.c(this.originChannelName, (iHashCode + (fee == null ? 0 : fee.hashCode())) * 31, 31), 31);
        Integer num = this.errorCode;
        int iHashCode2 = (iC5 + (num == null ? 0 : num.hashCode())) * 31;
        List<mx.openpay.library.domain.model.Taxes> list = this.taxes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        VoucherType voucherType = this.voucherType;
        int iHashCode4 = (iHashCode3 + (voucherType == null ? 0 : voucherType.hashCode())) * 31;
        PaymentPlan paymentPlan = this.paymentPlan;
        int iHashCode5 = (iHashCode4 + (paymentPlan == null ? 0 : paymentPlan.hashCode())) * 31;
        ProductType productType = this.productType;
        return iHashCode5 + (productType != null ? productType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Transaction(id=" + this.id + ", authorization=" + this.authorization + ", operationType=" + this.operationType + ", transactionType=" + this.transactionType + ", status=" + this.status + ", conciliated=" + this.conciliated + ", creationDate=" + this.creationDate + ", operationDate=" + this.operationDate + ", description=" + this.description + ", errorMessage=" + this.errorMessage + ", customerId=" + this.customerId + ", dueDate=" + this.dueDate + ", orderId=" + this.orderId + ", amount=" + this.amount + ", customer=" + this.customer + ", currency=" + this.currency + ", method=" + this.method + ", refunds=" + this.refunds + ", refund=" + this.refund + ", gatewayCardPresent=" + this.gatewayCardPresent + ", card=" + this.card + ", readMode=" + this.readMode + ", iva=" + this.iva + ", cardPoints=" + this.cardPoints + ", fee=" + this.fee + ", originChannelName=" + this.originChannelName + ", paymentMethodName=" + this.paymentMethodName + ", errorCode=" + this.errorCode + ", taxes=" + this.taxes + ", voucherType=" + this.voucherType + ", paymentPlan=" + this.paymentPlan + ", productType=" + this.productType + ")";
    }

    public /* synthetic */ Transaction(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, double d2, Customer customer, String str13, String str14, List list, Refund refund, String str15, Card card, String str16, double d3, CardPoints cardPoints, Fee fee, String str17, String str18, Integer num, List list2, VoucherType voucherType, PaymentPlan paymentPlan, ProductType productType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? "" : str3, str4, str5, (i10 & 32) != 0 ? false : z10, str6, (i10 & 128) != 0 ? "" : str7, str8, (i10 & 512) != 0 ? "" : str9, str10, str11, str12, d2, (i10 & 16384) != 0 ? null : customer, (32768 & i10) != 0 ? "" : str13, str14, (131072 & i10) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (262144 & i10) != 0 ? null : refund, (524288 & i10) != 0 ? "" : str15, (1048576 & i10) != 0 ? null : card, (2097152 & i10) != 0 ? "" : str16, (4194304 & i10) != 0 ? 0.0d : d3, (8388608 & i10) != 0 ? null : cardPoints, (16777216 & i10) != 0 ? null : fee, str17, str18, num, (268435456 & i10) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (536870912 & i10) != 0 ? null : voucherType, (1073741824 & i10) != 0 ? null : paymentPlan, (i10 & Integer.MIN_VALUE) != 0 ? null : productType);
    }
}
