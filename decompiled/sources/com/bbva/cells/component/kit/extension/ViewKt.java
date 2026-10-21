package com.bbva.cells.component.kit.extension;

import android.view.View;
import com.bbva.cells.component.kit.featureflag.FlagState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"applyFlag", "", "Landroid/view/View;", "state", "Lcom/bbva/cells/component/kit/featureflag/FlagState;", "component-kit_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ViewKt {

    /* JADX INFO: compiled from: View.kt */
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

    public static final void applyFlag(@NotNull View view, @NotNull FlagState state) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i10 == 1) {
            view.setEnabled(true);
            view.setVisibility(0);
        } else if (i10 == 2) {
            view.setEnabled(false);
            view.setVisibility(0);
        } else {
            if (i10 != 3) {
                return;
            }
            view.setVisibility(8);
        }
    }
}
