package com.bbva.tohu.android.product.valkyria.sdk.export.responses;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class PaymentResponse implements Parcelable {
    public static final Parcelable.Creator<PaymentResponse> CREATOR = new Parcelable.Creator<PaymentResponse>() { // from class: com.bbva.tohu.android.product.valkyria.sdk.export.responses.PaymentResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentResponse createFromParcel(Parcel parcel) {
            return new PaymentResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentResponse[] newArray(int i10) {
            return new PaymentResponse[i10];
        }
    };
    public static final String ODA_APPLIED = "ODA_APPLIED_TRUE";
    public static final String ODA_NOT_APPLIED = "ODA_APPLIED_FALSE";
    public static final String ODA_UNKNOWN = "ODA_APPLIED_UNKNOWN";
    private Double amount;
    private byte[] atc;
    private String cardUniqueReference;
    private byte[] cardUnpredicableNumber;
    private boolean complete;
    private Currency currency;
    private String expectedUserActionOnPoi;
    private String odaTransaction;
    private Date operationDate;
    private String operationType;
    private String terminalType;

    public PaymentResponse() {
        this.odaTransaction = ODA_UNKNOWN;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Double getAmount() {
        return this.amount;
    }

    public byte[] getAtc() {
        return this.atc;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public byte[] getCardUnpredicableNumber() {
        return this.cardUnpredicableNumber;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public String getExpectedUserActionOnPoi() {
        return this.expectedUserActionOnPoi;
    }

    public String getOdaTransaction() {
        return this.odaTransaction;
    }

    public Date getOperationDate() {
        return this.operationDate;
    }

    public String getOperationType() {
        return this.operationType;
    }

    public String getTerminalType() {
        return this.terminalType;
    }

    public boolean isComplete() {
        return this.complete;
    }

    public void setAmount(Double d2) {
        this.amount = d2;
    }

    public void setAtc(byte[] bArr) {
        this.atc = bArr;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setCardUnpredicableNumber(byte[] bArr) {
        this.cardUnpredicableNumber = bArr;
    }

    public void setComplete(boolean z10) {
        this.complete = z10;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setExpectedUserActionOnPoi(String str) {
        this.expectedUserActionOnPoi = str;
    }

    public void setOdaTransaction(String str) {
        this.odaTransaction = str;
    }

    public void setOperationDate(Date date) {
        this.operationDate = date;
    }

    public void setOperationType(String str) {
        this.operationType = str;
    }

    public void setTerminalType(String str) {
        this.terminalType = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentResponse{operationType='");
        sb2.append(this.operationType);
        sb2.append("', amount=");
        sb2.append(this.amount);
        sb2.append(", cardUniqueReference='");
        sb2.append(this.cardUniqueReference);
        sb2.append("', operationDate=");
        sb2.append(this.operationDate);
        sb2.append(", currency=");
        sb2.append(this.currency);
        sb2.append(", terminalType='");
        sb2.append(this.terminalType);
        sb2.append("', complete=");
        sb2.append(this.complete);
        sb2.append(", odaTransaction=");
        sb2.append(this.odaTransaction);
        sb2.append(", atc=");
        sb2.append(Arrays.toString(this.atc));
        sb2.append(", cardUnpredicableNumber=");
        sb2.append(Arrays.toString(this.cardUnpredicableNumber));
        sb2.append(", expectedUserActionOnPoi='");
        return d.f(sb2, this.expectedUserActionOnPoi, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.operationType);
        if (this.amount == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.amount.doubleValue());
        }
        parcel.writeString(this.cardUniqueReference);
        if (this.operationDate == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.operationDate.getTime());
        }
        if (this.currency == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.currency.getCurrencyCode());
        }
        parcel.writeString(this.terminalType);
        parcel.writeByte(this.complete ? (byte) 1 : (byte) 0);
        parcel.writeString(this.odaTransaction);
        parcel.writeByteArray(this.atc);
        parcel.writeByteArray(this.cardUnpredicableNumber);
        parcel.writeString(this.expectedUserActionOnPoi);
    }

    public PaymentResponse(Parcel parcel) {
        this.odaTransaction = ODA_UNKNOWN;
        this.operationType = parcel.readString();
        if (parcel.readByte() == 0) {
            this.amount = null;
        } else {
            this.amount = Double.valueOf(parcel.readDouble());
        }
        this.cardUniqueReference = parcel.readString();
        if (parcel.readByte() == 0) {
            this.operationDate = null;
        } else {
            this.operationDate = new Date(parcel.readLong());
        }
        if (parcel.readByte() == 0) {
            this.currency = null;
        } else {
            this.currency = Currency.getInstance(parcel.readString());
        }
        this.terminalType = parcel.readString();
        this.complete = parcel.readByte() != 0;
        this.odaTransaction = parcel.readString();
        this.atc = parcel.createByteArray();
        this.cardUnpredicableNumber = parcel.createByteArray();
        this.expectedUserActionOnPoi = parcel.readString();
    }
}
