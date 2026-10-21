package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionHelperInterface {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f19413q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f19414r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f19415s0;
    protected View[] views;

    public MotionHelper(Context context) {
        super(context);
        this.f19413q0 = false;
        this.f19414r0 = false;
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public float getProgress() {
        return this.f19415s0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MotionHelper_onShow) {
                    this.f19413q0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f19413q0);
                } else if (index == R.styleable.MotionHelper_onHide) {
                    this.f19414r0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f19414r0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public boolean isDecorator() {
        return false;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUseOnHide() {
        return this.f19414r0;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUsedOnShow() {
        return this.f19413q0;
    }

    public void setProgress(View view, float f6) {
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public void setProgress(float f6) {
        this.f19415s0 = f6;
        int i10 = 0;
        if (this.mCount > 0) {
            this.views = getViews((ConstraintLayout) getParent());
            while (i10 < this.mCount) {
                setProgress(this.views[i10], f6);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f6);
            }
            i10++;
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19413q0 = false;
        this.f19414r0 = false;
        init(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19413q0 = false;
        this.f19414r0 = false;
        init(attributeSet);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onFinishedMotionScene(MotionLayout motionLayout) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPostDraw(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPreDraw(Canvas canvas) {
    }

    public void onPreSetup(MotionLayout motionLayout, HashMap<View, MotionController> map) {
    }

    public void onTransitionCompleted(MotionLayout motionLayout, int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionStarted(MotionLayout motionLayout, int i10, int i11) {
    }

    public void onTransitionChange(MotionLayout motionLayout, int i10, int i11, float f6) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionTrigger(MotionLayout motionLayout, int i10, boolean z10, float f6) {
    }
}
