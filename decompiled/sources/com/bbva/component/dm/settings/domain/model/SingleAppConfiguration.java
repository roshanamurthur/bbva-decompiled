package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\n\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/SingleAppConfiguration;", "", "", "component1", "", "component2", "", "component3", "Lcom/bbva/component/dm/settings/domain/model/Configuration;", "component4", "isActive", "imageUrl", "excludedVersions", "configuration", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "()Z", "b", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "c", "Ljava/util/List;", "getExcludedVersions", "()Ljava/util/List;", "d", "Lcom/bbva/component/dm/settings/domain/model/Configuration;", "getConfiguration", "()Lcom/bbva/component/dm/settings/domain/model/Configuration;", "<init>", "(ZLjava/lang/String;Ljava/util/List;Lcom/bbva/component/dm/settings/domain/model/Configuration;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class SingleAppConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isActive;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String imageUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<String> excludedVersions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Configuration configuration;

    public SingleAppConfiguration(boolean z10, @Nullable String str, @Nullable List<String> list, @Nullable Configuration configuration) {
        this.isActive = z10;
        this.imageUrl = str;
        this.excludedVersions = list;
        this.configuration = configuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SingleAppConfiguration copy$default(SingleAppConfiguration singleAppConfiguration, boolean z10, String str, List list, Configuration configuration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = singleAppConfiguration.isActive;
        }
        if ((i10 & 2) != 0) {
            str = singleAppConfiguration.imageUrl;
        }
        if ((i10 & 4) != 0) {
            list = singleAppConfiguration.excludedVersions;
        }
        if ((i10 & 8) != 0) {
            configuration = singleAppConfiguration.configuration;
        }
        return singleAppConfiguration.copy(z10, str, list, configuration);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final List<String> component3() {
        return this.excludedVersions;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    @NotNull
    public final SingleAppConfiguration copy(boolean isActive, @Nullable String imageUrl, @Nullable List<String> excludedVersions, @Nullable Configuration configuration) {
        return new SingleAppConfiguration(isActive, imageUrl, excludedVersions, configuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleAppConfiguration)) {
            return false;
        }
        SingleAppConfiguration singleAppConfiguration = (SingleAppConfiguration) other;
        return this.isActive == singleAppConfiguration.isActive && Intrinsics.areEqual(this.imageUrl, singleAppConfiguration.imageUrl) && Intrinsics.areEqual(this.excludedVersions, singleAppConfiguration.excludedVersions) && Intrinsics.areEqual(this.configuration, singleAppConfiguration.configuration);
    }

    @Nullable
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    @Nullable
    public final List<String> getExcludedVersions() {
        return this.excludedVersions;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z10 = this.isActive;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        String str = this.imageUrl;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.excludedVersions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Configuration configuration = this.configuration;
        return iHashCode2 + (configuration != null ? configuration.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        return "SingleAppConfiguration(isActive=" + this.isActive + ", imageUrl=" + this.imageUrl + ", excludedVersions=" + this.excludedVersions + ", configuration=" + this.configuration + ")";
    }

    public /* synthetic */ SingleAppConfiguration(boolean z10, String str, List list, Configuration configuration, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, str, (i10 & 4) != 0 ? null : list, configuration);
    }
}
