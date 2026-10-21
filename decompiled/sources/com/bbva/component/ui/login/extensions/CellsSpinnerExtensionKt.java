package com.bbva.component.ui.login.extensions;

import com.bbva.cells.componentkit.dsl.ViewKt;
import com.bbva.cells.componentkit.model.dsl.SettingsKt;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.cells.componentkit.model.dsl.Visibility;
import com.bbva.cellswidgets.CellsSpinner;
import com.bbva.plugin.showinfo.command.HideCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CellsSpinnerExtension.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {HideCommand.ID, "", "Lcom/bbva/cellswidgets/CellsSpinner;", "component-ui-login_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CellsSpinnerExtensionKt {

    /* JADX INFO: compiled from: CellsSpinnerExtension.kt */
    public static final class a extends Lambda implements Function1<ViewSettings, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28502p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ViewSettings viewSettings) {
            ViewSettings viewSettings2 = viewSettings;
            Intrinsics.checkNotNullParameter(viewSettings2, "$this$viewSettings");
            viewSettings2.setVisibility(Visibility.Gone);
            return Unit.INSTANCE;
        }
    }

    public static final void hide(@NotNull CellsSpinner cellsSpinner) {
        Intrinsics.checkNotNullParameter(cellsSpinner, "<this>");
        ViewKt.settings(cellsSpinner, SettingsKt.viewSettings(a.f28502p0));
    }
}
