package com.bbva.cellswidgets.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import com.bbva.cellswidgets.R;
import com.bbva.cellswidgets.databinding.ContentSkeletonBinding;
import com.mastercard.sonic.StatusCode;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsSkeletonView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"Lcom/bbva/cellswidgets/skeleton/CellsSkeletonView;", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "", "enabled", "", "setAnimationLoop", "onAttachedToWindow", "startAnimation", "stopAnimation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final class CellsSkeletonView extends MotionLayout {

    @NotNull
    public final ContentSkeletonBinding N1;
    public final int O1;
    public final int P1;
    public final float Q1;
    public boolean R1;
    public final int S1;
    public final int T1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsSkeletonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setAnimationLoop(boolean enabled) {
        MotionScene.Transition transition = getTransition(R.id.step_one_transition);
        if (transition != null) {
            transition.setAutoTransition(enabled ? 4 : 0);
        }
        if (getTransition(R.id.finish_transition) != null) {
            setTransitionDuration(this.S1);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ConstraintSet.Constraint constraint;
        ConstraintSet.Constraint constraint2;
        super.onAttachedToWindow();
        loadLayoutDescription(R.xml.scene_skeleton);
        setTransition(R.id.step_one_transition);
        ContentSkeletonBinding contentSkeletonBinding = this.N1;
        contentSkeletonBinding.skeletonMask.setColor(this.P1);
        contentSkeletonBinding.skeletonMask.setSharpOffsetStart(this.Q1);
        ConstraintSet constraintSet = getConstraintSet(R.id.step_one);
        if (constraintSet != null && (constraint2 = constraintSet.getConstraint(R.id.skeleton_mask)) != null) {
            Intrinsics.checkNotNull(constraint2);
            constraint2.layout.startMargin = -((int) this.Q1);
        }
        ConstraintSet constraintSet2 = getConstraintSet(R.id.finish);
        if (constraintSet2 != null && (constraint = constraintSet2.getConstraint(R.id.skeleton_mask)) != null) {
            Intrinsics.checkNotNull(constraint);
            constraint.layout.startMargin = -((int) this.Q1);
        }
        if (this.R1) {
            startAnimation();
            this.R1 = false;
        }
    }

    public final void startAnimation() {
        if (!isAttachedToWindow()) {
            this.R1 = true;
            return;
        }
        setAnimationLoop(true);
        setTransition(R.id.step_one_transition);
        setTransitionDuration(this.T1);
        transitionToEnd();
    }

    public final void stopAnimation() {
        if (isAttachedToWindow()) {
            setAnimationLoop(false);
        } else {
            this.R1 = false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsSkeletonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CellsSkeletonView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsSkeletonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        ContentSkeletonBinding contentSkeletonBindingInflate = ContentSkeletonBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(contentSkeletonBindingInflate, "inflate(...)");
        this.N1 = contentSkeletonBindingInflate;
        this.S1 = StatusCode.SUCCESS;
        this.T1 = StatusCode.SUCCESS;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CellsSkeletonView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.O1 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CellsSkeletonView_cellsSkeletonView_layout, 0);
        this.Q1 = typedArrayObtainStyledAttributes.getDimension(R.styleable.CellsSkeletonView_cellsSkeletonView_sharpOffsetStart, 0.0f);
        this.P1 = typedArrayObtainStyledAttributes.getColor(R.styleable.CellsSkeletonView_cellsSkeletonView_highlightColor, ContextCompat.getColor(context, R.color.BBVA_WHITE_t30));
        this.S1 = typedArrayObtainStyledAttributes.getInt(R.styleable.CellsSkeletonView_cellsSkeletonView_fadeTransitionDuration, StatusCode.SUCCESS);
        this.T1 = typedArrayObtainStyledAttributes.getInt(R.styleable.CellsSkeletonView_cellsSkeletonView_moveTransitionDuration, StatusCode.SUCCESS);
        typedArrayObtainStyledAttributes.recycle();
        if (this.O1 != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.O1, (ViewGroup) null);
            contentSkeletonBindingInflate.skeletonContentLayout.removeAllViews();
            contentSkeletonBindingInflate.skeletonContentLayout.addView(viewInflate);
        }
    }
}
