package com.bbva.component.request.header.deviceid;

import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceIdInterceptorConfig.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003JE\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016¨\u0006!"}, d2 = {"Lcom/bbva/component/request/header/deviceid/DeviceIdInterceptorConfig;", "", "", "", "component1", "component2", "component3", "component4", "whiteList", Constants.authenticationType, "denyList", "publicZoneList", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getWhiteList", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getAuthenticationType", "()Ljava/lang/String;", "c", "getDenyList", "d", "getPublicZoneList", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "request-header-deviceid_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class DeviceIdInterceptorConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> whiteList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String authenticationType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> denyList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> publicZoneList;

    public DeviceIdInterceptorConfig(@NotNull List<String> whiteList, @Nullable String str, @NotNull List<String> denyList, @NotNull List<String> publicZoneList) {
        Intrinsics.checkNotNullParameter(whiteList, "whiteList");
        Intrinsics.checkNotNullParameter(denyList, "denyList");
        Intrinsics.checkNotNullParameter(publicZoneList, "publicZoneList");
        this.whiteList = whiteList;
        this.authenticationType = str;
        this.denyList = denyList;
        this.publicZoneList = publicZoneList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceIdInterceptorConfig copy$default(DeviceIdInterceptorConfig deviceIdInterceptorConfig, List list, String str, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = deviceIdInterceptorConfig.whiteList;
        }
        if ((i10 & 2) != 0) {
            str = deviceIdInterceptorConfig.authenticationType;
        }
        if ((i10 & 4) != 0) {
            list2 = deviceIdInterceptorConfig.denyList;
        }
        if ((i10 & 8) != 0) {
            list3 = deviceIdInterceptorConfig.publicZoneList;
        }
        return deviceIdInterceptorConfig.copy(list, str, list2, list3);
    }

    @NotNull
    public final List<String> component1() {
        return this.whiteList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    @NotNull
    public final List<String> component3() {
        return this.denyList;
    }

    @NotNull
    public final List<String> component4() {
        return this.publicZoneList;
    }

    @NotNull
    public final DeviceIdInterceptorConfig copy(@NotNull List<String> whiteList, @Nullable String authenticationType, @NotNull List<String> denyList, @NotNull List<String> publicZoneList) {
        Intrinsics.checkNotNullParameter(whiteList, "whiteList");
        Intrinsics.checkNotNullParameter(denyList, "denyList");
        Intrinsics.checkNotNullParameter(publicZoneList, "publicZoneList");
        return new DeviceIdInterceptorConfig(whiteList, authenticationType, denyList, publicZoneList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceIdInterceptorConfig)) {
            return false;
        }
        DeviceIdInterceptorConfig deviceIdInterceptorConfig = (DeviceIdInterceptorConfig) other;
        return Intrinsics.areEqual(this.whiteList, deviceIdInterceptorConfig.whiteList) && Intrinsics.areEqual(this.authenticationType, deviceIdInterceptorConfig.authenticationType) && Intrinsics.areEqual(this.denyList, deviceIdInterceptorConfig.denyList) && Intrinsics.areEqual(this.publicZoneList, deviceIdInterceptorConfig.publicZoneList);
    }

    @Nullable
    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    @NotNull
    public final List<String> getDenyList() {
        return this.denyList;
    }

    @NotNull
    public final List<String> getPublicZoneList() {
        return this.publicZoneList;
    }

    @NotNull
    public final List<String> getWhiteList() {
        return this.whiteList;
    }

    public int hashCode() {
        int iHashCode = this.whiteList.hashCode() * 31;
        String str = this.authenticationType;
        return this.publicZoneList.hashCode() + a.a(this.denyList, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "DeviceIdInterceptorConfig(whiteList=" + this.whiteList + ", authenticationType=" + this.authenticationType + ", denyList=" + this.denyList + ", publicZoneList=" + this.publicZoneList + ")";
    }

    public /* synthetic */ DeviceIdInterceptorConfig(List list, String str, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i10 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
