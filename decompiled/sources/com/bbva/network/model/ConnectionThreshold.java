package com.bbva.network.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConnectionState.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/network/model/ConnectionThreshold;", "", "Lcom/bbva/network/model/SpeedThreshold;", "component1", "Lcom/bbva/network/model/StrengthThreshold;", "component2", "speedThreshold", "strengthThreshold", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/network/model/SpeedThreshold;", "getSpeedThreshold", "()Lcom/bbva/network/model/SpeedThreshold;", "b", "Lcom/bbva/network/model/StrengthThreshold;", "getStrengthThreshold", "()Lcom/bbva/network/model/StrengthThreshold;", "<init>", "(Lcom/bbva/network/model/SpeedThreshold;Lcom/bbva/network/model/StrengthThreshold;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ConnectionThreshold {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SpeedThreshold speedThreshold;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StrengthThreshold strengthThreshold;

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionThreshold() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ConnectionThreshold copy$default(ConnectionThreshold connectionThreshold, SpeedThreshold speedThreshold, StrengthThreshold strengthThreshold, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            speedThreshold = connectionThreshold.speedThreshold;
        }
        if ((i10 & 2) != 0) {
            strengthThreshold = connectionThreshold.strengthThreshold;
        }
        return connectionThreshold.copy(speedThreshold, strengthThreshold);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SpeedThreshold getSpeedThreshold() {
        return this.speedThreshold;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StrengthThreshold getStrengthThreshold() {
        return this.strengthThreshold;
    }

    @NotNull
    public final ConnectionThreshold copy(@NotNull SpeedThreshold speedThreshold, @NotNull StrengthThreshold strengthThreshold) {
        Intrinsics.checkNotNullParameter(speedThreshold, "speedThreshold");
        Intrinsics.checkNotNullParameter(strengthThreshold, "strengthThreshold");
        return new ConnectionThreshold(speedThreshold, strengthThreshold);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionThreshold)) {
            return false;
        }
        ConnectionThreshold connectionThreshold = (ConnectionThreshold) other;
        return Intrinsics.areEqual(this.speedThreshold, connectionThreshold.speedThreshold) && Intrinsics.areEqual(this.strengthThreshold, connectionThreshold.strengthThreshold);
    }

    @NotNull
    public final SpeedThreshold getSpeedThreshold() {
        return this.speedThreshold;
    }

    @NotNull
    public final StrengthThreshold getStrengthThreshold() {
        return this.strengthThreshold;
    }

    public int hashCode() {
        return this.strengthThreshold.hashCode() + (this.speedThreshold.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ConnectionThreshold(speedThreshold=" + this.speedThreshold + ", strengthThreshold=" + this.strengthThreshold + ")";
    }

    public ConnectionThreshold(@NotNull SpeedThreshold speedThreshold, @NotNull StrengthThreshold strengthThreshold) {
        Intrinsics.checkNotNullParameter(speedThreshold, "speedThreshold");
        Intrinsics.checkNotNullParameter(strengthThreshold, "strengthThreshold");
        this.speedThreshold = speedThreshold;
        this.strengthThreshold = strengthThreshold;
    }

    public /* synthetic */ ConnectionThreshold(SpeedThreshold speedThreshold, StrengthThreshold strengthThreshold, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new SpeedThreshold(0, 0, 0, 7, null) : speedThreshold, (i10 & 2) != 0 ? new StrengthThreshold(0, 0, 0, 7, null) : strengthThreshold);
    }
}
