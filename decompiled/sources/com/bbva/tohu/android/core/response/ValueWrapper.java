package com.bbva.tohu.android.core.response;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class ValueWrapper implements Parcelable {
    public static final Parcelable.Creator<ValueWrapper> CREATOR = new Parcelable.Creator<ValueWrapper>() { // from class: com.bbva.tohu.android.core.response.ValueWrapper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ValueWrapper createFromParcel(Parcel parcel) {
            return new ValueWrapper(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ValueWrapper[] newArray(int i10) {
            return new ValueWrapper[i10];
        }
    };
    private String value;

    public ValueWrapper(String str) {
        this.value = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return d.f(new StringBuilder("ValueWrapper{value='"), this.value, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.value);
    }

    public ValueWrapper(Parcel parcel) {
        this.value = parcel.readString();
    }
}
