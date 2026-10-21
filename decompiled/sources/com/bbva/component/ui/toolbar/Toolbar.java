package com.bbva.component.ui.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.cellscore.app.CellsViewModelProviders;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Toolbar.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/ui/toolbar/Toolbar;", "Landroidx/appcompat/widget/Toolbar;", "Landroid/view/MenuItem;", AnalyticsConstants.Key.ITEM, "", "onOptionsItemSelected", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cmp-ui-toolbar_release"}, k = 1, mv = {1, 9, 0})
public final class Toolbar extends androidx.appcompat.widget.Toolbar {

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @NotNull
    public final ToolbarViewModel f28769o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Toolbar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), ToolbarViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "of(...)");
        this.f28769o1 = (ToolbarViewModel) viewModelOf;
    }

    public final boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        int i10 = R.id.action_menu;
        ToolbarViewModel toolbarViewModel = this.f28769o1;
        if (itemId == i10) {
            toolbarViewModel.onActionMenuClick$cmp_ui_toolbar_release();
            return true;
        }
        if (itemId != 16908332) {
            return false;
        }
        toolbarViewModel.onActionBackClick$cmp_ui_toolbar_release();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Toolbar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), ToolbarViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "of(...)");
        this.f28769o1 = (ToolbarViewModel) viewModelOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Toolbar(@NotNull Context context, @NotNull AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), ToolbarViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "of(...)");
        this.f28769o1 = (ToolbarViewModel) viewModelOf;
    }

    private static /* synthetic */ void getViewModel$annotations() {
    }
}
