package com.bbva.glomohybrid.landing.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingHeaderFeatureFlagsModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderFeatureFlagsModel;", "", "", "component1", "digitalActivation", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "getDigitalActivation", "()Z", "<init>", "(Z)V", "()V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingHeaderFeatureFlagsModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean digitalActivation;

    public LandingHeaderFeatureFlagsModel(boolean z10) {
        this.digitalActivation = z10;
    }

    public static /* synthetic */ LandingHeaderFeatureFlagsModel copy$default(LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = landingHeaderFeatureFlagsModel.digitalActivation;
        }
        return landingHeaderFeatureFlagsModel.copy(z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDigitalActivation() {
        return this.digitalActivation;
    }

    @NotNull
    public final LandingHeaderFeatureFlagsModel copy(boolean digitalActivation) {
        return new LandingHeaderFeatureFlagsModel(digitalActivation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LandingHeaderFeatureFlagsModel) && this.digitalActivation == ((LandingHeaderFeatureFlagsModel) other).digitalActivation;
    }

    public final boolean getDigitalActivation() {
        return this.digitalActivation;
    }

    public int hashCode() {
        boolean z10 = this.digitalActivation;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    @NotNull
    public String toString() {
        return "LandingHeaderFeatureFlagsModel(digitalActivation=" + this.digitalActivation + ")";
    }

    public LandingHeaderFeatureFlagsModel() {
        this(true);
    }
}
