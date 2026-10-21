package com.bbva.ethermobilesdk.passchecker.model.api.output;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CrackTimesSeconds.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/CrackTimesSeconds;", "", "offlineFastHashing1E10PerSecond", "", "offlineSlowHashing1E4PerSecond", "onlineNoThrottling10PerSecond", "onlineThrottling100PerHour", "(DDDD)V", "getOfflineFastHashing1E10PerSecond", "()D", "getOfflineSlowHashing1E4PerSecond", "getOnlineNoThrottling10PerSecond", "getOnlineThrottling100PerHour", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CrackTimesSeconds {
    private final double offlineFastHashing1E10PerSecond;
    private final double offlineSlowHashing1E4PerSecond;
    private final double onlineNoThrottling10PerSecond;
    private final double onlineThrottling100PerHour;

    public CrackTimesSeconds(double d2, double d3, double d7, double d10) {
        this.offlineFastHashing1E10PerSecond = d2;
        this.offlineSlowHashing1E4PerSecond = d3;
        this.onlineNoThrottling10PerSecond = d7;
        this.onlineThrottling100PerHour = d10;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getOfflineFastHashing1E10PerSecond() {
        return this.offlineFastHashing1E10PerSecond;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getOfflineSlowHashing1E4PerSecond() {
        return this.offlineSlowHashing1E4PerSecond;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getOnlineNoThrottling10PerSecond() {
        return this.onlineNoThrottling10PerSecond;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getOnlineThrottling100PerHour() {
        return this.onlineThrottling100PerHour;
    }

    @NotNull
    public final CrackTimesSeconds copy(double offlineFastHashing1E10PerSecond, double offlineSlowHashing1E4PerSecond, double onlineNoThrottling10PerSecond, double onlineThrottling100PerHour) {
        return new CrackTimesSeconds(offlineFastHashing1E10PerSecond, offlineSlowHashing1E4PerSecond, onlineNoThrottling10PerSecond, onlineThrottling100PerHour);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrackTimesSeconds)) {
            return false;
        }
        CrackTimesSeconds crackTimesSeconds = (CrackTimesSeconds) other;
        return Double.compare(this.offlineFastHashing1E10PerSecond, crackTimesSeconds.offlineFastHashing1E10PerSecond) == 0 && Double.compare(this.offlineSlowHashing1E4PerSecond, crackTimesSeconds.offlineSlowHashing1E4PerSecond) == 0 && Double.compare(this.onlineNoThrottling10PerSecond, crackTimesSeconds.onlineNoThrottling10PerSecond) == 0 && Double.compare(this.onlineThrottling100PerHour, crackTimesSeconds.onlineThrottling100PerHour) == 0;
    }

    public final double getOfflineFastHashing1E10PerSecond() {
        return this.offlineFastHashing1E10PerSecond;
    }

    public final double getOfflineSlowHashing1E4PerSecond() {
        return this.offlineSlowHashing1E4PerSecond;
    }

    public final double getOnlineNoThrottling10PerSecond() {
        return this.onlineNoThrottling10PerSecond;
    }

    public final double getOnlineThrottling100PerHour() {
        return this.onlineThrottling100PerHour;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.offlineFastHashing1E10PerSecond);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.offlineSlowHashing1E4PerSecond);
        int i10 = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.onlineNoThrottling10PerSecond);
        int i11 = (i10 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.onlineThrottling100PerHour);
        return i11 + ((int) ((jDoubleToLongBits4 >>> 32) ^ jDoubleToLongBits4));
    }

    @NotNull
    public String toString() {
        return "CrackTimesSeconds(offlineFastHashing1E10PerSecond=" + this.offlineFastHashing1E10PerSecond + ", offlineSlowHashing1E4PerSecond=" + this.offlineSlowHashing1E4PerSecond + ", onlineNoThrottling10PerSecond=" + this.onlineNoThrottling10PerSecond + ", onlineThrottling100PerHour=" + this.onlineThrottling100PerHour + RootService.CLOSE_BRACKET;
    }
}
