package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;

/* JADX INFO: loaded from: classes9.dex */
final class zzgc implements ChannelApi.ChannelListener {
    private final String zzce;
    private final ChannelApi.ChannelListener zzeq;

    public zzgc(String str, ChannelApi.ChannelListener channelListener) {
        this.zzce = (String) Preconditions.checkNotNull(str);
        this.zzeq = (ChannelApi.ChannelListener) Preconditions.checkNotNull(channelListener);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgc)) {
            return false;
        }
        zzgc zzgcVar = (zzgc) obj;
        return this.zzeq.equals(zzgcVar.zzeq) && this.zzce.equals(zzgcVar.zzce);
    }

    public final int hashCode() {
        return this.zzeq.hashCode() + (this.zzce.hashCode() * 31);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelClosed(Channel channel, int i10, int i11) {
        this.zzeq.onChannelClosed(channel, i10, i11);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelOpened(Channel channel) {
        this.zzeq.onChannelOpened(channel);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onInputClosed(Channel channel, int i10, int i11) {
        this.zzeq.onInputClosed(channel, i10, i11);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onOutputClosed(Channel channel, int i10, int i11) {
        this.zzeq.onOutputClosed(channel, i10, i11);
    }
}
