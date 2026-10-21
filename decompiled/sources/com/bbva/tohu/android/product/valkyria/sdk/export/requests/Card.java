package com.bbva.tohu.android.product.valkyria.sdk.export.requests;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class Card implements Parcelable {
    public static final Parcelable.Creator<Card> CREATOR = new Parcelable.Creator<Card>() { // from class: com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Card createFromParcel(Parcel parcel) {
            return new Card(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Card[] newArray(int i10) {
            return new Card[i10];
        }
    };
    private final String cardUniqueReference;
    private final String expiryMonth;
    private final String expiryYear;
    private final String pan;

    public Card(String str, String str2, String str3, String str4) {
        this.cardUniqueReference = str;
        this.pan = str2;
        this.expiryMonth = str3;
        this.expiryYear = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public String getExpiryMonth() {
        return this.expiryMonth;
    }

    public String getExpiryYear() {
        return this.expiryYear;
    }

    public String getPan() {
        return this.pan;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Card{cardUniqueReference='");
        sb2.append(this.cardUniqueReference);
        sb2.append("', pan='*'', expiryMonth='");
        sb2.append(this.expiryMonth);
        sb2.append("', expiryYear='");
        return d.f(sb2, this.expiryYear, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.cardUniqueReference);
        parcel.writeString(this.pan);
        parcel.writeString(this.expiryMonth);
        parcel.writeString(this.expiryYear);
    }

    public Card(Parcel parcel) {
        this.cardUniqueReference = parcel.readString();
        this.pan = parcel.readString();
        this.expiryMonth = parcel.readString();
        this.expiryYear = parcel.readString();
    }
}
