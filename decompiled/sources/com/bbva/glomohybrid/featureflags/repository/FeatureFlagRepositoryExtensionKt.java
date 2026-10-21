package com.bbva.glomohybrid.featureflags.repository;

import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.domain.model.StorePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FeatureFlagRepositoryExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003¨\u0006\t"}, d2 = {"isFidoFlagEnabled", "", "Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "(Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;)Z", "isLowCostDisabled", "isRefactorN2Enabled", "isStandInEnabled", "isSustainabilitySectionEnabled", "isTopUpEnabled", "gl-feature-flags_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FeatureFlagRepositoryExtensionKt {
    public static final boolean isFidoFlagEnabled(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "<this>");
        FeatureFlags featureFlags = featureFlagsRepository.get(StorePolicy.Local);
        if (featureFlags != null) {
            return featureFlags.isFidoEnabled();
        }
        return false;
    }

    public static final boolean isLowCostDisabled(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "<this>");
        FeatureFlags featureFlags = featureFlagsRepository.get(StorePolicy.Local);
        if (featureFlags != null) {
            return featureFlags.getLowCostFlag();
        }
        return false;
    }

    public static final boolean isRefactorN2Enabled(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "<this>");
        FeatureFlags featureFlags = featureFlagsRepository.get(StorePolicy.Local);
        if (featureFlags != null) {
            return featureFlags.getClientN2RefactorFlag();
        }
        return false;
    }

    public static final boolean isStandInEnabled(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "<this>");
        FeatureFlags featureFlags = featureFlagsRepository.get(StorePolicy.Local);
        if (featureFlags != null) {
            return featureFlags.getStandIn();
        }
        return false;
    }

    public static final boolean isSustainabilitySectionEnabled(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "<this>");
        FeatureFlags featureFlags = featureFlagsRepository.get(StorePolicy.Local);
        if (featureFlags != null) {
            return featureFlags.isSustainabilitySectionEnabled();
        }
        return false;
    }

    public static final boolean isTopUpEnabled(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "<this>");
        FeatureFlags featureFlags = featureFlagsRepository.get(StorePolicy.Local);
        if (featureFlags != null) {
            return featureFlags.isTopUpEnabled();
        }
        return false;
    }
}
