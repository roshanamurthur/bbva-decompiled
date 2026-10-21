package com.bbva.ethermobilesdk.geolocation.location.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.geolocation.common.ConstantsKt;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams;", "", "", "component1", "", "component2", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationAccuracy;", "component3", "interval", "distance", ConstantsKt.ACCURACY, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "J", "getInterval", "()J", "b", "F", "getDistance", "()F", "c", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationAccuracy;", "getAccuracy", "()Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationAccuracy;", "Companion", "Builder", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class LocationParams {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final LocationParams f29832d = new Builder(0, 0.0f, null, 7, null).setAccuracy(LocationAccuracy.HIGH).setDistance(0.0f).setInterval(500L).build();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final LocationParams f29833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final LocationParams f29834f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long interval;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float distance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LocationAccuracy accuracy;

    /* JADX INFO: compiled from: LocationParams.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u000bJ\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0004\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u0007\u0010!R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\n\u0010&¨\u0006)"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams$Builder;", "", "", "interval", "setInterval", "", "distance", "setDistance", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationAccuracy;", ConstantsKt.ACCURACY, "setAccuracy", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "component1", "component2", "component3", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "J", "getInterval", "()J", "(J)V", "b", "F", "getDistance", "()F", "(F)V", "c", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationAccuracy;", "getAccuracy", "()Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationAccuracy;", "(Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationAccuracy;)V", "<init>", "(JFLcom/bbva/ethermobilesdk/geolocation/location/model/LocationAccuracy;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nLocationParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationParams.kt\ncom/bbva/ethermobilesdk/geolocation/location/model/LocationParams$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public long interval;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public float distance;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public LocationAccuracy accuracy;

        public Builder() {
            this(0L, 0.0f, null, 7, null);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, long j10, float f6, LocationAccuracy locationAccuracy, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = builder.interval;
            }
            if ((i10 & 2) != 0) {
                f6 = builder.distance;
            }
            if ((i10 & 4) != 0) {
                locationAccuracy = builder.accuracy;
            }
            return builder.copy(j10, f6, locationAccuracy);
        }

        @NotNull
        public final LocationParams build() {
            return new LocationParams(this.interval, this.distance, this.accuracy, null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getInterval() {
            return this.interval;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getDistance() {
            return this.distance;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final LocationAccuracy getAccuracy() {
            return this.accuracy;
        }

        @NotNull
        public final Builder copy(long interval, float distance, @NotNull LocationAccuracy accuracy) {
            Intrinsics.checkNotNullParameter(accuracy, "accuracy");
            return new Builder(interval, distance, accuracy);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return this.interval == builder.interval && Float.compare(this.distance, builder.distance) == 0 && this.accuracy == builder.accuracy;
        }

        @NotNull
        public final LocationAccuracy getAccuracy() {
            return this.accuracy;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getInterval() {
            return this.interval;
        }

        public int hashCode() {
            long j10 = this.interval;
            return this.accuracy.hashCode() + z1.a(this.distance, ((int) (j10 ^ (j10 >>> 32))) * 31, 31);
        }

        /* JADX INFO: renamed from: setAccuracy, reason: collision with other method in class */
        public final void m4897setAccuracy(@NotNull LocationAccuracy locationAccuracy) {
            Intrinsics.checkNotNullParameter(locationAccuracy, "<set-?>");
            this.accuracy = locationAccuracy;
        }

        /* JADX INFO: renamed from: setDistance, reason: collision with other method in class */
        public final void m4898setDistance(float f6) {
            this.distance = f6;
        }

        /* JADX INFO: renamed from: setInterval, reason: collision with other method in class */
        public final void m4899setInterval(long j10) {
            this.interval = j10;
        }

        @NotNull
        public String toString() {
            return "Builder(interval=" + this.interval + ", distance=" + this.distance + ", accuracy=" + this.accuracy + ")";
        }

        public Builder(long j10, float f6, @NotNull LocationAccuracy accuracy) {
            Intrinsics.checkNotNullParameter(accuracy, "accuracy");
            this.interval = j10;
            this.distance = f6;
            this.accuracy = accuracy;
        }

        @NotNull
        public final Builder setAccuracy(@NotNull LocationAccuracy accuracy) {
            Intrinsics.checkNotNullParameter(accuracy, "accuracy");
            this.accuracy = accuracy;
            return this;
        }

        @NotNull
        public final Builder setDistance(float distance) {
            this.distance = distance;
            return this;
        }

        @NotNull
        public final Builder setInterval(long interval) {
            this.interval = interval;
            return this;
        }

        public /* synthetic */ Builder(long j10, float f6, LocationAccuracy locationAccuracy, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0.0f : f6, (i10 & 4) != 0 ? LocationAccuracy.LOWEST : locationAccuracy);
        }
    }

    /* JADX INFO: compiled from: LocationParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams$Companion;", "", "<init>", "()V", "NAVIGATION", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams;", "getNAVIGATION", "()Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams;", "BEST_EFFORT", "getBEST_EFFORT", "LAZY", "getLAZY", "geolocation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LocationParams getBEST_EFFORT() {
            return LocationParams.f29833e;
        }

        @NotNull
        public final LocationParams getLAZY() {
            return LocationParams.f29834f;
        }

        @NotNull
        public final LocationParams getNAVIGATION() {
            return LocationParams.f29832d;
        }
    }

    static {
        float f6 = 0.0f;
        LocationAccuracy locationAccuracy = null;
        int i10 = 7;
        DefaultConstructorMarker defaultConstructorMarker = null;
        f29833e = new Builder(0L, f6, locationAccuracy, i10, defaultConstructorMarker).setAccuracy(LocationAccuracy.MEDIUM).setDistance(150.0f).setInterval(2500L).build();
        f29834f = new Builder(0L, f6, locationAccuracy, i10, defaultConstructorMarker).setAccuracy(LocationAccuracy.LOW).setDistance(500.0f).setInterval(5000L).build();
    }

    public /* synthetic */ LocationParams(long j10, float f6, LocationAccuracy locationAccuracy, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, f6, locationAccuracy);
    }

    public static /* synthetic */ LocationParams copy$default(LocationParams locationParams, long j10, float f6, LocationAccuracy locationAccuracy, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = locationParams.interval;
        }
        if ((i10 & 2) != 0) {
            f6 = locationParams.distance;
        }
        if ((i10 & 4) != 0) {
            locationAccuracy = locationParams.accuracy;
        }
        return locationParams.copy(j10, f6, locationAccuracy);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LocationAccuracy getAccuracy() {
        return this.accuracy;
    }

    @NotNull
    public final LocationParams copy(long interval, float distance, @NotNull LocationAccuracy accuracy) {
        Intrinsics.checkNotNullParameter(accuracy, "accuracy");
        return new LocationParams(interval, distance, accuracy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationParams)) {
            return false;
        }
        LocationParams locationParams = (LocationParams) other;
        return this.interval == locationParams.interval && Float.compare(this.distance, locationParams.distance) == 0 && this.accuracy == locationParams.accuracy;
    }

    @NotNull
    public final LocationAccuracy getAccuracy() {
        return this.accuracy;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final long getInterval() {
        return this.interval;
    }

    public int hashCode() {
        long j10 = this.interval;
        return this.accuracy.hashCode() + z1.a(this.distance, ((int) (j10 ^ (j10 >>> 32))) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "LocationParams(interval=" + this.interval + ", distance=" + this.distance + ", accuracy=" + this.accuracy + ")";
    }

    public LocationParams(long j10, float f6, LocationAccuracy locationAccuracy) {
        this.interval = j10;
        this.distance = f6;
        this.accuracy = locationAccuracy;
    }
}
