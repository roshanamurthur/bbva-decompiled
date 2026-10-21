package com.bbva.cellscore.web.data.component;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_Channel extends C$AutoValue_Channel {
    public static final Parcelable.Creator<AutoValue_Channel> CREATOR = new a();

    public static class a implements Parcelable.Creator<AutoValue_Channel> {
        @Override // android.os.Parcelable.Creator
        public final AutoValue_Channel createFromParcel(Parcel parcel) {
            return new AutoValue_Channel(parcel.readString(), Channel.ChannelType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoValue_Channel[] newArray(int i10) {
            return new AutoValue_Channel[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27082p0);
        parcel.writeString(this.f27083q0.name());
        parcel.writeString(this.f27084r0);
        parcel.writeString(this.f27085s0);
        parcel.writeString(this.f27086t0);
    }
}
