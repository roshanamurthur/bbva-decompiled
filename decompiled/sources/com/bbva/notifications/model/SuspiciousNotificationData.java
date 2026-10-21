package com.bbva.notifications.model;

import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.ocrcard.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VariablesMessageData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013¨\u00066"}, d2 = {"Lcom/bbva/notifications/model/SuspiciousNotificationData;", "", "idTran", "", "paymentAmount", PushConstants.AMOUNT, "typeCard", ConstantsKt.CARD_TYPE, ConstantsKt.CARD_NUMBER, "propertyName", "dateOperation", "idTrack", "typeEvent", "alertId", "blockCardOrange", "", "blockDebitCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAlertId", "()Ljava/lang/String;", "getAmount", "getBlockCardOrange", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBlockDebitCard", "getCardNumber", "getCardType", "getDateOperation", "getIdTrack", "getIdTran", "getPaymentAmount", "getPropertyName", "getTypeCard", "getTypeEvent", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/bbva/notifications/model/SuspiciousNotificationData;", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SuspiciousNotificationData {

    @Nullable
    private final String alertId;

    @Nullable
    private final String amount;

    @Nullable
    private final Boolean blockCardOrange;

    @Nullable
    private final Boolean blockDebitCard;

    @Nullable
    private final String cardNumber;

    @Nullable
    private final String cardType;

    @Nullable
    private final String dateOperation;

    @Nullable
    private final String idTrack;

    @Nullable
    private final String idTran;

    @Nullable
    private final String paymentAmount;

    @Nullable
    private final String propertyName;

    @Nullable
    private final String typeCard;

    @Nullable
    private final String typeEvent;

    public SuspiciousNotificationData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdTran() {
        return this.idTran;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTypeEvent() {
        return this.typeEvent;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAlertId() {
        return this.alertId;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getBlockCardOrange() {
        return this.blockCardOrange;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getBlockDebitCard() {
        return this.blockDebitCard;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTypeCard() {
        return this.typeCard;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPropertyName() {
        return this.propertyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDateOperation() {
        return this.dateOperation;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIdTrack() {
        return this.idTrack;
    }

    @NotNull
    public final SuspiciousNotificationData copy(@Nullable String idTran, @Nullable String paymentAmount, @Nullable String amount, @Nullable String typeCard, @Nullable String cardType, @Nullable String cardNumber, @Nullable String propertyName, @Nullable String dateOperation, @Nullable String idTrack, @Nullable String typeEvent, @Nullable String alertId, @Nullable Boolean blockCardOrange, @Nullable Boolean blockDebitCard) {
        return new SuspiciousNotificationData(idTran, paymentAmount, amount, typeCard, cardType, cardNumber, propertyName, dateOperation, idTrack, typeEvent, alertId, blockCardOrange, blockDebitCard);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuspiciousNotificationData)) {
            return false;
        }
        SuspiciousNotificationData suspiciousNotificationData = (SuspiciousNotificationData) other;
        return Intrinsics.areEqual(this.idTran, suspiciousNotificationData.idTran) && Intrinsics.areEqual(this.paymentAmount, suspiciousNotificationData.paymentAmount) && Intrinsics.areEqual(this.amount, suspiciousNotificationData.amount) && Intrinsics.areEqual(this.typeCard, suspiciousNotificationData.typeCard) && Intrinsics.areEqual(this.cardType, suspiciousNotificationData.cardType) && Intrinsics.areEqual(this.cardNumber, suspiciousNotificationData.cardNumber) && Intrinsics.areEqual(this.propertyName, suspiciousNotificationData.propertyName) && Intrinsics.areEqual(this.dateOperation, suspiciousNotificationData.dateOperation) && Intrinsics.areEqual(this.idTrack, suspiciousNotificationData.idTrack) && Intrinsics.areEqual(this.typeEvent, suspiciousNotificationData.typeEvent) && Intrinsics.areEqual(this.alertId, suspiciousNotificationData.alertId) && Intrinsics.areEqual(this.blockCardOrange, suspiciousNotificationData.blockCardOrange) && Intrinsics.areEqual(this.blockDebitCard, suspiciousNotificationData.blockDebitCard);
    }

    @Nullable
    public final String getAlertId() {
        return this.alertId;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final Boolean getBlockCardOrange() {
        return this.blockCardOrange;
    }

    @Nullable
    public final Boolean getBlockDebitCard() {
        return this.blockDebitCard;
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
    public final String getDateOperation() {
        return this.dateOperation;
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
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    @Nullable
    public final String getPropertyName() {
        return this.propertyName;
    }

    @Nullable
    public final String getTypeCard() {
        return this.typeCard;
    }

    @Nullable
    public final String getTypeEvent() {
        return this.typeEvent;
    }

    public int hashCode() {
        String str = this.idTran;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.typeCard;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardNumber;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.propertyName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dateOperation;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.idTrack;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.typeEvent;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.alertId;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.blockCardOrange;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.blockDebitCard;
        return iHashCode12 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.idTran;
        String str2 = this.paymentAmount;
        String str3 = this.amount;
        String str4 = this.typeCard;
        String str5 = this.cardType;
        String str6 = this.cardNumber;
        String str7 = this.propertyName;
        String str8 = this.dateOperation;
        String str9 = this.idTrack;
        String str10 = this.typeEvent;
        String str11 = this.alertId;
        Boolean bool = this.blockCardOrange;
        Boolean bool2 = this.blockDebitCard;
        StringBuilder sbC = a.c("SuspiciousNotificationData(idTran=", str, ", paymentAmount=", str2, ", amount=");
        k.e(sbC, str3, ", typeCard=", str4, ", cardType=");
        k.e(sbC, str5, ", cardNumber=", str6, ", propertyName=");
        k.e(sbC, str7, ", dateOperation=", str8, ", idTrack=");
        k.e(sbC, str9, ", typeEvent=", str10, ", alertId=");
        sbC.append(str11);
        sbC.append(", blockCardOrange=");
        sbC.append(bool);
        sbC.append(", blockDebitCard=");
        sbC.append(bool2);
        sbC.append(")");
        return sbC.toString();
    }

    public SuspiciousNotificationData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.idTran = str;
        this.paymentAmount = str2;
        this.amount = str3;
        this.typeCard = str4;
        this.cardType = str5;
        this.cardNumber = str6;
        this.propertyName = str7;
        this.dateOperation = str8;
        this.idTrack = str9;
        this.typeEvent = str10;
        this.alertId = str11;
        this.blockCardOrange = bool;
        this.blockDebitCard = bool2;
    }

    public /* synthetic */ SuspiciousNotificationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11, (i10 & 2048) != 0 ? null : bool, (i10 & 4096) == 0 ? bool2 : null);
    }
}
