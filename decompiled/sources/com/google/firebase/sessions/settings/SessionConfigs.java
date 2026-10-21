package com.google.firebase.sessions.settings;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0004R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0007R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\nR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\nR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u000e¨\u0006+"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "", "component1", "()Ljava/lang/Boolean;", "", "component2", "()Ljava/lang/Double;", "", "component3", "()Ljava/lang/Integer;", "component4", "", "component5", "()Ljava/lang/Long;", "sessionEnabled", "sessionSamplingRate", "sessionRestartTimeout", "cacheDuration", "cacheUpdatedTime", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/Boolean;", "getSessionEnabled", "b", "Ljava/lang/Double;", "getSessionSamplingRate", "c", "Ljava/lang/Integer;", "getSessionRestartTimeout", "d", "getCacheDuration", "e", "Ljava/lang/Long;", "getCacheUpdatedTime", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SessionConfigs {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean sessionEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Double sessionSamplingRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer sessionRestartTimeout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer cacheDuration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long cacheUpdatedTime;

    public SessionConfigs(@Nullable Boolean bool, @Nullable Double d2, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l6) {
        this.sessionEnabled = bool;
        this.sessionSamplingRate = d2;
        this.sessionRestartTimeout = num;
        this.cacheDuration = num2;
        this.cacheUpdatedTime = l6;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d2, Integer num, Integer num2, Long l6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = sessionConfigs.sessionEnabled;
        }
        if ((i10 & 2) != 0) {
            d2 = sessionConfigs.sessionSamplingRate;
        }
        Double d3 = d2;
        if ((i10 & 4) != 0) {
            num = sessionConfigs.sessionRestartTimeout;
        }
        Integer num3 = num;
        if ((i10 & 8) != 0) {
            num2 = sessionConfigs.cacheDuration;
        }
        Integer num4 = num2;
        if ((i10 & 16) != 0) {
            l6 = sessionConfigs.cacheUpdatedTime;
        }
        return sessionConfigs.copy(bool, d3, num3, num4, l6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }

    @NotNull
    public final SessionConfigs copy(@Nullable Boolean sessionEnabled, @Nullable Double sessionSamplingRate, @Nullable Integer sessionRestartTimeout, @Nullable Integer cacheDuration, @Nullable Long cacheUpdatedTime) {
        return new SessionConfigs(sessionEnabled, sessionSamplingRate, sessionRestartTimeout, cacheDuration, cacheUpdatedTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) other;
        return Intrinsics.areEqual(this.sessionEnabled, sessionConfigs.sessionEnabled) && Intrinsics.areEqual((Object) this.sessionSamplingRate, (Object) sessionConfigs.sessionSamplingRate) && Intrinsics.areEqual(this.sessionRestartTimeout, sessionConfigs.sessionRestartTimeout) && Intrinsics.areEqual(this.cacheDuration, sessionConfigs.cacheDuration) && Intrinsics.areEqual(this.cacheUpdatedTime, sessionConfigs.cacheUpdatedTime);
    }

    @Nullable
    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    @Nullable
    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }

    @Nullable
    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    @Nullable
    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    @Nullable
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        Boolean bool = this.sessionEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d2 = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.sessionRestartTimeout;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDuration;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l6 = this.cacheUpdatedTime;
        return iHashCode4 + (l6 != null ? l6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.sessionEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionRestartTimeout=" + this.sessionRestartTimeout + ", cacheDuration=" + this.cacheDuration + ", cacheUpdatedTime=" + this.cacheUpdatedTime + RootService.CLOSE_BRACKET;
    }
}
