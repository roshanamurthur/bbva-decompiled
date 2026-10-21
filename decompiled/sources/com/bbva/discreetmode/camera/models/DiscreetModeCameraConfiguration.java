package com.bbva.discreetmode.camera.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DiscreetModeCameraConfigurations.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/discreetmode/camera/models/DiscreetModeCameraConfiguration;", "", "", "a", "J", "getNotificationDelay", "()J", "notificationDelay", "Lcom/bbva/discreetmode/camera/models/CameraConfiguration;", "b", "Lcom/bbva/discreetmode/camera/models/CameraConfiguration;", "getConfiguration", "()Lcom/bbva/discreetmode/camera/models/CameraConfiguration;", "configuration", "<init>", "(JLcom/bbva/discreetmode/camera/models/CameraConfiguration;)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetModeCameraConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long notificationDelay;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraConfiguration configuration;

    public DiscreetModeCameraConfiguration() {
        this(0L, null, 3, null);
    }

    @NotNull
    public final CameraConfiguration getConfiguration() {
        return this.configuration;
    }

    public final long getNotificationDelay() {
        return this.notificationDelay;
    }

    public DiscreetModeCameraConfiguration(long j10, @NotNull CameraConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.notificationDelay = j10;
        this.configuration = configuration;
    }

    public /* synthetic */ DiscreetModeCameraConfiguration(long j10, CameraConfiguration cameraConfiguration, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? new CameraConfiguration(0, 0, null, 7, null) : cameraConfiguration);
    }
}
