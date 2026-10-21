package com.bbva.discreetmode.camera.models;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DiscreetModeCameraConfigurations.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u001b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration;", "", "Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration$Performance;", "a", "Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration$Performance;", "getPerformanceMode", "()Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration$Performance;", "performanceMode", "Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration$Classifications;", "b", "Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration$Classifications;", "getClassification", "()Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration$Classifications;", VDDocumentConfiguration.CLASSIFICATION, "<init>", "(Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration$Performance;Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration$Classifications;)V", "Classifications", "Performance", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class ImageAnalysisConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Performance performanceMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Classifications classification;

    /* JADX INFO: compiled from: DiscreetModeCameraConfigurations.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration$Classifications;", "", "", "value", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "EYES", ExpectedUserActionOnPoiTypes.NONE, "discreetmode_release"}, k = 1, mv = {1, 5, 1})
    public enum Classifications {
        EYES(2),
        NONE(1);

        private final int value;

        Classifications(int i10) {
            this.value = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Classifications[] valuesCustom() {
            Classifications[] classificationsArrValuesCustom = values();
            return (Classifications[]) Arrays.copyOf(classificationsArrValuesCustom, classificationsArrValuesCustom.length);
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: DiscreetModeCameraConfigurations.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration$Performance;", "", "", "value", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "FAST", "ACCURATE", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
    public enum Performance {
        FAST(1),
        ACCURATE(2);

        private final int value;

        Performance(int i10) {
            this.value = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Performance[] valuesCustom() {
            Performance[] performanceArrValuesCustom = values();
            return (Performance[]) Arrays.copyOf(performanceArrValuesCustom, performanceArrValuesCustom.length);
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageAnalysisConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Classifications getClassification() {
        return this.classification;
    }

    @NotNull
    public final Performance getPerformanceMode() {
        return this.performanceMode;
    }

    public ImageAnalysisConfiguration(@NotNull Performance performanceMode, @NotNull Classifications classification) {
        Intrinsics.checkNotNullParameter(performanceMode, "performanceMode");
        Intrinsics.checkNotNullParameter(classification, "classification");
        this.performanceMode = performanceMode;
        this.classification = classification;
    }

    public /* synthetic */ ImageAnalysisConfiguration(Performance performance, Classifications classifications, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Performance.FAST : performance, (i10 & 2) != 0 ? Classifications.NONE : classifications);
    }
}
