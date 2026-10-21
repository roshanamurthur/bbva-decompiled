package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends AbsActionBarView {
    public final int E0;
    public final int F0;
    public boolean G0;
    public final int H0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CharSequence f1054r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CharSequence f1055s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public View f1056t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public View f1057u0;
    public View v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public LinearLayout f1058w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TextView f1059x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public TextView f1060y0;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ActionMode f1061p0;

        public a(ActionMode actionMode) {
            this.f1061p0 = actionMode;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f1061p0.finish();
        }
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void animateToVisibility(int i10) {
        super.animateToVisibility(i10);
    }

    public final void c() {
        if (this.f1058w0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1058w0 = linearLayout;
            this.f1059x0 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1060y0 = (TextView) this.f1058w0.findViewById(R.id.action_bar_subtitle);
            int i10 = this.E0;
            if (i10 != 0) {
                this.f1059x0.setTextAppearance(getContext(), i10);
            }
            int i11 = this.F0;
            if (i11 != 0) {
                this.f1060y0.setTextAppearance(getContext(), i11);
            }
        }
        this.f1059x0.setText(this.f1054r0);
        this.f1060y0.setText(this.f1055s0);
        boolean z10 = !TextUtils.isEmpty(this.f1054r0);
        boolean z11 = !TextUtils.isEmpty(this.f1055s0);
        this.f1060y0.setVisibility(z11 ? 0 : 8);
        this.f1058w0.setVisibility((z10 || z11) ? 0 : 8);
        if (this.f1058w0.getParent() == null) {
            addView(this.f1058w0);
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
        return super.canShowOverflowMenu();
    }

    public void closeMode() {
        if (this.f1056t0 == null) {
            killMode();
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1055s0;
    }

    public CharSequence getTitle() {
        return this.f1054r0;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.h();
        }
        return false;
    }

    public void initForMode(ActionMode actionMode) {
        View view = this.f1056t0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.H0, (ViewGroup) this, false);
            this.f1056t0 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f1056t0);
        }
        View viewFindViewById = this.f1056t0.findViewById(R.id.action_mode_close_button);
        this.f1057u0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(actionMode));
        MenuBuilder menuBuilder = (MenuBuilder) actionMode.getMenu();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.h();
            ActionMenuPresenter.a aVar = actionMenuPresenter.J0;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.mActionMenuPresenter = actionMenuPresenter2;
        actionMenuPresenter2.f1076w0 = true;
        actionMenuPresenter2.f1077x0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuBuilder.addMenuPresenter(this.mActionMenuPresenter, this.mPopupContext);
        ActionMenuView actionMenuView = (ActionMenuView) this.mActionMenuPresenter.getMenuView(this);
        this.mMenuView = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.mMenuView, layoutParams);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
        return super.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.i();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    public boolean isTitleOptional() {
        return this.G0;
    }

    public void killMode() {
        removeAllViews();
        this.v0 = null;
        this.mMenuView = null;
        this.mActionMenuPresenter = null;
        View view = this.f1057u0;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.h();
            ActionMenuPresenter.a aVar = this.mActionMenuPresenter.J0;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingRight = zIsLayoutRtl ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1056t0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1056t0.getLayoutParams();
            int i14 = zIsLayoutRtl ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zIsLayoutRtl ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int next = AbsActionBarView.next(paddingRight, i14, zIsLayoutRtl);
            paddingRight = AbsActionBarView.next(next + positionChild(this.f1056t0, next, paddingTop, paddingTop2, zIsLayoutRtl), i15, zIsLayoutRtl);
        }
        int iPositionChild = paddingRight;
        LinearLayout linearLayout = this.f1058w0;
        if (linearLayout != null && this.v0 == null && linearLayout.getVisibility() != 8) {
            iPositionChild += positionChild(this.f1058w0, iPositionChild, paddingTop, paddingTop2, zIsLayoutRtl);
        }
        int i16 = iPositionChild;
        View view2 = this.v0;
        if (view2 != null) {
            positionChild(view2, i16, paddingTop, paddingTop2, zIsLayoutRtl);
        }
        int paddingLeft = zIsLayoutRtl ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            positionChild(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zIsLayoutRtl);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.mContentHeight;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1056t0;
        if (view != null) {
            int iMeasureChildView = measureChildView(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1056t0.getLayoutParams();
            paddingLeft = iMeasureChildView - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = measureChildView(this.mMenuView, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f1058w0;
        if (linearLayout != null && this.v0 == null) {
            if (this.G0) {
                this.f1058w0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1058w0.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f1058w0.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = measureChildView(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.v0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.v0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.mContentHeight > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i10) {
        this.mContentHeight = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.v0;
        if (view2 != null) {
            removeView(view2);
        }
        this.v0 = view;
        if (view != null && (linearLayout = this.f1058w0) != null) {
            removeView(linearLayout);
            this.f1058w0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1055s0 = charSequence;
        c();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1054r0 = charSequence;
        c();
        ViewCompat.setAccessibilityPaneTitle(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.G0) {
            requestLayout();
        }
        this.G0 = z10;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i10, long j10) {
        return super.setupAnimatorToVisibility(i10, j10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.l();
        }
        return false;
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.ActionMode, i10, 0);
        setBackground(tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.ActionMode_background));
        this.E0 = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.ActionMode_titleTextStyle, 0);
        this.F0 = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.ActionMode_subtitleTextStyle, 0);
        this.mContentHeight = tintTypedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ActionMode_height, 0);
        this.H0 = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.ActionMode_closeItemLayout, R.layout.abc_action_mode_close_item_material);
        tintTypedArrayObtainStyledAttributes.recycle();
    }
}
