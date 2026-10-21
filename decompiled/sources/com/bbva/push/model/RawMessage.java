package com.bbva.push.model;

import androidx.annotation.Keep;
import androidx.camera.core.impl.v;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0001HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/bbva/push/model/RawMessage;", "", NotificationCompat.CATEGORY_SERVICE, "Lcom/bbva/push/model/ServiceResource;", "raw", "(Lcom/bbva/push/model/ServiceResource;Ljava/lang/Object;)V", "getRaw", "()Ljava/lang/Object;", "getService", "()Lcom/bbva/push/model/ServiceResource;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RawMessage {

    @NotNull
    private final Object raw;

    @NotNull
    private final ServiceResource service;

    public RawMessage(@NotNull ServiceResource service, @NotNull Object raw) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.service = service;
        this.raw = raw;
    }

    public static /* synthetic */ RawMessage copy$default(RawMessage rawMessage, ServiceResource serviceResource, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            serviceResource = rawMessage.service;
        }
        if ((i10 & 2) != 0) {
            obj = rawMessage.raw;
        }
        return rawMessage.copy(serviceResource, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ServiceResource getService() {
        return this.service;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getRaw() {
        return this.raw;
    }

    @NotNull
    public final RawMessage copy(@NotNull ServiceResource service, @NotNull Object raw) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(raw, "raw");
        return new RawMessage(service, raw);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawMessage)) {
            return false;
        }
        RawMessage rawMessage = (RawMessage) other;
        return this.service == rawMessage.service && Intrinsics.areEqual(this.raw, rawMessage.raw);
    }

    @NotNull
    public final Object getRaw() {
        return this.raw;
    }

    @NotNull
    public final ServiceResource getService() {
        return this.service;
    }

    public int hashCode() {
        return this.raw.hashCode() + (this.service.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RawMessage(service=");
        sb2.append(this.service);
        sb2.append(", raw=");
        return v.d(sb2, this.raw, RootService.CLOSE_BRACKET);
    }
}
