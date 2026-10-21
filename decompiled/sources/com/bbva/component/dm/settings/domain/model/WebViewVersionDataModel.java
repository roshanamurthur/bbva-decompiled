package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J)\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/WebViewVersionDataModel;", "", "", "component1", "", "component2", "minVersion", "packageIds", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getMinVersion", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "getPackageIds", "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class WebViewVersionDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String minVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> packageIds;

    public WebViewVersionDataModel(@NotNull String minVersion, @NotNull Map<String, String> packageIds) {
        Intrinsics.checkNotNullParameter(minVersion, "minVersion");
        Intrinsics.checkNotNullParameter(packageIds, "packageIds");
        this.minVersion = minVersion;
        this.packageIds = packageIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewVersionDataModel copy$default(WebViewVersionDataModel webViewVersionDataModel, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webViewVersionDataModel.minVersion;
        }
        if ((i10 & 2) != 0) {
            map = webViewVersionDataModel.packageIds;
        }
        return webViewVersionDataModel.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMinVersion() {
        return this.minVersion;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.packageIds;
    }

    @NotNull
    public final WebViewVersionDataModel copy(@NotNull String minVersion, @NotNull Map<String, String> packageIds) {
        Intrinsics.checkNotNullParameter(minVersion, "minVersion");
        Intrinsics.checkNotNullParameter(packageIds, "packageIds");
        return new WebViewVersionDataModel(minVersion, packageIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewVersionDataModel)) {
            return false;
        }
        WebViewVersionDataModel webViewVersionDataModel = (WebViewVersionDataModel) other;
        return Intrinsics.areEqual(this.minVersion, webViewVersionDataModel.minVersion) && Intrinsics.areEqual(this.packageIds, webViewVersionDataModel.packageIds);
    }

    @NotNull
    public final String getMinVersion() {
        return this.minVersion;
    }

    @NotNull
    public final Map<String, String> getPackageIds() {
        return this.packageIds;
    }

    public int hashCode() {
        return this.packageIds.hashCode() + (this.minVersion.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "WebViewVersionDataModel(minVersion=" + this.minVersion + ", packageIds=" + this.packageIds + ")";
    }
}
