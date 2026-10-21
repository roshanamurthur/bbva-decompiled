package com.bbva.discreetmode.camera.models;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DiscreetModeCameraConfigurations.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/bbva/discreetmode/camera/models/CameraConfiguration;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getWidth", "()I", "width", "b", "getHeight", "height", "Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration;", "c", "Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration;", "getAnalysisConfig", "()Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration;", "analysisConfig", "<init>", "(IILcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration;)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class CameraConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageAnalysisConfiguration analysisConfig;

    public CameraConfiguration() {
        this(0, 0, null, 7, null);
    }

    @NotNull
    public final ImageAnalysisConfiguration getAnalysisConfig() {
        return this.analysisConfig;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public CameraConfiguration(int i10, int i11, @NotNull ImageAnalysisConfiguration analysisConfig) {
        Intrinsics.checkNotNullParameter(analysisConfig, "analysisConfig");
        this.width = i10;
        this.height = i11;
        this.analysisConfig = analysisConfig;
    }

    public /* synthetic */ CameraConfiguration(int i10, int i11, ImageAnalysisConfiguration imageAnalysisConfiguration, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 480 : i10, (i12 & 2) != 0 ? 360 : i11, (i12 & 4) != 0 ? new ImageAnalysisConfiguration(null, null, 3, null) : imageAnalysisConfiguration);
    }
}
