package com.bbva.ethermobilesdk.deviceinfo.data;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/Storage;", "", "available", "", "used", "total", "externalAvailable", "externalUsed", "externalTotal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvailable", "()Ljava/lang/String;", "getExternalAvailable", "getExternalTotal", "getExternalUsed", "getTotal", "getUsed", "deviceinfo_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Storage {

    @NotNull
    private final String available;

    @NotNull
    private final String externalAvailable;

    @NotNull
    private final String externalTotal;

    @NotNull
    private final String externalUsed;

    @NotNull
    private final String total;

    @NotNull
    private final String used;

    public Storage(@NotNull String available, @NotNull String used, @NotNull String total, @NotNull String externalAvailable, @NotNull String externalUsed, @NotNull String externalTotal) {
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(used, "used");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(externalAvailable, "externalAvailable");
        Intrinsics.checkNotNullParameter(externalUsed, "externalUsed");
        Intrinsics.checkNotNullParameter(externalTotal, "externalTotal");
        this.available = available;
        this.used = used;
        this.total = total;
        this.externalAvailable = externalAvailable;
        this.externalUsed = externalUsed;
        this.externalTotal = externalTotal;
    }

    @NotNull
    public final String getAvailable() {
        return this.available;
    }

    @NotNull
    public final String getExternalAvailable() {
        return this.externalAvailable;
    }

    @NotNull
    public final String getExternalTotal() {
        return this.externalTotal;
    }

    @NotNull
    public final String getExternalUsed() {
        return this.externalUsed;
    }

    @NotNull
    public final String getTotal() {
        return this.total;
    }

    @NotNull
    public final String getUsed() {
        return this.used;
    }
}
