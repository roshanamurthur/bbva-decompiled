package com.bbva.ethermobilesdk.passchecker.model.internal;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.nulabinc.zxcvbn.Strength;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ValidationEvaluation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/internal/ValidationEvaluation;", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_COMPROMISED, "", "distance", ValidatePasswordQualityUseCase.KEY_PASSWORD_QUALITY, "zxcvbnStrength", "Lcom/nulabinc/zxcvbn/Strength;", "(IIILcom/nulabinc/zxcvbn/Strength;)V", "getCompromised", "()I", "getDistance", "getQuality", "getZxcvbnStrength", "()Lcom/nulabinc/zxcvbn/Strength;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ValidationEvaluation {
    private final int compromised;
    private final int distance;
    private final int quality;

    @NotNull
    private final Strength zxcvbnStrength;

    public ValidationEvaluation(int i10, int i11, int i12, @NotNull Strength zxcvbnStrength) {
        Intrinsics.checkNotNullParameter(zxcvbnStrength, "zxcvbnStrength");
        this.compromised = i10;
        this.distance = i11;
        this.quality = i12;
        this.zxcvbnStrength = zxcvbnStrength;
    }

    public static /* synthetic */ ValidationEvaluation copy$default(ValidationEvaluation validationEvaluation, int i10, int i11, int i12, Strength strength, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = validationEvaluation.compromised;
        }
        if ((i13 & 2) != 0) {
            i11 = validationEvaluation.distance;
        }
        if ((i13 & 4) != 0) {
            i12 = validationEvaluation.quality;
        }
        if ((i13 & 8) != 0) {
            strength = validationEvaluation.zxcvbnStrength;
        }
        return validationEvaluation.copy(i10, i11, i12, strength);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCompromised() {
        return this.compromised;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getQuality() {
        return this.quality;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Strength getZxcvbnStrength() {
        return this.zxcvbnStrength;
    }

    @NotNull
    public final ValidationEvaluation copy(int compromised, int distance, int quality, @NotNull Strength zxcvbnStrength) {
        Intrinsics.checkNotNullParameter(zxcvbnStrength, "zxcvbnStrength");
        return new ValidationEvaluation(compromised, distance, quality, zxcvbnStrength);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationEvaluation)) {
            return false;
        }
        ValidationEvaluation validationEvaluation = (ValidationEvaluation) other;
        return this.compromised == validationEvaluation.compromised && this.distance == validationEvaluation.distance && this.quality == validationEvaluation.quality && Intrinsics.areEqual(this.zxcvbnStrength, validationEvaluation.zxcvbnStrength);
    }

    public final int getCompromised() {
        return this.compromised;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getQuality() {
        return this.quality;
    }

    @NotNull
    public final Strength getZxcvbnStrength() {
        return this.zxcvbnStrength;
    }

    public int hashCode() {
        return this.zxcvbnStrength.hashCode() + (((((this.compromised * 31) + this.distance) * 31) + this.quality) * 31);
    }

    @NotNull
    public String toString() {
        return "ValidationEvaluation(compromised=" + this.compromised + ", distance=" + this.distance + ", quality=" + this.quality + ", zxcvbnStrength=" + this.zxcvbnStrength + RootService.CLOSE_BRACKET;
    }
}
