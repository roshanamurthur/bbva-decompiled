package com.bbva.notifications.model;

import ad.d;
import androidx.annotation.Keep;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.ocrcard.utils.ConstantsKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VariablesMessageData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0085\u0002\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020SHÖ\u0001J\t\u0010T\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006U"}, d2 = {"Lcom/bbva/notifications/model/VariablesMessageData;", "", "badge", "", "money", "Lcom/bbva/notifications/model/Money;", "sendDate", "sound", PushConstants.GE_TYPE_NOTIFICATION, "Lcom/bbva/notifications/model/TypeNotification;", "id", "message", "Lcom/bbva/notifications/model/Message;", PushConstants.AMOUNT, "eventId", "idQuote", "myBanker", "secureProduct", "effectiveDate", "idTran", "idTrack", ConstantsKt.CARD_TYPE, ConstantsKt.CARD_NUMBER, "paymentAmount", "suspicionNotification", "Lcom/bbva/notifications/model/SuspiciousNotificationData;", "deferredSignature", "Lcom/bbva/notifications/model/DeferredSignatureData;", "amountType", "(Ljava/lang/String;Lcom/bbva/notifications/model/Money;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/notifications/model/TypeNotification;Ljava/lang/String;Lcom/bbva/notifications/model/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/notifications/model/SuspiciousNotificationData;Lcom/bbva/notifications/model/DeferredSignatureData;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getAmountType", "getBadge", "getCardNumber", "getCardType", "getDeferredSignature", "()Lcom/bbva/notifications/model/DeferredSignatureData;", "getEffectiveDate", "getEventId", "getId", "getIdQuote", "getIdTrack", "getIdTran", "getMessage", "()Lcom/bbva/notifications/model/Message;", "getMoney", "()Lcom/bbva/notifications/model/Money;", "getMyBanker", "getPaymentAmount", "getSecureProduct", "getSendDate", "getSound", "getSuspicionNotification", "()Lcom/bbva/notifications/model/SuspiciousNotificationData;", "getTypeNotification", "()Lcom/bbva/notifications/model/TypeNotification;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VariablesMessageData {

    @Nullable
    private final String amount;

    @Nullable
    private final String amountType;

    @Nullable
    private final String badge;

    @Nullable
    private final String cardNumber;

    @Nullable
    private final String cardType;

    @Nullable
    private final DeferredSignatureData deferredSignature;

    @SerializedName("fechaVigencia")
    @Nullable
    private final String effectiveDate;

    @Nullable
    private final String eventId;

    @Nullable
    private final String id;

    @SerializedName("idCotiza")
    @Nullable
    private final String idQuote;

    @Nullable
    private final String idTrack;

    @Nullable
    private final String idTran;

    @Nullable
    private final Message message;

    @Nullable
    private final Money money;

    @SerializedName("miBanquero")
    @Nullable
    private final String myBanker;

    @Nullable
    private final String paymentAmount;

    @SerializedName("productoSeguro")
    @Nullable
    private final String secureProduct;

    @Nullable
    private final String sendDate;

    @Nullable
    private final String sound;

    @Nullable
    private final SuspiciousNotificationData suspicionNotification;

    @Nullable
    private final TypeNotification typeNotification;

    public VariablesMessageData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIdQuote() {
        return this.idQuote;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMyBanker() {
        return this.myBanker;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSecureProduct() {
        return this.secureProduct;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getEffectiveDate() {
        return this.effectiveDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getIdTran() {
        return this.idTran;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIdTrack() {
        return this.idTrack;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final SuspiciousNotificationData getSuspicionNotification() {
        return this.suspicionNotification;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final DeferredSignatureData getDeferredSignature() {
        return this.deferredSignature;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getAmountType() {
        return this.amountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSendDate() {
        return this.sendDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSound() {
        return this.sound;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TypeNotification getTypeNotification() {
        return this.typeNotification;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final VariablesMessageData copy(@Nullable String badge, @Nullable Money money, @Nullable String sendDate, @Nullable String sound, @Nullable TypeNotification typeNotification, @Nullable String id, @Nullable Message message, @Nullable String amount, @Nullable String eventId, @Nullable String idQuote, @Nullable String myBanker, @Nullable String secureProduct, @Nullable String effectiveDate, @Nullable String idTran, @Nullable String idTrack, @Nullable String cardType, @Nullable String cardNumber, @Nullable String paymentAmount, @Nullable SuspiciousNotificationData suspicionNotification, @Nullable DeferredSignatureData deferredSignature, @Nullable String amountType) {
        return new VariablesMessageData(badge, money, sendDate, sound, typeNotification, id, message, amount, eventId, idQuote, myBanker, secureProduct, effectiveDate, idTran, idTrack, cardType, cardNumber, paymentAmount, suspicionNotification, deferredSignature, amountType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VariablesMessageData)) {
            return false;
        }
        VariablesMessageData variablesMessageData = (VariablesMessageData) other;
        return Intrinsics.areEqual(this.badge, variablesMessageData.badge) && Intrinsics.areEqual(this.money, variablesMessageData.money) && Intrinsics.areEqual(this.sendDate, variablesMessageData.sendDate) && Intrinsics.areEqual(this.sound, variablesMessageData.sound) && Intrinsics.areEqual(this.typeNotification, variablesMessageData.typeNotification) && Intrinsics.areEqual(this.id, variablesMessageData.id) && Intrinsics.areEqual(this.message, variablesMessageData.message) && Intrinsics.areEqual(this.amount, variablesMessageData.amount) && Intrinsics.areEqual(this.eventId, variablesMessageData.eventId) && Intrinsics.areEqual(this.idQuote, variablesMessageData.idQuote) && Intrinsics.areEqual(this.myBanker, variablesMessageData.myBanker) && Intrinsics.areEqual(this.secureProduct, variablesMessageData.secureProduct) && Intrinsics.areEqual(this.effectiveDate, variablesMessageData.effectiveDate) && Intrinsics.areEqual(this.idTran, variablesMessageData.idTran) && Intrinsics.areEqual(this.idTrack, variablesMessageData.idTrack) && Intrinsics.areEqual(this.cardType, variablesMessageData.cardType) && Intrinsics.areEqual(this.cardNumber, variablesMessageData.cardNumber) && Intrinsics.areEqual(this.paymentAmount, variablesMessageData.paymentAmount) && Intrinsics.areEqual(this.suspicionNotification, variablesMessageData.suspicionNotification) && Intrinsics.areEqual(this.deferredSignature, variablesMessageData.deferredSignature) && Intrinsics.areEqual(this.amountType, variablesMessageData.amountType);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getAmountType() {
        return this.amountType;
    }

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    @Nullable
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    public final DeferredSignatureData getDeferredSignature() {
        return this.deferredSignature;
    }

    @Nullable
    public final String getEffectiveDate() {
        return this.effectiveDate;
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
    public final String getIdQuote() {
        return this.idQuote;
    }

    @Nullable
    public final String getIdTrack() {
        return this.idTrack;
    }

    @Nullable
    public final String getIdTran() {
        return this.idTran;
    }

    @Nullable
    public final Message getMessage() {
        return this.message;
    }

    @Nullable
    public final Money getMoney() {
        return this.money;
    }

    @Nullable
    public final String getMyBanker() {
        return this.myBanker;
    }

    @Nullable
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    @Nullable
    public final String getSecureProduct() {
        return this.secureProduct;
    }

    @Nullable
    public final String getSendDate() {
        return this.sendDate;
    }

    @Nullable
    public final String getSound() {
        return this.sound;
    }

    @Nullable
    public final SuspiciousNotificationData getSuspicionNotification() {
        return this.suspicionNotification;
    }

    @Nullable
    public final TypeNotification getTypeNotification() {
        return this.typeNotification;
    }

    public int hashCode() {
        String str = this.badge;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Money money = this.money;
        int iHashCode2 = (iHashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str2 = this.sendDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sound;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TypeNotification typeNotification = this.typeNotification;
        int iHashCode5 = (iHashCode4 + (typeNotification == null ? 0 : typeNotification.hashCode())) * 31;
        String str4 = this.id;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Message message = this.message;
        int iHashCode7 = (iHashCode6 + (message == null ? 0 : message.hashCode())) * 31;
        String str5 = this.amount;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eventId;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.idQuote;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.myBanker;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.secureProduct;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.effectiveDate;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.idTran;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.idTrack;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.cardType;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.cardNumber;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.paymentAmount;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        SuspiciousNotificationData suspiciousNotificationData = this.suspicionNotification;
        int iHashCode19 = (iHashCode18 + (suspiciousNotificationData == null ? 0 : suspiciousNotificationData.hashCode())) * 31;
        DeferredSignatureData deferredSignatureData = this.deferredSignature;
        int iHashCode20 = (iHashCode19 + (deferredSignatureData == null ? 0 : deferredSignatureData.hashCode())) * 31;
        String str16 = this.amountType;
        return iHashCode20 + (str16 != null ? str16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.badge;
        Money money = this.money;
        String str2 = this.sendDate;
        String str3 = this.sound;
        TypeNotification typeNotification = this.typeNotification;
        String str4 = this.id;
        Message message = this.message;
        String str5 = this.amount;
        String str6 = this.eventId;
        String str7 = this.idQuote;
        String str8 = this.myBanker;
        String str9 = this.secureProduct;
        String str10 = this.effectiveDate;
        String str11 = this.idTran;
        String str12 = this.idTrack;
        String str13 = this.cardType;
        String str14 = this.cardNumber;
        String str15 = this.paymentAmount;
        SuspiciousNotificationData suspiciousNotificationData = this.suspicionNotification;
        DeferredSignatureData deferredSignatureData = this.deferredSignature;
        String str16 = this.amountType;
        StringBuilder sb2 = new StringBuilder("VariablesMessageData(badge=");
        sb2.append(str);
        sb2.append(", money=");
        sb2.append(money);
        sb2.append(", sendDate=");
        k.e(sb2, str2, ", sound=", str3, ", typeNotification=");
        sb2.append(typeNotification);
        sb2.append(", id=");
        sb2.append(str4);
        sb2.append(", message=");
        sb2.append(message);
        sb2.append(", amount=");
        sb2.append(str5);
        sb2.append(", eventId=");
        k.e(sb2, str6, ", idQuote=", str7, ", myBanker=");
        k.e(sb2, str8, ", secureProduct=", str9, ", effectiveDate=");
        k.e(sb2, str10, ", idTran=", str11, ", idTrack=");
        k.e(sb2, str12, ", cardType=", str13, ", cardNumber=");
        k.e(sb2, str14, ", paymentAmount=", str15, ", suspicionNotification=");
        sb2.append(suspiciousNotificationData);
        sb2.append(", deferredSignature=");
        sb2.append(deferredSignatureData);
        sb2.append(", amountType=");
        return d.f(sb2, str16, ")");
    }

    public VariablesMessageData(@Nullable String str, @Nullable Money money, @Nullable String str2, @Nullable String str3, @Nullable TypeNotification typeNotification, @Nullable String str4, @Nullable Message message, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable SuspiciousNotificationData suspiciousNotificationData, @Nullable DeferredSignatureData deferredSignatureData, @Nullable String str16) {
        this.badge = str;
        this.money = money;
        this.sendDate = str2;
        this.sound = str3;
        this.typeNotification = typeNotification;
        this.id = str4;
        this.message = message;
        this.amount = str5;
        this.eventId = str6;
        this.idQuote = str7;
        this.myBanker = str8;
        this.secureProduct = str9;
        this.effectiveDate = str10;
        this.idTran = str11;
        this.idTrack = str12;
        this.cardType = str13;
        this.cardNumber = str14;
        this.paymentAmount = str15;
        this.suspicionNotification = suspiciousNotificationData;
        this.deferredSignature = deferredSignatureData;
        this.amountType = str16;
    }

    public /* synthetic */ VariablesMessageData(String str, Money money, String str2, String str3, TypeNotification typeNotification, String str4, Message message, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, SuspiciousNotificationData suspiciousNotificationData, DeferredSignatureData deferredSignatureData, String str16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : money, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : typeNotification, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : message, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? null : str7, (i10 & 1024) != 0 ? null : str8, (i10 & 2048) != 0 ? null : str9, (i10 & 4096) != 0 ? null : str10, (i10 & 8192) != 0 ? null : str11, (i10 & 16384) != 0 ? null : str12, (i10 & 32768) != 0 ? null : str13, (i10 & 65536) != 0 ? null : str14, (i10 & 131072) != 0 ? null : str15, (i10 & 262144) != 0 ? null : suspiciousNotificationData, (i10 & 524288) != 0 ? null : deferredSignatureData, (i10 & 1048576) != 0 ? null : str16);
    }
}
