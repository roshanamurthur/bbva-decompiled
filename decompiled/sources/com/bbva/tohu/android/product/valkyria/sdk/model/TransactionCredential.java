package com.bbva.tohu.android.product.valkyria.sdk.model;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionCredential implements Parcelable {
    public static final Parcelable.Creator<TransactionCredential> CREATOR = new Parcelable.Creator<TransactionCredential>() { // from class: com.bbva.tohu.android.product.valkyria.sdk.model.TransactionCredential.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransactionCredential createFromParcel(Parcel parcel) {
            return new TransactionCredential(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransactionCredential[] newArray(int i10) {
            return new TransactionCredential[i10];
        }
    };
    private Bullet bulletId;
    private String transactionCredentialId;

    public TransactionCredential() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bullet getBullet() {
        return this.bulletId;
    }

    public String getTransactionCredentialId() {
        return this.transactionCredentialId;
    }

    public void setBullet(Bullet bullet) {
        this.bulletId = bullet;
    }

    public void setTransactionCredentialId(String str) {
        this.transactionCredentialId = str;
    }

    public String toString() {
        return "TransactionCredential: {transactionCredentialId=" + this.transactionCredentialId + "', bullet=" + this.bulletId + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.transactionCredentialId);
        parcel.writeParcelable(this.bulletId, i10);
    }

    public TransactionCredential(String str, Bullet bullet) {
        this.transactionCredentialId = str;
        this.bulletId = bullet;
    }

    @SuppressLint({"Range"})
    public TransactionCredential(Cursor cursor) {
        this.transactionCredentialId = cursor.getString(cursor.getColumnIndex(SqlContracts.TransactionCredentialEntry.TRANSACTION_CREDENTIAL_ID_KEY_ID));
        this.bulletId = new Bullet(cursor);
    }

    public TransactionCredential(Parcel parcel) {
        this.transactionCredentialId = parcel.readString();
        this.bulletId = (Bullet) parcel.readParcelable(Bullet.class.getClassLoader());
    }
}
