package com.bbva.notifications.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationsProviderConfig.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/bbva/notifications/model/NotificationsProviderConfig;", "", "", "component1", "component2", "component3", "component4", "appId", "accessToken", "serverUrl", EventDataKeys.Identity.VISITOR_ID_MID, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "b", "getAccessToken", "c", "getServerUrl", "d", "getMid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class NotificationsProviderConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String appId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String accessToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String serverUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String mid;

    public NotificationsProviderConfig(@NotNull String appId, @NotNull String accessToken, @NotNull String serverUrl, @NotNull String mid) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(mid, "mid");
        this.appId = appId;
        this.accessToken = accessToken;
        this.serverUrl = serverUrl;
        this.mid = mid;
    }

    public static /* synthetic */ NotificationsProviderConfig copy$default(NotificationsProviderConfig notificationsProviderConfig, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationsProviderConfig.appId;
        }
        if ((i10 & 2) != 0) {
            str2 = notificationsProviderConfig.accessToken;
        }
        if ((i10 & 4) != 0) {
            str3 = notificationsProviderConfig.serverUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = notificationsProviderConfig.mid;
        }
        return notificationsProviderConfig.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMid() {
        return this.mid;
    }

    @NotNull
    public final NotificationsProviderConfig copy(@NotNull String appId, @NotNull String accessToken, @NotNull String serverUrl, @NotNull String mid) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(mid, "mid");
        return new NotificationsProviderConfig(appId, accessToken, serverUrl, mid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationsProviderConfig)) {
            return false;
        }
        NotificationsProviderConfig notificationsProviderConfig = (NotificationsProviderConfig) other;
        return Intrinsics.areEqual(this.appId, notificationsProviderConfig.appId) && Intrinsics.areEqual(this.accessToken, notificationsProviderConfig.accessToken) && Intrinsics.areEqual(this.serverUrl, notificationsProviderConfig.serverUrl) && Intrinsics.areEqual(this.mid, notificationsProviderConfig.mid);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    @NotNull
    public final String getServerUrl() {
        return this.serverUrl;
    }

    public int hashCode() {
        return this.mid.hashCode() + n1.c(this.serverUrl, n1.c(this.accessToken, this.appId.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationsProviderConfig(appId=");
        sb2.append(this.appId);
        sb2.append(", accessToken=");
        sb2.append(this.accessToken);
        sb2.append(", serverUrl=");
        sb2.append(this.serverUrl);
        sb2.append(", mid=");
        return d.f(sb2, this.mid, ")");
    }
}
