package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsActionBarView extends ViewGroup {
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected final VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimatorCompat mVisibilityAnim;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f1039p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f1040q0;

    public class VisibilityAnimListener implements ViewPropertyAnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1041a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1042b;

        public VisibilityAnimListener() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(View view) {
            this.f1041a = true;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            if (this.f1041a) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.mVisibilityAnim = null;
            AbsActionBarView.super.setVisibility(this.f1042b);
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f1041a = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i10) {
            AbsActionBarView.this.mVisibilityAnim = viewPropertyAnimatorCompat;
            this.f1042b = i10;
            return this;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbsActionBarView.this.showOverflowMenu();
        }
    }

    public AbsActionBarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int next(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public void animateToVisibility(int i10) {
        setupAnimatorToVisibility(i10, 200L).start();
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.h();
            ActionMenuPresenter.a aVar = actionMenuPresenter.J0;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    public int getAnimatedVisibility() {
        return this.mVisibilityAnim != null ? this.mVisAnimListener.f1042b : getVisibility();
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.h();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.K0 != null || actionMenuPresenter.i();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.i();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.f1076w0;
    }

    public int measureChildView(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.j();
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1040q0 = false;
        }
        if (!this.f1040q0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1040q0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1040q0 = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1039p0 = false;
        }
        if (!this.f1039p0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1039p0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1039p0 = false;
        }
        return true;
    }

    public int positionChild(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iA = androidx.appcompat.widget.a.a(i12, measuredHeight, 2, i11);
        if (z10) {
            view.layout(i10 - measuredWidth, iA, i10, measuredHeight + iA);
        } else {
            view.layout(i10, iA, i10 + measuredWidth, measuredHeight + iA);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public void postShowOverflowMenu() {
        post(new a());
    }

    public void setContentHeight(int i10) {
        this.mContentHeight = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mVisibilityAnim;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.cancel();
            }
            super.setVisibility(i10);
        }
    }

    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i10, long j10) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mVisibilityAnim;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
        if (i10 != 0) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = ViewCompat.animate(this).alpha(0.0f);
            viewPropertyAnimatorCompatAlpha.setDuration(j10);
            viewPropertyAnimatorCompatAlpha.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorCompatAlpha, i10));
            return viewPropertyAnimatorCompatAlpha;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha2 = ViewCompat.animate(this).alpha(1.0f);
        viewPropertyAnimatorCompatAlpha2.setDuration(j10);
        viewPropertyAnimatorCompatAlpha2.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorCompatAlpha2, i10));
        return viewPropertyAnimatorCompatAlpha2;
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.l();
        }
        return false;
    }

    public AbsActionBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mVisAnimListener = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.mPopupContext = context;
        } else {
            this.mPopupContext = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
