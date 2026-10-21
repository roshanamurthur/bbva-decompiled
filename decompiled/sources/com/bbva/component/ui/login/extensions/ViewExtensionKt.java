package com.bbva.component.ui.login.extensions;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bbva.cells.componentkit.dsl.ViewKt;
import com.bbva.cells.componentkit.model.dsl.SettingsKt;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.cells.componentkit.model.dsl.Visibility;
import com.bbva.plugin.showinfo.command.HideCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewExtension.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0005¨\u0006\u0007"}, d2 = {"alignmentTop", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "centerVertically", HideCommand.ID, "Landroid/view/View;", "show", "component-ui-login_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewExtensionKt {

    /* JADX INFO: compiled from: ViewExtension.kt */
    public static final class a extends Lambda implements Function1<ViewSettings, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28503p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ViewSettings viewSettings) {
            ViewSettings viewSettings2 = viewSettings;
            Intrinsics.checkNotNullParameter(viewSettings2, "$this$viewSettings");
            viewSettings2.setVisibility(Visibility.Gone);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ViewExtension.kt */
    public static final class b extends Lambda implements Function1<ViewSettings, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f28504p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ViewSettings viewSettings) {
            ViewSettings viewSettings2 = viewSettings;
            Intrinsics.checkNotNullParameter(viewSettings2, "$this$viewSettings");
            viewSettings2.setVisibility(Visibility.Visible);
            return Unit.INSTANCE;
        }
    }

    public static final void alignmentTop(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        LinearLayoutCompat.LayoutParams layoutParams2 = layoutParams instanceof LinearLayoutCompat.LayoutParams ? (LinearLayoutCompat.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 48;
        }
        constraintLayout.requestLayout();
    }

    public static final void centerVertically(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        LinearLayoutCompat.LayoutParams layoutParams2 = layoutParams instanceof LinearLayoutCompat.LayoutParams ? (LinearLayoutCompat.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        constraintLayout.requestLayout();
    }

    public static final void hide(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewKt.settings(view, SettingsKt.viewSettings(a.f28503p0));
    }

    public static final void show(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewKt.settings(view, SettingsKt.viewSettings(b.f28504p0));
    }
}
