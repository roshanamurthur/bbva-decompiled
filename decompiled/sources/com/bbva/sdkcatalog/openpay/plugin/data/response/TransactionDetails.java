package com.bbva.sdkcatalog.openpay.plugin.data.response;

import androidx.annotation.Keep;
import androidx.collection.k;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentLinkListingResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0086\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001c\u0010\u0011¨\u0006/"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/response/TransactionDetails;", "", PushConstants.AMOUNT, "", "authorization", "", "method", "status", "id", Constants.creationDate, "description", "errorMessage", "orderID", "iva", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAuthorization", "()Ljava/lang/String;", "getMethod", "getStatus", "getId", "getCreationDate", "getDescription", "getErrorMessage", "getOrderID", "getIva", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/bbva/sdkcatalog/openpay/plugin/data/response/TransactionDetails;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TransactionDetails {

    @Nullable
    private final Double amount;

    @Nullable
    private final String authorization;

    @Nullable
    private final String creationDate;

    @Nullable
    private final String description;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final String id;

    @Nullable
    private final Double iva;

    @Nullable
    private final String method;

    @Nullable
    private final String orderID;

    @Nullable
    private final String status;

    public TransactionDetails(@Nullable Double d2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Double d3) {
        this.amount = d2;
        this.authorization = str;
        this.method = str2;
        this.status = str3;
        this.id = str4;
        this.creationDate = str5;
        this.description = str6;
        this.errorMessage = str7;
        this.orderID = str8;
        this.iva = d3;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getIva() {
        return this.iva;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreationDate() {
        return this.creationDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOrderID() {
        return this.orderID;
    }

    @NotNull
    public final TransactionDetails copy(@Nullable Double amount, @Nullable String authorization, @Nullable String method, @Nullable String status, @Nullable String id, @Nullable String creationDate, @Nullable String description, @Nullable String errorMessage, @Nullable String orderID, @Nullable Double iva) {
        return new TransactionDetails(amount, authorization, method, status, id, creationDate, description, errorMessage, orderID, iva);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionDetails)) {
            return false;
        }
        TransactionDetails transactionDetails = (TransactionDetails) other;
        return Intrinsics.areEqual((Object) this.amount, (Object) transactionDetails.amount) && Intrinsics.areEqual(this.authorization, transactionDetails.authorization) && Intrinsics.areEqual(this.method, transactionDetails.method) && Intrinsics.areEqual(this.status, transactionDetails.status) && Intrinsics.areEqual(this.id, transactionDetails.id) && Intrinsics.areEqual(this.creationDate, transactionDetails.creationDate) && Intrinsics.areEqual(this.description, transactionDetails.description) && Intrinsics.areEqual(this.errorMessage, transactionDetails.errorMessage) && Intrinsics.areEqual(this.orderID, transactionDetails.orderID) && Intrinsics.areEqual((Object) this.iva, (Object) transactionDetails.iva);
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
    public final String getCreationDate() {
        return this.creationDate;
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
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Double getIva() {
        return this.iva;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getOrderID() {
        return this.orderID;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        Double d2 = this.amount;
        int iHashCode = (d2 == null ? 0 : d2.hashCode()) * 31;
        String str = this.authorization;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.method;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.creationDate;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.errorMessage;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.orderID;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d3 = this.iva;
        return iHashCode9 + (d3 != null ? d3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Double d2 = this.amount;
        String str = this.authorization;
        String str2 = this.method;
        String str3 = this.status;
        String str4 = this.id;
        String str5 = this.creationDate;
        String str6 = this.description;
        String str7 = this.errorMessage;
        String str8 = this.orderID;
        Double d3 = this.iva;
        StringBuilder sb2 = new StringBuilder("TransactionDetails(amount=");
        sb2.append(d2);
        sb2.append(", authorization=");
        sb2.append(str);
        sb2.append(", method=");
        k.e(sb2, str2, ", status=", str3, ", id=");
        k.e(sb2, str4, ", creationDate=", str5, ", description=");
        k.e(sb2, str6, ", errorMessage=", str7, ", orderID=");
        sb2.append(str8);
        sb2.append(", iva=");
        sb2.append(d3);
        sb2.append(")");
        return sb2.toString();
    }
}
