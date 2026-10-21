package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.camera2.internal.n1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ChannelApi;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "ChannelEventParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();

    @SafeParcelable.Field(id = 3)
    private final int type;

    @SafeParcelable.Field(id = 5)
    private final int zzcj;

    @SafeParcelable.Field(id = 2)
    private final zzay zzck;

    @SafeParcelable.Field(id = 4)
    private final int zzg;

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(id = 2) zzay zzayVar, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) int i12) {
        this.zzck = zzayVar;
        this.type = i10;
        this.zzg = i11;
        this.zzcj = i12;
    }

    public final String toString() {
        String string;
        String string2;
        String strValueOf = String.valueOf(this.zzck);
        int i10 = this.type;
        if (i10 == 1) {
            string = "CHANNEL_OPENED";
        } else if (i10 == 2) {
            string = "CHANNEL_CLOSED";
        } else if (i10 != 3) {
            string = i10 != 4 ? Integer.toString(i10) : "OUTPUT_CLOSED";
        } else {
            string = "INPUT_CLOSED";
        }
        int i11 = this.zzg;
        if (i11 == 0) {
            string2 = "CLOSE_REASON_NORMAL";
        } else if (i11 == 1) {
            string2 = "CLOSE_REASON_DISCONNECTED";
        } else if (i11 != 2) {
            string2 = i11 != 3 ? Integer.toString(i11) : "CLOSE_REASON_LOCAL_CLOSE";
        } else {
            string2 = "CLOSE_REASON_REMOTE_CLOSE";
        }
        int i12 = this.zzcj;
        StringBuilder sb2 = new StringBuilder(n1.b(string2, n1.b(string, strValueOf.length() + 81)));
        sb2.append("ChannelEventParcelable[, channel=");
        sb2.append(strValueOf);
        sb2.append(", type=");
        sb2.append(string);
        sb2.append(", closeReason=");
        sb2.append(string2);
        sb2.append(", appErrorCode=");
        sb2.append(i12);
        sb2.append(Constant.BRACKET_CLOSE);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzck, i10, false);
        SafeParcelWriter.writeInt(parcel, 3, this.type);
        SafeParcelWriter.writeInt(parcel, 4, this.zzg);
        SafeParcelWriter.writeInt(parcel, 5, this.zzcj);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final void zza(ChannelApi.ChannelListener channelListener) {
        int i10 = this.type;
        if (i10 == 1) {
            channelListener.onChannelOpened(this.zzck);
            return;
        }
        if (i10 == 2) {
            channelListener.onChannelClosed(this.zzck, this.zzg, this.zzcj);
            return;
        }
        if (i10 == 3) {
            channelListener.onInputClosed(this.zzck, this.zzg, this.zzcj);
            return;
        }
        if (i10 == 4) {
            channelListener.onOutputClosed(this.zzck, this.zzg, this.zzcj);
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Unknown type: ");
        sb2.append(i10);
        Log.w("ChannelEventParcelable", sb2.toString());
    }
}
