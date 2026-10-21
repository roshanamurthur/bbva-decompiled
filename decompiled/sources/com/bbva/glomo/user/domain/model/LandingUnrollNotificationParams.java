package com.bbva.glomo.user.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingUnrollNotificationParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomo/user/domain/model/LandingUnrollNotificationParams;", "", "", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "deviceId", "b", "getAppId", "setAppId", "appId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class LandingUnrollNotificationParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String appId;

    public LandingUnrollNotificationParams(@NotNull String deviceId, @NotNull String appId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.deviceId = deviceId;
        this.appId = appId;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final void setAppId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appId = str;
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }
}
