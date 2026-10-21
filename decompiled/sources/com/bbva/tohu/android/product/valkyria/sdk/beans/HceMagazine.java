package com.bbva.tohu.android.product.valkyria.sdk.beans;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class HceMagazine implements Parcelable {
    public static final Parcelable.Creator<HceMagazine> CREATOR = new Parcelable.Creator<HceMagazine>() { // from class: com.bbva.tohu.android.product.valkyria.sdk.beans.HceMagazine.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HceMagazine createFromParcel(Parcel parcel) {
            return new HceMagazine(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HceMagazine[] newArray(int i10) {
            return new HceMagazine[i10];
        }
    };
    private List<String> bulletIdentifiers;

    public HceMagazine() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<String> getBulletIdentifiers() {
        return this.bulletIdentifiers;
    }

    public void setBulletIdentifiers(List<String> list) {
        this.bulletIdentifiers = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.bulletIdentifiers);
    }

    public HceMagazine(Parcel parcel) {
        this.bulletIdentifiers = parcel.createStringArrayList();
    }

    public HceMagazine(List<String> list) {
        this.bulletIdentifiers = list;
    }
}
