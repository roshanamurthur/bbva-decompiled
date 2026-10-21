package com.bbva.ethermobilesdk.geolocation.geofencing.model;

import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.location.Geofence;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GeofenceModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001(J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006)"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel;", "", "Lcom/google/android/gms/location/Geofence;", "toGeofence", "", "a", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "requestId", "", "b", "D", "getLatitude", "()D", "latitude", "c", "getLongitude", "longitude", "", "d", "F", "getRadius", "()F", "radius", "", "e", "J", "getExpiration", "()J", "expiration", "", "f", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTransition", "()I", ConstantsKt.TRANSITION_EXTRA_ID, "g", "getLoiteringDelay", "loiteringDelay", "Builder", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class GeofenceModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String requestId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final double latitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final double longitude;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float radius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long expiration;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int transition;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int loiteringDelay;

    /* JADX INFO: compiled from: GeofenceModel.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\bA\u0010BJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u0012J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\t\u0010\u001a\u001a\u00020\rHÆ\u0003J\t\u0010\u001b\u001a\u00020\rHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\t\u0010\u001e\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001f\u001a\u00020\rHÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b\u0004\u0010-R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,\"\u0004\b\u0006\u0010-R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b\t\u00104R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b\f\u00109R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b\u000f\u0010>R\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=\"\u0004\b\u0011\u0010>¨\u0006C"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel$Builder;", "", "", "latitude", "setLatitude", "longitude", "setLongitude", "", "radius", "setRadius", "", "expiration", "setExpiration", "", ConstantsKt.TRANSITION_EXTRA_ID, "setTransition", "loiteringDelay", "setLoiteringDelay", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "requestId", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "b", "D", "getLatitude", "()D", "(D)V", "c", "getLongitude", "d", "F", "getRadius", "()F", "(F)V", "e", "J", "getExpiration", "()J", "(J)V", "f", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTransition", "()I", "(I)V", "g", "getLoiteringDelay", "<init>", "(Ljava/lang/String;DDFJII)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nGeofenceModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeofenceModel.kt\ncom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String requestId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public double latitude;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public double longitude;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public float radius;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long expiration;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int transition;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public int loiteringDelay;

        public Builder(@NotNull String requestId, double d2, double d3, float f6, long j10, int i10, int i11) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.requestId = requestId;
            this.latitude = d2;
            this.longitude = d3;
            this.radius = f6;
            this.expiration = j10;
            this.transition = i10;
            this.loiteringDelay = i11;
        }

        @NotNull
        public final GeofenceModel build() {
            return new GeofenceModel(this.requestId, this.latitude, this.longitude, this.radius, this.expiration, this.transition, this.loiteringDelay, null);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getExpiration() {
            return this.expiration;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getTransition() {
            return this.transition;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getLoiteringDelay() {
            return this.loiteringDelay;
        }

        @NotNull
        public final Builder copy(@NotNull String requestId, double latitude, double longitude, float radius, long expiration, int transition, int loiteringDelay) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            return new Builder(requestId, latitude, longitude, radius, expiration, transition, loiteringDelay);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.requestId, builder.requestId) && Double.compare(this.latitude, builder.latitude) == 0 && Double.compare(this.longitude, builder.longitude) == 0 && Float.compare(this.radius, builder.radius) == 0 && this.expiration == builder.expiration && this.transition == builder.transition && this.loiteringDelay == builder.loiteringDelay;
        }

        public final long getExpiration() {
            return this.expiration;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final int getLoiteringDelay() {
            return this.loiteringDelay;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final float getRadius() {
            return this.radius;
        }

        @NotNull
        public final String getRequestId() {
            return this.requestId;
        }

        public final int getTransition() {
            return this.transition;
        }

        public int hashCode() {
            int iHashCode = this.requestId.hashCode() * 31;
            long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
            int i10 = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
            int iA = z1.a(this.radius, (i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31, 31);
            long j10 = this.expiration;
            return ((((iA + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.transition) * 31) + this.loiteringDelay;
        }

        /* JADX INFO: renamed from: setExpiration, reason: collision with other method in class */
        public final void m4891setExpiration(long j10) {
            this.expiration = j10;
        }

        /* JADX INFO: renamed from: setLatitude, reason: collision with other method in class */
        public final void m4892setLatitude(double d2) {
            this.latitude = d2;
        }

        /* JADX INFO: renamed from: setLoiteringDelay, reason: collision with other method in class */
        public final void m4893setLoiteringDelay(int i10) {
            this.loiteringDelay = i10;
        }

        /* JADX INFO: renamed from: setLongitude, reason: collision with other method in class */
        public final void m4894setLongitude(double d2) {
            this.longitude = d2;
        }

        /* JADX INFO: renamed from: setRadius, reason: collision with other method in class */
        public final void m4895setRadius(float f6) {
            this.radius = f6;
        }

        public final void setRequestId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.requestId = str;
        }

        /* JADX INFO: renamed from: setTransition, reason: collision with other method in class */
        public final void m4896setTransition(int i10) {
            this.transition = i10;
        }

        @NotNull
        public String toString() {
            String str = this.requestId;
            double d2 = this.latitude;
            double d3 = this.longitude;
            float f6 = this.radius;
            long j10 = this.expiration;
            int i10 = this.transition;
            int i11 = this.loiteringDelay;
            StringBuilder sb2 = new StringBuilder("Builder(requestId=");
            sb2.append(str);
            sb2.append(", latitude=");
            sb2.append(d2);
            v.f(sb2, ", longitude=", d3, ", radius=");
            sb2.append(f6);
            sb2.append(", expiration=");
            sb2.append(j10);
            sb2.append(", transition=");
            sb2.append(i10);
            sb2.append(", loiteringDelay=");
            sb2.append(i11);
            sb2.append(")");
            return sb2.toString();
        }

        @NotNull
        public final Builder setExpiration(long expiration) {
            this.expiration = expiration;
            return this;
        }

        @NotNull
        public final Builder setLatitude(double latitude) {
            this.latitude = latitude;
            return this;
        }

        @NotNull
        public final Builder setLoiteringDelay(int loiteringDelay) {
            this.loiteringDelay = loiteringDelay;
            return this;
        }

        @NotNull
        public final Builder setLongitude(double longitude) {
            this.longitude = longitude;
            return this;
        }

        @NotNull
        public final Builder setRadius(float radius) {
            this.radius = radius;
            return this;
        }

        @NotNull
        public final Builder setTransition(int transition) {
            this.transition = transition;
            return this;
        }

        public /* synthetic */ Builder(String str, double d2, double d3, float f6, long j10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i12 & 2) != 0 ? 0.0d : d2, (i12 & 4) == 0 ? d3 : 0.0d, (i12 & 8) != 0 ? 0.0f : f6, (i12 & 16) != 0 ? -1L : j10, (i12 & 32) != 0 ? 0 : i10, (i12 & 64) == 0 ? i11 : 0);
        }
    }

    public GeofenceModel(String str, double d2, double d3, float f6, long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this.requestId = str;
        this.latitude = d2;
        this.longitude = d3;
        this.radius = f6;
        this.expiration = j10;
        this.transition = i10;
        this.loiteringDelay = i11;
    }

    public final long getExpiration() {
        return this.expiration;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final int getLoiteringDelay() {
        return this.loiteringDelay;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final float getRadius() {
        return this.radius;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    public final int getTransition() {
        return this.transition;
    }

    @NotNull
    public final Geofence toGeofence() {
        Geofence geofenceBuild = new Geofence.Builder().setCircularRegion(this.latitude, this.longitude, this.radius).setExpirationDuration(this.expiration).setRequestId(this.requestId).setTransitionTypes(this.transition).setLoiteringDelay(this.loiteringDelay).build();
        Intrinsics.checkNotNullExpressionValue(geofenceBuild, "build(...)");
        return geofenceBuild;
    }
}
