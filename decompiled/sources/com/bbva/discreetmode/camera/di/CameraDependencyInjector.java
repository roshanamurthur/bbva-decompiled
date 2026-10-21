package com.bbva.discreetmode.camera.di;

import com.bbva.discreetmode.camera.DiscreetModeCameraUseCase;
import com.bbva.discreetmode.camera.models.CameraConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CameraDependencyInjector.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/discreetmode/camera/di/CameraDependencyInjector;", "", "()V", "injectUseCase", "Lcom/bbva/discreetmode/camera/DiscreetModeCameraUseCase;", "configuration", "Lcom/bbva/discreetmode/camera/models/CameraConfiguration;", "discreetmode_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CameraDependencyInjector {

    @NotNull
    public static final CameraDependencyInjector INSTANCE = new CameraDependencyInjector();

    @NotNull
    public final DiscreetModeCameraUseCase injectUseCase(@NotNull CameraConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new DiscreetModeCameraUseCase(configuration);
    }
}
