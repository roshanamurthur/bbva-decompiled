package com.bbva.component.ui.login.extensions;

import android.view.View;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CellsTextViewAccessibility.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"setImportantForAccessibilityForVisibility", "", "Landroid/view/View;", "component-ui-login_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCellsTextViewAccessibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsTextViewAccessibility.kt\ncom/bbva/component/ui/login/extensions/CellsTextViewAccessibilityKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,13:1\n254#2:14\n*S KotlinDebug\n*F\n+ 1 CellsTextViewAccessibility.kt\ncom/bbva/component/ui/login/extensions/CellsTextViewAccessibilityKt\n*L\n8#1:14\n*E\n"})
public final class CellsTextViewAccessibilityKt {
    public static final void setImportantForAccessibilityForVisibility(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i10 = 1;
        boolean z10 = view.getVisibility() == 0;
        if (!z10) {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 2;
        }
        view.setImportantForAccessibility(i10);
    }
}
