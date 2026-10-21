package com.bbva.tohu.android.product.valkyria.sdk.export.responses;

import android.os.Parcel;
import android.os.Parcelable;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionHistoryResponse implements Parcelable {
    public static final Parcelable.Creator<TransactionHistoryResponse> CREATOR = new Parcelable.Creator<TransactionHistoryResponse>() { // from class: com.bbva.tohu.android.product.valkyria.sdk.export.responses.TransactionHistoryResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransactionHistoryResponse createFromParcel(Parcel parcel) {
            return new TransactionHistoryResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransactionHistoryResponse[] newArray(int i10) {
            return new TransactionHistoryResponse[i10];
        }
    };
    private List<TransactionDetailsResponse> transactionsDetails;

    public TransactionHistoryResponse() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<TransactionDetailsResponse> getTransactionsDetails() {
        return this.transactionsDetails;
    }

    public void setTransactionsDetails(List<TransactionDetailsResponse> list) {
        this.transactionsDetails = list;
    }

    public String toString() {
        return a.c(new StringBuilder("TransactionHistoryResponse{transactionsDetails="), this.transactionsDetails, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.transactionsDetails);
    }

    public TransactionHistoryResponse(Parcel parcel) {
        this.transactionsDetails = parcel.createTypedArrayList(TransactionDetailsResponse.CREATOR);
    }
}
