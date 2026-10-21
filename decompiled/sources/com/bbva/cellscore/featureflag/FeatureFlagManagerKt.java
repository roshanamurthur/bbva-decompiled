package com.bbva.cellscore.featureflag;

import com.bbva.cells.component.kit.featureflag.FlagState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FeatureFlagManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/bbva/cellscore/featureflag/FeatureFlagManager;", "featureFlagManager", "", "applyFeatureFlags", "cells-core_release"}, k = 2, mv = {1, 5, 1})
public final class FeatureFlagManagerKt {

    /* JADX INFO: compiled from: FeatureFlagManager.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlagState.values().length];
            iArr[FlagState.Enable.ordinal()] = 1;
            iArr[FlagState.Disable.ordinal()] = 2;
            iArr[FlagState.Hide.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.bbva.cells.componentkit.FlagState access$toNewFlagStage(FlagState flagState) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[flagState.ordinal()];
        if (i10 == 1) {
            return com.bbva.cells.componentkit.FlagState.Enable;
        }
        if (i10 == 2) {
            return com.bbva.cells.componentkit.FlagState.Disable;
        }
        if (i10 == 3) {
            return com.bbva.cells.componentkit.FlagState.Hide;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void applyFeatureFlags(@NotNull FeatureFlagManager featureFlagManager) {
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        featureFlagManager.sendFlags$cells_core_release();
    }
}
