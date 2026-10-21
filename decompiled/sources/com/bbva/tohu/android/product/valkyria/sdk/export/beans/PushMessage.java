package com.bbva.tohu.android.product.valkyria.sdk.export.beans;

import ad.d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.MessagesManagerImpl;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class PushMessage implements Parcelable {
    public static final String FORWARD_TO_DATA_KEY = "forwardTo";
    public static final String MESSAGE_DATA_KEY = "message";
    public static final String TYPE_DATA_KEY = "type";
    private final String fowardTo;
    private final String message;
    private final String type;
    public static final Set<String> FOWARD_TO_TOHU_VALUES = new HashSet(Arrays.asList(MessagesManagerImpl.FOWARD_TO_MOBILE_PAYMENT_VALUE));
    public static final Parcelable.Creator<PushMessage> CREATOR = new Parcelable.Creator<PushMessage>() { // from class: com.bbva.tohu.android.product.valkyria.sdk.export.beans.PushMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PushMessage createFromParcel(Parcel parcel) {
            return new PushMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PushMessage[] newArray(int i10) {
            return new PushMessage[i10];
        }
    };

    public PushMessage(String str, String str2, String str3) {
        this.fowardTo = str;
        this.type = str2;
        this.message = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFowardTo() {
        return this.fowardTo;
    }

    public String getMessage() {
        return this.message;
    }

    public String getType() {
        return this.type;
    }

    public boolean isToHUFoward() {
        return FOWARD_TO_TOHU_VALUES.contains(this.fowardTo);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PushMessage{fowardTo='");
        sb2.append(this.fowardTo);
        sb2.append("', type='");
        sb2.append(this.type);
        sb2.append("', message='");
        return d.f(sb2, this.message, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.fowardTo);
        parcel.writeString(this.type);
        parcel.writeString(this.message);
    }

    public PushMessage(Map<String, String> map) {
        this.fowardTo = map.get("forwardTo");
        this.type = map.get("type");
        this.message = map.get("message");
    }

    public PushMessage(Bundle bundle) {
        this.fowardTo = bundle.getString("forwardTo");
        this.type = bundle.getString("type");
        this.message = bundle.getString("message");
    }

    public PushMessage(Parcel parcel) {
        this.fowardTo = parcel.readString();
        this.type = parcel.readString();
        this.message = parcel.readString();
    }
}
