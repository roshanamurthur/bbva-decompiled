package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JE\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/TraceSettings;", "", "", "", "component1", "component2", "component3", "Lcom/bbva/component/dm/settings/domain/model/AvailableVersions;", "component4", "observablesPages", "nativeLevels", "webLevels", "versions", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getObservablesPages", "()Ljava/util/List;", "b", "getNativeLevels", "c", "getWebLevels", "d", "Lcom/bbva/component/dm/settings/domain/model/AvailableVersions;", "getVersions", "()Lcom/bbva/component/dm/settings/domain/model/AvailableVersions;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bbva/component/dm/settings/domain/model/AvailableVersions;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class TraceSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> observablesPages;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> nativeLevels;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> webLevels;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AvailableVersions versions;

    public TraceSettings(@NotNull List<String> observablesPages, @NotNull List<String> nativeLevels, @NotNull List<String> webLevels, @Nullable AvailableVersions availableVersions) {
        Intrinsics.checkNotNullParameter(observablesPages, "observablesPages");
        Intrinsics.checkNotNullParameter(nativeLevels, "nativeLevels");
        Intrinsics.checkNotNullParameter(webLevels, "webLevels");
        this.observablesPages = observablesPages;
        this.nativeLevels = nativeLevels;
        this.webLevels = webLevels;
        this.versions = availableVersions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TraceSettings copy$default(TraceSettings traceSettings, List list, List list2, List list3, AvailableVersions availableVersions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = traceSettings.observablesPages;
        }
        if ((i10 & 2) != 0) {
            list2 = traceSettings.nativeLevels;
        }
        if ((i10 & 4) != 0) {
            list3 = traceSettings.webLevels;
        }
        if ((i10 & 8) != 0) {
            availableVersions = traceSettings.versions;
        }
        return traceSettings.copy(list, list2, list3, availableVersions);
    }

    @NotNull
    public final List<String> component1() {
        return this.observablesPages;
    }

    @NotNull
    public final List<String> component2() {
        return this.nativeLevels;
    }

    @NotNull
    public final List<String> component3() {
        return this.webLevels;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AvailableVersions getVersions() {
        return this.versions;
    }

    @NotNull
    public final TraceSettings copy(@NotNull List<String> observablesPages, @NotNull List<String> nativeLevels, @NotNull List<String> webLevels, @Nullable AvailableVersions versions) {
        Intrinsics.checkNotNullParameter(observablesPages, "observablesPages");
        Intrinsics.checkNotNullParameter(nativeLevels, "nativeLevels");
        Intrinsics.checkNotNullParameter(webLevels, "webLevels");
        return new TraceSettings(observablesPages, nativeLevels, webLevels, versions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraceSettings)) {
            return false;
        }
        TraceSettings traceSettings = (TraceSettings) other;
        return Intrinsics.areEqual(this.observablesPages, traceSettings.observablesPages) && Intrinsics.areEqual(this.nativeLevels, traceSettings.nativeLevels) && Intrinsics.areEqual(this.webLevels, traceSettings.webLevels) && Intrinsics.areEqual(this.versions, traceSettings.versions);
    }

    @NotNull
    public final List<String> getNativeLevels() {
        return this.nativeLevels;
    }

    @NotNull
    public final List<String> getObservablesPages() {
        return this.observablesPages;
    }

    @Nullable
    public final AvailableVersions getVersions() {
        return this.versions;
    }

    @NotNull
    public final List<String> getWebLevels() {
        return this.webLevels;
    }

    public int hashCode() {
        int iA = a.a(this.webLevels, a.a(this.nativeLevels, this.observablesPages.hashCode() * 31, 31), 31);
        AvailableVersions availableVersions = this.versions;
        return iA + (availableVersions == null ? 0 : availableVersions.hashCode());
    }

    @NotNull
    public String toString() {
        return "TraceSettings(observablesPages=" + this.observablesPages + ", nativeLevels=" + this.nativeLevels + ", webLevels=" + this.webLevels + ", versions=" + this.versions + ")";
    }

    public /* synthetic */ TraceSettings(List list, List list2, List list3, AvailableVersions availableVersions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, availableVersions);
    }
}
