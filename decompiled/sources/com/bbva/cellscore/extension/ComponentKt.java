package com.bbva.cellscore.extension;

import com.bbva.cells.component.kit.common.Component;
import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.cellscore.web.data.component.ComponentDefinition;
import com.bbva.cellscore.web.data.component.FeatureFlag;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Component.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"applyFeatureFlag", "", "Lcom/bbva/cells/component/kit/common/Component;", "featureFlagManager", "Lcom/bbva/cellscore/featureflag/FeatureFlagManager;", "componentDefinition", "Lcom/bbva/cellscore/web/data/component/ComponentDefinition;", "cells-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ComponentKt {
    public static final void applyFeatureFlag(@NotNull Component component, @NotNull FeatureFlagManager featureFlagManager, @NotNull ComponentDefinition componentDefinition) {
        Intrinsics.checkNotNullParameter(component, "<this>");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(componentDefinition, "componentDefinition");
        ArrayList<FeatureFlag> arrayListFlags = componentDefinition.flags();
        Intrinsics.checkNotNullExpressionValue(arrayListFlags, "componentDefinition.flags()");
        for (FeatureFlag flag : arrayListFlags) {
            String id = flag.getId();
            Intrinsics.checkNotNullExpressionValue(flag, "flag");
            component.setFeatureFlag(id, featureFlagManager.computeFlag$cells_core_release(flag));
        }
    }
}
