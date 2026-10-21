package com.bbva.ethermobilesdk.deviceinfo.data;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/Ram;", "", "available", "", "used", "total", "(JJJ)V", "getAvailable", "()J", "getTotal", "getUsed", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "deviceinfo_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Ram {
    private final long available;
    private final long total;
    private final long used;

    public Ram(long j10, long j11, long j12) {
        this.available = j10;
        this.used = j11;
        this.total = j12;
    }

    public static /* synthetic */ Ram copy$default(Ram ram, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = ram.available;
        }
        long j13 = j10;
        if ((i10 & 2) != 0) {
            j11 = ram.used;
        }
        long j14 = j11;
        if ((i10 & 4) != 0) {
            j12 = ram.total;
        }
        return ram.copy(j13, j14, j12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUsed() {
        return this.used;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTotal() {
        return this.total;
    }

    @NotNull
    public final Ram copy(long available, long used, long total) {
        return new Ram(available, used, total);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ram)) {
            return false;
        }
        Ram ram = (Ram) other;
        return this.available == ram.available && this.used == ram.used && this.total == ram.total;
    }

    public final long getAvailable() {
        return this.available;
    }

    public final long getTotal() {
        return this.total;
    }

    public final long getUsed() {
        return this.used;
    }

    public int hashCode() {
        long j10 = this.available;
        long j11 = this.used;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.total;
        return i10 + ((int) ((j12 >>> 32) ^ j12));
    }

    @NotNull
    public String toString() {
        return "Ram(available=" + this.available + ", used=" + this.used + ", total=" + this.total + ")";
    }
}
