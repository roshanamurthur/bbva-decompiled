package com.bbva.glomohybrid.provider;

import com.bbva.discreetmode.camera.models.CameraConfiguration;
import com.bbva.discreetmode.camera.models.DiscreetModeCameraConfiguration;
import com.bbva.discreetmode.camera.models.ImageAnalysisConfiguration;
import com.bbva.discreetmode.models.DiscreetModeConfiguration;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class i0 extends Lambda implements Function2<Scope, ParametersHolder, DiscreetModeConfiguration> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i0 f33926p0 = new i0(2);

    @Override // kotlin.jvm.functions.Function2
    public final DiscreetModeConfiguration invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DiscreetModeConfiguration(new DiscreetModeCameraConfiguration(0L, new CameraConfiguration(0, 0, new ImageAnalysisConfiguration(ImageAnalysisConfiguration.Performance.ACCURATE, null, 2, null), 3, null), 1, null), null, 2, null);
    }
}
