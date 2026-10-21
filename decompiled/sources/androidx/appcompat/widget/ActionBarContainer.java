package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f1045p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ScrollingTabContainerView f1046q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public View f1047r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View f1048s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Drawable f1049t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Drawable f1050u0;
    public Drawable v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f1051w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f1052x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f1053y0;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1049t0;
        if (drawable != null && drawable.isStateful()) {
            this.f1049t0.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1050u0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1050u0.setState(getDrawableState());
        }
        Drawable drawable3 = this.v0;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.v0.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1046q0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1049t0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1050u0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.v0;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1047r0 = findViewById(R.id.action_bar);
        this.f1048s0 = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1045p0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        ScrollingTabContainerView scrollingTabContainerView = this.f1046q0;
        boolean z11 = true;
        boolean z12 = (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8) ? false : true;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollingTabContainerView.getLayoutParams();
            int measuredHeight2 = measuredHeight - scrollingTabContainerView.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            scrollingTabContainerView.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f1051w0) {
            Drawable drawable2 = this.v0;
            if (drawable2 == null) {
                return;
            } else {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f1049t0 == null) {
                z11 = false;
            } else if (this.f1047r0.getVisibility() == 0) {
                this.f1049t0.setBounds(this.f1047r0.getLeft(), this.f1047r0.getTop(), this.f1047r0.getRight(), this.f1047r0.getBottom());
            } else {
                View view = this.f1048s0;
                if (view == null || view.getVisibility() != 0) {
                    this.f1049t0.setBounds(0, 0, 0, 0);
                } else {
                    this.f1049t0.setBounds(this.f1048s0.getLeft(), this.f1048s0.getTop(), this.f1048s0.getRight(), this.f1048s0.getBottom());
                }
            }
            this.f1052x0 = z12;
            if (z12 && (drawable = this.f1050u0) != null) {
                drawable.setBounds(scrollingTabContainerView.getLeft(), scrollingTabContainerView.getTop(), scrollingTabContainerView.getRight(), scrollingTabContainerView.getBottom());
            } else if (!z11) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f1047r0 == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f1053y0) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f1047r0 == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        ScrollingTabContainerView scrollingTabContainerView = this.f1046q0;
        if (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f1047r0;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f1048s0;
            iA = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.f1048s0);
        } else {
            iA = a(this.f1047r0);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f1046q0) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1049t0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1049t0);
        }
        this.f1049t0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1047r0;
            if (view != null) {
                this.f1049t0.setBounds(view.getLeft(), this.f1047r0.getTop(), this.f1047r0.getRight(), this.f1047r0.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f1051w0 ? !(this.f1049t0 != null || this.f1050u0 != null) : this.v0 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.v0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.v0);
        }
        this.v0 = drawable;
        boolean z10 = this.f1051w0;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.v0) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f1049t0 != null || this.f1050u0 != null) : this.v0 == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1050u0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1050u0);
        }
        this.f1050u0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1052x0 && (drawable2 = this.f1050u0) != null) {
                drawable2.setBounds(this.f1046q0.getLeft(), this.f1046q0.getTop(), this.f1046q0.getRight(), this.f1046q0.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f1051w0 ? !(this.f1049t0 != null || this.f1050u0 != null) : this.v0 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f1046q0;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f1046q0 = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f1045p0 = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1049t0;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1050u0;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.v0;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = this.f1049t0;
        boolean z10 = this.f1051w0;
        return (drawable == drawable2 && !z10) || (drawable == this.f1050u0 && this.f1052x0) || ((drawable == this.v0 && z10) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBar);
        this.f1049t0 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ActionBar_background);
        this.f1050u0 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundStacked);
        this.f1053y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
        boolean z10 = true;
        if (getId() == R.id.split_action_bar) {
            this.f1051w0 = true;
            this.v0 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1051w0 ? this.f1049t0 != null || this.f1050u0 != null : this.v0 != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
