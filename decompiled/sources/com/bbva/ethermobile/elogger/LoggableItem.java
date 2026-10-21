package com.bbva.ethermobile.elogger;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003J\u001f\u0010\u0006\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobile/elogger/LoggableItem;", "", "", "", "component1", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "elogger_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LoggableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Object> payload;

    public LoggableItem(@NotNull Map<String, ? extends Object> payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.payload = payload;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoggableItem copy$default(LoggableItem loggableItem, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = loggableItem.payload;
        }
        return loggableItem.copy(map);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.payload;
    }

    @NotNull
    public final LoggableItem copy(@NotNull Map<String, ? extends Object> payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new LoggableItem(payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoggableItem) && Intrinsics.areEqual(this.payload, ((LoggableItem) other).payload);
    }

    @NotNull
    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoggableItem(payload=" + this.payload + ")";
    }
}
