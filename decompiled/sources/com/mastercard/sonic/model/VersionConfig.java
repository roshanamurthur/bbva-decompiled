package com.mastercard.sonic.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VersionConfig.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J9\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/mastercard/sonic/model/VersionConfig;", "", "", "", "component1", "", "Lcom/mastercard/sonic/model/CueConfig;", "component2", "Lcom/mastercard/sonic/model/Analytics;", "component3", "sdkVersionList", "cuesMap", LandingAEMContentMapper.ANALYTICS, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getSdkVersionList", "()Ljava/util/List;", "b", "Ljava/util/Map;", "getCuesMap", "()Ljava/util/Map;", "c", "Lcom/mastercard/sonic/model/Analytics;", "getAnalytics", "()Lcom/mastercard/sonic/model/Analytics;", "<init>", "(Ljava/util/List;Ljava/util/Map;Lcom/mastercard/sonic/model/Analytics;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class VersionConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sdk_versions")
    @NotNull
    private final List<String> sdkVersionList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cues")
    @NotNull
    private final Map<String, CueConfig> cuesMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(LandingAEMContentMapper.ANALYTICS)
    @NotNull
    private final Analytics analytics;

    public VersionConfig(@NotNull List<String> sdkVersionList, @NotNull Map<String, CueConfig> cuesMap, @NotNull Analytics analytics) {
        Intrinsics.checkNotNullParameter(sdkVersionList, "sdkVersionList");
        Intrinsics.checkNotNullParameter(cuesMap, "cuesMap");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.sdkVersionList = sdkVersionList;
        this.cuesMap = cuesMap;
        this.analytics = analytics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VersionConfig copy$default(VersionConfig versionConfig, List list, Map map, Analytics analytics, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = versionConfig.sdkVersionList;
        }
        if ((i10 & 2) != 0) {
            map = versionConfig.cuesMap;
        }
        if ((i10 & 4) != 0) {
            analytics = versionConfig.analytics;
        }
        return versionConfig.copy(list, map, analytics);
    }

    @NotNull
    public final List<String> component1() {
        return this.sdkVersionList;
    }

    @NotNull
    public final Map<String, CueConfig> component2() {
        return this.cuesMap;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final VersionConfig copy(@NotNull List<String> sdkVersionList, @NotNull Map<String, CueConfig> cuesMap, @NotNull Analytics analytics) {
        Intrinsics.checkNotNullParameter(sdkVersionList, "sdkVersionList");
        Intrinsics.checkNotNullParameter(cuesMap, "cuesMap");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        return new VersionConfig(sdkVersionList, cuesMap, analytics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionConfig)) {
            return false;
        }
        VersionConfig versionConfig = (VersionConfig) other;
        return Intrinsics.areEqual(this.sdkVersionList, versionConfig.sdkVersionList) && Intrinsics.areEqual(this.cuesMap, versionConfig.cuesMap) && Intrinsics.areEqual(this.analytics, versionConfig.analytics);
    }

    @NotNull
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final Map<String, CueConfig> getCuesMap() {
        return this.cuesMap;
    }

    @NotNull
    public final List<String> getSdkVersionList() {
        return this.sdkVersionList;
    }

    public int hashCode() {
        return this.analytics.hashCode() + ((this.cuesMap.hashCode() + (this.sdkVersionList.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "VersionConfig(sdkVersionList=" + this.sdkVersionList + ", cuesMap=" + this.cuesMap + ", analytics=" + this.analytics + ")";
    }
}
