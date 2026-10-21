package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppVersionConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J^\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0004R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0004R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/VersionDataModel;", "", "", "component1", "()Ljava/lang/Integer;", "component2", "", "Lcom/bbva/component/dm/settings/domain/model/SdkVersion;", "component3", "", "component4", "component5", "Lcom/bbva/component/dm/settings/domain/model/InAppUpdates;", "component6", "minVersion", "adviceVersion", "bySdk", "packageId", "appStoreUrl", "inAppUpdates", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/settings/domain/model/InAppUpdates;)Lcom/bbva/component/dm/settings/domain/model/VersionDataModel;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/Integer;", "getMinVersion", "b", "getAdviceVersion", "c", "Ljava/util/List;", "getBySdk", "()Ljava/util/List;", "d", "Ljava/lang/String;", "getPackageId", "()Ljava/lang/String;", "e", "getAppStoreUrl", "f", "Lcom/bbva/component/dm/settings/domain/model/InAppUpdates;", "getInAppUpdates", "()Lcom/bbva/component/dm/settings/domain/model/InAppUpdates;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/settings/domain/model/InAppUpdates;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class VersionDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer minVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer adviceVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<SdkVersion> bySdk;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String packageId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String appStoreUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final InAppUpdates inAppUpdates;

    public VersionDataModel(@Nullable Integer num, @Nullable Integer num2, @Nullable List<SdkVersion> list, @Nullable String str, @Nullable String str2, @Nullable InAppUpdates inAppUpdates) {
        this.minVersion = num;
        this.adviceVersion = num2;
        this.bySdk = list;
        this.packageId = str;
        this.appStoreUrl = str2;
        this.inAppUpdates = inAppUpdates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VersionDataModel copy$default(VersionDataModel versionDataModel, Integer num, Integer num2, List list, String str, String str2, InAppUpdates inAppUpdates, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = versionDataModel.minVersion;
        }
        if ((i10 & 2) != 0) {
            num2 = versionDataModel.adviceVersion;
        }
        Integer num3 = num2;
        if ((i10 & 4) != 0) {
            list = versionDataModel.bySdk;
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            str = versionDataModel.packageId;
        }
        String str3 = str;
        if ((i10 & 16) != 0) {
            str2 = versionDataModel.appStoreUrl;
        }
        String str4 = str2;
        if ((i10 & 32) != 0) {
            inAppUpdates = versionDataModel.inAppUpdates;
        }
        return versionDataModel.copy(num, num3, list2, str3, str4, inAppUpdates);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMinVersion() {
        return this.minVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAdviceVersion() {
        return this.adviceVersion;
    }

    @Nullable
    public final List<SdkVersion> component3() {
        return this.bySdk;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppStoreUrl() {
        return this.appStoreUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InAppUpdates getInAppUpdates() {
        return this.inAppUpdates;
    }

    @NotNull
    public final VersionDataModel copy(@Nullable Integer minVersion, @Nullable Integer adviceVersion, @Nullable List<SdkVersion> bySdk, @Nullable String packageId, @Nullable String appStoreUrl, @Nullable InAppUpdates inAppUpdates) {
        return new VersionDataModel(minVersion, adviceVersion, bySdk, packageId, appStoreUrl, inAppUpdates);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionDataModel)) {
            return false;
        }
        VersionDataModel versionDataModel = (VersionDataModel) other;
        return Intrinsics.areEqual(this.minVersion, versionDataModel.minVersion) && Intrinsics.areEqual(this.adviceVersion, versionDataModel.adviceVersion) && Intrinsics.areEqual(this.bySdk, versionDataModel.bySdk) && Intrinsics.areEqual(this.packageId, versionDataModel.packageId) && Intrinsics.areEqual(this.appStoreUrl, versionDataModel.appStoreUrl) && Intrinsics.areEqual(this.inAppUpdates, versionDataModel.inAppUpdates);
    }

    @Nullable
    public final Integer getAdviceVersion() {
        return this.adviceVersion;
    }

    @Nullable
    public final String getAppStoreUrl() {
        return this.appStoreUrl;
    }

    @Nullable
    public final List<SdkVersion> getBySdk() {
        return this.bySdk;
    }

    @Nullable
    public final InAppUpdates getInAppUpdates() {
        return this.inAppUpdates;
    }

    @Nullable
    public final Integer getMinVersion() {
        return this.minVersion;
    }

    @Nullable
    public final String getPackageId() {
        return this.packageId;
    }

    public int hashCode() {
        Integer num = this.minVersion;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.adviceVersion;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<SdkVersion> list = this.bySdk;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.packageId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appStoreUrl;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        InAppUpdates inAppUpdates = this.inAppUpdates;
        return iHashCode5 + (inAppUpdates != null ? inAppUpdates.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VersionDataModel(minVersion=" + this.minVersion + ", adviceVersion=" + this.adviceVersion + ", bySdk=" + this.bySdk + ", packageId=" + this.packageId + ", appStoreUrl=" + this.appStoreUrl + ", inAppUpdates=" + this.inAppUpdates + ")";
    }
}
