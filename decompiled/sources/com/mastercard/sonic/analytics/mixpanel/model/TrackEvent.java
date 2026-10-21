package com.mastercard.sonic.analytics.mixpanel.model;

import androidx.appcompat.widget.a;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.sonic.controller.SonicType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TrackEvent.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001:\u0001.B7\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001f¨\u0006/"}, d2 = {"Lcom/mastercard/sonic/analytics/mixpanel/model/TrackEvent;", "", "Lcom/mastercard/sonic/controller/SonicType;", "component1", "", "component2", "Lcom/mastercard/sonic/analytics/mixpanel/model/TrackEvent$HapticsAnalytics;", "component3", "", "component4", "component5", "component6", "sonicType", "statusCode", "hapticsAnalytics", "cueName", "cueVersion", "volumeLevel", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/mastercard/sonic/controller/SonicType;", "getSonicType", "()Lcom/mastercard/sonic/controller/SonicType;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStatusCode", "()I", "c", "Lcom/mastercard/sonic/analytics/mixpanel/model/TrackEvent$HapticsAnalytics;", "getHapticsAnalytics", "()Lcom/mastercard/sonic/analytics/mixpanel/model/TrackEvent$HapticsAnalytics;", "d", "Ljava/lang/String;", "getCueName", "()Ljava/lang/String;", "e", "getCueVersion", "f", "getVolumeLevel", "<init>", "(Lcom/mastercard/sonic/controller/SonicType;ILcom/mastercard/sonic/analytics/mixpanel/model/TrackEvent$HapticsAnalytics;Ljava/lang/String;Ljava/lang/String;I)V", "HapticsAnalytics", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TrackEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SonicType sonicType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int statusCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HapticsAnalytics hapticsAnalytics;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cueName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cueVersion;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int volumeLevel;

    /* JADX INFO: compiled from: TrackEvent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/mastercard/sonic/analytics/mixpanel/model/TrackEvent$HapticsAnalytics;", "", "", "component1", "component2", "", "component3", "isEnabled", "isSupported", "hapticsStatus", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "()Z", "b", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getHapticsStatus", "()I", "<init>", "(ZZI)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class HapticsAnalytics {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final boolean isEnabled;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final boolean isSupported;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int hapticsStatus;

        public HapticsAnalytics(boolean z10, boolean z11, int i10) {
            this.isEnabled = z10;
            this.isSupported = z11;
            this.hapticsStatus = i10;
        }

        public static /* synthetic */ HapticsAnalytics copy$default(HapticsAnalytics hapticsAnalytics, boolean z10, boolean z11, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z10 = hapticsAnalytics.isEnabled;
            }
            if ((i11 & 2) != 0) {
                z11 = hapticsAnalytics.isSupported;
            }
            if ((i11 & 4) != 0) {
                i10 = hapticsAnalytics.hapticsStatus;
            }
            return hapticsAnalytics.copy(z10, z11, i10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsSupported() {
            return this.isSupported;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getHapticsStatus() {
            return this.hapticsStatus;
        }

        @NotNull
        public final HapticsAnalytics copy(boolean isEnabled, boolean isSupported, int hapticsStatus) {
            return new HapticsAnalytics(isEnabled, isSupported, hapticsStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HapticsAnalytics)) {
                return false;
            }
            HapticsAnalytics hapticsAnalytics = (HapticsAnalytics) other;
            return this.isEnabled == hapticsAnalytics.isEnabled && this.isSupported == hapticsAnalytics.isSupported && this.hapticsStatus == hapticsAnalytics.hapticsStatus;
        }

        public final int getHapticsStatus() {
            return this.hapticsStatus;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public int hashCode() {
            boolean z10 = this.isEnabled;
            ?? r1 = z10;
            if (z10) {
                r1 = 1;
            }
            int i10 = r1 * 31;
            boolean z11 = this.isSupported;
            return ((i10 + (z11 ? 1 : z11)) * 31) + this.hapticsStatus;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final boolean isSupported() {
            return this.isSupported;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("HapticsAnalytics(isEnabled=");
            sb2.append(this.isEnabled);
            sb2.append(", isSupported=");
            sb2.append(this.isSupported);
            sb2.append(", hapticsStatus=");
            return a.c(sb2, this.hapticsStatus, ")");
        }
    }

    public TrackEvent(@NotNull SonicType sonicType, int i10, @NotNull HapticsAnalytics hapticsAnalytics, @NotNull String cueName, @NotNull String cueVersion, int i11) {
        Intrinsics.checkNotNullParameter(sonicType, "sonicType");
        Intrinsics.checkNotNullParameter(hapticsAnalytics, "hapticsAnalytics");
        Intrinsics.checkNotNullParameter(cueName, "cueName");
        Intrinsics.checkNotNullParameter(cueVersion, "cueVersion");
        this.sonicType = sonicType;
        this.statusCode = i10;
        this.hapticsAnalytics = hapticsAnalytics;
        this.cueName = cueName;
        this.cueVersion = cueVersion;
        this.volumeLevel = i11;
    }

    public static /* synthetic */ TrackEvent copy$default(TrackEvent trackEvent, SonicType sonicType, int i10, HapticsAnalytics hapticsAnalytics, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            sonicType = trackEvent.sonicType;
        }
        if ((i12 & 2) != 0) {
            i10 = trackEvent.statusCode;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            hapticsAnalytics = trackEvent.hapticsAnalytics;
        }
        HapticsAnalytics hapticsAnalytics2 = hapticsAnalytics;
        if ((i12 & 8) != 0) {
            str = trackEvent.cueName;
        }
        String str3 = str;
        if ((i12 & 16) != 0) {
            str2 = trackEvent.cueVersion;
        }
        String str4 = str2;
        if ((i12 & 32) != 0) {
            i11 = trackEvent.volumeLevel;
        }
        return trackEvent.copy(sonicType, i13, hapticsAnalytics2, str3, str4, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SonicType getSonicType() {
        return this.sonicType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HapticsAnalytics getHapticsAnalytics() {
        return this.hapticsAnalytics;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCueName() {
        return this.cueName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCueVersion() {
        return this.cueVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getVolumeLevel() {
        return this.volumeLevel;
    }

    @NotNull
    public final TrackEvent copy(@NotNull SonicType sonicType, int statusCode, @NotNull HapticsAnalytics hapticsAnalytics, @NotNull String cueName, @NotNull String cueVersion, int volumeLevel) {
        Intrinsics.checkNotNullParameter(sonicType, "sonicType");
        Intrinsics.checkNotNullParameter(hapticsAnalytics, "hapticsAnalytics");
        Intrinsics.checkNotNullParameter(cueName, "cueName");
        Intrinsics.checkNotNullParameter(cueVersion, "cueVersion");
        return new TrackEvent(sonicType, statusCode, hapticsAnalytics, cueName, cueVersion, volumeLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackEvent)) {
            return false;
        }
        TrackEvent trackEvent = (TrackEvent) other;
        return this.sonicType == trackEvent.sonicType && this.statusCode == trackEvent.statusCode && Intrinsics.areEqual(this.hapticsAnalytics, trackEvent.hapticsAnalytics) && Intrinsics.areEqual(this.cueName, trackEvent.cueName) && Intrinsics.areEqual(this.cueVersion, trackEvent.cueVersion) && this.volumeLevel == trackEvent.volumeLevel;
    }

    @NotNull
    public final String getCueName() {
        return this.cueName;
    }

    @NotNull
    public final String getCueVersion() {
        return this.cueVersion;
    }

    @NotNull
    public final HapticsAnalytics getHapticsAnalytics() {
        return this.hapticsAnalytics;
    }

    @NotNull
    public final SonicType getSonicType() {
        return this.sonicType;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final int getVolumeLevel() {
        return this.volumeLevel;
    }

    public int hashCode() {
        return n1.c(this.cueVersion, n1.c(this.cueName, (this.hapticsAnalytics.hashCode() + (((this.sonicType.hashCode() * 31) + this.statusCode) * 31)) * 31, 31), 31) + this.volumeLevel;
    }

    @NotNull
    public String toString() {
        return "TrackEvent(sonicType=" + this.sonicType + ", statusCode=" + this.statusCode + ", hapticsAnalytics=" + this.hapticsAnalytics + ", cueName=" + this.cueName + ", cueVersion=" + this.cueVersion + ", volumeLevel=" + this.volumeLevel + ")";
    }
}
