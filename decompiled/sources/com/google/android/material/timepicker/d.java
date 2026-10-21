package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.imagecapture.m;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: RadialViewGroup.java */
/* JADX INFO: loaded from: classes10.dex */
public class d extends ConstraintLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final m f45771p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f45772q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final MaterialShapeDrawable f45773r0;

    public d(@NonNull Context context) {
        this(context, null);
    }

    public void a() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f45772q0 * 0.66f) : this.f45772q0;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                constraintSet.constrainCircle(((View) it.next()).getId(), R.id.circle_center, iRound, size);
                size += 360.0f / list.size();
            }
        }
        constraintSet.applyTo(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            m mVar = this.f45771p0;
            handler.removeCallbacks(mVar);
            handler.post(mVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            m mVar = this.f45771p0;
            handler.removeCallbacks(mVar);
            handler.post(mVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i10) {
        this.f45773r0.setFillColor(ColorStateList.valueOf(i10));
    }

    public void setRadius(@Dimension int i10) {
        this.f45772q0 = i10;
        a();
    }

    public d(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f45773r0 = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.f45773r0.setFillColor(ColorStateList.valueOf(-1));
        ViewCompat.setBackground(this, this.f45773r0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadialViewGroup, i10, 0);
        this.f45772q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f45771p0 = new m(this, 3);
        typedArrayObtainStyledAttributes.recycle();
    }
}
