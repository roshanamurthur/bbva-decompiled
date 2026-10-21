package com.bbva.discreetmode.models;

import com.bbva.discreetmode.camera.models.DiscreetModeCameraConfiguration;
import com.bbva.discreetmode.proximity.models.DiscreetModeProximityConfiguration;
import com.bbva.plugin.media.capture.util.Constants;
import com.salesforce.marketingcloud.storage.db.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DiscreetModeConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/discreetmode/models/DiscreetModeConfiguration;", "", "Lcom/bbva/discreetmode/camera/models/DiscreetModeCameraConfiguration;", "a", "Lcom/bbva/discreetmode/camera/models/DiscreetModeCameraConfiguration;", "getCamera", "()Lcom/bbva/discreetmode/camera/models/DiscreetModeCameraConfiguration;", Constants.CAMERA_SRC, "Lcom/bbva/discreetmode/proximity/models/DiscreetModeProximityConfiguration;", "b", "Lcom/bbva/discreetmode/proximity/models/DiscreetModeProximityConfiguration;", "getProximity", "()Lcom/bbva/discreetmode/proximity/models/DiscreetModeProximityConfiguration;", i.a.f65026x, "<init>", "(Lcom/bbva/discreetmode/camera/models/DiscreetModeCameraConfiguration;Lcom/bbva/discreetmode/proximity/models/DiscreetModeProximityConfiguration;)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetModeConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DiscreetModeCameraConfiguration camera;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DiscreetModeProximityConfiguration proximity;

    /* JADX WARN: Multi-variable type inference failed */
    public DiscreetModeConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final DiscreetModeCameraConfiguration getCamera() {
        return this.camera;
    }

    @NotNull
    public final DiscreetModeProximityConfiguration getProximity() {
        return this.proximity;
    }

    public DiscreetModeConfiguration(@NotNull DiscreetModeCameraConfiguration camera, @NotNull DiscreetModeProximityConfiguration proximity) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(proximity, "proximity");
        this.camera = camera;
        this.proximity = proximity;
    }

    public /* synthetic */ DiscreetModeConfiguration(DiscreetModeCameraConfiguration discreetModeCameraConfiguration, DiscreetModeProximityConfiguration discreetModeProximityConfiguration, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new DiscreetModeCameraConfiguration(0L, null, 3, null) : discreetModeCameraConfiguration, (i10 & 2) != 0 ? new DiscreetModeProximityConfiguration(0L, 1, null) : discreetModeProximityConfiguration);
    }
}
