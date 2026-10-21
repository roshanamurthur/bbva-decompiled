package com.bbva.ethermobilesdk.geolocation.activity.model;

import androidx.annotation.Keep;
import androidx.datastore.preferences.protobuf.e;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/activity/model/ActivityParams;", "", "interval", "", "<init>", "(J)V", "getInterval", "()J", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "geolocation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivityParams {
    private final long interval;

    public ActivityParams() {
        this(0L, 1, null);
    }

    public static /* synthetic */ ActivityParams copy$default(ActivityParams activityParams, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = activityParams.interval;
        }
        return activityParams.copy(j10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getInterval() {
        return this.interval;
    }

    @NotNull
    public final ActivityParams copy(long interval) {
        return new ActivityParams(interval);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActivityParams) && this.interval == ((ActivityParams) other).interval;
    }

    public final long getInterval() {
        return this.interval;
    }

    public int hashCode() {
        long j10 = this.interval;
        return (int) (j10 ^ (j10 >>> 32));
    }

    @NotNull
    public String toString() {
        return e.f("ActivityParams(interval=", this.interval, ")");
    }

    public ActivityParams(long j10) {
        this.interval = j10;
    }

    public /* synthetic */ ActivityParams(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 500L : j10);
    }
}
