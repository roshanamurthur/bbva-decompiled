package com.bbva.notifications.model;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SalesforceDeeplinkInfo.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J+\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/bbva/notifications/model/SalesforceDeeplinkInfo;", "", "", "component1", "component2", "", "component3", "universalKey", "url", "hasOriginId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getUniversalKey", "()Ljava/lang/String;", "b", "getUrl", "c", "Z", "getHasOriginId", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class SalesforceDeeplinkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String universalKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean hasOriginId;

    public SalesforceDeeplinkInfo(@Nullable String str, @Nullable String str2, boolean z10) {
        this.universalKey = str;
        this.url = str2;
        this.hasOriginId = z10;
    }

    public static /* synthetic */ SalesforceDeeplinkInfo copy$default(SalesforceDeeplinkInfo salesforceDeeplinkInfo, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = salesforceDeeplinkInfo.universalKey;
        }
        if ((i10 & 2) != 0) {
            str2 = salesforceDeeplinkInfo.url;
        }
        if ((i10 & 4) != 0) {
            z10 = salesforceDeeplinkInfo.hasOriginId;
        }
        return salesforceDeeplinkInfo.copy(str, str2, z10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUniversalKey() {
        return this.universalKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasOriginId() {
        return this.hasOriginId;
    }

    @NotNull
    public final SalesforceDeeplinkInfo copy(@Nullable String universalKey, @Nullable String url, boolean hasOriginId) {
        return new SalesforceDeeplinkInfo(universalKey, url, hasOriginId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SalesforceDeeplinkInfo)) {
            return false;
        }
        SalesforceDeeplinkInfo salesforceDeeplinkInfo = (SalesforceDeeplinkInfo) other;
        return Intrinsics.areEqual(this.universalKey, salesforceDeeplinkInfo.universalKey) && Intrinsics.areEqual(this.url, salesforceDeeplinkInfo.url) && this.hasOriginId == salesforceDeeplinkInfo.hasOriginId;
    }

    public final boolean getHasOriginId() {
        return this.hasOriginId;
    }

    @Nullable
    public final String getUniversalKey() {
        return this.universalKey;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public int hashCode() {
        String str = this.universalKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z10 = this.hasOriginId;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SalesforceDeeplinkInfo(universalKey=");
        sb2.append(this.universalKey);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", hasOriginId=");
        return i.c(sb2, this.hasOriginId, ")");
    }
}
