package org.fidoalliance.uaf.client;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public class UAFMessage implements Parcelable {
    public static final Parcelable.Creator<UAFMessage> CREATOR = new Parcelable.Creator<UAFMessage>() { // from class: org.fidoalliance.uaf.client.UAFMessage.1
        @Override // android.os.Parcelable.Creator
        public UAFMessage createFromParcel(Parcel parcel) {
            UAFMessage uAFMessage = new UAFMessage();
            uAFMessage.uafProtocolMessage = null;
            uAFMessage.additionalData = null;
            uAFMessage.uafProtocolMessage = parcel.readString();
            uAFMessage.additionalData = parcel.readString();
            return uAFMessage;
        }

        @Override // android.os.Parcelable.Creator
        public UAFMessage[] newArray(int i10) {
            return new UAFMessage[i10];
        }
    };
    public String uafProtocolMessage = null;
    public Object additionalData = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdditionalData() {
        Object obj = this.additionalData;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.uafProtocolMessage);
        parcel.writeString(getAdditionalData());
    }
}
