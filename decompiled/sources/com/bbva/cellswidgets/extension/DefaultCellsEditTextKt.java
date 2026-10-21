package com.bbva.cellswidgets.extension;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.bbva.cells.component.kit.ui.helper.UnitHelper;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.cellswidgets.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultCellsEditText.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\b2\u0006\u0010\n\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\u0006*\u00020\b¨\u0006\r"}, d2 = {"Lcom/bbva/cellswidgets/CellsEditText;", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", "applyDefaultAttributes", "Landroid/widget/EditText;", "Landroid/content/res/TypedArray;", "typedArray", "configCopyPaste", "disableCopyPaste", "cells-widgets_release"}, k = 2, mv = {1, 9, 0})
public final class DefaultCellsEditTextKt {
    public static final void applyDefaultAttributes(@NotNull CellsEditText cellsEditText, @Nullable AttributeSet attributeSet, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cellsEditText, "<this>");
        TypedArray typedArrayObtainStyledAttributes = cellsEditText.getContext().obtainStyledAttributes(attributeSet, R.styleable.CellsEditText, i10, i11);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        View viewFindViewById = cellsEditText.findViewById(R.id.constraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        Resources resources = cellsEditText.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.CellsEditText_cellsEditText_height, UnitHelper.dpToPixels(resources, 60.0f));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CellsEditText_cellsEditText_background, 0);
        viewFindViewById.getLayoutParams().height = (int) dimension;
        viewFindViewById.setBackgroundResource(resourceId);
        View viewFindViewById2 = cellsEditText.findViewById(R.id.hintTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        Resources resources2 = cellsEditText.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        float fDpToPixels = UnitHelper.dpToPixels(resources2, 8.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.CellsEditText_cellsEditText_verticalPadding, fDpToPixels);
        int i12 = R.styleable.CellsEditText_cellsEditText_horizontalPadding;
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(i12, fDpToPixels);
        ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i13 = (int) dimension2;
        marginLayoutParams.bottomMargin = i13;
        marginLayoutParams.setMarginStart((int) dimension3);
        marginLayoutParams.topMargin = i13;
        View viewFindViewById3 = cellsEditText.findViewById(R.id.editText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        Resources resources3 = cellsEditText.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(i12, UnitHelper.dpToPixels(resources3, 8.0f));
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById3.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart((int) dimension4);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        configCopyPaste((EditText) viewFindViewById3, typedArrayObtainStyledAttributes);
        View viewFindViewById4 = cellsEditText.findViewById(R.id.actionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        Resources resources4 = cellsEditText.getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(i12, UnitHelper.dpToPixels(resources4, 120.0f));
        viewFindViewById4.setBackgroundResource(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CellsEditText_cellsEditText_rightActionIcon, 0));
        viewFindViewById4.getLayoutParams().width = (int) dimension5;
        View viewFindViewById5 = cellsEditText.findViewById(R.id.errorImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById5;
        Resources resources5 = cellsEditText.getResources();
        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
        float dimension6 = typedArrayObtainStyledAttributes.getDimension(R.styleable.CellsEditText_cellsEditText_errorIconSize, UnitHelper.dpToPixels(resources5, 16.0f));
        imageView.setImageResource(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CellsEditText_cellsEditText_errorIcon, 0));
        int i14 = (int) dimension6;
        imageView.getLayoutParams().width = i14;
        imageView.getLayoutParams().width = i14;
        View viewFindViewById6 = cellsEditText.findViewById(R.id.leftActionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        Resources resources6 = cellsEditText.getResources();
        Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
        float dimension7 = typedArrayObtainStyledAttributes.getDimension(i12, UnitHelper.dpToPixels(resources6, 120.0f));
        viewFindViewById6.setBackgroundResource(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CellsEditText_cellsEditText_leftActionIcon, 0));
        viewFindViewById6.getLayoutParams().width = (int) dimension7;
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void applyDefaultAttributes$default(CellsEditText cellsEditText, AttributeSet attributeSet, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        applyDefaultAttributes(cellsEditText, attributeSet, i10, i11);
    }

    public static final void configCopyPaste(@NotNull EditText editText, @NotNull TypedArray typedArray) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        if (typedArray.getBoolean(R.styleable.CellsEditText_cellsEditText_allowCopyPaste, true)) {
            return;
        }
        disableCopyPaste(editText);
    }

    public static final void disableCopyPaste(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setLongClickable(false);
        editText.setTextIsSelectable(false);
        editText.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: com.bbva.cellswidgets.extension.DefaultCellsEditTextKt.disableCopyPaste.1
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(@Nullable ActionMode mode, @NotNull MenuItem item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(@Nullable ActionMode mode, @NotNull Menu menu) {
                Intrinsics.checkNotNullParameter(menu, "menu");
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(@Nullable ActionMode mode, @NotNull Menu menu) {
                Intrinsics.checkNotNullParameter(menu, "menu");
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(@Nullable ActionMode mode) {
            }
        });
        editText.setCustomInsertionActionModeCallback(new ActionMode.Callback() { // from class: com.bbva.cellswidgets.extension.DefaultCellsEditTextKt.disableCopyPaste.2
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(@Nullable ActionMode mode, @NotNull MenuItem item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(@Nullable ActionMode mode, @NotNull Menu menu) {
                Intrinsics.checkNotNullParameter(menu, "menu");
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(@Nullable ActionMode mode, @NotNull Menu menu) {
                Intrinsics.checkNotNullParameter(menu, "menu");
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(@Nullable ActionMode mode) {
            }
        });
    }
}
