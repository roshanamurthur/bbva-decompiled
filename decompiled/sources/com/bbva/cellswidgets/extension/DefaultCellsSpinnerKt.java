package com.bbva.cellswidgets.extension;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bbva.cells.component.kit.ui.helper.UnitHelper;
import com.bbva.cellswidgets.CellsSpinner;
import com.bbva.cellswidgets.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultCellsSpinner.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a(\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¨\u0006\b"}, d2 = {"Lcom/bbva/cellswidgets/CellsSpinner;", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", "applyDefaultAttributes", "cells-widgets_release"}, k = 2, mv = {1, 9, 0})
public final class DefaultCellsSpinnerKt {
    public static final void applyDefaultAttributes(@NotNull CellsSpinner cellsSpinner, @Nullable AttributeSet attributeSet, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cellsSpinner, "<this>");
        TypedArray typedArrayObtainStyledAttributes = cellsSpinner.getContext().obtainStyledAttributes(attributeSet, R.styleable.CellsSpinner, i10, i11);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        View viewFindViewById = cellsSpinner.findViewById(R.id.constraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        Resources resources = cellsSpinner.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.CellsSpinner_cellsSpinner_height, UnitHelper.dpToPixels(resources, 60.0f));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CellsSpinner_cellsSpinner_background, 0);
        viewFindViewById.getLayoutParams().height = (int) dimension;
        viewFindViewById.setBackgroundResource(resourceId);
        View viewFindViewById2 = cellsSpinner.findViewById(R.id.titleTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        Resources resources2 = cellsSpinner.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        float fDpToPixels = UnitHelper.dpToPixels(resources2, 8.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.CellsSpinner_cellsSpinner_verticalPadding, fDpToPixels);
        int i12 = R.styleable.CellsSpinner_cellsSpinner_horizontalPadding;
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(i12, fDpToPixels);
        ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i13 = (int) dimension2;
        marginLayoutParams.bottomMargin = i13;
        marginLayoutParams.setMarginStart((int) dimension3);
        marginLayoutParams.topMargin = i13;
        View viewFindViewById3 = cellsSpinner.findViewById(R.id.selectedOption);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        Resources resources3 = cellsSpinner.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(i12, UnitHelper.dpToPixels(resources3, 8.0f));
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById3.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart((int) dimension4);
        View viewFindViewById4 = cellsSpinner.findViewById(R.id.chevron);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        Resources resources4 = cellsSpinner.getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(i12, UnitHelper.dpToPixels(resources4, 24.0f));
        viewFindViewById4.setBackgroundResource(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CellsSpinner_cellsSpinner_rightActionIcon, android.R.drawable.arrow_down_float));
        viewFindViewById4.getLayoutParams().width = (int) dimension5;
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void applyDefaultAttributes$default(CellsSpinner cellsSpinner, AttributeSet attributeSet, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        applyDefaultAttributes(cellsSpinner, attributeSet, i10, i11);
    }
}
