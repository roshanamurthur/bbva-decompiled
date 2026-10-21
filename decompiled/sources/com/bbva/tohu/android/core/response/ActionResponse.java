package com.bbva.tohu.android.core.response;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class ActionResponse implements Parcelable {
    public static final Parcelable.Creator<ActionResponse> CREATOR = new Parcelable.Creator<ActionResponse>() { // from class: com.bbva.tohu.android.core.response.ActionResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActionResponse createFromParcel(Parcel parcel) {
            return new ActionResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActionResponse[] newArray(int i10) {
            return new ActionResponse[i10];
        }
    };
    private Parcelable data;
    private String result;

    public ActionResponse(String str) {
        this.result = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Parcelable getData() {
        return this.data;
    }

    public String getResult() {
        return this.result;
    }

    public void setData(Parcelable parcelable) {
        this.data = parcelable;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public String toString() {
        return "ActionResponse{result='" + this.result + "', data=" + this.data + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.result);
        parcel.writeParcelable(this.data, i10);
    }

    public ActionResponse(String str, Parcelable parcelable) {
        this.result = str;
        this.data = parcelable;
    }

    public ActionResponse(Parcel parcel) {
        this.result = parcel.readString();
        this.data = parcel.readParcelable(getClass().getClassLoader());
    }
}
