package com.bbva.network.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConnectionState.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b7\u00108J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JZ\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0010R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010\u0010¨\u00069"}, d2 = {"Lcom/bbva/network/model/ConnectionStatusEvent;", "", "", "hasChangedToOnline", "hasChangedToOffline", "Lcom/bbva/network/model/NetworkStatus;", "component1", "component2", "Lcom/bbva/network/model/NetworkType;", "component3", "Lcom/bbva/network/model/NetworkStrength;", "component4", "Lcom/bbva/network/model/NetworkSpeed;", "component5", "", "component6", "()Ljava/lang/Integer;", "component7", "previousStatus", "status", "type", "strength", "speed", "downstreamBandwidthMbps", "signalStrengthDbm", "copy", "(Lcom/bbva/network/model/NetworkStatus;Lcom/bbva/network/model/NetworkStatus;Lcom/bbva/network/model/NetworkType;Lcom/bbva/network/model/NetworkStrength;Lcom/bbva/network/model/NetworkSpeed;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/bbva/network/model/ConnectionStatusEvent;", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lcom/bbva/network/model/NetworkStatus;", "getPreviousStatus", "()Lcom/bbva/network/model/NetworkStatus;", "b", "getStatus", "c", "Lcom/bbva/network/model/NetworkType;", "getType", "()Lcom/bbva/network/model/NetworkType;", "d", "Lcom/bbva/network/model/NetworkStrength;", "getStrength", "()Lcom/bbva/network/model/NetworkStrength;", "e", "Lcom/bbva/network/model/NetworkSpeed;", "getSpeed", "()Lcom/bbva/network/model/NetworkSpeed;", "f", "Ljava/lang/Integer;", "getDownstreamBandwidthMbps", "g", "getSignalStrengthDbm", "<init>", "(Lcom/bbva/network/model/NetworkStatus;Lcom/bbva/network/model/NetworkStatus;Lcom/bbva/network/model/NetworkType;Lcom/bbva/network/model/NetworkStrength;Lcom/bbva/network/model/NetworkSpeed;Ljava/lang/Integer;Ljava/lang/Integer;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ConnectionStatusEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkStatus previousStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkStatus status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkType type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkStrength strength;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkSpeed speed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer downstreamBandwidthMbps;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer signalStrengthDbm;

    public ConnectionStatusEvent(@NotNull NetworkStatus previousStatus, @NotNull NetworkStatus status, @NotNull NetworkType type, @NotNull NetworkStrength strength, @NotNull NetworkSpeed speed, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(previousStatus, "previousStatus");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(strength, "strength");
        Intrinsics.checkNotNullParameter(speed, "speed");
        this.previousStatus = previousStatus;
        this.status = status;
        this.type = type;
        this.strength = strength;
        this.speed = speed;
        this.downstreamBandwidthMbps = num;
        this.signalStrengthDbm = num2;
    }

    public static /* synthetic */ ConnectionStatusEvent copy$default(ConnectionStatusEvent connectionStatusEvent, NetworkStatus networkStatus, NetworkStatus networkStatus2, NetworkType networkType, NetworkStrength networkStrength, NetworkSpeed networkSpeed, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            networkStatus = connectionStatusEvent.previousStatus;
        }
        if ((i10 & 2) != 0) {
            networkStatus2 = connectionStatusEvent.status;
        }
        NetworkStatus networkStatus3 = networkStatus2;
        if ((i10 & 4) != 0) {
            networkType = connectionStatusEvent.type;
        }
        NetworkType networkType2 = networkType;
        if ((i10 & 8) != 0) {
            networkStrength = connectionStatusEvent.strength;
        }
        NetworkStrength networkStrength2 = networkStrength;
        if ((i10 & 16) != 0) {
            networkSpeed = connectionStatusEvent.speed;
        }
        NetworkSpeed networkSpeed2 = networkSpeed;
        if ((i10 & 32) != 0) {
            num = connectionStatusEvent.downstreamBandwidthMbps;
        }
        Integer num3 = num;
        if ((i10 & 64) != 0) {
            num2 = connectionStatusEvent.signalStrengthDbm;
        }
        return connectionStatusEvent.copy(networkStatus, networkStatus3, networkType2, networkStrength2, networkSpeed2, num3, num2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NetworkStatus getPreviousStatus() {
        return this.previousStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NetworkType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NetworkStrength getStrength() {
        return this.strength;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NetworkSpeed getSpeed() {
        return this.speed;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getDownstreamBandwidthMbps() {
        return this.downstreamBandwidthMbps;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getSignalStrengthDbm() {
        return this.signalStrengthDbm;
    }

    @NotNull
    public final ConnectionStatusEvent copy(@NotNull NetworkStatus previousStatus, @NotNull NetworkStatus status, @NotNull NetworkType type, @NotNull NetworkStrength strength, @NotNull NetworkSpeed speed, @Nullable Integer downstreamBandwidthMbps, @Nullable Integer signalStrengthDbm) {
        Intrinsics.checkNotNullParameter(previousStatus, "previousStatus");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(strength, "strength");
        Intrinsics.checkNotNullParameter(speed, "speed");
        return new ConnectionStatusEvent(previousStatus, status, type, strength, speed, downstreamBandwidthMbps, signalStrengthDbm);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionStatusEvent)) {
            return false;
        }
        ConnectionStatusEvent connectionStatusEvent = (ConnectionStatusEvent) other;
        return this.previousStatus == connectionStatusEvent.previousStatus && this.status == connectionStatusEvent.status && this.type == connectionStatusEvent.type && this.strength == connectionStatusEvent.strength && this.speed == connectionStatusEvent.speed && Intrinsics.areEqual(this.downstreamBandwidthMbps, connectionStatusEvent.downstreamBandwidthMbps) && Intrinsics.areEqual(this.signalStrengthDbm, connectionStatusEvent.signalStrengthDbm);
    }

    @Nullable
    public final Integer getDownstreamBandwidthMbps() {
        return this.downstreamBandwidthMbps;
    }

    @NotNull
    public final NetworkStatus getPreviousStatus() {
        return this.previousStatus;
    }

    @Nullable
    public final Integer getSignalStrengthDbm() {
        return this.signalStrengthDbm;
    }

    @NotNull
    public final NetworkSpeed getSpeed() {
        return this.speed;
    }

    @NotNull
    public final NetworkStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final NetworkStrength getStrength() {
        return this.strength;
    }

    @NotNull
    public final NetworkType getType() {
        return this.type;
    }

    public final boolean hasChangedToOffline() {
        return this.previousStatus == NetworkStatus.ONLINE && this.status == NetworkStatus.OFFLINE;
    }

    public final boolean hasChangedToOnline() {
        return this.previousStatus == NetworkStatus.OFFLINE && this.status == NetworkStatus.ONLINE;
    }

    public int hashCode() {
        int iHashCode = (this.speed.hashCode() + ((this.strength.hashCode() + ((this.type.hashCode() + ((this.status.hashCode() + (this.previousStatus.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        Integer num = this.downstreamBandwidthMbps;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.signalStrengthDbm;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConnectionStatusEvent(previousStatus=" + this.previousStatus + ", status=" + this.status + ", type=" + this.type + ", strength=" + this.strength + ", speed=" + this.speed + ", downstreamBandwidthMbps=" + this.downstreamBandwidthMbps + ", signalStrengthDbm=" + this.signalStrengthDbm + ")";
    }

    public /* synthetic */ ConnectionStatusEvent(NetworkStatus networkStatus, NetworkStatus networkStatus2, NetworkType networkType, NetworkStrength networkStrength, NetworkSpeed networkSpeed, Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkStatus, networkStatus2, networkType, networkStrength, networkSpeed, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? null : num2);
    }
}
