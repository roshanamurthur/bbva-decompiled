package com.bbva.ethermobilesdk.devicemanager.model.input;

import ad.d;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceIdRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceIdRequest;", "", "", "component1", Constants.backendRequestUserId, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class DeviceIdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String userId;

    public DeviceIdRequest(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
    }

    public static /* synthetic */ DeviceIdRequest copy$default(DeviceIdRequest deviceIdRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deviceIdRequest.userId;
        }
        return deviceIdRequest.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final DeviceIdRequest copy(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new DeviceIdRequest(userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceIdRequest) && Intrinsics.areEqual(this.userId, ((DeviceIdRequest) other).userId);
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userId.hashCode();
    }

    @NotNull
    public String toString() {
        return d.f(new StringBuilder("DeviceIdRequest(userId="), this.userId, ")");
    }
}
