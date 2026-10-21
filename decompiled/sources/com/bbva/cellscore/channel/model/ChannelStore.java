package com.bbva.cellscore.channel.model;

import ad.d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelStore implements Parcelable {
    public static final Parcelable.Creator<ChannelStore> CREATOR = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f26963p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Bundle f26964q0;

    public static class a implements Parcelable.Creator<ChannelStore> {
        @Override // android.os.Parcelable.Creator
        public final ChannelStore createFromParcel(Parcel parcel) {
            return new ChannelStore(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelStore[] newArray(int i10) {
            return new ChannelStore[i10];
        }
    }

    public ChannelStore(String str, Bundle bundle) {
        this.f26963p0 = str;
        this.f26964q0 = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.f26963p0;
    }

    public Bundle getPayload() {
        return this.f26964q0;
    }

    public String toString() {
        return d.f(new StringBuilder("ChannelStore{name='"), this.f26963p0, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26963p0);
        parcel.writeBundle(this.f26964q0);
    }

    public ChannelStore(Parcel parcel) {
        this.f26963p0 = parcel.readString();
        this.f26964q0 = parcel.readBundle(getClass().getClassLoader());
    }
}
