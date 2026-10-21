package com.bbva.glomohybrid.ui.options.view.render;

import android.view.View;
import com.bbva.cellswidgets.CellsCircleInitialsView;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.glomohybrid.ui.R;
import com.bbva.glomohybrid.ui.options.model.Asset;
import com.bbva.glomohybrid.ui.options.model.State;
import com.bbva.glomohybrid.ui.options.model.TwoLinesOption;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryTwoLinesRenderer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/view/render/CountryTwoLinesRenderer;", "Lcom/bbva/glomohybrid/ui/options/view/render/AbstractClickableRenderer;", "Lcom/bbva/glomohybrid/ui/options/model/TwoLinesOption;", "", "viewType", "getLayoutId", "Landroid/view/View;", "container", AnalyticsConstants.Key.ITEM, "position", "", "internalRender", "<init>", "()V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryTwoLinesRenderer extends AbstractClickableRenderer<TwoLinesOption> {
    @Override // com.bbva.glomohybrid.ui.options.view.render.Renderer
    public int getLayoutId(int viewType) {
        return viewType == State.SELECTED.ordinal() ? R.layout.item_dialog_list_option_default_two_lines_current_selected : R.layout.item_dialog_list_option_default_two_lines_unselected;
    }

    @Override // com.bbva.glomohybrid.ui.options.view.render.AbstractClickableRenderer
    public void internalRender(@NotNull View container, @NotNull TwoLinesOption item, int position) {
        Unit unit;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
        ((CellsTextView) container.findViewById(R.id.title)).setText(item.getTitle());
        ((CellsTextView) container.findViewById(R.id.subtitle)).setText(item.getSubtitle());
        CellsImageView cellsImageView = (CellsImageView) container.findViewById(R.id.iconImage);
        CellsCircleInitialsView cellsCircleInitialsView = (CellsCircleInitialsView) container.findViewById(R.id.iconInitialsImage);
        Asset iconAsset = item.getIconAsset();
        if (iconAsset != null) {
            if (iconAsset instanceof Asset.Icon) {
                cellsImageView.setImageResource(((Asset.Icon) iconAsset).getIconResId());
                cellsImageView.setVisibility(0);
                cellsCircleInitialsView.setVisibility(8);
            } else if (iconAsset instanceof Asset.InitialsIcon) {
                cellsCircleInitialsView.setInitials(((Asset.InitialsIcon) iconAsset).getInitials());
                cellsImageView.setVisibility(8);
                cellsCircleInitialsView.setVisibility(0);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            cellsImageView.setVisibility(8);
            cellsCircleInitialsView.setVisibility(0);
            cellsCircleInitialsView.setInitials(String.valueOf(StringsKt___StringsKt.first(item.getTitle())));
        }
    }
}
