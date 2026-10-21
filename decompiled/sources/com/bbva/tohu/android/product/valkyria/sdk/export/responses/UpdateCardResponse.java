package com.bbva.tohu.android.product.valkyria.sdk.export.responses;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class UpdateCardResponse implements Parcelable {
    public static final Parcelable.Creator<UpdateCardResponse> CREATOR = new Parcelable.Creator<UpdateCardResponse>() { // from class: com.bbva.tohu.android.product.valkyria.sdk.export.responses.UpdateCardResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UpdateCardResponse createFromParcel(Parcel parcel) {
            return new UpdateCardResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UpdateCardResponse[] newArray(int i10) {
            return new UpdateCardResponse[i10];
        }
    };
    private String cardUniqueReference;
    private String state;

    public UpdateCardResponse() {
    }

    public UpdateCardResponse(String str, String str2) {
        this.cardUniqueReference = str;
        this.state = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public String getState() {
        return this.state;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateCardResponse{cardUniqueReference='");
        sb2.append(this.cardUniqueReference);
        sb2.append("', state='");
        return d.f(sb2, this.state, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.cardUniqueReference);
        parcel.writeString(this.state);
    }

    public UpdateCardResponse(Parcel parcel) {
        this.cardUniqueReference = parcel.readString();
        this.state = parcel.readString();
    }
}
