package com.bbva.tohu.android.core.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.v;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class Response<T> implements Parcelable {
    public static final Parcelable.Creator<Response> CREATOR = new Parcelable.Creator<Response>() { // from class: com.bbva.tohu.android.core.response.Response.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Response createFromParcel(Parcel parcel) {
            return new Response(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Response[] newArray(int i10) {
            return new Response[i10];
        }
    };
    private T data;
    private Result result;

    public Response(T t10) {
        this.data = t10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public T getData() {
        return this.data;
    }

    public Result getResult() {
        return this.result;
    }

    public void setData(T t10) {
        this.data = t10;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Response{result=");
        sb2.append(this.result);
        sb2.append(", data=");
        return v.d(sb2, this.data, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.result);
        parcel.writeValue(this.data);
    }

    public Response(T t10, Result result) {
        this.data = t10;
        this.result = result;
    }

    public Response(Parcel parcel) {
    }
}
