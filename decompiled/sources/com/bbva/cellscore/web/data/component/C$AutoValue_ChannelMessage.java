package com.bbva.cellscore.web.data.component;

import android.os.Bundle;

/* JADX INFO: renamed from: com.bbva.cellscore.web.data.component.$AutoValue_ChannelMessage, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
abstract class C$AutoValue_ChannelMessage extends ChannelMessage {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f27087p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Bundle f27088q0;

    public C$AutoValue_ChannelMessage(String str, Bundle bundle) {
        if (str == null) {
            throw new NullPointerException("Null channelName");
        }
        this.f27087p0 = str;
        if (bundle == null) {
            throw new NullPointerException("Null values");
        }
        this.f27088q0 = bundle;
    }

    @Override // com.bbva.cellscore.web.data.component.ChannelMessage
    public final String channelName() {
        return this.f27087p0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelMessage)) {
            return false;
        }
        ChannelMessage channelMessage = (ChannelMessage) obj;
        return this.f27087p0.equals(channelMessage.channelName()) && this.f27088q0.equals(channelMessage.values());
    }

    public final int hashCode() {
        return ((this.f27087p0.hashCode() ^ 1000003) * 1000003) ^ this.f27088q0.hashCode();
    }

    public final String toString() {
        return "ChannelMessage{channelName=" + this.f27087p0 + ", values=" + this.f27088q0 + "}";
    }

    @Override // com.bbva.cellscore.web.data.component.ChannelMessage
    public final Bundle values() {
        return this.f27088q0;
    }
}
