package com.bbva.plugin.geolocation.command.params;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WatchLocationParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/bbva/plugin/geolocation/command/params/WatchLocationParams;", "", "interval", "", "<init>", "(Ljava/lang/Long;)V", "getInterval", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/bbva/plugin/geolocation/command/params/WatchLocationParams;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WatchLocationParams {

    @Nullable
    private final Long interval;

    /* JADX WARN: Multi-variable type inference failed */
    public WatchLocationParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WatchLocationParams copy$default(WatchLocationParams watchLocationParams, Long l6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l6 = watchLocationParams.interval;
        }
        return watchLocationParams.copy(l6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getInterval() {
        return this.interval;
    }

    @NotNull
    public final WatchLocationParams copy(@Nullable Long interval) {
        return new WatchLocationParams(interval);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WatchLocationParams) && Intrinsics.areEqual(this.interval, ((WatchLocationParams) other).interval);
    }

    @Nullable
    public final Long getInterval() {
        return this.interval;
    }

    public int hashCode() {
        Long l6 = this.interval;
        if (l6 == null) {
            return 0;
        }
        return l6.hashCode();
    }

    @NotNull
    public String toString() {
        return "WatchLocationParams(interval=" + this.interval + ")";
    }

    public WatchLocationParams(@Nullable Long l6) {
        this.interval = l6;
    }

    public /* synthetic */ WatchLocationParams(Long l6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 3000L : l6);
    }
}
