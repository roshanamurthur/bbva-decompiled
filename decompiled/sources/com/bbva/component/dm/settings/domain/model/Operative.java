package com.bbva.component.dm.settings.domain.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003Jh\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\tR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102¨\u00067"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/Operative;", "", "", "component1", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Boolean;", "Lcom/bbva/component/dm/settings/domain/model/OperativeParams;", "component6", "Lcom/bbva/component/dm/settings/domain/model/VersionOperative;", "component7", "component8", "id", "icon", "title", "routeType", "webManager", "params", "minVersion", "maxVersion", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/bbva/component/dm/settings/domain/model/OperativeParams;Lcom/bbva/component/dm/settings/domain/model/VersionOperative;Lcom/bbva/component/dm/settings/domain/model/VersionOperative;)Lcom/bbva/component/dm/settings/domain/model/Operative;", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getIcon", "c", "getTitle", "d", "getRouteType", "e", "Ljava/lang/Boolean;", "getWebManager", "f", "Lcom/bbva/component/dm/settings/domain/model/OperativeParams;", "getParams", "()Lcom/bbva/component/dm/settings/domain/model/OperativeParams;", "g", "Lcom/bbva/component/dm/settings/domain/model/VersionOperative;", "getMinVersion", "()Lcom/bbva/component/dm/settings/domain/model/VersionOperative;", "h", "getMaxVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/bbva/component/dm/settings/domain/model/OperativeParams;Lcom/bbva/component/dm/settings/domain/model/VersionOperative;Lcom/bbva/component/dm/settings/domain/model/VersionOperative;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Operative {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String icon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String routeType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean webManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final OperativeParams params;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final VersionOperative minVersion;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final VersionOperative maxVersion;

    public Operative(@NotNull String id, @NotNull String icon, @NotNull String title, @NotNull String routeType, @Nullable Boolean bool, @Nullable OperativeParams operativeParams, @Nullable VersionOperative versionOperative, @Nullable VersionOperative versionOperative2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(routeType, "routeType");
        this.id = id;
        this.icon = icon;
        this.title = title;
        this.routeType = routeType;
        this.webManager = bool;
        this.params = operativeParams;
        this.minVersion = versionOperative;
        this.maxVersion = versionOperative2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRouteType() {
        return this.routeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getWebManager() {
        return this.webManager;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OperativeParams getParams() {
        return this.params;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final VersionOperative getMinVersion() {
        return this.minVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final VersionOperative getMaxVersion() {
        return this.maxVersion;
    }

    @NotNull
    public final Operative copy(@NotNull String id, @NotNull String icon, @NotNull String title, @NotNull String routeType, @Nullable Boolean webManager, @Nullable OperativeParams params, @Nullable VersionOperative minVersion, @Nullable VersionOperative maxVersion) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(routeType, "routeType");
        return new Operative(id, icon, title, routeType, webManager, params, minVersion, maxVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Operative)) {
            return false;
        }
        Operative operative = (Operative) other;
        return Intrinsics.areEqual(this.id, operative.id) && Intrinsics.areEqual(this.icon, operative.icon) && Intrinsics.areEqual(this.title, operative.title) && Intrinsics.areEqual(this.routeType, operative.routeType) && Intrinsics.areEqual(this.webManager, operative.webManager) && Intrinsics.areEqual(this.params, operative.params) && Intrinsics.areEqual(this.minVersion, operative.minVersion) && Intrinsics.areEqual(this.maxVersion, operative.maxVersion);
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final VersionOperative getMaxVersion() {
        return this.maxVersion;
    }

    @Nullable
    public final VersionOperative getMinVersion() {
        return this.minVersion;
    }

    @Nullable
    public final OperativeParams getParams() {
        return this.params;
    }

    @NotNull
    public final String getRouteType() {
        return this.routeType;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Boolean getWebManager() {
        return this.webManager;
    }

    public int hashCode() {
        int iC = n1.c(this.routeType, n1.c(this.title, n1.c(this.icon, this.id.hashCode() * 31, 31), 31), 31);
        Boolean bool = this.webManager;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        OperativeParams operativeParams = this.params;
        int iHashCode2 = (iHashCode + (operativeParams == null ? 0 : operativeParams.hashCode())) * 31;
        VersionOperative versionOperative = this.minVersion;
        int iHashCode3 = (iHashCode2 + (versionOperative == null ? 0 : versionOperative.hashCode())) * 31;
        VersionOperative versionOperative2 = this.maxVersion;
        return iHashCode3 + (versionOperative2 != null ? versionOperative2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Operative(id=" + this.id + ", icon=" + this.icon + ", title=" + this.title + ", routeType=" + this.routeType + ", webManager=" + this.webManager + ", params=" + this.params + ", minVersion=" + this.minVersion + ", maxVersion=" + this.maxVersion + ")";
    }
}
