package com.bbva.plugin.push.command.params;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ServiceParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/push/command/params/ServiceParams;", "", "serviceId", "", "(Ljava/lang/String;)V", "getServiceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "push-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ServiceParams {

    @Nullable
    private final String serviceId;

    public ServiceParams(@Nullable String str) {
        this.serviceId = str;
    }

    public static /* synthetic */ ServiceParams copy$default(ServiceParams serviceParams, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = serviceParams.serviceId;
        }
        return serviceParams.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    public final ServiceParams copy(@Nullable String serviceId) {
        return new ServiceParams(serviceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ServiceParams) && Intrinsics.areEqual(this.serviceId, ((ServiceParams) other).serviceId);
    }

    @Nullable
    public final String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        String str = this.serviceId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("ServiceParams(serviceId="), this.serviceId, RootService.CLOSE_BRACKET);
    }
}
