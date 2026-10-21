package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.camera.core.c0;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    public boolean E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public int K0;
    public int L0;
    public int M0;
    public float N0;
    public int O0;
    public int P0;
    public final a Q0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Adapter f19244t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ArrayList<View> f19245u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f19246w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public MotionLayout f19247x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f19248y0;

    public interface Adapter {
        int count();

        void onNewItem(int i10);

        void populate(View view, int i10);
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a, reason: collision with other inner class name */
        public class RunnableC0070a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ float f19250p0;

            public RunnableC0070a(float f6) {
                this.f19250p0 = f6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Carousel.this.f19247x0.touchAnimateTo(5, 1.0f, this.f19250p0);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Carousel carousel = Carousel.this;
            carousel.f19247x0.setProgress(0.0f);
            carousel.h();
            carousel.f19244t0.onNewItem(carousel.f19246w0);
            float velocity = carousel.f19247x0.getVelocity();
            if (carousel.M0 != 2 || velocity <= carousel.N0 || carousel.f19246w0 >= carousel.f19244t0.count() - 1) {
                return;
            }
            float f6 = velocity * carousel.J0;
            int i10 = carousel.f19246w0;
            if (i10 != 0 || carousel.v0 <= i10) {
                if (i10 != carousel.f19244t0.count() - 1 || carousel.v0 >= carousel.f19246w0) {
                    carousel.f19247x0.post(new RunnableC0070a(f6));
                }
            }
        }
    }

    public Carousel(Context context) {
        super(context);
        this.f19244t0 = null;
        this.f19245u0 = new ArrayList<>();
        this.v0 = 0;
        this.f19246w0 = 0;
        this.f19248y0 = -1;
        this.E0 = false;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = 0.9f;
        this.K0 = 0;
        this.L0 = 4;
        this.M0 = 1;
        this.N0 = 2.0f;
        this.O0 = -1;
        this.P0 = 200;
        this.Q0 = new a();
    }

    public final void f(int i10, boolean z10) {
        MotionLayout motionLayout;
        MotionScene.Transition transition;
        if (i10 == -1 || (motionLayout = this.f19247x0) == null || (transition = motionLayout.getTransition(i10)) == null || z10 == transition.isEnabled()) {
            return;
        }
        transition.setEnabled(z10);
    }

    public final void g(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.Carousel_carousel_firstView) {
                    this.f19248y0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19248y0);
                } else if (index == R.styleable.Carousel_carousel_backwardTransition) {
                    this.F0 = typedArrayObtainStyledAttributes.getResourceId(index, this.F0);
                } else if (index == R.styleable.Carousel_carousel_forwardTransition) {
                    this.G0 = typedArrayObtainStyledAttributes.getResourceId(index, this.G0);
                } else if (index == R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.L0 = typedArrayObtainStyledAttributes.getInt(index, this.L0);
                } else if (index == R.styleable.Carousel_carousel_previousState) {
                    this.H0 = typedArrayObtainStyledAttributes.getResourceId(index, this.H0);
                } else if (index == R.styleable.Carousel_carousel_nextState) {
                    this.I0 = typedArrayObtainStyledAttributes.getResourceId(index, this.I0);
                } else if (index == R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.J0 = typedArrayObtainStyledAttributes.getFloat(index, this.J0);
                } else if (index == R.styleable.Carousel_carousel_touchUpMode) {
                    this.M0 = typedArrayObtainStyledAttributes.getInt(index, this.M0);
                } else if (index == R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.N0 = typedArrayObtainStyledAttributes.getFloat(index, this.N0);
                } else if (index == R.styleable.Carousel_carousel_infinite) {
                    this.E0 = typedArrayObtainStyledAttributes.getBoolean(index, this.E0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int getCount() {
        Adapter adapter = this.f19244t0;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f19246w0;
    }

    public final void h() {
        Adapter adapter = this.f19244t0;
        if (adapter == null || this.f19247x0 == null || adapter.count() == 0) {
            return;
        }
        ArrayList<View> arrayList = this.f19245u0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            int iCount = (this.f19246w0 + i10) - this.K0;
            if (this.E0) {
                if (iCount < 0) {
                    int i11 = this.L0;
                    if (i11 != 4) {
                        i(i11, view);
                    } else {
                        i(0, view);
                    }
                    if (iCount % this.f19244t0.count() == 0) {
                        this.f19244t0.populate(view, 0);
                    } else {
                        Adapter adapter2 = this.f19244t0;
                        adapter2.populate(view, (iCount % this.f19244t0.count()) + adapter2.count());
                    }
                } else if (iCount >= this.f19244t0.count()) {
                    if (iCount == this.f19244t0.count()) {
                        iCount = 0;
                    } else if (iCount > this.f19244t0.count()) {
                        iCount %= this.f19244t0.count();
                    }
                    int i12 = this.L0;
                    if (i12 != 4) {
                        i(i12, view);
                    } else {
                        i(0, view);
                    }
                    this.f19244t0.populate(view, iCount);
                } else {
                    i(0, view);
                    this.f19244t0.populate(view, iCount);
                }
            } else if (iCount < 0) {
                i(this.L0, view);
            } else if (iCount >= this.f19244t0.count()) {
                i(this.L0, view);
            } else {
                i(0, view);
                this.f19244t0.populate(view, iCount);
            }
        }
        int i13 = this.O0;
        if (i13 != -1 && i13 != this.f19246w0) {
            this.f19247x0.post(new c0(this, 2));
        } else if (i13 == this.f19246w0) {
            this.O0 = -1;
        }
        if (this.F0 == -1 || this.G0 == -1) {
            Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
            return;
        }
        if (this.E0) {
            return;
        }
        int iCount2 = this.f19244t0.count();
        if (this.f19246w0 == 0) {
            f(this.F0, false);
        } else {
            f(this.F0, true);
            this.f19247x0.setTransition(this.F0);
        }
        if (this.f19246w0 == iCount2 - 1) {
            f(this.G0, false);
        } else {
            f(this.G0, true);
            this.f19247x0.setTransition(this.G0);
        }
    }

    public final void i(int i10, View view) {
        ConstraintSet.Constraint constraint;
        MotionLayout motionLayout = this.f19247x0;
        if (motionLayout == null) {
            return;
        }
        for (int i11 : motionLayout.getConstraintSetIds()) {
            ConstraintSet constraintSet = this.f19247x0.getConstraintSet(i11);
            if (constraintSet != null && (constraint = constraintSet.getConstraint(view.getId())) != null) {
                constraint.propertySet.mVisibilityMode = 1;
                view.setVisibility(i10);
            }
        }
    }

    public boolean isInfinite() {
        return this.E0;
    }

    public void jumpToIndex(int i10) {
        this.f19246w0 = Math.max(0, Math.min(getCount() - 1, i10));
        refresh();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            ArrayList<View> arrayList = this.f19245u0;
            arrayList.clear();
            for (int i10 = 0; i10 < this.mCount; i10++) {
                int i11 = this.mIds[i10];
                View viewById = motionLayout.getViewById(i11);
                if (this.f19248y0 == i11) {
                    this.K0 = i10;
                }
                arrayList.add(viewById);
            }
            this.f19247x0 = motionLayout;
            if (this.M0 == 2) {
                MotionScene.Transition transition = motionLayout.getTransition(this.G0);
                if (transition != null) {
                    transition.setOnTouchUp(5);
                }
                MotionScene.Transition transition2 = this.f19247x0.getTransition(this.F0);
                if (transition2 != null) {
                    transition2.setOnTouchUp(5);
                }
            }
            h();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19245u0.clear();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(MotionLayout motionLayout, int i10) {
        int i11 = this.f19246w0;
        this.v0 = i11;
        if (i10 == this.I0) {
            this.f19246w0 = i11 + 1;
        } else if (i10 == this.H0) {
            this.f19246w0 = i11 - 1;
        }
        if (this.E0) {
            if (this.f19246w0 >= this.f19244t0.count()) {
                this.f19246w0 = 0;
            }
            if (this.f19246w0 < 0) {
                this.f19246w0 = this.f19244t0.count() - 1;
            }
        } else {
            if (this.f19246w0 >= this.f19244t0.count()) {
                this.f19246w0 = this.f19244t0.count() - 1;
            }
            if (this.f19246w0 < 0) {
                this.f19246w0 = 0;
            }
        }
        if (this.v0 != this.f19246w0) {
            this.f19247x0.post(this.Q0);
        }
    }

    public void refresh() {
        ArrayList<View> arrayList = this.f19245u0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            if (this.f19244t0.count() == 0) {
                i(this.L0, view);
            } else {
                i(0, view);
            }
        }
        this.f19247x0.rebuildScene();
        h();
    }

    public void setAdapter(Adapter adapter) {
        this.f19244t0 = adapter;
    }

    public void setInfinite(boolean z10) {
        this.E0 = z10;
    }

    public void transitionToIndex(int i10, int i11) {
        this.O0 = Math.max(0, Math.min(getCount() - 1, i10));
        int iMax = Math.max(0, i11);
        this.P0 = iMax;
        this.f19247x0.setTransitionDuration(iMax);
        if (i10 < this.f19246w0) {
            this.f19247x0.transitionToState(this.H0, this.P0);
        } else {
            this.f19247x0.transitionToState(this.I0, this.P0);
        }
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19244t0 = null;
        this.f19245u0 = new ArrayList<>();
        this.v0 = 0;
        this.f19246w0 = 0;
        this.f19248y0 = -1;
        this.E0 = false;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = 0.9f;
        this.K0 = 0;
        this.L0 = 4;
        this.M0 = 1;
        this.N0 = 2.0f;
        this.O0 = -1;
        this.P0 = 200;
        this.Q0 = new a();
        g(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19244t0 = null;
        this.f19245u0 = new ArrayList<>();
        this.v0 = 0;
        this.f19246w0 = 0;
        this.f19248y0 = -1;
        this.E0 = false;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = 0.9f;
        this.K0 = 0;
        this.L0 = 4;
        this.M0 = 1;
        this.N0 = 2.0f;
        this.O0 = -1;
        this.P0 = 200;
        this.Q0 = new a();
        g(context, attributeSet);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(MotionLayout motionLayout, int i10, int i11, float f6) {
    }
}
