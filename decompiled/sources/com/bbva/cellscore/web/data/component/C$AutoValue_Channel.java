package com.bbva.cellscore.web.data.component;

import ad.d;

/* JADX INFO: renamed from: com.bbva.cellscore.web.data.component.$AutoValue_Channel, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
abstract class C$AutoValue_Channel extends Channel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f27082p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Channel.ChannelType f27083q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f27084r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f27085s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f27086t0;

    public C$AutoValue_Channel(String str, Channel.ChannelType channelType, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f27082p0 = str;
        if (channelType == null) {
            throw new NullPointerException("Null type");
        }
        this.f27083q0 = channelType;
        if (str2 == null) {
            throw new NullPointerException("Null bind");
        }
        this.f27084r0 = str2;
        if (str3 == null) {
            throw new NullPointerException("Null nativeLink");
        }
        this.f27085s0 = str3;
        if (str4 == null) {
            throw new NullPointerException("Null webLink");
        }
        this.f27086t0 = str4;
    }

    @Override // com.bbva.cellscore.web.data.component.Channel
    public final String bind() {
        return this.f27084r0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        return this.f27082p0.equals(channel.name()) && this.f27083q0.equals(channel.type()) && this.f27084r0.equals(channel.bind()) && this.f27085s0.equals(channel.nativeLink()) && this.f27086t0.equals(channel.webLink());
    }

    public final int hashCode() {
        return ((((((((this.f27082p0.hashCode() ^ 1000003) * 1000003) ^ this.f27083q0.hashCode()) * 1000003) ^ this.f27084r0.hashCode()) * 1000003) ^ this.f27085s0.hashCode()) * 1000003) ^ this.f27086t0.hashCode();
    }

    @Override // com.bbva.cellscore.web.data.component.Channel
    public final String name() {
        return this.f27082p0;
    }

    @Override // com.bbva.cellscore.web.data.component.Channel
    public final String nativeLink() {
        return this.f27085s0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Channel{name=");
        sb2.append(this.f27082p0);
        sb2.append(", type=");
        sb2.append(this.f27083q0);
        sb2.append(", bind=");
        sb2.append(this.f27084r0);
        sb2.append(", nativeLink=");
        sb2.append(this.f27085s0);
        sb2.append(", webLink=");
        return d.f(sb2, this.f27086t0, "}");
    }

    @Override // com.bbva.cellscore.web.data.component.Channel
    public final Channel.ChannelType type() {
        return this.f27083q0;
    }

    @Override // com.bbva.cellscore.web.data.component.Channel
    public final String webLink() {
        return this.f27086t0;
    }
}
