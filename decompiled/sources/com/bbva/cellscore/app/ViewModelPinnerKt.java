package com.bbva.cellscore.app;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewModelPinner.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0005"}, d2 = {"pinUpViewModels", "Landroid/view/View;", "Landroidx/fragment/app/Fragment;", "block", "Lkotlin/Function0;", "cells-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ViewModelPinnerKt {
    @NotNull
    public static final View pinUpViewModels(@NotNull Fragment fragment, @NotNull Function0<? extends View> block) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        CellsViewModelProviders.f26903a = fragment;
        View viewInvoke = block.invoke();
        if (fragment == CellsViewModelProviders.f26903a) {
            CellsViewModelProviders.f26903a = null;
        }
        return viewInvoke;
    }
}
