package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import androidx.collection.f;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "ChannelImplCreator")
@SafeParcelable.Reserved({1})
public final class zzay extends AbstractSafeParcelable implements Channel, ChannelClient.Channel {
    public static final Parcelable.Creator<zzay> CREATOR = new zzbi();

    @SafeParcelable.Field(getter = "getToken", id = 2)
    private final String zzce;

    @SafeParcelable.Field(getter = "getPath", id = 4)
    private final String zzcl;

    @SafeParcelable.Field(getter = "getNodeId", id = 3)
    private final String zzo;

    @SafeParcelable.Constructor
    public zzay(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3) {
        this.zzce = (String) Preconditions.checkNotNull(str);
        this.zzo = (String) Preconditions.checkNotNull(str2);
        this.zzcl = (String) Preconditions.checkNotNull(str3);
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener) {
        return zzb.zza(googleApiClient, new zzbf(this.zzce, new IntentFilter[]{zzgj.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")}), channelListener);
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> close(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzaz(this, googleApiClient));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzay)) {
            return false;
        }
        zzay zzayVar = (zzay) obj;
        return this.zzce.equals(zzayVar.zzce) && Objects.equal(zzayVar.zzo, this.zzo) && Objects.equal(zzayVar.zzcl, this.zzcl);
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Channel.GetInputStreamResult> getInputStream(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzbb(this, googleApiClient));
    }

    @Override // com.google.android.gms.wearable.Channel, com.google.android.gms.wearable.ChannelClient.Channel
    public final String getNodeId() {
        return this.zzo;
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Channel.GetOutputStreamResult> getOutputStream(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzbc(this, googleApiClient));
    }

    @Override // com.google.android.gms.wearable.Channel, com.google.android.gms.wearable.ChannelClient.Channel
    public final String getPath() {
        return this.zzcl;
    }

    public final int hashCode() {
        return this.zzce.hashCode();
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> receiveFile(GoogleApiClient googleApiClient, Uri uri, boolean z10) {
        Preconditions.checkNotNull(googleApiClient, "client is null");
        Preconditions.checkNotNull(uri, "uri is null");
        return googleApiClient.enqueue(new zzbd(this, googleApiClient, uri, z10));
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> removeListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener) {
        Preconditions.checkNotNull(googleApiClient, "client is null");
        Preconditions.checkNotNull(channelListener, "listener is null");
        return googleApiClient.enqueue(new zzan(googleApiClient, channelListener, this.zzce));
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri) {
        return sendFile(googleApiClient, uri, 0L, -1L);
    }

    public final String toString() {
        int i10 = 0;
        for (char c10 : this.zzce.toCharArray()) {
            i10 += c10;
        }
        String strTrim = this.zzce.trim();
        int length = strTrim.length();
        if (length > 25) {
            String strSubstring = strTrim.substring(0, 10);
            String strSubstring2 = strTrim.substring(length - 10, length);
            StringBuilder sb2 = new StringBuilder(n1.b(strSubstring2, n1.b(strSubstring, 16)));
            sb2.append(strSubstring);
            sb2.append("...");
            sb2.append(strSubstring2);
            sb2.append("::");
            sb2.append(i10);
            strTrim = sb2.toString();
        }
        String str = this.zzo;
        String str2 = this.zzcl;
        StringBuilder sb3 = new StringBuilder(n1.b(str2, n1.b(str, n1.b(strTrim, 31))));
        sb3.append("Channel{token=");
        sb3.append(strTrim);
        sb3.append(", nodeId=");
        sb3.append(str);
        return f.c(sb3, ", path=", str2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzce, false);
        SafeParcelWriter.writeString(parcel, 3, getNodeId(), false);
        SafeParcelWriter.writeString(parcel, 4, getPath(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zzc() {
        return this.zzce;
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> close(GoogleApiClient googleApiClient, int i10) {
        return googleApiClient.enqueue(new zzba(this, googleApiClient, i10));
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri, long j10, long j11) {
        Preconditions.checkNotNull(googleApiClient, "client is null");
        Preconditions.checkNotNull(this.zzce, "token is null");
        Preconditions.checkNotNull(uri, "uri is null");
        Preconditions.checkArgument(j10 >= 0, "startOffset is negative: %s", Long.valueOf(j10));
        Preconditions.checkArgument(j11 >= 0 || j11 == -1, "invalid length: %s", Long.valueOf(j11));
        return googleApiClient.enqueue(new zzbe(this, googleApiClient, uri, j10, j11));
    }
}
