package com.bbva.ethermobilesdk.geolocation.geofencing.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransitionGeofence.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/TransitionGeofence;", "", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel;", "component1", "", "component2", "geofenceModel", "transitionType", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel;", "getGeofenceModel", "()Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTransitionType", "()I", "<init>", "(Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel;I)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class TransitionGeofence {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GeofenceModel geofenceModel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int transitionType;

    public TransitionGeofence(@NotNull GeofenceModel geofenceModel, int i10) {
        Intrinsics.checkNotNullParameter(geofenceModel, "geofenceModel");
        this.geofenceModel = geofenceModel;
        this.transitionType = i10;
    }

    public static /* synthetic */ TransitionGeofence copy$default(TransitionGeofence transitionGeofence, GeofenceModel geofenceModel, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            geofenceModel = transitionGeofence.geofenceModel;
        }
        if ((i11 & 2) != 0) {
            i10 = transitionGeofence.transitionType;
        }
        return transitionGeofence.copy(geofenceModel, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GeofenceModel getGeofenceModel() {
        return this.geofenceModel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTransitionType() {
        return this.transitionType;
    }

    @NotNull
    public final TransitionGeofence copy(@NotNull GeofenceModel geofenceModel, int transitionType) {
        Intrinsics.checkNotNullParameter(geofenceModel, "geofenceModel");
        return new TransitionGeofence(geofenceModel, transitionType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransitionGeofence)) {
            return false;
        }
        TransitionGeofence transitionGeofence = (TransitionGeofence) other;
        return Intrinsics.areEqual(this.geofenceModel, transitionGeofence.geofenceModel) && this.transitionType == transitionGeofence.transitionType;
    }

    @NotNull
    public final GeofenceModel getGeofenceModel() {
        return this.geofenceModel;
    }

    public final int getTransitionType() {
        return this.transitionType;
    }

    public int hashCode() {
        return (this.geofenceModel.hashCode() * 31) + this.transitionType;
    }

    @NotNull
    public String toString() {
        return "TransitionGeofence(geofenceModel=" + this.geofenceModel + ", transitionType=" + this.transitionType + ")";
    }
}
