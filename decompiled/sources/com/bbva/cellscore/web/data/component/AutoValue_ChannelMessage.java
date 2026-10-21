package com.bbva.cellscore.web.data.component;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_ChannelMessage extends C$AutoValue_ChannelMessage {
    public static final Parcelable.Creator<AutoValue_ChannelMessage> CREATOR = new a();

    public static class a implements Parcelable.Creator<AutoValue_ChannelMessage> {
        @Override // android.os.Parcelable.Creator
        public final AutoValue_ChannelMessage createFromParcel(Parcel parcel) {
            return new AutoValue_ChannelMessage(parcel.readString(), parcel.readBundle(Bundle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoValue_ChannelMessage[] newArray(int i10) {
            return new AutoValue_ChannelMessage[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27087p0);
        parcel.writeBundle(this.f27088q0);
    }
}
