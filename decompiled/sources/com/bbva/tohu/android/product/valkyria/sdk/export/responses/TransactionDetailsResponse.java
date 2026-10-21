package com.bbva.tohu.android.product.valkyria.sdk.export.responses;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionDetailsResponse implements Parcelable {
    public static final Parcelable.Creator<TransactionDetailsResponse> CREATOR = new Parcelable.Creator<TransactionDetailsResponse>() { // from class: com.bbva.tohu.android.product.valkyria.sdk.export.responses.TransactionDetailsResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransactionDetailsResponse createFromParcel(Parcel parcel) {
            return new TransactionDetailsResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransactionDetailsResponse[] newArray(int i10) {
            return new TransactionDetailsResponse[i10];
        }
    };
    private String amount;
    private String currencyCode;
    private String merchantName;
    private String tokenId;
    private String transactionDate;
    private String transactionStatus;
    private String transactionType;

    public TransactionDetailsResponse() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public String getTransactionStatus() {
        return this.transactionStatus;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setTokenId(String str) {
        this.tokenId = str;
    }

    public void setTransactionDate(String str) {
        this.transactionDate = str;
    }

    public void setTransactionStatus(String str) {
        this.transactionStatus = str;
    }

    public void setTransactionType(String str) {
        this.transactionType = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransactionDetailsResponse{tokenId='");
        sb2.append(this.tokenId);
        sb2.append("', transactionType='");
        sb2.append(this.transactionType);
        sb2.append("', transactionDate='");
        sb2.append(this.transactionDate);
        sb2.append("', merchantName='");
        sb2.append(this.merchantName);
        sb2.append("', amount='");
        sb2.append(this.amount);
        sb2.append("', transactionStatus='");
        sb2.append(this.transactionStatus);
        sb2.append("', currencyCode='");
        return d.f(sb2, this.currencyCode, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.tokenId);
        parcel.writeString(this.transactionType);
        parcel.writeString(this.transactionDate);
        parcel.writeString(this.merchantName);
        parcel.writeString(this.amount);
        parcel.writeString(this.transactionStatus);
        parcel.writeString(this.currencyCode);
    }

    public TransactionDetailsResponse(Parcel parcel) {
        this.tokenId = parcel.readString();
        this.transactionType = parcel.readString();
        this.transactionDate = parcel.readString();
        this.merchantName = parcel.readString();
        this.amount = parcel.readString();
        this.transactionStatus = parcel.readString();
        this.currencyCode = parcel.readString();
    }
}
