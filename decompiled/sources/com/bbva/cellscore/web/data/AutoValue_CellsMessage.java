package com.bbva.cellscore.web.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.cellscore.web.data.component.ChannelMessage;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CellsMessage extends C$AutoValue_CellsMessage {
    public static final Parcelable.Creator<AutoValue_CellsMessage> CREATOR = new a();

    public static class a implements Parcelable.Creator<AutoValue_CellsMessage> {
        @Override // android.os.Parcelable.Creator
        public final AutoValue_CellsMessage createFromParcel(Parcel parcel) {
            return new AutoValue_CellsMessage(parcel.readString(), parcel.readString(), parcel.readArrayList(ChannelMessage.class.getClassLoader()), parcel.readBundle(Bundle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoValue_CellsMessage[] newArray(int i10) {
            return new AutoValue_CellsMessage[i10];
        }
    }

    public AutoValue_CellsMessage() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27074p0);
        parcel.writeString(this.f27075q0);
        parcel.writeList(this.f27076r0);
        parcel.writeBundle(this.f27077s0);
    }
}
