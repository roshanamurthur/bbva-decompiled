package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes10.dex */
public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> CHILDREN_ALPHA = new ChildrenAlphaProperty(Float.class, "childrenAlpha");

    @Override // android.util.Property
    @NonNull
    public Float get(@NonNull ViewGroup viewGroup) {
        Float f6 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f6 != null ? f6 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(@NonNull ViewGroup viewGroup, @NonNull Float f6) {
        float fFloatValue = f6.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(fFloatValue));
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(fFloatValue);
        }
    }
}
