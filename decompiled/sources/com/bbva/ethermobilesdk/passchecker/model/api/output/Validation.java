package com.bbva.ethermobilesdk.passchecker.model.api.output;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Validation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/Validation;", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", ValidatePasswordQualityUseCase.KEY_PASSWORD_QUALITY, "", "distance", ValidatePasswordQualityUseCase.KEY_PASSWORD_COMPROMISED, "errors", "", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "qualityResult", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/QualityResult;", "(ZIIILjava/util/List;Lcom/bbva/ethermobilesdk/passchecker/model/api/output/QualityResult;)V", "getCompromised", "()I", "getDistance", "getErrors", "()Ljava/util/List;", "()Z", "getQuality", "getQualityResult", "()Lcom/bbva/ethermobilesdk/passchecker/model/api/output/QualityResult;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Validation {
    private final int compromised;
    private final int distance;

    @Nullable
    private final List<PassCheckerError> errors;
    private final boolean isValid;
    private final int quality;

    @NotNull
    private final QualityResult qualityResult;

    /* JADX WARN: Multi-variable type inference failed */
    public Validation(boolean z10, int i10, int i11, int i12, @Nullable List<? extends PassCheckerError> list, @NotNull QualityResult qualityResult) {
        Intrinsics.checkNotNullParameter(qualityResult, "qualityResult");
        this.isValid = z10;
        this.quality = i10;
        this.distance = i11;
        this.compromised = i12;
        this.errors = list;
        this.qualityResult = qualityResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Validation copy$default(Validation validation, boolean z10, int i10, int i11, int i12, List list, QualityResult qualityResult, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = validation.isValid;
        }
        if ((i13 & 2) != 0) {
            i10 = validation.quality;
        }
        int i14 = i10;
        if ((i13 & 4) != 0) {
            i11 = validation.distance;
        }
        int i15 = i11;
        if ((i13 & 8) != 0) {
            i12 = validation.compromised;
        }
        int i16 = i12;
        if ((i13 & 16) != 0) {
            list = validation.errors;
        }
        List list2 = list;
        if ((i13 & 32) != 0) {
            qualityResult = validation.qualityResult;
        }
        return validation.copy(z10, i14, i15, i16, list2, qualityResult);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCompromised() {
        return this.compromised;
    }

    @Nullable
    public final List<PassCheckerError> component5() {
        return this.errors;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final QualityResult getQualityResult() {
        return this.qualityResult;
    }

    @NotNull
    public final Validation copy(boolean isValid, int quality, int distance, int compromised, @Nullable List<? extends PassCheckerError> errors, @NotNull QualityResult qualityResult) {
        Intrinsics.checkNotNullParameter(qualityResult, "qualityResult");
        return new Validation(isValid, quality, distance, compromised, errors, qualityResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Validation)) {
            return false;
        }
        Validation validation = (Validation) other;
        return this.isValid == validation.isValid && this.quality == validation.quality && this.distance == validation.distance && this.compromised == validation.compromised && Intrinsics.areEqual(this.errors, validation.errors) && Intrinsics.areEqual(this.qualityResult, validation.qualityResult);
    }

    public final int getCompromised() {
        return this.compromised;
    }

    public final int getDistance() {
        return this.distance;
    }

    @Nullable
    public final List<PassCheckerError> getErrors() {
        return this.errors;
    }

    public final int getQuality() {
        return this.quality;
    }

    @NotNull
    public final QualityResult getQualityResult() {
        return this.qualityResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    public int hashCode() {
        boolean z10 = this.isValid;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = ((((((r1 * 31) + this.quality) * 31) + this.distance) * 31) + this.compromised) * 31;
        List<PassCheckerError> list = this.errors;
        return this.qualityResult.hashCode() + ((i10 + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final boolean isValid() {
        return this.isValid;
    }

    @NotNull
    public String toString() {
        return "Validation(isValid=" + this.isValid + ", quality=" + this.quality + ", distance=" + this.distance + ", compromised=" + this.compromised + ", errors=" + this.errors + ", qualityResult=" + this.qualityResult + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ Validation(boolean z10, int i10, int i11, int i12, List list, QualityResult qualityResult, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, i11, i12, (i13 & 16) != 0 ? null : list, qualityResult);
    }
}
