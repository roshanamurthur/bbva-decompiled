package com.ryanharter.auto.value.parcel;

import android.os.Parcel;

/* JADX INFO: loaded from: classes11.dex */
public interface TypeAdapter<T> {
    T fromParcel(Parcel parcel);

    void toParcel(T t10, Parcel parcel);
}
