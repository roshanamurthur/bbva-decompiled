package com.bbva.component.dm.devices.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UnrollNotificationsRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/devices/model/UnrollNotificationsRequest;", "", "", "component1", "component2", "component3", "host", "deviceId", "applicationId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "b", "getDeviceId", "c", "getApplicationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component-dm-devices_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class UnrollNotificationsRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String applicationId;

    public UnrollNotificationsRequest(@NotNull String host, @NotNull String deviceId, @NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.host = host;
        this.deviceId = deviceId;
        this.applicationId = applicationId;
    }

    public static /* synthetic */ UnrollNotificationsRequest copy$default(UnrollNotificationsRequest unrollNotificationsRequest, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unrollNotificationsRequest.host;
        }
        if ((i10 & 2) != 0) {
            str2 = unrollNotificationsRequest.deviceId;
        }
        if ((i10 & 4) != 0) {
            str3 = unrollNotificationsRequest.applicationId;
        }
        return unrollNotificationsRequest.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final UnrollNotificationsRequest copy(@NotNull String host, @NotNull String deviceId, @NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        return new UnrollNotificationsRequest(host, deviceId, applicationId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnrollNotificationsRequest)) {
            return false;
        }
        UnrollNotificationsRequest unrollNotificationsRequest = (UnrollNotificationsRequest) other;
        return Intrinsics.areEqual(this.host, unrollNotificationsRequest.host) && Intrinsics.areEqual(this.deviceId, unrollNotificationsRequest.deviceId) && Intrinsics.areEqual(this.applicationId, unrollNotificationsRequest.applicationId);
    }

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    public int hashCode() {
        return this.applicationId.hashCode() + n1.c(this.deviceId, this.host.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnrollNotificationsRequest(host=");
        sb2.append(this.host);
        sb2.append(", deviceId=");
        sb2.append(this.deviceId);
        sb2.append(", applicationId=");
        return y2.b(sb2, this.applicationId, RootService.CLOSE_BRACKET);
    }
}
