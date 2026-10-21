package com.bbva.tohu.android.product.valkyria.sdk.model;

import ad.d;
import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;

/* JADX INFO: loaded from: classes6.dex */
public class Token implements Parcelable {
    public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() { // from class: com.bbva.tohu.android.product.valkyria.sdk.model.Token.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Token createFromParcel(Parcel parcel) {
            return new Token(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Token[] newArray(int i10) {
            return new Token[i10];
        }
    };
    private String api;
    private String cardUniqueReference;
    private String dki;
    private String provider;

    /* JADX INFO: renamed from: sc, reason: collision with root package name */
    private Integer f36928sc;
    private String state;

    public Token() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Token token = (Token) obj;
        if (getCardUniqueReference() == null ? token.getCardUniqueReference() != null : !getCardUniqueReference().equals(token.getCardUniqueReference())) {
            return false;
        }
        if (getProvider() == null ? token.getProvider() != null : !getProvider().equals(token.getProvider())) {
            return false;
        }
        if (getState() == null ? token.getState() != null : !getState().equals(token.getState())) {
            return false;
        }
        if (getSc() == null ? token.getSc() != null : !getSc().equals(token.getSc())) {
            return false;
        }
        if (getDki() == null ? token.getDki() != null : !getDki().equals(token.getDki())) {
            return false;
        }
        if (getApi() != null) {
            return getApi().equals(token.getApi());
        }
        return token.getApi() == null;
    }

    public String getApi() {
        return this.api;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public String getDki() {
        return this.dki;
    }

    public String getProvider() {
        return this.provider;
    }

    public Integer getSc() {
        return this.f36928sc;
    }

    public String getState() {
        return this.state;
    }

    public int hashCode() {
        return ((((((((((getCardUniqueReference() != null ? getCardUniqueReference().hashCode() : 0) * 31) + (getProvider() != null ? getProvider().hashCode() : 0)) * 31) + (getState() != null ? getState().hashCode() : 0)) * 31) + (getSc() != null ? getSc().hashCode() : 0)) * 31) + (getDki() != null ? getDki().hashCode() : 0)) * 31) + (getApi() != null ? getApi().hashCode() : 0);
    }

    public void setApi(String str) {
        this.api = str;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setDki(String str) {
        this.dki = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setSc(Integer num) {
        this.f36928sc = num;
    }

    public void setState(String str) {
        this.state = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Token {cardUniqueReference='");
        sb2.append(this.cardUniqueReference);
        sb2.append("', provider='");
        sb2.append(this.provider);
        sb2.append("', state='");
        sb2.append(this.state);
        sb2.append("', sc=");
        sb2.append(this.f36928sc);
        sb2.append("', dki='");
        sb2.append(this.dki);
        sb2.append("', api='");
        return d.f(sb2, this.api, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String[] strArr = new String[6];
        strArr[0] = this.cardUniqueReference;
        strArr[1] = this.state;
        strArr[2] = this.provider;
        Integer num = this.f36928sc;
        strArr[3] = num == null ? null : String.valueOf(num);
        strArr[4] = this.dki;
        strArr[5] = this.api;
        parcel.writeStringArray(strArr);
    }

    public Token(String str, String str2, String str3) {
        this.cardUniqueReference = str;
        this.state = str2;
        this.provider = str3;
    }

    public Token(Parcel parcel) {
        String[] strArr = new String[6];
        parcel.readStringArray(strArr);
        this.cardUniqueReference = strArr[0];
        this.state = strArr[1];
        this.provider = strArr[2];
        String str = strArr[3];
        this.f36928sc = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
        this.dki = strArr[4];
        this.api = strArr[5];
    }

    @SuppressLint({"Range"})
    public Token(Cursor cursor) {
        this.cardUniqueReference = cursor.getString(cursor.getColumnIndex("card_unique_reference"));
        this.provider = cursor.getString(cursor.getColumnIndex("provider"));
        this.state = cursor.getString(cursor.getColumnIndex("state"));
        this.f36928sc = Integer.valueOf(cursor.getInt(cursor.getColumnIndex(SqlContracts.TokenEntry.SC)));
        this.dki = cursor.getString(cursor.getColumnIndex(SqlContracts.TokenEntry.DKI));
        this.api = cursor.getString(cursor.getColumnIndex(SqlContracts.TokenEntry.API));
    }
}
