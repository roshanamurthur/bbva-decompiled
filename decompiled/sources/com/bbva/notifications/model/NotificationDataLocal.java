package com.bbva.notifications.model;

import ad.d;
import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bbva.document.scanner.plugin.command.PreviewDocumentCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationDataLocal.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bY\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010#J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jý\u0002\u0010g\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010h\u001a\u00020i2\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020lHÖ\u0001J\t\u0010m\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010%\"\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010%\"\u0004\bD\u0010-R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bF\u0010G¨\u0006n"}, d2 = {"Lcom/bbva/notifications/model/NotificationDataLocal;", "", "deeplink", "", "eventId", PushConstants.GE_TYPE_NOTIFICATION, "action1", "action2", "action3", "action4", "action5", "action6", "title", "message", PushConstants.GE_VARIABLES, "Lcom/bbva/notifications/model/VariablesMessageData;", GoogleTapAndPay.KEY_ALIAS, PushConstants.AMOUNT, "paymentAmount", "atmFolio", "atmId", "badge", "contact", "currency", "currentBalance", "date", "id", "operation", PreviewDocumentCommand.ID, "productNumber", "productType", "sound", "type", "store", "subType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/notifications/model/VariablesMessageData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction1", "()Ljava/lang/String;", "getAction2", "getAction3", "getAction4", "getAction5", "getAction6", "getAlias", "setAlias", "(Ljava/lang/String;)V", "getAmount", "getAtmFolio", "getAtmId", "getBadge", "getContact", "getCurrency", "getCurrentBalance", "getDate", "getDeeplink", "getEventId", "getId", "getMessage", "getOperation", "getPaymentAmount", "getPreview", "getProductNumber", "getProductType", "getSound", "getStore", "getSubType", "getTitle", "getType", "setType", "getTypeNotification", "getVariables", "()Lcom/bbva/notifications/model/VariablesMessageData;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NotificationDataLocal {

    @Nullable
    private final String action1;

    @Nullable
    private final String action2;

    @Nullable
    private final String action3;

    @Nullable
    private final String action4;

    @Nullable
    private final String action5;

    @Nullable
    private final String action6;

    @Nullable
    private String alias;

    @Nullable
    private final String amount;

    @SerializedName("atm-folio")
    @Nullable
    private final String atmFolio;

    @SerializedName("atm-id")
    @Nullable
    private final String atmId;

    @Nullable
    private final String badge;

    @Nullable
    private final String contact;

    @Nullable
    private final String currency;

    @SerializedName("current-balance")
    @Nullable
    private final String currentBalance;

    @Nullable
    private final String date;

    @Nullable
    private final String deeplink;

    @Nullable
    private final String eventId;

    @Nullable
    private final String id;

    @Nullable
    private final String message;

    @Nullable
    private final String operation;

    @Nullable
    private final String paymentAmount;

    @Nullable
    private final String preview;

    @SerializedName("product-number")
    @Nullable
    private final String productNumber;

    @SerializedName("product-type")
    @Nullable
    private final String productType;

    @Nullable
    private final String sound;

    @Nullable
    private final String store;

    @Nullable
    private final String subType;

    @Nullable
    private final String title;

    @Nullable
    private String type;

    @Nullable
    private final String typeNotification;

    @Nullable
    private final VariablesMessageData variables;

    public NotificationDataLocal() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final VariablesMessageData getVariables() {
        return this.variables;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAtmFolio() {
        return this.atmFolio;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getAtmId() {
        return this.atmId;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getContact() {
        return this.contact;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getCurrentBalance() {
        return this.currentBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getOperation() {
        return this.operation;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPreview() {
        return this.preview;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getProductNumber() {
        return this.productNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getSound() {
        return this.sound;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTypeNotification() {
        return this.typeNotification;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getStore() {
        return this.store;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAction1() {
        return this.action1;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAction2() {
        return this.action2;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAction3() {
        return this.action3;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAction4() {
        return this.action4;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAction5() {
        return this.action5;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAction6() {
        return this.action6;
    }

    @NotNull
    public final NotificationDataLocal copy(@Nullable String deeplink, @Nullable String eventId, @Nullable String typeNotification, @Nullable String action1, @Nullable String action2, @Nullable String action3, @Nullable String action4, @Nullable String action5, @Nullable String action6, @Nullable String title, @Nullable String message, @Nullable VariablesMessageData variables, @Nullable String alias, @Nullable String amount, @Nullable String paymentAmount, @Nullable String atmFolio, @Nullable String atmId, @Nullable String badge, @Nullable String contact, @Nullable String currency, @Nullable String currentBalance, @Nullable String date, @Nullable String id, @Nullable String operation, @Nullable String preview, @Nullable String productNumber, @Nullable String productType, @Nullable String sound, @Nullable String type, @Nullable String store, @Nullable String subType) {
        return new NotificationDataLocal(deeplink, eventId, typeNotification, action1, action2, action3, action4, action5, action6, title, message, variables, alias, amount, paymentAmount, atmFolio, atmId, badge, contact, currency, currentBalance, date, id, operation, preview, productNumber, productType, sound, type, store, subType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationDataLocal)) {
            return false;
        }
        NotificationDataLocal notificationDataLocal = (NotificationDataLocal) other;
        return Intrinsics.areEqual(this.deeplink, notificationDataLocal.deeplink) && Intrinsics.areEqual(this.eventId, notificationDataLocal.eventId) && Intrinsics.areEqual(this.typeNotification, notificationDataLocal.typeNotification) && Intrinsics.areEqual(this.action1, notificationDataLocal.action1) && Intrinsics.areEqual(this.action2, notificationDataLocal.action2) && Intrinsics.areEqual(this.action3, notificationDataLocal.action3) && Intrinsics.areEqual(this.action4, notificationDataLocal.action4) && Intrinsics.areEqual(this.action5, notificationDataLocal.action5) && Intrinsics.areEqual(this.action6, notificationDataLocal.action6) && Intrinsics.areEqual(this.title, notificationDataLocal.title) && Intrinsics.areEqual(this.message, notificationDataLocal.message) && Intrinsics.areEqual(this.variables, notificationDataLocal.variables) && Intrinsics.areEqual(this.alias, notificationDataLocal.alias) && Intrinsics.areEqual(this.amount, notificationDataLocal.amount) && Intrinsics.areEqual(this.paymentAmount, notificationDataLocal.paymentAmount) && Intrinsics.areEqual(this.atmFolio, notificationDataLocal.atmFolio) && Intrinsics.areEqual(this.atmId, notificationDataLocal.atmId) && Intrinsics.areEqual(this.badge, notificationDataLocal.badge) && Intrinsics.areEqual(this.contact, notificationDataLocal.contact) && Intrinsics.areEqual(this.currency, notificationDataLocal.currency) && Intrinsics.areEqual(this.currentBalance, notificationDataLocal.currentBalance) && Intrinsics.areEqual(this.date, notificationDataLocal.date) && Intrinsics.areEqual(this.id, notificationDataLocal.id) && Intrinsics.areEqual(this.operation, notificationDataLocal.operation) && Intrinsics.areEqual(this.preview, notificationDataLocal.preview) && Intrinsics.areEqual(this.productNumber, notificationDataLocal.productNumber) && Intrinsics.areEqual(this.productType, notificationDataLocal.productType) && Intrinsics.areEqual(this.sound, notificationDataLocal.sound) && Intrinsics.areEqual(this.type, notificationDataLocal.type) && Intrinsics.areEqual(this.store, notificationDataLocal.store) && Intrinsics.areEqual(this.subType, notificationDataLocal.subType);
    }

    @Nullable
    public final String getAction1() {
        return this.action1;
    }

    @Nullable
    public final String getAction2() {
        return this.action2;
    }

    @Nullable
    public final String getAction3() {
        return this.action3;
    }

    @Nullable
    public final String getAction4() {
        return this.action4;
    }

    @Nullable
    public final String getAction5() {
        return this.action5;
    }

    @Nullable
    public final String getAction6() {
        return this.action6;
    }

    @Nullable
    public final String getAlias() {
        return this.alias;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getAtmFolio() {
        return this.atmFolio;
    }

    @Nullable
    public final String getAtmId() {
        return this.atmId;
    }

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    @Nullable
    public final String getContact() {
        return this.contact;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrentBalance() {
        return this.currentBalance;
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getDeeplink() {
        return this.deeplink;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getOperation() {
        return this.operation;
    }

    @Nullable
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    @Nullable
    public final String getPreview() {
        return this.preview;
    }

    @Nullable
    public final String getProductNumber() {
        return this.productNumber;
    }

    @Nullable
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    public final String getSound() {
        return this.sound;
    }

    @Nullable
    public final String getStore() {
        return this.store;
    }

    @Nullable
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getTypeNotification() {
        return this.typeNotification;
    }

    @Nullable
    public final VariablesMessageData getVariables() {
        return this.variables;
    }

    public int hashCode() {
        String str = this.deeplink;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.typeNotification;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.action1;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.action2;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.action3;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.action4;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.action5;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.action6;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.title;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.message;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        VariablesMessageData variablesMessageData = this.variables;
        int iHashCode12 = (iHashCode11 + (variablesMessageData == null ? 0 : variablesMessageData.hashCode())) * 31;
        String str12 = this.alias;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.amount;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.paymentAmount;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.atmFolio;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.atmId;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.badge;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.contact;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.currency;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.currentBalance;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.date;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.id;
        int iHashCode23 = (iHashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.operation;
        int iHashCode24 = (iHashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.preview;
        int iHashCode25 = (iHashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.productNumber;
        int iHashCode26 = (iHashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.productType;
        int iHashCode27 = (iHashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.sound;
        int iHashCode28 = (iHashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.type;
        int iHashCode29 = (iHashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.store;
        int iHashCode30 = (iHashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.subType;
        return iHashCode30 + (str30 != null ? str30.hashCode() : 0);
    }

    public final void setAlias(@Nullable String str) {
        this.alias = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.deeplink;
        String str2 = this.eventId;
        String str3 = this.typeNotification;
        String str4 = this.action1;
        String str5 = this.action2;
        String str6 = this.action3;
        String str7 = this.action4;
        String str8 = this.action5;
        String str9 = this.action6;
        String str10 = this.title;
        String str11 = this.message;
        VariablesMessageData variablesMessageData = this.variables;
        String str12 = this.alias;
        String str13 = this.amount;
        String str14 = this.paymentAmount;
        String str15 = this.atmFolio;
        String str16 = this.atmId;
        String str17 = this.badge;
        String str18 = this.contact;
        String str19 = this.currency;
        String str20 = this.currentBalance;
        String str21 = this.date;
        String str22 = this.id;
        String str23 = this.operation;
        String str24 = this.preview;
        String str25 = this.productNumber;
        String str26 = this.productType;
        String str27 = this.sound;
        String str28 = this.type;
        String str29 = this.store;
        String str30 = this.subType;
        StringBuilder sbC = a.c("NotificationDataLocal(deeplink=", str, ", eventId=", str2, ", typeNotification=");
        k.e(sbC, str3, ", action1=", str4, ", action2=");
        k.e(sbC, str5, ", action3=", str6, ", action4=");
        k.e(sbC, str7, ", action5=", str8, ", action6=");
        k.e(sbC, str9, ", title=", str10, ", message=");
        sbC.append(str11);
        sbC.append(", variables=");
        sbC.append(variablesMessageData);
        sbC.append(", alias=");
        k.e(sbC, str12, ", amount=", str13, ", paymentAmount=");
        k.e(sbC, str14, ", atmFolio=", str15, ", atmId=");
        k.e(sbC, str16, ", badge=", str17, ", contact=");
        k.e(sbC, str18, ", currency=", str19, ", currentBalance=");
        k.e(sbC, str20, ", date=", str21, ", id=");
        k.e(sbC, str22, ", operation=", str23, ", preview=");
        k.e(sbC, str24, ", productNumber=", str25, ", productType=");
        k.e(sbC, str26, ", sound=", str27, ", type=");
        k.e(sbC, str28, ", store=", str29, ", subType=");
        return d.f(sbC, str30, ")");
    }

    public NotificationDataLocal(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable VariablesMessageData variablesMessageData, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30) {
        this.deeplink = str;
        this.eventId = str2;
        this.typeNotification = str3;
        this.action1 = str4;
        this.action2 = str5;
        this.action3 = str6;
        this.action4 = str7;
        this.action5 = str8;
        this.action6 = str9;
        this.title = str10;
        this.message = str11;
        this.variables = variablesMessageData;
        this.alias = str12;
        this.amount = str13;
        this.paymentAmount = str14;
        this.atmFolio = str15;
        this.atmId = str16;
        this.badge = str17;
        this.contact = str18;
        this.currency = str19;
        this.currentBalance = str20;
        this.date = str21;
        this.id = str22;
        this.operation = str23;
        this.preview = str24;
        this.productNumber = str25;
        this.productType = str26;
        this.sound = str27;
        this.type = str28;
        this.store = str29;
        this.subType = str30;
    }

    public /* synthetic */ NotificationDataLocal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, VariablesMessageData variablesMessageData, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11, (i10 & 2048) != 0 ? null : variablesMessageData, (i10 & 4096) != 0 ? null : str12, (i10 & 8192) != 0 ? null : str13, (i10 & 16384) != 0 ? null : str14, (i10 & 32768) != 0 ? null : str15, (i10 & 65536) != 0 ? null : str16, (i10 & 131072) != 0 ? null : str17, (i10 & 262144) != 0 ? null : str18, (i10 & 524288) != 0 ? null : str19, (i10 & 1048576) != 0 ? null : str20, (i10 & 2097152) != 0 ? null : str21, (i10 & 4194304) != 0 ? null : str22, (i10 & 8388608) != 0 ? null : str23, (i10 & 16777216) != 0 ? null : str24, (i10 & 33554432) != 0 ? null : str25, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : str26, (i10 & 134217728) != 0 ? null : str27, (i10 & 268435456) != 0 ? null : str28, (i10 & PKIFailureInfo.duplicateCertReq) != 0 ? null : str29, (i10 & 1073741824) != 0 ? null : str30);
    }
}
