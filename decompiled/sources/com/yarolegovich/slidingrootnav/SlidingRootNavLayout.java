package com.yarolegovich.slidingrootnav;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.yarolegovich.slidingrootnav.callback.DragListener;
import com.yarolegovich.slidingrootnav.callback.DragStateListener;
import com.yarolegovich.slidingrootnav.transform.RootTransformation;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class SlidingRootNavLayout extends FrameLayout implements SlidingRootNav {
    public static final Rect H0 = new Rect();
    public SlideGravity.c E0;
    public final ArrayList F0;
    public final ArrayList G0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f68093p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f68094q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f68095r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f68096s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public RootTransformation f68097t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public View f68098u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f68099w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f68100x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final ViewDragHelper f68101y0;

    public class a extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f68102c;

        public a() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i10, int i11) {
            SlidingRootNavLayout slidingRootNavLayout = SlidingRootNavLayout.this;
            return slidingRootNavLayout.E0.a(i10, slidingRootNavLayout.f68099w0);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(View view) {
            SlidingRootNavLayout slidingRootNavLayout = SlidingRootNavLayout.this;
            if (view == slidingRootNavLayout.f68098u0) {
                return slidingRootNavLayout.f68099w0;
            }
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeTouched(int i10, int i11) {
            this.f68102c = true;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i10) {
            SlidingRootNavLayout slidingRootNavLayout = SlidingRootNavLayout.this;
            int i11 = slidingRootNavLayout.f68100x0;
            if (i11 == 0 && i10 != 0) {
                Iterator it = slidingRootNavLayout.G0.iterator();
                while (it.hasNext()) {
                    ((DragStateListener) it.next()).onDragStart();
                }
            } else if (i11 != 0 && i10 == 0) {
                slidingRootNavLayout.f68095r0 = slidingRootNavLayout.v0 == 0.0f;
                boolean zIsMenuOpened = slidingRootNavLayout.isMenuOpened();
                Iterator it2 = slidingRootNavLayout.G0.iterator();
                while (it2.hasNext()) {
                    ((DragStateListener) it2.next()).onDragEnd(zIsMenuOpened);
                }
            }
            slidingRootNavLayout.f68100x0 = i10;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
            SlidingRootNavLayout slidingRootNavLayout = SlidingRootNavLayout.this;
            float f6 = slidingRootNavLayout.E0.f(i10, slidingRootNavLayout.f68099w0);
            slidingRootNavLayout.v0 = f6;
            slidingRootNavLayout.f68097t0.transform(f6, slidingRootNavLayout.f68098u0);
            Iterator it = slidingRootNavLayout.F0.iterator();
            while (it.hasNext()) {
                ((DragListener) it.next()).onDrag(slidingRootNavLayout.v0);
            }
            slidingRootNavLayout.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(View view, float f6, float f10) {
            float fAbs = Math.abs(f6);
            SlidingRootNavLayout slidingRootNavLayout = SlidingRootNavLayout.this;
            slidingRootNavLayout.f68101y0.settleCapturedViewAt(fAbs < slidingRootNavLayout.f68093p0 ? slidingRootNavLayout.E0.e(slidingRootNavLayout.v0, slidingRootNavLayout.f68099w0) : slidingRootNavLayout.E0.b(f6, slidingRootNavLayout.f68099w0), slidingRootNavLayout.f68098u0.getTop());
            slidingRootNavLayout.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i10) {
            SlidingRootNavLayout slidingRootNavLayout = SlidingRootNavLayout.this;
            if (slidingRootNavLayout.f68094q0) {
                return false;
            }
            boolean z10 = this.f68102c;
            this.f68102c = false;
            if (slidingRootNavLayout.isMenuClosed()) {
                return view == slidingRootNavLayout.f68098u0 && z10;
            }
            View view2 = slidingRootNavLayout.f68098u0;
            if (view == view2) {
                return true;
            }
            slidingRootNavLayout.f68101y0.captureChildView(view2, i10);
            return false;
        }
    }

    public SlidingRootNavLayout(Context context) {
        super(context);
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.f68093p0 = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f68101y0 = ViewDragHelper.create(this, new a());
        this.v0 = 0.0f;
        this.f68095r0 = true;
    }

    public final void a(float f6, boolean z10) {
        this.f68095r0 = this.v0 == 0.0f;
        if (!z10) {
            this.v0 = f6;
            this.f68097t0.transform(f6, this.f68098u0);
            requestLayout();
        } else {
            int iE = this.E0.e(f6, this.f68099w0);
            View view = this.f68098u0;
            if (this.f68101y0.smoothSlideViewTo(view, iE, view.getTop())) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
    }

    public void addDragListener(DragListener dragListener) {
        this.F0.add(dragListener);
    }

    public void addDragStateListener(DragStateListener dragStateListener) {
        this.G0.add(dragStateListener);
    }

    @Override // com.yarolegovich.slidingrootnav.SlidingRootNav
    public void closeMenu() {
        closeMenu(true);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f68101y0.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public float getDragProgress() {
        return this.v0;
    }

    @Override // com.yarolegovich.slidingrootnav.SlidingRootNav
    public boolean isMenuClosed() {
        return this.f68095r0;
    }

    @Override // com.yarolegovich.slidingrootnav.SlidingRootNav
    public boolean isMenuLocked() {
        return this.f68094q0;
    }

    @Override // com.yarolegovich.slidingrootnav.SlidingRootNav
    public boolean isMenuOpened() {
        return !this.f68095r0;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f68094q0 || !this.f68101y0.shouldInterceptTouchEvent(motionEvent)) {
            if (!this.f68096s0 && this.f68098u0 != null && isMenuOpened()) {
                View view = this.f68098u0;
                Rect rect = H0;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.f68098u0) {
                int iD = this.E0.d(this.v0, this.f68099w0);
                childAt.layout(iD, i11, (i12 - i10) + iD, i13);
            } else {
                childAt.layout(i10, i11, i12, i13);
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("extra_super"));
        a(bundle.getInt("extra_is_opened", 0), false);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_super", super.onSaveInstanceState());
        bundle.putInt("extra_is_opened", ((double) this.v0) > 0.5d ? 1 : 0);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f68101y0.processTouchEvent(motionEvent);
        return true;
    }

    @Override // com.yarolegovich.slidingrootnav.SlidingRootNav
    public void openMenu() {
        openMenu(true);
    }

    public void removeDragListener(DragListener dragListener) {
        this.F0.remove(dragListener);
    }

    public void removeDragStateListener(DragStateListener dragStateListener) {
        this.G0.remove(dragStateListener);
    }

    public void setContentClickableWhenMenuOpened(boolean z10) {
        this.f68096s0 = z10;
    }

    public void setGravity(SlideGravity slideGravity) {
        SlideGravity.c cVarA = slideGravity.a();
        this.E0 = cVarA;
        cVarA.c(this.f68101y0);
    }

    public void setMaxDragDistance(int i10) {
        this.f68099w0 = i10;
    }

    @Override // com.yarolegovich.slidingrootnav.SlidingRootNav
    public void setMenuLocked(boolean z10) {
        this.f68094q0 = z10;
    }

    public void setRootTransformation(RootTransformation rootTransformation) {
        this.f68097t0 = rootTransformation;
    }

    public void setRootView(View view) {
        this.f68098u0 = view;
    }

    @Override // com.yarolegovich.slidingrootnav.SlidingRootNav
    public void closeMenu(boolean z10) {
        a(0.0f, z10);
    }

    @Override // com.yarolegovich.slidingrootnav.SlidingRootNav
    public void openMenu(boolean z10) {
        a(1.0f, z10);
    }

    @Override // com.yarolegovich.slidingrootnav.SlidingRootNav
    public SlidingRootNavLayout getLayout() {
        return this;
    }
}
