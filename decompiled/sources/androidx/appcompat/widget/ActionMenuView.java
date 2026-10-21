package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {
    public MenuBuilder J0;
    public Context K0;
    public int L0;
    public boolean M0;
    public ActionMenuPresenter N0;
    public MenuPresenter.Callback O0;
    public MenuBuilder.Callback P0;
    public boolean Q0;
    public int R0;
    public final int S0;
    public final int T0;
    public OnMenuItemClickListener U0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1086a;

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.isOverflowButton = false;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public class b implements MenuBuilder.Callback {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.U0;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.P0;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.N0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.h();
            ActionMenuPresenter.a aVar = actionMenuPresenter.J0;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.isOverflowButton = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.J0 == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.J0 = menuBuilder;
            menuBuilder.setCallback(new b());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.N0 = actionMenuPresenter;
            actionMenuPresenter.f1076w0 = true;
            actionMenuPresenter.f1077x0 = true;
            MenuPresenter.Callback aVar = this.O0;
            if (aVar == null) {
                aVar = new a();
            }
            actionMenuPresenter.setCallback(aVar);
            this.J0.addMenuPresenter(this.N0, this.K0);
            this.N0.k(this);
        }
        return this.J0;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.N0;
        ActionMenuPresenter.d dVar = actionMenuPresenter.f1074t0;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (actionMenuPresenter.v0) {
            return actionMenuPresenter.f1075u0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.L0;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean hasSupportDividerBeforeChildAt(int i10) {
        boolean zNeedsDividerAfter = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            zNeedsDividerAfter = ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        return (i10 <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? zNeedsDividerAfter : zNeedsDividerAfter | ((ActionMenuChildView) childAt2).needsDividerBefore();
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.N0;
        return actionMenuPresenter != null && actionMenuPresenter.h();
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(MenuBuilder menuBuilder) {
        this.J0 = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.J0.performItemAction(menuItemImpl, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.N0;
        return actionMenuPresenter != null && (actionMenuPresenter.K0 != null || actionMenuPresenter.i());
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.N0;
        return actionMenuPresenter != null && actionMenuPresenter.i();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
        return this.M0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.N0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.N0.i()) {
                this.N0.h();
                this.N0.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.Q0) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zIsLayoutRtl) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    hasSupportDividerBeforeChildAt(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zIsLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = c.a(measuredWidth4, ((LinearLayout.LayoutParams) layoutParams3).rightMargin, iMax, i27);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        ?? r4;
        int i15;
        MenuBuilder menuBuilder;
        boolean z12 = this.Q0;
        boolean z13 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.Q0 = z13;
        if (z12 != z13) {
            this.R0 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.Q0 && (menuBuilder = this.J0) != null && size != this.R0) {
            this.R0 = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.Q0 || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.S0;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z14 = false;
        int i24 = 0;
        long j10 = 0;
        while (true) {
            i12 = this.T0;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = i17;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i27 = i22 + 1;
                if (z15) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f1086a = false;
                layoutParams2.extraPixels = 0;
                layoutParams2.cellsUsed = 0;
                layoutParams2.expandable = false;
                ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams2).rightMargin = 0;
                layoutParams2.preventEdgeOffset = z15 && ((ActionMenuItemView) childAt).hasText();
                int i28 = layoutParams2.isOverflowButton ? 1 : i19;
                LayoutParams layoutParams3 = (LayoutParams) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z15 ? (ActionMenuItemView) childAt : null;
                boolean z16 = actionMenuItemView != null && actionMenuItemView.hasText();
                if (i28 <= 0 || (z16 && i28 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i28 * i21, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i21;
                    if (measuredWidth % i21 != 0) {
                        i15++;
                    }
                    if (z16 && i15 < 2) {
                        i15 = 2;
                    }
                }
                layoutParams3.expandable = !layoutParams3.isOverflowButton && z16;
                layoutParams3.cellsUsed = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i21, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (layoutParams2.expandable) {
                    i24++;
                }
                if (layoutParams2.isOverflowButton) {
                    z14 = true;
                }
                i19 -= i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j10 |= (long) (1 << i23);
                }
                i22 = i27;
            }
            i23++;
            size3 = i25;
            i17 = i26;
            paddingBottom = paddingBottom;
            mode = mode;
        }
        int i29 = mode;
        int i30 = i17;
        int i31 = size3;
        boolean z17 = z14 && i22 == 2;
        boolean z18 = false;
        while (true) {
            if (i24 <= 0 || i19 <= 0) {
                z10 = z18;
                break;
            }
            int i32 = Integer.MAX_VALUE;
            int i33 = 0;
            int i34 = 0;
            long j11 = 0;
            while (i34 < childCount2) {
                LayoutParams layoutParams4 = (LayoutParams) getChildAt(i34).getLayoutParams();
                boolean z19 = z18;
                if (layoutParams4.expandable) {
                    int i35 = layoutParams4.cellsUsed;
                    if (i35 < i32) {
                        j11 = 1 << i34;
                        i32 = i35;
                        i33 = 1;
                    } else if (i35 == i32) {
                        j11 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z18 = z19;
            }
            z10 = z18;
            j10 |= j11;
            if (i33 > i19) {
                break;
            }
            int i36 = i32 + 1;
            int i37 = 0;
            while (i37 < childCount2) {
                View childAt2 = getChildAt(i37);
                LayoutParams layoutParams5 = (LayoutParams) childAt2.getLayoutParams();
                int i38 = iMax;
                int i39 = childMeasureSpec;
                int i40 = childCount2;
                long j12 = 1 << i37;
                if ((j11 & j12) != 0) {
                    if (z17 && layoutParams5.preventEdgeOffset) {
                        r4 = 1;
                        r4 = 1;
                        if (i19 == 1) {
                            childAt2.setPadding(i12 + i21, 0, i12, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    layoutParams5.cellsUsed += r4;
                    layoutParams5.f1086a = r4;
                    i19--;
                } else if (layoutParams5.cellsUsed == i36) {
                    j10 |= j12;
                }
                i37++;
                childMeasureSpec = i39;
                iMax = i38;
                childCount2 = i40;
            }
            z18 = true;
        }
        int i41 = iMax;
        int i42 = childMeasureSpec;
        int i43 = childCount2;
        boolean z20 = !z14 && i22 == 1;
        if (i19 <= 0 || j10 == 0 || (i19 >= i22 - 1 && !z20 && iMax2 <= 1)) {
            i13 = i43;
            z11 = z10;
        } else {
            float fBitCount = Long.bitCount(j10);
            if (!z20) {
                if ((j10 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                    fBitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j10 & ((long) (1 << i44))) != 0 && !((LayoutParams) getChildAt(i44).getLayoutParams()).preventEdgeOffset) {
                    fBitCount -= 0.5f;
                }
            }
            int i45 = fBitCount > 0.0f ? (int) ((i19 * i21) / fBitCount) : 0;
            boolean z21 = z10;
            i13 = i43;
            for (int i46 = 0; i46 < i13; i46++) {
                if ((j10 & ((long) (1 << i46))) != 0) {
                    View childAt3 = getChildAt(i46);
                    LayoutParams layoutParams6 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams6.extraPixels = i45;
                        layoutParams6.f1086a = true;
                        if (i46 == 0 && !layoutParams6.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = (-i45) / 2;
                        }
                        z21 = true;
                    } else if (layoutParams6.isOverflowButton) {
                        layoutParams6.extraPixels = i45;
                        layoutParams6.f1086a = true;
                        ((LinearLayout.LayoutParams) layoutParams6).rightMargin = (-i45) / 2;
                        z21 = true;
                    } else {
                        if (i46 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = i45 / 2;
                        }
                        if (i46 != i13 - 1) {
                            ((LinearLayout.LayoutParams) layoutParams6).rightMargin = i45 / 2;
                        }
                    }
                }
            }
            z11 = z21;
        }
        if (z11) {
            int i47 = 0;
            while (i47 < i13) {
                View childAt4 = getChildAt(i47);
                LayoutParams layoutParams7 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams7.f1086a) {
                    i14 = i42;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams7.cellsUsed * i21) + layoutParams7.extraPixels, 1073741824), i14);
                } else {
                    i14 = i42;
                }
                i47++;
                i42 = i14;
            }
        }
        setMeasuredDimension(i30, i29 != 1073741824 ? i41 : i31);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MenuBuilder peekMenu() {
        return this.J0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z10) {
        this.N0.G0 = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.O0 = callback;
        this.P0 = callback2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.U0 = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.N0;
        ActionMenuPresenter.d dVar = actionMenuPresenter.f1074t0;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.v0 = true;
            actionMenuPresenter.f1075u0 = drawable;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z10) {
        this.M0 = z10;
    }

    public void setPopupTheme(@StyleRes int i10) {
        if (this.L0 != i10) {
            this.L0 = i10;
            if (i10 == 0) {
                this.K0 = getContext();
            } else {
                this.K0 = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.N0 = actionMenuPresenter;
        actionMenuPresenter.k(this);
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.N0;
        return actionMenuPresenter != null && actionMenuPresenter.l();
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.S0 = (int) (56.0f * f6);
        this.T0 = (int) (f6 * 4.0f);
        this.K0 = context;
        this.L0 = 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }

    public static class a implements MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z10) {
        }
    }
}
