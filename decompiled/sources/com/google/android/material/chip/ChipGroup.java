package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class ChipGroup extends FlowLayout {
    public static final int E0 = R.style.Widget_MaterialComponents_ChipGroup;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Dimension
    public int f44284t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Dimension
    public int f44285u0;

    @Nullable
    public OnCheckedStateChangeListener v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final CheckableGroup<Chip> f44286w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f44287x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NonNull
    public final c f44288y0;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Deprecated
    public interface OnCheckedChangeListener {
        void onCheckedChanged(@NonNull ChipGroup chipGroup, @IdRes int i10);
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list);
    }

    public class a implements CheckableGroup.OnCheckedStateChangeListener {
        public a() {
        }

        @Override // com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener
        public final void onCheckedStateChanged(Set<Integer> set) {
            ChipGroup chipGroup = ChipGroup.this;
            OnCheckedStateChangeListener onCheckedStateChangeListener = chipGroup.v0;
            if (onCheckedStateChangeListener != null) {
                onCheckedStateChangeListener.onCheckedChanged(chipGroup, chipGroup.f44286w0.getCheckedIdsSortedByChildOrder(chipGroup));
            }
        }
    }

    public class b implements OnCheckedStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnCheckedChangeListener f44290a;

        public b(OnCheckedChangeListener onCheckedChangeListener) {
            this.f44290a = onCheckedChangeListener;
        }

        @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
        public final void onCheckedChanged(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list) {
            ChipGroup chipGroup2 = ChipGroup.this;
            if (chipGroup2.f44286w0.isSingleSelection()) {
                this.f44290a.onCheckedChanged(chipGroup, chipGroup2.getCheckedChipId());
            }
        }
    }

    public class c implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f44292p0;

        public c() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(ViewCompat.generateViewId());
                }
                chipGroup.f44286w0.addCheckable((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f44292p0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f44286w0.removeCheckable((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f44292p0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && getChildAt(i11).getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    public void check(@IdRes int i10) {
        this.f44286w0.check(i10);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void clearCheck() {
        this.f44286w0.clearCheck();
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.f44286w0.getSingleCheckedId();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f44286w0.getCheckedIdsSortedByChildOrder(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.f44284t0;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f44285u0;
    }

    public boolean isSelectionRequired() {
        return this.f44286w0.isSelectionRequired();
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public boolean isSingleSelection() {
        return this.f44286w0.isSingleSelection();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f44287x0;
        if (i10 != -1) {
            this.f44286w0.check(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCount(), isSingleLine() ? getVisibleChipCount() : -1, false, isSingleSelection() ? 1 : 2));
    }

    public void setChipSpacing(@Dimension int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(@Dimension int i10) {
        if (this.f44284t0 != i10) {
            this.f44284t0 = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(@DimenRes int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(@Dimension int i10) {
        if (this.f44285u0 != i10) {
            this.f44285u0 = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(onCheckedChangeListener));
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.v0 = onCheckedStateChangeListener;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f44288y0.f44292p0 = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f44286w0.setSelectionRequired(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        this.f44286w0.setSingleSelection(z10);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(@BoolRes int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(@BoolRes int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = E0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        CheckableGroup<Chip> checkableGroup = new CheckableGroup<>();
        this.f44286w0 = checkableGroup;
        c cVar = new c();
        this.f44288y0 = cVar;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, R.styleable.ChipGroup, i10, i11, new int[0]);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ChipGroup_selectionRequired, false));
        this.f44287x0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ChipGroup_checkedChip, -1);
        typedArrayObtainStyledAttributes.recycle();
        checkableGroup.setOnCheckedStateChangeListener(new a());
        super.setOnHierarchyChangeListener(cVar);
        ViewCompat.setImportantForAccessibility(this, 1);
    }
}
