package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f19791p0;

    public Guideline(Context context) {
        super(context);
        this.f19791p0 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f19791p0 = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f19791p0 && layoutParams.guideBegin == i10) {
            return;
        }
        layoutParams.guideBegin = i10;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f19791p0 && layoutParams.guideEnd == i10) {
            return;
        }
        layoutParams.guideEnd = i10;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f6) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f19791p0 && layoutParams.guidePercent == f6) {
            return;
        }
        layoutParams.guidePercent = f6;
        setLayoutParams(layoutParams);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19791p0 = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19791p0 = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f19791p0 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
