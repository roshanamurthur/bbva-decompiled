package com.bbva.component.ui.toolbar;

import android.app.Application;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ToolbarViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/ui/toolbar/ToolbarViewModel;", "Lcom/bbva/cells/component/kit/ui/viewmodel/ViewModel;", Constants.APPLICATION, "Landroid/app/Application;", "(Landroid/app/Application;)V", "onActionBackClick", "", "onActionBackClick$cmp_ui_toolbar_release", "onActionMenuClick", "onActionMenuClick$cmp_ui_toolbar_release", "Companion", "cmp-ui-toolbar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ToolbarViewModel extends ViewModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Unit> f28770r0 = new ActionSpec<>("menu-button-click");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Unit> f28771s0 = new ActionSpec<>("back-button-click");

    /* JADX INFO: compiled from: ToolbarViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/bbva/component/ui/toolbar/ToolbarViewModel$Companion;", "", "()V", "ACTION_BACK_BUTTON_CLICK", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "", "getACTION_BACK_BUTTON_CLICK", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_MENU_BUTTON_CLICK", "getACTION_MENU_BUTTON_CLICK", "cmp-ui-toolbar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Unit> getACTION_BACK_BUTTON_CLICK() {
            return ToolbarViewModel.f28771s0;
        }

        @NotNull
        public final ActionSpec<Unit> getACTION_MENU_BUTTON_CLICK() {
            return ToolbarViewModel.f28770r0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    public final void onActionBackClick$cmp_ui_toolbar_release() {
        fire(f28771s0);
    }

    public final void onActionMenuClick$cmp_ui_toolbar_release() {
        fire(f28770r0);
    }
}
