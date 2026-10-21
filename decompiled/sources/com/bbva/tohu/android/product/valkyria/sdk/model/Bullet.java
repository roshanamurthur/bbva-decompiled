package com.bbva.tohu.android.product.valkyria.sdk.model;

import ad.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;

/* JADX INFO: loaded from: classes6.dex */
public class Bullet implements Parcelable {
    public static final Parcelable.Creator<Bullet> CREATOR = new Parcelable.Creator<Bullet>() { // from class: com.bbva.tohu.android.product.valkyria.sdk.model.Bullet.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bullet createFromParcel(Parcel parcel) {
            return new Bullet(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bullet[] newArray(int i10) {
            return new Bullet[i10];
        }
    };
    private static final String TAG = "Bullet";
    private Integer atc;
    private String bulletId;
    private String keyLocator;
    private String status;
    private String timestamp;
    private Token token;
    private String transactionType;
    private String unpredictableNumber;

    public Bullet() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Integer getAtc() {
        return this.atc;
    }

    public String getBulletId() {
        return this.bulletId;
    }

    public String getKeyLocator() {
        return this.keyLocator;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Token getToken() {
        return this.token;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public String getUnpredictableNumber() {
        return this.unpredictableNumber;
    }

    public boolean isUsable(Context context) {
        try {
            Token token = this.token;
            if (token == null || !token.getProvider().equals(ProviderType.PROVIDER_ID_VISA)) {
                return true;
            }
            return Long.valueOf(Long.parseLong(this.timestamp) + ManagerFactory.getPropertiesManager(context).visaBulletTTL().longValue()).longValue() > Long.valueOf(System.currentTimeMillis() / 1000).longValue();
        } catch (Exception unused) {
            return true;
        }
    }

    public void setAtc(Integer num) {
        this.atc = num;
    }

    public void setBulletId(String str) {
        this.bulletId = str;
    }

    public void setKeyLocator(String str) {
        this.keyLocator = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public void setTransactionType(String str) {
        this.transactionType = str;
    }

    public void setUnpredictableNumber(String str) {
        this.unpredictableNumber = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Bullet: {bulletId=");
        sb2.append(this.bulletId);
        sb2.append("', status=");
        sb2.append(this.status);
        sb2.append("', token=");
        sb2.append(this.token);
        sb2.append("', atc=");
        sb2.append(this.atc);
        sb2.append("', transactionType=");
        sb2.append(this.transactionType);
        sb2.append("', unpredictableNumber=");
        sb2.append(this.unpredictableNumber);
        sb2.append("', timestamp=");
        sb2.append(this.timestamp);
        sb2.append("', keyLocator=");
        return d.f(sb2, this.keyLocator, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.bulletId);
        parcel.writeString(this.status);
        parcel.writeParcelable(this.token, i10);
        parcel.writeInt(this.atc.intValue());
        parcel.writeString(this.transactionType);
        parcel.writeString(this.unpredictableNumber);
        parcel.writeString(this.timestamp);
        parcel.writeString(this.keyLocator);
    }

    public Bullet(Parcel parcel) {
        this.bulletId = parcel.readString();
        this.status = parcel.readString();
        this.token = (Token) parcel.readParcelable(Token.class.getClassLoader());
        this.atc = Integer.valueOf(parcel.readInt());
        this.transactionType = parcel.readString();
        this.unpredictableNumber = parcel.readString();
        this.timestamp = parcel.readString();
        this.keyLocator = parcel.readString();
    }

    public Bullet(String str, String str2, Token token, Integer num, String str3, String str4, String str5, String str6) {
        this.bulletId = str;
        this.status = str2;
        this.token = token;
        this.atc = num;
        this.transactionType = str3;
        this.unpredictableNumber = str4;
        this.timestamp = str5;
        this.keyLocator = str6;
    }

    @SuppressLint({"Range"})
    public Bullet(Cursor cursor) {
        this.bulletId = cursor.getString(cursor.getColumnIndex("bullet_id"));
        this.status = cursor.getString(cursor.getColumnIndex("status"));
        this.atc = Integer.valueOf(cursor.getInt(cursor.getColumnIndex(SqlContracts.BulletEntry.ATC)));
        this.transactionType = cursor.getString(cursor.getColumnIndex(SqlContracts.BulletEntry.TRANSACTION_TYPE));
        this.unpredictableNumber = cursor.getString(cursor.getColumnIndex(SqlContracts.BulletEntry.UNPREDICTABLE_NUMBER));
        this.timestamp = cursor.getString(cursor.getColumnIndex("timestamp"));
        this.keyLocator = cursor.getString(cursor.getColumnIndex(SqlContracts.BulletEntry.KEY_LOCATOR));
        this.token = new Token(cursor);
    }
}
