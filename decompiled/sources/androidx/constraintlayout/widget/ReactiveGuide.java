package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements SharedValues.SharedValuesListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f19795p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f19796q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f19797r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f19798s0;

    public ReactiveGuide(Context context) {
        super(context);
        this.f19795p0 = -1;
        this.f19796q0 = false;
        this.f19797r0 = 0;
        this.f19798s0 = true;
        super.setVisibility(8);
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_ReactiveGuide);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f19795p0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19795p0);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f19796q0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f19796q0);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.f19797r0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19797r0);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.f19798s0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f19798s0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f19795p0 != -1) {
            ConstraintLayout.getSharedValues().addListener(this.f19795p0, this);
        }
    }

    public int getApplyToConstraintSetId() {
        return this.f19797r0;
    }

    public int getAttributeId() {
        return this.f19795p0;
    }

    public boolean isAnimatingChange() {
        return this.f19796q0;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
    public void onNewValue(int i10, int i11, int i12) {
        setGuidelineBegin(i11);
        int id = getId();
        if (id > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i13 = this.f19797r0;
            if (i13 != 0) {
                currentState = i13;
            }
            int i14 = 0;
            if (this.f19796q0) {
                if (this.f19798s0) {
                    int[] constraintSetIds = motionLayout.getConstraintSetIds();
                    while (i14 < constraintSetIds.length) {
                        int i15 = constraintSetIds[i14];
                        if (i15 != currentState) {
                            ConstraintSet constraintSet = motionLayout.getConstraintSet(i15);
                            constraintSet.setGuidelineEnd(id, i11);
                            motionLayout.updateState(i15, constraintSet);
                        }
                        i14++;
                    }
                }
                ConstraintSet constraintSetCloneConstraintSet = motionLayout.cloneConstraintSet(currentState);
                constraintSetCloneConstraintSet.setGuidelineEnd(id, i11);
                motionLayout.updateStateAnimate(currentState, constraintSetCloneConstraintSet, 1000);
                return;
            }
            if (!this.f19798s0) {
                ConstraintSet constraintSet2 = motionLayout.getConstraintSet(currentState);
                constraintSet2.setGuidelineEnd(id, i11);
                motionLayout.updateState(currentState, constraintSet2);
                return;
            }
            int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
            while (i14 < constraintSetIds2.length) {
                int i16 = constraintSetIds2[i14];
                ConstraintSet constraintSet3 = motionLayout.getConstraintSet(i16);
                constraintSet3.setGuidelineEnd(id, i11);
                motionLayout.updateState(i16, constraintSet3);
                i14++;
            }
        }
    }

    public void setAnimateChange(boolean z10) {
        this.f19796q0 = z10;
    }

    public void setApplyToConstraintSetId(int i10) {
        this.f19797r0 = i10;
    }

    public void setAttributeId(int i10) {
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i11 = this.f19795p0;
        if (i11 != -1) {
            sharedValues.removeListener(i11, this);
        }
        this.f19795p0 = i10;
        if (i10 != -1) {
            sharedValues.addListener(i10, this);
        }
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideBegin = i10;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideEnd = i10;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f6) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guidePercent = f6;
        setLayoutParams(layoutParams);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19795p0 = -1;
        this.f19796q0 = false;
        this.f19797r0 = 0;
        this.f19798s0 = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19795p0 = -1;
        this.f19796q0 = false;
        this.f19797r0 = 0;
        this.f19798s0 = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f19795p0 = -1;
        this.f19796q0 = false;
        this.f19797r0 = 0;
        this.f19798s0 = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
