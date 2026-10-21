package com.bbva.sdkcatalog.openpay.plugin.data.response;

import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.noknok.android.client.appsdk.AppSDKException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayPaymentPlan;
import mx.openpay.library.core.model.OpenPayProductType;
import mx.openpay.library.core.model.extra.CardDTO;
import mx.openpay.library.core.model.extra.FeeResponseDTO;
import mx.openpay.library.core.model.extra.RefundResponseDTO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u000fHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\"HÆ\u0003J²\u0002\u0010^\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"HÆ\u0001¢\u0006\u0002\u0010_J\u0013\u0010`\u001a\u00020\u000f2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020cHÖ\u0001J\t\u0010d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bD\u0010E¨\u0006e"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/response/TransactionResponse;", "", "id", "", "orderId", "description", "status", PushConstants.AMOUNT, "", "currency", "date", "authorization", "span", "readMode", FirebaseAnalytics.Event.REFUND, "", AppSDKException.KEY_OPERATION_TYPE, "method", "transactionType", "paymentMethodName", "gatewayCardPresent", ValidationConstantsKt.Card, "Lmx/openpay/library/core/model/extra/CardDTO;", Constants.creationDate, "errorMessage", "originChannelName", "refunds", "", "Lmx/openpay/library/core/model/extra/RefundResponseDTO;", "fee", "Lmx/openpay/library/core/model/extra/FeeResponseDTO;", "paymentPlan", "Lmx/openpay/library/core/model/OpenPayPaymentPlan;", "productType", "Lmx/openpay/library/core/model/OpenPayProductType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/core/model/extra/CardDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmx/openpay/library/core/model/extra/FeeResponseDTO;Lmx/openpay/library/core/model/OpenPayPaymentPlan;Lmx/openpay/library/core/model/OpenPayProductType;)V", "getId", "()Ljava/lang/String;", "getOrderId", "getDescription", "getStatus", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "getDate", "getAuthorization", "getSpan", "getReadMode", "getRefund", "()Z", "getOperationType", "getMethod", "getTransactionType", "getPaymentMethodName", "getGatewayCardPresent", "getCard", "()Lmx/openpay/library/core/model/extra/CardDTO;", "getCreationDate", "getErrorMessage", "getOriginChannelName", "getRefunds", "()Ljava/util/List;", "getFee", "()Lmx/openpay/library/core/model/extra/FeeResponseDTO;", "getPaymentPlan", "()Lmx/openpay/library/core/model/OpenPayPaymentPlan;", "getProductType", "()Lmx/openpay/library/core/model/OpenPayProductType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/core/model/extra/CardDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmx/openpay/library/core/model/extra/FeeResponseDTO;Lmx/openpay/library/core/model/OpenPayPaymentPlan;Lmx/openpay/library/core/model/OpenPayProductType;)Lcom/bbva/sdkcatalog/openpay/plugin/data/response/TransactionResponse;", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TransactionResponse {

    @Nullable
    private final Double amount;

    @Nullable
    private final String authorization;

    @Nullable
    private final CardDTO card;

    @Nullable
    private final String creationDate;

    @Nullable
    private final String currency;

    @Nullable
    private final String date;

    @Nullable
    private final String description;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final FeeResponseDTO fee;

    @Nullable
    private final String gatewayCardPresent;

    @Nullable
    private final String id;

    @Nullable
    private final String method;

    @Nullable
    private final String operationType;

    @Nullable
    private final String orderId;

    @Nullable
    private final String originChannelName;

    @Nullable
    private final String paymentMethodName;

    @Nullable
    private final OpenPayPaymentPlan paymentPlan;

    @Nullable
    private final OpenPayProductType productType;

    @Nullable
    private final String readMode;
    private final boolean refund;

    @Nullable
    private final List<RefundResponseDTO> refunds;

    @Nullable
    private final String span;

    @Nullable
    private final String status;

    @Nullable
    private final String transactionType;

    public TransactionResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Double d2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z10, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable CardDTO cardDTO, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable List<RefundResponseDTO> list, @Nullable FeeResponseDTO feeResponseDTO, @Nullable OpenPayPaymentPlan openPayPaymentPlan, @Nullable OpenPayProductType openPayProductType) {
        this.id = str;
        this.orderId = str2;
        this.description = str3;
        this.status = str4;
        this.amount = d2;
        this.currency = str5;
        this.date = str6;
        this.authorization = str7;
        this.span = str8;
        this.readMode = str9;
        this.refund = z10;
        this.operationType = str10;
        this.method = str11;
        this.transactionType = str12;
        this.paymentMethodName = str13;
        this.gatewayCardPresent = str14;
        this.card = cardDTO;
        this.creationDate = str15;
        this.errorMessage = str16;
        this.originChannelName = str17;
        this.refunds = list;
        this.fee = feeResponseDTO;
        this.paymentPlan = openPayPaymentPlan;
        this.productType = openPayProductType;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReadMode() {
        return this.readMode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getRefund() {
        return this.refund;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOperationType() {
        return this.operationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final CardDTO getCard() {
        return this.card;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getCreationDate() {
        return this.creationDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getOriginChannelName() {
        return this.originChannelName;
    }

    @Nullable
    public final List<RefundResponseDTO> component21() {
        return this.refunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final FeeResponseDTO getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final OpenPayPaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final OpenPayProductType getProductType() {
        return this.productType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSpan() {
        return this.span;
    }

    @NotNull
    public final TransactionResponse copy(@Nullable String id, @Nullable String orderId, @Nullable String description, @Nullable String status, @Nullable Double amount, @Nullable String currency, @Nullable String date, @Nullable String authorization, @Nullable String span, @Nullable String readMode, boolean refund, @Nullable String operationType, @Nullable String method, @Nullable String transactionType, @Nullable String paymentMethodName, @Nullable String gatewayCardPresent, @Nullable CardDTO card, @Nullable String creationDate, @Nullable String errorMessage, @Nullable String originChannelName, @Nullable List<RefundResponseDTO> refunds, @Nullable FeeResponseDTO fee, @Nullable OpenPayPaymentPlan paymentPlan, @Nullable OpenPayProductType productType) {
        return new TransactionResponse(id, orderId, description, status, amount, currency, date, authorization, span, readMode, refund, operationType, method, transactionType, paymentMethodName, gatewayCardPresent, card, creationDate, errorMessage, originChannelName, refunds, fee, paymentPlan, productType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionResponse)) {
            return false;
        }
        TransactionResponse transactionResponse = (TransactionResponse) other;
        return Intrinsics.areEqual(this.id, transactionResponse.id) && Intrinsics.areEqual(this.orderId, transactionResponse.orderId) && Intrinsics.areEqual(this.description, transactionResponse.description) && Intrinsics.areEqual(this.status, transactionResponse.status) && Intrinsics.areEqual((Object) this.amount, (Object) transactionResponse.amount) && Intrinsics.areEqual(this.currency, transactionResponse.currency) && Intrinsics.areEqual(this.date, transactionResponse.date) && Intrinsics.areEqual(this.authorization, transactionResponse.authorization) && Intrinsics.areEqual(this.span, transactionResponse.span) && Intrinsics.areEqual(this.readMode, transactionResponse.readMode) && this.refund == transactionResponse.refund && Intrinsics.areEqual(this.operationType, transactionResponse.operationType) && Intrinsics.areEqual(this.method, transactionResponse.method) && Intrinsics.areEqual(this.transactionType, transactionResponse.transactionType) && Intrinsics.areEqual(this.paymentMethodName, transactionResponse.paymentMethodName) && Intrinsics.areEqual(this.gatewayCardPresent, transactionResponse.gatewayCardPresent) && Intrinsics.areEqual(this.card, transactionResponse.card) && Intrinsics.areEqual(this.creationDate, transactionResponse.creationDate) && Intrinsics.areEqual(this.errorMessage, transactionResponse.errorMessage) && Intrinsics.areEqual(this.originChannelName, transactionResponse.originChannelName) && Intrinsics.areEqual(this.refunds, transactionResponse.refunds) && Intrinsics.areEqual(this.fee, transactionResponse.fee) && Intrinsics.areEqual(this.paymentPlan, transactionResponse.paymentPlan) && this.productType == transactionResponse.productType;
    }

    @Nullable
    public final Double getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    public final CardDTO getCard() {
        return this.card;
    }

    @Nullable
    public final String getCreationDate() {
        return this.creationDate;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final FeeResponseDTO getFee() {
        return this.fee;
    }

    @Nullable
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
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
    public final OpenPayPaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    public final OpenPayProductType getProductType() {
        return this.productType;
    }

    @Nullable
    public final String getReadMode() {
        return this.readMode;
    }

    public final boolean getRefund() {
        return this.refund;
    }

    @Nullable
    public final List<RefundResponseDTO> getRefunds() {
        return this.refunds;
    }

    @Nullable
    public final String getSpan() {
        return this.span;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.status;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d2 = this.amount;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.date;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.authorization;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.span;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.readMode;
        int iHashCode10 = (((iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31) + (this.refund ? 1231 : 1237)) * 31;
        String str10 = this.operationType;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.method;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.transactionType;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.paymentMethodName;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.gatewayCardPresent;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        CardDTO cardDTO = this.card;
        int iHashCode16 = (iHashCode15 + (cardDTO == null ? 0 : cardDTO.hashCode())) * 31;
        String str15 = this.creationDate;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.errorMessage;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.originChannelName;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        List<RefundResponseDTO> list = this.refunds;
        int iHashCode20 = (iHashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        FeeResponseDTO feeResponseDTO = this.fee;
        int iHashCode21 = (iHashCode20 + (feeResponseDTO == null ? 0 : feeResponseDTO.hashCode())) * 31;
        OpenPayPaymentPlan openPayPaymentPlan = this.paymentPlan;
        int iHashCode22 = (iHashCode21 + (openPayPaymentPlan == null ? 0 : openPayPaymentPlan.hashCode())) * 31;
        OpenPayProductType openPayProductType = this.productType;
        return iHashCode22 + (openPayProductType != null ? openPayProductType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.orderId;
        String str3 = this.description;
        String str4 = this.status;
        Double d2 = this.amount;
        String str5 = this.currency;
        String str6 = this.date;
        String str7 = this.authorization;
        String str8 = this.span;
        String str9 = this.readMode;
        boolean z10 = this.refund;
        String str10 = this.operationType;
        String str11 = this.method;
        String str12 = this.transactionType;
        String str13 = this.paymentMethodName;
        String str14 = this.gatewayCardPresent;
        CardDTO cardDTO = this.card;
        String str15 = this.creationDate;
        String str16 = this.errorMessage;
        String str17 = this.originChannelName;
        List<RefundResponseDTO> list = this.refunds;
        FeeResponseDTO feeResponseDTO = this.fee;
        OpenPayPaymentPlan openPayPaymentPlan = this.paymentPlan;
        OpenPayProductType openPayProductType = this.productType;
        StringBuilder sbC = a.c("TransactionResponse(id=", str, ", orderId=", str2, ", description=");
        k.e(sbC, str3, ", status=", str4, ", amount=");
        sbC.append(d2);
        sbC.append(", currency=");
        sbC.append(str5);
        sbC.append(", date=");
        k.e(sbC, str6, ", authorization=", str7, ", span=");
        k.e(sbC, str8, ", readMode=", str9, ", refund=");
        sbC.append(z10);
        sbC.append(", operationType=");
        sbC.append(str10);
        sbC.append(", method=");
        k.e(sbC, str11, ", transactionType=", str12, ", paymentMethodName=");
        k.e(sbC, str13, ", gatewayCardPresent=", str14, ", card=");
        sbC.append(cardDTO);
        sbC.append(", creationDate=");
        sbC.append(str15);
        sbC.append(", errorMessage=");
        k.e(sbC, str16, ", originChannelName=", str17, ", refunds=");
        sbC.append(list);
        sbC.append(", fee=");
        sbC.append(feeResponseDTO);
        sbC.append(", paymentPlan=");
        sbC.append(openPayPaymentPlan);
        sbC.append(", productType=");
        sbC.append(openPayProductType);
        sbC.append(")");
        return sbC.toString();
    }
}
