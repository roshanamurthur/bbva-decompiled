package com.bbva.glomohybrid.landing.domain.sections.filters;

import com.bbva.cells.component.kit.featureflag.FlagState;
import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.glomohybrid.featureflags.domain.flags.LandingNativeFlags;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingEcommerceSectionFeatureFlagFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingEcommerceSectionFeatureFlagFilter;", "", "", "isEnabled", "Lcom/bbva/cellscore/featureflag/FeatureFlagManager;", "featureFlagsManager", "<init>", "(Lcom/bbva/cellscore/featureflag/FeatureFlagManager;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingEcommerceSectionFeatureFlagFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FeatureFlagManager f32741a;

    public LandingEcommerceSectionFeatureFlagFilter(@NotNull FeatureFlagManager featureFlagsManager) {
        Intrinsics.checkNotNullParameter(featureFlagsManager, "featureFlagsManager");
        this.f32741a = featureFlagsManager;
    }

    public final boolean isEnabled() {
        FlagState flag = this.f32741a.getFlag(LandingNativeFlags.SECTION_ECOMMERCE.getValue());
        if (flag == null) {
            flag = FlagState.Enable;
        }
        return flag == FlagState.Enable;
    }
}
